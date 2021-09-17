package das.anusha.btnmaze;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Layout7Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout7);
        int[] btns = new int[]{R.id.clicker7};
        Class[] scrns = new Class[]{MainActivity.class};

        BtnSetter.setBtns(btns, scrns, this);
    }
}
