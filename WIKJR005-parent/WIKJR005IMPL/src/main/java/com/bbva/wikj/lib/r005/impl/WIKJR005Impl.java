package com.bbva.wikj.lib.r005.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class WIKJR005Impl extends WIKJR005Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR005Impl.class);


	@Override
	public Map<String, Object> executeSelect(String userId) {
		return this.jdbcUtils.queryForMap("query.query1",userId);
	}

	@Override
	public int executeInsert(Map<String, Object> args) {
		return this.jdbcUtils.update("query.query2", args);
	}
}
