import java.util.ArrayList;

public class Person {
    private double amount;
    private String name;

    public void getAffordableTransTool(ArrayList<TransportTools> transportTools) {
        for (TransportTools tool : transportTools) {
            if (amount >= tool.getPrice()) {
                System.out.println(name + " has " + amount + " dollars. so, He could Choose "
                    + tool.getToolName() + " to travel.");
            }
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

    public Person() {
    }
}
