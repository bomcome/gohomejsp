package com.dc.board.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.dc.board.dao.BoardDao;
import com.dc.board.vo.BoardVo;
import com.dc.util.FileUtils;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao boardDao;

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;
	
	@Override
	public List<BoardVo> boardSelectList() {
		// TODO Auto-generated method stub
		return boardDao.boardSelectList();
	}

	@Override
	public BoardVo boardSelectOne(int boardNo) {
		// TODO Auto-generated method stub
		return boardDao.boardSelectOne(boardNo);
	}

	@Override
	public void boardInsertOne(BoardVo boardVo) {
		// TODO Auto-generated method stub
		boardDao.boardInsertOne(boardVo);
	}
}
