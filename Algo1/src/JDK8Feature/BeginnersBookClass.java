package JDK8Feature;
import java.util.function.IntBinaryOperator;
//https://beginnersbook.com/2017/10/java-functional-interfaces/

/*@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
}*/
public class BeginnersBookClass {

   public static void main(String args[]) {
        // lambda expression
	   IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.applyAsInt(12, 100));
    }
}
