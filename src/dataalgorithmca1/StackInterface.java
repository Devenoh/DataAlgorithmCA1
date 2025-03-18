/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;

/*
StackInterface.java
16/03/2025
@author ATra
This is the StackInterface with the methods.
*/
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

}
