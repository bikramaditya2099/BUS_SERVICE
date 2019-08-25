package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bus.service.BusService;
import com.bus.util.ResponseBean;

@Controller
public class BusInfoController {
	@Autowired
	BusService busService;

	@RequestMapping(value = "/getbusinfo", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseBean getBusInfo() {
		return busService.getAllBuSInfo();
	}
}
