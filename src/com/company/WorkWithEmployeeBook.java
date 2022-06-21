package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class WorkWithEmployeeBook {
    // вывод одного экземпляра класса Employees в консоль со всеми полями
    public static void printOneEmployees (Employee employees){
        out.println (employees.toString()); // обращаемся к переопределенному классу toString
    }
    // выводим ВЫВОДИМ СПИСОК ДАННЫХ О ВСЕХ СОТРУДНИКАХ
    public static void printAllEmployees (Employee[] empl, int size) {
        for (int i = 0; i < size; i++) {
            printOneEmployees ( empl[i]);
        }
    }
    // выводим ВЫВОДИМ СУММУ ЗАРПЛАТ ВСЕХ СОТРУДНИКОВ
    public static  void sumAllSalariesEmployees(Employee[] empl, int size) {
        int sumAllSalaries = 0;
        for (int i = 0; i < size; i++) {
            sumAllSalaries += empl[i].getSalary();
        }
        out.println("Сумма зарплат всех сотрудников = " + sumAllSalaries);
    }
    // вывод ВЫВОДИМ СРЕДНЮЮ ЗАРПЛАТУ ВСЕХ СОТРУДНИКОВ
    public static void averageAllSalariesEmployees(Employee[] empl, int size) {
        int summa = 0;
        for (int i = 0; i < size; i++) {
            summa += empl[i].getSalary();
        }
        int averageAllSalaries = summa / size;

        out.println("Средняя зарплата всех сотрудников = " + averageAllSalaries);
    }

    // вывод СОТРУДНИКА c минимальной зарплатой является
    public static void minAllSalariesEmployees(Employee[] empl, int size) {
        int sumAllSalaries = empl[0].getSalary();
        int minSalaryIndex = 0;
        for (int i = 1; i < size; i++) {
            if (sumAllSalaries > empl[i].getSalary()) {
                sumAllSalaries = empl[i].getSalary();
                minSalaryIndex = i;
            }
        }
        printOneEmployees(empl[minSalaryIndex]);
    }

    // вывод СОТРУДНИКА c максимальной зарплатой является
    public static void maxAllSalariesEmployees(Employee[] empl, int size) {
        int sumAllSalaries = empl[0].getSalary();
        int maxSalaryIndex = 0;
        for (int i = 1; i < size; i++) {
            if (sumAllSalaries < empl[i].getSalary()) {
                sumAllSalaries = empl[i].getSalary();
                maxSalaryIndex = i;
            }
        }
        printOneEmployees(empl[maxSalaryIndex]);
    }

    // ввод числа с клавиатуры в программу
    public static int inputNumbersInt() {
        Scanner range = new Scanner(in);
        //Ввводим число и проверяем его на отритцательность и сужествование
        if (range.hasNextInt()) {
            return range.nextInt();
        } else {
            return -101;
        }
    }

    //Введите процент со знаком + или -, на который хотите увеличить или уменьшить заработную плату заработную плату ВСЕХ сотрудников
    public static void indexingAllSalariesEmployees(Employee[] empl, int size) {
        int k = 0;
        do {
            out.print(" введите число после знака -> ");
            k = inputNumbersInt();
        } while (k < -100 || k > 100);
        for (int i = 0; i < empl.length; i++) {

            empl[i].setSalary((empl[i].getSalary() / 100) * k + empl[i].getSalary());

        }
    }

    public static void averageAllSalariesEmployees() {
    }

    //ВЫВОДИМ СПИСОК Имен Отчеств и Фамилий ВСЕХ СОТРУДНИКОВ
    public static  void printAllsurnamesEmployees(Employee[] empl , int size) {
        for (int i = 0; i < size; i++) {
            out.println("   " + empl[i].getName() + " " + empl[i].getMiddlename() + " " + empl[i].getSurname());
        }
    }

    //Введите число и метод выведет всех сотрудников у кого зарпалат выше или ниже
    public static void comparisonAllSalariesEmployees(Employee[] empl, int size) {
        int k = 0;
        out.println("Введите число и программа выведет всех СОТРУДНИКОВ  у кого зарплата ВЫШЕ и НИЖЕ этого числа ");
        do {
            out.print(" введите число после знака -> ");
            k = inputNumbersInt();
        } while (k < -0 || k > 1000000);
        out.println();
        out.println("Выводим сотрудников у кого заплата ВЫШЕ : ");
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getSalary() > k) {
                printOneEmployees(empl[i]);
            }
        }
        out.println();
        out.println("Выводим сотрудников у кого заплата НИЖЕ : ");
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getSalary() < k) {
                printOneEmployees(empl[i]);
            }
        }
        out.println();
    }

}
