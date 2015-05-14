package com.matija.dunavregion.base;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Matija on 27.4.2015..
 */
public abstract class BaseActivity  extends ActionBarActivity {

    protected void replaceFragment(int layoutId, @NonNull BaseFragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(layoutId, fragment);
        transaction.commit();
    }
}

