package iview.wsienski.kotlintrip.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import iview.wsienski.kotlintrip.R
import iview.wsienski.kotlintrip.domain.data.RepoKotlin
import org.jetbrains.anko.find

/**
 * Created by WSienski on 22/12/2017.
 */
class ListAdapterKotlin(private val items: List<RepoKotlin>) : RecyclerView.Adapter<ListAdapterKotlin.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repo_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindRepo(items[position])
    }

    override fun getItemCount(): Int = items.count()

    class ViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {

        private val repoName = view.find<TextView>(R.id.repoName)
        private val repoOwner = view.find<TextView>(R.id.repoOwner)

        fun bindRepo(repo: RepoKotlin) {
            with(repo) {
                repoName.text = "Name: $name"
                repoOwner.text = "Owner: $owner"
            }
        }
    }
}