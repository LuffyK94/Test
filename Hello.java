public class Hello {

    public static void main(String[] args) {

       /*Queue*/
        Queue queue= new Queue();
        queue.AddNode(1);
        queue.AddNode(2);
        queue.AddNode(3);
        queue.AddNode(4);
        queue.AddNode(5);

        System.out.println(queue.popNode());

        /*Stack*/
//        Stack1 stack = new Stack1();
//
//        System.out.println(stack.peek());
//        stack.addNode(1);
//        stack.addNode(2);
//        stack.addNode(3);
//        stack.addNode(4);
//        stack.addNode(5);
//        stack.addNode(6);
//        stack.addNode(7);
//        stack.addNode(8);
//        System.out.println(stack.pop());



    }

    public static class Queue{
        private Node head;
        private Node tail;
        private class Node{
            private int data;
            private Node next;
            private Node(int data){
                this.data=data;
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


        public void AddNode(int data){

            Node node = new Node(data);
            if(head ==null){
                System.out.println(node.data+" added");
                head=node;
                tail = node;
                return;
            }
                System.out.println(node.data+" added");
                tail.next = node;
                tail=node;

        }
    }



}
