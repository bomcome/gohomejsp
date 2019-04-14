package com.dc.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dc.board.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	String namespace = "com.dc.board.";
	
	@Override
	public List<BoardVo> boardSelectList() {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(namespace +"boardSelectList");
	}

	@Override
	public BoardVo boardSelectOne(int boardNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace +"boardSelectOne", boardNo);
	}

	@Override
	public void boardInsertOne(BoardVo boardVo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace +"boardInsertOne", boardVo);
	}
}
