package sythonPrime_ai;

public class controlapps {
    static boolean open(String name){
        try {
            int app = new ProcessBuilder("open","-a",name).inheritIO().start().waitFor();
            return  app == 0;
        }catch (Exception e){
            return false;
        }
    }
}
