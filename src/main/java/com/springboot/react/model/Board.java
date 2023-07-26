package com.springboot.react.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@SequenceGenerator(
        name="seq_board_gen",		// 시퀀스 생성기의 이름을 지정
        sequenceName="seq_board",	// 시퀀스의 이름을 지정 (IDX_SEQ)
        initialValue=1,			// 시퀀스의 초기값을 설정
        allocationSize=1		// 시퀀스의 증가량을 설정
        )

@Data
@Entity	//객체라는 걸 인식 시켜주는 것
@Table(name="tbl_board")
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,	// 시퀀스 생성기를 통해 시퀀스를 만들고 ID에 자동으로 주입
		generator = "seq_board_gen")
	
	@Column(name="bno")
	private Integer boardBno;
	
	@Column(name="title")
	private String boardTitle;
	
	@Column(name="content")
	private String boardContent;

	@Column(name="writer")
	private String boardWriter;

//	@Column(name="regDate")
//	private Date regDate;
	
}
