package mysticfrontiers.models;

/**
 *
 * @author gabegrosse
 */
public class AbilityCard extends Card {
    private int manaCost;
    private String abilityCardType; // Normal, Enhancement, Flash, Infinite
    private String effectDescription; // The primary description of what the ability card does
    
    // Constructor
    public AbilityCard(String id, String name, int manaCost, String abilityCardType, String effectDescription) {
        super(id, name, ""); // Passing an empty string for description as it's not used here.
        this.manaCost = manaCost;
        this.abilityCardType = abilityCardType;
        this.effectDescription = effectDescription;
    }
    
    // Overridden method to display card info with structured layout
    @Override
    public void displayCardInfo() {
        final String border = "+------------------------------------------------+";
        final String indent = "| ";
        final String endIndent = " |";
        
        System.out.println(border);
        // Top section
        System.out.printf("%s%-15s %-40s Mana Cost: %d%s%n", indent, "", name, manaCost, endIndent);
        
        // Middle section - Image placeholder
        System.out.println(indent + "[Image Placeholder: Ability Icon or Artwork]" + endIndent);
        
        // Below Image: Ability Card Type and Class Type (if any)
        System.out.printf("%sType: %-15s Class: %-32s%s%n", indent, abilityCardType, "", endIndent); // No class type for ability cards
        
        // Below type and class: Effect Description
        System.out.printf("%sEffect: %-54s%s%n", indent, effectDescription, endIndent);
        
        // Bottom section - Empty for ability cards but structured for potential future use
        System.out.printf("%s%-58s%s%n", indent, "", endIndent);
        
        System.out.println(border);
    }
    
    // Getters and setters
    
    public int getManaCost() {
        return manaCost;
    }
    
    public String getAbilityCardType() {
        return abilityCardType;
    }
    
    public String getEffectDescription() {
        return effectDescription;
    }
    
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
    
    public void setAbilityCardType(String abilityCardType) {
        this.abilityCardType = abilityCardType;
    }
    
    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }
}

