import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
public class main {

    public static String optionsList (String[] options){
        String optionsList = null;

        for (int i = 0; i < options.length; i++) {
            optionsList = options[i];
            System.out.println(optionsList);
        }
        return optionsList;
    }

    public static int userInputValidation(){
        int userInput = 0;
        try {
            String optionsMessage = "Indtast valg";
            System.out.println(optionsMessage);
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();

        } catch (Exception e) {
        }
        return userInput;
    }

    public static void main(String[] args) {

        String welcomeMessage = "Velkommen, hvilken af følgene ting vil du helst have med på en øde ø?";
        System.out.println(welcomeMessage);

        String[] options = {"1. Kæreste", "2. Kaffemaskine", "3. Netflix", "4. Sofa", "5. Løbesko",
                "6. Guitar", "7. Slik", "8. Hund", "9. Bog", "10. Øl"};

       optionsList(options);

        int[] howManyTimesChoosen = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int userPickFromList = 0;

        // et for-loop så der bliver spurgt 10 gange
        for (int i = 0; i < 10; i++) {

            boolean done = false;
            while (!done) {

                userPickFromList = userInputValidation();

                    switch (userPickFromList) {
                        case 1:
                            System.out.println("Du har valgt Kæreste");
                            done = true;
                            break;
                        case 2:
                            System.out.println("Du har valgt Kaffemaskine");
                            done = true;
                            break;
                        case 3:
                            System.out.println("Du har valgt Netflix");
                            done = true;
                            break;
                        case 4:
                            System.out.println("Du har valgt Sofa");
                            done = true;
                            break;
                        case 5:
                            System.out.println("Du har valgt Løbesko");
                            done = true;
                            break;
                        case 6:
                            System.out.println("Du har valgt Guitar");
                            done = true;
                            break;
                        case 7:
                            System.out.println("Du har valgt Slik");
                            done = true;
                            break;
                        case 8:
                            System.out.println("Du har valgt Hund");
                            done = true;
                            break;
                        case 9:
                            System.out.println("Du har valgt Bog");
                            done = true;
                            break;
                        case 10:
                            System.out.println("Du har valgt Øl");
                            done = true;
                            break;
                        default:
                            System.out.println("Du skal vælge et tal imellem 1-10");
                            break;
                    }
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
        //printer listen ud så man kan se hvor mange gange de forskellige muligheder er blavet valgt
        System.out.println(Arrays.toString(howManyTimesChoosen));

        //for at finde den mulighed/muligheder der er blevet valgt flest gange
        int[] indexToMax = {0,0,0,0,0,0,0,0,0,0};
        int numberOfMaxAlike = 0;
        int max = 0;

        for (int i = 0; i < howManyTimesChoosen.length; i++) {
            if (max < howManyTimesChoosen[i]){
                indexToMax[0] = i;
                numberOfMaxAlike = 1;
                max = howManyTimesChoosen[i];
            } else if (max == howManyTimesChoosen[i]){
                indexToMax[numberOfMaxAlike] = i;
                numberOfMaxAlike += 1;
                max = howManyTimesChoosen[i];
            }

        }

        for (int i = 0; i < numberOfMaxAlike; i++) {
            String choosenMostTime = options[indexToMax[i]];
            System.out.println("Mest populærer valg er " + choosenMostTime);
        }
    }
}
