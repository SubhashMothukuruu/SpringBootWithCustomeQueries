package com.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Tickets;
import com.Service.TicketSer;

@RestController
public class TicketController {

	@Autowired
	TicketSer ticketService;

	@PostMapping("/create")
	public Tickets createTickets(@RequestBody Tickets ticket) {
		return ticketService.createTickets(ticket);
	}

	@PutMapping("/update")
	public Tickets updateTickets(@RequestBody Tickets ticket) {

		return ticketService.updateTickets(ticket);
	}

	@DeleteMapping("/delete")
	public Boolean deleteTicket(@PathVariable Long ticketId) {
		return ticketService.deleteTicket(ticketId);
	}

	@GetMapping("/getAll")
	public List<Tickets> getAllTickets() {
		return ticketService.getAllTickets();
	}

	@GetMapping("/getByFirstName")
	public List<Tickets> getByFirstName() throws SQLException, Exception {
		return ticketService.getByFirstName();
	}

	@GetMapping("/getById")
	public Tickets getById(@PathVariable Long ticketId) {
		return ticketService.getById(ticketId);
	}

}
