import java.util.*;

public class Task8{
	final int MAX = 9;
	final int MIN = 1;
	public Task8(){

		Scanner scan = new Scanner(System.in);
		System.out.println();
		//тут выводится полное условие
		System.out.println("Проверка допустимости введенного значения ");

		//дальше програмный код
		System.out.println("Start");
		System.out.println("Введите номер этажа (от "+MIN+" до "+MAX+" )");

		int n = scan.nextInt();

		while (n<MIN || n>MAX){
			System.out.println("Неверный формат ввода!");
			System.out.println("Введите номер этажа (от "+MIN+" до "+MAX+" )");
                        n = scan.nextInt();
		}


		//и наконец результат работы программы
		System.out.println("Вы ввели число: "+n);

		System.out.println();
		System.out.println("Ready!!!");
	}



}
