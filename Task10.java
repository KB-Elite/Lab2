import java.util.*;

public class Task10{
	public Task10(){
		Scanner scan = new Scanner(System.in);
		System.out.println();
		//тут выводится полное условие
		System.out.println("Реализовать решето Эратосфена: найти все простые числа от 2 до n. ");

		//дальше програмный код
		System.out.println("Start");
		System.out.println("Введите n (от 2 до 10^8)");
		int n = scan.nextInt();

		while (n<2 || n>100000000){
			System.out.println("Неверный формат ввода!");
			System.out.println("Введите n (от 2 до 10^8)");
                        n = scan.nextInt();
		}
		boolean prime[] = new boolean[n+1];
		prime[0]=false;
		prime[1]=false;
		for (int i=2;i<=n;i++)
			prime[i]=true;

		for (int i=2;i<=n;i++)
			if (prime[i])
				for (int j=2;j<=n/i;j++)
					prime[i*j]=false;




		//и наконец результат работы программы
		System.out.println("Список простых чисел:");
		for (int i=2;i<=n;i++)
                        if (prime[i])
				System.out.print(i+" ");

		System.out.println();
		System.out.println("Ready!!!");
	}



}
