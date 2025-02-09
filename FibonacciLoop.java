public class FibonacciLoop {
    public static void main(String[] args) {
        int n = 10;  // Number of Fibonacci terms we want
       
        for (int i = 0, first = 0, second = 1, next; i < n; i++, first = second, second = next) {
            System.out.print(first + " ");
            next = first + second;
        }
        
    }
}
