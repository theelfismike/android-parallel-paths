package com.theelfismike.parallelpaths;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class B1Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_1);

        View nextButton = findViewById(R.id.forwardButton);
        nextButton.setOnClickListener(new NextButtonClickListener());

        View switchToAButton = findViewById(R.id.switchAButton);
        switchToAButton.setOnClickListener(new SwitchPathClickListener(B1Activity.this, A1Activity.class));
    }

    private class NextButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent nextActivityIntent = new Intent(B1Activity.this, B2Activity.class);
            startActivity(nextActivityIntent);
        }
    }
}
