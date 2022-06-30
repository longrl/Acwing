package com.acwing;

import java.util.*;

class Seg {
    int l;
    int r;
    public Seg(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

public class 区间选点 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        Seg[] segs = new Seg[n];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            segs[i] = new Seg(l, r);
        }

        Arrays.sort(segs, new Comparator<Seg>() {
            @Override
            public int compare(Seg o1, Seg o2) {
                return o1.r - o2.r;
            }

        });

        int p = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (segs[i].l > p) {
                p = segs[i].r;
                res++;
            }
        }
        System.out.print(res);
    }
}