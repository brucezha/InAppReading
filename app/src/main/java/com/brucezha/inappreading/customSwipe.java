package com.brucezha.inappreading;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yunshang on 11/16/16.
 */

public class customSwipe extends PagerAdapter{
    private int [] imageResources ={R.drawable.image1,R.drawable.image2};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public customSwipe(Context c) {
        ctx=c;
    }


    @Override
    public int getCount() {
        return imageResources.length;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swipe,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        TextView textView=(TextView) itemView.findViewById(R.id.imageCount);
        imageView.setImageResource(imageResources[position++]);
        textView.setText("Page:"+position);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view==object);
    }
}
