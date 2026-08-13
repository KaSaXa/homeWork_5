public class Main {
    public static void main(String[] args) {


// task 1
        int clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// task 2
        int clientOS2 = 1; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

// task 3
        int year = 2024;

        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год должен быть больше 1584");
        }

// task 4
        int deliveryDistance = 95;
        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
            System.out.println("Доставка невозможна: расстояние свыше 100 км");
        }

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

//task 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень");
                break;
            default:
                System.out.println("Некорректный номер месяца.");
                break;

            }
        }
    }


