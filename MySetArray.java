import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySetArray implements Set {
    private int size=0;
    private Object[] obj= new String[size];

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
        for(int i=0;i<size;i++){
            if(obj[i]==o){
                return true;
            }
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
            if(size==obj.length)
                resize(size+1);
            obj[size]=o;
            size++;
            return true;
        }
        return false;
    }

    private void resize(int size1){
        Object os[]=new String[size1];
        for(int i=0; i<this.size;i++){
            os[i]=obj[i];
        }
        obj=os;
    }

    @Override
    public boolean remove(Object o) {
        if(contains(o)){
            for(int i=0; i<size;i++){
                if(obj[i]==o){
                    for(int j=i; j<size-1; j++){
                        obj[j]=obj[j+1];
                    }
                    size--;
                    resize(size);
                    return true;
                }
            }
        }
        return false;
    }

    public Object[] viewElements(){
        return obj;
    }

    @Override
    public boolean addAll(Collection c) {
        for(Object os :c){
            if(!contains(os)){
                add(os);
            }
        }
        return true;
    }

    @Override
    public void clear() {
        size=0;
        resize(0);

    }

    @Override
    public boolean removeAll(Collection c) {
        for(Object os:c){
            if(contains(os)){
                remove(os);
            }
        }
        return true;
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
