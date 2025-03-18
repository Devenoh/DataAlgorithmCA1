/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;
import java.util.*;
/*
PQInterface.java
16/03/2025
@author ATra
PQInterface that gets Interfaced. It adds the methods for use in the Priority Queue.
*/
public interface PQInterface {

    public void enqueue(int iPriorityKey, Object thePatient);

    public int size();

    public boolean isEmpty();

    public Object dequeue();

    public String printPQueue();
    
    public ArrayList<Object> peek(int n);
}

