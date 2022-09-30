
public class NestedClass {
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.InnerClass1 in1 = out.new InnerClass1();
		System.out.println(in1.method11(5));
		OuterClass.InnerClass2 in2 = out.new InnerClass2();
		in2.method21(2);
	}
}
class OuterClass {
	int x;
	class InnerClass1 {
		int method11(int i) {
			x = i;
			return x;
		}
	}
	class InnerClass2 {
		void method21(int i) {
			x *= i;
			System.out.println(x);
		}
	}
}
