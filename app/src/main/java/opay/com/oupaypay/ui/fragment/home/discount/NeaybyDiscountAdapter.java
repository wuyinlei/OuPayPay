package opay.com.oupaypay.ui.fragment.home.discount;

import android.graphics.ImageFormat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;

import static opay.com.oupaypay.R.id.tv_title;

/**
 * Created by wuyinlei on 2017/12/8.
 */

public class NeaybyDiscountAdapter extends RecyclerView.Adapter <NeaybyDiscountAdapter.NeaybyDiscountViewHolder>{

    @Override
    public NeaybyDiscountViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_discount_layout,parent,false);
        return new NeaybyDiscountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NeaybyDiscountViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class NeaybyDiscountViewHolder extends RecyclerView.ViewHolder{

        private ImageView mIvimg;
        private TextView mTvTitle;

        public NeaybyDiscountViewHolder(View itemView) {
            super(itemView);
            mTvTitle = (TextView) itemView.findViewById(tv_title);
            mIvimg = (ImageView) itemView.findViewById(R.id.iv_image);
        }
    }
}
