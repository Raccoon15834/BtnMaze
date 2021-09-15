package das.anusha.btnmaze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int[] layoutNums;
    int count=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        layoutNums = new int[]{R.layout.layout1,R.layout.layout2,R.layout.layout3,
                R.layout.layout4,R.layout.layout5,R.layout.layout6,R.layout.layout7};
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            count = (++count)%layoutNums.length;
            setContentView(layoutNums[count]);
        }
        return true;
    }
}
//TODO: fix colors, txt color, dimens, and text labls
//TODO: 3:37 of vid 8 activities and intents
//7 layout fragments maze game. will cycle through?, dynamic scroll view, timer?

//SUBMIT: P3L04aDasAnushaLayouts.apk
//7 srnshots of layouts, 7 layout.xml
//video, apk of embellishmetns