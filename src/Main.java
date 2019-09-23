public class Main {

    public static void main(String[] args) {
        String hilsen;

            // en mode, som udskriver hello
            Hello.helloWorld();
            Hello.helloNavn("Andrács");
            Hello.helloNavn("Anders");


           hilsen = Hello.getHelloNavn("Anders");
        System.out.println(hilsen); // for at få den til at printe så skal man gøre mere i main end før

            hilsen = Hello.getHelloNavn("Andrács");
        System.out.println(hilsen);

        hilsen = Hello.getHelloNavn("Станислав");
        System.out.println(hilsen);



    }
}
