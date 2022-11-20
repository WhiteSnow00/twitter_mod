// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import android.view.View;

public final class ViewStubCompat extends View
{
    public int D0;
    public int E0;
    public WeakReference<View> F0;
    public LayoutInflater G0;
    public a H0;
    
    public ViewStubCompat(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.D0 = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, jee.j1, 0, 0);
        this.E0 = obtainStyledAttributes.getResourceId(2, -1);
        this.D0 = obtainStyledAttributes.getResourceId(1, 0);
        this.setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    public final View a() {
        final ViewParent parent = this.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.D0 != 0) {
            final ViewGroup viewGroup = (ViewGroup)parent;
            LayoutInflater layoutInflater = this.G0;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.getContext());
            }
            final View inflate = layoutInflater.inflate(this.D0, viewGroup, false);
            final int e0 = this.E0;
            if (e0 != -1) {
                inflate.setId(e0);
            }
            final int indexOfChild = viewGroup.indexOfChild((View)this);
            viewGroup.removeViewInLayout((View)this);
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            }
            else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.F0 = new WeakReference<View>(inflate);
            final a h0 = this.H0;
            if (h0 != null) {
                h0.a();
            }
            return inflate;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    
    public final void dispatchDraw(final Canvas canvas) {
    }
    
    @SuppressLint({ "MissingSuperCall" })
    public final void draw(final Canvas canvas) {
    }
    
    public int getInflatedId() {
        return this.E0;
    }
    
    public LayoutInflater getLayoutInflater() {
        return this.G0;
    }
    
    public int getLayoutResource() {
        return this.D0;
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setInflatedId(final int e0) {
        this.E0 = e0;
    }
    
    public void setLayoutInflater(final LayoutInflater g0) {
        this.G0 = g0;
    }
    
    public void setLayoutResource(final int d0) {
        this.D0 = d0;
    }
    
    public void setOnInflateListener(final a h0) {
        this.H0 = h0;
    }
    
    public void setVisibility(final int n) {
        final WeakReference<View> f0 = this.F0;
        if (f0 != null) {
            final View view = f0.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(n);
        }
        else {
            super.setVisibility(n);
            if (n == 0 || n == 4) {
                this.a();
            }
        }
    }
    
    public interface a
    {
        void a();
    }
}
