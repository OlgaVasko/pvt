package hw11;

public class Field {
	
	Integer id;
	String value;

	public Field(Integer id, String value) {
		this.id = id;
		this.value = value;
	}

	public String toString() {
		return "Field: [id=" + id + "; value=" + value + "]";
	}

}
