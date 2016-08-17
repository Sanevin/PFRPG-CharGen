
public class PCharacter {
	
	public double baseAttackBonus; 
	public int skillPoints, willSave, fortSave, refSave;
	public int numfeats, numSpells;
	public int str, dex, con, intel, wis, cha, level;
	public int levelOneSpells, levelTwoSpells, levelThreeSpells, levelFourSpells;
	public int levelFiveSpells, levelSixSpells, levelSevenSpells, levelEightSpells, levelNineSpells;
	public int classSkills;
	
	public void levelUp(){
		
		
	}
	public void isFighter(){
		baseAttackBonus = 1;
		classSkills = 2;
	}
	public void isWizard(){
		
	}
	public void isRogue(){
		
	}
	public void isSorceror(){
		
	}
	public void isCleric(){
		
	}
	public void isRanger(){
		
	}
	public void isDruid(){
		
	}
	public void isMonk(){
		
	}
	public void isBarbarian(){
		
	}
	public void isBard(){
		
	}
	public void isPaladin(){
		
	}
	public void isCustomClass(int bab, int skills, int feats, int spells){
		
	}
	public void setLevel(int desiredLevel){
		level = desiredLevel;
	}
	
}
