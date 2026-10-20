package sythonPrime_ai;

public class keyboard_light {
    static boolean press(int code){
        try {
            int  keyl = new ProcessBuilder("osascript","-e","tell application \"System Events\" to key code"+code).inheritIO().start().waitFor();

        }catch (Exception e){
            System.out.println("( no permission or faild : " + e.getMessage()+")");
            return  false;
        }
        return false;
    }
    static boolean up(){
        return press(204);

    }
    static boolean down(){
        return  press(203);
    }
}
