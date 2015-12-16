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
			System.out.println("2. Задание 2");
            		System.out.println("3. Задание 3");
			System.out.println("4. Задание 4");
			System.out.println("5. Задание 5");
			System.out.println("6. Задание 6");
			System.out.println("7. Задание 7");
                        System.out.println("8. Задание 8");
			System.out.println("9. Задание 9");
			System.out.println("10. Задание 10");
			choise = scan.nextInt();
			switch (choise){
        		        case 0: System.exit(0);
                    			break;
				case 1: new Task1();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
                                case 6: new Task6();
					break;
				case 7: new Task7();
					break;
				case 8:	new Task8();
					break;
				case 9:	new Task9();
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
