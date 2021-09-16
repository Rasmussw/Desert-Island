import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class main {


    public static void main(String[] args) {
        String velkomstBesked = "Velkommen, hvilken af følgene ting vil du helst have med på en øde ø?";
        System.out.println(velkomstBesked);

        String[] muligheder = {"1. Kæreste", "2. Kaffemaskine", "3. Netflix", "4. Sofa", "5. Løbesko",
                "6. Guitar", "7. Slik", "8. Hund", "9. Bog", "10. Øl"};
        //så mulighederne bliver printet ud som en liste:
        for (int i = 0; i < muligheder.length; i++) {
            System.out.println(muligheder[i]);
        }

        int[] hvorMangeGangeBliveDetValgt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {

            String valgAfMulighederBesked = "Indtast valg";
            System.out.println(valgAfMulighederBesked);
            Scanner scanner = new Scanner(System.in);
            int brugerValgFraListe = scanner.nextInt();

            switch (brugerValgFraListe) {
                case 1:
                    System.out.println("Du har valgt Kæreste");
                    break;
                case 2:
                    System.out.println("Du har valgt Kaffemaskine");
                    break;
                case 3:
                    System.out.println("Du har valgt Netflix");
                    break;
                case 4:
                    System.out.println("Du har valgt Sofa");
                    break;
                case 5:
                    System.out.println("Du har valgt Løbesko");
                    break;
                case 6:
                    System.out.println("Du har valgt Guitar");
                    break;
                case 7:
                    System.out.println("Du har valgt Slik");
                    break;
                case 8:
                    System.out.println("Du har valgt Hund");
                    break;
                case 9:
                    System.out.println("Du har valgt Bog");
                    break;
                case 10:
                    System.out.println("Du har valgt Øl");
                    break;
                default:
                    System.out.println("Dit svar kan ikke bruges, du skal vælge imellem 1-10!!");
            }


            if (brugerValgFraListe == 1) {
                hvorMangeGangeBliveDetValgt[0] += 1;

            } else if (brugerValgFraListe == 2) {
                hvorMangeGangeBliveDetValgt[1] = hvorMangeGangeBliveDetValgt[1] + 1;

            } else if (brugerValgFraListe == 3) {
                hvorMangeGangeBliveDetValgt[2] = hvorMangeGangeBliveDetValgt[2] + 1;

            } else if (brugerValgFraListe == 4) {
                hvorMangeGangeBliveDetValgt[3] = hvorMangeGangeBliveDetValgt[3] + 1;

            } else if (brugerValgFraListe == 5) {
                hvorMangeGangeBliveDetValgt[4] = hvorMangeGangeBliveDetValgt[4] + 1;

            } else if (brugerValgFraListe == 6) {
                hvorMangeGangeBliveDetValgt[5] = hvorMangeGangeBliveDetValgt[5] + 1;

            } else if (brugerValgFraListe == 7) {
                hvorMangeGangeBliveDetValgt[6] = hvorMangeGangeBliveDetValgt[6] + 1;

            } else if (brugerValgFraListe == 8) {
                hvorMangeGangeBliveDetValgt[7] = hvorMangeGangeBliveDetValgt[7] + 1;

            } else if (brugerValgFraListe == 9) {
                hvorMangeGangeBliveDetValgt[8] = hvorMangeGangeBliveDetValgt[8] + 1;

            } else if (brugerValgFraListe == 10) {
                hvorMangeGangeBliveDetValgt[9] = hvorMangeGangeBliveDetValgt[9] + 1;
            }
        }
        System.out.println(Arrays.toString(hvorMangeGangeBliveDetValgt));

        //for at finde den mulighed der er blevet valgt flest gange
       int maximum = 0;
       int indexForMaximum = 0;
        for (int i = 0; i < hvorMangeGangeBliveDetValgt.length; i++) {
            if (maximum < hvorMangeGangeBliveDetValgt[i]){
                maximum = hvorMangeGangeBliveDetValgt[i];
                indexForMaximum = i;
            }
        }
        String valgtFlestGange = muligheder[indexForMaximum];

        System.out.println("Mest populærer valg er: " + valgtFlestGange);

    }
}
