// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import androidx.recyclerview.widget.h0;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.content.res.Resources;
import androidx.recyclerview.widget.b0;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$r;
import com.google.android.material.button.MaterialButton;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.RecyclerView$y;
import android.widget.ListAdapter;
import android.widget.GridView;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class c<S> extends idk<S>
{
    public static final int N1 = 0;
    public int D1;
    public va8<S> E1;
    public a F1;
    public yqh G1;
    public int H1;
    public n93 I1;
    public RecyclerView J1;
    public RecyclerView K1;
    public View L1;
    public View M1;
    
    public final void A1(final Bundle bundle) {
        ((BaseBundle)bundle).putInt("THEME_RES_ID_KEY", this.D1);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable)this.E1);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.F1);
        bundle.putParcelable("CURRENT_MONTH_KEY", (Parcelable)this.G1);
    }
    
    public final boolean Y1(final lkj<S> lkj) {
        return super.C1.add(lkj);
    }
    
    public final LinearLayoutManager Z1() {
        return (LinearLayoutManager)this.K1.getLayoutManager();
    }
    
    public final void a2(final int n) {
        ((View)this.K1).post((Runnable)new c$a(this, n));
    }
    
    public final void b2(final yqh g1) {
        final g g2 = (g)this.K1.getAdapter();
        final int d = g2.D(g1);
        final int n = d - g2.D(this.G1);
        final int abs = Math.abs(n);
        boolean b = true;
        final boolean b2 = abs > 3;
        if (n <= 0) {
            b = false;
        }
        this.G1 = g1;
        if (b2 && b) {
            this.K1.v0(d - 3);
            this.a2(d);
        }
        else if (b2) {
            this.K1.v0(d + 3);
            this.a2(d);
        }
        else {
            this.a2(d);
        }
    }
    
    public final void c2(final int h1) {
        this.H1 = h1;
        if (h1 == 2) {
            this.J1.getLayoutManager().S0(((xvx)this.J1.getAdapter()).C(this.G1.H0));
            this.L1.setVisibility(0);
            this.M1.setVisibility(8);
        }
        else if (h1 == 1) {
            this.L1.setVisibility(8);
            this.M1.setVisibility(0);
            this.b2(this.G1);
        }
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        Bundle l0 = bundle;
        if (bundle == null) {
            l0 = ((Fragment)this).L0;
        }
        this.D1 = ((BaseBundle)l0).getInt("THEME_RES_ID_KEY");
        this.E1 = (va8)l0.getParcelable("GRID_SELECTOR_KEY");
        this.F1 = (a)l0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.G1 = (yqh)l0.getParcelable("CURRENT_MONTH_KEY");
    }
    
    public final View m1(LayoutInflater cloneInContext, final ViewGroup viewGroup, final Bundle bundle) {
        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(((Fragment)this).N0(), this.D1);
        this.I1 = new n93((Context)contextThemeWrapper);
        cloneInContext = cloneInContext.cloneInContext((Context)contextThemeWrapper);
        final yqh f0 = this.F1.F0;
        int n;
        boolean b;
        if (d.h2((Context)contextThemeWrapper)) {
            n = 2131624872;
            b = true;
        }
        else {
            n = 2131624867;
            b = false;
        }
        final View inflate = cloneInContext.inflate(n, viewGroup, false);
        final Resources resources = ((Fragment)this).J1().getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131166559);
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166560);
        final int dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131166558);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166543);
        final int k0 = e.K0;
        inflate.setMinimumHeight(dimensionPixelOffset2 + (dimensionPixelOffset + dimensionPixelSize) + dimensionPixelSize2 + (resources.getDimensionPixelOffset(2131166557) * (k0 - 1) + resources.getDimensionPixelSize(2131166538) * k0) + resources.getDimensionPixelOffset(2131166535));
        final GridView gridView = (GridView)inflate.findViewById(2131430144);
        b7x.z((View)gridView, (wf)new c$b());
        gridView.setAdapter((ListAdapter)new hb8());
        gridView.setNumColumns(f0.I0);
        ((View)gridView).setEnabled(false);
        (this.K1 = (RecyclerView)inflate.findViewById(2131430147)).setLayoutManager((RecyclerView$m)new chq(this, ((Fragment)this).N0(), b, b) {
            public final int m1;
            public final c n1;
            
            public final void g1(final RecyclerView$y recyclerView$y, final int[] array) {
                if (this.m1 == 0) {
                    array[0] = ((View)this.n1.K1).getWidth();
                    array[1] = ((View)this.n1.K1).getWidth();
                }
                else {
                    array[0] = ((View)this.n1.K1).getHeight();
                    array[1] = ((View)this.n1.K1).getHeight();
                }
            }
        });
        ((View)this.K1).setTag((Object)"MONTHS_VIEW_GROUP_TAG");
        final g adapter = new g((Context)contextThemeWrapper, (va8)this.E1, this.F1, (c.c$e)new c$d(this));
        this.K1.setAdapter((RecyclerView$e)adapter);
        final int integer = contextThemeWrapper.getResources().getInteger(2131492940);
        final RecyclerView j1 = (RecyclerView)inflate.findViewById(2131430150);
        this.J1 = j1;
        if (j1 != null) {
            j1.setHasFixedSize(true);
            this.J1.setLayoutManager((RecyclerView$m)new GridLayoutManager((Context)contextThemeWrapper, integer, 1, false));
            this.J1.setAdapter((RecyclerView$e)new xvx(this));
            this.J1.h((RecyclerView$l)new ong(this));
        }
        if (inflate.findViewById(2131430126) != null) {
            final MaterialButton materialButton = (MaterialButton)inflate.findViewById(2131430126);
            ((View)materialButton).setTag((Object)"SELECTOR_TOGGLE_TAG");
            b7x.z((View)materialButton, (wf)new png(this));
            final MaterialButton materialButton2 = (MaterialButton)inflate.findViewById(2131430128);
            ((View)materialButton2).setTag((Object)"NAVIGATION_PREV_TAG");
            final MaterialButton materialButton3 = (MaterialButton)inflate.findViewById(2131430127);
            ((View)materialButton3).setTag((Object)"NAVIGATION_NEXT_TAG");
            this.L1 = inflate.findViewById(2131430150);
            this.M1 = inflate.findViewById(2131430143);
            this.c2(1);
            ((TextView)materialButton).setText((CharSequence)this.G1.s());
            this.K1.j((RecyclerView$r)new qng(this, adapter, materialButton));
            ((View)materialButton).setOnClickListener((View$OnClickListener)new rng(this));
            ((View)materialButton3).setOnClickListener((View$OnClickListener)new sng(this, adapter));
            ((View)materialButton2).setOnClickListener((View$OnClickListener)new tng(this, adapter));
        }
        if (!d.h2((Context)contextThemeWrapper)) {
            ((h0)new b0()).b(this.K1);
        }
        this.K1.v0(adapter.D(this.G1));
        return inflate;
    }
}
