public class VariableDemo {
    // Class variable (static)
    static int instanceCount = 0; // VariableDemo.instanceCount

    // Instance variable
    private int instanceId; // {object}.instanceId

    public VariableDemo() {
        instanceCount++; // Increment class variable
        this.instanceId = instanceCount; // Assign unique ID to instance
    }

    public void displayVariables() {
        // Local variable
        int localVar = 100;
        System.out.println("Instance ID: " + instanceId);
        System.out.println("Instance Count (static): " + instanceCount);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Create two objects to demonstrate instance and class variables
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        obj1.displayVariables();
        obj2.displayVariables();
    }
}


// Scope and Lifetime

// Scope: The region of the program where a variable is accessible.

// Instance variables: Accessible throughout the class (based on access modifiers).
// Class variables: Accessible globally within the class and its instances. - 
// Local variables: Limited to the method they are declared in.


// Lifetime: The duration a variable exists in memory.

// Instance variables: Exist as long as the object exists.
// Class variables: Exist for the entire program’s lifetime after the class is loaded.
// Local variables: Exist only during the execution of their enclosing method.
