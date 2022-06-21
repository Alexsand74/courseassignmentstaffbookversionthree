package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        EmployeesBook employeesBook = new EmployeesBook();// создание экземпляра класса EmployeesBook, на основе его конструктора внутри

        System.out.println("ВЫВОДИМ СПИСОК ДАННЫХ О ВСЕХ СОТРУДНИКАХ ");
        WorkWithEmployeeBook.printAllEmployees(employeesBook.getEmployeess(), employeesBook.getSize()); // вывод всех данных сотрудников  (экземпляра класса Employees)
        System.out.println();

        System.out.println("ВЫВОДИМ СУММУ ЗАРПЛАТ ВСЕХ СОТРУДНИКОВ ");
        WorkWithEmployeeBook.sumAllSalariesEmployees(employeesBook.getEmployeess(), employeesBook.getSize());// вывод общей суммы всей зараплат сотрудников
        System.out.println();
        System.out.println("ВЫВОДИМ СРЕДНЮЮ ЗАРПЛАТУ ВСЕХ СОТРУДНИКОВ ");
        WorkWithEmployeeBook.averageAllSalariesEmployees(employeesBook.getEmployeess(), employeesBook.getSize()); // вывод суммы средней зараплаты сотрудника
        System.out.println();
        System.out.println("СОТРУДНИКОМ c минимальной зарплатой является ");
        WorkWithEmployeeBook.minAllSalariesEmployees(employeesBook.getEmployeess(), employeesBook.getSize()); // вывод сотрудника с самой маленькой зарплатой
        System.out.println();
        System.out.println("СОТРУДНИКОМ c максимальной зарплатой является ");
        WorkWithEmployeeBook.maxAllSalariesEmployees(employeesBook.getEmployeess(), employeesBook.getSize());  // вывод сотрудника с самой большой зарплатой
        System.out.println();
        System.out.println("ВЫВОДИМ СПИСОК Имен Отчеств и Фамилий ВСЕХ СОТРУДНИКОВ ");
        WorkWithEmployeeBook.printAllsurnamesEmployees(employeesBook.getEmployeess(), employeesBook.getSize()); // вывод И О Ф всех сотрудников
        System.out.println();
        System.out.println("Введите процент со знаком + или -, на который хотите увеличить или уменьшить заработную плату ВСЕХ сотрудников ");
        WorkWithEmployeeBook.indexingAllSalariesEmployees(employeesBook.getEmployeess(), employeesBook.getSize()); // индексация зарплаты всех сотрудников на опреденный процент
        System.out.println();
        WorkWithEmployeeBook.printAllEmployees(employeesBook.getEmployeess(), employeesBook.getSize());
        System.out.println();
        System.out.println("Выводим списки тех сотрудников у котрых заработная плата выше и ниже заданного числа");
        WorkWithEmployeeBook.comparisonAllSalariesEmployees(employeesBook.getEmployeess(), employeesBook.getSize());
        System.out.println();
        employeesBook.removeEmployeeBook(employeesBook.getEmployeess(), 5, "Кремнев");
        System.out.println();
        System.out.println("ВЫВОДИМ СПИСОК ДАННЫХ О ВСЕХ СОТРУДНИКАХ ");
        WorkWithEmployeeBook.printAllEmployees(employeesBook.getEmployeess(), employeesBook.getSize()); // вывод всех данных сотрудников  (экземпляракласса Employees)
        System.out.println();
        System.out.println("ВЫВОДИМ СОТРУДНИКОВА  - Серегей Иванович Костормин, 2, 29000");
        employeesBook.addEmployee("Сергей", "Иванович", "Косторомин", 2, 29000);
        System.out.println();
        System.out.println("ВЫВОДИМ СПИСОК ДАННЫХ О ВСЕХ СОТРУДНИКАХ ");
        WorkWithEmployeeBook.printAllEmployees(employeesBook.getEmployeess(), employeesBook.getSize());
        System.out.println();
    }
}