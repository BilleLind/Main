public class Hello {

    public static void helloWorld() {
        System.out.println("Hello world!");
    }

    public static void helloNavn(String navn) {
        System.out.println("Hello " + navn + "!");
    } // udskriver til consol


    public static String getHelloNavn(String navn) {
        if (navn.trim().equals("")) {
            return "Hello!";
        }else if (navn.trim().equals("Станислав")) {
            return "Привет " + "Станислав";
        }
        else {
            return "Hello " + navn + "!";
        } // sender til Main som så har ansvaret til at sout den i consol


    }
}