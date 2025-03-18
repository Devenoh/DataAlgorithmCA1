/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;
import java.util.*;

/*
PQueue.java
16/03/2025
@author ATra
This class is for the Priority Queue.
*/
public class PQueue implements PQInterface {

    private ArrayList<PQElement> thePQueue;

    public PQueue() {
        thePQueue = new ArrayList<PQElement>();
    }

    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    public int size() {
        return thePQueue.size();
    }

    // we create the node with the given priority key that's added so that it just sorts itself as we add to it.
    public void enqueue(int iPriorityKey, Object thePatient) {
        int iIndex;
        PQElement newElement = new PQElement(iPriorityKey, thePatient);

        iIndex = findInsertPosition(iPriorityKey);

        if (iIndex > size()) {
            thePQueue.add(newElement);
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }

    private int findInsertPosition(int iNewPriorityKey) {
        PQElement curElement;
        int iIndex;
        for (iIndex = 0; iIndex < thePQueue.size(); iIndex++) {
            curElement = thePQueue.get(iIndex);
            if (curElement.getiKey() < iNewPriorityKey) {
                break;
            }
        }
        return iIndex;
    }

    //Dequeue removes the information from the queue as per the FIFO principle.
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    
    public String printPQueue() {
        PQElement curElement;
        String sMessage = new String();
        for (int iCount = 0; iCount < thePQueue.size(); iCount++) {
            curElement = thePQueue.get(iCount);
            sMessage = sMessage.concat("Priority = " + curElement.getiKey() + " * Element = " + curElement.getElement() + "\n");
        }
        return sMessage;
    }
    
    
    public ArrayList<Object> peek (int n){
        ArrayList<Object> peeking = new ArrayList<Object>();
        if (n > thePQueue.size()){
            n = thePQueue.size();
        }
        for(int i = 0; i < n; i++){
            peeking.add(thePQueue.get(i));
        }
        return peeking;
    }
}
