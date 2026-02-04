package com.nandrekha.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.nandrekha.dto.Passenger;
import com.nandrekha.dto.Ticket;
import com.nandrekha.service.MakeMyTripService;

import reactor.core.publisher.Mono;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	@Override
	public Mono<Ticket> bookTicket(Passenger passDetails) {
		WebClient webClient = WebClient.create();
		String apiUrl = "http://localhost:9090/book";

		Mono<Ticket> bodyToMono = webClient.post()
										   .uri(apiUrl)
										   .body(BodyInserters.fromValue(passDetails))
										   .retrieve()
				.bodyToMono(Ticket.class);
		return bodyToMono;
	}

	@Override
	public Mono<Ticket[]> showBookedTickets() {
		WebClient webClient = WebClient.create();
		String apiUrl = "http://localhost:9090/book";
		Mono<Ticket[]> bodyToMono = webClient.get()
											.uri(apiUrl)
											.retrieve()
											.bodyToMono(Ticket[].class);
		return bodyToMono;
	}

}
