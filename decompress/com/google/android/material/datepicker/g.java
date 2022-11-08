// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.widget.AdapterView;
import android.widget.GridView;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;

public final class g extends RecyclerView$e<a>
{
    public final com.google.android.material.datepicker.a F0;
    public final ha8<?> G0;
    public final c$e H0;
    public final int I0;
    
    public g(final Context context, final ha8<?> g0, final com.google.android.material.datepicker.a f0, final c$e h0) {
        final dqh c0 = f0.C0;
        final dqh d0 = f0.D0;
        final dqh f2 = f0.F0;
        if (c0.b(f2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (f2.b(d0) <= 0) {
            final int h2 = e.H0;
            final int k1 = c.K1;
            final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166538);
            int dimensionPixelSize2;
            if (d.h2(context)) {
                dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166538);
            }
            else {
                dimensionPixelSize2 = 0;
            }
            this.I0 = dimensionPixelSize * h2 + dimensionPixelSize2;
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            this.A(true);
            return;
        }
        throw new IllegalArgumentException("currentPage cannot be after lastPage");
    }
    
    public final dqh C(final int n) {
        return this.F0.C0.t(n);
    }
    
    public final int D(final dqh dqh) {
        return this.F0.C0.u(dqh);
    }
    
    public final int c() {
        return this.F0.H0;
    }
    
    public final long d(final int n) {
        return this.F0.C0.t(n).C0.getTimeInMillis();
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        final a a = (a)recyclerView$c0;
        final dqh t = this.F0.C0.t(n);
        a.W0.setText((CharSequence)t.s());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView)((View)a.X0).findViewById(2131430121);
        if (materialCalendarGridView.a() != null && t.equals((Object)materialCalendarGridView.a().C0)) {
            ((View)materialCalendarGridView).invalidate();
            final e a2 = materialCalendarGridView.a();
            final Iterator iterator = a2.E0.iterator();
            while (iterator.hasNext()) {
                a2.i(materialCalendarGridView, (long)iterator.next());
            }
            final ha8 d0 = a2.D0;
            if (d0 != null) {
                final Iterator iterator2 = d0.i3().iterator();
                while (iterator2.hasNext()) {
                    a2.i(materialCalendarGridView, (long)iterator2.next());
                }
                a2.E0 = a2.D0.i3();
            }
        }
        else {
            final e adapter = new e(t, (ha8)this.G0, this.F0);
            ((GridView)materialCalendarGridView).setNumColumns(t.F0);
            materialCalendarGridView.setAdapter((ListAdapter)adapter);
        }
        ((AdapterView)materialCalendarGridView).setOnItemClickListener((AdapterView$OnItemClickListener)new f(this, materialCalendarGridView));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        final LinearLayout linearLayout = (LinearLayout)w30.B(viewGroup, 2131624867, viewGroup, false);
        a a;
        if (d.h2(((View)viewGroup).getContext())) {
            ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)new RecyclerView$n(-1, this.I0));
            a = new a(linearLayout, true);
        }
        else {
            a = new a(linearLayout, false);
        }
        return a;
    }
    
    public static final class a extends RecyclerView$c0
    {
        public final TextView W0;
        public final MaterialCalendarGridView X0;
        
        public a(final LinearLayout linearLayout, final boolean b) {
            super((View)linearLayout);
            final TextView w0 = (TextView)((View)linearLayout).findViewById(2131430126);
            p5x.A((View)(this.W0 = w0), true);
            this.X0 = (MaterialCalendarGridView)((View)linearLayout).findViewById(2131430121);
            if (!b) {
                ((View)w0).setVisibility(8);
            }
        }
    }
}
