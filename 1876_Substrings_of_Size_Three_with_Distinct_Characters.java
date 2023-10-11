class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int n = 3;
        for(int i=0;i<=s.length()-3;i++){
            String a= s.substring(i,i+3);
            if(hasChars(a)){
                count++;
            }
        }
         return count;
    }
            
    public boolean hasChars(String s){
        int k=0;
                    if(s.charAt(k) != s.charAt(k+1) && s.charAt(k) != s.charAt(k+2) && s.charAt(k+1) != s.charAt(k+2)){
                        return true;
                    }
                    return false; 
         }
         
    }
        
       
