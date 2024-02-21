//Program to implement Recursion (Example of factorial).
public class Fact {
    static int Factorial(int n){
        if(n == 1|| n==0){
            return 1;
        }
        else
        {
            int factorial = Factorial(n-1);
            return n*factorial;
        }

    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));

    }

}
