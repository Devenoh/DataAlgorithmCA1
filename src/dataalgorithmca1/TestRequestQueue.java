/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;
import java.util.*;
/*
TestRequestQueue.java
16/03/2025
@author ATra
This has a bunch of stuff for adding TestRequest stuff to the queue.
*/
public class TestRequestQueue {
    private PQInterface pqInterface = new PQueue();
    
    public TestRequestQueue(){
        
    }
    public int size(){
        return pqInterface.size();
    }
    
    public boolean isEmpty(){
        return pqInterface.isEmpty();
    }
    
    public TestRequest dequeue(){
        return (TestRequest) pqInterface.dequeue();
    }
    
    public void enqueue(TestRequest testRequest){
        pqInterface.enqueue(testRequest.getPriorityKey(), testRequest); //enqueues the priorityKey with the rest of the information.
    }
    
    public ArrayList<TestRequest> peek (int n){
        ArrayList<TestRequest> peeked = new ArrayList<TestRequest>();
        ArrayList<Object> peekedObject = pqInterface.peek(n);
        for (Object object : peekedObject){ // for loop for iteraiting through the list.
            peeked.add((TestRequest)((PQElement) object).getElement()); //cast Object to PQElement and adds to peeked list.
        }
        return peeked;
    }
}
