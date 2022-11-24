import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.safetycenter.reportdetail.ReportDetailViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkm extends k76
{
    public final ReportDetailViewModel H0;
    public final jkm I0;
    
    public gkm(final v76 v76, final ReportDetailViewModel h0, final jkm i0) {
        e0e.f((Object)v76, "composeDependencies");
        e0e.f((Object)h0, "viewModel");
        e0e.f((Object)i0, "effectHandler");
        super(v76);
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void a(final d86 d86, final int n) {
        final d86 h = d86.h(125254342);
        final sa6$b a = sa6.a;
        final jkm i0 = this.I0;
        final ReportDetailViewModel h2 = this.H0;
        h.x(-2088733469);
        final gkm$a gkm$a = new gkm$a((Object)i0);
        h.x(1941511575);
        h.x(-301010798);
        final Object z = af.z(h, 773894976, -492369756);
        Objects.requireNonNull(d86.Companion);
        Object c = z;
        if (z == d86$a.b) {
            c = j00.c(shw.y(h), h);
        }
        h.O();
        final iz6 f0 = ((gf6)c).F0;
        h.O();
        shw.i((Object)h2, (Object)f0, (hub)new gkm$b((MviViewModel)h2, f0, zzz.h0((Object)gkm$a, h), (mp6)null), h);
        h.O();
        h.O();
        h.O();
        kkm.a((okm)eg8.N0(this.H0, null, h, 1).getValue(), (ptb<vzv>)new gkm$c((Object)this.H0), null, h, 0, 4);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new gkm$d(this, n));
        }
    }
}
