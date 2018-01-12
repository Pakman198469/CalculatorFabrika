package pf.calc;

/* Основной CalculatorFabrika (запускаемый) класс программы должен создать экземпляр класса
   MyOpFactory, создать экземпляр класса Calculator, передав ему в качестве
   параметра объект MyOpFactory и выполнить метод exec созданного объекта
   Calculator.
 */

public class CalculatorFabrika {
    public static void main(String[] args) {
        MyOpFactory myOpFactory = new MyOpFactory();
        Calculator calc = new Calculator(myOpFactory);
        calc.exec();
    }
}
