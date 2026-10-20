package sythonPrime_ai;

public class brightness {
    static int level = 50;
    static boolean set (int percent){

        try {
            int  code = new ProcessBuilder("/opt/homebrew/bin/brightness"," "+ (percent/100)).inheritIO().start().waitFor();
            if (code == 0){
                level =percent;
                return  true;
            }
            return false;
        }catch (Exception e){
            System.out.println("brightness failed "+ e.getMessage()+")");
            return false;
        }

    }

}
