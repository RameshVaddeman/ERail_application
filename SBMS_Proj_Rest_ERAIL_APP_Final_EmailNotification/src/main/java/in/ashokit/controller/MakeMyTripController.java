package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.request.*;
import java.util.*;

@Controller
public class MakeMyTripController {

	@Autowired
	private PassengerRepository PassengerRepository;
	
	@Autowired
	private EmailService emailService;

	public MakeMyTripController() {
		System.out.println("MakeMyTripController::0-param Constructor");
	}

	@GetMapping("/")
	public String index() {
		System.out.println("MakeMyTripController::index");
		return "index";
	}
	
	@GetMapping("/bookTicket")
	public String bookTicket() {
		System.out.println("MakeMyTripController::bookTicket");
		return "bookTicket";
	}

	@PostMapping("/insertData")
	public String insertData(Passenger request, Model m) {

		System.out.println("MakeMyTripController::insertData");
		Passenger p = new Passenger();

		p.setName(request.getName());
		p.setFrom(request.getFrom());
		p.setTo(request.getTo());
		p.setEmail(request.getEmail());
		p.setCost("15" + PassengerRepository.SelectMaxID() + "00.00 INR");
		p.setId(PassengerRepository.SelectMaxID() + 1);

		System.out.println("request=" + request);
		System.out.println("p=" + p);

		PassengerRepository.save(p);

		Ticket t = new Ticket();
		t.setTicketId(p.getId());
		t.setFrom(p.getFrom());
		t.setTo(p.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTktCost(p.getCost());
		t.setEmail(p.getEmail());
		
		m.addAttribute("ticket", t);
		String subject="Ticket Booked for E-rail";
		String text="Hi "+p.getEmail()+"\n"
				+ "Thank you for using E-Rail Application  \n"
				+ "Here you can find your Ticket details  \n"
				+ "Name ="+p.getEmail()+"\n"
				+ "From ="+p.getFrom()+"\n"
				+ "To   ="+p.getTo()+"\n"
				+ "Cost ="+p.getCost()+"\n"
				+ "Ticket ID = "+p.getId()+"\n"
				+"\n"+"\n"
				+ "Thank&Regards \n"
				+ "E-rail \n"
				+ "Telangana"
				;
		
		emailService.sendEmail(p.getEmail(), subject, text);

		return "success";

	}
	@GetMapping("/searchTicket")
	public String SearchData()
	{
		return "searchTicket";
	}
	
//	@GetMapping("/sample")
//	@ResponseBody
//	public String sample()
//	{
//		return "searchTicket";
//	}
	

	@PostMapping("/searchTicket_data")
	public String SearchData_success(@RequestParam int id, Model m ) {
		
		System.out.println("MakeMyTripController::SearchData_success");
		
		Passenger ob=PassengerRepository.findById(id);
		Ticket t = new Ticket();
		t.setTicketId(id);
		t.setFrom(ob.getFrom());
		t.setTo(ob.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTktCost(ob.getCost());
		t.setEmail(ob.getEmail());
		
		m.addAttribute("ticket", t);
		
		
		return "success";

	}

}
