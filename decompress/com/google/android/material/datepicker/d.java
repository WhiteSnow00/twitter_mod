// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.s;
import android.os.BaseBundle;
import java.util.Iterator;
import android.content.DialogInterface;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.app.Dialog;
import java.util.WeakHashMap;
import android.view.View;
import android.view.Window;
import android.view.View$OnTouchListener;
import android.graphics.drawable.InsetDrawable;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.res.TypedArray;
import java.util.Calendar;
import android.content.res.Resources;
import android.content.Context;
import android.widget.Button;
import com.google.android.material.internal.CheckableImageButton;
import android.widget.TextView;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnClickListener;
import java.util.LinkedHashSet;

public final class d<S> extends tw8
{
    public static final int o2 = 0;
    public final LinkedHashSet<aog<? super S>> S1;
    public final LinkedHashSet<View$OnClickListener> T1;
    public final LinkedHashSet<DialogInterface$OnCancelListener> U1;
    public final LinkedHashSet<DialogInterface$OnDismissListener> V1;
    public int W1;
    public va8<S> X1;
    public idk<S> Y1;
    public a Z1;
    public c<S> a2;
    public int b2;
    public CharSequence c2;
    public boolean d2;
    public int e2;
    public int f2;
    public CharSequence g2;
    public int h2;
    public CharSequence i2;
    public TextView j2;
    public CheckableImageButton k2;
    public jog l2;
    public Button m2;
    public boolean n2;
    
    public d() {
        this.S1 = new LinkedHashSet<aog<? super S>>();
        this.T1 = new LinkedHashSet<View$OnClickListener>();
        this.U1 = new LinkedHashSet<DialogInterface$OnCancelListener>();
        this.V1 = new LinkedHashSet<DialogInterface$OnDismissListener>();
    }
    
    public static int g2(final Context context) {
        final Resources resources = context.getResources();
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166536);
        final Calendar d = lnw.d();
        d.set(5, 1);
        final Calendar b = lnw.b(d);
        b.get(2);
        b.get(1);
        final int maximum = b.getMaximum(7);
        b.getActualMaximum(5);
        b.getTimeInMillis();
        return (maximum - 1) * resources.getDimensionPixelOffset(2131166556) + (resources.getDimensionPixelSize(2131166542) * maximum + dimensionPixelOffset * 2);
    }
    
    public static boolean h2(final Context context) {
        return i2(context, 16843277);
    }
    
    public static boolean i2(final Context context, final int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(kng.b(context, 2130970100, c.class.getCanonicalName()), new int[] { n });
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return boolean1;
    }
    
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        ((BaseBundle)bundle).putInt("OVERRIDE_THEME_RES_ID", this.W1);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable)this.X1);
        final a$b a$b = new a$b(this.Z1);
        final yqh g1 = this.a2.G1;
        if (g1 != null) {
            a$b.c = g1.K0;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", (Parcelable)a$b.d);
        final yqh g2 = yqh.g(a$b.a);
        final yqh g3 = yqh.g(a$b.b);
        final a$c a$c = (a$c)bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        final Long c = a$b.c;
        yqh g4;
        if (c == null) {
            g4 = null;
        }
        else {
            g4 = yqh.g((long)c);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)new a(g2, g3, a$c, g4));
        ((BaseBundle)bundle).putInt("TITLE_TEXT_RES_ID_KEY", this.b2);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.c2);
        ((BaseBundle)bundle).putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.g2);
        ((BaseBundle)bundle).putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.h2);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.i2);
    }
    
    public final void B1() {
        super.B1();
        final Window window = this.b2().getWindow();
        if (this.d2) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable((Drawable)this.l2);
            if (!this.n2) {
                final View viewById = ((Fragment)this).K1().findViewById(2131429289);
                Integer n;
                if (viewById.getBackground() instanceof ColorDrawable) {
                    n = ((ColorDrawable)viewById.getBackground()).getColor();
                }
                else {
                    n = null;
                }
                final int sdk_INT = Build$VERSION.SDK_INT;
                final boolean b = false;
                final boolean b2 = n == null || n == 0;
                final int i = ak1.i(window.getContext(), 16842801, -16777216);
                if (b2) {
                    n = i;
                }
                xpx.a(window, false);
                final Context context = window.getContext();
                int k;
                if (sdk_INT < 23) {
                    k = ks4.k(ak1.i(context, 16843857, -16777216), 128);
                }
                else {
                    k = 0;
                }
                final Context context2 = window.getContext();
                int j;
                if (sdk_INT < 27) {
                    j = ks4.k(ak1.i(context2, 16843858, -16777216), 128);
                }
                else {
                    j = 0;
                }
                window.setStatusBarColor(k);
                window.setNavigationBarColor(j);
                final boolean u = ak1.u((int)n);
                final boolean b3 = ak1.u(k) || (k == 0 && u);
                final boolean u2 = ak1.u((int)i);
                boolean b4 = false;
                Label_0313: {
                    if (!ak1.u(j)) {
                        b4 = b;
                        if (j != 0) {
                            break Label_0313;
                        }
                        b4 = b;
                        if (!u2) {
                            break Label_0313;
                        }
                    }
                    b4 = true;
                }
                final View decorView = window.getDecorView();
                final int sdk_INT2 = Build$VERSION.SDK_INT;
                Object o;
                if (sdk_INT2 >= 30) {
                    o = new jqx(window);
                }
                else if (sdk_INT2 >= 26) {
                    o = new iqx(window, decorView);
                }
                else if (sdk_INT2 >= 23) {
                    o = new hqx(window, decorView);
                }
                else {
                    o = new gqx(window, decorView);
                }
                ((ma7)o).N(b3);
                ((ma7)o).M(b4);
                final yng yng = new yng(viewById.getLayoutParams().height, viewById, viewById.getPaddingTop());
                final WeakHashMap a = b7x.a;
                b7x$i.u(viewById, (ihj)yng);
                this.n2 = true;
            }
        }
        else {
            window.setLayout(-2, -2);
            final int dimensionPixelOffset = ((Fragment)this).U0().getDimensionPixelOffset(2131166544);
            final Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable((Drawable)new InsetDrawable((Drawable)this.l2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener((View$OnTouchListener)new ksd(this.b2(), rect));
        }
        this.j2();
    }
    
    public final void C1() {
        this.Y1.C1.clear();
        super.C1();
    }
    
    public final Dialog a2(final Bundle bundle) {
        final Context j1 = ((Fragment)this).J1();
        ((Fragment)this).J1();
        int n = this.W1;
        if (n == 0) {
            n = this.f2().Z0();
        }
        final Dialog dialog = new Dialog(j1, n);
        final Context context = dialog.getContext();
        this.d2 = h2(context);
        final int b = kng.b(context, 2130968983, d.class.getCanonicalName());
        (this.l2 = new jog(context, (AttributeSet)null, 2130970100, 2132019372)).n(context);
        this.l2.q(ColorStateList.valueOf(b));
        final jog l2 = this.l2;
        final View decorView = dialog.getWindow().getDecorView();
        final WeakHashMap a = b7x.a;
        l2.p(b7x$i.i(decorView));
        return dialog;
    }
    
    public final va8<S> f2() {
        if (this.X1 == null) {
            this.X1 = (va8)((Fragment)this).L0.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.X1;
    }
    
    public final void j2() {
        ((Fragment)this).J1();
        int n = this.W1;
        if (n == 0) {
            n = this.f2().Z0();
        }
        final va8<S> f2 = this.f2();
        final a z1 = this.Z1;
        final c<S> a2 = new c<S>();
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("THEME_RES_ID_KEY", n);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable)f2);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)z1);
        bundle.putParcelable("CURRENT_MONTH_KEY", (Parcelable)z1.I0);
        ((Fragment)a2).N1(bundle);
        this.a2 = a2;
        Object a3;
        if (this.k2.isChecked()) {
            final va8<S> f3 = this.f2();
            final a z2 = this.Z1;
            a3 = new kog();
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putInt("THEME_RES_ID_KEY", n);
            bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable)f3);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)z2);
            ((Fragment)a3).N1(bundle2);
        }
        else {
            a3 = this.a2;
        }
        this.Y1 = (idk<S>)a3;
        this.k2();
        final androidx.fragment.app.a a4 = new androidx.fragment.app.a(((Fragment)this).M0());
        ((s)a4).g(2131430145, (Fragment)this.Y1, (String)null);
        a4.d();
        this.Y1.Y1((lkj)new d$c(this));
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        Bundle l0 = bundle;
        if (bundle == null) {
            l0 = ((Fragment)this).L0;
        }
        this.W1 = ((BaseBundle)l0).getInt("OVERRIDE_THEME_RES_ID");
        this.X1 = (va8)l0.getParcelable("DATE_SELECTOR_KEY");
        this.Z1 = (a)l0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.b2 = ((BaseBundle)l0).getInt("TITLE_TEXT_RES_ID_KEY");
        this.c2 = l0.getCharSequence("TITLE_TEXT_KEY");
        this.e2 = ((BaseBundle)l0).getInt("INPUT_MODE_KEY");
        this.f2 = ((BaseBundle)l0).getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.g2 = l0.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.h2 = ((BaseBundle)l0).getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.i2 = l0.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }
    
    public final void k2() {
        final va8<S> f2 = this.f2();
        ((Fragment)this).N0();
        final String z1 = f2.Z1();
        ((View)this.j2).setContentDescription((CharSequence)String.format(((Fragment)this).W0(2131955176), z1));
        this.j2.setText((CharSequence)z1);
    }
    
    public final void l2(final CheckableImageButton checkableImageButton) {
        String contentDescription;
        if (this.k2.isChecked()) {
            contentDescription = ((View)checkableImageButton).getContext().getString(2131955201);
        }
        else {
            contentDescription = ((View)checkableImageButton).getContext().getString(2131955203);
        }
        ((View)this.k2).setContentDescription((CharSequence)contentDescription);
    }
    
    public final View m1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        int n;
        if (this.d2) {
            n = 2131624879;
        }
        else {
            n = 2131624878;
        }
        final View inflate = layoutInflater.inflate(n, viewGroup);
        final Context context = inflate.getContext();
        if (this.d2) {
            inflate.findViewById(2131430145).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(g2(context), -2));
        }
        else {
            inflate.findViewById(2131430146).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(g2(context), -1));
        }
        final TextView j2 = (TextView)inflate.findViewById(2131430157);
        this.j2 = j2;
        final WeakHashMap a = b7x.a;
        b7x$g.f((View)j2, 1);
        this.k2 = (CheckableImageButton)inflate.findViewById(2131430159);
        final TextView textView = (TextView)inflate.findViewById(2131430163);
        final CharSequence c2 = this.c2;
        if (c2 != null) {
            textView.setText(c2);
        }
        else {
            textView.setText(this.b2);
        }
        ((View)this.k2).setTag((Object)"TOGGLE_BUTTON_TAG");
        final CheckableImageButton k2 = this.k2;
        final StateListDrawable imageDrawable = new StateListDrawable();
        imageDrawable.addState(new int[] { 16842912 }, d4j.F(context, 2131232666));
        imageDrawable.addState(new int[0], d4j.F(context, 2131232668));
        ((AppCompatImageButton)k2).setImageDrawable((Drawable)imageDrawable);
        this.k2.setChecked(this.e2 != 0);
        b7x.z((View)this.k2, (wf)null);
        this.l2(this.k2);
        ((View)this.k2).setOnClickListener((View$OnClickListener)new zng(this));
        this.m2 = (Button)inflate.findViewById(2131428399);
        if (this.f2().d3()) {
            ((View)this.m2).setEnabled(true);
        }
        else {
            ((View)this.m2).setEnabled(false);
        }
        ((View)this.m2).setTag((Object)"CONFIRM_BUTTON_TAG");
        final CharSequence g2 = this.g2;
        if (g2 != null) {
            ((TextView)this.m2).setText(g2);
        }
        else {
            final int f2 = this.f2;
            if (f2 != 0) {
                ((TextView)this.m2).setText(f2);
            }
        }
        ((View)this.m2).setOnClickListener((View$OnClickListener)new d$a(this));
        final Button button = (Button)inflate.findViewById(2131428076);
        ((View)button).setTag((Object)"CANCEL_BUTTON_TAG");
        final CharSequence i2 = this.i2;
        if (i2 != null) {
            ((TextView)button).setText(i2);
        }
        else {
            final int h2 = this.h2;
            if (h2 != 0) {
                ((TextView)button).setText(h2);
            }
        }
        ((View)button).setOnClickListener((View$OnClickListener)new d$b(this));
        return inflate;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final Iterator<Object> iterator = this.U1.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCancel(dialogInterface);
        }
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final Iterator<Object> iterator = this.V1.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDismiss(dialogInterface);
        }
        final ViewGroup viewGroup = (ViewGroup)((Fragment)this).m1;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
