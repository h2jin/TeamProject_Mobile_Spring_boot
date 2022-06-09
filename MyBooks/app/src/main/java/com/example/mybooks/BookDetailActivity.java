package com.example.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetailActivity extends AppCompatActivity {

    private ScaleAnimation scaleAnimation;
    //애니메이션이 일어나는 동안의 회수, 속도를 조절하거나 시작과 종료시의 효과를 추가 할 수 있다
    private BounceInterpolator bounceInterpolator;
    private CompoundButton likeButton; // 찜 버튼
    private Button purchaseBtn; // 구매하기 버튼
    private ImageView bookImage; // 책이미지
    private TextView bookTitle; // 책제목
    private TextView author; // 작가
    private TextView publishDate; // 출판일
    private TextView summaryText; // 줄거리 내용

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        scaleAnimation = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.7f, Animation.RELATIVE_TO_SELF, 0.7f);

        scaleAnimation.setDuration(500);
        bounceInterpolator = new BounceInterpolator();
        scaleAnimation.setInterpolator(bounceInterpolator);

        likeButton = findViewById(R.id.likeButton);

        likeButton.setOnCheckedChangeListener((compoundButton, isChecked) ->
                compoundButton.startAnimation(scaleAnimation));

    }

    public void onPurchaseBtnClicked(View view) { // 구매버튼 클릭 메소드
        // 여기에 구매 URL                                           여기에 넣기!!
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
        startActivity(intent);
    }
}