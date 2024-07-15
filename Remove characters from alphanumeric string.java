class Solution {
    String removeCharacters(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(isDigit(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
    public boolean isDigit(char c){
            if( c >= '0' && c <= '9'){
             return true;
            }
            else{
                return false;
            }
    }
}
