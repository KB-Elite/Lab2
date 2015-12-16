import java.util.*;

public class Task6{
	final float dpsm = 2.54f;	//сантиметров в одном дюйме
	final float g = 9.8f;		//гравитационная постоянная
	public Task6(){

		Scanner scan = new Scanner(System.in);
		System.out.println();
		//тут выводится полное условие
		System.out.println("Мини-Калькулятор");

		//дальше програмный код
		System.out.println("Start\n");
		int n;
		do {
			System.out.println("Добро пожаловать, перед вами мини-калькулятор");
			System.out.println("1.Перевод дюймов в сантиметры;");
			System.out.println("2.Увеличение скорости в вакууме в зависимости от времени свободного падения;");
			System.out.println("3.Перевод из фаренгейтов в градусы цельсия;");
			System.out.println("0.Завершить работу.");
			System.out.print("Сделайте свой выбор: ");
			n = scan.nextInt();
			switch (n){
			case 1:{
				System.out.println("Введите кол-во дюймов");
				float d=scan.nextFloat();
				System.out.println(d+" дюймов = "+d*dpsm+" сантиметров\n");
				}
				break;
			case 2:{
				System.out.println("Введите время падения в секундах");
                                float t=scan.nextFloat();
                                System.out.println("Через "+t+" секунд скорость будет равна = "+g*t+" м/с. \n");
				}
				break;
			case 3:{
				System.out.println("Введите температуру в градусах Фаренгейта");
                                float T=scan.nextFloat();
                                System.out.println(T+" градусов по Фаренгейту = "+(T-32)*5/9+" градусов по Цельсию. \n");
				}
				break;

			}

		}
		while (n!=0);

		//и наконец результат работы программы



		System.out.println();
		System.out.println("Ready!!!");
	}



}

