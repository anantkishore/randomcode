package com.kishore.anant.dp;

public class FibonacciSeries {

    /*

    fib(0) = 0
    fib(1) = 1
    fib(n) = fib(n-1) + fib(n-2) n > 1

    0,1,1,2,3,5
    0,1,2,3,4,5
     */
    public static void main(String[] args) {
        int result = fib(100);
        System.out.println("count::"+ count);
        System.out.print(result);
    }
    static int count = 0;
    private static int fib(int N) {
        count++;
        int[] arr = new int[N+1]; //  0,0,0,0,0,0
        arr[1] = 1;                // 0,1,0,0,0,0
        int result = -1;
        if(N == 0){
            result = arr[0];
        }
        else if(N == 1){
            result = arr[1];
        } else if (N > 1) {
            for (int i = 2; i <= N; i++) {  // 2,3,4,5
                int leftResult = 0;         // 0,1,1,2,3,5
                int rightResult = 0;
                if(arr[i-1] > 0){
                    leftResult = arr[i-1];
                }
                if(arr[i-2] > 0 || i == 2){
                    rightResult = arr[i-2];
                }
                arr[i] = leftResult + rightResult;
            }
            result = arr[N];
        }
        return result;
    }

    /*

fib(2) -> fib(1) + fib(0)
fib(3) -> fib(2) + fib(1)
fib(2) -> fib(1) + fib(0)
fib(2) -> fib(1) + fib(0) -> 1 + 0 -> 1
fib(3) -> 1 + 1 -> 2
fib(4) -> 2 + fib(2)

fib(5) -> fib(4) + fib(3)
     */


}
