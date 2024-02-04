package mysticfrontiers.models;

public abstract class Card {
    protected String id;
    protected String name;
    protected String description;
    
    public Card(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    public abstract void displayCardInfo();
    
    // Getters and setters...
}
