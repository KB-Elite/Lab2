//это основной класс для лабы в нем будет меню для запуска соответствующего задания
//решение заданий должно быть каждый в своем классе с именем "TaskX", где Х - это номер задания
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int choise;
		do{
			System.out.println();
			System.out.println("\tMENU:");
			System.out.println("-1. Пример");
                        System.out.println("0. Завершить работу");
			System.out.println("1. Задание 1");
			System.out.println("10. Задание 10");

			choise = scan.nextInt();
			switch (choise){
				case -1:new Primer();
					break;
                                case 0: System.exit(0);
                                        break;
                                case 1:
                                        break;
				case 10:new Task10();
					break;
				default:
					System.out.println("Invalid menu number! Try again!");
			}
		}
		while (true);
	}
}
