package com.company;

import static java.lang.System.out;

public class EmployeesBook {
    private  int size; // счетчик количества созданных экземпляров класса Employee
    private  Employee[] employeess = new Employee[10]; // создание переменной массива экземпляра класса Employee
    /*
    public static void start(){
        addEmployee("Александр", "Васильевич", "Антонов", 2, 32000);
        addEmployee("Петр", "Васильевич", "Антипов", 2, 31000);
        addEmployee("Николай", "Иванович", "Хлестаков", 1, 42000);
        addEmployee("Вадим", "Дмитриевич", "Горохов", 3, 45000);
        addEmployee("Алексей", "Артемович", "Иванов", 1, 43000);
        addEmployee("Алексей", "Степанович", "Кремнев", 4, 46000);
        addEmployee("Андрей", "Иванович", "Коршунов", 4, 41000);
        addEmployee("Николай", "Иванович", "Золотов", 5, 40000);
        addEmployee("Артем", "Петрович", "Русских", 5, 36000);
        addEmployee("Александр", "Казимирович", "Громов", 3, 60000);
    }
    */
    EmployeesBook() {
        addEmployee("Александр", "Васильевич", "Антонов", 2, 32000);
        addEmployee("Петр", "Васильевич", "Антипов", 2, 31000);
        addEmployee("Николай", "Иванович", "Хлестаков", 1, 42000);
        addEmployee("Вадим", "Дмитриевич", "Горохов", 3, 45000);
        addEmployee("Алексей", "Артемович", "Иванов", 1, 43000);
        addEmployee("Алексей", "Степанович", "Кремнев", 4, 46000);
        addEmployee("Андрей", "Иванович", "Коршунов", 4, 41000);
        addEmployee("Николай", "Иванович", "Золотов", 5, 40000);
        addEmployee("Артем", "Петрович", "Русских", 5, 36000);
        addEmployee("Александр", "Казимирович", "Громов", 3, 60000);
        // addEmployee ("Александр","Васильевич","Антонов",2,32000 ); // проверочная 11 запись для заполненности массива и одиаковости
    }
    /*
                             ОПИСАНИЕ РАбОТЫ  ВВОДА ДАННЫХ В КЛАСС
    При нициализации в классе Main и создании экземпляра класса EmployeesBook под названием employeesBook, запускается конструктор
    EmployeesBook() {.......} в самом классе EmployeesBook (это ж тот же метод) и вызывается метод внутри класса addEmployee, в этом
    же методе идет создание экземпляра класа Employee под именем newEmployee. Но не забудем, что вверху класа EmployeesBook так же
    создан экземпляр класса массив employeess с содержанием десяти (10) ячеек. И в методе addEmployee происходит назначение каждой
    ячеки экземпляра employeess присвоение вновь созданного экземпляра класса  Employee под названием newEmployee. Таким образом
    заполняется по ячейкам экземпляр класса employeess, сам же экземпляр класса EmployeesBook под именем employeess принадлежит
    экземпляру класса EmployeesBook под именем employeesBook, внего входят все гетеры и сеттеры и метод addEmployee.

    В классе Main мы вызываем статические методы класса WorkWithEmployeeBook, но так как мы работаем с массивом данных экземпляров
    класса Employee под названием employeess, то последнего приходится вызывать гетром, а так же передавать текущий размер задействованных
    ячеек экземпляра класса под именем employeess
     */

    // метод передачи экземплятров класса Employee в массив экземпляра класса EmployeesBook
    public void addEmployee(String name, String middlename, String surname, int department, int salary) {
        if (size >= employeess.length) {                                      // если массив заполнен (нет свободных ячеек) то
            System.out.println("Список работников заполнен. Добавление нового сотрудника недоступно.");
            return;
        }
        Employee newEmployee = new Employee(name, middlename, surname, department, salary); // создаем экземпляр класса Employee
        for (int i = 0; i < size; i++) {
            if (employeess[i].equals(newEmployee)) {
                System.out.println("Под номером " + i + " работник, ранее, уже внесен в базу данных !");
                return;
            }
        }
        employeess[size++] = newEmployee;         // передаем экземпляр класса Employee в ячейку массива под индексом size

    }
   // Этот метод сдвигает массив влево на одну ячейку, затирая ячейку под номером i путем смещения всех элементов справа на одну ячейку влево
    public void removeEmployeeBook(Employee[] empl, int id, String surname) {
        int l = 0;
        for (int i = 0; i < empl.length; i++) {
            if ((empl[i].getSurname()).equals(surname)) {
                empl[i] = null;
                if (i != empl.length - 1) {
                    int numberOfCells = (empl.length - 1) - i;
                    System.arraycopy(empl, i + 1, empl, i, numberOfCells);
                }
                size--;
                l = size;
                System.out.println("Работник под номером записи " + id + " с фамилией " + surname + " удаляется ! ");
                //empl[size+1] = null;
                for (int k = 0; k < size; k++) {
                    empl[k].setId(k);
                }
               return;
            }

        }
        System.out.println("Работник с фамилией " + surname + " не найден !");
    }
    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Employee[] getEmployeess() {
        return employeess;
    }

    public void setEmployeess(Employee[] employeess) {
        this.employeess = employeess; }
}
