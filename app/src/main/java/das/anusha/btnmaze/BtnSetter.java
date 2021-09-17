package das.anusha.btnmaze;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BtnSetter extends AppCompatActivity{
    public static void setBtns(int[] btns, Class[] scrns, Activity oriScrn){
        if (btns.length!=scrns.length) return;
        for(int i=0; i<btns.length; i++){
            int num = i;
            oriScrn.findViewById(btns[num]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent btnIntent = new Intent(oriScrn.getApplicationContext(), scrns[num]);
                    oriScrn.startActivity(btnIntent);
                }
            });
        }
    }
}
