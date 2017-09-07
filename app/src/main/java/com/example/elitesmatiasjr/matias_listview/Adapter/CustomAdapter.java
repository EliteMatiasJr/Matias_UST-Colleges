package com.example.elitesmatiasjr.matias_listview.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elitesmatiasjr.matias_listview.Model.College;
import com.example.elitesmatiasjr.matias_listview.R;

import java.util.List;

/**
 * Created by Elite S. Matias Jr on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter {

    public CustomAdapter(Context c, List<College> colleges) {
        this.c = c;
        this.colleges = colleges;
    }

    Context c;
    List<College> colleges;

    ImageView iv_Logo;
    TextView tv_College;
    TextView tv_Year;

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.ivLogo);
        tv_College = (TextView) v.findViewById(R.id.tvCollege);
        tv_Year = (TextView) v.findViewById(R.id.tvYear);

        iv_Logo.setImageResource(colleges.get(i).getLogo());
        tv_College.setText(colleges.get(i).getName());
        tv_Year.setText(colleges.get(i).getYear());

        return null;
    }
}
