package com.forum.domain;

import java.math.BigDecimal;
import java.util.List;

public interface SearchPost {
	public List searchPostByBoard(BigDecimal bid);
	
	public List searchPostByUser(BigDecimal uid);
}
