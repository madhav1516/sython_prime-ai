package sythonPrime_ai;

public class volumnecontrol {
    static void change(int amount){
        try {
            String script = "set volume output volume (((output volume of (get volume settings ))+"+amount + " ))";
            int p2 = new ProcessBuilder("osascript","-e",script).inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("(Volume failed : "+e.getMessage()+")");
        }
    }
}
