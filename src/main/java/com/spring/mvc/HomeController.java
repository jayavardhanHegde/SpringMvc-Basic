package com.spring.mvc;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/skipAd", method = RequestMethod.GET)
	public ModelAndView skipAd(){
		List<String> list = getListValues();
		for(String s : list){
			System.out.println("Value is " +s);
		}
		ModelAndView model = new ModelAndView("skipAdPage");
		model.addObject("options",list);		
		return model;
	}
	
	public List<String> getListValues(){
		List<String> list = new ArrayList<String>();
		list.add("Browsing History");
		list.add("Purchase History");
		list.add("Coupons");
		list.add("Kaizan Tool");
		return list;
	}
	
	@RequestMapping(value="/browsingHistory",method = RequestMethod.GET)
	public ModelAndView getBrowsingListForUser(){
		List<String> browsingList = VirtualDb.getBrowsingHistory("Jayavardhan");
		ModelAndView browsingView = new ModelAndView("browsingView");
		browsingView.addObject("browsingList", browsingList);
		return browsingView;
	}
	
}
