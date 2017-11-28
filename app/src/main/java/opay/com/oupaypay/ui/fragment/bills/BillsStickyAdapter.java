package opay.com.oupaypay.ui.fragment.bills;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import opay.com.oupaypay.R;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by yuanchong on 17/11/28 星期四.
 */

public class BillsStickyAdapter extends BaseAdapter implements StickyListHeadersAdapter{

    private ArrayList<Object> list = new ArrayList<>();
    private LayoutInflater inflater;
    private Context context;
    private boolean first0 = true;
    private boolean first1 = true;
    private boolean firstelse = true;

    public BillsStickyAdapter(Context context, ArrayList<Object> list) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.list = list;
    }

    @Override
    public long getHeaderId(int position) {
        return Long.parseLong(getItem(position).toString());
    }

    @Override
    public int getCount() {
        if (list == null)
            return 0;
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {

        HeaderViewHolder holder;
        if (convertView == null) {
            holder = new HeaderViewHolder();
            convertView = inflater.inflate(R.layout.bills_item_head_layout, parent, false);
            holder.month = (TextView) convertView.findViewById(R.id.bills_item_head_month);
            holder.goBills = (LinearLayout) convertView.findViewById(R.id.bills_item_head_monthbills);
            convertView.setTag(holder);
        } else {
            holder = (HeaderViewHolder) convertView.getTag();
        }



        return convertView;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.bills_item_layout, parent, false);
            holder.ivBillsType = (ImageView) convertView.findViewById(R.id.iv_bills_type);
            holder.tvNickname = (TextView) convertView.findViewById(R.id.tv_nickname);
            holder.tvTime = (TextView) convertView.findViewById(R.id.tv_time);
            holder.tvMoney = (TextView) convertView.findViewById(R.id.tv_money);
            holder.tvType = (TextView) convertView.findViewById(R.id.tv_type);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //写view


        return convertView;
    }


    class HeaderViewHolder {
        TextView month;
        LinearLayout goBills;
    }

    class ViewHolder {


        ImageView ivBillsType;
        TextView tvNickname;
        TextView tvTime;
        TextView tvMoney;
        TextView tvType;


    }

    public void addAll(ArrayList list) {
        list.addAll(list);
        notifyDataSetChanged();
    }

}
 