package Array;
import java.util.Scanner;
public class Array3 
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
		
		
		//mengisi data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.println("Nama ke-" + i + " = ");
			nama[i] = ricky.nextLine();
		}
		
		
		//menampilkan data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.println("Nama ke-" +  (i+1) + " = " + nama[i]);
		}	
		
	}
}
