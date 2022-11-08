import com.twitter.core.ui.styles.icons.implementation.Icon;
import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.app.posttweetactions.ui.contacts.PostTweetActionsModalViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsk
{
    public static final void a(final gsk gsk, jkh companion, PostTweetActionsModalViewModel postTweetActionsModalViewModel, final m76 m76, final int n, final int n2) {
        zzd.f((Object)gsk, "effectHandler");
        final m76 h = m76.h(-1875705183);
        if ((n2 & 0x2) != 0x0) {
            companion = jkh.Companion;
        }
        if ((n2 & 0x4) != 0x0) {
            postTweetActionsModalViewModel = (PostTweetActionsModalViewModel)((n8x)h.m((re6)skx.a)).a.c((a9x)new a9x$b(new r8x((Class)PostTweetActionsModalViewModel.class, "")));
        }
        final ea6$b a = ea6.a;
        h.x(-2088733469);
        final gub<fsk, ap6<? super oyv>, Object> gub = (gub<fsk, ap6<? super oyv>, Object>)new gub<fsk, ap6<? super oyv>, Object>(gsk);
        h.x(1941511575);
        h.x(-301010798);
        final Object y = af.y(h, 773894976, -492369756);
        Objects.requireNonNull(m76.Companion);
        ue6 d;
        if ((d = (ue6)y) == m76$a.b) {
            d = rb0.d(jgw.A(h), h);
        }
        h.O();
        final yy6 c0 = d.C0;
        h.O();
        jgw.g((Object)postTweetActionsModalViewModel, (Object)c0, (gub)new gub<yy6, ap6<? super oyv>, Object>(null) {
            public int C0;
            public final /* synthetic */ MviViewModel D0;
            public final /* synthetic */ yy6 E0;
            public final /* synthetic */ q7r F0;
            
            public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
                return (ap6<oyv>)new gub<yy6, ap6<? super oyv>, Object>(ap6) {
                    public int C0;
                    public final /* synthetic */ MviViewModel D0 = this.D0;
                    public final /* synthetic */ yy6 E0 = this.E0;
                    public final /* synthetic */ q7r F0 = this.F0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((hsk$b)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
            }
            
            public final Object invokeSuspend(Object o) {
                final zy6 c0 = zy6.C0;
                final int c2 = this.C0;
                if (c2 != 0) {
                    if (c2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kq9.b1(o);
                }
                else {
                    kq9.b1(o);
                    final g8b s = this.D0.s();
                    final hsk$b$a hsk$b$a = new hsk$b$a(this.E0, this.F0);
                    this.C0 = 1;
                    o = s.b((h8b)new isk((h8b)hsk$b$a), (ap6)this);
                    if (o != c0) {
                        o = oyv.a;
                    }
                    if (o == c0) {
                        return c0;
                    }
                }
                return oyv.a;
            }
        }, h);
        h.O();
        h.O();
        h.O();
        final jkh i = tcq.i(companion);
        final fzq a2 = fzq.a;
        final jkh s = oyz.S(i, fzq.k, 0.0f, 2);
        h.x(-483455358);
        final ks0 a3 = ks0.a;
        final ks0$k d2 = ks0.d;
        Objects.requireNonNull(dx.Companion);
        final gqg a4 = ps4.a((ks0$l)d2, (dx$b)dx$a.n, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b = f76.a.b;
        final jub a5 = cwe.a(s);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a4, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a5).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            zoc.b(new o53(t53.C0, (a5f)a5f$f.F0), tcq.j(tcq.i(jkh.Companion), 52), ukg.d1(2131955825, h), (k53)new k53$b(false), (Icon)null, (String)null, false, (otb)new otb<oyv>() {
                public final Object invoke() {
                    postTweetActionsModalViewModel.O((qcw)jsk.a);
                    return oyv.a;
                }
            }, h, 4144, 112);
            gzq.i(h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final vwo k = h.k();
            if (k != null) {
                k.a((gub)new gub<m76, Integer, oyv>() {
                    public final Object invoke(final Object o, final Object o2) {
                        final m76 m76 = (m76)o;
                        ((Number)o2).intValue();
                        hsk.a(gsk, companion, postTweetActionsModalViewModel, m76, n | 0x1, n2);
                        return oyv.a;
                    }
                });
            }
            return;
        }
        ukg.l0();
        throw null;
    }
    
    public static final void b(jkh companion, m76 h, final int n, final int n2) {
        h = h.h(-1437912358);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final jkh i = tcq.i(companion);
            final fzq a2 = fzq.a;
            final jkh s = oyz.S(i, fzq.k, 0.0f, 2);
            h.x(-483455358);
            final ks0 a3 = ks0.a;
            final ks0$k d = ks0.d;
            Objects.requireNonNull(dx.Companion);
            final gqg a4 = ps4.a((ks0$l)d, (dx$b)dx$a.n, h);
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a5 = cwe.a(s);
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a4, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a5).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            final String g = e1.G(h, 2058660585, -1163856341, 2131955832, h);
            final hqc$a companion2 = hqc.Companion;
            xhs.a(g, (jkh)null, 0L, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, companion2.a(h).d, false, h, 0, 0, 49150);
            gzq.l(h, 0);
            xhs.a(ukg.d1(2131955831, h), (jkh)null, 0L, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, companion2.a(h).h, false, h, 0, 0, 49150);
            gzq.i(h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    hsk.b(companion, m76, n | 0x1, n2);
                    return oyv.a;
                }
            });
        }
    }
    
    public static final void c(jkh i, m76 h, final int n, final int n2) {
        h = h.h(-1247296686);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)i)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                i = tcq.i(jkh.Companion);
            }
            final ea6$b a = ea6.a;
            final cvj v = oyz.V(2131232781, h);
            Objects.requireNonNull(ym6.Companion);
            n7d.a(v, (String)null, i, (dx)null, (ym6)ym6$a.d, 0.0f, (sr4)null, h, (n4 << 6 & 0x380) | 0x6038, 104);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    hsk.c(i, m76, n | 0x1, n2);
                    return oyv.a;
                }
            });
        }
    }
}
