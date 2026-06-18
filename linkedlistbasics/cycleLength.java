class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

public class linklist3 {
    public static void main(String args[]){

        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);

        node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // create cycle
        n5.next = n2;

        node slow = head;
        node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            // cycle detected
            if(slow == fast){

                System.out.println("Cycle Found");

                // Find cycle start
                node curr = head;

                while(curr != slow){
                    curr = curr.next;
                    slow = slow.next;
                }

                System.out.println("Cycle starts at: " + curr.data);

                // Find cycle length
                int count = 1;
                node temp = curr.next;

                while(temp != curr){
                    count++;
                    temp = temp.next;
                }

                System.out.println("Cycle Length: " + count);

                break;
            }
        }
    }
}
