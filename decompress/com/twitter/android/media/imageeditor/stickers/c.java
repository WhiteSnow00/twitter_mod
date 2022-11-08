// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$c0;
import java.util.List;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;

public final class c extends RecyclerView$e<d$b>
{
    public final Context F0;
    public final List<rfr> G0;
    public final a H0;
    
    public c(final Context f0, final List<rfr> g0, final a h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final int c() {
        return this.G0.size();
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        final d$b d$b = (d$b)recyclerView$c0;
        final rfr rfr = this.G0.get(n);
        ((View)d$b.W0).setOnClickListener((View$OnClickListener)new ibg(this, rfr, 1));
        d.a(rfr, d$b);
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return (RecyclerView$c0)d.b(this.F0, tqm.Companion.b((View)viewGroup));
    }
    
    public interface a
    {
    }
}
