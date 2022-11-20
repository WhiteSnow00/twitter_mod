// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;

public class BottomNavViewPager extends ViewPager
{
    public final int C1;
    public float D1;
    public float E1;
    public boolean F1;
    public ef9 G1;
    
    public BottomNavViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.C1 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }
    
    private Fragment getCurrentFragment() {
        final ksj ksj = (ksj)this.getAdapter();
        jee.l((Object)ksj);
        return (Fragment)ksj.S();
    }
    
    @Override
    public final void A(final int n, final boolean b) {
        super.A(n, false);
    }
    
    public final boolean C() {
        if (this.getCurrentFragment() instanceof r8s) {
            final Fragment currentFragment = this.getCurrentFragment();
            final int a = c5j.a;
            return ((r8s)currentFragment).y();
        }
        return false;
    }
    
    @Override
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final float n = x - this.D1;
                final float e1 = this.E1;
                boolean b = false;
                Label_0085: {
                    if (Math.abs(n) > this.C1) {
                        if (Math.abs(n) > Math.abs(y - e1)) {
                            b = true;
                            break Label_0085;
                        }
                    }
                    b = false;
                }
                if (b) {
                    final Fragment currentFragment = this.getCurrentFragment();
                    boolean f1 = false;
                    Label_0202: {
                        Label_0199: {
                            if (currentFragment instanceof r8s) {
                                final r8s r8s = (r8s)currentFragment;
                                Label_0116: {
                                    if (!r8s.I()) {
                                        final boolean b2 = r40.b();
                                        final int a = c5j.a;
                                        Label_0167: {
                                            if (b2) {
                                                if (!r8s.E()) {
                                                    break Label_0167;
                                                }
                                            }
                                            else if (!r8s.G()) {
                                                break Label_0167;
                                            }
                                            if (n > 0.0f) {
                                                break Label_0199;
                                            }
                                        }
                                        if (b2) {
                                            if (!r8s.G()) {
                                                break Label_0116;
                                            }
                                        }
                                        else if (!r8s.E()) {
                                            break Label_0116;
                                        }
                                        if (n < 0.0f) {
                                            break Label_0199;
                                        }
                                    }
                                }
                                f1 = false;
                                break Label_0202;
                            }
                        }
                        f1 = true;
                    }
                    this.F1 = f1;
                    if (f1) {
                        this.D1 = x;
                        return true;
                    }
                }
            }
        }
        else {
            this.D1 = motionEvent.getX();
            this.E1 = motionEvent.getY();
        }
        return false;
    }
    
    @Override
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        jee.l((Object)this.G1);
        final int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return true;
                }
            }
            else {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final float n = x - this.D1;
                final float e1 = this.E1;
                if (Math.abs(n) > this.C1) {
                    if (this.F1) {
                        if (motionEvent.getHistorySize() > 0) {
                            final boolean b = r40.b();
                            if (fli.D0() ? (b ? (motionEvent.getX() > motionEvent.getHistoricalX(0)) : (motionEvent.getX() < motionEvent.getHistoricalX(0))) : (b ? (motionEvent.getX() < motionEvent.getHistoricalX(0)) : (motionEvent.getX() > motionEvent.getHistoricalX(0)))) {
                                this.G1.a();
                            }
                            this.F1 = false;
                        }
                    }
                    else if (Math.abs(n) > Math.abs(y - e1)) {
                        this.F1 = true;
                    }
                    this.D1 = x;
                    return true;
                }
                return true;
            }
        }
        this.F1 = false;
        return true;
    }
    
    @Override
    public void setCurrentItem(final int n) {
        super.A(n, false);
    }
    
    public void setDrawerController(final ef9 g1) {
        this.G1 = g1;
    }
}
