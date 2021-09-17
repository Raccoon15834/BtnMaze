package das.anusha.btnmaze;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Layout5Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout5);
        int[] btns = new int[]{R.id.btnO5};
        Class[] scrns = new Class[]{Layout4Activity.class};

        BtnSetter.setBtns(btns, scrns, this);
    }
}
