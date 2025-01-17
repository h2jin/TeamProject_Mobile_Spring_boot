package com.example.mybooks;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mybooks.adapter.DiaryListAdapter;
import com.example.mybooks.databinding.FragmentDiaryHomeBinding;
import com.example.mybooks.models.Diary;

import java.util.ArrayList;

public class DiaryHomeFragment extends Fragment {

    private FragmentDiaryHomeBinding binding;
    private static DiaryHomeFragment diaryFragment;
    private DiaryListAdapter diaryListAdapter;
    private SharedPreferences diaryDb;
    public static boolean newNote;

    private ArrayList<Diary> diaryList = new ArrayList<>();

    public DiaryHomeFragment() {
        // Required empty public constructor
    }

    public static DiaryHomeFragment newInstance() {
        if (diaryFragment == null) {
            diaryFragment = new DiaryHomeFragment();
        }
        return diaryFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDiaryHomeBinding.inflate(inflater, container, false);
        setDiaryRecyclerView();
        addEventListener();
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        binding.refreshButton.setOnClickListener(v -> {
            getDiaryDb();
            addToDiaryHome();
            newNote = false;
        });
        binding.refreshButton.callOnClick();
    }

    public void setDiaryRecyclerView() {
        diaryListAdapter = new DiaryListAdapter();
        diaryListAdapter.initDiaryList(diaryList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        binding.diaryListContainer.setAdapter(diaryListAdapter);
        binding.diaryListContainer.setLayoutManager(layoutManager);

    }

    public void addEventListener() {
        binding.diaryWriteButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DiaryWriteActivity.class);
            startActivity(intent);
            newNote = true;
        });

        binding.refreshContainer.setOnRefreshListener(() -> {
            getDiaryDb();
            addToDiaryHome();
            newNote = false;
            binding.refreshContainer.setRefreshing(false);
        });
    }

    public Diary getDiaryDb() {
        diaryDb = getContext().getSharedPreferences(DiaryWriteActivity.DIARY_DATABASE, Context.MODE_PRIVATE);
        int diaryNumber = diaryDb.getInt(DiaryWriteActivity.DIARY_NUMBER, -1);

        if (newNote) {
            if (diaryNumber != -1) {

                String diaryTitle = diaryDb.getString(DiaryWriteActivity.DIARY_TITLE, "제목없음");
                String currentDate = diaryDb.getString(DiaryWriteActivity.CURRENT_DATE, "날짜없음");
                String diaryContent = diaryDb.getString(DiaryWriteActivity.DIARY_CONTENT, "내용없음");

                Diary diary = new Diary(diaryNumber, diaryTitle, currentDate, diaryContent);

                return diary;
            }
        }
        return null;
    }

    public void addToDiaryHome() {
        ArrayList<Diary> list = new ArrayList<>();
        Diary diary = getDiaryDb();

        if (diary != null) {
            list.add(diary);
            diaryListAdapter.addDiaryList(list);
        }
    }
}