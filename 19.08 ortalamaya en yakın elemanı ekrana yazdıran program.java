public class Main{	public static void main(String[] args) {        //         0  1  2  3   4  5   6   7  8   9        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};        int i, size, p, k, n, avg, minDif, tempDif, sum;        size = 10;        sum = 0;                for (i = 0; i < size; i = i + 1)            sum = sum + a[i];        avg = sum / size;                n = a[0];        minDif = avg - a[0];        if (minDif < 0)            minDif = -minDif;                for (i = 1; i < size; i = i + 1) {                tempDif = avg - a[i];            if (tempDif < 0)                tempDif = -tempDif;            if (tempDif < minDif){                n = a[i];                minDif = tempDif;            }             }                            System.out.print("ortalama: " + avg + " en yakın eleman: " + n);    }    }	