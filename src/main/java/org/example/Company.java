package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor to initialize all attributes
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro); // Use setter to ensure giro validation
        this.developerNames = developerNames;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for giro
    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        } else {
            System.out.println("Giro cannot be negative!");
        }
    }

    // Getter and Setter for developerNames
    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // Method to add an employee at a specific index
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index out of bounds!");
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Employee added at index " + index);
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    // toString method override
    @Override
    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", giro=" + giro + "]";
    }
}
