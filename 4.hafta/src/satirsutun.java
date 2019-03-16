import java.util.Scanner;

public class satirsutun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] satir= {"1" , "2" , "3"};
		String [] sutun= {"A" , "B" , "C" , "D"};
		String [] [] satirsutundizisi=new String [satir.length][sutun.length];
		
		for (int i = 0; i < satir.length; i++) {
			for (int j = 0; j < sutun.length; j++) {
				satirsutundizisi[i][j]=sutun[j]+satir[i];
			System.out.print(satirsutundizisi[i][j] + " | ");
			
			}
			System.out.println();
		}
		
		
		
	}

}
