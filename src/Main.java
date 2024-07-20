package wordcount.src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    //  Create new scanner object
        System.out.print("Sentence: ");   //  Print out the prompt
        String letters = input.nextLine().trim();    //  Take input, using trim to not count whitespaces
        String[] words = letters.split("[^a-zA-Z]+");   //  regex for counting words
        if(words.length > 1){
            System.out.println(words.length + " words");
            if(letters.length() > 1){
                System.out.println(letters.length() - words.length + 1 + " letters");
            }else {
                System.out.println(letters.length() - words.length + 1 + " letter");
            }
        } else {
            System.out.println(words.length + " word");
            if(letters.length() > 1){
                System.out.println(letters.length() + " letters");
            }else {
                System.out.println(letters.length() + " letter");
            }
        }
        input.close();
    }
}
