package cn.edu.gdmec.s07131040.demo_button;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	private Button button;
	private EditText et;
	private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.editText1);
        tv=(TextView) findViewById(R.id.textView1);
        button=(Button) findViewById(R.id.button1);
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
//				Log.i("info", "BUTTON������ˣ�ͨ��������ִ��");	
				//��ȡ��������������
				String text=et.getText().toString();
				//�������������ʾ���ı�����
				tv.setText(text);
				
			}
		});
        
    }

//public void doClick(View v){
//	Log.i("info", "Button��ť�������");
//}
    
   
}
