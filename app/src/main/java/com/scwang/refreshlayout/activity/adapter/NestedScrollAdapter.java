package com.scwang.refreshlayout.activity.adapter;

import com.bumptech.glide.Glide;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;

import java.util.List;

/**
 * @author shixingxing
 */
public class NestedScrollAdapter extends BannerImageAdapter<Integer> {

    public NestedScrollAdapter(List<Integer> mData) {
        super(mData);
    }

    @Override
    public void onBindView(BannerImageHolder holder, Integer data, int position, int size) {
        Glide.with(holder.imageView).load(data).into(holder.imageView);
    }
}
