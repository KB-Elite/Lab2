public class Task7{

	public Task7(){
		System.out.println();
		//тут выводится полное условие
		System.out.println("Объявить целые, инициализировать их шестнадцатеричными значениями, распечатать, выполнить знаковые и беззнаковые сдвиги, результат тоже распечатать ");

		//дальше програмный код
		System.out.println("Start");

		int c=0xA;
		int i=0xFFF0;
		System.out.println("c="+Integer.toString(c,16)+"\t  ("+Integer.toString(c,2)+")b");
		System.out.println("i="+Integer.toString(i,16)+"\t  ("+Integer.toString(i,2)+")b");
		c=c<<2;
		System.out.println("Знаковый сдвиг влево с<<2="+Integer.toString(c,16)+"\t  ("+Integer.toString(c,2)+")b");
		c=c>>2;
		System.out.println("Знаковый сдвиг вправо с>>2="+Integer.toString(c,16)+"\t  ("+Integer.toString(c,2)+")b");

		i=i<<2;
                System.out.println("Знаковый сдвиг влево i<<2="+Integer.toString(i,16)+"\t  ("+Integer.toString(i,2)+")b");
                i=i>>2;
		System.out.println("Знаковый сдвиг вправо i>>2="+Integer.toString(i,16)+"\t  ("+Integer.toString(i,2)+")b");
		i=i>>>2;
		System.out.println("Беззнаковый сдвиг вправо i>>>2="+Integer.toString(i,16)+"\t  ("+Integer.toString(i,2)+")b");

		//и наконец результат работы программы
		System.out.println("\n");
	}


}
