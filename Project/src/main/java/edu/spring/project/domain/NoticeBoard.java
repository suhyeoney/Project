package edu.spring.project.domain;

import java.util.Date;

public class NoticeBoard {
	private int noticeboard_no;
	private int noticeboard_rno;
	private String noticeboard_title;
	private String noticeboard_content;
	private Date date;
	
	public NoticeBoard() {}

	public NoticeBoard(int noticeboard_no, int noticeboard_rno, String noticeboard_title, String noticeboard_content,
			Date date) {
		super();
		this.noticeboard_no = noticeboard_no;
		this.noticeboard_rno = noticeboard_rno;
		this.noticeboard_title = noticeboard_title;
		this.noticeboard_content = noticeboard_content;
		this.date = date;
	}

	public int getNoticeboard_no() {
		return noticeboard_no;
	}

	public void setNoticeboard_no(int noticeboard_no) {
		this.noticeboard_no = noticeboard_no;
	}

	public int getNoticeboard_rno() {
		return noticeboard_rno;
	}

	public void setNoticeboard_rno(int noticeboard_rno) {
		this.noticeboard_rno = noticeboard_rno;
	}

	public String getNoticeboard_title() {
		return noticeboard_title;
	}

	public void setNoticeboard_title(String noticeboard_title) {
		this.noticeboard_title = noticeboard_title;
	}

	public String getNoticeboard_content() {
		return noticeboard_content;
	}

	public void setNoticeboard_content(String noticeboard_content) {
		this.noticeboard_content = noticeboard_content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
