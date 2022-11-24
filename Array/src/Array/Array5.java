package Array;
import java.util.Scanner;
public class Array5 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int banyakData;
		
		System.out.print("Masukkan Banyak Data = ");
		banyakData = ricky.nextInt();
		System.out.println("");

		ricky.nextLine();
		//deklarasi array
		String [] nama = new String[banyakData];
		String [] npm = new String[banyakData];
		String [] prodi = new String[banyakData];
		String [] tahunMasuk = new String[banyakData];
		
		
		//mengisi data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.println("");
			System.out.println("Data Mahasiswa Ke-" + (i+1));
			
			System.out.print("Masukkan Nama \t= ");
			nama[i] = ricky.nextLine();
			System.out.print("Masukkan NPM \t= ");
			npm[i] = ricky.nextLine();
//			System.out.print("Masukkan Prodi \t= ");
//			prodi[i] = ricky.nextLine();
			
			if (npm[i].substring(4, 6).equals("24"))
			{
				prodi[i] = "SI";
			}	
			else if (npm[i].substring(4, 6).equals("25"))
			{
				prodi[i] = "TI";
			}
			
			if (npm[i].substring(0, 2).equals("21"))
			{
				tahunMasuk[i] = "2021";
			}	
			else if (npm[i].substring(0, 2).equals("22"))
			{
				tahunMasuk[i] = "2022";
			}	
		}
		
		System.out.println("");
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nama " + "\t" + "NPM" + "\t\t" + "Prodi" + "\t" + "Tahun Masuk");
		System.out.println("-------------------------------------------------");
		//menampilkan data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.println(nama[i] + "\t" + npm[i] + "\t" + prodi[i] + "\t" + tahunMasuk[i]);
		}	
		
	}
}
