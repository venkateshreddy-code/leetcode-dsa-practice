public class DoublyLinkedList {
  public DoublyNode head;
  public DoublyNode tail;
  public int size;

  // Create a Doubly Linked List with a single node
  public Node createDLL(int nodevalue){
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodevalue;
    newNode.next = null;
    newNode.prev = null;
    head = newNode;
    tail = newNode;
    size = 1;
    return head;
  }

  // Insert a node at specified location
  public void insertDLL(int nodevalue, int location){
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodevalue;
    if(head == null){ // If list is empty, create DLL
      createDLL(nodevalue);
    }
    else if(location == 0){ // Insert at the beginning
      newNode.prev = null;
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    else if(location >= size){ // Insert at the end
      newNode.prev = tail;
      newNode.next = null;
      tail.next = newNode;
      tail = newNode;
    }
    else { // Insert at a specific location in the middle
      DoublyNode tempNode = head;
      int index = 0;
      while(index < location - 1){
        tempNode = tempNode.next;
        index++;
      }
      newNode.prev = tempNode;
      newNode.next = tempNode.next;
      tempNode.next.prev = newNode;
      tempNode.next = newNode;
    }
    size++;
  }

  // Traverse and print the DLL from head to tail
  public void traverseDLL(){
    if(head != null){
      DoublyNode tempNode = head;
      for(int i = 0; i < size; i++){
        System.out.print(tempNode.value);
        if(i != size - 1){
          System.out.print("->");
        }
        tempNode = tempNode.next;
      }
    } else {
      System.out.println("DLL doesn't exist");
    }
    System.out.println("\n");
  }

  // Traverse DLL in reverse from tail to head
  public void reversetraverseDLL(){
    if(head != null){
      DoublyNode tempNode = tail;
      for(int i = 0; i < size; i++){
        System.out.print(tempNode.value);
        if(i != size - 1){
          System.out.print("->");
        }
        tempNode = tempNode.prev;
      }
    } else {
      System.out.println("DLL doesn't exist");
    }
    System.out.println("\n");
  }

  // Search for a node by value
  public boolean searchNode(int nodeValue) {
    if (head != null) {
      DoublyNode tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("The Node is found at location: " + i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found!");
    return false;
  }

  // Delete node at specified location
  public void deleteNodeDLL(int location){
    if(head == null){
      System.out.print("DLL doesn't exist");
      return;
    }
    else if(location == 0){ // Delete at beginning
      if(size == 1){
        head = null;
        tail = null;
        size--;
        return;
      } else {
        head = head.next;
        head.prev = null;
        size--;
      }
    }
    else if(location >= size){ // Delete at end
      DoublyNode tempNode = tail.prev;
      if(size == 1){
        head = null;
        tail = null;
        return;
      } else {
        tempNode.next = null;
        tail = tempNode;
        size--;
      }
    }
    else { // Delete in middle
      DoublyNode tempNode = head;
      for(int i = 0; i < location - 1; i++){
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      tempNode.next.prev = tempNode;
      size--;
    }
  }

  // Delete the entire DLL
  public void deleteDLL() {
    DoublyNode tempNode = head;
    for (int i = 0; i < size; i++) {
      tempNode.prev = null;
      tempNode = tempNode.next;
    }
    head = null;
    tail = null;
    System.out.println("The DLL has been deleted!");
  }
}




  














    
    
