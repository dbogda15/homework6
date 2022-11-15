public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника -  " + fullName);

        //Задание 2
        System.out.println("\nЗадание 2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        //Задание 3
        System.out.println("\nЗадание 3");
        String fullRussianName = "Иванов Семён Семёнович";
        fullRussianName = fullRussianName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullRussianName);
    }
}