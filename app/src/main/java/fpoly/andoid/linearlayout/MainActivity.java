package fpoly.andoid.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.LinearLayout);
    }

    public void ngang(View view) {
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
    }

    public void doc(View view) {
        linearLayout.setOrientation(LinearLayout.VERTICAL);
    }

    public void can_trai(View view) {
        linearLayout.setGravity(Gravity.START|Gravity.CENTER);
    }

    public void can_phai(View view) {
        linearLayout.setGravity(Gravity.END|Gravity.CENTER);
    }

    public void tren(View view) {
        linearLayout.setGravity(Gravity.TOP|Gravity.CENTER);
    }

    public void giua(View view) {
        linearLayout.setGravity(Gravity.CENTER);
    }

    public void duoi(View view) {
        linearLayout.setGravity(Gravity.BOTTOM|Gravity.CENTER);
    }
}