// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import androidx.appcompat.view.menu.a;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.i;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.e;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.WeakHashMap;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;

public class ActionBarContextView extends p9
{
    public CharSequence K0;
    public CharSequence L0;
    public View M0;
    public View N0;
    public View O0;
    public LinearLayout P0;
    public TextView Q0;
    public TextView R0;
    public int S0;
    public int T0;
    public boolean U0;
    public int V0;
    
    public ActionBarContextView(final Context context, final AttributeSet set) {
        super(context, set, 2130968635);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ck1.I0, 2130968635, 0);
        Drawable drawable = null;
        Label_0054: {
            if (obtainStyledAttributes.hasValue(0)) {
                final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    drawable = qli.g(context, resourceId);
                    break Label_0054;
                }
            }
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        final WeakHashMap a = p5x.a;
        p5x$d.q((View)this, drawable);
        this.S0 = obtainStyledAttributes.getResourceId(5, 0);
        this.T0 = obtainStyledAttributes.getResourceId(4, 0);
        super.G0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.V0 = obtainStyledAttributes.getResourceId(2, 2131623941);
        obtainStyledAttributes.recycle();
    }
    
    public final void f(final zk zk) {
        final View m0 = this.M0;
        if (m0 == null) {
            ((ViewGroup)this).addView(this.M0 = LayoutInflater.from(((View)this).getContext()).inflate(this.V0, (ViewGroup)this, false));
        }
        else if (m0.getParent() == null) {
            ((ViewGroup)this).addView(this.M0);
        }
        (this.N0 = this.M0.findViewById(2131427480)).setOnClickListener((View$OnClickListener)new ActionBarContextView$a(zk));
        final e e = (e)zk.e();
        final ActionMenuPresenter f0 = super.F0;
        if (f0 != null) {
            f0.i();
        }
        final ActionMenuPresenter f2 = new ActionMenuPresenter(((View)this).getContext());
        super.F0 = f2;
        f2.N0 = true;
        f2.O0 = true;
        final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-2, -1);
        e.c((i)super.F0, super.D0);
        final ActionMenuPresenter f3 = super.F0;
        final j j0 = ((a)f3).J0;
        if (j0 == null) {
            (((a)f3).J0 = (j)((a)f3).F0.inflate(((a)f3).H0, (ViewGroup)this, false)).a(((a)f3).E0);
            f3.d();
        }
        final j j2 = ((a)f3).J0;
        if (j0 != j2) {
            ((ActionMenuView)j2).setPresenter(f3);
        }
        final ActionMenuView e2 = (ActionMenuView)j2;
        super.E0 = e2;
        final WeakHashMap a = p5x.a;
        p5x$d.q((View)e2, (Drawable)null);
        ((ViewGroup)this).addView((View)super.E0, viewGroup$LayoutParams);
    }
    
    public final void g() {
        if (this.P0 == null) {
            LayoutInflater.from(((View)this).getContext()).inflate(2131623936, (ViewGroup)this);
            final LinearLayout p0 = (LinearLayout)((ViewGroup)this).getChildAt(((ViewGroup)this).getChildCount() - 1);
            this.P0 = p0;
            this.Q0 = (TextView)((View)p0).findViewById(2131427445);
            this.R0 = (TextView)((View)this.P0).findViewById(2131427444);
            if (this.S0 != 0) {
                this.Q0.setTextAppearance(((View)this).getContext(), this.S0);
            }
            if (this.T0 != 0) {
                this.R0.setTextAppearance(((View)this).getContext(), this.T0);
            }
        }
        this.Q0.setText(this.K0);
        this.R0.setText(this.L0);
        final boolean empty = TextUtils.isEmpty(this.K0);
        final boolean b = TextUtils.isEmpty(this.L0) ^ true;
        final TextView r0 = this.R0;
        final int n = 0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)r0).setVisibility(visibility);
        final LinearLayout p2 = this.P0;
        int visibility2 = n;
        if (!(empty ^ true)) {
            if (b) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
        }
        ((View)p2).setVisibility(visibility2);
        if (((View)this.P0).getParent() == null) {
            ((ViewGroup)this).addView((View)this.P0);
        }
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(((View)this).getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.L0;
    }
    
    public CharSequence getTitle() {
        return this.K0;
    }
    
    public final void h() {
        ((ViewGroup)this).removeAllViews();
        this.O0 = null;
        super.E0 = null;
        super.F0 = null;
        final View n0 = this.N0;
        if (n0 != null) {
            n0.setOnClickListener((View$OnClickListener)null);
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final ActionMenuPresenter f0 = super.F0;
        if (f0 != null) {
            f0.k();
            final ActionMenuPresenter.a v0 = super.F0.V0;
            if (v0 != null && v0.b()) {
                ((w4q)v0.j).dismiss();
            }
        }
    }
    
    public final void onLayout(final boolean b, int paddingLeft, int n, final int n2, int n3) {
        final boolean b2 = vbx.b((View)this);
        int paddingLeft2;
        if (b2) {
            paddingLeft2 = n2 - paddingLeft - ((View)this).getPaddingRight();
        }
        else {
            paddingLeft2 = ((View)this).getPaddingLeft();
        }
        final int paddingTop = ((View)this).getPaddingTop();
        final int n4 = n3 - n - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom();
        final View m0 = this.M0;
        n = paddingLeft2;
        if (m0 != null) {
            n = paddingLeft2;
            if (m0.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.M0.getLayoutParams();
                if (b2) {
                    n3 = viewGroup$MarginLayoutParams.rightMargin;
                }
                else {
                    n3 = viewGroup$MarginLayoutParams.leftMargin;
                }
                if (b2) {
                    n = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n = viewGroup$MarginLayoutParams.rightMargin;
                }
                if (b2) {
                    n3 = paddingLeft2 - n3;
                }
                else {
                    n3 += paddingLeft2;
                }
                n3 += this.d(this.M0, n3, paddingTop, n4, b2);
                if (b2) {
                    n = n3 - n;
                }
                else {
                    n += n3;
                }
            }
        }
        final LinearLayout p5 = this.P0;
        n3 = n;
        if (p5 != null) {
            n3 = n;
            if (this.O0 == null) {
                n3 = n;
                if (((View)p5).getVisibility() != 8) {
                    n3 = n + this.d((View)this.P0, n, paddingTop, n4, b2);
                }
            }
        }
        final View o0 = this.O0;
        if (o0 != null) {
            this.d(o0, n3, paddingTop, n4, b2);
        }
        if (b2) {
            paddingLeft = ((View)this).getPaddingLeft();
        }
        else {
            paddingLeft = n2 - paddingLeft - ((View)this).getPaddingRight();
        }
        final ActionMenuView e0 = super.E0;
        if (e0 != null) {
            this.d((View)e0, paddingLeft, paddingTop, n4, b2 ^ true);
        }
    }
    
    public final void onMeasure(int i, int n) {
        final int mode = View$MeasureSpec.getMode(i);
        final int n2 = 1073741824;
        if (mode != 1073741824) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View$MeasureSpec.getMode(n) != 0) {
            final int size = View$MeasureSpec.getSize(i);
            int n3 = super.G0;
            if (n3 <= 0) {
                n3 = View$MeasureSpec.getSize(n);
            }
            i = ((View)this).getPaddingTop();
            final int n4 = ((View)this).getPaddingBottom() + i;
            i = size - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight();
            final int n5 = n3 - n4;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(n5, Integer.MIN_VALUE);
            final View m0 = this.M0;
            n = i;
            if (m0 != null) {
                i = this.c(m0, i, measureSpec);
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.M0.getLayoutParams();
                n = i - (viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin);
            }
            final ActionMenuView e0 = super.E0;
            i = n;
            if (e0 != null) {
                i = n;
                if (((View)e0).getParent() == this) {
                    i = this.c((View)super.E0, n, measureSpec);
                }
            }
            final LinearLayout p2 = this.P0;
            final int n6 = 0;
            n = i;
            if (p2 != null) {
                n = i;
                if (this.O0 == null) {
                    if (this.U0) {
                        n = View$MeasureSpec.makeMeasureSpec(0, 0);
                        ((View)this.P0).measure(n, measureSpec);
                        final int measuredWidth = ((View)this.P0).getMeasuredWidth();
                        final boolean b = measuredWidth <= i;
                        n = i;
                        if (b) {
                            n = i - measuredWidth;
                        }
                        final LinearLayout p3 = this.P0;
                        if (b) {
                            i = 0;
                        }
                        else {
                            i = 8;
                        }
                        ((View)p3).setVisibility(i);
                    }
                    else {
                        n = this.c((View)p2, i, measureSpec);
                    }
                }
            }
            final View o0 = this.O0;
            if (o0 != null) {
                final ViewGroup$LayoutParams layoutParams = o0.getLayoutParams();
                final int width = layoutParams.width;
                if (width != -2) {
                    i = 1073741824;
                }
                else {
                    i = Integer.MIN_VALUE;
                }
                int min = n;
                if (width >= 0) {
                    min = Math.min(width, n);
                }
                final int height = layoutParams.height;
                if (height != -2) {
                    n = n2;
                }
                else {
                    n = Integer.MIN_VALUE;
                }
                int min2 = n5;
                if (height >= 0) {
                    min2 = Math.min(height, n5);
                }
                this.O0.measure(View$MeasureSpec.makeMeasureSpec(min, i), View$MeasureSpec.makeMeasureSpec(min2, n));
            }
            if (super.G0 <= 0) {
                final int childCount = ((ViewGroup)this).getChildCount();
                int n7 = 0;
                int n8;
                for (i = n6; i < childCount; ++i, n7 = n) {
                    n8 = ((ViewGroup)this).getChildAt(i).getMeasuredHeight() + n4;
                    if (n8 > (n = n7)) {
                        n = n8;
                    }
                }
                ((View)this).setMeasuredDimension(size, n7);
            }
            else {
                ((View)this).setMeasuredDimension(size, n3);
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getClass().getSimpleName());
        sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
        throw new IllegalStateException(sb2.toString());
    }
    
    public void setContentHeight(final int g0) {
        super.G0 = g0;
    }
    
    public void setCustomView(final View o0) {
        final View o2 = this.O0;
        if (o2 != null) {
            ((ViewGroup)this).removeView(o2);
        }
        if ((this.O0 = o0) != null) {
            final LinearLayout p = this.P0;
            if (p != null) {
                ((ViewGroup)this).removeView((View)p);
                this.P0 = null;
            }
        }
        if (o0 != null) {
            ((ViewGroup)this).addView(o0);
        }
        ((View)this).requestLayout();
    }
    
    public void setSubtitle(final CharSequence l0) {
        this.L0 = l0;
        this.g();
    }
    
    public void setTitle(final CharSequence k0) {
        this.K0 = k0;
        this.g();
        p5x.B((View)this, k0);
    }
    
    public void setTitleOptional(final boolean u0) {
        if (u0 != this.U0) {
            ((View)this).requestLayout();
        }
        this.U0 = u0;
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
