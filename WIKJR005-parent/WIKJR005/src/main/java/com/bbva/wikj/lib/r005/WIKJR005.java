package com.bbva.wikj.lib.r005;

import java.util.Map;

public interface WIKJR005 {

	Map<String,Object> executeSelect(String userId);
	int executeInsert(Map<String,Object> args);

}
