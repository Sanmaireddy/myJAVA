import java.util.Stack;

public class nextgreaterelestk {
    public static void main(String[] args) {
        int a[]={1,10,3,5,23,6,27};
        Stack<Integer> stk= new Stack<>();
        int n=a.length,i=0;
        while(i<n){
            if(stk.empty() || stk.peek()>=a[i]){
                stk.push(a[i]);
            }
            else{
                while(!stk.empty() && stk.peek()<a[i]){
                    System.out.println("NGE of "+stk.peek()+" is "+a[i]);
                    stk.pop();
                }
                stk.push(a[i]);
            }
            i++;
        }
    }
}
