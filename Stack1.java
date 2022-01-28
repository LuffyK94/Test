public class Stack1 {

    private class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data=data;
        }
    }
    private Node top;

    public int peek(){
        if(top == null){
            System.out.println("No data");
            return 0;
        }
        return top.data;
    }

    public void addNode(int data){
        Node node = new Node(data);
        if(top ==null){
            top=node;
            return;
        }
//        Node temp = top;
//        top=node;
//        node.next=temp;
        node.next=top;
        top=node;

    }

    public int pop(){
        if(top==null){
            System.out.println("no data");
            return 0;
        }
        int popped;
        popped = top.data;
        top=top.next;
        return popped;
    }

}
