import java.util.*;

public class Task9{
	public Task9(){
		Scanner scan = new Scanner(System.in);
		System.out.println();
		//тут выводится полное условие
		System.out.println("Вывести множество нечетных чисел максимальной мощьности, чье произведение меньше 10 000");

		//дальше програмный код
		System.out.println("Start");

		//и наконец результат работы программы
		int p=1;
		int n=1;
		while (p<10000)
		{
			System.out.println(n+" ");
			n+=2;
			p*=n;
			
		}

		System.out.println();
		System.out.println("Ready!!!");
	}



}
