import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    static void task1()
    {
        System.out.println("Задание 1");

        int sum = 0;
        int goal = 2_459_000;
        int deposit = 15_000;
        int month = 0;

        while(sum < goal)
        {
           sum +=deposit;
           month++;
           System.out.println("Месяц "+month+", сумма накоплений равна "+ new DecimalFormat("###,###,###").format(sum) + " рублей.");
        }

        System.out.println("---\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");

        int iterations =  1;

        while(iterations <= 10)
        {
            System.out.print(iterations + " ");
            iterations++;
        }
        System.out.print("\n");

        for(iterations = iterations-1;iterations > 0; iterations --)
        {
            System.out.print(iterations + " ");
        }
        System.out.print("\n");

        System.out.println("---\n");
    }

    static void task3()
    {
        System.out.println("Задание 3");

        int nation = 12_000_000;
        int birth = 17;
        int death = 8;
        int perPeople = 1000;

        for(int i = 1; i <= 10; i++)
        {
            nation = nation + (nation / perPeople * (birth - death));
            System.out.println("Год "+i+", численность населения составляет "+ new DecimalFormat("###,###,###").format(nation));
        }
        System.out.println("---\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        int sum = 15_000;
        float percent = .07f;
        int month = 0;

        while(sum < 12_000_000)
        {
            sum *= (1 + percent);
            month++;
            System.out.println("Месяц: "+ month+"; Сумма накоплений: "+
                    new DecimalFormat("###,###,###").format(sum));
        }
        System.out.println("---\n");
    }

    static void task5()
    {
        System.out.println("Задание 5");

        int sum = 15_000;
        float percent = .07f;
        int month = 0;
        int goal = 12_000_000;

        while(sum < goal)
        {
            sum *= (1 + percent);
            month++;

            if(month % 6 == 0)
                System.out.println("Месяц: "+ month+"; Сумма накоплений: "+
                    new DecimalFormat("###,###,###").format(sum));
        }
        System.out.println("---\n");
    }

    static void task6()
    {
        System.out.println("Задание 6");

        int sum = 15_000;
        float percent = .07f;
        int month = 0;
        int goal = 108;

        while(month < goal)
        {
            sum *= (1 + percent);
            month++;

            if(month % 6 == 0)
                System.out.println("Месяц: "+ month+"; Сумма накоплений: "+
                        new DecimalFormat("###,###,###").format(sum));
        }
        System.out.println("---\n");
    }

    static void task7()
    {
        System.out.println("Задание 7");

        int firstFriday = 7; //На какой число выпадает первая пятница
        int dayInMonth = 31;

        for(int i = firstFriday; i <= dayInMonth; i = i+7)
        {
            System.out.println("Сегдня пятница, "+ i + "-ое число. Необходимо подготовить отчет.");
        }
        System.out.println("---\n");
    }

    static void task8()
    {
        System.out.println("Задание 8");

        int currYear = 2023;
        int past = currYear - 200;
        int future = currYear + 100;
        int cometFly = 79;

        while(true)
        {
            if(past % cometFly == 0)
            {
                while (past < future)
                {
                    System.out.println(past);
                    past += cometFly;
                }
                break;
            }
            past++;
        }
        System.out.println("---\n");
    }
}