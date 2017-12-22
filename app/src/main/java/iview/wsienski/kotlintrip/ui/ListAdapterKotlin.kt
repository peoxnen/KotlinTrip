package iview.wsienski.kotlintrip.ui

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by WSienski on 22/12/2017.
 */
class ListAdapterKotlin(private val items: List<String>) : RecyclerView.Adapter<ListAdapterKotlin.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(TextView(parent.context))


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.count()

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}