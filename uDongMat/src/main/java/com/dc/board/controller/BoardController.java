package com.dc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dc.board.service.BoardService;
import com.dc.board.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board/list.do", method= {RequestMethod.GET})
	public String boardList(Model model) {
		
		List<BoardVo> boardList = 
				boardService.boardSelectList();
		
		model.addAttribute("boardList", boardList);
		
		return "board/boardListView";
	}
	
	@RequestMapping(value="/board/one.do", method= {RequestMethod.GET})
	public String boardOne(Model model, int boardNo) {
		
		BoardVo boardOne = 
				boardService.boardSelectOne(boardNo);
		
		model.addAttribute("boardOne", boardOne);
		
		return "board/boardOneView";
	}
	
	@RequestMapping(value="/board/add.do", method= {RequestMethod.GET})
	public String boardAdd(Model model) {
		
		return "board/boardAddForm";
	}
	
	@RequestMapping(value="/board/addCtr.do", method= {RequestMethod.POST})
	public String boardAdd(Model model, BoardVo boardVo) {
		
		return "board/boardListView";
	}
	
	
	
	
	
	
}
