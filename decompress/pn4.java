import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.app.collabs.search.CollaboratorsSearchViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pn4 extends e66
{
    public final CollaboratorsSearchViewModel F0;
    public final ko4 G0;
    
    public pn4(final p66 p3, final CollaboratorsSearchViewModel f0, final ko4 g0) {
        czd.f((Object)p3, "composeDependencies");
        czd.f((Object)f0, "viewModel");
        czd.f((Object)g0, "effectHandler");
        super(p3);
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void a(final x66 x66, final int n) {
        final x66 h = x66.h(-1753003564);
        final n96$b a = n96.a;
        final ko4 g0 = this.G0;
        final CollaboratorsSearchViewModel f0 = this.F0;
        h.x(-2088733469);
        final ftb<jo4, go6<? super fzv>, Object> ftb = (ftb<jo4, go6<? super fzv>, Object>)new ftb<jo4, go6<? super fzv>, Object>(g0) {
            public final Object invoke(final Object o, final Object o2) {
                final go6 go6 = (go6)o2;
                ((mx9)super.D0).q(o);
                return fzv.a;
            }
        };
        h.x(1941511575);
        h.x(-301010798);
        final Object y = nb0.y(h, 773894976, -492369756);
        Objects.requireNonNull(x66.Companion);
        Object g2 = y;
        if (y == x66$a.b) {
            g2 = mb0.g(npe.C(h), h);
        }
        h.O();
        final cy6 d0 = ((zd6)g2).D0;
        h.O();
        npe.h((Object)f0, (Object)d0, (ftb)new pn4$b((MviViewModel)f0, d0, blz.U(ftb, h), (go6)null), h);
        h.O();
        h.O();
        h.O();
        co4.d((okh)null, (CollaboratorsSearchViewModel)null, h, 0, 3);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(this, n) {
                public final pn4 D0;
                public final int E0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    this.D0.a(x66, this.E0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
}
