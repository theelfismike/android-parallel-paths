package com.theelfismike.parallelpaths;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A1Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_1);

        View nextButton = findViewById(R.id.forwardButton);
        nextButton.setOnClickListener(new NextButtonClickListener());

        View switchToBButton = findViewById(R.id.switchBButton);
        switchToBButton.setOnClickListener(new SwitchPathClickListener(A1Activity.this, B1Activity.class));
    }

    private class NextButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent nextActivityIntent = new Intent(A1Activity.this, A2Activity.class);
            startActivity(nextActivityIntent);
        }
    }
}
