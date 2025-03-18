/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;

/*
TestRequest.java
16/03/2025
@author ATra
This is where we store all the attributes for the patients.
*/
public class TestRequest {
    enum Priority { // enum for Priority since brief states it can only be Low, Medium, or Urgent.
        LOW,
        MEDIUM,
        URGENT
    }
    // How the priority is decided in the Priority Queue is seen lower in the class.
    private String name;
    private Priority priority; 
    private int age;
    private boolean ward;
    private GPDetails gpdetails; // GP details include Name, Age, and Gender.

    public TestRequest(String name, Priority priority, int age, boolean ward, GPDetails gpdetails) {
        this.name = name;
        this.priority = priority;
        this.age = age;
        this.ward = ward;
        this.gpdetails = gpdetails;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWard() {
        return ward;
    }

    public void setWard(boolean ward) {
        this.ward = ward;
    }

    public GPDetails getGpdetails() {
        return gpdetails;
    }

    public void setGpdetails(GPDetails gpdetails) {
        this.gpdetails = gpdetails;
    }
    
    public int getPriorityKey(){
       int priorityKey = age; //we set the age to the priority key first. Priority key in this ADT is highest number first.
       // this is good because typically older people have more urgent cases.
       if(ward){ // we simply add 100 to the PriorityKey if the ward boolean is true, AKA if they're coming from a hospital ward.
           priorityKey += 100;
       }
       
       if(priority == Priority.MEDIUM){ //we add 1000 if the priority is medium.
           priorityKey += 1000;
       }
       if(priority == Priority.URGENT){ // and we add 2000 if the priority is urgent.
           priorityKey += 2000;
       }
       return priorityKey; // I decided not to have any kind of added priority for LOW since it should be lowest.
    }
}
