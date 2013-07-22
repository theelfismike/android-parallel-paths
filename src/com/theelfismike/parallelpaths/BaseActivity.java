package com.theelfismike.parallelpaths;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public abstract class BaseActivity extends Activity {

    public static final String EXTRA_FINISH_ON_LAUNCH = "extraFinishOnLaunch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean finishOnLaunch = getIntent().getBooleanExtra(EXTRA_FINISH_ON_LAUNCH, false);
        if (finishOnLaunch) {
            finish();
            return;
        }

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle(this.getClass().getSimpleName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                launchHomeScreen();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigateUp() {
        finish();
        return true;
    }

    private void launchHomeScreen() {
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                + Intent.FLAG_ACTIVITY_CLEAR_TOP
                + Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(homeIntent);
    }
}
