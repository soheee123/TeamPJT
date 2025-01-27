package com.pjt.service;

import java.util.List;



import com.pjt.command.BoardVO;
import com.pjt.command.Criteria;
import com.pjt.command.ReplyPageVO;
import com.pjt.command.ReplyVO;



public interface ReplyService {
	public int register(ReplyVO vo);//등록
	public ReplyVO get(int rno);//정보보기(댓글보기)
	public int modify(ReplyVO vo);//수정하기
	public int remove(int rno);//삭제하기
	public List<ReplyVO> getList(Criteria cri, int bno); //리스트보기
	public ReplyPageVO getListPage(Criteria cri ,int bno );
}
