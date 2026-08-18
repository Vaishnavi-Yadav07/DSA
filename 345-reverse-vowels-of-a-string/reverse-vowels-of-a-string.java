class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i =0;
        int j =sb.length()-1;
        while(i<j){
            if(sb.charAt(i)=='a'|| sb.charAt(i)=='e'|| sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'|| sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||sb.charAt(i)=='O'||sb.charAt(i)=='U'){
                char temp = sb.charAt(i);
                if(sb.charAt(j)=='a'|| sb.charAt(j)=='e'|| sb.charAt(j)=='i'||sb.charAt(j)=='o'||sb.charAt(j)=='u'|| sb.charAt(j)=='A'||sb.charAt(j)=='E'||sb.charAt(j)=='I'||sb.charAt(j)=='O'||sb.charAt(j)=='U'){
                    sb.setCharAt(i ,sb.charAt(j));
                    sb.setCharAt(j ,temp);
                    i++;
                    j--;
                }else{
                    j--;
                }
                
            }else{
                i++;
            }
        }
        return sb.toString();
        

        
        
    }
}