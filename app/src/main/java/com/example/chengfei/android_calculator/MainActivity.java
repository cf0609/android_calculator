package com.example.chengfei.android_calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    //定义全局变量
    public String str = "";
    public EditText et;
    public int c = 0;      //计算方法选择   add: 1  sub:2  mul: 3 div: 4;
    public int flag = 0;   //按下运算符的标致
    public double b = 0;
    public double g = 0;
    public double f = 0.0;
    public View vi;

    public  int operation_flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 取得按键
        final Button number[] = new Button[10];
        final Button symbol[] = new Button[11];
        int   buf[]= {R.id.but_0,R.id.but_1,R.id.but_2,R.id.but_3,R.id.but_4,R.id.but_5,R.id.but_6,
                R.id.but_7,R.id.but_8,R.id.but_9};

        symbol[0] = (Button)findViewById(R.id.but_add);  //加号
        symbol[1] = (Button)findViewById(R.id.but_sub);  //减号
        symbol[2] = (Button)findViewById(R.id.but_mul);  //乘号
        symbol[3] = (Button)findViewById(R.id.but_div);  //除号
        symbol[4] = (Button)findViewById(R.id.but_equ);  //等号
        symbol[5] = (Button)findViewById(R.id.but_dot);  //小数点
        symbol[6] = (Button)findViewById(R.id.but_c);    //清除
        symbol[7] = (Button)findViewById(R.id.but_ce);   //清除
        symbol[8] = (Button)findViewById(R.id.but_np);   //正负
        symbol[9] = (Button)findViewById(R.id.but_pf);   //平方
        symbol[10] = (Button)findViewById(R.id.but_kf);  //开方

        for (int i=0; i < 10;i++)
        {
            number[i] = (Button)findViewById(buf[i]);
        }

        et = (EditText)findViewById(R.id.textView1);
        et.setText(str);

        /* 按键 ---- 0 */
        number[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += "0";
                et.setText(str);
                vi = v;
            }
        });

        /* 按键---- 1 */
        number[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(1 == flag)
                {
                    str = "";
                    str +="1";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "1";
                    et.setText(str);
                }
                vi = v;

            }
        });

        /* 按键 ---- 2 */
        number[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(1 == flag)
                {
                    str = "";
                    str += 2;
                    et.setText(str);
                    flag = 0;
                }
                else
                {
                    str += "2";
                    et.setText(str);
                }
                vi = v;
            }
        });

        /* 按键 ---- 3*/
        number[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag){
                    str = "";
                    str += "3";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "3";
                    et.setText(str);
                }
                vi = v;
            }
        });

        /* 按键 ---- 4 */
        number[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag){
                    str = "";
                    str += "4";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "4";
                    et.setText(str);
                }
                vi = v;
            }
        });

        /* 按键 ---- 5 */
        number[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag)
                {
                    str = "";
                    str += "5";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "5";
                    et.setText(str);
                }
                vi = v;

            }
        });

        /* 按键 ---- 6 */
        number[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag)
                {
                    str = "";
                    str += "6";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "6";
                    et.setText(str);
                }
                vi = v;
            }
        });

        /* 按键 ---- 7 */
        number[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag)
                {
                    str = "";
                    str += "7";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "7";
                    et.setText(str);
                }
                vi = v;

            }
        });

        /* 按键 ---- 8 */
        number[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag)
                {
                    str = "";
                    str += "8";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "8";
                    et.setText(str);
                }
                vi = v;

            }
        });

        /* 按键 ---- 9 */
        number[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(1 == flag)
                {
                    str = "";
                    str += "9";
                    et.setText(str);
                    flag = 0;
                }
                else {
                    str += "9";
                    et.setText(str);
                }
                vi = v;

            }
        });

//-------------------------------------------------------------------------------------------------//
        /**
         * 当有运算符号按下后设置操作标志operation_flag = 1
         */

        /* 加号 */
        symbol[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(str != "")
                {
                    if(     vi == symbol[0] ||
                            vi == symbol[1] ||
                            vi == symbol[2] ||
                            vi == symbol[3]
                            )
                    {
                        c = 1;
                    }
                    else
                    {
                        g = Double.parseDouble(str);
                        calculater();
                        str = "" + f;
                        et.setText(str);
                        c = 1;  //设置运算法则
                        flag = 1; //设置运算符号按下标志
                        vi = v;
                    }
                }
            }
        });

        /* 减号  */
        symbol[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str != "")
                {
                    if(     vi == symbol[0] ||
                            vi == symbol[1] ||
                            vi == symbol[2] ||
                            vi == symbol[3]
                            )
                    {
                        c = 2;
                    }
                    else
                    {
                        g = Double.parseDouble(str);
                        calculater();
                        str = "" + f;
                        et.setText(str);
                        c = 2;  //设置运算法则
                        flag = 1; //设置运算符号按下标志
                        vi = v;


                    }
                }

            }
        });

        /* 乘 */
        symbol[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str != "")
                {
                    if(     vi == symbol[0] ||
                            vi == symbol[1] ||
                            vi == symbol[2] ||
                            vi == symbol[3]
                            )
                    {
                        c = 3;
                    }
                    else
                    {
                        g = Double.parseDouble(str);
                        calculater();
                        str = "" + f;
                        et.setText(str);
                        c = 3;  //设置运算法则
                        flag = 1; //设置运算符号按下标志
                        vi = v;
                    }
                }
            }
        });

        /* 除 */
        symbol[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str != "")
                {
                    if(     vi == symbol[0] ||
                            vi == symbol[1] ||
                            vi == symbol[2] ||
                            vi == symbol[3]
                            )
                    {
                        c = 4;
                    }
                    else
                    {
                        g = Double.parseDouble(str);
                        calculater();   //此时c = 0
                        str = "" + f;
                        et.setText(str);
                        c = 4;  //设置运算法则
                        flag = 1; //设置运算符号按下标志
                        vi = v;
                    }
                }
            }
        });

        /* 等号 */
        symbol[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str != "" &&
                        vi != symbol[0] &&
                        vi != symbol[1] &&
                        vi != symbol[2] &&
                        vi != symbol[3]
                        )
                {
                    g = Double.parseDouble(str);
                    calculater();
                    str = "" + f;
                    et.setText(str);
                    flag = 1;
                    vi = v;
                }
            }
        });

        /* 小数点 */
        symbol[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str == "")
                {
                    str +=".";
                    et.setText(str);
                }
                else
                {
                    char array[];
                    int x = 0;
                    array = str.toCharArray();
                    for (int i = 0; i < array.length; ++i)
                    {
                        if(array[i] == '.')
                        {
                            x++;
                        }
                        if(x == 0)   //在字符串中没有小数点就添加上小数点
                        {
                            str += ".";
                            et.setText(str);
                        }
                    }
                }
            }
        });

        /* 清除 */
        symbol[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                et.setText(str);
                vi = v;
            }
        });

        /* 清除 复位*/
        symbol[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 0;
                c = 0;
                g = 0;
                f = 0.0;
                flag = 0;
                str = "";
                et.setText(str);
                vi = v;
            }
        });

        /* 正负
        * 				if(vi!=fuhao[5]&&str!=""){
					char ch=str.charAt(0);
					if(ch=='-')
						str=str.replace("-","");
					else
						str="-"+str;
					et.setText(str);
				}
        * */
        symbol[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vi != symbol[8] && str !="")
                {
                    char ch = str.charAt(0);
                    if(ch == '-')
                    {
                        str = str.replace("-","");
                    }
                    else
                    {
                        str = "-" + str;

                    }
                    et.setText(str);
                }

            }
        });

        /* 平方 */
        symbol[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str != "")
                {
                    double m = Double.parseDouble(str);
                    str = "" + m * m;
                    et.setText(str);
                }

            }
        });

        /* 开方 */
        symbol[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str != "")
                {
                    double m = Double.parseDouble(str);
                    str = Math.sqrt(m) + "";
                    et.setText(str);
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if(id == R.id.quit)   //退出程序
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    /* 计算方法 */
    public double calculater()
    {
        switch(c){
            case 0:f=g;break;
            case 1:f=b+g;break;
            case 2:f=b-g;break;
            case 3:f=b*g;break;
            case 4:f=b/g;break;
        }

        b=f;
        c=0;

        return f;
    }

}
