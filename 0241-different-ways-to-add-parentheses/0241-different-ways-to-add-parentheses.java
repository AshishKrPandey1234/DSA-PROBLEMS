class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char oper=expression.charAt(i);
            if(oper=='+'||oper=='-'||oper=='*'){
                List<Integer>left=diffWaysToCompute(expression.substring(0,i));
                List<Integer>right=diffWaysToCompute(expression.substring(i+1));
                for(int a:left){
                    for(int b:right){
                        if(oper=='+')res.add(a+b);
                        else if(oper=='-')res.add(a-b);
                        else  res.add(a*b);
                    }
                }
            }
        }
        if(res.isEmpty())
        res.add(Integer.parseInt(expression));
        return res;
    }
}