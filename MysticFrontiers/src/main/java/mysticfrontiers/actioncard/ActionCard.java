package main.java.mysticfrontiers.actioncard;

import main.java.mysticfrontiers.common.Card;

import java.io.PrintStream;

public class ActionCard extends Card {
    private Integer manaCost; // Nullable, in case there are free action cards
    private String effectDescription; // The primary description of what the action card does
    private String actionRequirement; // Describes the action required to activate this card
    
    // Constructor
    public ActionCard(String id, String name, Integer manaCost, String effectDescription, String actionRequirement) {
        super(id, name, ""); // Description is set to empty as effectDescription is used instead
        this.manaCost = manaCost;
        this.effectDescription = effectDescription;
        this.actionRequirement = actionRequirement;
    }
    
    // Overridden method to display card info with structured layout
    @Override
    public void displayCardInfo() {
        final String border = "+------------------------------------------------+";
        final String indent = "| ";
        final String endIndent = " |";
        
        System.out.println(border);
        // Top section
        String manaDisplay = manaCost != null && manaCost > 0 ? "Mana Cost: " + manaCost : "Free to Use";
        PrintStream printf = System.out.printf("%s%-15s %-40s %s%s%n", indent, name, manaDisplay, endIndent);
        
        // Middle section - Image placeholder
        System.out.println(indent + "[Image Placeholder: Action Icon or Artwork]" + endIndent);
        
        // Below Image: Action Requirement (if any)
        if (actionRequirement != null && !actionRequirement.isEmpty()) {
            System.out.printf("%sRequirement: %-49s%s%n", indent, actionRequirement, endIndent);
        }
        
        // Below requirement: Effect Description
        System.out.printf("%sEffect: %-54s%s%n", indent, effectDescription, endIndent);
        
        // Bottom section - Empty for action cards but structured for potential future use
        System.out.printf("%s%-58s%s%n", indent, "", endIndent);
        
        System.out.println(border);
    }
    
    // Getters and setters
    
    public Integer getManaCost() {
        return manaCost;
    }
    
    public void setManaCost(Integer manaCost) {
        this.manaCost = manaCost;
    }
    
    public String getEffectDescription() {
        return effectDescription;
    }
    
    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }
    
    public String getActionRequirement() {
        return actionRequirement;
    }
    
    public void setActionRequirement(String actionRequirement) {
        this.actionRequirement = actionRequirement;
    }
}
