class node{
  int data;
  node next;

  node(int data){
    this.data = data;
    this.next = null;

  }

}
 
public class linkedlist {
  public static void main(String[] args) {
    node n1 = new node(5);
    node n2 = new node(6);
    node n3 = new node(8);
    node n4 = new node(9);
 
    node head = n1;
    head.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = null;

  

   

    // inserting a new node at beggining

    node newnode = new node(1);
    newnode.next = head;
    head = newnode;

    
    // insert at end

    node newnode1 = new node(0);
    node temp = head;

    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newnode1;


    // delete at begging

    head = head.next;

    // detele at end 

    temp = head;
    while(temp.next.next != null){
      temp = temp.next;
    }
    temp.next = null; 

    // inserting at middle i am adding after 6

    int k = 9;
    node newnode2 = new node(7);
    temp = head;

    

    while(  temp != null && temp.data != k ){
      temp = temp.next;

    }
    if(temp != null){
    newnode2.next = temp.next;
    temp.next = newnode2;
    }


   
    // delete node at specific       not understanding any thing learn againnnnnnnnnnnnnn

    int d = 99;
     
    temp = head;
    while(temp.next != null && temp.next.data != d){
      temp = temp.next;
    }
    if(temp.next != null){
    temp.next = temp.next.next;
    }
    temp = head;
     while(temp != null){
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");


    
    
  }
  
}
