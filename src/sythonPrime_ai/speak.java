package sythonPrime_ai;

import java.io.IOException;

public class speak {
    static  void  say(String text){
        try {
            new ProcessBuilder("say",text).inheritIO().start().waitFor();
        }catch (Exception e){
            System.out.println("(no voice : "+ e.getMessage()+")");
        }
    }
}
