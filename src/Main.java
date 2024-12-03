import java.util.Random;

public class Main {
    public static void main(String[] args) {
        executeWorkingDay();
    }

    private static void executeWorkingDay() {
        System.out.println("Время 11.00");
        alarm();
        System.out.println("Пойти на кухню");
        makeCofe();
        System.out.println("Взять кофе и включить ноутбук");
        watchVideo();
        int time = 12; // О, на часах уже полдень, пора бы начать работать.
        int eveningTime = workDay(time); // поработаем-ка мы до 8 вечера
        restTime(eveningTime);
    }

    //метод: Будильник
    public static void alarm() {
        while (true) {
            System.out.println("Будильник: БЗЗЗЗЗЗЗЫЫЫЫЫЫЫНЬ!");
            if (isProgrammerWakeUp()) {
                break;
            }
        }
    }

    // нам срочно нужен кофе

    public static void makeCofe() {

        if (isKettleEmpty()) {
            System.out.println("Налить воды в чайник");
        }
        System.out.println("Включить чайник");

        for (int i = 4; i >= 0; i--) {
            switch (i) {
                case 0:
                    System.out.println("Вода закипела");
                    break;
                case 1:
                    System.out.println("Вода закипит через минуту");
                    break;
                default:
                    System.out.println("Вода закипит через " + i + " минуты");
                    break;
            }
        }
        System.out.println("Приготовить кофе");
    }


    // Метод: посмотреть видео
    public static void watchVideo() {
        System.out.println("Посмотреть мемы про менеджеров за кружкой кофе"); // да, куда же без мемов?

        for (int i = 5; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Кажется, пора работать");
            } else {
                System.out.println("О_о, ещё мемчик");
            }
        }
    }

    // Пауза на кофе
    public static int cofeBreak(int time) {
        if (time % 3 == 0) {
            makeCofe();
            System.out.println("Взять кофе и вернуться делать: 'клац... клац...'");
        }
        return time;
    }

    // поработаем-ка мы до 8 вечера
    public static int workDay(int time) {
        while (time <= 20) {
            System.out.println("Писать код... Клац, клац...");
            time++;
            cofeBreak(time);
        }
        System.out.println("Пора бы поиграть в Playstation");
        return time;
    }

    //Время отдыха

    public static void restTime(int eveningTime) {
        while (eveningTime <= 24) {
            System.out.println("Пиу пи");
            eveningTime++;
        }

        System.out.println("Кажется, пора посмотреть фильм и пойти спать");
        System.out.println("Алиса, помоги выбрать фильм");

        while (isThisFilmInteresting()) {
            System.out.println("Алиса, не то");
        }

        System.out.println("То что нужно! Отличный фильм");
        System.out.println("Ну вот, пора спать :(");
    }


    // программисты любят поспать подольше
    private static boolean isProgrammerWakeUp() {
        int random = new Random().nextInt(5); // этот метод позволяет сгенерировать случайное число от 0 до 4
        return random == 0;
    }

    // воды в чайнике может и не быть :(
    private static boolean isKettleEmpty() {
        return new Random().nextBoolean(); // этот метод позволяет сгенерировать случайное значение типа boolean (true или false)
    }

    // давайте выберем интересный фильм
    private static boolean isThisFilmInteresting() {
        int random = new Random().nextInt(3); // этот метод позволяет сгенерировать случайное число от 0 до 2
        return random != 0;
    }
}

