package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    //Given an array of meeting time intervals where intervals[i] = [start_i, end_i],
    // determine if a person could attend all meetings.
    //
    //Input: meetings = [[0, 30], [5, 10], [15, 20]]
    //Output: false

    //Assume: start_i and end_i are both within [0,60);
    public static void main(String[] args) {
        int[][] test1 = {{0, 30}, {5, 10}, {15, 20}};
        int[][] test2 = {{25, 55}, {10, 25},{0, 30}, {5, 10}, {5, 20}};
        int[][] test3 = {{5,10}};
        int[][] test4 = {{0, 5}, {5, 10}, {15, 20}};
        System.out.println(attendAllMeetings(test1));
        System.out.println(attendAllMeetings(test2));
        System.out.println(attendAllMeetings(test3));
        System.out.println(attendAllMeetings(test4));
    }
    public static boolean attendAllMeetings(int[][] intervals) {
        //Sanity Check
        if(intervals == null || intervals.length <= 1) {
            return true;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));   //sort the intervals by starting time
        for(int i = 1;i<intervals.length;i++) {
            if (intervals[i-1][1] > intervals[i][0]) {        //ending time later than starting time of next meetings
                    return false;
                }
        }
        return true;
    }
}
