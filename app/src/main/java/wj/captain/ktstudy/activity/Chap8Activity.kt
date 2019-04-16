package wj.captain.ktstudy.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_chap8.*
import org.jetbrains.anko.toast
import wj.captain.ktstudy.R
import wj.captain.ktstudy.adapter.CityAdapter

class Chap8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap8)

        btn_submit.setOnClickListener { tv_message.text = "Hello, " + et_name.text.toString() }

        rv_city.adapter = CityAdapter()
        rv_city.layoutManager = LinearLayoutManager(applicationContext)

        toast("Hello Kotlin")

        /*
        alert(title = "타이틀", message = "메세지") {
            positiveButton("posi버튼") {
                toast("posi")
            }
            negativeButton("nega버튼") {
                toast("nega")
            }
        }.show()
        */
    }
}
