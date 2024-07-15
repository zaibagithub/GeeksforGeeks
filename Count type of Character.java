class Sol
{
    int[] count (String s)
    {
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        for(int i=0; i<s.length();i++){
            if(isUpper(s.charAt(i))){
                c1++;
            }
            else if(isLower(s.charAt(i))){
                c2++;
            }
            else if(isDigit(s.charAt(i))){
                c3++;
            }
            else{
                c4++;
            }
        }
        return new int[]{c1,c2,c3,c4};
        
    }
    public boolean isUpper(char c){
        if(c>='A' && c<='Z'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isLower(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isDigit(char c){
        if(c>='0' && c<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    
}
    
