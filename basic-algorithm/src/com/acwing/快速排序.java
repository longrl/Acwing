package com.acwing;

import java.util.Scanner;

public class 快速排序 {
    public void quick_sort(int A[], int l, int r) {
        if (l >= r) return;
        int x = A[l], i = l-1, j = r + 1;
        while (i < j) {
            while (A[++i] < x);
            while (A[--j] > x);
            if (i < j) swap(A, i, j);
        }
        quick_sort(A, l, j);
        quick_sort(A, j+1, r);
    }

    static void swap(int A[], int i, int j) {
        int temp;
        temp = A[j];
        A[j] = A[i];
        A[i] = temp;
    }

    public static void main(String[] args) {
        快速排序 sort = new 快速排序();
        Scanner cin = new Scanner(System.in);
        int n;
        n = cin.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = cin.nextInt();
        }
        sort.quick_sort(nums, 0, n-1);
        for (int x : nums) {
            System.out.print(x + " ");
        }

    }
}
