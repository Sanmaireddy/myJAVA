import java.util.Scanner;


public class array {
    public static Scanner sc = new Scanner(System.in);
    void  swap(int a,int b){
        int t=a;
        a=b;
        b=t;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args){
       // int a=4,b=5;
        array arr = new array();
       // arr.swap(a,b);
       // System.out.println(a+" "+b);
        int []a= new int [1];
        a[0]=sc.nextInt();
        cls(a);
        System.out.println(a[0]);
       int[] a1= new int[6];
        for(int i=0;i<a1.length;i++){
           a1[i]=sc.nextInt();
        }
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]); //sout+tab
        }
       // Arrays.sort(a1) ;
        //THE FOR-EACH LOOP
        //for(Obj value: dt){value}



    }

    public static void cls(int[] a){
        a[0]=8;
        System.out.println(a[0]);
    }

}
