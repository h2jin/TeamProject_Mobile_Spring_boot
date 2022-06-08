package com.example.mybooks.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	
	// 신간 0, 베스트 1, 둘다 아니면 2
	private Integer id;
	
	// 1. 소설, 2. 추리, 3. 에세이, 4. 자기계발, 5.경제, 6. 기타, 7. 어린이
	private Integer thema;
	
	private String title;
	private String author;
	private Integer price;
	private String publicationDate;	// 출간일 
	private String publisher;	// 출판사
	private Double rating;
	private String imageUrl;
	
	public static List<Book> sampleData(){
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book(1, 1, "작별인사", "김영하", 12600, "2022년 05월 02일", "복복서가", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/225/x9791191114225.jpg"));
		list.add(new Book(1, 7, "흔한남매 10", "백난도", 12150, "2022년 04월 28일", "미래엔아이세움", 9.8, "http://image.kyobobook.co.kr/images/book/xlarge/685/x9791168411685.jpg"));
		list.add(new Book(1, 1, "불편한 편의점(40만부 기념 벚꽃 에디션)", "김호연", 12600, "2021년 04월 20일", "나무옆의자", 9.8, "http://image.kyobobook.co.kr/images/book/xlarge/188/x9791161571188.jpg"));
		list.add(new Book(1, 6, "마음의 법칙", "김희상", 14400, "2022년 02월 10일", "포레스트북스", 9.5, "http://image.kyobobook.co.kr/images/book/xlarge/685/x9791191347685.jpg"));
		list.add(new Book(1, 3, "문재인의 위로", "더 휴먼 편집부", 14220, "2022년 05월 10일", "더 휴먼", 9.6, "http://image.kyobobook.co.kr/images/book/xlarge/676/x9791164455676.jpg"));
		list.add(new Book(1, 3, "기분을 관리하면 인생이 관리된다", "김다슬", 15840, "2022년 04월 12일", "클라우디아", 9.2, "http://image.kyobobook.co.kr/images/book/xlarge/127/x9791196617127.jpg"));
		list.add(new Book(1, 6, "무엇이 옳은가", "이경식", 16020, "2022년 04월 19일", "세계사", 9.5, "http://image.kyobobook.co.kr/images/book/xlarge/805/x9788933871805.jpg"));
		list.add(new Book(1, 4, "멘탈을 바꿔야 인생이 바뀐다", "박세니", 14220, "2022년 04월 30일", "마인드셋(Mindset)", 9.6, "http://image.kyobobook.co.kr/images/book/xlarge/761/x9791191043761.jpg"));
		list.add(new Book(1, 6, "컬러애 물들다", "최진선", 15120, "2022년 05월 11일", "리드리드출판", 9.8, "http://image.kyobobook.co.kr/images/book/xlarge/610/x9788972773610.jpg"));
		list.add(new Book(1, 7, "이상한 과자 가게 전천당 14", "김정화", 10800, "2022년 04월 25일", "길벗스쿨", 9.8, "http://image.kyobobook.co.kr/images/book/xlarge/243/x9791164064243.jpg"));
		list.add(new Book(1, 6, "이어령의 마지막 수업", "김지수, 이어령", 14850, "2021년 10월 28일", "열림원", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/523/x9791170400523.jpg"));
		list.add(new Book(1, 6, "인플레이션에서 살아남기", "오건영", 16920, "2022년 05월 23일", "페이지2북스", 9.4, "http://image.kyobobook.co.kr/images/book/xlarge/661/x9791190977661.jpg"));
		list.add(new Book(1, 6, "내가 틀릴 수도 있습니다", "박미경", 14400, "2022년 04월 18일", "다산초당", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/890/x9791130689890.jpg"));
		list.add(new Book(1, 1, "어서 오세요, 휴남동 서점입니다 (여름 숲 에디션)", "황보름", 13500, "2022년 01월 17일", "클레이하우스", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/143/x9791197377143.jpg"));
		list.add(new Book(1, 1, "2022 제13회 젊은작가상 수상작품집", "임솔라, 김멜라, 김병운, 김지연, 김혜진, 서수진, 서이제", 6930, "2022년 04월 08일", "문학동네", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/887/x9788954685887.jpg"));
		list.add(new Book(1, 6, "물고기는 존재하지 않는다", "정지인", 15300, "2021년 12월 17일", "곰출판", 9.2, "http://image.kyobobook.co.kr/images/book/xlarge/156/x9791189327156.jpg"));
		list.add(new Book(1, 5, "운명을 바꾸는 부동산 투자 수업: 기초편", "정태익", 15120, "2022년 03월 22일", "리더스북", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/307/x9788901259307.jpg"));
		list.add(new Book(1, 7, "둥실이네 떡집", "김리리", 9900, "2022년 04월 22일", "비룡소", 9.9, "http://image.kyobobook.co.kr/images/book/xlarge/188/x9788949162188.jpg"));
		list.add(new Book(1, 1, "어느 날, 내 죽음에 네가 들어왔다", "김윤경", 13500, "2022년 05월 09일", "모모", 9.7, "http://image.kyobobook.co.kr/images/book/xlarge/723/x9791191043723.jpg"));
		list.add(new Book(1, 5, "나의 투자는 새벽 4시에 시작된다", "유목민", 17820, "2022년 04월 15일", "리더스북", 9.3, "http://image.kyobobook.co.kr/images/book/xlarge/703/x9788901259703.jpg"));
		return list;
	}
}
