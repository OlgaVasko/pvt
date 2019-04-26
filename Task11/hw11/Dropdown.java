package hw11;

import java.util.List;

public class Dropdown {
	
	List<String> options;
	boolean isSelected;
	String name;

	public Dropdown(String name, boolean isSelected, List<String> options) 
	{
		this.options = options;
		this.isSelected = isSelected;
		this.name = name;
	}

	public String toString() {
		return "DropDown: [name=" + name + "; isSelected=" + isSelected + "]";
	}


}
