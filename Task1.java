public class Task1{

    public Task1(){
        System.out.println();
        //тут выводится полное условие
        System.out.println("Объявить переменные всех примитивных типов: без инициализации, инициализацией и с вычислением при инициализации.  Распечатать их значения (System.out.println(), System.out.printf()). Целочисленные значения вывести в десятичном и шестнадцатеричном формате.");

        //дальше програмный код
        System.out.println("Start");

        int a=523;
        char b='a';
        double c = 3+56;
        float f =9.154f;
boolean d=true;
        System.out.println(a+" "+b+" "+c+" "+f+" "+d);
        System.out.println(Integer.toHexString(a));
        //и наконец результат работы программы
        System.out.println("");
    }


}