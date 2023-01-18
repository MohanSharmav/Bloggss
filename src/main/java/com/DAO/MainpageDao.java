package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.api.mainblog;

@Repository
public class MainpageDao implements MainDao {
	
	
	JdbcTemplate jdbcTemplate; 
	@Override
	public List<MainpageDao> loadMainpages()
	{
		List<MainpageDao> mainpage=new ArrayList<MainpageDao>();
		
		String sql="select * from Blogs";
		
		jdbcTemplate.query(sql,new BlogRowMapper());
		return mainpage;
	}

}
