public class Main {
    public static void main(String[] args) {
        task2();
    }
    public static void task1(){
        int clientOS = 1;
        String sample = "Установите версию приложения для ";

        if(clientOS == 1){
            System.out.println(sample + "Android по ссылке.");
        }
        else {
            System.out.println(sample + "iOS по ссылке.");
        }
    }

    public static void task2(){
        int clientOS = 1;
        int clientDeviceYear = 2015;

        String versionOfApp = clientDeviceYear >= 2015 ? "Установите версию приложения" : "Установите облегченную версию приложения";
        String userSystem = clientOS == 0 ? " для Android по ссылке" : " для iOS по ссылке";

        System.out.println(versionOfApp + userSystem);
    }

    public static void task3(){
        int year = 2021;

        boolean isLeap = year % 4 == 0 && year % 100 != 0 && year > 1584;

        if(isLeap){
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task4(){
        int deliveryDistance = 120;
        int daysForDelivery;
        String sample = "Потребуется дней: ";

        if (deliveryDistance <= 20){
            daysForDelivery = 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            daysForDelivery = 2;
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            daysForDelivery = 3;
        }
        else {
            daysForDelivery = 0;
        }

        if(daysForDelivery > 0){
            System.out.println(sample + daysForDelivery);
        }
        else {
            System.out.println("Доставки нет.");
        }
    }

    public static void task5(){
        int monthNumber = 9;

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит к зиме.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к весне.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к лету.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к осени.");
                break;

        }
    }
}