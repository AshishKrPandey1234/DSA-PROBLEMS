class Solution {
    public boolean lemonadeChange(int[] bills) {
        int dollar5=0,dollar10=0;
        for(int b:bills){
            if(b==5){
                dollar5++;
            }
            else if(b==10){
                if(dollar5>0){
                    dollar5--;
                    dollar10++;
                }else{
                    return false;
                }
            }
            else if(b==20){
                if(dollar5>0 && dollar10>0){
                    dollar5--;
                    dollar10--;
                }else if(dollar5>=3){
                    dollar5=dollar5-3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}