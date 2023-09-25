class Solution {
    String ans = "";
    public String minimumString(String a, String b, String c) {
        
        ans = a+b+c;

        //(a,b),c
        updateAnsForCurrentComb(a,b,c);
        
        //(a,c),b
        updateAnsForCurrentComb(a,c,b);


        //(b,a),c
        updateAnsForCurrentComb(b,a, c);
        //(b,c),a
        updateAnsForCurrentComb(b,c,a);


        //(c,a),b
        updateAnsForCurrentComb(c,a,b);

        //(c,b),a
        updateAnsForCurrentComb(c,b,a);

        return ans;


    }

     private void updateAnsForCurrentComb(String a, String b, String c){
        String x = merge(merge(a,b),c);
        ans = getSmallerString(ans, x);
    }

      private String getSmallerString(String a, String b){
        if(a.length()==b.length()){
            if(a.compareTo(b)<0){
                return a;
            }
            return b;
        }
        return a.length()<b.length()?a:b;
    }

    private String merge(String a, String b){
        if(a.contains(b)){
            return a;
        }

        for(int i=Math.min(a.length(), b.length());i>=0;i--){
            if(a.substring(a.length()-i).equals(b.substring(0,i))){
                return a+b.substring(i);
            }
        }
        return a + b;
    }




}
