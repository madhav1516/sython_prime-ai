package sythonPrime_ai;


public class main {
    static final String ai_name = "Sython Prime";
    static final String owner_name = "Madhav";

    static void main(String[] args) {
        intro.show(ai_name, owner_name);
        speak.say("Hello, " + owner_name + " Sir, I am  " + ai_name + ".");
        boolean key = keyboard_light.up();
        System.out.println("startup key test = " + key);

        while (true) {
            boolean t = brightness.set(60);
            String words = listen.hear().toLowerCase();
            if (words.equals("quit")) {
                break;
            }
            if (words.contains("Brightness")&&words.contains("Up")){
                System.out.println("set the brightness  "+ t);
            }
            if (words.contains("volume") && words.contains("up")) {
                volumnecontrol.change(10);
                speak.say("Raising the volume.");
            } else if (words.contains("keyboard") && words.contains("light")&&words.contains("up")) {
                keyboard_light.up();
                
            } else if (words.contains("volume") && words.contains("down")) {
                volumnecontrol.change(-10);
                speak.say("Lowering the volume down");
            } else if (words.contains("open")) {
                String app = null;
                if (words.contains("terminal")) {
                    app = "Terminal";
                }
                else if (words.contains("brave")) {
                    app = "Brave Browser";
                } else if (words.contains("google chrome")) {
                    app = "Google Chrome";
                } else if (words.contains("App Store")) {
                    app = "App Store";
                } else if (words.contains("pages")) {
                    app = "Pages";
                }
                if (app != null) {
                    boolean worked = controlapps.open(app);
                    if (worked) {
                        speak.say("Opening "+ app);
                    } else {
                        speak.say("I can't open " + app);
                    }
                } else {
                    speak.say("Which app do you want? ");
                }
                speak.say("  " + words);
                System.out.println("Ai >" + words);
            }


        }
    }
}
