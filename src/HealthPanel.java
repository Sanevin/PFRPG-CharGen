import java.text.*;
import java.awt.*;
//import java.awt.event.*;

import javax.swing.*;
//import javax.swing.event.*;
//import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

@SuppressWarnings("serial")
public class HealthPanel extends JPanel implements PropertyChangeListener { 
	
	private int totalHealth = 10;
	private int damageReduction;
	private int currentHealth = 5;
	private int nonLethalDamage = 0;
	private int totalInitiative;
	private int dexModInitiative;
	private int miscInitiative;
	
	private JLabel totalHealthLabel, currentHealthLabel, nonLethalLabel;
	private JLabel damageReductionLabel, initiativeLabel;
	
	private static String totalHealthString = "Health Points: ";
	private static String currentHealthString = "Wounds/Current HP: ";
	private static String nonLethalString = "Nonlethal Damage: ";
	private static String damageReductionString = "DR: ";
	private static String initiativeString = "Initiative: ";
	
	
	private JFormattedTextField totalHealthField, currentHealthField ;
	private JFormattedTextField nonLethalDamageField, damageReductionField;
	private JFormattedTextField totalInitiativeField, dexModInitiativeField;
	private JFormattedTextField miscInitiativeField;
	
	private NumberFormat totalHealthFormat, currentHealthFormat;
	private NumberFormat nonLethalDamageFormat, damageReductionFormat;
	private NumberFormat totalInitiativeFormat, dexModInitiativeFormat;
	private NumberFormat miscInitiativeModFormat;
	
	public HealthPanel(){
		super(new BorderLayout());
		
		//set up labels
		totalHealthLabel = new JLabel(totalHealthString);
		currentHealthLabel = new JLabel(currentHealthString);
		nonLethalLabel = new JLabel(nonLethalString);
		damageReductionLabel = new JLabel(damageReductionString);
		initiativeLabel = new JLabel(initiativeString);
		
		//set up text fields
		totalHealthField = new JFormattedTextField(totalHealthFormat);
		totalHealthField.setValue(new Integer(totalHealth));
		totalHealthField.setColumns(3);
		totalHealthField.addPropertyChangeListener("value", this);
		
		currentHealthField = new JFormattedTextField(currentHealthFormat);
		currentHealthField.setValue(new Integer(currentHealth));
		currentHealthField.setColumns(3);
		currentHealthField.addPropertyChangeListener("value", this);
		
		nonLethalDamageField = new JFormattedTextField(nonLethalDamageFormat);
		nonLethalDamageField.setValue(new Integer(nonLethalDamage));
		nonLethalDamageField.setColumns(3);
		nonLethalDamageField.addPropertyChangeListener("value", this);
		
		damageReductionField = new JFormattedTextField(damageReductionFormat);
		damageReductionField.setValue(new Integer(damageReduction));
		damageReductionField.setColumns(3);
		damageReductionField.addPropertyChangeListener("value", this);
		
	}
	public void propertyChange(PropertyChangeEvent e) {
		

    }
}

