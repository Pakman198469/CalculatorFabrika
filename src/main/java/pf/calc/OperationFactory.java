package pf.calc;

/*Интерфейс OperationFactory - это шаблон класса, который
 по коду операции способен создать экземпляр класса, реализующего интерфейс
 Operation и созданного специально для выполнения операции с указанным кодом.
 Если передан некорректный код операции, метод getOpInstance возвращает null.*/

public interface OperationFactory {
    Operation getOpInstance(int op);
}
