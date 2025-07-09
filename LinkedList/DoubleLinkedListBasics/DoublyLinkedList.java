public class DoublyLinkedList {
  public DoublyNode head;
  public DoublyNode tail;
  public int size;

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
public void insertDLL(int nodevalue,int location){
  DoublyNode newNode = new DoublyNode();
  newNode.value = nodevalue;
  if(head == null){
    createDLL(nodevalue);
  }
  else if(location == 0){
    newNode.prev = null;
    newNode.next = head;
    head = newNode;
    head.prev = newNode;
  }
  else if(location >= size){
    newNode.prev = tail;
    newNode.next = null;
    tail = newNode;
    tail.next = newNode;
  }
  else {
    DoublyNode tempNode = head;
    int index=0;
    while(index < location-1){
      temp = temp.next;
      index++;
    }
    newNode.prev = tempNode;
    newNode.next = tempNode.next;
    tempNode.next= newNode;
    tempNode.next.prev= newNode;
  }
  size++;
}
  
public void traverseDLL(){

  if(head !=null){
      DoublyNode tempNode = head;
  for(int i=0;i<size;i++){
    System.out.print(tempNode.value);
  
  if(i ! = size-1){
    System.out.print("->");
  }
    tempNode = tempNode.next;
  }
  }else{
    System.out.println("SSL doesn't exist");
  }
  System.out.println("\n");
}

public void reversetraverseDLL(){

  if(head !=null){
      DoublyNode tempNode = head;
  for(int i=0;i<size;i++){
    System.out.print(tempNode.value);
  
  if(i ! = size-1){
    System.out.print("->");
  }
    tempNode = tempNode.prev;
  }
  }else{
    System.out.println("SSL doesn't exist");
  }
  System.out.println("\n");
}
  
  public boolean searchNode(int nodeValue) {
    if (head != null) {
      DoublyNode tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("The Node is found at location: " +i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found!");
    return false;
  }



  














    
    
