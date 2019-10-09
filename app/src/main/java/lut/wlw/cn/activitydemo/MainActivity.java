package lut.wlw.cn.activitydemo;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 *
 * @Description:     类作用描述
 * @Author:         Mwj
 * @CreateDate:     ${DATE}
 * @UpdateUser:     更新者：
 * @Version:        1.0
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGo = (Button) findViewById(R.id.btn_go);
        Log.i(TAG, "onCreate:执行了 ");
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:执行了 ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume:执行了 ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause:执行了 ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop:执行了 ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy:执行了 ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart:执行了 ");
    }
}
