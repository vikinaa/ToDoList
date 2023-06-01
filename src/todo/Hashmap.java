/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo;


public class Hashmap implements Sorts{
    
    
     
     Node head = new Node(); 

    public int size() {  //raboti
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
    
    public void clear(){  //raboti
        head.next=null;
    }

    public String cout(int key){ 
        String note="";
        Node kl=head.next;
        while(kl!=null){
            if(kl.getKey()==key) {
                note+=kl.getValue();
                note+="\n";
                note=note+"Изпълненост: "+kl.getDone();
                note+="\n";
                note=note+"Важност: "+kl.getImp();
                //System.out.println(); //deadline
            }
            kl=kl.next;
            
        }
        return note;
        
            }
    
    public String sstring() {
        String text="";
        Node kl = head.next;
        while (kl!= null) { 
            text+="\n";
            text+=cout(kl.getKey());
            text+="\n";
            text+="------------------------------------------------------------------------";
            kl = kl.next;
        }
        return text;

    }
    
    

    @Override
    public void sortByDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sortByImp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sortByStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

    
    
    
