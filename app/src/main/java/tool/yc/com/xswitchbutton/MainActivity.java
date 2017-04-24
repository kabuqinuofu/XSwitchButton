package tool.yc.com.xswitchbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Toast;

import tool.yc.com.library.SwitchButton;

public class MainActivity extends AppCompatActivity {

    private SwitchButton mSwitchButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwitchButtonView = (SwitchButton) findViewById(R.id.switch_button);
        init();
    }

    private void init() {
        mSwitchButtonView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isCheck) {
                Log.e("YC", "选中状态：" + isCheck);
                Toast.makeText(MainActivity.this, "" + isCheck, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
