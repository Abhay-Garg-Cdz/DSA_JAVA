package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayGame1535L {
    public static int getWinnerApproach1(int[] arr, int k) {
        if (k >= arr.length) {
            OptionalInt i = Arrays.stream(arr).max();
            return i.getAsInt();
        }
        int win_count = 0;
        int winner = arr[0];
        while (true) {
            if (arr[0] > arr[1]) {
                if (winner == arr[0]) {
                    win_count = win_count+1;
                    if(win_count == k) {
                        break;
                    }
                } else {
                    winner = arr[0];
                    win_count = 0;
                }
                int temp = arr[1];
                for (int i = 1; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
                // System.out.println("\nIn if condition ----");
                // Arrays.stream(arr).forEach(System.out::print);
            } else if (arr[0] < arr[1]) {
                winner = arr[1];
                win_count = 1;

                int temp1 = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp1;

                // System.out.println("\nIn else condition ----");
                // Arrays.stream(arr).forEach(System.out::print);
            }
        }
        return winner;
    }

    public static int getWinnerApproach2(int[] arr, int k) {
        if(k>=arr.length){
            Arrays.sort(arr);
            return arr[arr.length-1];
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    
        int win_count = 0;
        int an_counter = 1;
        while(true){
            if(list.get(0) > list.get(an_counter)){
                list.add(list.get(an_counter));
                win_count++;
                an_counter++;
                if(win_count == k){
                    break;
                }
            }

            else{
                list.add(0);
                list.subList(0,an_counter).clear();
                win_count = 1;
                an_counter = 1;
            }
        }
        return list.get(0);
    }

    public int getWinnerApproach3(int[] arr, int k) {
        int winner = arr[0];
        int wins = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (winner > arr[i])
                wins++;
            else {
                wins = 1;
                winner = arr[i];
            }
            
            if (wins == k)
                break;
        }
        
        return winner;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,7 };
        int win = getWinnerApproach2(arr, 2);
        System.out.println(win);

        // arr[0] = winner;

        // Arrays.stream(arr).forEach(System.out::print);



        // List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // list.add(1);
        // list.add(2);
        // list.subList(0, 2).clear();
        // System.out.println(list);
    }
}
