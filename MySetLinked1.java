import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySetLinked1 implements Set {

    private int size=0;

    public class Node{
        private Object data;
        private Node next;
        private Node(Object data){
            this.data=data;
        }
    }

    private Node head;
    private Node tail;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        Node tmp=head;
        while(tmp!=null){
            if(tmp.data==o){
                return true;
            }
            tmp=tmp.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(!contains(o)){
            Node tmp= new Node(o);
            if(head==null){
                head=tmp;
                tail=tmp;
                size++;
                return true;
            }
            tail.next=tmp;
            tail=tmp;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if(contains(o)){
            Node tmp = head;
            Node prev=null;
            while(tmp!=null){
                if(tmp.data==o && head.data==o){
                    head=head.next;
                    size--;
                    return true;
                }
                if(tmp.data==o){
                    tmp=tmp.next;
                    prev.next=tmp;
                    size--;
                    return true;
                }
                prev=tmp;
                tmp=tmp.next;
            }
        }
        return false;
    }

    public Object[] viewElements(){
        Node tmp=head;
        Object[] os= new Object[size];
        for(int i=0;i<size;i++){
            os[i]=tmp.data;
            tmp=tmp.next;
        }
        return os;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
