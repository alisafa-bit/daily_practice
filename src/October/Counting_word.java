package October;

public class Counting_word {
    public static void main(String[] args) {
        System.out.println("Momentum build by small action.");
        String str = "Today is October 27. and it is midnight";

        int countSpaces = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) ==' ')
            {
                countSpaces++;
            }

        }

         /*
        String wordArray[] = str.trim().split("\\s+");
        int countWord = wordArray.length;

          */
        System.out.println("Spaces are = " + countSpaces);


    }
}
