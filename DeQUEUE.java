class Node{
    int data ;
    Node next ;
     Node(int data){
        this.data = data;
        this.next = null;
     }
}

public class DeQUEUE {
   Node head = null;
   Node tail = null;
   int size =0 ;

   public boolean empty() {

      if ( head== null){
          return true ;
      }else{
          return false;
      }
     
  }
   public void addfirst( int x){
       Node node = new Node(x);
       if ( head == null){
           head = node ;
       }else {
           node.next = head ;
           head = node ;
       }
       size++;
   }
   void addlast(int x){
      Node node = new Node(x);
      if(head == null){
          head = node;
          tail = node;
      }else{
          tail.next = node;
          tail = node;
      }
      size++;
  } 
   public  int deletefirst( ){
       if ( empty()){
            return -1 ;
       }else{
           int val = head.data;
           head = head.next;
           if ( head == null){
            tail = null ;
           }
           size -- ;
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
   public int last (){
      if ( empty()){
         return -1;
      }else{
         return tail.data;
      }
   }   

   public int removelast(){
       Node temp = head;
      if ( empty()){
         return -1 ;
      }else {
        while (temp.next != tail) {
        temp=temp.next;
        }
        int val = tail.data;
        temp = tail ;
        temp.next =null;
        return val;
      }
   }
}
