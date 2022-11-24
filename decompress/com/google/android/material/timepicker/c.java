// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.timepicker;

import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import java.util.Iterator;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.Pair;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import android.view.View;
import android.view.Window;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.app.Dialog;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.LinkedHashSet;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import android.view.ViewStub;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnClickListener;
import java.util.Set;

public final class c extends tw8 implements TimePickerView$b
{
    public final Set<View$OnClickListener> S1;
    public final Set<View$OnClickListener> T1;
    public final Set<DialogInterface$OnCancelListener> U1;
    public final Set<DialogInterface$OnDismissListener> V1;
    public TimePickerView W1;
    public ViewStub X1;
    public d Y1;
    public f Z1;
    public grs a2;
    public int b2;
    public int c2;
    public int d2;
    public CharSequence e2;
    public int f2;
    public CharSequence g2;
    public int h2;
    public CharSequence i2;
    public MaterialButton j2;
    public Button k2;
    public int l2;
    public drs m2;
    public int n2;
    
    public c() {
        this.S1 = new LinkedHashSet();
        this.T1 = new LinkedHashSet();
        this.U1 = new LinkedHashSet();
        this.V1 = new LinkedHashSet();
        this.d2 = 0;
        this.f2 = 0;
        this.h2 = 0;
        this.l2 = 0;
        this.n2 = 0;
    }
    
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", (Parcelable)this.m2);
        ((BaseBundle)bundle).putInt("TIME_PICKER_INPUT_MODE", this.l2);
        ((BaseBundle)bundle).putInt("TIME_PICKER_TITLE_RES", this.d2);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.e2);
        ((BaseBundle)bundle).putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f2);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.g2);
        ((BaseBundle)bundle).putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.h2);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.i2);
        ((BaseBundle)bundle).putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.n2);
    }
    
    public final Dialog a2(final Bundle bundle) {
        final Context j1 = ((Fragment)this).J1();
        int n = this.n2;
        if (n == 0) {
            final TypedValue a = kng.a(((Fragment)this).J1(), 2130970114);
            if (a == null) {
                n = 0;
            }
            else {
                n = a.data;
            }
        }
        final Dialog dialog = new Dialog(j1, n);
        final Context context = dialog.getContext();
        final int b = kng.b(context, 2130968983, c.class.getCanonicalName());
        final jog backgroundDrawable = new jog(context, (AttributeSet)null, 2130970113, 2132019428);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, lai.l1, 2130970113, 2132019428);
        this.c2 = obtainStyledAttributes.getResourceId(0, 0);
        this.b2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        backgroundDrawable.n(context);
        backgroundDrawable.q(ColorStateList.valueOf(b));
        final Window window = dialog.getWindow();
        window.setBackgroundDrawable((Drawable)backgroundDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        final View decorView = window.getDecorView();
        final WeakHashMap a2 = b7x.a;
        backgroundDrawable.p(b7x$i.i(decorView));
        return dialog;
    }
    
    public final void f2(final MaterialButton materialButton) {
        if (materialButton != null && this.W1 != null) {
            if (this.X1 != null) {
                final grs a2 = this.a2;
                if (a2 != null) {
                    a2.a();
                }
                final int l2 = this.l2;
                final TimePickerView w1 = this.W1;
                final ViewStub x1 = this.X1;
                Object o;
                if (l2 == 0) {
                    if ((o = this.Y1) == null) {
                        o = new d(w1, this.m2);
                    }
                    this.Y1 = (d)o;
                }
                else {
                    if (this.Z1 == null) {
                        this.Z1 = new f((LinearLayout)x1.inflate(), this.m2);
                    }
                    final f z1 = this.Z1;
                    z1.J0.setChecked(false);
                    z1.K0.setChecked(false);
                    o = this.Z1;
                }
                (this.a2 = (grs)o).show();
                this.a2.invalidate();
                final int l3 = this.l2;
                Pair pair;
                if (l3 != 0) {
                    if (l3 != 1) {
                        throw new IllegalArgumentException(rk0.B("no icon for mode: ", l3));
                    }
                    pair = new Pair((Object)this.c2, (Object)2131954939);
                }
                else {
                    pair = new Pair((Object)this.b2, (Object)2131954944);
                }
                materialButton.setIconResource((int)pair.first);
                ((View)materialButton).setContentDescription((CharSequence)((Fragment)this).U0().getString((int)pair.second));
                ((View)materialButton).sendAccessibilityEvent(4);
            }
        }
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        Bundle l0 = bundle;
        if (bundle == null) {
            l0 = ((Fragment)this).L0;
        }
        if (l0 != null) {
            if ((this.m2 = (drs)l0.getParcelable("TIME_PICKER_TIME_MODEL")) == null) {
                this.m2 = new drs();
            }
            this.l2 = ((BaseBundle)l0).getInt("TIME_PICKER_INPUT_MODE", 0);
            this.d2 = ((BaseBundle)l0).getInt("TIME_PICKER_TITLE_RES", 0);
            this.e2 = l0.getCharSequence("TIME_PICKER_TITLE_TEXT");
            this.f2 = ((BaseBundle)l0).getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            this.g2 = l0.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
            this.h2 = ((BaseBundle)l0).getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            this.i2 = l0.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
            this.n2 = ((BaseBundle)l0).getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }
    
    public final View m1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final ViewGroup viewGroup2 = (ViewGroup)layoutInflater.inflate(2131624801, viewGroup);
        final TimePickerView w1 = (TimePickerView)((View)viewGroup2).findViewById(2131429945);
        this.W1 = w1;
        w1.f1 = (TimePickerView$b)this;
        this.X1 = (ViewStub)((View)viewGroup2).findViewById(2131429939);
        this.j2 = (MaterialButton)((View)viewGroup2).findViewById(2131429943);
        final TextView textView = (TextView)((View)viewGroup2).findViewById(2131429433);
        final int d2 = this.d2;
        if (d2 != 0) {
            textView.setText(d2);
        }
        else if (!TextUtils.isEmpty(this.e2)) {
            textView.setText(this.e2);
        }
        this.f2(this.j2);
        final Button button = (Button)((View)viewGroup2).findViewById(2131429944);
        ((View)button).setOnClickListener((View$OnClickListener)new c$a(this));
        final int f2 = this.f2;
        if (f2 != 0) {
            ((TextView)button).setText(f2);
        }
        else if (!TextUtils.isEmpty(this.g2)) {
            ((TextView)button).setText(this.g2);
        }
        ((View)(this.k2 = (Button)((View)viewGroup2).findViewById(2131429940))).setOnClickListener((View$OnClickListener)new c$b(this));
        final int h2 = this.h2;
        if (h2 != 0) {
            ((TextView)this.k2).setText(h2);
        }
        else if (!TextUtils.isEmpty(this.i2)) {
            ((TextView)this.k2).setText(this.i2);
        }
        final Button k2 = this.k2;
        if (k2 != null) {
            int visibility;
            if (super.I1) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)k2).setVisibility(visibility);
        }
        ((View)this.j2).setOnClickListener((View$OnClickListener)new c$c(this));
        return (View)viewGroup2;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final Iterator iterator = this.U1.iterator();
        while (iterator.hasNext()) {
            ((DialogInterface$OnCancelListener)iterator.next()).onCancel(dialogInterface);
        }
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final Iterator iterator = this.V1.iterator();
        while (iterator.hasNext()) {
            ((DialogInterface$OnDismissListener)iterator.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
    
    public final void q1() {
        super.q1();
        this.a2 = null;
        this.Y1 = null;
        this.Z1 = null;
        final TimePickerView w1 = this.W1;
        if (w1 != null) {
            w1.f1 = null;
            this.W1 = null;
        }
    }
}
