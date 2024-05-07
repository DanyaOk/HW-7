public class Main {
    public static void main(String[] args) {

        int salary = 65535;
        int total = 0;
        int vklad = 1500;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary - vklad;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();

        for (k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
        System.out.println();
        int people = 12_000_000;
        int year = 1;
        int plusOnTheYear = people / 1000 * 17;
        int minusOnTheYear = people / 1000 * 8;

        for (year = 1; year <= 10; year++) {
            people = people + plusOnTheYear - minusOnTheYear;
            System.out.println("Год " + year + ", численность населения " + people);
        }

        int firstSumm = 15000;
        int mounth = 0;
        while (firstSumm < 12_000_000) {
            firstSumm = firstSumm + (firstSumm / 100) * 7;
            mounth = mounth + 1;
            System.out.println(mounth + " месяц, " + firstSumm + " рублей");
        }

        int secondSumm = 15000;
        int mounths = 0;
        for (; secondSumm < 12_000_000; mounths++) {
            secondSumm = secondSumm + (secondSumm / 100) * 7;
            if (mounths % 6 == 0) {
                System.out.println(mounths + " месяц, " + secondSumm + " рублей");
            }

        }

        int threeSumm = 15000;
        int mounthTh = 0;
        int mounthsOnNineYears = 12 * 9;
        for (; mounthTh <= mounthsOnNineYears; mounthTh++) {
            threeSumm = threeSumm + (threeSumm / 100) * 7;
            if (mounthTh % 6 == 0) {
                System.out.println(mounthTh + " месяц, " + threeSumm + " рублей");
            }

        }

        int friday = 3;
        int dayNumber = 1;
        for (; dayNumber <= 31; dayNumber++) {
            if (dayNumber == friday || dayNumber == friday + 7 || dayNumber == friday + 14 || dayNumber == friday + 21 || dayNumber == friday + 28) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет.");

            }


        }

       int firstYear=1825;
       for ( ;firstYear <= 2124  && firstYear >= 1824; firstYear++) {
              if (firstYear % 79 == 0) {
                System.out.println(firstYear);

        }
    }



    }}