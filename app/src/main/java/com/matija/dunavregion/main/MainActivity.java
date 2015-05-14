package com.matija.dunavregion.main;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.matija.dunavregion.R;
import com.matija.dunavregion.base.BaseActivity;


public class MainActivity extends BaseActivity {

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initDrawerLayout();
    }

    private void initDrawerLayout() {
        Toolbar mDrawerToolbar = (Toolbar) findViewById(R.id.toolbar);

        mDrawerToolbar.setTitle(R.string.app_name);
        mDrawerToolbar.setTitleTextColor(0xFFFFFFFF);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_container);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mDrawerToolbar, R.string.app_name, R.string.app_name);
        mDrawerToggle.setDrawerIndicatorEnabled(true);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        replaceFragment(R.id.side_menu_container, new SideMenuFragment(), false);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
}
