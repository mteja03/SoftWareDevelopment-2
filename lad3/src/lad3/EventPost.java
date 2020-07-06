package lad3;;

public class EventPost extends Post {
private String eventType;
public EventPost(String author,String event)
{
	super(author);
	eventType=event;
}
String getEventType()
{
	return eventType;
}
public void display()
{
	super.display();
	System.out.println(eventType);
}

}
