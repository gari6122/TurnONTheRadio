package com.springboot.react.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.react.model.Board;
import com.springboot.react.repository.BoardRepository;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository dao;
	
	@Override
	public void insert(Board board) {
		dao.save(board);
		
	}
	
	//글 수정
	@Override
	public void update(Board board) {
		//최근 글을 가져오기
		Board currBoard = dao.findTopByOrderByBoardBnoDesc();
		
		currBoard.setBoardTitle(board.getBoardTitle());
		currBoard.setBoardContent(board.getBoardContent());
		currBoard.setBoardWriter(board.getBoardWriter());
//		currBoard.setRegDate(board.getRegDate());
		
		
		//글목록에 수정한거 인서트
		dao.save(currBoard);
	}

	@Override
	public void delete(Board board) {
		dao.delete(board);
	}

	//글 조회
	@Override
	public Board select() {
		return dao.findTopByOrderByBoardBnoDesc();
	}
}
