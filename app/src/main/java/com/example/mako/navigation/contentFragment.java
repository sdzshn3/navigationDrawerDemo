package com.example.mako.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Mako on 1/13/2017.
 */
public class contentFragment extends Fragment {

    public contentFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content,container,false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("hello"));
        words.add(new Word("hi"));
        words.add(new Word("how are u"));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
