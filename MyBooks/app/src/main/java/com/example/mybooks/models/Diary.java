package com.example.mybooks.models;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Diary {

    public int diaryId;
    public String diaryTitle;
    public String currentDate;
    public String diaryContent;

    public Diary(int diaryId, String diaryTitle, String currentDate, String diaryContent) {
        this.diaryId = diaryId;
        this.diaryTitle = diaryTitle;
        this.currentDate = currentDate;
        this.diaryContent = diaryContent;
    }

    //    public void getCurrentDate() {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Long time = System.currentTimeMillis();
//        Date date = new Date(time);
//        String getCurrentDate = simpleDateFormat.format(date);
//        currentDate = getCurrentDate;
//    }

}