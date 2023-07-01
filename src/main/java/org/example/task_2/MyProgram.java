package org.example.task_2;

import java.time.LocalDate;

public class MyProgram {
    /* У программиста Васи на подоконнике растёт кактус. Вася постоянно забывает
    его поливать, поэтому он купил датчик влажности и решил составить программу
    для отслеживания времени полива.
    На вход программа ждет дату последнего полива кактуса. Если сейчас зима
    (декабрь - февраль), то кактус поливается раз в месяц. Если осень или весна -
    раз в неделю. Летом поливается в зависимости от влажности воздуха, но не
    чаще одного раза в два дня.
    Значение влажности воздуха в программу попадает автоматически от датчика
    (реализуйте через вызов метода класса Датчик, внутри которого будет
    генерация рандомного числа). Если влажность меньше 30%, кактус нужно
    полить.
    Вася ожидает от программы, что после проверки всех данных, она выведет ему
    сообщение с датой, когда надо поливать кактус.
    Реализуйте программу, используя принципы ООП и библиотеки для работы с
    датой.
    */
    public static void main(String[] args) {
        NextWateringDate nextWateringDate = new NextWateringDate(LocalDate.of(2020, 6, 1));
        nextWateringDate.getNextWatering();
    }
}
