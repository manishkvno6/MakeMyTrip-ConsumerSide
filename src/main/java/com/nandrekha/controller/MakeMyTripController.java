package com.nandrekha.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandrekha.dto.Passenger;
import com.nandrekha.dto.Ticket;
import com.nandrekha.service.MakeMyTripService;

import reactor.core.publisher.Mono;

@RestController
public class MakeMyTripController {
	private MakeMyTripService service;

	public MakeMyTripController(MakeMyTripService service) {
		this.service = service;
	}

	
	/*
	 * Form binding
	 */
	@GetMapping("/")
	public String trainTicket(Model model) {
		model.addAttribute("passDetails", new Passenger());
		return "bookTicket";
	}

	
	/*
	 * Ticket booking
	 */
	@PostMapping("/booking")
	public String ticketBooking(@ModelAttribute("passDetails") Passenger passDetails, Model model) {
		Mono<Ticket> bookTicket = service.bookTicket(passDetails);
		model.addAttribute("successMsg", "Your Ticket Confirmed! ");
		model.addAttribute("passDetails", new Passenger());
		return "bookTicket";
	}

	
	/*
	 * Get all confirmed ticket
	 */

	@GetMapping("/conTicket")
	public String confirmedTicket(Model model) {
		Mono<Ticket[]> showTickets = service.showBookedTickets();
		model.addAttribute("tickets", showTickets);
		return "index";
	}
}
