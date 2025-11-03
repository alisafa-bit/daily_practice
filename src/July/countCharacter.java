package July;

public class countCharacter {
    private static String str;
    //Constructor
    public countCharacter(String str){}
    private  String getStr() {return str;}
    private void setStr(String str) {this.str = str;}
    //Methods return upper case solution
    private int getCountOfUpperCaseCharacters(){
        return getStr().replaceAll("[^A-Z]","").length();}
    //Method to print the count of uppercase characters
    public void printUpperCaseCharacter(){
        System.out.println("There are " + getCountOfUpperCaseCharacters() + " in " + getStr());
    }
    public void main(String[] args) {
        getCountOfUpperCaseCharacters();
    }

}
