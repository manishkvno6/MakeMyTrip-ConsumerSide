package com.nandrekha.service;

import com.nandrekha.dto.Passenger;
import com.nandrekha.dto.Ticket;

import reactor.core.publisher.Mono;

public interface MakeMyTripService {
	
	public Mono<Ticket> bookTicket(Passenger passDetails);

	public Mono<Ticket[]> showBookedTickets();

}
