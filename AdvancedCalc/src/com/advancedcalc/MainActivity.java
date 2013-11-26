package com.advancedcalc;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	EditText answerText;	
	Button butt0,butt1,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9,buttDot,buttAdd,buttSub,buttMul,buttDiv,buttAc,buttAns;
	int answer, currentValue,dot=0,flag=1;
	String operation=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 answerText = (EditText)findViewById(R.id.answerText);
	        
	        butt0 = (Button)findViewById(R.id.button0);
	        butt1 = (Button)findViewById(R.id.button1);
	        butt2 = (Button)findViewById(R.id.button2);
	        butt3 = (Button)findViewById(R.id.button3);
	        butt4 = (Button)findViewById(R.id.button4);
	        butt5 = (Button)findViewById(R.id.button5);
	        butt6 = (Button)findViewById(R.id.button6);
	        butt7 = (Button)findViewById(R.id.button7);
	        butt8 = (Button)findViewById(R.id.button8);
	        butt9 = (Button)findViewById(R.id.button9);
	        buttDot = (Button)findViewById(R.id.button10);
	        buttAdd = (Button)findViewById(R.id.button14);
	        buttSub = (Button)findViewById(R.id.button13);
	        buttMul = (Button)findViewById(R.id.button12);
	        buttDiv = (Button)findViewById(R.id.button11);
	        buttAc = (Button)findViewById(R.id.button15);
	        buttAns= (Button)findViewById(R.id.button16);
	        
	        butt0.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(0);
				}
			});
	        butt1.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(1);
				}
			});
	        
	        butt2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(2);
				}
			});
	        butt3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(3);
				}
			});
	        butt4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(4);
				}
			});
	        butt5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(5);
				}
			});
	        butt6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(6);
				}
			});
	        butt7.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(7);
				}
			});
	        butt8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(8);
				}
			});
	        butt9.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					processAction(9);
				}
			});
	        
	        buttDot.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {				
					dot=1;
				}
			});
	        buttAdd.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {	
					operation="add";
	 			}
			});
	        buttSub.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {	
					operation="sub";
	 			}
			});
	        buttMul.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {	
					operation="mul";
	 			}
			});
	        buttDiv.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {	
					operation="div";
	 			}
			});
	        buttAc.setOnLongClickListener(new OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
					 currentValue=0;
					 operation=null;
					 answer=0;
					 dot=0;
					 answerText.setText(String.valueOf(currentValue));
					 
					 Toast.makeText(getApplicationContext(), "Cleared", Toast.LENGTH_SHORT).show();
					 return false;
				}
			});
	        
	        
	        
	        
	}
	void processAction(int operand)
	{
		if(operation==null && currentValue>0){
			currentValue=(currentValue*10)+operand;
		}
		else if(operation==null ){
			currentValue=operand;
		}else if(operation.equals("add")){
		
			currentValue+=operand;
		}
		else if(operation.equals("sub")){
			currentValue-=operand;
		}
		else if(operation.equals("mul")){
			currentValue*=operand;
		}
		else if(operation.equals("div")){
			if(operand==0){flag=0; }
			else{
			currentValue/=operand;
			}
		}
		if(flag==1)
			answerText.setText(String.valueOf(currentValue));
		else
			answerText.setText("Error!");
		operation=null;
		flag=1;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
}
