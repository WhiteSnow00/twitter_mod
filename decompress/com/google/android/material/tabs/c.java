// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView$g;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.viewpager2.widget.ViewPager2;

public final class c
{
    public final TabLayout a;
    public final ViewPager2 b;
    public final b c;
    public RecyclerView$e<?> d;
    public boolean e;
    public c.c$d f;
    public c.c$a g;
    
    public c(final TabLayout a, final ViewPager2 b, final b c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        if (this.e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        if ((this.d = (RecyclerView$e<?>)this.b.getAdapter()) != null) {
            this.e = true;
            this.b.b((ViewPager2.e)new c.c$c(this.a));
            final c.c$d f = new c.c$d(this.b, true);
            this.f = f;
            this.a.a((TabLayout.c)f);
            final c.c$a g = new c.c$a(this);
            this.g = g;
            this.d.y((RecyclerView$g)g);
            this.b();
            this.a.u(this.b.getCurrentItem(), 0.0f, true, true);
            return;
        }
        throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
    }
    
    public final void b() {
        this.a.o();
        final RecyclerView$e<?> d = this.d;
        if (d != null) {
            final int c = d.c();
            for (int i = 0; i < c; ++i) {
                final TabLayout.g m = this.a.m();
                this.c.v(m, i);
                this.a.d(m, false);
            }
            if (c > 0) {
                final int min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1);
                if (min != this.a.getSelectedTabPosition()) {
                    final TabLayout a = this.a;
                    a.s(a.l(min), true);
                }
            }
        }
    }
    
    public interface b
    {
        void v(final TabLayout.g p0, final int p1);
    }
}
