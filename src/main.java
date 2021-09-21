import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class main {


    public static void main(String[] args) {
        String welcomeMessage = "Velkommen, hvilken af følgene ting vil du helst have med på en øde ø?";
        System.out.println(welcomeMessage);

        String[] options = {"1. Kæreste", "2. Kaffemaskine", "3. Netflix", "4. Sofa", "5. Løbesko",
                "6. Guitar", "7. Slik", "8. Hund", "9. Bog", "10. Øl"};

        //så mulighederne bliver printet ud som en liste:

        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }

        int[] howManyTimesChoosen = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {

            String optionsMessage = "Indtast valg";
            System.out.println(optionsMessage);
            Scanner scanner = new Scanner(System.in);
            int userPickFromList = scanner.nextInt();

            switch (userPickFromList) {
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
            }


            if (userPickFromList == 1) {
                howManyTimesChoosen[0] += 1;

            } else if (userPickFromList == 2) {
                howManyTimesChoosen[1] += 1;

            } else if (userPickFromList == 3) {
                howManyTimesChoosen[2] += 1;

            } else if (userPickFromList == 4) {
                howManyTimesChoosen[3] += 1;

            } else if (userPickFromList == 5) {
                howManyTimesChoosen[4] += 1;

            } else if (userPickFromList == 6) {
                howManyTimesChoosen[5] += 1;

            } else if (userPickFromList == 7) {
                howManyTimesChoosen[6] += 1;

            } else if (userPickFromList == 8) {
                howManyTimesChoosen[7] += 1;

            } else if (userPickFromList == 9) {
                howManyTimesChoosen[8] += 1;

            } else if (userPickFromList == 10) {
                howManyTimesChoosen[9] += 1;
            }
        }
        System.out.println(Arrays.toString(howManyTimesChoosen));

        //for at finde den mulighed der er blevet valgt flest gange

       int maximum = 0;
       int indexForMaximum = 0;
        for (int i = 0; i < howManyTimesChoosen.length; i++) {
            if (maximum < howManyTimesChoosen[i]){
                maximum = howManyTimesChoosen[i];
                indexForMaximum = i;
            }
        }
        String choosenMostTimes = options[indexForMaximum];

        System.out.println("Mest populærer valg er: " + choosenMostTimes);

    }
}
