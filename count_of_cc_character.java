
class Sol
{
    int countCamelCase (String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isUpper(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public boolean isUpper(char c){
        if(c>='A' && c<='Z'){
            return true;
        }
        else{
            return false;
        }
    }
}
