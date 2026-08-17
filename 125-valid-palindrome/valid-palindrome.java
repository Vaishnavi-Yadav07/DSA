class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i =0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else{
                continue;
            }
        }
        int n =sb.length();
        int x =0;
        int y =n-1;
        while(x<y){
            if(sb.charAt(x)!=sb.charAt(y)){
                return false;
            }else{
                x++;
                y--;
            }

        }
        return true;

        
    }
}