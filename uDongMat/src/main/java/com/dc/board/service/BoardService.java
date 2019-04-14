package com.dc.board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.dc.board.vo.BoardVo;

public interface BoardService {
	
	public List<BoardVo> boardSelectList();
	public BoardVo boardSelectOne(int boardNo);
	public void boardInsertOne(BoardVo boardVo);
}
