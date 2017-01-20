package io.sample.h2.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sample.h2.bean.model.UserModel;
import io.sample.h2.dao.SUserDao;
import io.sample.h2.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);

	@Autowired
	private SqlSession sSampleDao;

	public SqlSession getsSampleDao() {
		return sSampleDao;
	}

	public void setsSampleDao(SqlSession sSampleDao) {
		this.sSampleDao = sSampleDao;
	}

	@Override
	public UserModel sltUser(String name) {

		UserModel user = null;
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);

		try {

			user = sSampleDao.getMapper(SUserDao.class).sltUser(map);

		} catch (Exception e) {
			logger.error("Exception error", e);
		}

		return user;
	}

}