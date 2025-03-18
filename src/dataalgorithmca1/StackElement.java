/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;

import java.util.*;

/*
StackElement.java
16/03/2025
@author ATra
This is the class that implements the StackInterface and creates the new instance of the Stack.
*/
public class StackElement implements StackInterface {
   
    private ArrayList<TestRequest> theStack;

    public StackElement() {
        theStack = new ArrayList<TestRequest>();
    }

    public boolean isEmpty() { // checks if the stack is empty or not.
        return theStack.isEmpty();
    }

    public boolean isFull() { // I'm too afraid to get rid of this method so i'm just gonna return false.
        return false;
    }

    //method to "pop" the Stack, essentially checks if it's empy and if it's not then it removes the first one (FILO Principle) and if it's empty trhen it just returns nothing.
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    //pushes the information into the "top" of the Stack (Again, FILO principle.)
    public void push(Object newItem) {
        theStack.add(0, (TestRequest) newItem);
    }

    public int size() {
        return theStack.size();
    }
}
