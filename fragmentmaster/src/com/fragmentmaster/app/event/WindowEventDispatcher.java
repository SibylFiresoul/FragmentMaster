package com.fragmentmaster.app.event;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class WindowEventDispatcher implements EventDispatcher {

    public Activity mActivity;

    public WindowEventDispatcher(Activity activity) {
        mActivity = activity;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return mActivity.getWindow().superDispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return mActivity.getWindow().superDispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return mActivity.getWindow().superDispatchTouchEvent(event);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent event) {
        return mActivity.getWindow().superDispatchTrackballEvent(event);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return mActivity.getWindow().superDispatchGenericMotionEvent(event);
    }
}