package com.bbva.wikj.lib.r004.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r004.WIKJR004;
import com.bbva.wikj.lib.r005.WIKJR005;


public abstract class WIKJR004Abstract extends AbstractLibrary implements WIKJR004 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR005 wikjR005;

	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	public void setWikjR005(WIKJR005 wikjR005) {
		this.wikjR005 = wikjR005;
	}

}