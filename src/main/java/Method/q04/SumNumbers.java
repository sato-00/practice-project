package Method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 3;
		int b = 2;
		int sum =calculateSum(a,b);
		System.out.println("第一引数:" + a);
		System.out.println("第二引数:" + b);
		System.out.println("加算結果:" + sum);
	}

	public static int calculateSum(int a, int b) {
		int sum=a+b;
		return sum;
	}
}

//	 calculateSum(3,2);
//}
//public static void calculateSum(int a,int b) {
//	int sum = a + b;
//	System.out.println("第一引数:"+ a);
//	System.out.println("第二引数:"+ b);
//	System.out.println("加算結果:"+ sum);
//}

//int sum = calculateSum(3, 2);
//
//	public static int calculateSum(int firstArg, int secondArg) {
//		int result = firstArg + secondArg;
//
//		System.out.println("第一引数:" + firstArg);
//		System.out.println("第二引数:" + secondArg);
//		System.out.println("加算結果:" + result);
//		return result;
