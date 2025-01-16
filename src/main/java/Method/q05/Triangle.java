package Method.q05;

public class Triangle {
	
	public static void main(String[] args) {
		int base = 8;
		int hight = 5;
		int area = getTriangleArea(base, hight);
		System.out.println("底辺:" + base);
		System.out.println("高さ" + hight);
		System.out.println("三角形の面積" + area);
	}
	public static int getTriangleArea(int base, int hight) {
		int area= (base*hight)/2;
		return area;
	}
	
}
