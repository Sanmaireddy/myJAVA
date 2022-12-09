public class LinkedsList {
      node head;
      int a=3;
      class node{
          int val;
          node next;
          node(int data){val=data;next=null;}
      }

      void insertnodesorted(int data){
          System.out.println(a);
          node temp= new node(data);
          node ptr=head;
          if(ptr==null){ head=temp;return;}
          if(ptr.next==null) {if(ptr.val>data){temp.next=head;head=temp;return;} else{head.next=temp;return;} }
          if(ptr.val>data){temp.next=ptr;head=temp;return;}
          while(ptr.next.val>data){
              ptr=ptr.next;
          }
          temp.next=ptr.next.next;
          ptr.next=temp;
      }

      void del(int data){
          node ptr=head,prev=null;
          if(ptr!=null && ptr.val==data){head=ptr.next;return;}
          while (ptr!=null && ptr.val==data){
              prev=ptr;
              ptr=ptr.next;
          }
          if(ptr==null) return;
          prev.next=ptr.next;
      }

    public static void main(String[] args) {
      //  System.out.println(a);
        LinkedsList ll=new LinkedsList();
        ll.insertnodesorted(3);
        ll.insertnodesorted(8);
        ll.insertnodesorted(1);
        ll.insertnodesorted(0);
        ll.printList();
        ll.del(0);
        ll.printList();
    }

    public void printList()
    {
        node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.val+" ");
            tnode = tnode.next;
        }
    }
}
