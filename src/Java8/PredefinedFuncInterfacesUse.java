package Java8;
import java.util.function.*;
import java.util.*;
public class PredefinedFuncInterfacesUse {
	
	
	//Predicate, Functions, Consumer, Supplier
	
	public static void main (String args[]) {
		
		
		//1.predicate -> to check some boolean condn
		//abst method -> test
		
		Predicate<String> pred = s -> s.length()>3;
		System.out.println(pred.test("anugya"));
		
		
		//Predicate joining when we want to test multiple conditions together
		//AND,OR,NEGATE
		Predicate<String> pred1 = s -> s.length()>3;
		Predicate<String> pred2 = s -> s.length()>4;
		System.out.println(pred1.and(pred2).test("anugyaa"));
		
		
		//2. Function -> Predefined functional Interface that is used to apply changes to particular func
		
		Function<Integer, Integer> funcInterface1 = (i) -> (i*i);
		System.out.println(funcInterface1.apply(5));
		
		//functional chaining
		//andThen, compose
		
		Function<Integer, Integer> funcInterface2 = (i) -> (i+i);
		System.out.println(funcInterface2.apply(5));		
		System.out.println(funcInterface1.andThen(funcInterface2).apply(5));
		System.out.println(funcInterface1.compose(funcInterface2).apply(5));
		
		//3. Consumer -> which only accept and does not return anything
		
		Consumer<Integer> consume = (i) -> System.out.println(i);
		consume.accept(150);
		
		//consumer chaining -> only by andThen
		Consumer<Integer> consume1 = (i) -> System.out.println(i+i);

		consume.andThen(consume1).accept(100);
		
		//4. Supplier -> only supply does not accept
		Supplier<Date> sup = () -> new Date();
		System.out.println(sup.get());
		
		//since supplier does not accept anything, supplier chaining not possible


		
	}

}
