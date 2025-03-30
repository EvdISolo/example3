import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

       /* System.out.println(" Вас привествует программа по определению количества дней в году");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год в формате **** \n");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Количество дней составляет 366");
        } else if (year % 100 == 0) {
            System.out.println("Количество дней составляет 365 ");
        } else if (year % 4 == 0) {
            System.out.println("Количество дней составляет 366");
        } else System.out.println("Количество дней составляет 365");

    */


        System.out.println(" Вас привествует игра ");

        int i = 0;
        int days1 = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите год в формате **** \n");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите количество дней в формате *** \n");
            int days = Integer.parseInt(scanner.nextLine());


            if (year % 400 == 0) {
                days1 = 366;
            }
            if (year % 100 != 0 & year % 4 == 0) {
                days1 = 366;


            } else days1 = 365;


            if (days1 == days) {
i=i++;
                System.out.println("Набранно очков : " + i);

            } else if (days1 != days) {
                System.out.println("Игра закончена набранно очков " + i);
                break;
            }


        }

    }
}



       






