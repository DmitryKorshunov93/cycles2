// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        {

            int month = 15_000;
            int total = 0;
            int i = 0;
            while (total <= 2_459_000) {
                i++;
                total = total + total / 100;
                total = total + month;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println("Задание №2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Задание №3");

        int countryPopulation = 12_000_000;
        int fertility = countryPopulation / 1000 * 17;
        int mortality = countryPopulation / 1000 * 8;
        int populationGrowth = fertility - mortality;
        for (i = 1; i <= 10; i++) {
            countryPopulation = countryPopulation + populationGrowth;
            System.out.println("Год " + i + ", численность населения составляет " + countryPopulation);
        }


        { System.out.println("Задание №4");

            int initialDepositAmount = 15_000;
            int total = 0;
            int m = 0;
            while (total <= 12_000_000) {
                m++;
                total = total + total / 100 * 7;
                total = total + initialDepositAmount;
                System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");}}

        {

        System.out.println("Задание №5");

        int initialDepositAmount = 15_000;
        int total = 0;
        int m = 0;
        while (total <= 12_000_000) {
            m++;
            total = total + total / 100 * 7;
            total = total + initialDepositAmount;
            if ( m % 6 == 0){
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");}}}

        System.out.println("Задание №6");

        int initialDepositAmount = 15_000;
        int total = 0;
        int yers = 9 * 12;
        for (i = 0; i <= yers; i ++) {
            total = total + total / 100 * 7;
            total = total + initialDepositAmount;
            if ( i % 6 == 0){
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}}

        System.out.println("Задание №7");

        int friday = 5;
        for (i = friday; i <= 31; i+=7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");}

        System.out.println("Задание №8 ");

        int years = 2023;
        int years200 = years - 200;
        int years100 = years + 200;

        for (i = 0; i <=2123; i+=79) {
            if (i >= years200 && i <= years100)
            System.out.println(i);
        }
    }

}



