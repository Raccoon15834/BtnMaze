package das.anusha.btnmaze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int[] layoutNums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        layoutNums = new int[]{R.layout.layout1,R.layout.layout2,R.layout.layout3,
                R.layout.layout4,R.layout.layout5,R.layout.layout6,R.layout.layout7};
    }


}
//TODO: 3:37 of vid 8 activities and intents
//on create fills scroll view with buttons, timer?

//SUBMIT: P3L04aDasAnushaLayouts.apk
//7 srnshots of layouts, 7 layout.xml
//video, apk of embellishmetns