package wj.captain.ktstudy.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import wj.captain.ktstudy.R

class Chap9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap9)


        toast("Hello Kotlin")

        // alertDialog
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

        // selectDialog
        /*
        val cities = listOf("Seoul", "Tokyo", "Mountain View", "Singapore")

        selector(title = "Select City", items = cities) {
            dialogInterface, selection -> toast("You selected : ${cities[selection]}")
        }
        */

        // progressDialog
        /*
        val pd = progressDialog(title = "FileDownload", message = "???")
        pd.show()
        pd.progress = 50
        */

        // indeterminate
        // indeterminateProgressDialog(message = "Loading . . .").show()

        // 전화걸기
        makeCall(number = "01012341234")

        // 문자보내기
        sendSMS(number = "01012341234", text = "sms text")

        // 웹페이지 열기
        browse(url = "https://www.google.com")

        // 이메일 발송
        email(email = "test@gmail.com", subject = "Hello? ^-^", text = "Hi? textextextextextext!!!")
    }
}
