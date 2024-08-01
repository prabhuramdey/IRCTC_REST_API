package in.jsp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.jsp.request.Passenger;
import in.jsp.response.Ticket;
import in.jsp.service.BookingService;

@RestController
public class BookingRestController {

	@Autowired
	private BookingService service;
	
	
	@PostMapping(value = "/ticket",
				 consumes = {"application/json"},
				 produces = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		System.out.println(passenger);
		Ticket t= service.bookTicket(passenger);
		return new ResponseEntity<Ticket>(t,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/ticket/{ticketNumber}",
				produces = {"application/json"})
	public Ticket getTicketByNumber(@PathVariable Integer ticketNumber) {
		return service.getTicket(ticketNumber);
	}
}
