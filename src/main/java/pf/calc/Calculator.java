package pf.calc;
import java.util.Scanner;

/*Создайте класс Calculator, который принимает в качестве аргумента конструктора
 экземпляр класса, реализующего интерфейс OperationFactory. Класс Calculator
 должен содержать метод exec, который обеспечивает цикл ввода оргументов и кода
 операции, выполнение операции путем получения соответствующего объекта через
 OperationFactory и вывод результата.*/


class Calculator {
    MyOpFactory myOpFactory;

    public Calculator(MyOpFactory myOpFactory){
        this.myOpFactory = myOpFactory;
    }

    /*Обеспечивает цикл ввода аргументов и вида операции и вывод результата операции*/
    public void exec(){

        boolean nextStep = true;               //  Условие выхода из цикла
        Scanner in = new Scanner(System.in);   //  Объявление потока ввода
        do {
            System.out.println("Введите первый аргумент");
            double arg1 = in.nextDouble();
            System.out.println("Выберите операцию: ");
            System.out.print("0 - сумма\t");
            System.out.print("1 - разность\t");
            System.out.print("2 - деление\t");
            System.out.print("3 - умножение");
            System.out.println();
            int operation = in.nextInt();

            System.out.println("Введите второй аргумент");
            double arg2 = in.nextDouble();

            //  Обработка операций над аргемунтами
            System.out.print("Результат равен:\t");
            Operation op = myOpFactory.getOpInstance(operation);

            if (op != null) System.out.println(op.exec(arg1, arg2));
            else System.out.println("Недопустимая операция!!!");

            //Проверка на выход из цикла
            System.out.println("Хотите продолжить?");
            System.out.print("1 - Продолжить\t");
            System.out.println("2 - Выйти");
            int whatDo = in.nextInt();
            if (whatDo == 2) nextStep = false;

        } while(nextStep);
    }
}
