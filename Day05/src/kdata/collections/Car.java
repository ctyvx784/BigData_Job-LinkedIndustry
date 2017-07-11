package kdata.collections;

public class Car extends Vehicle {
	public Car(int num, String color) {
		super(num, color);
		// TODO Auto-generated constructor stub
	}
	
	public Car(int num, String color, int door)
	{
		super(num, color);
		this.door = door;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + door;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (door != other.door)
			return false;
		return true;
	}

	private int door;

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

}
