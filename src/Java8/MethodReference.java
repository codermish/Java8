package Java8;

//Method Reference is an alternative of Lambda expression
//Targets code reusability
//So if we have a method whose implementation we want to use for abstract mathod of Functional interface then go for method reference
public class MethodReference {
	
	public static void main(String[] args) {

		
	MyFuncInterface myFunc = Test :: getTest;
	
	myFunc.call();
		
		
	}

}
