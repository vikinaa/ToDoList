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
    private String value; 
    private boolean done;
    private String deadline; 
    private int importance;
    String day;
    String month;
    String year;
   
   
    public Node next;
    
    
     public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

      public void setDay(String day){
        this.day=day;
    }

    public String getDay() {
        String [] parts=deadline.split("\\.");
        day=parts[0];
        return day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        String [] parts=deadline.split("\\.");
        month=parts[1];
        return month;
    }
    
     public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        String [] parts=deadline.split("\\.");
        year=parts[2];
        return year;
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
    
    public void setDeadline(String deadline){
        this.deadline=deadline;
    }
    
    public String getDeadline(){
        return deadline;
    }
    
    
    public void setKey( int key){
        this.key=key;
    }
    
    public int getKey(){
        return key;
    }
    
    public String nodeDone() {
        String isdone;
        if (getDone() == true) {
            isdone = "Изпълнена";
        } else {
            isdone = "Неизпълнена";
        }
        return isdone;
    }
    
      public String nodeTostring() {
        String note = "";

        
                note += getValue();
                note += "\n";
                note = note + "Изпълненост: " + nodeDone();
                note += "\n";
                note = note + "Важност: " + getImp();
                note += "\n";
                note += "Срок: " + getDeadline();
                note+="\n";
                note+="--------------------------------------------------------------------------------------------------------------------------------------------------";

        return note;

    }

    
    
     Node (){
        this(0,"",false,0, "");
       
    }
     
    Node(int key, String value, boolean done, int imp, String deadline){
        
        setValue(value);
        setKey(key);
        setDone(done);
        setImp(imp);
        setDeadline(deadline);
        
    }
    
    @Override
    public String toString(){
       return nodeTostring();
    }
    
  
}
