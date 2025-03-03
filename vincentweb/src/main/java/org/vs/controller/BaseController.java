package org.vs.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private static final String VIEW_HTML = "/pages/index2.html";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {

		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		logger.debug("[welcome] counter : {}", counter);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
		
//		String url = "";
//		url = "redirect: " + VIEW_HTML;
//		logger.debug("url ", url);
//		System.out.println("url : "+ url);
//		 return url;
//		
	}
	
	@RequestMapping(value = "/test.html", method = RequestMethod.GET)
	public String test() {


		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "redirect:test.html";
		
//		String url = "";
//		url = "redirect: " + VIEW_HTML;
//		logger.debug("url ", url);
//		System.out.println("url : "+ url);
//		 return url;
//		
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		return VIEW_INDEX;

	}

}