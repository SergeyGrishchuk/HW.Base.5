package HomeWork5;

public class Main {

    public static void main(String[] args) {


//        Staffer staffer = new Staffer("Иванов Петр Сидорович", "Заместитель начальника",
//                "ivanops@mail.com", 175000, 38);
//
//        staffer.info();

        Staffer[] staffers = new Staffer[5];
        staffers[0] = new Staffer("Иванов Иван", "Начальник объекта", "boss@mail.com",
                                    250000, 47);
        staffers[1] = new Staffer("Петров Петр", "Первый заместитель начальника", "first@mail.com",
                                    200000, 45);
        staffers[2] = new Staffer("Сидоров Олег", "Второй заместитель начальника", "second@mail.com",
                                    175000, 39);
        staffers[3] = new Staffer("Иванова Татьяна", "Главный бухгалтер", "moneyinmypocket@mail.com",
                                    125000, 50);
        staffers[4] = new Staffer("Борисова Анна", "Помощник главного бухгалтера", "checkmoney@mail.com",
                                    100000, 37);

        for (int i = 0; i < staffers.length; i++) {
//            if( >= 40){ // не понимаю, как выставить условие проверки
                staffers[i].info();
            } else {
                System.out.println("Возраст меньше 40 лет");
            }
        }
    }
}

