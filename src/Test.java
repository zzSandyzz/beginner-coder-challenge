
public class Test {

	int а;
	Test(int i) { а=i; }
	
	void swap (Test object1, Test object2){
		
		int temp;
		temp = object1.а;
		object1.а = object2.а;
		object2.а = temp;
	}
}
