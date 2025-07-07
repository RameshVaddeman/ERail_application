package in.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {

	private Integer ticketId;
	private String from;
	private String to;
	private String tktCost;
	private String ticketStatus;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTktCost() {
		return tktCost;
	}

	public void setTktCost(String tktCost) {
		this.tktCost = tktCost;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", tktCost=" + tktCost+
				"Email ID="+ email + ", ticketStatus=" + ticketStatus + "]";
	}

}
