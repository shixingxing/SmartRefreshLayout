package com.scwang.refreshlayout.activity.adapter;

import com.bumptech.glide.Glide;
import com.scwang.refreshlayout.activity.practice.BannerPracticeActivity;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;

import java.util.List;

/**
 * @author shixingxing
 */
public class BannerPracticeAdapter extends BannerImageAdapter<BannerPracticeActivity.BannerItem> {

    public BannerPracticeAdapter(List<BannerPracticeActivity.BannerItem> mData) {
        super(mData);
    }

    @Override
    public void onBindView(BannerImageHolder holder, BannerPracticeActivity.BannerItem data, int position, int size) {
        Glide.with(holder.imageView).load(data.pic).into(holder.imageView);
    }
}
