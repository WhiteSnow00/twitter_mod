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
import com.twitter.android.media.imageeditor.b$a;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.twitter.media.legacy.widget.HoverGarbageCanView;

public class StickerFilteredImageView extends l0b
{
    public double A1;
    public int B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public b G1;
    public StickerFilteredImageView.StickerFilteredImageView$a H1;
    public boolean I1;
    public beq J1;
    public beq K1;
    public ex9 L1;
    public float M1;
    public final HoverGarbageCanView r1;
    public final View s1;
    public final float t1;
    public final int u1;
    public final Rect v1;
    public float w1;
    public float x1;
    public float y1;
    public float z1;
    
    public StickerFilteredImageView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.v1 = new Rect();
        this.w1 = -1.0f;
        this.x1 = -1.0f;
        this.y1 = -1.0f;
        this.z1 = -1.0f;
        this.A1 = 0.0;
        this.B1 = -1;
        this.C1 = -1;
        this.J1 = beq.c;
        this.t1 = (float)ViewConfiguration.get(context).getScaledTouchSlop();
        final View inflate = LayoutInflater.from(context).inflate(2131625734, (ViewGroup)this, false);
        this.s1 = inflate;
        final HoverGarbageCanView r1 = (HoverGarbageCanView)inflate.findViewById(2131432230);
        this.r1 = r1;
        this.u1 = ((View)this).getResources().getDimensionPixelSize(2131165928);
        ((ViewGroup)this).addView(inflate);
        r1.N0 = 0;
        r1.F0.setVisibility(4);
        r1.I0.setAlpha(0.0f);
        r1.I0.setVisibility(8);
        final View j0 = r1.J0;
        if (j0 != null) {
            j0.setVisibility(4);
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
        final StickerFilteredImageView.StickerFilteredImageView$a h1 = this.H1;
        if (h1 != null && !this.I1) {
            final b$a b$a = (b$a)h1;
            final com.twitter.android.media.imageeditor.b a = b$a.a;
            a.y2(false, true);
            a.h2.animate().translationY((float)a.h2.getMeasuredHeight()).alpha(0.0f).setDuration(250L).setListener((Animator$AnimatorListener)new us9(a)).start();
            final com.twitter.android.media.imageeditor.b a2 = b$a.a;
            a2.i2.animate().translationY((float)(-a2.i2.getMeasuredHeight())).alpha(0.0f).setDuration(250L).setListener((Animator$AnimatorListener)new ws9(a2)).start();
            b$a.a.u2(false);
            this.I1 = true;
        }
    }
    
    public final void B() {
        this.C1 = -1;
        this.B1 = -1;
        this.w1 = -1.0f;
        this.x1 = -1.0f;
        this.y1 = -1.0f;
        this.z1 = -1.0f;
        this.A1 = 0.0;
        this.D1 = false;
        if (this.G1 != null) {
            final StickerFilteredImageView.StickerFilteredImageView$a h1 = this.H1;
            if (h1 != null && this.I1) {
                final b$a b$a = (b$a)h1;
                b$a.a.x2(true);
                final com.twitter.android.media.imageeditor.b a = b$a.a;
                a.i2.animate().cancel();
                a.i2.setVisibility(0);
                a.i2.setAlpha(0.0f);
                final View i2 = a.i2;
                final q20 q20 = new q20((Object)a, 5);
                final WeakHashMap a2 = b7x.a;
                b7x$d.m(i2, (Runnable)q20);
                b$a.a.u2(true);
                this.I1 = false;
            }
            ((View)this.G1).setAlpha(1.0f);
        }
        this.r1.b(0);
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
                    ((ViewGroup)this).bringChildToFront(this.s1);
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
    
    public final void D(final b g1) {
        final b g2 = this.G1;
        if (g2 == g1) {
            return;
        }
        if (g2 != null) {
            ((View)g2).setAlpha(1.0f);
            this.G1.setIsActive(false);
            ((View)this.G1).invalidate();
        }
        if ((this.G1 = g1) != null) {
            g1.setIsActive(true);
            ((View)g1).invalidate();
        }
        this.B();
    }
    
    public beq getOrientedImageSize() {
        return this.J1;
    }
    
    public List<com.twitter.android.media.stickers.b$a> getStickers() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
            if (((ViewGroup)this).getChildAt(i) instanceof b) {
                list.add(((b)((ViewGroup)this).getChildAt(i)).getDisplayInfo());
            }
        }
        return list;
    }
    
    public final void i(final d9d d9d, final Drawable drawable) {
        super.i(d9d, drawable);
        if (drawable != null) {
            this.K1 = beq.g(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
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
        if (this.L1 != null) {
            final beq k1 = this.K1;
            if (k1 != null) {
                final beq q = k1.q(beq.g(((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight(), ((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()));
                this.J1 = q;
                final ex9 l1 = this.L1;
                final ccm o0 = l1.O0;
                final ccm g = ccm.g;
                ccm ccm;
                if ((ccm = o0) == null) {
                    ccm = g;
                }
                float n3;
                float n4;
                float n5;
                if (l1.N0 % 180 == 0) {
                    n3 = (float)q.a;
                    n4 = ccm.c;
                    n5 = ccm.a;
                }
                else {
                    n3 = (float)q.b;
                    n4 = ccm.d;
                    n5 = ccm.b;
                }
                this.M1 = n3 / (n4 - n5);
            }
        }
        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            if (child.getVisibility() == 0 && child instanceof b) {
                final b b = (b)child;
                final b.b$a displayInfo = b.getDisplayInfo();
                if (displayInfo.d == 0.0f) {
                    final float n6 = (float)((View)this).getResources().getDimensionPixelSize(2131167276);
                    final float m1 = this.M1;
                    displayInfo.d = n6 / m1;
                    final float d = n6 / m1;
                    final ex9 l2 = this.L1;
                    final int n7 = l2.N0;
                    final float h = ((dwg)((jx9)l2).F0).b.h();
                    final ccm o2 = this.L1.O0;
                    final ccm g2 = ccm.g;
                    ccm ccm2;
                    if ((ccm2 = o2) == null) {
                        ccm2 = g2;
                    }
                    displayInfo.d = d;
                    displayInfo.e = (float)hdx.p(-n7);
                    final int p2 = hdx.p(n7);
                    float n8 = 0.0f;
                    float n11 = 0.0f;
                    Label_0523: {
                        float n12;
                        float n13;
                        if (p2 != 90) {
                            if (p2 != 180) {
                                float n9;
                                float n10;
                                if (p2 != 270) {
                                    n8 = (ccm2.a + ccm2.c) / 2.0f;
                                    n9 = ccm2.b;
                                    n10 = ccm2.d;
                                }
                                else {
                                    n8 = 1.0f - (ccm2.b + ccm2.d) / 2.0f;
                                    n9 = ccm2.a;
                                    n10 = ccm2.c;
                                }
                                n11 = (n9 + n10) / (h * 2.0f);
                                break Label_0523;
                            }
                            n8 = 1.0f - (ccm2.a + ccm2.c) / 2.0f;
                            n12 = ccm2.b;
                            n13 = ccm2.d;
                        }
                        else {
                            n8 = (ccm2.b + ccm2.d) / 2.0f;
                            n12 = ccm2.a;
                            n13 = ccm2.c;
                        }
                        n11 = (1.0f - (n12 + n13) / 2.0f) / h;
                    }
                    final float n14 = d / 2.0f;
                    displayInfo.b = n8 - n14;
                    displayInfo.c = n11 - displayInfo.a() * n14;
                    this.D(b);
                }
                final beq b2 = displayInfo.b(this.M1);
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
        final b g1 = this.G1;
        final int n = 0;
        final boolean b = g1 != null;
        if (actionMasked != 0) {
            final int n2 = 2;
            Label_1433: {
                Label_1389: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_1389;
                            }
                            if (actionMasked == 5) {
                                this.E1 = false;
                                this.F1 = false;
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                this.C1 = pointerId;
                                final int b2 = this.B1;
                                if (b2 != -1 && pointerId != -1) {
                                    final int pointerIndex = motionEvent.findPointerIndex(b2);
                                    final float x2 = motionEvent.getX(pointerIndex);
                                    final float y2 = motionEvent.getY(pointerIndex);
                                    final int pointerIndex2 = motionEvent.findPointerIndex(this.C1);
                                    final float x3 = motionEvent.getX(pointerIndex2);
                                    final float y3 = motionEvent.getY(pointerIndex2);
                                    this.w1 = x2;
                                    this.x1 = y2;
                                    this.y1 = x3;
                                    this.z1 = y3;
                                    this.A1 = y((x3 + x2) / 2.0f, (y3 + y2) / 2.0f, x2, y2);
                                }
                                return true;
                            }
                            if (actionMasked == 6) {
                                this.B();
                                return true;
                            }
                        }
                        else if (b) {
                            if (this.C1 == -1) {
                                final float abs = Math.abs(x - this.w1);
                                final float abs2 = Math.abs(y - this.x1);
                                if (!this.D1) {
                                    final float t1 = this.t1;
                                    this.D1 = (abs >= t1 || abs2 >= t1);
                                }
                                if (this.D1) {
                                    this.E1 = false;
                                    this.F1 = false;
                                    this.A();
                                    if (motionEvent.getPointerId(actionIndex) == this.B1) {
                                        float n3 = x - this.w1;
                                        float n4 = y - this.x1;
                                        ((View)this.G1).offsetLeftAndRight(Math.round(n3));
                                        ((View)this.G1).offsetTopAndBottom(Math.round(n4));
                                        final b.b$a displayInfo = this.G1.getDisplayInfo();
                                        final int n5 = this.L1.N0;
                                        if (n5 != 90) {
                                            if (n5 != 180) {
                                                if (n5 == 270) {
                                                    final float n6 = -n4;
                                                    n4 = n3;
                                                    n3 = n6;
                                                }
                                            }
                                            else {
                                                n3 = -n3;
                                                n4 = -n4;
                                            }
                                        }
                                        else {
                                            final float n7 = -n3;
                                            n3 = n4;
                                            n4 = n7;
                                        }
                                        final float m1 = this.M1;
                                        displayInfo.b += n3 / m1;
                                        displayInfo.c += n4 / m1;
                                        final int round = Math.round(motionEvent.getX());
                                        final int round2 = Math.round(motionEvent.getY());
                                        final Rect v1 = this.v1;
                                        final int u1 = this.u1;
                                        v1.left = round - u1;
                                        v1.top = round2 - u1;
                                        v1.right = round + u1;
                                        v1.bottom = round2 + u1;
                                        final HoverGarbageCanView r1 = this.r1;
                                        Objects.requireNonNull(r1);
                                        int left = v1.left;
                                        int top = v1.top;
                                        int right = v1.right;
                                        int bottom = v1.bottom;
                                        for (View view = (View)r1; view != this; view = (View)view.getParent()) {
                                            final int left2 = view.getLeft();
                                            left -= left2;
                                            right -= left2;
                                            final int top2 = view.getTop();
                                            top -= top2;
                                            bottom -= top2;
                                        }
                                        int n8 = 0;
                                        Label_0771: {
                                            if (r1.M0 == 1) {
                                                n8 = n;
                                                if (left > ((View)r1).getWidth()) {
                                                    break Label_0771;
                                                }
                                                n8 = n;
                                                if (right < 0) {
                                                    break Label_0771;
                                                }
                                                n8 = n;
                                                if (top > ((View)r1).getHeight()) {
                                                    break Label_0771;
                                                }
                                                n8 = n;
                                                if (bottom < 0) {
                                                    break Label_0771;
                                                }
                                            }
                                            else {
                                                n8 = n;
                                                if (top >= r1.F0.getBottom()) {
                                                    break Label_0771;
                                                }
                                            }
                                            n8 = 1;
                                        }
                                        int n9;
                                        if (n8 != 0) {
                                            n9 = n2;
                                        }
                                        else {
                                            n9 = 1;
                                        }
                                        r1.b(n9);
                                        if (n8 != 0) {
                                            ((View)this.G1).setAlpha(0.5f);
                                        }
                                        else {
                                            ((View)this.G1).setAlpha(1.0f);
                                        }
                                    }
                                    this.w1 = x;
                                    this.x1 = y;
                                    ((View)this).invalidate();
                                    return true;
                                }
                            }
                            else if (this.B1 != -1) {
                                this.E1 = false;
                                this.F1 = false;
                                this.A();
                                ((d)this.G1).setFromMemoryOnly(true);
                                final int pointerIndex3 = motionEvent.findPointerIndex(this.B1);
                                final int pointerIndex4 = motionEvent.findPointerIndex(this.C1);
                                final float x4 = motionEvent.getX(pointerIndex3);
                                final float y4 = motionEvent.getY(pointerIndex3);
                                final float x5 = motionEvent.getX(pointerIndex4);
                                final float y5 = motionEvent.getY(pointerIndex4);
                                final float n10 = (x4 + x5) / 2.0f;
                                final float n11 = (y4 + y5) / 2.0f;
                                final PointF pointF = new PointF(n10, n11);
                                final double y6 = y(n10, n11, x4, y4);
                                final b g2 = this.G1;
                                final float n12 = (float)(this.A1 - y6);
                                final b.b$a displayInfo2 = g2.getDisplayInfo();
                                final float e = displayInfo2.e + n12;
                                ((View)g2).setRotation(this.L1.N0 - e);
                                displayInfo2.e = e;
                                final float j = qog.j(pointF, this.w1, this.x1);
                                final float i = qog.j(pointF, this.y1, this.z1);
                                final float k = qog.j(pointF, x4, y4);
                                final float l = qog.j(pointF, x5, y5);
                                final b g3 = this.G1;
                                final b.b$a displayInfo3 = g3.getDisplayInfo();
                                final float m2 = this.M1;
                                final float d = displayInfo3.d;
                                final float n13 = (i - l + (j - k)) / m2;
                                final float n14 = d - n13 * 2.0f;
                                float n15 = 0.0f;
                                Label_1191: {
                                    if (n14 > 0.1f || n13 <= 0.0f) {
                                        n15 = n13;
                                        if (n14 < 2.0f) {
                                            break Label_1191;
                                        }
                                        n15 = n13;
                                        if (n13 >= 0.0f) {
                                            break Label_1191;
                                        }
                                    }
                                    if (d <= 0.1f) {
                                        n15 = Math.max((d - 0.1f) / 2.0f, 0.0f);
                                    }
                                    else {
                                        n15 = Math.min((2.0f - d) / 2.0f, 0.0f);
                                    }
                                }
                                displayInfo3.d = d - n15;
                                final float n16 = n15 / 2.0f;
                                final float n17 = displayInfo3.a() * n15 / 2.0f;
                                displayInfo3.b += n16 / 1.0f;
                                displayInfo3.c += n17 / 1.0f;
                                final beq b3 = displayInfo3.b(this.M1);
                                ((View)g3).measure(ViewGroup.getChildMeasureSpec(1073741824, 0, b3.a), ViewGroup.getChildMeasureSpec(1073741824, 0, b3.b));
                                this.z(this.G1);
                                this.w1 = x4;
                                this.x1 = y4;
                                this.y1 = x5;
                                this.z1 = y5;
                                this.A1 = y6;
                                return true;
                            }
                        }
                        break Label_1433;
                    }
                    if (this.r1.getGarbageCanState() == 2) {
                        final b g4 = this.G1;
                        if (g4 != null) {
                            ((ViewGroup)this).removeView((View)g4);
                        }
                    }
                    else if (this.E1) {
                        final b g5 = this.G1;
                        if (g5 != null) {
                            this.C(motionEvent, g5);
                        }
                    }
                }
                this.B();
                if (b) {
                    ((d)this.G1).setFromMemoryOnly(false);
                    ((View)this.G1).requestLayout();
                    if (this.F1) {
                        this.D(null);
                    }
                }
                ((ViewGroup)this).requestDisallowInterceptTouchEvent(false);
            }
            ((ViewGroup)this).requestDisallowInterceptTouchEvent(false);
            return false;
        }
        final boolean c = this.C(motionEvent, null);
        this.E1 = (c && g1 == this.G1);
        this.F1 = (b && !c);
        ((ViewGroup)this).requestDisallowInterceptTouchEvent(true);
        this.w1 = x;
        this.x1 = y;
        final int pointerId2 = motionEvent.getPointerId(actionIndex);
        this.B1 = pointerId2;
        if (pointerId2 == -1 || !c) {
            final int pointerId3 = motionEvent.getPointerId(actionIndex);
            this.B1 = pointerId3;
            final int pointerIndex5 = motionEvent.findPointerIndex(pointerId3);
            final float x6 = motionEvent.getX(pointerIndex5);
            final float y7 = motionEvent.getY(pointerIndex5);
            this.w1 = x6;
            this.x1 = y7;
        }
        return true;
    }
    
    public void setStickerEditListener(final StickerFilteredImageView.StickerFilteredImageView$a h1) {
        this.H1 = h1;
    }
    
    public final void x(final b b) {
        if (super.n1 == null) {
            ((View)b).setVisibility(8);
        }
        ((ViewGroup)this).addView((View)b);
        ((ViewGroup)this).bringChildToFront(this.s1);
    }
    
    public final void z(final b b) {
        final b.b$a displayInfo = b.getDisplayInfo();
        final ex9 l1 = this.L1;
        final int n0 = l1.N0;
        final float h = ((dwg)((jx9)l1).F0).b.h();
        final float m1 = this.M1;
        final ccm o0 = this.L1.O0;
        final ccm g = ccm.g;
        ccm ccm = o0;
        if (o0 == null) {
            ccm = g;
        }
        final float n2 = displayInfo.d / 2.0f;
        final float n3 = displayInfo.b + n2;
        final float n4 = displayInfo.a() * n2 + displayInfo.c;
        final int p = hdx.p(n0);
        float n5;
        float n6;
        if (p != 90) {
            if (p != 180) {
                if (p != 270) {
                    n5 = n3 - ccm.a;
                    n6 = n4 - ccm.b / h;
                }
                else {
                    final float n7 = ccm.a / h;
                    final float b2 = ccm.b;
                    n5 = n4 - n7;
                    n6 = 1.0f - b2 - n3;
                }
            }
            else {
                n5 = 1.0f - ccm.a - n3;
                n6 = (1.0f - ccm.b) / h - n4;
            }
        }
        else {
            final float n8 = (1.0f - ccm.a) / h;
            n6 = n3 - ccm.b;
            n5 = n8 - n4;
        }
        final int round = Math.round(n5 * m1);
        final int round2 = Math.round(n6 * m1);
        final beq b3 = displayInfo.b(m1);
        final int n9 = round - b3.a / 2;
        final int n10 = round2 - b3.b / 2;
        final Rect rect = new Rect(n9, n10, b3.a + n9, b3.b + n10);
        final int n11 = (((View)this).getMeasuredWidth() - this.J1.a) / 2 - ((View)this).getPaddingLeft();
        final int n12 = (((View)this).getMeasuredHeight() - this.J1.b) / 2 - ((View)this).getPaddingTop();
        ((View)b).layout(rect.left + n11, rect.top + n12, rect.right + n11, rect.bottom + n12);
        ((View)b).setRotation(displayInfo.e + this.L1.N0);
    }
}
