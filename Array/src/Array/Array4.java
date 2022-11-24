package Array;
import java.util.Scanner;
public class Array4 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int banyakData;
		
		System.out.print("Masukkan Banyak Data = ");
		banyakData = ricky.nextInt();

		ricky.nextLine();
		//deklarasi array
		String [] nama = new String[banyakData];
		String [] npm = new String[banyakData];
		String [] prodi = new String[banyakData];
		
		
		//mengisi data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.print("Masukkan Nama \t= ");
			nama[i] = ricky.nextLine();
			System.out.print("Masukkan NPM \t= ");
			npm[i] = ricky.nextLine();
			System.out.print("Masukkan Prodi \t= ");
			prodi[i] = ricky.nextLine();
		}
		
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nama " + "\t" + "NPM" + "\t" + " Prodi");
		System.out.println("-------------------------------------------------");
		//menampilkan data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.println(nama[i] + "\t" + (npm[i] + "\t" + (prodi[i])));
		}	
		
	}
}
