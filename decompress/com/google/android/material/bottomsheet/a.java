// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.Window;
import android.graphics.Color;
import java.util.WeakHashMap;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.FrameLayout;

public class a extends dk0
{
    public BottomSheetBehavior<FrameLayout> J0;
    public FrameLayout K0;
    public CoordinatorLayout L0;
    public FrameLayout M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public BottomSheetBehavior$c Q0;
    public boolean R0;
    public a$e S0;
    
    public a(final Context context, final int n) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(2130968786, typedValue, true)) {
                resourceId = typedValue.resourceId;
            }
            else {
                resourceId = 2132018593;
            }
        }
        super(context, resourceId);
        this.N0 = true;
        this.O0 = true;
        this.S0 = new a$e(this);
        this.j();
        this.R0 = this.getContext().getTheme().obtainStyledAttributes(new int[] { 2130969424 }).getBoolean(0, false);
    }
    
    public static void m(final View view, final boolean b) {
        if (Build$VERSION.SDK_INT >= 23) {
            final int systemUiVisibility = view.getSystemUiVisibility();
            int systemUiVisibility2;
            if (b) {
                systemUiVisibility2 = (systemUiVisibility | 0x2000);
            }
            else {
                systemUiVisibility2 = (systemUiVisibility & 0xFFFFDFFF);
            }
            view.setSystemUiVisibility(systemUiVisibility2);
        }
    }
    
    public final void cancel() {
        this.l();
        super.cancel();
    }
    
    public final FrameLayout k() {
        if (this.K0 == null) {
            final FrameLayout k0 = (FrameLayout)View.inflate(this.getContext(), 2131624265, (ViewGroup)null);
            this.K0 = k0;
            this.L0 = (CoordinatorLayout)((View)k0).findViewById(2131428478);
            final FrameLayout m0 = (FrameLayout)((View)this.K0).findViewById(2131428647);
            this.M0 = m0;
            (this.J0 = (BottomSheetBehavior<FrameLayout>)BottomSheetBehavior.y((View)m0)).t((BottomSheetBehavior$c)this.S0);
            this.J0.F(this.N0);
        }
        return this.K0;
    }
    
    public final BottomSheetBehavior<FrameLayout> l() {
        if (this.J0 == null) {
            this.k();
        }
        return this.J0;
    }
    
    public final View n(final int n, final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.k();
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)((View)this.K0).findViewById(2131428478);
        View inflate = view;
        if (n != 0 && (inflate = view) == null) {
            inflate = this.getLayoutInflater().inflate(n, (ViewGroup)coordinatorLayout, false);
        }
        if (this.R0) {
            final FrameLayout m0 = this.M0;
            final a$a a$a = new a$a(this);
            final WeakHashMap a = b7x.a;
            b7x$i.u((View)m0, (ihj)a$a);
        }
        ((ViewGroup)this.M0).removeAllViews();
        if (viewGroup$LayoutParams == null) {
            ((ViewGroup)this.M0).addView(inflate);
        }
        else {
            ((ViewGroup)this.M0).addView(inflate, viewGroup$LayoutParams);
        }
        ((View)coordinatorLayout).findViewById(2131432210).setOnClickListener((View$OnClickListener)new a$b(this));
        b7x.z((View)this.M0, (wf)new a$c(this));
        ((View)this.M0).setOnTouchListener((View$OnTouchListener)new a$d());
        return (View)this.K0;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Window window = this.getWindow();
        if (window != null) {
            final boolean b = this.R0 && Color.alpha(window.getNavigationBarColor()) < 255;
            final FrameLayout k0 = this.K0;
            if (k0 != null) {
                ((View)k0).setFitsSystemWindows(b ^ true);
            }
            final CoordinatorLayout l0 = this.L0;
            if (l0 != null) {
                l0.setFitsSystemWindows(b ^ true);
            }
            if (b) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (sdk_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }
    
    @Override
    public final void onStart() {
        super.onStart();
        final BottomSheetBehavior<FrameLayout> j0 = this.J0;
        if (j0 != null && j0.J == 5) {
            j0.H(4);
        }
    }
    
    public final void setCancelable(final boolean b) {
        super.setCancelable(b);
        if (this.N0 != b) {
            this.N0 = b;
            final BottomSheetBehavior<FrameLayout> j0 = this.J0;
            if (j0 != null) {
                j0.F(b);
            }
        }
    }
    
    public final void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        if (b && !this.N0) {
            this.N0 = true;
        }
        this.O0 = b;
        this.P0 = true;
    }
    
    @Override
    public final void setContentView(final int n) {
        super.setContentView(this.n(n, null, null));
    }
    
    @Override
    public final void setContentView(final View view) {
        super.setContentView(this.n(0, view, null));
    }
    
    @Override
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(this.n(0, view, viewGroup$LayoutParams));
    }
}
