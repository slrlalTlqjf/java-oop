package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
/**
 * 요구사항(기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지에서 회원정보보기
 * 3. 비번 수정
 * 4. 회원탈퇴
 * ***************
 * <관리자기능>
 * 5. 회원목록
 * 6. 아이디검색
 * */
public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members = new MemberBean[3];
		count = 0;
	}
	/**
	 * 1.회원가입
	 **/
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	/**
	 * 2.마이페이지에서 회원정보보기*/
	public String getMyPage(MemberBean param) {
		return param.toString();
	}
	/**
	 * 3.비번 수정*/
	public String changePassword(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		return msg;
	}
	/**
	 * 4. 회원탈퇴*/
	public String Withdrawal(MemberBean param) {
		String msg = "회원탈퇴 성공";
		return msg;
	}
	/**
	 * 5. 회원목록*/
	public String list() {
		String msg = "";
		for(int i=0; i<count; i++) {
			msg += members[i].toString()+", \n";
	}
		return msg;
	}
	/**
	 * 6. 아이디검색*/
	public MemberBean findByID(String ID) {
		MemberBean member = new MemberBean();
		for(int i = 0; i<count; i++) {
			if(ID.equals(members[i].getID()) ) {
				member = members[i];
			}				
	}
		return member;
	}
}