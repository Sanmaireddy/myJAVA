public class addtwonums {
    static node h1,h2;
    static class node{
        int val;
        node next;
        node(int d){val=d;next=null;}
    }
    void add(node a,node b){
        node a1 = new node(0),b1=new node(0);
        a1.next=a;b1.next=b;
        equaldigits(a1,b1);
        node res =new node(0);
        if(sum(a1,b1,res)==1){
            node nd=new node(1);
            nd.next=res.next;
            res.next=nd;
        }
        printList(res.next);
    }
    int sum(node a,node b,node res){
        if(a==null) return 0;
        int num=a.val+b.val+sum(a.next,b.next,res);
        node nd=new node(num%10);
        nd.next=res.next;
        res.next=nd;
        return  num/10;
    }
    void equaldigits(node a,node b){
        node a1=a.next,b1=b.next;
        while(a1!=null && b1!=null){
            a1=a1.next;b1=b1.next;
        }
        if(a1==null && b1!=null){
            while(b1!=null){
                node nd=new node(0);
                nd.next=a.next;a=nd;
                b1=b1.next;
            }
        }
        else if(a1!=null && b1==null){
            while(a1!=null){
                node nd=new node(0);
                nd.next=b.next;b=nd;
                a1=a1.next;
            }
        }
    }
    void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
       // LinkedList<Integer> l1,l2=new LinkedList<>();
       addtwonums op=new addtwonums();
       op.h1=new node(9);
       op.h2=new node(9);
       op.add(h1,h2);

    }
   /* static LinkedList<Integer> add(LinkedList<Integer> l1,LinkedList<Integer> l2){
        LinkedList<Integer> res= new LinkedList<>();
        equaldigits(l1,l2);


    }

    static  void equaldigits(LinkedList<Integer> l1,LinkedList<Integer> l2){
        Iterator it1=l1.iterator(),it2=l2.iterator();
        while(it1.hasNext() && it2.hasNext()){
            it1.next();
            it2.next();
        }
        if(!it1.hasNext() && it2.hasNext()){
            while(it2.hasNext()){
                l1.addFirst(0);
                it2.next();
            }
        }
        else{
            while (it2.hasNext()){
                l2.addFirst(0);
                it2.next();
            }
        }
    }*/
}
