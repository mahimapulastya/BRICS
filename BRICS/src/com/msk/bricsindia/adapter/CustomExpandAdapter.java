package com.msk.bricsindia.adapter;

import java.util.HashMap;
import java.util.List;

import com.msk.brics.R;
import com.msk.brics.SampleTO;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomExpandAdapter extends BaseExpandableListAdapter {

    private List<SampleTO> parentRecord;
    private HashMap<String, List<String>> childRecord;
    private LayoutInflater inflater = null;
    private Activity mContext;

    public CustomExpandAdapter(Activity context, List<SampleTO> parentList, HashMap<String, List<String>> childList) {
        this.parentRecord = parentList;
        this.childRecord = childList;
        mContext = context;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //@Override
    public String getChild(int groupPosition, int childPosition) {
        return this.childRecord.get(((SampleTO) getGroup(groupPosition)).getTitle()).get(childPosition);
    }

    //@Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    //@Override
    public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String childConfig = getChild(groupPosition, childPosition);

        ViewHolder holder;
        try {
            if (convertView == null) {
                holder = new ViewHolder();

                convertView = inflater.inflate(R.layout.custom_list_view_child, null);
                holder.childTitle = (TextView) convertView.findViewById(R.id.childTitle);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.childTitle.setText(childConfig);

        } catch (Exception e) {
        }
        return convertView;
    }

    //@Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        SampleTO parentSampleTo = parentRecord.get(groupPosition);

        ViewHolder holder;
        try {
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.custom_list_view, null);
                holder = new ViewHolder();

                holder.parentTitle = (TextView) convertView.findViewById(R.id.parentTitle);
                holder.parentIcon = (ImageView) convertView.findViewById(R.id.parentIcon);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.parentTitle.setText(parentSampleTo.getTitle());
            holder.parentIcon.setBackgroundResource(parentSampleTo.getIcon());

        } catch (Exception e) {
        }
        return convertView;
    }

    public static class ViewHolder {

        private TextView childTitle;
        // Content
        private TextView parentTitle;
        private ImageView parentIcon;

    }

  //  @Override
    public int getChildrenCount(int groupPosition) {
        return this.childRecord.get(((SampleTO) getGroup(groupPosition)).getTitle()).size();
    }

   // @Override
    public SampleTO getGroup(int groupPosition) {
        return this.parentRecord.get(groupPosition);
    }

    //@Override
    public int getGroupCount() {
        return this.parentRecord.size();
    }

    //@Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    //@Override
    public boolean hasStableIds() {
        return false;
    }

    //@Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
