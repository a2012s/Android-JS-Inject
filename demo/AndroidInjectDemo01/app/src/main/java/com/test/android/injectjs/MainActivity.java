package com.test.android.injectjs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import cn.pedant.SafeWebViewBridge.sample.WebActivity;
import com.chenyg.androidjs.InjectType;
import com.test.android.injectjs.demofunction.FunctionActivity;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        Button original = (Button) findViewById(R.id.original_project_demoBtn);
        original.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("injectType", InjectType.Self.name());
                startActivity(intent);
            }
        });

        Button fundemo = (Button) findViewById(R.id.fun_demoBtn);
        fundemo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, FunctionActivity.class);
                intent.putExtra("injectType", InjectType.Self.name());
                startActivity(intent);
            }
        });

        Button originalAuto = (Button) findViewById(R.id.original_project_demo_autoBtn);
        originalAuto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("injectType", InjectType.Auto.name());
                startActivity(intent);
            }
        });

        Button fundemoAuto = (Button) findViewById(R.id.fun_demo_autoBtn);
        fundemoAuto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, FunctionActivity.class);
                intent.putExtra("injectType", InjectType.Auto.name());
                startActivity(intent);
            }
        });
    }
}
