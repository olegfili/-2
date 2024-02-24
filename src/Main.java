//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main (String[] args) {

        System.out.println("Задача 1");
        int a = 5000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 40;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 21545;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 50000;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e =3.75f;
        System.out.println("Значение переменной e с типом float точкой равно " + e);
        double f = 12.111;
        System.out.println("Значение переменной f с типом double точкой равно " + f);

        System.out.println("Задача 2");
        double v = 27.12;
        long i = 987678965549L;
        double q = 2.786;
        short m = 569;
        short p = -159;
        int h = 27897;
        byte j = 67;

        System.out.println("Задача 3");
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int sheets = 480;
        int toEach = sheets / (lP+aS+eA);
        System.out.println("На каждого ученика рассчитано " + toEach + " листов бумаги ");

        System.out.println("Задача 4");
        int bottles = 16;
        int time = 2;
        int rightTime = 20;
        int performance = (rightTime / time)* bottles;
        System.out.println("За 20 минут машина произвела " + performance + " штук бутылок ");

        bottles = 16;
        time = 2;
        rightTime = 1440;
        performance = (rightTime / time) * bottles;
        System.out.println("За сутки машина произвела " + performance + " штук бутылок ");

        bottles = 16;
        rightTime = 4320;
        performance = (rightTime / time) * bottles;
        System.out.println("За трое суток машина произвела " + performance + " штук бутылок ");

        bottles = 16;
        time = 2;
        rightTime = 44640;
        performance = (rightTime / time) * bottles;
        System.out.println("За месяц (31 день) машина произвела " + performance + " штук бутылок ");

        System.out.println("Задача 5");
        int brown = 4;
        int withe = 2;
        int totalCans = 120;
        int totalClasses = totalCans / (brown+withe);
        int totalBrown = totalClasses * brown;
        int totalWithe = totalClasses * withe;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWithe + " банок белой краски и " + totalBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        int totalBananas = 5;
        int weightOneBananas = 80;
        int totalMilk = 210;
        int iceCream = 2;
        int weightOneIceCream = 100;
        int totalEggs = 4;
        int oneEgg = 70;
        int total = (totalBananas*weightOneBananas) + totalMilk + (iceCream*weightOneIceCream) + (totalEggs*oneEgg);
        System.out.println("Общий вес спортзавтрака " + total + " грамм");
        double grPerKg = 1000;
        double totalKg = total / grPerKg;
        System.out.println("Общий вес спортзавтрака " + totalKg + " килограмм");

        System.out.println("Задача 7");
        int weightForLossInGrams = 7_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDaysCount = (double) weightForLossInGrams / lossWeightPerDayMin;
        System.out.println("Максимальное количество дней для похудения "+maxDaysCount);
        double minDaysCount = (double) weightForLossInGrams / lossWeightPerDayMax;
        System.out.println("Минимальное количество дней для похудения "+minDaysCount);
        double lossWeightPerDayAverage = (lossWeightPerDayMin+lossWeightPerDayMax) / 2D;
        double averageDaysCount = weightForLossInGrams / lossWeightPerDayAverage;
        System.out.println("Среднее количество дней для похудения "+averageDaysCount);

        System.out.println("Задача 8");
        int  ma = 67760;
        int  de = 83690;
        int kr = 76230;
        byte percent = 10;
        int promotionMa = (ma*percent) / 100;
        int newZpMa = ma + promotionMa;
        System.out.println("Маша теперь получает " + newZpMa+ " рублей."+ " Годовой доход вырос на "+ promotionMa+ " рублей");
        int promotionDe = (de*percent) / 100;
        int newZpDe = de + promotionDe;
        System.out.println("Денис теперь получает " + newZpDe+ " рублей."+ " Годовой доход вырос на "+ promotionDe+ " рублей");
        int promotionKr = (kr*percent) / 100;
        int newZpKr = kr + promotionKr;
        System.out.println("Кристина теперь получает " + newZpKr+ " рублей."+ " Годовой доход вырос на "+ promotionKr+ " рублей");


    }
}