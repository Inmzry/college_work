
public class LinkedList{
   Node head;
   Node tail;
   int count;
 
 //determine whether the list is empty
   public boolean isEmpty(){
      return count == 0;
   }
 
   public String toString(){
      StringBuffer sb = new StringBuffer();
      sb.append("{");
      Node p = head;
      while(p != null){
         sb.append(p.getItem() + " ");
         p = p.getNext();
      }
      sb.append("}");
      return sb.toString();
   }
 
   public void addFirst(int item){
      Node temp = new Node(item,head);
      if(isEmpty())
         tail = head = temp;
      else
         head = temp;
      count++;
   }
 
   public void addLast(int item){
   //do this
      if(isEmpty())
         addFirst(item);
      else{
         Node newNode = new Node(item);
         tail.setNext(newNode);
         tail = newNode;
         count++;
      }
   }
 //output the list - ok
 //find the length of the list
 public int Count(){
   return count;
 }
 //retrieve the item contained in the first node
   public int getFirstElement(){
      if(!isEmpty())
         return head.getItem();
      return 0;
   }
 //retrieve the item contained in the last node
   public int getLastElement(){
      if(!isEmpty())
         return tail.getItem();
      return 0;
   }
 
 //search the list for a given item
 //public boolean isFound
   public boolean isFound(int item){
   
      boolean found = true;
      Node p = head;
   
      while(p != null){
         if(p.getItem() == item){
            found = true;
         }
         else{
            found = false;
         }
         p = p.getNext();
      }
      return found;
   }
 
 //insert an item in the list
 //delete an item from the list
   public void delete(int item){
   //do this
      Node p= head;
      Node prev = null;
      while(p!=null){
         if(p.getItem()==item){
            if(prev==null)
               head=p.getNext();
            else
               prev.setNext(p.getNext());
            count--;
         }
         else
            prev = p;
         p=p.getNext();
      }tail=prev;
   }
 

 
   public int getSum(){
      int sum = 0;
      Node p = head;
      while(p!= null){
         sum = sum + p.getItem();
         p = p.getNext();
      }
      return sum;
   
   }
   public int getSmallest(){
      int small = 0;
      Node p = head;
      if(!isEmpty()){
         small=p.getItem();
         while(p!=null){
            if(small> p.getItem())
               small=p.getItem();
            p = p.getNext();
         }
      }
      return small;
   }
   public int getLargest(){
      int large = 0;
      Node p = head;
      if(!isEmpty()){
         large=p.getItem();
         while(p!=null){
            if(large< p.getItem()){
               large=p.getItem();
            }
            p = p.getNext();
         }
      }
      return large;
   }
   public int sumOfEven(){
      int even = 0;
      Node p = head;
      while(p !=null){
         if(p.getItem() %2==0){
            even = even + p.getItem();
         }
         p = p.getNext();
      
      }
      return even;
   }

   public void doubleTheElement(){
   
      Node p = head;
      int temp = 0;
      while(p!=null){
      
         temp = p.getItem()*2;
         p.setItem(temp);
         p = p.getNext();
      }
   
   }
   

   public static void main(String [] args){
      LinkedList list = new LinkedList();
      list.addFirst(5);
      list.addFirst(6);
      list.addFirst(7);
      list.addLast(2);
      list.delete(2);
      System.out.println("Length "+list.Count());
      System.out.println("Is found: " + list.isFound(2));
      System.out.println("list contains: " + list);
      System.out.println("Sum: "+list.getSum());
      System.out.println("The first element is :  " + list.getFirstElement());
      System.out.println("The Last element is :  " + list.getLastElement());
      System.out.println("Smallest element is: "+list.getSmallest());
      System.out.println("Largest element is: "+list.getLargest());
      System.out.println("Sum of even elements is: "+list.sumOfEven());
      list.doubleTheElement();
      System.out.println("list contains: " + list);
      System.out.println("Sum: "+list.getSum());

   
   
   }
}
