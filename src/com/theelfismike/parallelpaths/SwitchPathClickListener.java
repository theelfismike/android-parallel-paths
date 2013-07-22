package com.theelfismike.parallelpaths;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class SwitchPathClickListener implements View.OnClickListener {
    private Class taskBaseClass;
    private Context context;

    public SwitchPathClickListener(Context context, Class<? extends Activity> taskBaseClass) {
        this.taskBaseClass = taskBaseClass;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent taskSwitchIntent = new Intent(context, taskBaseClass);
        taskSwitchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(taskSwitchIntent);
    }
}
