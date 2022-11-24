import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pe4
{
    public static final void a(final iuh iuh, final fvh<sxk> fvh, final Map<ype, sxk> map, d86 h, final int n) {
        e0e.f((Object)iuh, "interactionSource");
        e0e.f((Object)fvh, "pressedInteraction");
        e0e.f((Object)map, "currentKeyPressInteractions");
        h = h.h(1297229208);
        final sa6$b a = sa6.a;
        shw.b((Object)iuh, (stb)new pe4$a((fvh)fvh, (Map)map, iuh), h);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new pe4$b(iuh, (fvh)fvh, (Map)map, n));
        }
    }
    
    public static final dlh b(final dlh dlh, final iuh iuh, final jld jld, final boolean b, final String s, final t0n t0n, final ptb<vzv> ptb) {
        e0e.f((Object)dlh, "$this$clickable");
        e0e.f((Object)iuh, "interactionSource");
        e0e.f((Object)ptb, "onClick");
        final ysd$a a = ysd.a;
        return c86.a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new pe4$c((ptb)ptb, b, iuh, jld, s, t0n));
    }
    
    public static dlh c(final dlh dlh, final iuh iuh, final jld jld, boolean b, String s, t0n t0n, final ptb ptb, final int n) {
        if ((n & 0x4) != 0x0) {
            b = true;
        }
        if ((n & 0x8) != 0x0) {
            s = null;
        }
        if ((n & 0x10) != 0x0) {
            t0n = null;
        }
        return b(dlh, iuh, jld, b, s, t0n, (ptb<vzv>)ptb);
    }
    
    public static dlh d(final dlh dlh, boolean b, String s, t0n t0n, final ptb ptb, final int n) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        if ((n & 0x4) != 0x0) {
            t0n = null;
        }
        e0e.f((Object)dlh, "$this$clickable");
        e0e.f((Object)ptb, "onClick");
        final ysd$a a = ysd.a;
        return c86.a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new qe4(b, s, t0n, ptb));
    }
    
    public static final dlh e(final dlh dlh, final iuh iuh, final jld jld, final boolean b, final String s, final t0n t0n, final String s2, final ptb<vzv> ptb, final ptb<vzv> ptb2, final ptb<vzv> ptb3) {
        e0e.f((Object)dlh, "$this$combinedClickable");
        e0e.f((Object)iuh, "interactionSource");
        e0e.f((Object)ptb3, "onClick");
        final ysd$a a = ysd.a;
        return c86.a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new pe4$d((ptb)ptb3, (ptb)ptb, (ptb)ptb2, b, iuh, jld, s, t0n, s2));
    }
    
    public static dlh f(final dlh dlh, final ptb ptb, final ptb ptb2) {
        e0e.f((Object)dlh, "$this$combinedClickable");
        e0e.f((Object)ptb2, "onClick");
        final ysd$a a = ysd.a;
        return c86.a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new ue4(true, (String)null, (t0n)null, (String)null, ptb, (ptb)null, ptb2));
    }
    
    public static final dlh g(final dlh dlh, final dlh dlh2, final iuh iuh, final jld jld, final iz6 iz6, final Map<ype, sxk> map, final l9r<kgj> l9r, final boolean b, final String s, final t0n t0n, final String s2, final ptb<vzv> ptb, final ptb<vzv> ptb2) {
        e0e.f((Object)dlh2, "gestureModifiers");
        e0e.f((Object)iuh, "interactionSource");
        e0e.f((Object)iz6, "indicationScope");
        e0e.f((Object)map, "currentKeyPressInteractions");
        e0e.f((Object)l9r, "keyClickOffset");
        e0e.f((Object)ptb2, "onClick");
        final dlh a = lld.a(oqe.a(jty.W(dlh, true, (stb)new cf4(t0n, s, ptb, s2, b, ptb2)), (stb<? super hqe, Boolean>)new ff4(b, (Map)map, (l9r)l9r, iz6, (ptb)ptb2, iuh)), (hvd)iuh, jld);
        e0e.f((Object)a, "<this>");
        final ysd$a a2 = ysd.a;
        final ysd$a a3 = ysd.a;
        final dlh a4 = c86.a(a, (stb<? super btd, vzv>)a3, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new mrc(iuh, b));
        final wsd a5 = ngb.a;
        e0e.f((Object)a4, "<this>");
        return c86.a(a4, (stb<? super btd, vzv>)a3, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new pgb(b, iuh)).E(dlh2);
    }
    
    public static final Object h(final pxk pxk, final long n, final iuh iuh, final fvh<sxk> fvh, final l9r<? extends ptb<Boolean>> l9r, final mp6<? super vzv> mp6) {
        final Object u = r1n.u((hub)new pe4$e(pxk, n, iuh, (fvh)fvh, (l9r)l9r, (mp6)null), (mp6)mp6);
        if (u == jz6.F0) {
            return u;
        }
        return vzv.a;
    }
}
