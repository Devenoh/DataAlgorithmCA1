/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataalgorithmca1;
import java.util.*;
/*
PatientApp.java
16/03/2025
@author ATra
App class that calls everything and showcases the GUI with the information.
*/
public class PatientApp {
    public static void main(String[] args) {
        MissedAppointments missedAppointments = new MissedAppointments();
        Panel gui = new Panel();
        gui.setVisible(true);
        gui.showPatients();
        gui.showMissedPatients();
        // 1
        missedAppointments.pushMissedAppointments(new TestRequest("Dan1", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban1", 13, GPDetails.Gender.MALE)));
        
        // 2
        missedAppointments.pushMissedAppointments(new TestRequest("Dan2", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban2", 13, GPDetails.Gender.MALE)));
        
        // 3
        missedAppointments.pushMissedAppointments(new TestRequest("Dan3", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban3", 13, GPDetails.Gender.MALE)));
        
        // 4
        missedAppointments.pushMissedAppointments(new TestRequest("Dan4", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban4", 13, GPDetails.Gender.MALE)));
        
        // 5 
        missedAppointments.pushMissedAppointments(new TestRequest("Dan5", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban5", 13, GPDetails.Gender.MALE)));
        
        // 6 
        missedAppointments.pushMissedAppointments(new TestRequest("Dan6", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban6", 13, GPDetails.Gender.MALE)));
        
        // 7
        missedAppointments.pushMissedAppointments(new TestRequest("Dan7", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban7", 13, GPDetails.Gender.MALE)));
        
        ArrayList<TestRequest> missed = missedAppointments.returnMissedAppointments(5); //we post the information in the console as well for testing.
        for (int i = 0; i < missed.size(); i++){ // it's not fully necessary but it's good for comparing information and making sure the right stuff shows up in the right place.
            System.out.println(missed.get(i).getName());
            System.out.println(missed.get(i).getAge());
            System.out.println(missed.get(i).isWard());
            System.out.println(missed.get(i).getGpdetails().getName());
            System.out.println(missed.get(i).getGpdetails().getAge());
            System.out.println(missed.get(i).getGpdetails().getGender());
        }
        
        
        System.out.println("\n \n \n \n");
        TestRequestQueue testRequestQueue = new TestRequestQueue();
        
        // 1
        testRequestQueue.enqueue(new TestRequest("Don1", 
                TestRequest.Priority.LOW, 15, true,
                new GPDetails("Bon1", 15, GPDetails.Gender.MALE)));
        
        // 2
        testRequestQueue.enqueue(new TestRequest("Don2", 
                TestRequest.Priority.LOW, 13, false,
                new GPDetails("Bon2", 13, GPDetails.Gender.MALE)));
        
        // 3
        testRequestQueue.enqueue(new TestRequest("Don3", 
                TestRequest.Priority.URGENT, 13, true,
                new GPDetails("Bon3", 13, GPDetails.Gender.MALE)));
        
        // 4
        testRequestQueue.enqueue(new TestRequest("Don4", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Bon4", 13, GPDetails.Gender.MALE)));
        
        // 5 
        testRequestQueue.enqueue(new TestRequest("Don5", 
                TestRequest.Priority.URGENT, 18, true,
                new GPDetails("Bon5", 13, GPDetails.Gender.MALE)));
        
        // 6 
        testRequestQueue.enqueue(new TestRequest("Don6", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Bon6", 13, GPDetails.Gender.MALE)));
        
        // 7
        testRequestQueue.enqueue(new TestRequest("Don7", 
                TestRequest.Priority.URGENT, 75, false,
                new GPDetails("Bon7", 13, GPDetails.Gender.MALE)));
        
        
        ArrayList<TestRequest> queued = testRequestQueue.peek(7);
        
        
        for (int i = 0; i < queued.size(); i++){
            System.out.println(queued.get(i).getName());
            System.out.println(queued.get(i).getPriority());
            System.out.println(queued.get(i).isWard());
            System.out.println(queued.get(i).getAge());
            System.out.println("\n");
            System.out.println(queued.get(i).getGpdetails().getName());
            System.out.println(queued.get(i).getGpdetails().getAge());
            System.out.println(queued.get(i).getGpdetails().getGender());
        }
    }
}
