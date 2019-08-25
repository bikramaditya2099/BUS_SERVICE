package com.bus.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.beans.BusInfo;
import com.bus.util.ApplicationEnum;
import com.bus.util.ResponseBean;
@Repository
public class BusDaoImpl implements BusDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public ResponseBean getBusInfo() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(BusInfo.class);
		List<BusInfo> list=criteria.list();
		ResponseBean bean=new ResponseBean(ApplicationEnum.BUS_INFO_SUCCESS_RESPONSE, list);
		return bean;
	}

}
