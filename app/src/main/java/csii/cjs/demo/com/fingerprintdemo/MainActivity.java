package csii.cjs.demo.com.fingerprintdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import csii.cjs.demo.com.fingerprintdemo.base.FingerPrintHelper;
import csii.cjs.demo.com.fingerprintdemo.dialog.FingerPrintDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(FingerPrintHelper.isHardWareDetected(this) && FingerPrintHelper.hasEnrolledFingerPrint(this)){
            FingerPrintDialog.showDialog(this, false, "fingerPrint", new FingerPrintDialog.OnDismissListener() {
                @Override
                public void onDismiss(boolean isSuccess) {
                    if(isSuccess){
                        setContentView(R.layout.activity_main);
                    }else{
                        finish();
                        System.exit(0);
                    }
                }
            });
        }else{
            Toast.makeText(this,"当前机型不支持安卓原生指纹系统或者你还没有设置指纹密码",Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_main);
        }
    }
}
