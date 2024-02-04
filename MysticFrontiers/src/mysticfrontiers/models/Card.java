package mysticfrontiers.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Card {
    protected String id;
    protected String name;
    protected String description;
    protected Integer offense; // Nullable for cards without offense points
    protected Integer resistance; // Nullable for cards without defense points
    protected Integer movement; // Nullable for cards without movement capability
    protected String territoryAffiliation;
    protected String cardType; // Could be "Creature", "Ability", "Action", "Trick", etc.
    protected String cardClass; // Could be "Warrior", "Mage", "Rogue", etc. if applicable
    protected String elementType; // "Fire", "Water", "Earth", "Air", etc.
    protected Integer manaCost;
    
    public Card(String id, String name, String description, Integer offense, Integer resistance,
                Integer movement, String territoryAffiliation, String cardType,
                String cardClass, String elementType, Integer manaCost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.offense = offense;
        this.resistance = resistance;
        this.movement = movement;
        this.territoryAffiliation = territoryAffiliation;
        this.cardType = cardType;
        this.cardClass = cardClass;
        this.elementType = elementType;
        this.manaCost = manaCost;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Integer getOffense() {
        return offense;
    }
    
    public void setOffense(Integer offense) {
        this.offense = offense;
    }
    
    public Integer getResistance() {
        return resistance;
    }
    
    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }
    
    public Integer getMovement() {
        return movement;
    }
    
    public void setMovement(Integer movement) {
        this.movement = movement;
    }
    
    public String getTerritoryAffiliation() {
        return territoryAffiliation;
    }
    
    public void setTerritoryAffiliation(String territoryAffiliation) {
        this.territoryAffiliation = territoryAffiliation;
    }
    
    public String getCardType() {
        return cardType;
    }
    
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    
    public String getCardClass() {
        return cardClass;
    }
    
    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }
    
    public String getElementType() {
        return elementType;
    }
    
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    
    public Integer getManaCost() {
        return manaCost;
    }
    
    public void setManaCost(Integer manaCost) {
        this.manaCost = manaCost;
    }
    
    public void displayCardInfo(Object[] creatureType) {
        final String border = "+------------------------------------------------+";
        // Space calculation for the top part to align ElementType at the right
        String baseInfo = "Mana: " + getManaCost() + ", Name: " + getName();
        String elementTypeInfo = "Element: " + getElementType();
        // Assuming 50 characters wide, adjust based on your actual console width
        int totalWidth = 50;
        int spacesNeededForAlignment = totalWidth - baseInfo.length() - elementTypeInfo.length() - 4; // 4 for the "| " and " |" padding
        String padding = " ".repeat(spacesNeededForAlignment);
        
        System.out.println(border);
        // Print the top part with Mana and Name on the left, ElementType on the right
        System.out.println("| " + baseInfo + padding + elementTypeInfo + " |");
        System.out.println(border);
        // Assuming an image placeholder
        System.out.println("|" + "                 [Image Placeholder]                  |");
        System.out.println(border);
        // Territory Affiliation in the middle part
        System.out.println("|" + String.format(" Territory: %-42s|", getTerritoryAffiliation()));
        // CreatureType specific to CreatureCard
        // CardType could also be included here if it's distinct per card type
        System.out.println("|" + String.format(" Card Type: %-40s|", getCardType()));
        System.out.println(border);
        // Wrapped description
        // Implementation of wrapText() needed here to split description into lines
        List<String> wrappedDescription = wrapText(getDescription(), 46); // Custom implementation needed
        for (String line : wrappedDescription) {
            System.out.println("| " + line + " |");
        }
        System.out.println(border);
        // Bottom part for Offense, Resistance, Movement with more space
        System.out.println("|" + String.format(" Offense: %-3s Resistance: %-3s Movement: %-3s |", getOffense(), getResistance(), getMovement()));
        System.out.println(border);
    }
    
    // Example wrapText method; this needs to be defined within your class
    private List<String> wrapText(String text, int maxWidth) {
        List<String> lines = new ArrayList<>();
        String[] words = text.split(" ");
        StringBuilder currentLine = new StringBuilder();
        for (String word : words) {
            // Check if adding the next word exceeds maxWidth
            if (currentLine.length() + word.length() + 1 > maxWidth) {
                lines.add(currentLine.toString());
                currentLine = new StringBuilder();
            }
            if (currentLine.length() > 0) {
                currentLine.append(" ");
            }
            currentLine.append(word);
        }
        // Add the last line if it contains any words
        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }
        return lines;
    }
    
    
    
}
