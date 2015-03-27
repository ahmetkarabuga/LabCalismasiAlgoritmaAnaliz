/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekizvezir;

import java.util.Random;

public class SekizVezirRecursive {
    
    
    
    
    
    public static boolean isConsistent(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n])             return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
        }
        return true;
    }

    public static void printQueens(int[] q) {
        int N = q.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (q[i] == j) System.out.print("Q ");
                else           System.out.print("* ");
            }
            System.out.println();
        }  
        System.out.println();
    }

    public static void enumerate(int N) {
        int[] a = new int[N];
        enumerate(a, 0);
    }

    public static void enumerate(int[] q, int n) {
        int N = q.length;
        if (n == N) printQueens(q);
        else {
            for (int i = 0; i < N; i++) {
                if (n==0){
                    Random rnd = new Random();
                    int sayi = rnd.nextInt(8);
                    q[n] = sayi;
                    if (isConsistent(q, n)) enumerate(q, n+1);
                } else {
                q[n] = i;
                if (isConsistent(q, n)) enumerate(q, n+1);
                }
            }
        }
    }  

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//
//    public static int[][] tahta = {{0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}};
//    private static int a;
//    private static int a1;
//    private static int a2;
//
//    public static void yerlestir(int abc) {
//        if (abc == 0) {
//            Random rnd = new Random();
//            int sayi = rnd.nextInt(8);
//            tahta[sayi][abc] = 1;
//            abc = 1;
//        }
//        for(int m=abc;m<8;m++){
//                for(int n=0;n<8;n++){
//                    tahta[n][m]=0;
//                }
//            }
//        for (int i = 0; i < 8;i++) {
//            tahta[i][abc] = 1;
//            
//            for (int s = 0; s < 8; s++) {
//                for (int j = 0; j < 8; j++) {
//                    System.out.print(tahta[s][j] + "  ");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//            sol(i, abc);
//            solUst(i, abc);
//            solAlt(i, abc);
//            
//            if (abc < 7) {
//                System.out.println(abc);
//                if (a == 0 && a1 == 0 && a2 == 0) {
//                    abc++;
//                    yerlestir(abc);
//                } else {
//                    a=a1=a2=0;
//                
//                }
//            } else {
//                a=a1=a2=0;
//                tahta[i][abc] = 0;
//                for (int s = 0; s < 8; s++) {
//                    for (int j = 0; j < 8; j++) {
//                        tahta[i][j]=0;
//                    }
//                }
//                yerlestir(0);
//            }
//            tahta[i][abc] = 0;
//        }
//
//    }
//
//    private static void sol(int y, int x) {
//        while (x > 0) {
//            x--;
//            if (tahta[y][x] == 1) {
//                a++;
//            }
//        }
//    }
//
//    private static void solUst(int y, int x) {
//        while (y > 0 && x > 0) {
//            x--;
//            y--;
//            if (tahta[y][x] == 1) {
//                a1++;
//            }
//        }
//    }
//
//    private static void solAlt(int y, int x) {
//        while (y < 7 && x > 0) {
//            x--;
//            y++;
//            if (tahta[y][x] == 1) {
//                a2++;
//            }
//        }
//    }
}
