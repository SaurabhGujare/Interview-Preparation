public class Factorial {
    public static void main(String[] args){

        System.out.println(factorial(5));

    }

    private static int factorial(int N){
        if(N==0){
            return 1;
        }
        return factorial(N-1)*N;
    }
}
