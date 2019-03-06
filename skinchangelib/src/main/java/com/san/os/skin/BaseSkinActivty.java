package com.san.os.skin;

import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.app.AppCompatActivity;

/**
 * @author chenlulu@qiyi.com
 * @Description
 * @date 2019-03-06 15:24
 */

public class BaseSkinActivty extends AppCompatActivity implements ISkinChangeListener,LayoutInflaterFactory {


    @Override
    public void onSkinChanged() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mSkinInflaterFactory = new SkinInflaterFactory(this);
        LayoutInflaterCompat.setFactory2(getLayoutInflater(), mSkinInflaterFactory);
        super.onCreate(savedInstanceState);
        changeStatusColor();
    }

}
