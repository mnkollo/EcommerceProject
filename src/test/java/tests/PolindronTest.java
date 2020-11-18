package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

public class PolindronTest {

    @Test
    public void palindromTest(){
        String word = "civic";
        StringBuilder word2 = new StringBuilder(word);
        word2= word2.reverse();
        System.out.println(word2); // reverse
/*
you can start i with 0 or length word(civic - 5 letters)
int i=0; i<word.length(); i++ --------> i: 0,1,2,3,4
int i=word.length(); i>=0; i-- --------> i: 4,3,2,1,0
 */
        // regular way
        String word3= "";
        for(int i=word.length()-1; i>=0; i--){
            word3 = word3 + word.charAt(i);
        }
        System.out.println("word " + word);
        System.out.println("word2 " + word2);
        System.out.println("word3 " + word3);
        if(word.equals(word3)){
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
    @Test
    public void createAccountTest(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().fullAddress();
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";
        System.out.println("firstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);

    }
}
