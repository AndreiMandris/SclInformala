/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework6;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public class Product {

    /**
     * Product class constructor
     *
     */
    public Product() {
        System.out.println("SUPER");
    }

    /*
     * 
     * When we try to inherit a class with static members, I can access them by
     * <nameOfParentClass>.<staticMember> or by <nameOfSubclass>.<staticMember>
     * but still it's the SAME memory zone. There is no other creation of other static member.
     * It's the same static variable only that I can reffer to it in two ways.
     * 
     * When I create an instance of the parent class or of the subclass
     * I can also refer to the static member as <nameOfInstance>.<staticMember>, but
     * it's not that correct because it's a static variable and it is not
     * a variable that is created once with the instance(it's a single variable in memory)
     * even though the compiler allows it.
     */
    public static final String COUNTRY = "RO";
    protected static int a = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = Whiteboard.COUNTRY; //I have access to the static members of the superclass using <Subclass>.<staticmember>
        System.out.println(a);
        Whiteboard z = new Whiteboard(); // firstly the super constructor is called then the SubClass constructor
        z.a = 3; // I have access to static members from superclass from an instance of the subclass.

    }

}
