package com.mercedesbenz.reifenlabel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercedesbenz.reifenlabel.dao.TierLabelEntryRepo;
import com.mercedesbenz.reifenlabel.model.TyerLabelRequest;
import com.mercedesbenz.reifenlabel.model.TyerLabelResponse;
import com.mercedesbenz.reifenlabel.model.Tyrelabelentries;

@Service
public class ReifenLabelService {
	@Autowired
	private TierLabelEntryRepo tierLabelEntryRepo;

	public List<TyerLabelResponse> getTierLabelData(TyerLabelRequest tierLabelRequest) {
		
		List<TyerLabelResponse> tierLabelResponse = null;
		String plantid = tierLabelRequest.getPlantid();
		String model = tierLabelRequest.getModel();
		List<Tyrelabelentries> tyrelabelentriesList = tierLabelEntryRepo.getTyrelabelentries(plantid, model);
		if (tyrelabelentriesList != null && !tyrelabelentriesList.isEmpty()) {
			tierLabelResponse = new ArrayList<TyerLabelResponse>();
				for (Tyrelabelentries tyreLabel : tyrelabelentriesList) {
					TyerLabelResponse tierLabelRes = new TyerLabelResponse();
					tierLabelRes.setEprelid(tyreLabel.getEprelid());
					tierLabelRes.setAsnr(tyreLabel.getAsnr());
					tierLabelResponse.add(tierLabelRes);
				}
		}
		return tierLabelResponse;
	}
}
