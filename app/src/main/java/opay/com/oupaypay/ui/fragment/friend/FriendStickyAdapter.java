package opay.com.oupaypay.ui.fragment.friend;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import opay.com.oupaypay.R;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by yuanchong on 17/12/10 星期四.
 */

public class FriendStickyAdapter extends BaseAdapter implements StickyListHeadersAdapter {




    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public long getHeaderId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            holder.fragmentFriendItemHead = (ImageView) convertView.findViewById(R.id.fragment_friend_item_head);
            holder.fragmentFriendItemNickname = (TextView) convertView.findViewById(R.id.fragment_friend_item_nickname);
            holder.fragmentFriendItemRealname = (TextView) convertView.findViewById(R.id.fragment_friend_item_realname);
            holder.fragmentFriendItemLine = (View) convertView.findViewById(R.id.fragment_friend_item_line);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //

        return convertView;
    }


    class HeaderViewHolder {
        TextView month;
        LinearLayout goBills;
    }

    class ViewHolder {
         ImageView fragmentFriendItemHead;
         TextView fragmentFriendItemNickname;
         TextView fragmentFriendItemRealname;
         View fragmentFriendItemLine;
    }


}

