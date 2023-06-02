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
    
    public Node returnNode(int key){
        Node curr=head.next;
        while(curr!=null){
            if(curr.getKey()==key) return curr;
            curr=curr.next;
        }
       return null;
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
        int br=1;
        Node kl = head.next;
        while (kl!= null) { 
            text+="\n"+Integer.toString(br)+". ";
            text+=cout(kl.getKey());
            text+="\n";
            text+="------------------------------------------------------------------------";
            br++;
            kl = kl.next;
        }
        return text;

    }
    
     public void swapValue(Node a, Node b) { //a>b
        int temp=a.getKey();
        int temp2=b.getKey();
        b.setKey(-20);
        a.setKey(temp2);
        b.setKey(temp);
        int temp3=a.getImp();
        int temp4=b.getImp();
        a.setImp(temp4);
        b.setImp(temp3);
        boolean temp5=a.getDone();
        boolean temp6=b.getDone();
        a.setDone(temp6);
        b.setDone(temp5);
        String temp7=a.getValue();
        String temp8=b.getValue();
        a.setValue(temp8);
        b.setValue(temp7);
   
    }
    

    @Override
    public void sortByDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sortByImp() {
        Node curr = head.next;
        for (int i = 0; i < size() - 1; i++) {

            for (int j = 0; j < size() -i-1; j++) {
               
                if (curr.getImp() > (curr.next).getImp()) {

                    swapValue(curr.next, curr);
                }
                

            }
            curr = curr.next;
            

        }

    }

    @Override
    public void sortByStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

    



    
    
    
