import java.util.*;

public class inbulit {
    public static void main(String[] args) {

    }
    void stk(){
        Stack<Integer> s=new Stack<>();
        s.push(2);                   //.push(),.pop(),.peek(),.get(),.search(),.size(),.sort()
        s.push(4);
        s.push(9);
        System.out.println(s);
        s.pop();
        int a=s.search(2);
        System.out.println(s.peek());
        System.out.println(s.get(1));

        Iterator it = s.iterator();   //.next()--gives value @ that s
        while(it.hasNext()){
            Object s2= it.next();
            System.out.println(s2);
        }
    }

    void Que(){
        Queue<Integer> q=new LinkedList<>();
        //.add()
        //.remove()--head
        //.peek()
        //.size()
    }

    void ll(){
        LinkedList<Integer> l= new LinkedList<>();
        //.add(val)
        //.remove(index)
        Iterator it=l.iterator();
        //it.hasNext()
        //it.next()
    }

    //we can push all elements in a data struc to other by l.addAll(s);
    void set(){
        //Hash set,Enum set,LinkedHash set,tree set
        Set<Integer> st= new HashSet<Integer>();
        //.add(),.remove(value),
        //Iterator--.hasNext(),.next()
        //can access through for each loop
    }

    void map(){
        //hsh,linkedhsh,tree
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
        hm.put(1,1);
        //traversing through map
        for (Map.Entry<Integer, Integer> me : hm.entrySet()) {}
               //me.getKey()---me.getValue()
    }

}
