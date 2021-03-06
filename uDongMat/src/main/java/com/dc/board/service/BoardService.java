package com.dc.board.service;

import java.util.List;
import java.util.Map;

import com.dc.board.vo.BoardVo;

public interface BoardService {
	
	public List<BoardVo> boardSelectList(String keyword, int start, int end);
	public BoardVo boardSelectOne(int boardNo);
	public void boardInsertOne(BoardVo boardVo);
	public int boardUpdateOne(BoardVo boardVo);
	public void boardDelete(int boardNo);
	
//	public int boardTotalCount();
	
	public int boardSelectTotalCount(String keyword);
}
