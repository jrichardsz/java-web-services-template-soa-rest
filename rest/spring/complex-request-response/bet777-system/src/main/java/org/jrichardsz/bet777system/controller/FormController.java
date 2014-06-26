package org.jrichardsz.bet777system.controller;

import java.util.*;

import org.jrichardsz.bet777system.common.*;
import org.jrichardsz.bet777system.model.*;
import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


/**
 * Handles requests for the Employee service.
 */
@Controller
public class FormController {
	
	private static final Logger logger = LoggerFactory.getLogger(FormController.class);
	
	@RequestMapping(value = RestURIConstants.GET_MATCH_FASE_A, method = RequestMethod.GET)
	public @ResponseBody Response getMatch(@PathVariable("id") int matchId) {
		logger.info("retrieve request");
		
		Response response = new Response();
		
		response.setCode("0000");
		response.setMessage("sucess");		
		
		Match match = new Match();
		match.setIdMatch(matchId);
		match.setIdTeam01(1);
		match.setLabelTeam01("Brazil");
		match.setLabelTeam02("Argentina");		
		match.setIdTeam02(1);
		match.setDateMatch(new Date());
		
		response.setContent(match);
		
		logger.info("send sucess response");
		return response;
	}	
	
	@RequestMapping(value = RestURIConstants.SEND_BETS_FASE_A, method = RequestMethod.POST)
	public @ResponseBody Response sendBetsFaseA(@RequestBody Request request) {
		logger.info("retrieve request");
		
		Response response = new Response();
		
		response.setCode("0000");
		response.setMessage("sucess");			
		response.setContent("");
		
		logger.info("send sucess response");
		return response;
	}	
	
}
