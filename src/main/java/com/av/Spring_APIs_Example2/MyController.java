package com.av.Spring_APIs_Example2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amazon.in/shop/category")
public class MyController {
	
	@RequestMapping(value = "/tv", method = RequestMethod.GET)
	public String apiFirst() {
		return "Crystal Clear. Cinematic Sound. Your TV Awaits";
	}
	@RequestMapping(value = "/mobile", method = RequestMethod.POST)
	public String apiSecond() {
		return "Your dream phone is calling… Will you answer?";
	}
	@RequestMapping(value = "/watch", method = RequestMethod.PUT)
	public String apiThird() {
		return "Your Time. Your Style. Your Watch.";
	}
	@RequestMapping(value = "/computer", method = RequestMethod.DELETE)
	public String apiForth() {
		return "Smart Deals on Smarter Computers";
	}
	@RequestMapping(value = "/camera", method = RequestMethod.PATCH)
	public String apiFifth() {
		return "Capture Life in Every Detail";
	}
	@RequestMapping(value = "/speakers", method = RequestMethod.HEAD)
	public String apiSixth() {
		return "Feel the Sound, Not Just Hear It";
	}
	@RequestMapping(value = "/headphones", method = RequestMethod.OPTIONS)
	public String apiSeventh() {
		return "Hear Every Beat. Feel Every Vibe";
	}
	
	@GetMapping("/mencloths")
	public String apiEighth() {
		return "Style Starts Here";
	}
	@PostMapping("/sunglasses")
	public String apiNineth() {
		return "Look Sharp. Stay Cool.";
	}
	@DeleteMapping("/womencloths")
	public String apiTenth() {
		return "Fashion That Fits – You and Your Budget";
	}
	@PutMapping("/jewellery")
	public String apiEleventh() {
		return "Jewellery That Tells Your Story";
	}
	@PatchMapping("/shoes")
	public String apiTwelth() {
		return "Step Into Comfort and Style";
	}
	@GetMapping("/wallets")
	public String apiThirteenth() {
		return "Carry Your Style in Every Pocket";
	}
	@PostMapping("/handbags")
	public String apiForteenth() {
		return "Designed to Hold Your World";
	}
	@PatchMapping("/refrigerators")
	public String apiFifteenth() {
		return "Smart Cooling for Smart Kitchens";
	}

}
