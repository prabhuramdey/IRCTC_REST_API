package in.jsp.service;

import in.jsp.request.Passenger;
import in.jsp.response.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);
}
