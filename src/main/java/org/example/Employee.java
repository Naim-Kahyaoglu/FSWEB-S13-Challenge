package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;  // Changed to 'healthPlans'

    // Constructor to initialize all attributes
    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans; // Changed to 'healthPlans'
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for fullName
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for healthPlans (with correct name)
    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    // Method to add a health plan at a specific index
    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Health plan added at index " + index);
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    // toString method override
    @Override
    public String toString() {
        return "Employee [id=" + id + ", fullName=" + fullName + ", email=" + email + "]";
    }
}
