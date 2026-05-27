class Node {
     int data ;
     Node next ;
      Node( int data){
        this.data = data ;
        this.next= null;
     }
}
 class Stack {
    Node head = null;

    public void push( int x){
        Node node = new Node(x);
        if ( head == null){
            head = node ;
        }else {
            node.next = head ;
            head = node ;
        }
    }
    public boolean empty() {

        if ( head== null){
            return true ;
        }else{
            return false;
        }
    }
    public  int pop( ){
        if ( empty()){
             return -1 ;
        }else{
            int val = head.data;
            head = head.next;
            return val ;
        }
    }
    public int top (){
        if ( empty()){
            return -1;

        }else{
            return head.data ;

        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(70);
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }


    
 }