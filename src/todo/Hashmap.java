/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo;

import java.util.LinkedList;

public class Hashmap implements Sorts {

    Node head = new Node();

    public int size() {  //raboti
        if (head.next == null) {
            return 0;
        } else {
            Node currkletka = head.next;
            int size = 0;
            while (currkletka != null) {
                size++;
                currkletka = currkletka.next;

            }
            return size;
        }
    }

    public boolean different(Node kl) {
        if (kl != head.next) {
            Node check = head.next;
            while (check != null) {
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

    public Node returnNode(int key) {
        Node curr = head.next;
        while (curr != null) {
            if (curr.getKey() == key) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    public void put(Node newN) {
        Node kl;
        Node temp = newN;
        if (head.next == null) {
            kl = newN;
            head.next = kl;
        } else {
            if (different(temp)) {
                kl = head.next;
                while (kl.next != null) {
                    kl = kl.next;
                }

                kl.next = newN;
            } else {
                System.out.println("Key not available");
            }
        }

    }

    public void clear() {  //raboti
        head.next = null;
    }

    public String isItDone(Node a) {
        String done;
        if (a.getDone() == true) {
            done = "Изпълнена";
        } else {
            done = "Неизпълнена";
        }
        return done;
    }

    public String cout(int key) {

        String note = "";
        Node kl = head.next;
        while (kl != null) {
            if (kl.getKey() == key) {

                note += kl.getValue();
                note += "\n";
                note = note + "Изпълненост: " + isItDone(kl);
                note += "\n";
                note = note + "Важност: " + kl.getImp();
                note += "\n";
                note += "Срок: " + kl.getDeadline();
                //System.out.println(); //deadline
            }
            kl = kl.next;

        }
        return note;

    }

    public void deleteNode(int key) {
        Node pr = head.next;
        Node kl = pr.next;
        if ((head.next).getKey() == key) {
            head.next = head.next.next;
        }

        while (kl != null) {
            if (kl.getKey() == key) {
                pr.next = kl.next;
            }
            pr = pr.next;
            kl = kl.next;
        }
    }

    public String sstring() {
        String text = "";
        int br = 1;
        Node kl = head.next;
        while (kl != null) {
            text += "\n" + Integer.toString(br) + ". ";
            text += cout(kl.getKey());
            text += "\n";
            text += "--------------------------------------------------------------------------------------------------------------------------------------------------";
            br++;
            kl = kl.next;
        }
        return text;

    }

       public String filterDone(Node a, String undone, int br){
       if(a==null) return undone;
        if(!(a.getDone())) {
            undone+=br+". ";
            undone+=a.nodeTostring();
        }
        undone+="\n";
        return filterDone(a.next, undone, br++);
       
    }
    
    
    
    public void swapValue(Node a, Node b) { //a>b
        int temp = a.getKey();
        int temp2 = b.getKey();
        b.setKey(-20);
        a.setKey(temp2);
        b.setKey(temp);
        int temp3 = a.getImp();
        int temp4 = b.getImp();
        a.setImp(temp4);
        b.setImp(temp3);
        boolean temp5 = a.getDone();
        boolean temp6 = b.getDone();
        a.setDone(temp6);
        b.setDone(temp5);
        String temp7 = a.getValue();
        String temp8 = b.getValue();
        a.setValue(temp8);
        b.setValue(temp7);
        String temp9 = a.getDeadline();
        String temp10 = b.getDeadline();
        a.setDeadline(temp10);
        b.setDeadline(temp9);

    }

    @Override
    public void sortByDate() {
        Node curr=head.next;
        Node temp = curr.next;
      
        for (int i = 0; i < size() - 1; i++) {

            for (int j = 0; j < size() -1; j++) {
               while(temp!=null){
                if (Integer.parseInt(curr.getYear())>Integer.parseInt(temp.getYear()) ) { //2024>2023 
                     swapValue(temp, curr);
                     
                }
                else if (Integer.parseInt(curr.getYear())==Integer.parseInt(temp.getYear())){ //2024=2024
                    if (Integer.parseInt(curr.getMonth())>Integer.parseInt(temp.getMonth())){ 
                           swapValue(temp,curr);
                       
                    }
                    else if(Integer.parseInt(curr.getMonth())==Integer.parseInt(temp.getMonth())){
                         if(Integer.parseInt(curr.getDay())>Integer.parseInt(temp.getDay())){ 
                            swapValue(temp,curr);
                        }
                    }
                }
              
               temp=temp.next;
               }
               
            }
            
            curr=curr.next;
            temp=curr.next;
            
    }
    }

    @Override
    public void sortByImp() {
       Node curr = head.next;
       Node temp = curr.next;

        for (int i = 0; i < size() - 1; i++) {

            for (int j = 0; j < size() -1; j++) {
               while(temp!=null){
                if (curr.getImp() > (temp).getImp()) {

                    swapValue(temp, curr);
                }
              
               temp=temp.next;
               }
               
            }
            
            curr=curr.next;
            temp=curr.next;
            

        }

    }
    
    public void unfinished(){
        LinkedList<Node> list=new LinkedList<>();
        Node curr=head.next;
        while(curr!=null){
            list.add(new Node(curr.getKey(), curr.getValue(), curr.getDone(), curr.getImp(), curr.getDeadline()));
            curr=curr.next;
        }
         
          list.stream()
                  .filter(x -> x.getDone()==true)
                  .forEach(System.out::println);


      }
    
   

   
}
