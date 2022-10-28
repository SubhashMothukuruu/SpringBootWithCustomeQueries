package com.Service;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Tickets;
import com.Repo.TicketRepository;

@Service
public class TicketService implements TicketSer {
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Transactional
	public Tickets createTickets(Tickets ticket) {
		return ticketRepository.save(ticket);
	}

	@Transactional
	public Tickets updateTickets(Tickets ticket) {
		
		return ticketRepository.save(ticket);
	}

	@Transactional
	public Boolean deleteTicket(Long ticketId) {
		Boolean flag = false;
		
		if(ticketId == 0) {
			throw new IllegalArgumentException("ticket Id Can't be null.");
		}
		else {
			Tickets ticket = getById(ticketId);
			ticketRepository.delete(ticket);
			return flag;
			
		}
	}

	@Transactional
	public List<Tickets> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Transactional
	public List<Tickets> getByFirstName()throws SQLException{
		return ticketRepository.getTicketsByName();
	}

	@Transactional
	public Tickets getById(Long ticketId) {
		return ticketRepository.findById(ticketId).orElse(null);
	}

	
	

}
