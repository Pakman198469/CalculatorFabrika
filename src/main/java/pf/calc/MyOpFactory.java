package pf.calc;

/*
   Создайте реализации интерфейса Operation для операций сложения, вычитания,
 умножения, деления (OpPlus, OpMinus, OpMul, OpDiv соответственно).

   Создайте реализацию интерфейса OperationFactory, создающую перечисленные выше
   объекты (MyOpFactory).
 */

class MyOpFactory implements OperationFactory{
    int operationCode;
    private Operation operation;

    @Override
    /*Получает код операции, по которому создает соответствующий объект операции*/
    public Operation getOpInstance (int op){
        this.operationCode = op;
        switch (operationCode){
            case 0:{
                operation = new OpPlus();
                break;
            }
            case 1:{
                operation = new OpMinus();
                break;
            }
            case 2:{
                operation = new OpDivide();
                break;
            }
            case 3:{
                operation = new OpMultiply();
                break;
            }
            default:{
                operation = null;
            }
        }
        return operation;
    }
}
