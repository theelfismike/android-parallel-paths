package com.theelfismike.parallelpaths;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        getActionBar().setDisplayHomeAsUpEnabled(false);

        View aButton = findViewById(R.id.homescreenAButton);
        aButton.setOnClickListener(new SwitchPathClickListener(HomeActivity.this, A1Activity.class));

        View bButton = findViewById(R.id.homescreenBButton);
        bButton.setOnClickListener(new SwitchPathClickListener(HomeActivity.this, B1Activity.class));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

        // kill other tasks so that back from here will go to device home screen.
        clearTaskWithRootActivity(A1Activity.class);
        clearTaskWithRootActivity(B1Activity.class);
    }

    private void clearTaskWithRootActivity(Class<? extends Activity> taskRootClass) {
        Intent killTaskIntent = new Intent(this, taskRootClass);
        killTaskIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                + Intent.FLAG_ACTIVITY_CLEAR_TOP
                + Intent.FLAG_ACTIVITY_NO_ANIMATION);

        killTaskIntent.putExtra(EXTRA_FINISH_ON_LAUNCH, true);
        startActivity(killTaskIntent);
    }
}
