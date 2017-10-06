package com.example.sergiolima.createanim;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/**
 * Created by sergio.lima on 06/10/2017.
 */

public class BaseFragment extends Fragment {

    private static String TAG = "SLIMA";

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        Log.d(TAG, getClass().getSimpleName() + " onCreateAnimation()");
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        Log.d(TAG, getClass().getSimpleName() + " onCreateAnimator()");
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, getClass().getSimpleName() + " onCreateView()");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        Log.d(TAG, getClass().getSimpleName() + " onResume()");
        super.onResume();
    }

    @Override
    public void onStart() {
        Log.d(TAG, getClass().getSimpleName() + " onStart()");
        super.onStart();
    }

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, getClass().getSimpleName() + " onAttach()");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, getClass().getSimpleName() + " onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPause() {
        Log.d(TAG, getClass().getSimpleName() + " onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG, getClass().getSimpleName() + " onStop()");
        super.onStop();
    }
}
