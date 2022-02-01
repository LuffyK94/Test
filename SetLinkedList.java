public class SetLinkedList {

    public class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data=data;
        }
    }

    private Node head;
    private Node tail;

    public boolean addNode(int x){
        Node n = new Node(x);
        if(head==null){
            head=n;
            tail=n;
            return true;
        }
        if(!contains(x)){
            tail.next=n;
            tail=n;
            return true;
        }

        return false;
    }

    public boolean contains(int x){
        Node current = head;
        while(current.next!=null){
            if(current.data==x){
                return true;
            }
            else{
                current = current.next;

            }
        }

        return false;
    }

    public void viewData(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public int popNode(){
        if(head==null){
            System.out.print("No data");
            return 0;
        }
        int popped;
        popped = head.data;
        head=head.next;
        return popped;
    }

    public static void main(String[] args){
        SetLinkedList setLinkedList = new SetLinkedList();

        setLinkedList.addNode(1);
        setLinkedList.addNode(2);
        setLinkedList.addNode(1);
        setLinkedList.addNode(3);
        setLinkedList.addNode(2);
        setLinkedList.addNode(4);
        setLinkedList.addNode(2);

        setLinkedList.viewData();
        setLinkedList.popNode();
        System.out.println("");
        setLinkedList.viewData();
    }
}
