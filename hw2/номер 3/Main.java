public class Main {
    public static void main(String[] args) {
        Person object = new Person ("София", "Василенко", 65, 174, "Ж", 49500, true);
        String str1 = "Информация о ";
        String str2 = "18 лет достиг - ";
        String str3 = "Пол - ";
        String str4 = "Зарабатывает ";
        String str5 = " рублей в месяц, ";
        String str6 = " рублей в год";
        String str7 = "Вес - ";
        String str8 = " кг. Рост - ";
        String str9 = " см.";
        int j = object.salary * 2;
        System.out.println(str1 + object.name + object.surname + ": " + "\n" + str2 + object.majority + "\n" + str3 + object.gender + "\n" + str4 + object.salary + str5 + j + str6 + "\n" + str7 + object.weight + str8 + object.high + str9);
    }
}
