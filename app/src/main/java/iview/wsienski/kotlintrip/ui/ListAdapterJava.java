package iview.wsienski.kotlintrip.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import iview.wsienski.kotlintrip.R;
import iview.wsienski.kotlintrip.domain.data.RepoJava;

/**
 * Created by WSienski on 22/12/2017.
 */

public class ListAdapterJava extends RecyclerView.Adapter<ListAdapterJava.ViewHolder> {

    private List<RepoJava> items;

    public ListAdapterJava(List<RepoJava> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.repoName.setText(String.format("Name %s", items.get(position).getName()));
        holder.repoOwner.setText(String.format("Owner %s", items.get(position).getOwner()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView repoName;
        TextView repoOwner;

        public ViewHolder(View itemView) {
            super(itemView);
            this.repoName = itemView.findViewById(R.id.repoName);
            this.repoOwner = itemView.findViewById(R.id.repoOwner);
        }
    }
}
