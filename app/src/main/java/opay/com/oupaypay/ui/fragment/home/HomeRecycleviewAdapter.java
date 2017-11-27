package opay.com.oupaypay.ui.fragment.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import opay.com.oupaypay.R;

/**
 * Created by yuanchong on 17/11/27 星期四.
 */
public class HomeRecycleviewAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList datas;
    private OnhomeRecycleClickListener mOnItemClickLitener;

    public void setOnItemClickLitener(OnhomeRecycleClickListener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

    public HomeRecycleviewAdapter(Context context, ArrayList<Object> datas) {
        this.context = context;
        this.datas = datas;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new Holder1(LayoutInflater.from(context).inflate(R.layout.home_recycleview_news, null));
        } else {
            return new Holder2(LayoutInflater.from(context).inflate(R.layout.home_recycleview_info, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Holder1) {
            setNewsView((Holder1) holder, position);
        } else if (holder instanceof Holder2) {
            setInfoView((Holder2) holder, position);
        }


    }


    private void setNewsView(Holder1 holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void setInfoView(Holder2 holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        if (datas == null)
            return 0;
        return datas.size();
    }

    @Override
    public int getItemViewType(int position) {
        //根据之前说的,判断一两个标志位分界线来判断显示的item类型
        if (datas.get(position).toString().equals("")) {
            return 0;
        } else {
            return 1;
        }
    }

    public void addData(int position, Object homeFlag) {
        datas.add(position, homeFlag);
        notifyItemInserted(position);
    }

    class Holder1 extends RecyclerView.ViewHolder {
        private ImageView homeRecycleNewsImg;
        private TextView homeRecycleNewsTitle;
        private TextView homeRecycleNewsContent;

        public Holder1(View itemView) {
            super(itemView);
            homeRecycleNewsImg = (ImageView) itemView.findViewById(R.id.home_recycle_news_img);
            homeRecycleNewsTitle = (TextView) itemView.findViewById(R.id.home_recycle_news_title);
            homeRecycleNewsContent = (TextView) itemView.findViewById(R.id.home_recycle_news_content);

        }
    }


    //最下面资讯
    class Holder2 extends RecyclerView.ViewHolder {
        private ImageView homeRecycleInfoImg;
        private TextView homeRecycleInfoTitle;
        private TextView homeRecycleInfoContent;
        private TextView homeRecycleInfoFrom;

        public Holder2(View itemView) {
            super(itemView);

            homeRecycleInfoImg = (ImageView) itemView.findViewById(R.id.home_recycle_info_img);
            homeRecycleInfoTitle = (TextView) itemView.findViewById(R.id.home_recycle_info_title);
            homeRecycleInfoContent = (TextView) itemView.findViewById(R.id.home_recycle_info_content);
            homeRecycleInfoFrom = (TextView) itemView.findViewById(R.id.home_recycle_info_from);
        }
    }

    //    回调监听点击事件
    public interface OnhomeRecycleClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

}
