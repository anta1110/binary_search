

import java.util.*; 

public enum attendeeStatus{
	ACCEPTED,DECLINED, NEUTRAL;
}



public class User{
    private int id;
    private  String id;
    private String firstname;
    private String lastname;
    private String email;
    private Calendar cal;
    
    User(String name){
    	this.name = name;
    	this.meetings = new ArrayList<>();
    }
}

class userprofile{
	
}
 
class Time{
	String day;
	int start;
}

public abstract class Event{
	private Date startTime;
	private Date endTime;
	private USer organizer;
}

public interface Meetingdetail {
	//meeting/events date starttime and endtime
	void getMeetingdetails(Date startDate, Date endDate){
		this.startDate = startDate;
		this.endDate = endDate;
		
		
		
	}
	//location detial of the event
	void locationDetail(String location) {
		this.location=location;
		
	}
	
	void showHoliday(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
		
	}
	
	void getMeetingData() {
		//Mapping to get the meeting details param1 is day without time and List is the meetings sorted by time

		Map<String, List<String>> hm = new hm<>();
		
		Map<String> holiday = new holiday<>();
		
	}
	
	void updateEvent()
	{
		
	}
	
	
}

public class AttendeeDetail{
	private final User user;
	private attendeeStatus status;
	public Attendee(User user, Meeting meeting) {
		this.user = user;
		this.meeting = meeting;
		this.status = attendeeStatus.PENDING;
	}
	
	public attendeeStatus getStatus() {
		return status;
		
	}
	
	public void notifyMeeting() {
		
		String msg = "Meeting invitation";
		Dispatcher.getInstance().deliverMessage(this, msg);
		
	}
	public void acceptMeeting() {
		this.status = attendeeStatus.ACCEPTED;
		this.user.addMeeting(this.meeting);
	}
	
	public void declineMeeting() {
		this.status = attendeeStatus.DECLINED;
		this.user.addMeeting(this.meeting);
		
	}
}
public calendarApp implements Meetingdetail { 
	
	public class calendarManager{
		
		public boolean createEvent(int userId, Date starttime, Date endtime)
	}
	
	public enum 
    public static void main(String args[]) 
    { 
       calendarApp c = calendarApp.getInstance(); 
        System.out.println("The Current Date is:" + c.getTime()); 
    } 
} 
}
