package com.bbva.wikj;

import com.bbva.wikj.dto.user.DtoOut;
import com.bbva.wikj.lib.r004.WIKJR004;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT00401MXTransaction extends AbstractWIKJT00401MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00401MXTransaction.class);


	@Override
	public void execute() {
		WIKJR004 wikjR004 = this.getServiceLibrary(WIKJR004.class);
		DtoOut dtoOut = wikjR004.execute(this.getDtoin());
		this.setDtoout(dtoOut);
	}

}
