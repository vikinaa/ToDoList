/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todo;

/**
 *
 * @author vikto
 */
public class Node {
    
    private int key;
    private String value; //zaglavie
    private boolean done;
    private int deadline; //?
    private int importance;
    
   
    public Node next;
    
     public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue( String value){
        this.value=value;
    }
    
    public String getValue(){
        return value;
    }
    
     public void setImp( int importance){
        this.importance=importance;
    }
    
    public int getImp(){
        return importance;
    }

      public void setDone( boolean done){
        this.done=done;
    }
    
    public boolean getDone(){
        return done;
    }
    
    public void setKey( int key){
        this.key=key;
    }
    
    public int getKey(){
        return key;
    }
    
    Node(int key, String value, boolean done, int imp){
        
        setValue(value);
        setKey(key);
        setDone(done);
        setImp(imp);
        
    }
    
  
}
