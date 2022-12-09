public class queue_with_circularLL {
    static class node{
        int val;
        node next;
    }
    static class  que{
        node frnt,rear;
    }
    static void enque(que q,int data){
        node temp= new node();
        temp.val=data;
        if(q.frnt==null){
            q.frnt=temp;
        }
        else q.rear.next=temp;
        q.rear=temp;
        q.rear.next=q.frnt;
    }
    static int deque(que q){
        if(q.frnt==null){
            return 0;
        }
        int data;
        if(q.frnt==q.rear){
            data=q.frnt.val;
            q.frnt=null;
            q.rear=null;
        }
        else{
            node temp=q.frnt;
            data=temp.val;
            q.frnt=q.frnt.next;
            q.rear.next=q.frnt;
        }
        return data;
    }
    static void  display(que q){
        node temp= q.frnt;
        while(temp.next!=q.frnt){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
    }


    public static void main(String[] args) {
        que q= new que();
        q.frnt=q.rear=null;
        enque(q,2);
        enque(q,9);
        enque(q,0);
        display(q);
    }
}
