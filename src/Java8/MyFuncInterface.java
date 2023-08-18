package Java8;


@FunctionalInterface
public interface MyFuncInterface {

	
	//Functional interface is an interface with only one abstract function, it can have any number of static or default methods
	
	abstract void call();
	
	//used to add new methods to inteface without affecting the implementing classes
	default void print() {
		System.out.println("Hello from coder mish");
	}
	
	//created because we need not create object to it for calling
	//less expensive as inteface does not have constructor, static blocks..
	static void hello() {
		System.out.println("Hello developers");
	}
	
}
