package com.kishore.anant.java;

import java.math.BigInteger;
import java.util.*;

public class Solution {
    static List<Employee> employeeList = new ArrayList<>();

    static{
        employeeList.add(new Employee(1, "anant", 18, 10000, 9035));
        employeeList.add(new Employee(3, "kishore", 20, 200, 903534));
    }









    public static List<BigInteger> getFibonacciAndDivisibleNumbers(int N, int n){

        List<BigInteger> fibonaccis = new ArrayList<BigInteger>();
        List<BigInteger> results = new ArrayList<BigInteger>();

        if(N>0){
            fibonaccis.add(new BigInteger(String.valueOf(0)));
        }
        if(N > 1){
            fibonaccis.add(new BigInteger(String.valueOf(1)));
        }
        if( N > 2){
            for(int i =2; i < N; i++){
                fibonaccis.add(fibonaccis.get(i-1).add(fibonaccis.get(i-2)));
            }
        }

        for(BigInteger i: fibonaccis){
            if(i.doubleValue()%n == 0){
                results.add(i);
            }
        }

        results.remove(0);

        return results;

    }

    public static void main(String[] args) {


        int N = 100;
        int n = 13;
        List<BigInteger> nums = getFibonacciAndDivisibleNumbers(N, n);

        System.out.println(nums.toString());






/*


        int[] arr = {1,2,3,4,5,6,1,4,3,2,1};

        HashMap<Integer, Integer> digitFreqMap = new HashMap<>();

        for (int i: arr){
            if(!digitFreqMap.containsKey(i)){
                digitFreqMap.put(i, 1); // 1,1
            }
            else{
                int freq = digitFreqMap.get(i);
                digitFreqMap.put(i, freq+1);
            }
        }

        int max_freq = 0;
        int max_digit = 0;
        for (Map.Entry<Integer, Integer> entry: digitFreqMap.entrySet()){
            int digit = entry.getKey();
            int frequency = entry.getValue();
            if(frequency > max_freq){
                max_digit = digit;
                max_freq = frequency;
            }
        }

        System.out.println(max_digit);


/*

        Animal dog = new Dog();
        System.out.println(dog.id);
        dog.id = 1;
        System.out.println(dog.id);
        dog.sleep();
        dog.speak();
        dog.wakesup();

        Animal cat = new Cat();
        System.out.println(cat.id);
        cat.id = 1;
        System.out.println(cat.id);
        cat.sleep();
        cat.speak();
        cat.wakesup();







        Employee employee = Optional.ofNullable(getEmployee("kishore")).orElse(new Employee(3, "kishore", 20, 200, 903534));

        System.out.println(employee.salary);

        employee.incrementSalary(10);
        employee.incrementSalary("manager");
        employee.incrementSalary(1);


        System.out.println(employee.salary);


        /*int[] arr = {1,2,3,4,5,6,7,8,98,102};

        int result = Arrays.stream(Arrays.stream(arr)
                .filter(i -> {
                    return (i % 2 == 0);
                })
                .toArray()).filter(a->{
                    return a < 100 && a >0;
        }).max().getAsInt();

        System.out.println(result);*/

        /*
        int[] even = new int[arr.length];
        System.out.println(Arrays.toString(even));
        int j = 0;
        for (Integer i: arr){
            if(i%2 == 0){
                even[j++] = i;
            }
        }
        System.out.println(Arrays.toString(even));
        int max = Integer.MIN_VALUE;
        for(Integer i: even){
            if(max < i){
                max = i;
            }
        }
        System.out.println(max);*/
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (Integer i: arr){
            System.out.println(i);
        }*/



        //for (Employee employee: Solution.employeeList)
          //  System.out.println(employee.toString());

        //System.out.println(employeeList.toString());

        //Animal dog = new Dog();
        //dog.sleep();*/

    }

    // returns employee if name is found in employee list, else null
    public static Employee getEmployee(String name){
        for (Employee employee: Solution.employeeList){
            if(employee.name.equalsIgnoreCase(name)){
                return employee;
            }
        }
        return null;
    }
}
