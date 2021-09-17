package das.anusha.btnmaze;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Layout2Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        //take btns, and set
        int[] btns = new int[]{R.id.btnB2, R.id.btnG2, R.id.btnH2};
        Class[] scrns = new Class[]{Layout2Activity.class, Layout5Activity.class, MainActivity.class};

        BtnSetter.setBtns(btns, scrns, this);
    }
}
