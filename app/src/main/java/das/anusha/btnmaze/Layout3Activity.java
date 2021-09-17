package das.anusha.btnmaze;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Layout3Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        int[] btns = new int[]{R.id.btnH3, R.id.btnO3, R.id.btnY3};
        Class[] scrns = new Class[]{MainActivity.class, Layout4Activity.class,Layout6Activity.class};

        BtnSetter.setBtns(btns, scrns, this);
    }
}
