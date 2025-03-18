/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;
import java.util.*;
/*
MissedAppointments.java
16/03/2025
@author ATra
This is the stack class for all of the missed appointments.
*/
public class MissedAppointments {
    private StackInterface myStackInterface = new StackElement();
    public MissedAppointments() {
    }
    
    public void pushMissedAppointments(TestRequest testRequest){
        myStackInterface.push(testRequest);
    }
    
    public ArrayList<TestRequest> returnMissedAppointments(int n){
        ArrayList<TestRequest> result = returnMissedAppointmentsHelper(n, new ArrayList<TestRequest>());
        for(int i = result.size()-1; i >= 0; i--){
            myStackInterface.push(result.get(i));
        }
        return result;
    }
    
    private ArrayList<TestRequest> returnMissedAppointmentsHelper(int n, ArrayList<TestRequest> current){
        if(n == 0){
            return current;
        }
        if(!myStackInterface.isEmpty()){
            current.add((TestRequest) myStackInterface.pop()); 
            return returnMissedAppointmentsHelper(n-1, current);
        }
        return current;
    }
    public int size(){
        return myStackInterface.size();
    }
    
    public boolean isEmpty(){
        return myStackInterface.isEmpty();
    }
}
