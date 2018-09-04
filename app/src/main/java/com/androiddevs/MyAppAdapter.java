package com.androiddevs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by ADMIN on 01-Sep-18.
 */

public class MyAppAdapter extends BaseAdapter {

    Context mContext;

    public class ViewHolder {
        TextView username, population;
        ImageView profilePic;
    }

    private ArrayList<ProfileModel> profileList;

    public MyAppAdapter(ArrayList<ProfileModel> apps, Context mContext) {
        this.profileList = apps;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return profileList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.item_profile, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.profilePic = (ImageView) rowView.findViewById(R.id.imgProfile);
            viewHolder.username = (TextView) rowView.findViewById(R.id.txtUsername);
            viewHolder.population = (TextView) rowView.findViewById(R.id.txtPopulation);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
//            if (profileList.get(position).getPopulation() < 500) {
        viewHolder.username.setText(profileList.get(position).getUsername() + "");
        viewHolder.population.setText(profileList.get(position).getPopulation() + "");
//            viewHolder.population.setText(Collections.sort(profileList.get(position).getPopulation()));

        viewHolder.profilePic.setBackgroundResource(profileList.get(position).getProfilePic());
//                return rowView;
//            }
        return rowView;
    }
}