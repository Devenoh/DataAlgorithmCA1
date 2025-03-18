/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;

/*
PQElement.java
16/03/2025
@author ATra
Priority Queue Element.
*/
public class PQElement {

    private int iKey;
    private Object element;

    public PQElement(int iInPriority, Object inElement) {
        this.iKey = iInPriority;
        this.element = inElement;
    }

    public int getiKey() {
        return iKey;
    }

    public void setiKey(int iInPriority) {
        this.iKey = iInPriority;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
        this.element = inElement;
    }

    public String toString() {
        return element.toString();
    }
}