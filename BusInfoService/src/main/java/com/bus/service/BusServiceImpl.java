package com.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dao.BusDao;
import com.bus.util.ResponseBean;
@Service
public class BusServiceImpl implements BusService{


	@Autowired
	private BusDao dao;
	@Override
	public ResponseBean getAllBuSInfo() {
		return dao.getBusInfo();
		
	}

}
