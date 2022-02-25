package week1.day1;

public class Findintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array1[] = {3,2,11,4,6,7};
		int Array2[] = {1,2,8,4,9,7};
		for (int i =0; i<=Array1.length-1; i++)
		{
			for (int j = 0; j<=Array2.length-1; j++)
			{
				if(Array1[i]==Array2[j])
				{
					System.out.println("Both Array common value : "+ Array1[i]+":"+Array2[j]);
				}
			}
		}
	}



	

}
