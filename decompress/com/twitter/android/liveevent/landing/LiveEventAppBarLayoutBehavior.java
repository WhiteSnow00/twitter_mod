// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing;

import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import java.util.Objects;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;

public class LiveEventAppBarLayoutBehavior extends AppBarLayout$Behavior implements lqj
{
    public final kv1<Boolean> p;
    public final d1c q;
    public final ytf r;
    public fof s;
    public View t;
    public final Rect u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    
    public LiveEventAppBarLayoutBehavior(final Context context, final ytf r) {
        super(context, (AttributeSet)null);
        final Boolean false = Boolean.FALSE;
        final Object[] l0 = kv1.L0;
        Objects.requireNonNull(false, "defaultValue is null");
        final kv1 p2 = new kv1();
        p2.I0.lazySet(false);
        this.p = (kv1<Boolean>)p2;
        this.u = new Rect();
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.r = r;
        this.q = new d1c(context, (GestureDetector$OnGestureListener)new gof(this));
    }
    
    public static boolean P(final LiveEventAppBarLayoutBehavior liveEventAppBarLayoutBehavior, final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        final View t = liveEventAppBarLayoutBehavior.t;
        final boolean b = false;
        boolean b2;
        if (t == null) {
            b2 = b;
        }
        else {
            t.getHitRect(liveEventAppBarLayoutBehavior.u);
            b2 = b;
            if (liveEventAppBarLayoutBehavior.u.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                b2 = b;
                if (liveEventAppBarLayoutBehavior.u.contains((int)motionEvent2.getX(), (int)motionEvent2.getY())) {
                    b2 = b;
                    if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final void H(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final int n) {
        if (this.r.a() && this.s == null) {
            appBarLayout.a((AppBarLayout$OnOffsetChangedListener)(this.s = new fof(this, 0)));
        }
        final int measuredHeight = ((View)appBarLayout).getMeasuredHeight();
        if (this.y != measuredHeight && this.x) {
            appBarLayout.f(false, false, true);
        }
        this.y = measuredHeight;
        super.H(coordinatorLayout, appBarLayout, n);
    }
    
    public final void I(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final View view, final int n, final int n2, final int[] array, final int n3) {
        if (this.x && this.r.a()) {
            return;
        }
        if (n3 == 1) {
            this.v = true;
        }
        if (!this.w) {
            super.I(coordinatorLayout, appBarLayout, view, n, n2, array, n3);
        }
    }
    
    public final void J(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (this.x && this.r.a()) {
            return;
        }
        if (!this.w) {
            super.J(coordinatorLayout, appBarLayout, view, n, n2, n3, n4, n5, array);
        }
    }
    
    public final void K(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final View view, final int n) {
        super.K(coordinatorLayout, appBarLayout, view, n);
        this.v = false;
        this.w = false;
    }
    
    public final h5j<Boolean> a() {
        return (h5j<Boolean>)new r7j((pnl)new fab((e9b)this.p));
    }
    
    public final void f(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        ((AppBarLayout)view).e((AppBarLayout$OnOffsetChangedListener)this.s);
        this.s = null;
    }
    
    public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        final AppBarLayout appBarLayout = (AppBarLayout)view;
        if (this.v) {
            this.w = true;
        }
        if (this.t != null && motionEvent.getAction() == 1) {
            this.p.onNext((Object)Boolean.FALSE);
        }
        this.q.a(motionEvent);
        return super.h(coordinatorLayout, (View)appBarLayout, motionEvent);
    }
    
    public final /* bridge */ boolean i(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        this.H(coordinatorLayout, (AppBarLayout)view, n);
        return true;
    }
    
    public final void r(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        super.K(coordinatorLayout, (AppBarLayout)view, view2, n);
        this.v = false;
        this.w = false;
    }
}
