package io.sample.h2.dao;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.stereotype.Repository;

import io.sample.h2.bean.model.UserModel;

@Repository
public interface SUserDao {

	public UserModel sltUser(Map<String, Object> map) throws SQLException;

}