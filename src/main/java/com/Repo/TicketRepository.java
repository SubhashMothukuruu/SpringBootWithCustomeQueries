package com.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Entity.Tickets;


@Repository
public interface TicketRepository extends JpaRepository<Tickets, Long>{

	
	@Query(value ="Select * from TICKETS t where t.ticket_Id between 6001 and 6003", nativeQuery = true)
	List<Tickets> getTicketsByName();
}
