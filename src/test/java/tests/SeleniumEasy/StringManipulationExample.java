package tests.SeleniumEasy;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StringManipulationExample {


   @Test
   public void StringManipulation(){
       List<String> names = new ArrayList<>();
       names.add("Aaron");
       StringTest1("Aaron");
       StringTest1("Valentina");
       StringTest1("Denise");
   }
    public void StringTest1(String name){
       name = name.toLowerCase();
        char letter ='a';
        int count = 0;
        for(int i=0; i< name.length(); i++){
            if(name.charAt(i)==letter){  //a = a  count = 2  r != a  count = 2
                count++;
                if(count>=2){
                    System.out.println(name);
                    break;
            }
        }

        }
    }
}
