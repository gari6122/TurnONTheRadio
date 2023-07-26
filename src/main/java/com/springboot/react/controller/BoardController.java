package com.springboot.react.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.react.impl.BoardService;
import com.springboot.react.model.Board;

@RestController
//@CrossOrigin
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "insertProcess.do")
	public void insertProcess(Board board) {
		boardService.insert(board);
	}

	@RequestMapping(value = "updateProcess.do")
	public void updateProcess(Board board) {
		boardService.update(board);
	}

	@RequestMapping(value = "deleteProcess.do")
	public void deleteProcess(Board board) {
		boardService.delete(board);
	}

	@RequestMapping(value = "view.do")
	public Board viewBoard() {
		Board board = boardService.select();
		return board;
	}
	
	
}
