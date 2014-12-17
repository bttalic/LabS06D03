
public class Animal {

	private String name;
	private int numLegs;
	private String type;
	/**
	 * @param name
	 * @param numLegs
	 * @param type
	 */
	public Animal(String name, int numLegs, String type) {
		System.out.println("Animal const");
		this.name = name;
		this.numLegs = numLegs;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumLegs() {
		return numLegs;
	}
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Animal [name=" + name + ", numLegs=" + numLegs + ", type="
				+ type + "]";
	}
	
	private int test(){
		return -1;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Animal)) {
			return false;
		}
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (numLegs != other.numLegs) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}


	
	
	
}
