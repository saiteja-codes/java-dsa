  public void reverse() {

        node curr = head;
        node temp = null;

        while (curr != null) {

            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // Move to next node (which is now stored in prev)
            curr = curr.prev;
        }

        // Update head
        if (temp != null) {
            head = temp.prev;
        }
    }
