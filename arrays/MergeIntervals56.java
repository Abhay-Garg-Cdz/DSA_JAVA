package arrays;

import java.util.*;
public class MergeIntervals56 {
    

    // Passed 68 tests on leetcode
    // not passed [[1,4],[1,5]] -> ans ->[1,5] but inthis soln is [1,4]
    public static int[][] mergeApp1(int[][] intervals) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0;i<intervals.length;i++){
            Arrays.sort(intervals[i]);
        }

        quickSort(intervals, 0, intervals.length-1);


        int [] temp_interval = {intervals[0][0],intervals[0][1]};
        for(int i = 0;i<intervals.length-1;i++){
            int temp = intervals[i+1][0];
            if(temp_interval[1]>=temp){
                temp_interval[1] = intervals[i+1][1];
            }
            else {
                ArrayList<Integer> l = new ArrayList<Integer>();
                l.add(temp_interval[0]);
                l.add(temp_interval[1]);
                list.add(l);
                temp_interval = intervals[i+1];
            }
        }

        System.out.println(list);
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(temp_interval[0]);
        l.add(temp_interval[1]);
        list.add(l);


        int[][] intv = new int[list.size()][2];

        for(int i = 0;i<intv.length;i++){
            ArrayList<Integer> a= list.get(i);
            intv[i][0] = a.get(0);
            intv[i][1] = a.get(1);
        }
        // System.out.println(list);
        return intv;
    }

	
	static void swap(int[][] arr, int i, int j){
		int[] temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
    }
	static int partition(int[][] arr, int low, int high)
	{
		int pivot = arr[high][0];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j][0] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	static void quickSort(int[][] arr, int low, int high)
	{
		if (low < high) {
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	

    //Using compare of Arrays.sort
    public static int[][] mergeApp2(int[][] intervals) {
        if(intervals.length <= 1)
             return intervals;
         
         Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
         
         List<int[]> result = new ArrayList<>();
         int[] newInterval = intervals[0];
         result.add(newInterval);
         for(int[] interval : intervals){
             if(newInterval[1] >= interval[0])
                 newInterval[1] = Math.max(newInterval[1], interval[1]);
             else{
                 newInterval = interval;
                 result.add(newInterval);
             }
         }
         return result.toArray(new int[result.size()][]);
 }
    public static void main(String[] args) {
        
        int [][] intervals = {{1,4},{1,5}};
        mergeApp2(intervals);

    }
}
