class Solution {
    public boolean checkString(String s) {
        int len = s.length();
        int bidx = -1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'b') {
                bidx = i;
                break;
            }
        }
        if (bidx != -1) {
            for (int j = bidx; j < len; j++) {
                if (s.charAt(j) == 'a')
                    return false;
            }
        }
        return true;
    }
}