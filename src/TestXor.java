public class TestXor {

	int a;
	TestXor(int i) { a=i; }
	
	static void swap (TestXor object1, TestXor object2){
		object1.a ^= object2.a;
		object2.a ^= object1.a;
		object1.a ^= object2.a;
	}
}
