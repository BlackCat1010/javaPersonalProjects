

public class randomTextGenerator{
    private String newpassword;
    public static final String UPPERCASE_CHARPOOL="ABCDEFGHIJKLMNOPQRSTUVWXYZ";//26char
    public static final String LOWERCASE_CHARPOOL="abcdefghijklmnopqrstuvwxyz";//26char
    public static final String SYMBOL_CHARPOOL="!@#$%^&*()_+-=`[];'./{}:>/?"; //27char
    public static final String NUMBER_CHARPOOL="1234567890";//10char


    public randomTextGenerator(int length,boolean isUppercase,boolean isLowercase,boolean isSymbol,boolean isNumber){
        //creating dictionary/charpool to select from
        StringBuilder charpool = new StringBuilder();
        if (isNumber) charpool.append(NUMBER_CHARPOOL);
        if (isLowercase) charpool.append(LOWERCASE_CHARPOOL);
        if (isSymbol) charpool.append(SYMBOL_CHARPOOL);
        if (isUppercase) charpool.append(UPPERCASE_CHARPOOL);
        int charpoolsize = charpool.length();

        //creating expected pw array;
        char[] finalpwArray = new char[length];
        
        for (int i=0; i <length;i++){
            double a = Math.random()*charpoolsize;
            int b = (int) a;
            finalpwArray[i] = charpool.charAt(b);
        }

        newpassword = new String(finalpwArray);

    }
    
    public static void main(String[] args){
        //randomTextGenerator newpw = new randomTextGenerator(length,isUppercase,isLowercase,isNumber,isSymbol);
        
    }

    public String getnewpassword(){
        return newpassword;
    }

    public void setnewpassword(String newString){
        this.newpassword=newString;
    }

}
