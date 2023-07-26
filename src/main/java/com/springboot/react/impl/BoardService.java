package com.springboot.react.impl;

import com.springboot.react.model.Board;

//프론트와 백을 연계 시켜주는 interface (기능명세 클래스)
public interface BoardService {
	
	void insert(Board board);
	
	void update(Board board);
	
	void delete(Board board);
	
	Board select();
	
}
