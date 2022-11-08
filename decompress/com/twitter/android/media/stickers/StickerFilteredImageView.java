// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.stickers;

import com.twitter.media.ui.image.d;
import android.graphics.PointF;
import java.util.Objects;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Matrix;
import android.view.MotionEvent;
import java.util.WeakHashMap;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.twitter.media.legacy.widget.HoverGarbageCanView;

public class StickerFilteredImageView extends m0b
{
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public b D1;
    public a E1;
    public boolean F1;
    public ncq G1;
    public ncq H1;
    public rw9 I1;
    public float J1;
    public final HoverGarbageCanView o1;
    public final View p1;
    public final float q1;
    public final int r1;
    public final Rect s1;
    public float t1;
    public float u1;
    public float v1;
    public float w1;
    public double x1;
    public int y1;
    public int z1;
    
    public StickerFilteredImageView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.s1 = new Rect();
        this.t1 = -1.0f;
        this.u1 = -1.0f;
        this.v1 = -1.0f;
        this.w1 = -1.0f;
        this.x1 = 0.0;
        this.y1 = -1;
        this.z1 = -1;
        this.G1 = ncq.c;
        this.q1 = (float)ViewConfiguration.get(context).getScaledTouchSlop();
        final View inflate = LayoutInflater.from(context).inflate(2131625732, (ViewGroup)this, false);
        this.p1 = inflate;
        final HoverGarbageCanView o1 = (HoverGarbageCanView)inflate.findViewById(2131432226);
        this.o1 = o1;
        this.r1 = ((View)this).getResources().getDimensionPixelSize(2131165928);
        ((ViewGroup)this).addView(inflate);
        o1.K0 = 0;
        o1.C0.setVisibility(4);
        o1.F0.setAlpha(0.0f);
        o1.F0.setVisibility(8);
        final View g0 = o1.G0;
        if (g0 != null) {
            g0.setVisibility(4);
        }
    }
    
    public static double y(final float n, final float n2, final float n3, final float n4) {
        double degrees = Math.toDegrees(Math.atan2(n3 - n, n4 - n2));
        if (degrees <= 0.0) {
            degrees += 360.0;
        }
        return degrees;
    }
    
    public final void A() {
        final a e1 = this.E1;
        if (e1 != null && !this.F1) {
            final a a = (com.twitter.android.media.imageeditor.b.b$a)e1;
            final com.twitter.android.media.imageeditor.b a2 = a.a;
            a2.y2(false, true);
            a2.e2.animate().translationY((float)a2.e2.getMeasuredHeight()).alpha(0.0f).setDuration(250L).setListener((Animator$AnimatorListener)new ks9(a2)).start();
            final com.twitter.android.media.imageeditor.b a3 = a.a;
            a3.f2.animate().translationY((float)(-a3.f2.getMeasuredHeight())).alpha(0.0f).setDuration(250L).setListener((Animator$AnimatorListener)new ms9(a3)).start();
            a.a.u2(false);
            this.F1 = true;
        }
    }
    
    public final void B() {
        this.z1 = -1;
        this.y1 = -1;
        this.t1 = -1.0f;
        this.u1 = -1.0f;
        this.v1 = -1.0f;
        this.w1 = -1.0f;
        this.x1 = 0.0;
        this.A1 = false;
        if (this.D1 != null) {
            final a e1 = this.E1;
            if (e1 != null && this.F1) {
                final a a = (com.twitter.android.media.imageeditor.b.b$a)e1;
                a.a.x2(true);
                final com.twitter.android.media.imageeditor.b a2 = a.a;
                a2.f2.animate().cancel();
                a2.f2.setVisibility(0);
                a2.f2.setAlpha(0.0f);
                final View f2 = a2.f2;
                final r20 r20 = new r20(a2, 5);
                final WeakHashMap a3 = p5x.a;
                p5x$d.m(f2, (Runnable)r20);
                a.a.u2(true);
                this.F1 = false;
            }
            ((View)this.D1).setAlpha(1.0f);
        }
        this.o1.b(0);
        ((View)this).requestLayout();
    }
    
    public final boolean C(final MotionEvent motionEvent, final b b) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        final float[] array = new float[2];
        int n = ((ViewGroup)this).getChildCount() - 1;
        while (true) {
            final int n2 = 0;
            if (n < 0) {
                return false;
            }
            final View child = ((ViewGroup)this).getChildAt(n);
            if (child != b && child instanceof b) {
                final b b2 = (b)child;
                final Matrix matrix = ((View)b2).getMatrix();
                final Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                array[0] = x - ((View)b2).getLeft();
                array[1] = y - ((View)b2).getTop();
                matrix2.mapPoints(array);
                final float n3 = array[0];
                final float n4 = array[1];
                if (n3 >= 0.0f && n3 < ((View)b2).getWidth() && n4 >= 0.0f && n4 < ((View)b2).getHeight()) {
                    this.D(b2);
                    ((ViewGroup)this).bringChildToFront((View)b2);
                    ((ViewGroup)this).bringChildToFront(this.p1);
                    if (b != null) {
                        ((ViewGroup)this).removeView((View)b);
                        int n5;
                        for (n5 = n2; !(((ViewGroup)this).getChildAt(n5) instanceof b); ++n5) {}
                        ((ViewGroup)this).addView((View)b, n5);
                    }
                    return true;
                }
            }
            --n;
        }
    }
    
    public final void D(final b d1) {
        final b d2 = this.D1;
        if (d2 == d1) {
            return;
        }
        if (d2 != null) {
            ((View)d2).setAlpha(1.0f);
            this.D1.setIsActive(false);
            ((View)this.D1).invalidate();
        }
        if ((this.D1 = d1) != null) {
            d1.setIsActive(true);
            ((View)d1).invalidate();
        }
        this.B();
    }
    
    public ncq getOrientedImageSize() {
        return this.G1;
    }
    
    public List<b.a> getStickers() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
            if (((ViewGroup)this).getChildAt(i) instanceof b) {
                list.add(((b)((ViewGroup)this).getChildAt(i)).getDisplayInfo());
            }
        }
        return list;
    }
    
    public final void i(final x8d x8d, final Drawable drawable) {
        super.i(x8d, drawable);
        if (drawable != null) {
            this.H1 = ncq.g(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)this).getChildAt(i);
                if (child instanceof b) {
                    child.setVisibility(0);
                }
            }
            ((View)this).requestLayout();
        }
    }
    
    public final void onLayout(final boolean b, int i, int childCount, final int n, final int n2) {
        super.onLayout(b, i, childCount, n, n2);
        View child;
        for (childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            child = ((ViewGroup)this).getChildAt(i);
            if (child.getVisibility() == 0 && child instanceof b) {
                this.z((b)child);
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.I1 != null) {
            final ncq h1 = this.H1;
            if (h1 != null) {
                final ncq q = h1.q(ncq.g(((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight(), ((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()));
                this.G1 = q;
                final rw9 i1 = this.I1;
                final abm l0 = i1.L0;
                final abm g = abm.g;
                abm abm;
                if ((abm = l0) == null) {
                    abm = g;
                }
                float n3;
                float n4;
                float n5;
                if (i1.K0 % 180 == 0) {
                    n3 = (float)q.a;
                    n4 = abm.c;
                    n5 = abm.a;
                }
                else {
                    n3 = (float)q.b;
                    n4 = abm.d;
                    n5 = abm.b;
                }
                this.J1 = n3 / (n4 - n5);
            }
        }
        for (int childCount = ((ViewGroup)this).getChildCount(), j = 0; j < childCount; ++j) {
            final View child = ((ViewGroup)this).getChildAt(j);
            if (child.getVisibility() == 0 && child instanceof b) {
                final b b = (b)child;
                final b.a displayInfo = b.getDisplayInfo();
                if (displayInfo.d == 0.0f) {
                    final float n6 = (float)((View)this).getResources().getDimensionPixelSize(2131167276);
                    final float j2 = this.J1;
                    displayInfo.d = n6 / j2;
                    final float d = n6 / j2;
                    final rw9 i2 = this.I1;
                    final int k0 = i2.K0;
                    final float h2 = ((kvg)((ww9)i2).C0).b.h();
                    final abm l2 = this.I1.L0;
                    final abm g2 = abm.g;
                    abm abm2;
                    if ((abm2 = l2) == null) {
                        abm2 = g2;
                    }
                    displayInfo.d = d;
                    displayInfo.e = (float)tbx.p(-k0);
                    final int p2 = tbx.p(k0);
                    float n7 = 0.0f;
                    float n10 = 0.0f;
                    Label_0499: {
                        float n11;
                        float n12;
                        if (p2 != 90) {
                            if (p2 != 180) {
                                float n8;
                                float n9;
                                if (p2 != 270) {
                                    n7 = (abm2.a + abm2.c) / 2.0f;
                                    n8 = abm2.b;
                                    n9 = abm2.d;
                                }
                                else {
                                    n7 = 1.0f - (abm2.b + abm2.d) / 2.0f;
                                    n8 = abm2.a;
                                    n9 = abm2.c;
                                }
                                n10 = (n8 + n9) / (h2 * 2.0f);
                                break Label_0499;
                            }
                            n7 = 1.0f - (abm2.a + abm2.c) / 2.0f;
                            n11 = abm2.b;
                            n12 = abm2.d;
                        }
                        else {
                            n7 = (abm2.b + abm2.d) / 2.0f;
                            n11 = abm2.a;
                            n12 = abm2.c;
                        }
                        n10 = (1.0f - (n11 + n12) / 2.0f) / h2;
                    }
                    final float n13 = d / 2.0f;
                    displayInfo.b = n7 - n13;
                    displayInfo.c = n10 - displayInfo.a() * n13;
                    this.D(b);
                }
                final ncq b2 = displayInfo.b(this.J1);
                ((View)b).measure(ViewGroup.getChildMeasureSpec(n, 0, b2.a), ViewGroup.getChildMeasureSpec(n2, 0, b2.b));
                final ImageView imageView = b.getImageView();
                ((View)imageView).setScaleX(1.0f);
                ((View)imageView).setScaleY(1.0f);
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        final b d1 = this.D1;
        final int n = 0;
        final boolean b = d1 != null;
        if (actionMasked != 0) {
            final int n2 = 2;
            Label_1404: {
                Label_1360: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_1360;
                            }
                            if (actionMasked == 5) {
                                this.B1 = false;
                                this.C1 = false;
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                this.z1 = pointerId;
                                final int y2 = this.y1;
                                if (y2 != -1 && pointerId != -1) {
                                    final int pointerIndex = motionEvent.findPointerIndex(y2);
                                    final float x2 = motionEvent.getX(pointerIndex);
                                    final float y3 = motionEvent.getY(pointerIndex);
                                    final int pointerIndex2 = motionEvent.findPointerIndex(this.z1);
                                    final float x3 = motionEvent.getX(pointerIndex2);
                                    final float y4 = motionEvent.getY(pointerIndex2);
                                    this.t1 = x2;
                                    this.u1 = y3;
                                    this.v1 = x3;
                                    this.w1 = y4;
                                    this.x1 = y((x3 + x2) / 2.0f, (y4 + y3) / 2.0f, x2, y3);
                                }
                                return true;
                            }
                            if (actionMasked == 6) {
                                this.B();
                                return true;
                            }
                        }
                        else if (b) {
                            if (this.z1 == -1) {
                                final float abs = Math.abs(x - this.t1);
                                final float abs2 = Math.abs(y - this.u1);
                                if (!this.A1) {
                                    final float q1 = this.q1;
                                    this.A1 = (abs >= q1 || abs2 >= q1);
                                }
                                if (this.A1) {
                                    this.B1 = false;
                                    this.C1 = false;
                                    this.A();
                                    if (motionEvent.getPointerId(actionIndex) == this.y1) {
                                        float n3 = x - this.t1;
                                        float n4 = y - this.u1;
                                        ((View)this.D1).offsetLeftAndRight(Math.round(n3));
                                        ((View)this.D1).offsetTopAndBottom(Math.round(n4));
                                        final b.a displayInfo = this.D1.getDisplayInfo();
                                        final int k0 = this.I1.K0;
                                        if (k0 != 90) {
                                            if (k0 != 180) {
                                                if (k0 == 270) {
                                                    final float n5 = -n4;
                                                    n4 = n3;
                                                    n3 = n5;
                                                }
                                            }
                                            else {
                                                n3 = -n3;
                                                n4 = -n4;
                                            }
                                        }
                                        else {
                                            final float n6 = -n3;
                                            n3 = n4;
                                            n4 = n6;
                                        }
                                        final float j1 = this.J1;
                                        displayInfo.b += n3 / j1;
                                        displayInfo.c += n4 / j1;
                                        final int round = Math.round(motionEvent.getX());
                                        final int round2 = Math.round(motionEvent.getY());
                                        final Rect s1 = this.s1;
                                        final int r1 = this.r1;
                                        s1.left = round - r1;
                                        s1.top = round2 - r1;
                                        s1.right = round + r1;
                                        s1.bottom = round2 + r1;
                                        final HoverGarbageCanView o1 = this.o1;
                                        Objects.requireNonNull(o1);
                                        int left = s1.left;
                                        int top = s1.top;
                                        int right = s1.right;
                                        int bottom = s1.bottom;
                                        for (View view = (View)o1; view != this; view = (View)view.getParent()) {
                                            final int left2 = view.getLeft();
                                            left -= left2;
                                            right -= left2;
                                            final int top2 = view.getTop();
                                            top -= top2;
                                            bottom -= top2;
                                        }
                                        int n7 = 0;
                                        Label_0742: {
                                            if (o1.J0 == 1) {
                                                n7 = n;
                                                if (left > ((View)o1).getWidth()) {
                                                    break Label_0742;
                                                }
                                                n7 = n;
                                                if (right < 0) {
                                                    break Label_0742;
                                                }
                                                n7 = n;
                                                if (top > ((View)o1).getHeight()) {
                                                    break Label_0742;
                                                }
                                                n7 = n;
                                                if (bottom < 0) {
                                                    break Label_0742;
                                                }
                                            }
                                            else {
                                                n7 = n;
                                                if (top >= o1.C0.getBottom()) {
                                                    break Label_0742;
                                                }
                                            }
                                            n7 = 1;
                                        }
                                        int n8;
                                        if (n7 != 0) {
                                            n8 = n2;
                                        }
                                        else {
                                            n8 = 1;
                                        }
                                        o1.b(n8);
                                        if (n7 != 0) {
                                            ((View)this.D1).setAlpha(0.5f);
                                        }
                                        else {
                                            ((View)this.D1).setAlpha(1.0f);
                                        }
                                    }
                                    this.t1 = x;
                                    this.u1 = y;
                                    ((View)this).invalidate();
                                    return true;
                                }
                            }
                            else if (this.y1 != -1) {
                                this.B1 = false;
                                this.C1 = false;
                                this.A();
                                ((d)this.D1).setFromMemoryOnly(true);
                                final int pointerIndex3 = motionEvent.findPointerIndex(this.y1);
                                final int pointerIndex4 = motionEvent.findPointerIndex(this.z1);
                                final float x4 = motionEvent.getX(pointerIndex3);
                                final float y5 = motionEvent.getY(pointerIndex3);
                                final float x5 = motionEvent.getX(pointerIndex4);
                                final float y6 = motionEvent.getY(pointerIndex4);
                                final float n9 = (x4 + x5) / 2.0f;
                                final float n10 = (y5 + y6) / 2.0f;
                                final PointF pointF = new PointF(n9, n10);
                                final double y7 = y(n9, n10, x4, y5);
                                final b d2 = this.D1;
                                final float n11 = (float)(this.x1 - y7);
                                final b.a displayInfo2 = d2.getDisplayInfo();
                                final float e = displayInfo2.e + n11;
                                ((View)d2).setRotation(this.I1.K0 - e);
                                displayInfo2.e = e;
                                final float i = xng.j(pointF, this.t1, this.u1);
                                final float l = xng.j(pointF, this.v1, this.w1);
                                final float m = xng.j(pointF, x4, y5);
                                final float j2 = xng.j(pointF, x5, y6);
                                final b d3 = this.D1;
                                final b.a displayInfo3 = d3.getDisplayInfo();
                                final float j3 = this.J1;
                                final float d4 = displayInfo3.d;
                                final float n12 = (l - j2 + (i - m)) / j3;
                                final float n13 = d4 - n12 * 2.0f;
                                float n14 = 0.0f;
                                Label_1161: {
                                    if (n13 > 0.1f || n12 <= 0.0f) {
                                        n14 = n12;
                                        if (n13 < 2.0f) {
                                            break Label_1161;
                                        }
                                        n14 = n12;
                                        if (n12 >= 0.0f) {
                                            break Label_1161;
                                        }
                                    }
                                    if (d4 <= 0.1f) {
                                        n14 = Math.max((d4 - 0.1f) / 2.0f, 0.0f);
                                    }
                                    else {
                                        n14 = Math.min((2.0f - d4) / 2.0f, 0.0f);
                                    }
                                }
                                displayInfo3.d = d4 - n14;
                                final float n15 = n14 / 2.0f;
                                final float n16 = displayInfo3.a() * n14 / 2.0f;
                                displayInfo3.b += n15 / 1.0f;
                                displayInfo3.c += n16 / 1.0f;
                                final ncq b2 = displayInfo3.b(this.J1);
                                ((View)d3).measure(ViewGroup.getChildMeasureSpec(1073741824, 0, b2.a), ViewGroup.getChildMeasureSpec(1073741824, 0, b2.b));
                                this.z(this.D1);
                                this.t1 = x4;
                                this.u1 = y5;
                                this.v1 = x5;
                                this.w1 = y6;
                                this.x1 = y7;
                                return true;
                            }
                        }
                        break Label_1404;
                    }
                    if (this.o1.getGarbageCanState() == 2) {
                        final b d5 = this.D1;
                        if (d5 != null) {
                            ((ViewGroup)this).removeView((View)d5);
                        }
                    }
                    else if (this.B1) {
                        final b d6 = this.D1;
                        if (d6 != null) {
                            this.C(motionEvent, d6);
                        }
                    }
                }
                this.B();
                if (b) {
                    ((d)this.D1).setFromMemoryOnly(false);
                    ((View)this.D1).requestLayout();
                    if (this.C1) {
                        this.D(null);
                    }
                }
                ((ViewGroup)this).requestDisallowInterceptTouchEvent(false);
            }
            ((ViewGroup)this).requestDisallowInterceptTouchEvent(false);
            return false;
        }
        final boolean c = this.C(motionEvent, null);
        this.B1 = (c && d1 == this.D1);
        this.C1 = (b && !c);
        ((ViewGroup)this).requestDisallowInterceptTouchEvent(true);
        this.t1 = x;
        this.u1 = y;
        final int pointerId2 = motionEvent.getPointerId(actionIndex);
        this.y1 = pointerId2;
        if (pointerId2 == -1 || !c) {
            final int pointerId3 = motionEvent.getPointerId(actionIndex);
            this.y1 = pointerId3;
            final int pointerIndex5 = motionEvent.findPointerIndex(pointerId3);
            final float x6 = motionEvent.getX(pointerIndex5);
            final float y8 = motionEvent.getY(pointerIndex5);
            this.t1 = x6;
            this.u1 = y8;
        }
        return true;
    }
    
    public void setStickerEditListener(final a e1) {
        this.E1 = e1;
    }
    
    public final void x(final b b) {
        if (super.k1 == null) {
            ((View)b).setVisibility(8);
        }
        ((ViewGroup)this).addView((View)b);
        ((ViewGroup)this).bringChildToFront(this.p1);
    }
    
    public final void z(final b b) {
        final b.a displayInfo = b.getDisplayInfo();
        final rw9 i1 = this.I1;
        final int k0 = i1.K0;
        final float h = ((kvg)((ww9)i1).C0).b.h();
        final float j1 = this.J1;
        final abm l0 = this.I1.L0;
        final abm g = abm.g;
        abm abm = l0;
        if (l0 == null) {
            abm = g;
        }
        final float n = displayInfo.d / 2.0f;
        final float n2 = displayInfo.b + n;
        final float n3 = displayInfo.a() * n + displayInfo.c;
        final int p = tbx.p(k0);
        float n4;
        float n5;
        if (p != 90) {
            if (p != 180) {
                if (p != 270) {
                    n4 = n2 - abm.a;
                    n5 = n3 - abm.b / h;
                }
                else {
                    final float n6 = abm.a / h;
                    final float b2 = abm.b;
                    n4 = n3 - n6;
                    n5 = 1.0f - b2 - n2;
                }
            }
            else {
                n4 = 1.0f - abm.a - n2;
                n5 = (1.0f - abm.b) / h - n3;
            }
        }
        else {
            final float n7 = (1.0f - abm.a) / h;
            n5 = n2 - abm.b;
            n4 = n7 - n3;
        }
        final int round = Math.round(n4 * j1);
        final int round2 = Math.round(n5 * j1);
        final ncq b3 = displayInfo.b(j1);
        final int n8 = round - b3.a / 2;
        final int n9 = round2 - b3.b / 2;
        final Rect rect = new Rect(n8, n9, b3.a + n8, b3.b + n9);
        final int n10 = (((View)this).getMeasuredWidth() - this.G1.a) / 2 - ((View)this).getPaddingLeft();
        final int n11 = (((View)this).getMeasuredHeight() - this.G1.b) / 2 - ((View)this).getPaddingTop();
        ((View)b).layout(rect.left + n10, rect.top + n11, rect.right + n10, rect.bottom + n11);
        ((View)b).setRotation(displayInfo.e + this.I1.K0);
    }
    
    public interface a
    {
    }
}
