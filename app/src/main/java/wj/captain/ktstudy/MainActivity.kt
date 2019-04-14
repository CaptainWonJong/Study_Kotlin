package wj.captain.ktstudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import wj.captain.ktstudy.adapter.CityAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_submit.setOnClickListener { tv_message.text = "Hello, " + et_name.text.toString() }

        rv_city.adapter = CityAdapter()
        rv_city.layoutManager = LinearLayoutManager(applicationContext)
    }
}
