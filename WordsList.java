package Java.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class WordsList {
  public static void main(String[] args) {

      ArrayList<String> words = new ArrayList<String>();

      Scanner input = new Scanner(System.in);
      String userWord = "";

      //Ask the user for 10 words
      System.out.println("Enter 5 words");;
      for(int i = 0; i < 5; i++) {
        System.out.println("Enter word " + (i+1));
        userWord = input.next();
        words.add(userWord);
      }

      //Print the list and it size
      //Hint: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--
      System.out.println("List size: " + words.size());
      for(String word : words) {
        System.out.println(word);
      }


      System.out.println("Enter a letter");
      char firstLetter = input.next().charAt(0);
      input.close();

      //Remove from list all the words that start with that letter
      //Hint: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#remove-java.lang.Object-

      for(int i = (words.size()-1); i >= 0; i--){
        if(words.get(i).charAt(0) == firstLetter) {
          words.remove(i);
        }
      }

      //Print the List again and it size
      System.out.println("List size: " + words.size());
      for(String word : words) {
        System.out.println(word);
      }
  }
}
