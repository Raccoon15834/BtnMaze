package das.anusha.btnmaze;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Layout6Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout6);
        int[] btns = new int[]{R.id.btnO6, R.id.btnBNW6};
        Class[] scrns = new Class[]{Layout4Activity.class, Layout7Activity.class};

        BtnSetter.setBtns(btns, scrns, this);
    }
}
