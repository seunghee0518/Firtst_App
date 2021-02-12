package First.App

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {  //앱이 최초 실행될 때 수행됨
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //화면 뷰 연결(activity_main.xml 파일 연결됨)

        tv_title.setText("Hello world!")  //setText = 텍스트 값 변경
    }
}