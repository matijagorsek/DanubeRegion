package com.matija.dunavregion.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.matija.dunavregion.R;
import com.matija.dunavregion.base.BaseFragment;

/**
 * Created by Matija on 27.4.2015..
 */
public class SideMenuFragment extends BaseFragment implements View.OnClickListener {


    private ListView mSideMenuListView;
    private SideMenuAdapter mSideMenuAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_side_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        prepareUI(view);
    }

    @Override
    protected void prepareUI(@NonNull View layoutView) {
        mSideMenuListView = (ListView) layoutView.findViewById(R.id.adapter_view);
        mSideMenuAdapter = new SideMenuAdapter(getActivity());
        mSideMenuListView.setAdapter(mSideMenuAdapter);
    }

    @Override
    protected void prepareData() {
    }

    @Override
    public void onClick(View v) {

    }




}