package das.anusha.btnmaze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        //take btns, and set
        int[] btns = new int[]{R.id.btnP1, R.id.btnB1, R.id.btnO1, R.id.btnG1};
        Class[] scrns = new Class[]{Layout2Activity.class, Layout3Activity.class, Layout4Activity.class, Layout5Activity.class};


        BtnSetter.setBtns(btns, scrns, this);
    }


}

//on create fills scroll view with buttons, timer?

//SUBMIT: P3L04aDasAnushaLayouts.apk
//7 srnshots of layouts, 7 layout.xml
//video, apk of embellishmetns