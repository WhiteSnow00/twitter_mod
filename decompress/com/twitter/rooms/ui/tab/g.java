// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab;

import java.util.List;
import java.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import j$.util.Optional;

@sa8(c = "com.twitter.rooms.ui.tab.SpacesTabViewModel$loadSpacesFeed$2$3", f = "SpacesTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends p0s implements ftb<lvj<? extends j11, ? extends Optional<p01>>, go6<? super fzv>, Object>
{
    public Object D0;
    public final boolean E0;
    public final SpacesTabViewModel F0;
    public final String G0;
    
    public g(final boolean e0, final SpacesTabViewModel f0, final String g0, final go6<? super g> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final g g = new g(this.E0, this.F0, this.G0, (go6<? super g>)go6);
        g.D0 = d0;
        return (go6<fzv>)g;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        final j11 j11 = (j11)lvj.D0;
        final Optional optional = (Optional)lvj.E0;
        if (this.E0) {
            final String c = j11.c;
            if (c != null) {
                ((wgm)this.F0.P0).a((Object)c);
            }
        }
        final SpacesTabViewModel f0 = this.F0;
        final coe<Object>[] v0 = SpacesTabViewModel.V0;
        Objects.requireNonNull(f0);
        final ArrayList list = new ArrayList();
        final Iterator iterator = j11.b.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final k11 k11 = (k11)iterator.next();
            final String a = k11.a;
            String a2;
            if ((a2 = k11.d.a) == null) {
                a2 = "";
            }
            list.add(new rwq$b(a, a2));
            final Iterator<Object> iterator2 = k11.c.iterator();
            int n2 = n;
            while (true) {
                n = n2;
                if (!iterator2.hasNext()) {
                    break;
                }
                final yy0 yy0 = iterator2.next();
                list.add(new rwq$a(yy0.a, yy0.g, n2, j11.c));
                ++n2;
            }
        }
        final List p = mq4.P0((Collection)list);
        optional.ifPresent((Consumer)new wzq((qsb)new g$a(this.F0, p)));
        this.F0.Q((qsb)new g$b(j11, p, this.G0));
        return fzv.a;
    }
}
