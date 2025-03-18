/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataalgorithmca1;

/*
GPDetails.java
16/03/2025
@author ATra
This class stores the GP Details for patients. I just did Name, Age, and Gender because the brief didn't specify what GP Details meant.
*/
public class GPDetails {
    enum Gender { // enum for gender since medical sex is binary
        MALE,
        FEMALE
    }
    private String name;
    private int age;
    private Gender gender;

    public GPDetails(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    
    
}
