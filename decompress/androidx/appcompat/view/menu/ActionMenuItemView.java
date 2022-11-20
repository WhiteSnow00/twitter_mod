// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.TextView;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.widget.Button;
import android.view.View;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements j$a, View$OnClickListener, a
{
    public g J0;
    public CharSequence K0;
    public Drawable L0;
    public e$b M0;
    public ActionMenuItemView.ActionMenuItemView$a N0;
    public ActionMenuItemView.ActionMenuItemView$b O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public int T0;
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        final Resources resources = context.getResources();
        this.P0 = this.e();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, jee.K0, 0, 0);
        this.R0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.T0 = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        ((View)this).setOnClickListener((View$OnClickListener)this);
        this.S0 = -1;
        ((View)this).setSaveEnabled(false);
    }
    
    public final boolean a() {
        return TextUtils.isEmpty(this.getText()) ^ true;
    }
    
    public final boolean b() {
        return this.a();
    }
    
    public final boolean c() {
        return this.a() && this.J0.getIcon() == null;
    }
    
    public final void d(final g j0) {
        this.J0 = j0;
        this.setIcon(j0.getIcon());
        this.setTitle(j0.getTitleCondensed());
        ((View)this).setId(j0.a);
        int visibility;
        if (j0.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        ((View)this).setEnabled(j0.isEnabled());
        if (j0.hasSubMenu() && this.N0 == null) {
            this.N0 = new ActionMenuItemView.ActionMenuItemView$a(this);
        }
    }
    
    public final boolean e() {
        final Configuration configuration = ((View)this).getContext().getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        return screenWidthDp >= 480 || (screenWidthDp >= 640 && screenHeightDp >= 480) || configuration.orientation == 2;
    }
    
    public final void f() {
        final boolean empty = TextUtils.isEmpty(this.K0);
        boolean b2;
        final boolean b = b2 = true;
        Label_0066: {
            if (this.L0 != null) {
                if ((this.J0.y & 0x4) == 0x4) {
                    b2 = b;
                    if (this.P0) {
                        break Label_0066;
                    }
                    if (this.Q0) {
                        b2 = b;
                        break Label_0066;
                    }
                }
                b2 = false;
            }
        }
        final boolean b3 = (empty ^ true) & b2;
        final CharSequence charSequence = null;
        CharSequence k0;
        if (b3) {
            k0 = this.K0;
        }
        else {
            k0 = null;
        }
        ((TextView)this).setText(k0);
        final CharSequence q = this.J0.q;
        if (TextUtils.isEmpty(q)) {
            CharSequence e;
            if (b3) {
                e = null;
            }
            else {
                e = this.J0.e;
            }
            ((View)this).setContentDescription(e);
        }
        else {
            ((View)this).setContentDescription(q);
        }
        final CharSequence r = this.J0.r;
        if (TextUtils.isEmpty(r)) {
            CharSequence e2;
            if (b3) {
                e2 = charSequence;
            }
            else {
                e2 = this.J0.e;
            }
            xit.a((View)this, e2);
        }
        else {
            xit.a((View)this, r);
        }
    }
    
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
    
    public g getItemData() {
        return this.J0;
    }
    
    public final void onClick(final View view) {
        final e$b m0 = this.M0;
        if (m0 != null) {
            m0.c(this.J0);
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.P0 = this.e();
        this.f();
    }
    
    public final void onMeasure(int n, final int n2) {
        final boolean a = this.a();
        if (a) {
            final int s0 = this.S0;
            if (s0 >= 0) {
                super.setPadding(s0, ((View)this).getPaddingTop(), ((View)this).getPaddingRight(), ((View)this).getPaddingBottom());
            }
        }
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n);
        n = View$MeasureSpec.getSize(n);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            n = Math.min(n, this.R0);
        }
        else {
            n = this.R0;
        }
        if (mode != 1073741824 && this.R0 > 0 && measuredWidth < n) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), n2);
        }
        if (!a && this.L0 != null) {
            super.setPadding((((View)this).getMeasuredWidth() - this.L0.getBounds().width()) / 2, ((View)this).getPaddingTop(), ((View)this).getPaddingRight(), ((View)this).getPaddingBottom());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable)null);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.J0.hasSubMenu()) {
            final ActionMenuItemView.ActionMenuItemView$a n0 = this.N0;
            if (n0 != null && ((vlb)n0).onTouch((View)this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setCheckable(final boolean b) {
    }
    
    public void setChecked(final boolean b) {
    }
    
    public void setExpandedFormat(final boolean q0) {
        if (this.Q0 != q0) {
            this.Q0 = q0;
            final g j0 = this.J0;
            if (j0 != null) {
                j0.n.q();
            }
        }
    }
    
    public void setIcon(final Drawable l0) {
        this.L0 = l0;
        if (l0 != null) {
            final int intrinsicWidth = l0.getIntrinsicWidth();
            final int intrinsicHeight = l0.getIntrinsicHeight();
            int t0 = this.T0;
            int n = intrinsicWidth;
            int n2 = intrinsicHeight;
            if (intrinsicWidth > t0) {
                n2 = (int)(intrinsicHeight * (t0 / (float)intrinsicWidth));
                n = t0;
            }
            if (n2 > t0) {
                n *= (int)(t0 / (float)n2);
            }
            else {
                t0 = n2;
            }
            l0.setBounds(0, 0, n, t0);
        }
        this.setCompoundDrawables(l0, (Drawable)null, (Drawable)null, (Drawable)null);
        this.f();
    }
    
    public void setItemInvoker(final e$b m0) {
        this.M0 = m0;
    }
    
    public final void setPadding(final int s0, final int n, final int n2, final int n3) {
        super.setPadding(this.S0 = s0, n, n2, n3);
    }
    
    public void setPopupCallback(final ActionMenuItemView.ActionMenuItemView$b o0) {
        this.O0 = o0;
    }
    
    public void setTitle(final CharSequence k0) {
        this.K0 = k0;
        this.f();
    }
}
