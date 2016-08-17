import java.text.*;
import java.awt.*;
//import java.awt.event.*;

import javax.swing.*;
//import javax.swing.event.*;
//import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

@SuppressWarnings("serial")
public class BaseStatPanel extends JPanel implements PropertyChangeListener {
	private int str = 10, dex = 10, con = 10; 
	private int intel = 10, wis = 10, cha = 10;
	private int strMod = 0, dexMod = 0, conMod = 0; 
	private int intelMod = 0, wisMod = 0, chaMod = 0;
	private int totalStr = 10, totalDex = 10, totalCon = 10;
	private int totalIntel = 10, totalWis = 10, totalCha = 10;
	private int totalStrMod = 0, totalDexMod = 0, totalConMod = 0;
	private int totalIntelMod = 0, totalWisMod = 0, totalChaMod = 0;
	
	private JLabel strLabel, dexLabel, conLabel;
	private JLabel intelLabel, wisLabel, chaLabel;
	private JLabel baseLabel;
	private JLabel baseModLabel;
	private JLabel totalLabel;
	private JLabel totalModLabel;
	private JLabel blankLabel;
	
	private static String strString = "Strength: ";
	private static String dexString = "Dexterity: ";
	private static String conString = "Constitution: ";
	private static String intelString = "Intelligence: ";
	private static String wisString = "Wisdom: ";
	private static String chaString = "Charisma: ";
	private static String baseString = "Base Stats: ";
	private static String baseModString = "Base Mods:   ";
	private static String totalString = "Total Stats: ";
	private static String totalModString = "Total Mods: ";
	private static String blankString = "             ";
	
	private JFormattedTextField strField, dexField, conField;
	private JFormattedTextField intelField, wisField, chaField;
	private JFormattedTextField strModField, dexModField, conModField;
	private JFormattedTextField intelModField, wisModField, chaModField;
	private JFormattedTextField totalStrField, totalDexField, totalConField;
	private JFormattedTextField totalIntelField, totalWisField, totalChaField;
	private JFormattedTextField totalStrModField, totalDexModField, totalConModField;
	private JFormattedTextField totalIntelModField, totalWisModField, totalChaModField;
	
	private NumberFormat strFormat, dexFormat, conFormat;
	private NumberFormat intelFormat, wisFormat, chaFormat;
	private NumberFormat strModFormat, dexModFormat, conModFormat;
	private NumberFormat intelModFormat, wisModFormat, chaModFormat;
	private NumberFormat totalStrFormat, totalDexFormat, totalConFormat;
	private NumberFormat totalIntelFormat, totalWisFormat, totalChaFormat;
	private NumberFormat totalStrModFormat, totalDexModFormat, totalConModFormat;
	private NumberFormat totalIntelModFormat, totalWisModFormat, totalChaModFormat;
	
	public BaseStatPanel(){
		super(new BorderLayout());
		setUpFormats();
		
		//Create Labels
		strLabel = new JLabel(strString);
		dexLabel = new JLabel(dexString);
		conLabel = new JLabel(conString);
		intelLabel = new JLabel(intelString);
		wisLabel = new JLabel(wisString);
		chaLabel = new JLabel(chaString);
		baseLabel = new JLabel(baseString);
		baseModLabel = new JLabel(baseModString);
		totalLabel = new JLabel(totalString);
		totalModLabel = new JLabel(totalModString);
		blankLabel = new JLabel(blankString);
		
		//Create text fields
		strField = new JFormattedTextField(strFormat);
		strField.setValue(new Integer(str));
		strField.setColumns(3);
		strField.addPropertyChangeListener("value", this);
		
		strModField = new JFormattedTextField(strModFormat);
		strModField.setValue(new Integer(strMod));
		strModField.setColumns(2);
		strModField.setEditable(false);
		
		totalStrField = new JFormattedTextField(totalStrFormat);
		totalStrField.setValue(new Integer(totalStr));
		totalStrField.setColumns(2);
		totalStrField.setEditable(false);
		
		totalStrModField = new JFormattedTextField(totalStrModFormat);
		totalStrModField.setValue(new Integer(totalStrMod));
		totalStrModField.setColumns(2);
		totalStrModField.setEditable(false);
		
		dexField = new JFormattedTextField(dexFormat);
		dexField.setValue(new Integer(dex));
		dexField.setColumns(3);
		dexField.addPropertyChangeListener("value", this);
		
		dexModField = new JFormattedTextField(dexModFormat);
		dexModField.setValue(new Integer(dexMod));
		dexModField.setColumns(2);
		dexModField.setEditable(false);
		
		totalDexField = new JFormattedTextField(totalDexFormat);
		totalDexField.setValue(new Integer(totalDex));
		totalDexField.setColumns(2);
		totalDexField.setEditable(false);
		
		totalDexModField = new JFormattedTextField(totalDexModFormat);
		totalDexModField.setValue(new Integer(totalDexMod));
		totalDexModField.setColumns(2);
		totalDexModField.setEditable(false);
		
		conField = new JFormattedTextField(conFormat);
		conField.setValue(new Integer(con));
		conField.setColumns(3);
		conField.addPropertyChangeListener("value", this);
		
		conModField = new JFormattedTextField(conModFormat);
		conModField.setValue(new Integer(conMod));
		conModField.setColumns(2);
		conModField.setEditable(false);
		
		totalConField = new JFormattedTextField(totalConFormat);
		totalConField.setValue(new Integer(totalCon));
		totalConField.setColumns(2);
		totalConField.setEditable(false);
		
		totalConModField = new JFormattedTextField(totalConModFormat);
		totalConModField.setValue(new Integer(totalConMod));
		totalConModField.setColumns(2);
		totalConModField.setEditable(false);
		
		intelField = new JFormattedTextField(intelFormat);
		intelField.setValue(new Integer(intel));
		intelField.setColumns(3);
		intelField.addPropertyChangeListener("value", this);
		
		intelModField = new JFormattedTextField(intelModFormat);
		intelModField.setValue(new Integer(intelMod));
		intelModField.setColumns(2);
		intelModField.setEditable(false);
		
		totalIntelField = new JFormattedTextField(totalIntelFormat);
		totalIntelField.setValue(new Integer(totalIntel));
		totalIntelField.setColumns(2);
		totalIntelField.setEditable(false);
		
		totalIntelModField = new JFormattedTextField(totalIntelModFormat);
		totalIntelModField.setValue(new Integer(totalIntelMod));
		totalIntelModField.setColumns(2);
		totalIntelModField.setEditable(false);
		
		wisField = new JFormattedTextField(wisFormat);
		wisField.setValue(new Integer(wis));
		wisField.setColumns(3);
		wisField.addPropertyChangeListener("value", this);
		
		wisModField = new JFormattedTextField(wisModFormat);
		wisModField.setValue(new Integer(wisMod));
		wisModField.setColumns(2);
		wisModField.setEditable(false);
		
		totalWisField = new JFormattedTextField(totalWisFormat);
		totalWisField.setValue(new Integer(totalWis));
		totalWisField.setColumns(2);
		totalWisField.setEditable(false);
		
		totalWisModField = new JFormattedTextField(totalWisModFormat);
		totalWisModField.setValue(new Integer(totalWisMod));
		totalWisModField.setColumns(2);
		totalWisModField.setEditable(false);
		
		chaField = new JFormattedTextField(chaFormat);
		chaField.setValue(new Integer(cha));
		chaField.setColumns(3);
		chaField.addPropertyChangeListener("value", this);
		
		chaModField = new JFormattedTextField(chaModFormat);
		chaModField.setValue(new Integer(chaMod));
		chaModField.setColumns(2);
		chaModField.setEditable(false);
		
		totalChaField = new JFormattedTextField(totalChaFormat);
		totalChaField.setValue(new Integer(totalCha));
		totalChaField.setColumns(2);
		totalChaField.setEditable(false);
		
		totalChaModField = new JFormattedTextField(totalChaModFormat);
		totalChaModField.setValue(new Integer(totalChaMod));
		totalChaModField.setColumns(5);
		totalChaModField.setEditable(false);
		
		strLabel.setLabelFor(strField);
		dexLabel.setLabelFor(dexField);
		conLabel.setLabelFor(conField);
		intelLabel.setLabelFor(intelField);
		wisLabel.setLabelFor(wisField);
		chaLabel.setLabelFor(chaField);
		
		
		//Create the pane for base value labels
		
		JPanel labelPane = new JPanel(new GridLayout(0,1));
		labelPane.add(strLabel);
		labelPane.add(dexLabel);
		labelPane.add(conLabel);
		labelPane.add(intelLabel);
		labelPane.add(wisLabel);
		labelPane.add(chaLabel);
		
		//Create the pane for title labels
		
		JPanel labelPane2 = new JPanel(new GridLayout(1,0));
		labelPane2.add(blankLabel);
		labelPane2.add(baseLabel);
		labelPane2.add(baseModLabel);
		labelPane2.add(totalLabel);
		labelPane2.add(totalModLabel);
		
		/*JPanel labelPane3 = new JPanel(new GridLayout(0,1));
		labelPane3.add(strLabel);
		labelPane3.add(dexLabel);
		labelPane3.add(conLabel);
		labelPane3.add(intelLabel);
		labelPane3.add(wisLabel);
		labelPane3.add(chaLabel);*/
		
		//Create the panel that holds the editable base values
		
		JPanel basePane = new JPanel(new GridLayout(0,2));
		basePane.add(strField);
		basePane.add(strModField);
		basePane.add(dexField);
		basePane.add(dexModField);
		basePane.add(conField);
		basePane.add(conModField);
		basePane.add(intelField);
		basePane.add(intelModField);
		basePane.add(wisField);
		basePane.add(wisModField);
		basePane.add(chaField);
		basePane.add(chaModField);
		
		
		//Create the panel that holds the base modifiers
		
		JPanel totalPane = new JPanel(new GridLayout(0,2));
		totalPane.add(totalStrField);
		totalPane.add(totalStrModField);
		totalPane.add(totalDexField);
		totalPane.add(totalDexModField);
		totalPane.add(totalConField);
		totalPane.add(totalConModField);
		totalPane.add(totalIntelField);
		totalPane.add(totalIntelModField);
		totalPane.add(totalWisField);
		totalPane.add(totalWisModField);
		totalPane.add(totalChaField);
		totalPane.add(totalChaModField);
		
		
		
		JPanel statPane = new JPanel(new GridLayout(1,0));
		//statPane.add(labelPane);
		statPane.add(basePane);
		statPane.add(totalPane);
		
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 80));
		add(labelPane, BorderLayout.WEST);
		add(statPane, BorderLayout.CENTER);
		//add(fieldPane, BorderLayout.CENTER);
		add(labelPane2, BorderLayout.NORTH);
		//add(modPane, BorderLayout.EAST);
		
	}
	private void setUpFormats(){
		//strFormat = NumberFormat.getNumberInstance();
	}
	/** Called when a field's "value" property changes. */
    public void propertyChange(PropertyChangeEvent e) {
    	int modChange;
        Object source = e.getSource();
        if (source == strField) {
            str = ((Number)strField.getValue()).intValue();
            totalStr = ((Number)strField.getValue()).intValue();
            totalStrField.setValue(new Integer(str));
            modChange = computeMod(str);
            strModField.setValue(new Integer(modChange));
            modChange = computeMod(totalStr);
            totalStrModField.setValue(new Integer(modChange));
        } else if (source == dexField) {
            dex = ((Number)dexField.getValue()).intValue();
            modChange = computeMod(dex);
            dexModField.setValue(new Integer(modChange));
        } else if (source == conField) {
            con = ((Number)conField.getValue()).intValue();
            modChange = computeMod(con);
            conModField.setValue(new Integer(modChange));
        } else if (source == intelField){
        	intel = ((Number)intelField.getValue()).intValue();
        	modChange = computeMod(intel);
            intelModField.setValue(new Integer(modChange));
        } else if (source == wisField){
        	wis = ((Number)wisField.getValue()).intValue();
        	modChange = computeMod(wis);
            wisModField.setValue(new Integer(modChange));
        } else if (source == chaField){
        	cha = ((Number)wisField.getValue()).intValue();
        	modChange = computeMod(cha);
            chaModField.setValue(new Integer(modChange));
        }
    }
    int computeMod(int stat){
    	int result;
    	result = (stat - 10)/2;
    	return result;
    }
	public int getConMod() {
		return conMod;
	}

}
