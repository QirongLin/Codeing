# Codeing

Given an array of meeting time intervals where intervals[i] = [start_i, end_i],determine if a person could attend all meetings.

Input: meetings = [[0, 30], [5, 10], [15, 20]].
Output: false.


Test case:
int[][] test1 = {{0, 30}, {5, 10}, {15, 20}};
int[][] test2 = {{25, 55}, {10, 25},{0, 30}, {5, 10}, {5, 20}};
int[][] test3 = {{5,10}};
int[][] test4 = {{0, 5}, {5, 10}, {15, 20}};
        
Test output:
false
false
true
true
