public class CodeChallenge {

	public static void main(String[] args) {
		
		Test one = new Test(1);
		Test two = new Test(2);
		
		one.swap(one, two);
		
		System.out.println(one.а);
		System.out.println(two.а);
		
		TestXor oneXor = new TestXor(1);
		TestXor twoXor = new TestXor(2);

		TestXor.swap(oneXor, twoXor);
		System.out.println(oneXor.a);
		System.out.println(twoXor.a);

	}

}
