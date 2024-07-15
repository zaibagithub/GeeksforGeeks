
class Solution {
    ArrayList<String> pattern(String S) {
        ArrayList<String> z = new ArrayList<>();
        for(int i=S.length();i>0;i--){
            z.add(S.substring(0,i));
        }
        return z;
    }
}
