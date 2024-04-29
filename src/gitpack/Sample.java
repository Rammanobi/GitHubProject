package gitpack;

class AdditionExample {
	public int add(int x, int y,int z) {
		int sub=x-y-z;
		return sub;
	}
}

public class Sample {
	public static void main(String[] args) {
		AdditionExample obj = new AdditionExample();
		int result=obj.add(10, 20,30);
		System.out.println("Sum of two numbers:"+result);
	}
}
