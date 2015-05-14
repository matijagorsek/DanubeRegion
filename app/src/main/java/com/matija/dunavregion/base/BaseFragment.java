package com.matija.dunavregion.base;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by Matija on 27.4.2015..
 */
public abstract class BaseFragment extends Fragment {

    protected abstract void prepareUI(@NonNull View layoutView);

    protected abstract void prepareData();

    protected void replaceFragment(int layoutId, @NonNull BaseFragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(layoutId, fragment);
        if (addToBackStack) {
            transaction.addToBackStack(fragment.getTag());
        }
        transaction.commit();
    }
}
