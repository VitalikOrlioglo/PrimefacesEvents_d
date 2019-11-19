package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.hotkey.Hotkey;

@ManagedBean
@ViewScoped
public class EventBean {
	
	private String message;
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void event1() {
		
		System.out.println("event1...");
		setMessage("event1...");
	}
	public void event2(String s) {
		setMessage("event2 Parameter: "+s);
	}
	
	public void event3(ActionEvent e) {
		CommandButton cb =   (CommandButton) e.getSource();
		cb.setStyle("background-color:red");
		setMessage("event3 ActionEvent - getSource: "+    e.getSource());
	}
	
	public void event4() {
		setMessage(text);
	}
	
	public void change() {
		System.out.println("change...");
	}
	
	public void select() {
		System.out.println("select...");
	}
	
	public void eventKey(ActionEvent e) {
		Hotkey key = (Hotkey) e.getSource();
		
		setMessage("eventKey "+key.getBind());
	}


}
