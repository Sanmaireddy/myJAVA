import java.util.Arrays;
public class binarysearch {
    public static void main(String[] args) {
        int array[]
                = { 4, 6, 10, 12, 18, 18, 20, 20, 30, 45 };
        int key = 5;
        Arrays.sort(array);
        System.out.println(lower_bound(array, key));
    }
    static  int lower_bound(int a[],int key){
        int n=a.length;
        int st=0,ed=n-1,mid;
        while (st<ed){
            mid=st+(ed-st)/2;
            if(key<=a[mid]) ed=mid;
            else st=mid+1;
        }
        if(st<a.length && a[st]<key)
            st++;
        return  a[st];
    }
}
