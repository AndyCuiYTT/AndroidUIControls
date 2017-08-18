package andycui.top.uicontrols;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by colin on 2017/8/18.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter {


    private String[] datas = null;
    private OnItemClickListener itemClickListener;
    public MyRecyclerViewAdapter(String[] datas){
        this.datas = datas;
    }

    public void setItemClickListener(OnItemClickListener onItemClickListener) {
        this.itemClickListener =  onItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.aty_using_recyclerview_cell,null);
        final ViewHolder viewHolder = new ViewHolder(linearLayout);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemClickListener != null){
                    int pos = viewHolder.getLayoutPosition();
                    itemClickListener.onItemClick(view,pos);
                }
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).setItem(datas[position]);

    }

    @Override
    public int getItemCount() {
        return datas.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public void setItem(String item){
            textView.setText(item);
        }

        public ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.recyclerView_cell_textView);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

}
