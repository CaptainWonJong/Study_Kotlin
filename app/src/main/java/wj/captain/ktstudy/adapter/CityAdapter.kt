package wj.captain.ktstudy.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_city.view.*
import wj.captain.ktstudy.R
import java.text.FieldPosition

class CityAdapter : RecyclerView.Adapter<CityAdapter.Holder>() {
    private val cities = listOf(
        "Seoul" to "SEO",
        "Tokyo" to "TOK",
        "Mountain View" to "MTV",
        "Singapore" to "SIN",
        "New York" to "NYC"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(parent)

    override fun getItemCount() = cities.size

    override fun onBindViewHolder(holder: CityAdapter.Holder, position: Int) {
        val (city, code) = cities[position]

        // 코틀린 안드로이드 익스텐션을 사용하여 레이아웃 내 뷰에 접근하려면 뷰홀더 내의 itemView를 거쳐야 한다.
        with(holder.itemView) {
            tv_city_name.text = city
            tv_city_code.text = code
        }
    }

    inner class Holder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false))
}