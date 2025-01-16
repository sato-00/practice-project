package Method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 10;
		String result = checkEven(num);
		System.out.println(result);
	}

	public static String checkEven(int num) {
		if (num % 2 == 0) {
			return num + "は偶数です。";
		} else {
			return num + "は奇数です。";
		}

	}
}

//return numがreturn resultでは間違いな理由は何か。

//int num = 5;
//if ((num % 2) == 0)
//	System.out.println(num + "は偶数です。");
//else
//	System.out.println(num+"は奇数です。");