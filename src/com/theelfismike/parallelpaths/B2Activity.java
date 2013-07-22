package com.theelfismike.parallelpaths;

import android.os.Bundle;
import android.view.View;

public class B2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_2);

        View switchToAButton = findViewById(R.id.switchAButton);
        switchToAButton.setOnClickListener(new SwitchPathClickListener(B2Activity.this, A1Activity.class));
    }
}
