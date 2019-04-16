package wj.captain.ktstudy.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import org.jetbrains.anko.startActivity
import wj.captain.ktstudy.R

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btn_chapter8.setOnClickListener {
            startActivity<Chap8Activity>()
        }

        btn_chapter9.setOnClickListener {
            startActivity<Chap9Activity>()
        }
    }
}
