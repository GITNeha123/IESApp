package com.del.ies.co.triggers.service;

import org.springframework.stereotype.Service;

import com.del.ies.batch.domain.COBatchDtls;
import com.del.ies.co.triggers.domain.COTrigger;
@Service
public interface COTriggersService {
	public COTrigger start(Integer ct);

}
