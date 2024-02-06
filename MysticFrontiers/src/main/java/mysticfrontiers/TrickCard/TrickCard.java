package main.java.mysticfrontiers.TrickCard;

import main.java.mysticfrontiers.common.Card;

public class TrickCard extends Card {
    private String effectDescription; // The primary description of the trick the card performs
    
    // Constructor
    public TrickCard(String id, String name, String description, String effectDescription) {
        super(id, name, description); // Description here could be used as flavor text
        this.effectDescription = effectDescription;
    }
    
    // Overridden method to display card info with structured layout
    @Override
    public void displayCardInfo() {
        final String border = "+------------------------------------------------+";
        final String indent = "| ";
        final String endIndent = " |";
        
        System.out.println(border);
        // Top section: Name
        System.out.printf("%sName: %-55s%s%n", indent, name, endIndent);
        
        // Middle section: Image placeholder
        System.out.println(indent + "[Image Placeholder: Trick Icon or Artwork]" + endIndent);
        
        // Below Image: Description as flavor text (if any)
        if (description != null && !description.isEmpty()) {
            System.out.printf("%sFlavor Text: %-48s%s%n", indent, description, endIndent);
        }
        
        // Below Flavor Text: Effect Description
        System.out.printf("%sEffect: %-54s%s%n", indent, effectDescription, endIndent);
        
        // Bottom section - Empty for trick cards but structured for potential future use
        System.out.printf("%s%-58s%s%n", indent, "", endIndent);
        
        System.out.println(border);
    }
    
    // Getters and setters
    
    public String getEffectDescription() {
        return effectDescription;
    }
    
    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }
}
