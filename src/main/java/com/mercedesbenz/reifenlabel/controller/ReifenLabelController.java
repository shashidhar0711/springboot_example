package com.mercedesbenz.reifenlabel.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mercedesbenz.reifenlabel.model.TyerLabelRequest;
import com.mercedesbenz.reifenlabel.model.TyerLabelResponse;
import com.mercedesbenz.reifenlabel.service.ReifenLabelService;
/**
 * This class is annotated with Restcontroller , this class will take inputs from postman 
 * @author VNEELAM
 *
 */
@RestController
@RequestMapping("/api")

public class ReifenLabelController {
	private final static Logger logger = LoggerFactory.getLogger(ReifenLabelController.class);
	@Autowired
	private ReifenLabelService reifenLabelService;
	@Autowired
	private Gson gson;
    /**
     * This method will take input as TierLabelRequest Type class data based on TierLabelRequest data it will return list of TierLabelResponse( eprelid,asnr) 
     * @param tierLabelRequest
     * @return List of TierLabelResponse 
     */
	@RequestMapping(value = "/getlabel", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<TyerLabelResponse>> getTierLabelData(@RequestBody TyerLabelRequest tierLabelRequest) {
			logger.info("\n calling input request from ReifenLabelController.getTierLabelData(): {}",gson.toJson(tierLabelRequest));
			List<TyerLabelResponse> tierResponseList = reifenLabelService.getTierLabelData(tierLabelRequest);
			
		return new ResponseEntity<>(tierResponseList, HttpStatus.OK);
	}
}
