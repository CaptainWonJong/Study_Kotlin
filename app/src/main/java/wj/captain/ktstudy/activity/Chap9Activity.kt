package wj.captain.ktstudy.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import org.jetbrains.anko.*
import wj.captain.ktstudy.R

class Chap9Activity : AppCompatActivity(), AnkoLogger {

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
        // makeCall(number = "01012341234")

        // 문자보내기
        // sendSMS(number = "01012341234", text = "sms text")

        // 웹페이지 열기
        // browse(url = "https://www.google.com")

        // 이메일 발송
        // email(email = "test@gmail.com", subject = "Hello? ^-^", text = "Hi? textextextextextext!!!")
    }

    fun doSomething() {
        // Log.info 레벨의 로그 메세지 기록
        // AnkoLogger 함수의 로그는 해당 함수가 호출되는 클래스의 이름을 사용함.
        info("doSomething() called")

        // 100dp를 픽셀단위로 바꿔줌
        // val dp2Px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100f, resources.displayMetrics)
        val dp2px = dip(100)

        // 16sp를 픽셀단위로 바꿔줌
        // val sp2Px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 16f, resources.displayMetrics)
        val sp2px = sp(16)

        // 20px을 dip나 sp로 바꿔줌
        val px2dip = px2dip(20)
        val px2sp = px2sp(20)


    }

    /**
     * 로그 태그를 바꾸는 메서드
     */
    override val loggerTag: String
        get() = super.loggerTag + "wonjong"
}
