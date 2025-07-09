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
  DoublyNode tempNode = head;
    


reverseTraverseDLL()



  














    
    
