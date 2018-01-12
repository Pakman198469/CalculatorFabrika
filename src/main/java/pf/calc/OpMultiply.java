package pf.calc;

/*
   Создайте реализации интерфейса Operation для операций сложения, вычитания,
   умножения, деления (OpPlus, OpMinus, OpMul, OpDiv соответственно).
 */

class OpMultiply implements Operation{

    @Override
    public double exec(double valueOne, double valueTwo){
        return (valueOne * valueTwo);
    }
}
