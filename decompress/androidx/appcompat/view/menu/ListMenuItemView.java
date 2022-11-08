// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.CompoundButton;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;

public class ListMenuItemView extends LinearLayout implements j$a, AbsListView$SelectionBoundsAdjuster
{
    public g C0;
    public ImageView D0;
    public RadioButton E0;
    public TextView F0;
    public CheckBox G0;
    public TextView H0;
    public ImageView I0;
    public ImageView J0;
    public LinearLayout K0;
    public Drawable L0;
    public int M0;
    public Context N0;
    public boolean O0;
    public Drawable P0;
    public boolean Q0;
    public LayoutInflater R0;
    public boolean S0;
    
    public ListMenuItemView(final Context n0, final AttributeSet set) {
        super(n0, set);
        final u9t q = u9t.q(((View)this).getContext(), set, ck1.W0, 2130970028);
        this.L0 = q.g(5);
        this.M0 = q.l(1, -1);
        this.O0 = q.a(7, false);
        this.N0 = n0;
        this.P0 = q.g(8);
        final TypedArray obtainStyledAttributes = n0.getTheme().obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, 2130969271, 0);
        this.Q0 = obtainStyledAttributes.hasValue(0);
        q.r();
        obtainStyledAttributes.recycle();
    }
    
    private LayoutInflater getInflater() {
        if (this.R0 == null) {
            this.R0 = LayoutInflater.from(((View)this).getContext());
        }
        return this.R0;
    }
    
    private void setSubMenuArrowVisible(final boolean b) {
        final ImageView i0 = this.I0;
        if (i0 != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            i0.setVisibility(visibility);
        }
    }
    
    public final void a() {
        final CheckBox g0 = (CheckBox)this.getInflater().inflate(2131623950, (ViewGroup)this, false);
        this.G0 = g0;
        final LinearLayout k0 = this.K0;
        if (k0 != null) {
            ((ViewGroup)k0).addView((View)g0, -1);
        }
        else {
            ((ViewGroup)this).addView((View)g0, -1);
        }
    }
    
    public final void adjustListItemSelectionBounds(final Rect rect) {
        final ImageView j0 = this.J0;
        if (j0 != null && ((View)j0).getVisibility() == 0) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.J0).getLayoutParams();
            rect.top += ((View)this.J0).getHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
        }
    }
    
    public final void b() {
        final RadioButton e0 = (RadioButton)this.getInflater().inflate(2131623953, (ViewGroup)this, false);
        this.E0 = e0;
        final LinearLayout k0 = this.K0;
        if (k0 != null) {
            ((ViewGroup)k0).addView((View)e0, -1);
        }
        else {
            ((ViewGroup)this).addView((View)e0, -1);
        }
    }
    
    public final void d(final g c0) {
        this.C0 = c0;
        final boolean visible = c0.isVisible();
        final int n = 0;
        int visibility;
        if (visible) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        this.setTitle(c0.e);
        this.setCheckable(c0.isCheckable());
        final boolean b = c0.n.p() && c0.e() != '\0';
        c0.e();
        int visibility2 = 0;
        Label_0133: {
            if (b) {
                final g c2 = this.C0;
                if (c2.n.p() && c2.e() != '\0') {
                    visibility2 = n;
                    break Label_0133;
                }
            }
            visibility2 = 8;
        }
        if (visibility2 == 0) {
            final TextView h0 = this.H0;
            final g c3 = this.C0;
            final char e = c3.e();
            String string;
            if (e == '\0') {
                string = "";
            }
            else {
                final Resources resources = c3.n.a.getResources();
                final StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(c3.n.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131951754));
                }
                int n2;
                if (c3.n.o()) {
                    n2 = c3.k;
                }
                else {
                    n2 = c3.i;
                }
                g.c(sb, n2, 65536, resources.getString(2131951750));
                g.c(sb, n2, 4096, resources.getString(2131951746));
                g.c(sb, n2, 2, resources.getString(2131951745));
                g.c(sb, n2, 1, resources.getString(2131951751));
                g.c(sb, n2, 4, resources.getString(2131951753));
                g.c(sb, n2, 8, resources.getString(2131951749));
                if (e != '\b') {
                    if (e != '\n') {
                        if (e != ' ') {
                            sb.append(e);
                        }
                        else {
                            sb.append(resources.getString(2131951752));
                        }
                    }
                    else {
                        sb.append(resources.getString(2131951748));
                    }
                }
                else {
                    sb.append(resources.getString(2131951747));
                }
                string = sb.toString();
            }
            h0.setText((CharSequence)string);
        }
        if (((View)this.H0).getVisibility() != visibility2) {
            ((View)this.H0).setVisibility(visibility2);
        }
        this.setIcon(c0.getIcon());
        ((View)this).setEnabled(c0.isEnabled());
        this.setSubMenuArrowVisible(c0.hasSubMenu());
        ((View)this).setContentDescription(c0.q);
    }
    
    public g getItemData() {
        return this.C0;
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final Drawable l0 = this.L0;
        final WeakHashMap a = p5x.a;
        p5x$d.q((View)this, l0);
        final TextView f0 = (TextView)((View)this).findViewById(2131432073);
        this.F0 = f0;
        final int m0 = this.M0;
        if (m0 != -1) {
            f0.setTextAppearance(this.N0, m0);
        }
        this.H0 = (TextView)((View)this).findViewById(2131431445);
        final ImageView i0 = (ImageView)((View)this).findViewById(2131431780);
        if ((this.I0 = i0) != null) {
            i0.setImageDrawable(this.P0);
        }
        this.J0 = (ImageView)((View)this).findViewById(2131429361);
        this.K0 = (LinearLayout)((View)this).findViewById(2131428431);
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.D0 != null && this.O0) {
            final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.D0).getLayoutParams();
            final int height = layoutParams.height;
            if (height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = height;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setCheckable(final boolean b) {
        if (!b && this.E0 == null && this.G0 == null) {
            return;
        }
        Object o;
        Object o2;
        if (this.C0.h()) {
            if (this.E0 == null) {
                this.b();
            }
            o = this.E0;
            o2 = this.G0;
        }
        else {
            if (this.G0 == null) {
                this.a();
            }
            o = this.G0;
            o2 = this.E0;
        }
        if (b) {
            ((CompoundButton)o).setChecked(this.C0.isChecked());
            if (((View)o).getVisibility() != 0) {
                ((View)o).setVisibility(0);
            }
            if (o2 != null && ((View)o2).getVisibility() != 8) {
                ((View)o2).setVisibility(8);
            }
        }
        else {
            final CheckBox g0 = this.G0;
            if (g0 != null) {
                ((View)g0).setVisibility(8);
            }
            final RadioButton e0 = this.E0;
            if (e0 != null) {
                ((View)e0).setVisibility(8);
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        Object o;
        if (this.C0.h()) {
            if (this.E0 == null) {
                this.b();
            }
            o = this.E0;
        }
        else {
            if (this.G0 == null) {
                this.a();
            }
            o = this.G0;
        }
        ((CompoundButton)o).setChecked(checked);
    }
    
    public void setForceShowIcon(final boolean b) {
        this.S0 = b;
        this.O0 = b;
    }
    
    public void setGroupDividerEnabled(final boolean b) {
        final ImageView j0 = this.J0;
        if (j0 != null) {
            int visibility;
            if (!this.Q0 && b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            j0.setVisibility(visibility);
        }
    }
    
    public void setIcon(Drawable imageDrawable) {
        Objects.requireNonNull(this.C0.n);
        final boolean s0 = this.S0;
        if (!s0 && !this.O0) {
            return;
        }
        final ImageView d0 = this.D0;
        if (d0 == null && imageDrawable == null && !this.O0) {
            return;
        }
        if (d0 == null) {
            final ImageView d2 = (ImageView)this.getInflater().inflate(2131623951, (ViewGroup)this, false);
            this.D0 = d2;
            final LinearLayout k0 = this.K0;
            if (k0 != null) {
                ((ViewGroup)k0).addView((View)d2, 0);
            }
            else {
                ((ViewGroup)this).addView((View)d2, 0);
            }
        }
        if (imageDrawable == null && !this.O0) {
            this.D0.setVisibility(8);
        }
        else {
            final ImageView d3 = this.D0;
            if (!s0) {
                imageDrawable = null;
            }
            d3.setImageDrawable(imageDrawable);
            if (((View)this.D0).getVisibility() != 0) {
                this.D0.setVisibility(0);
            }
        }
    }
    
    public void setTitle(final CharSequence text) {
        if (text != null) {
            this.F0.setText(text);
            if (((View)this.F0).getVisibility() != 0) {
                ((View)this.F0).setVisibility(0);
            }
        }
        else if (((View)this.F0).getVisibility() != 8) {
            ((View)this.F0).setVisibility(8);
        }
    }
}
