package assignment.W1D2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int firstNum=0, secondNum =1, sum=0;

		System.out.print(firstNum+" "+secondNum+" ");

		for(int i=0; i<=11; i++)

		{

			sum = firstNum + secondNum;

			firstNum = secondNum;

			secondNum = sum;

			System.out.print(sum+" ");

		}

	}
}