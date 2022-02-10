public class StackImplementation {

    public class Node{
        private String data;
        private Node next;
        private Node(String data){
            this.data=data;
        }
    }
    private int size=0;
    private Node top;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean addNode(String s){
        Node tmp=new Node(s);
        size++;
        if(top==null){
            top=tmp;
            return true;
        }
        tmp.next=top;
        top=tmp;
        return true;
    }

    public boolean popNode(){
        if(top!=null){
            top=top.next;
            size--;
            return true;
        }

        return false;
    }

    public String[] viewElements(){
        String[] s= new String[size];
        Node tmp=top;
        for(int i=0;i<size;i++){
            s[i]= tmp.data;
            tmp=tmp.next;
        }

        return s;
    }

}
