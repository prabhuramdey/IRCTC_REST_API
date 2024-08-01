package in.jsp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.jsp.request.Passenger;
import in.jsp.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, Ticket>ticketMap=new HashMap<>();
	private Integer ticketNumber=1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {

		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketNumber(ticketNumber);
		t.setTicketCost(250.00);
		t.setStatus("CONFIRMED");
		ticketMap.put(ticketNumber, t);
		ticketNumber++;
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {

		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}	
		return null;
	}

}
