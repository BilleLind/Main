import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testgetHelloNavn() {
        String resultat;

        resultat = Hello.getHelloNavn("Andrács"); {
            assertEquals("Hello Andrács!", resultat);        }

         resultat = Hello.getHelloNavn("Anders"); {
             assertEquals("Hello Anders!", resultat);        }


    }

        public void testgetHelloNavnForEmptyInput() {
        String resultat;

        resultat = Hello.getHelloNavn("");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn(" ");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn("   ");
        assertEquals("Hello!", resultat);

        }

        public void testgetHelloNavnForRussianCharts() {
        String resultat;

        resultat = Hello.getHelloNavn("Станислав");
        assertEquals("Привет Станислав", resultat);
        }

}