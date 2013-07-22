package com.theelfismike.parallelpaths;

import android.os.Bundle;
import android.view.View;

public class A2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_2);

        View switchToAButton = findViewById(R.id.switchBButton);
        switchToAButton.setOnClickListener(new SwitchPathClickListener(A2Activity.this, B1Activity.class));
    }
}
