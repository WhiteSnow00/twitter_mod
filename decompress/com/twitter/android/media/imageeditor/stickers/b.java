// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import android.view.ViewGroup$MarginLayoutParams;
import java.util.HashSet;
import androidx.recyclerview.widget.GridLayoutManager$b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.media.ui.image.MediaImageView;
import android.widget.TextView;
import android.view.View$OnLongClickListener;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$c0;
import java.util.Iterator;
import android.preference.PreferenceManager;
import java.util.Set;
import android.content.SharedPreferences;
import java.util.List;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;

public final class b extends RecyclerView$e<d.a>
{
    public final Context F0;
    public final List<hhr> G0;
    public final String H0;
    public final SharedPreferences I0;
    public final l7q<rfr, Boolean> J0;
    public b K0;
    public c L0;
    public final int M0;
    public final int N0;
    public int O0;
    public final Set<Long> P0;
    
    public b(final Context f0, final List<hhr> g0, final String h0) {
        int size = 0;
        this.P0 = (iuh$a)iuh.a(0);
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final Iterator iterator = g0.iterator();
        int m0 = 0;
        while (iterator.hasNext()) {
            m0 += ((hhr)iterator.next()).f.size();
        }
        this.M0 = m0;
        if (g0.size() > 1) {
            size = g0.size();
        }
        this.N0 = size;
        this.I0 = PreferenceManager.getDefaultSharedPreferences(f0);
        this.J0 = (l7q<rfr, Boolean>)new l7q(m0);
    }
    
    public final fvj<Integer, Integer> C(final int n) {
        final int size = this.G0.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final int size2 = this.G0.get(i).f.size();
            if (n <= n2 + size2) {
                return (fvj<Integer, Integer>)new fvj((Object)i, (Object)(n - n2));
            }
            n2 += size2 + 1;
            ++i;
        }
        return null;
    }
    
    public final int c() {
        return this.M0 + this.N0;
    }
    
    public final int e(final int n) {
        if (this.G0.size() == 1) {
            return 2;
        }
        final fvj<Integer, Integer> c = this.C(n);
        if (c == null) {
            return 0;
        }
        final Object b = ((g2j)c).b;
        pf8.r(b);
        if ((int)b == 0) {
            return 1;
        }
        return 2;
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, int c) {
        final d.a a = (d.a)recyclerView$c0;
        if (a instanceof d$b) {
            final d$b d$b = (d$b)a;
            final MediaImageView w0 = d$b.W0;
            final fvj<Integer, Integer> c2 = this.C(c);
            if (c2 != null) {
                final Object a2 = ((g2j)c2).a;
                pf8.r(a2);
                final hhr hhr = this.G0.get((int)a2);
                if (this.G0.size() > 1) {
                    final Object b = ((g2j)c2).b;
                    pf8.r(b);
                    c = (int)b - 1;
                }
                final khr khr = hhr.f.get(c);
                final rfr b2 = khr.b;
                this.J0.put((Object)b2, (Object)Boolean.TRUE);
                ((View)w0).setOnClickListener((View$OnClickListener)new vkw((Object)this, (Object)b2, (Object)hhr, 1));
                d.a(b2, d$b);
                tbx.v((View)w0, (View$OnLongClickListener)new vgr((Object)this, (Object)khr, (Object)d$b, 0));
            }
        }
        else {
            final b$a b$a = (b$a)a;
            final fvj<Integer, Integer> c3 = this.C(c);
            if (c3 != null) {
                final List<hhr> g0 = this.G0;
                final Object a3 = ((g2j)c3).a;
                pf8.r(a3);
                final hhr hhr2 = g0.get((int)a3);
                final TextView textView = (TextView)b$a.W0.findViewById(2131431750);
                final View viewById = b$a.W0.findViewById(2131431760);
                final View viewById2 = b$a.W0.findViewById(2131430788);
                if (pjr.g((CharSequence)hhr2.e)) {
                    ((View)textView).setVisibility(0);
                    textView.setText((CharSequence)hhr2.e);
                }
                else {
                    ((View)textView).setVisibility(8);
                }
                int visibility;
                if (hhr2.g) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                viewById2.setVisibility(visibility);
                final TextView textView2 = (TextView)viewById2.findViewById(2131430789);
                if (hhr2.g && !pjr.e((CharSequence)hhr2.h)) {
                    textView2.setText((CharSequence)this.F0.getString(2131958537, new Object[] { hhr2.h }));
                }
                else {
                    textView2.setText((CharSequence)this.F0.getString(2131955994));
                }
                if (c != 0) {
                    viewById.setVisibility(0);
                }
                else {
                    viewById.setVisibility(8);
                }
                if (2 == hhr2.c && !((HashSet)this.P0).contains(hhr2.a)) {
                    final String b3 = ukg.b0(this.H0);
                    c = hhr2.c;
                    String s;
                    if (c != 1) {
                        if (c != 2) {
                            s = "sticker_category_other";
                        }
                        else {
                            s = "sticker_category_featured";
                        }
                    }
                    else {
                        s = "sticker_category_recent";
                    }
                    final zf4 zf4 = new zf4(new String[] { "", b3, s, "sticker", "impression" });
                    final lev lev = new lev();
                    lev.a = hhr2.a;
                    lev.c = 32;
                    final List a4 = rth.a(0);
                    for (final khr khr2 : hhr2.f) {
                        final tgr$a tgr$a = new tgr$a();
                        tgr$a.a = khr2.b.I0;
                        a4.add(((h4j)tgr$a).e());
                    }
                    final fgr.a a5 = new fgr.a();
                    a5.a = a4;
                    lev.k0 = (fgr)a5.e();
                    zf4.i((szo)lev);
                    saw.b((okm)zf4);
                    ((HashSet<Long>)this.P0).add(Long.valueOf(hhr2.a));
                }
            }
        }
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, int n) {
        Object b;
        if (n == 1) {
            final View inflate = LayoutInflater.from(this.F0).inflate(2131625729, viewGroup, false);
            if (this.O0 != 0) {
                final GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager$b)inflate.getLayoutParams();
                n = -this.O0;
                ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).setMargins(n, 0, n, 0);
            }
            b = new b$a(inflate);
        }
        else {
            b = d.b(this.F0, tqm.Companion.b((View)viewGroup));
        }
        return (RecyclerView$c0)b;
    }
    
    public final void u(final RecyclerView$c0 recyclerView$c0) {
        final d.a a = (d.a)recyclerView$c0;
        if (a instanceof d$b) {
            final d$b d$b = (d$b)a;
            final rfr sticker = ((sfr)d$b.W0).getSticker();
            if (sticker != null) {
                final Boolean b = (Boolean)this.J0.getOrDefault((Object)sticker, (Object)null);
                if (b == null || !b) {
                    d.a(sticker, d$b);
                }
            }
        }
    }
    
    public final void w(final RecyclerView$c0 recyclerView$c0) {
        final d.a a = (d.a)recyclerView$c0;
        if (a instanceof d$b) {
            final rfr sticker = ((sfr)((d$b)a).W0).getSticker();
            if (sticker != null) {
                final Boolean b = (Boolean)this.J0.getOrDefault((Object)sticker, (Object)null);
                if (b != null && b) {
                    this.J0.remove((Object)sticker);
                }
            }
        }
    }
    
    public interface b
    {
    }
    
    public interface c
    {
    }
}
