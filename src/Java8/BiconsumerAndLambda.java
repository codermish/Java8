package Java8;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
public class BiconsumerAndLambda {

	public static void main(String[] args) {
		
//lambda expression
//anonymous func with no func name, return type and access modifier		
//lambda expression and biconsumer
//BiConsumer is predefined fi which only accepts and does not return anything
		
BiConsumer<Integer, Integer> biCom = (a,b) -> System.out.print(a+b);
biCom.accept(10, 20);


	}

}



