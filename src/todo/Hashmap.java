/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo;


public class Hashmap {
    
    
    Node head = new Node(0, null, false, 0); 

    public int size() {
        if (head.next == null) {
            return 0;
        } else {
            Node currkletka = head.next;
            int size = 0;
            while (currkletka!= null) {
                size++;
                currkletka = currkletka.next;

            }
         return size;
        }
    }

    public boolean different(Node kl) {
        if (kl != head.next) {
            Node check = head.next;
            while (check!= null) {
                if (check.getKey() == kl.getKey()) {
                    return false;
                }
                
                check = check.next;
            }

            return true;
        } else {
            return true;
        }

    }
    

    public void put(Node newN) {
       Node kl;
       Node temp=newN;
         if (head.next == null) {
                kl = newN;
                head.next = kl;
            }
         
           else {
             if(different(temp)){
                kl=head.next;
                while (kl.next!= null) {
                   kl = kl.next;
                }

                kl.next=newN;
             }
             else System.out.println("Key not available");
            }
      

    } 

    public void cout(int key){
        Node kl=head.next;
        while(kl.next!=null){
            if(kl.getKey()==key) {
                System.out.println(kl.getValue());
                System.out.println("Важност: "+kl.getImp());
                System.out.println(); //deadline
            }
            
        }
        
            }
    
    public void sstring() {
        Node kl = head.next;
        while (kl.next != null) {
            System.out.print(kl.getKey() + " - " + kl.getValue());
            kl = kl.next;
        }

    }

}

    
    
    
