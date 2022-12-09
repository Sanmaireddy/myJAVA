import java.util.Scanner;

public class sortingalgos {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        sortingalgos ob = new sortingalgos();
        ob.qsort(arr,0,arr.length-1);
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    //insert sort
    void insersort(int a[]){
       int n=a.length;
       for(int i=1;i<n;i++){
           int temp=a[i];
           for(int j=i;j>0;j--){
               if(temp<a[j-1]){
                   a[j]=a[j-1];
               }
               else{
                   a[j]=temp;
                   break;
               }
           }
           if(a[0]>temp){
               a[0]=temp;
           }
       }
    }

    //flagged bsort
    void bsort(int a[]){
        int n=a.length;
        boolean sw;
        for(int i=n-1;i>0;i--){
            sw=false;
            for(int j=0;j<i;j++){
                if(a[j+1]<a[j]){
                    sw=true;
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
            if(sw==false) break;
        }
    }

    //merge sort
    void msort(int a[],int st,int ed){
        if(st<ed){
            int mid= st+ (ed-st)/2;
            msort(a,st,mid);
            msort(a,mid+1,ed);
            merge(a,st,mid,ed);
        }
    }

    void merge(int a[],int st,int mid,int ed){
        int s1=mid-st+1;
        int s2=ed-mid;
        int left[]=new int[s1],right[]=new int [s2];
        for(int i=0;i<s1;i++) left[i]=a[i+st];
        for(int j=0;j<s2;j++) right[j]=a[j+mid+1];

        int i=0,j=0;
        int k=st;
        while(i<s1 && j<s2){
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
            }
            else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<s1){
            a[k]=left[i];
            i++;k++;
        }
        while(j<s2){
            a[k]=right[j];
            j++;k++;
        }
    }
    void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    // qsort
    void qsort(int a[],int st,int ed){
        if(st<ed){
            int divi= div(a,st,ed);
            qsort(a,st,divi-1);
            qsort(a,divi+1,ed);
        }
    }

    int div(int a[],int st,int ed){
        int piv=a[ed];
        int i=st-1;
        for(int j=st;j<=ed-1;j++){
            if(a[j]<piv){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,ed);
        return  i+1;
    }
}
