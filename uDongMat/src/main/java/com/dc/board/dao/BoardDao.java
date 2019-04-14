package com.dc.board.dao;

import java.util.List;

import com.dc.board.vo.BoardVo;

public interface BoardDao {
	
	public List<BoardVo> boardSelectList();
	public BoardVo boardSelectOne(int boardNo);
	public void boardInsertOne(BoardVo boardVo);
}
