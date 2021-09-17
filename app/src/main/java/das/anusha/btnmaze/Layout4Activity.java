package das.anusha.btnmaze;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Layout4Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
        int[] btns = new int[]{R.id.btnP4, R.id.btnY4, R.id.btnG4};
        Class[] scrns = new Class[]{Layout2Activity.class, Layout6Activity.class, Layout5Activity.class};

        BtnSetter.setBtns(btns, scrns, this);
    }
}
