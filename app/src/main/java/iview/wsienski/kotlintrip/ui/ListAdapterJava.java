package iview.wsienski.kotlintrip.ui;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by WSienski on 22/12/2017.
 */

public class ListAdapterJava extends RecyclerView.Adapter<ListAdapterJava.ViewHolder> {

    private List<String> items;

    public ListAdapterJava(List<String> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView itemView;

        public ViewHolder(TextView itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }
}
