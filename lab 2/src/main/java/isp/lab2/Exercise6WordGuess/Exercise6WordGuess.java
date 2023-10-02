package isp.lab2.Exercise6WordGuess;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int count=0;
        for(int i=0;i< word.length;i++)
        {
            if(c==word[i]) {
                count++;
            }
        }
        return count;
    }


    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        String []dictionary=new String []{"astronaut","method","class", "cosmin","cal","elefant"};
        int length= dictionary.length;

        Random r=new Random();
        String chosenWord=dictionary[r.nextInt(length)];
        int length_word=chosenWord.length();
        char []chosenWordChar=chosenWord.toCharArray();
        char []charArray= new char[length_word];
        char []guessedWord=new char[length_word];
        Arrays.fill(charArray,'_');
        String toBeGuessed=new String(charArray);
        int ok=0;
        int noOfletterGuessed=0;
        while(ok==0){
            System.out.println(charArray);
            String letter=readFromConsoleInt();
            char letterChar=letter.charAt(0);
            if(countOccurence(letterChar,chosenWordChar)>0)
            {
                noOfletterGuessed+=countOccurence(letterChar,chosenWordChar);
                for(int i=0;i<=chosenWord.length()-1;i++)
                {
                    if(chosenWordChar[i]==letterChar)
                        charArray[i]=letterChar;
                }
            }
            if(noOfletterGuessed==chosenWord.length())
                ok=1;
        }
        System.out.println(charArray);
        System.out.println("Congrats you won");

    }

}
