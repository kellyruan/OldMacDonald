class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound) {         
		myType = type;         
		mySound = sound;     
		myName = name;
	}
	public String getName() {
		return myName;
	}
	public String getSound(){return mySound;}     
	public String getType(){return myType;} 
}