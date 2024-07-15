class Solution {
    static String javaSub(String S, int L, int R) {
        StringBuilder sb= new StringBuilder(S);
        return sb.substring(L,R+1).toString();
    }
}
