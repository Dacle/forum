package com.forum.domain.Impl;

import java.math.BigDecimal;
import java.util.List;

import com.forum.Dao.PostDao;
import com.forum.Dao.Impl.PostDaoImpl;
import com.forum.domain.SearchPost;

public class SearchPostImpl implements SearchPost{

	PostDao postDao = new PostDaoImpl();
	
	@Override
	public List searchPostByBoard(BigDecimal bid) {
		// TODO Auto-generated method stub
		return postDao.showPost(bid);
	}

	@Override
	public List searchPostByUser(BigDecimal uid) {
		// TODO Auto-generated method stub
		return postDao.findUserPost(uid);
	}

}
