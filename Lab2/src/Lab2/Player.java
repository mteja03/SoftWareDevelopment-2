package Lab2;

public class Player {
	private Room room;
	private String name;
	private Room currentRoom; 
	public void setRoom(Room room) {
		this.room = room;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room getRoom() {
		return room;
	}
	public String getName() {
		return name;
	}
	public void setcurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	
	public Room getcurrentRoom() {
		return currentRoom;
	}
	
	
	Player()
	{
		
	}
	
}