import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h5t extends fys implements fys$a
{
    public final f5t j;
    
    public h5t(final String s, final long n, final b1p b1p, final kws kws, final long n2, final f5t j, final boolean b, final pmh pmh) {
        super(s, n, b1p, kws, n2, b, (c2t)null, pmh);
        this.j = j;
    }
    
    public final tvs.a a(final y4c y4c, final lsm lsm) {
        final f5t j = this.j;
        final b8d f = j.f;
        final String a = j.g.a;
        long n;
        if (a != null) {
            n = Math.abs(a.hashCode()) % 100000L;
        }
        else {
            n = Math.abs(j.a.hashCode()) % 100000L;
        }
        final long b = Long.MAX_VALUE - n;
        final long e = this.j.g.e;
        final qgv f2 = y4c.f(String.valueOf(e));
        final dq2$b dq2$b = new dq2$b();
        dq2$b.o(Uri.parse(this.j.d));
        dq2$b.b = this.j.e;
        final ls8 ls8 = (ls8)((z4j)dq2$b).e();
        final wtg$a wtg$a = new wtg$a();
        wtg$a.g = b;
        final StringBuilder sb = new StringBuilder();
        sb.append("1_");
        sb.append(b);
        wtg$a.B = ywg.a(sb.toString());
        wtg$a.h = b;
        wtg$a.i = e;
        wtg$a.q(f2);
        if (f != null) {
            wtg$a.l = wtg$c.H0;
            wtg$a.j = f.F0;
            wtg$a.w = f.H0;
            wtg$a.m = f.G0;
        }
        final wsg$a wsg$a = new wsg$a();
        wsg$a.b = (wtg)((z4j)wtg$a).e();
        ((zwv$a)wsg$a).a = ls8;
        final zwv zwv = (zwv)((z4j)wsg$a).j();
        final cu8$a cu8$a = new cu8$a();
        final f5t i = this.j;
        final String c = i.c;
        final String s = "";
        String b2;
        if ((b2 = c) == null) {
            b2 = "";
        }
        cu8$a.b = b2;
        String e2 = i.e;
        if (e2 == null) {
            e2 = s;
        }
        cu8$a.c = e2;
        ((zwv$a)cu8$a).a = ls8;
        final zwv zwv2 = (zwv)((z4j)cu8$a).j();
        final oh0$a oh0$a = new oh0$a();
        final vg3$b vg3$b = new vg3$b();
        vg3$b.b = b;
        final String b3 = this.j.b;
        cwa a2 = null;
        vg3$b.y = new rfu(b3, null, null);
        final uwv$a uwv$a = new uwv$a();
        uwv$a.d = this.j.a;
        uwv$a.o(ojf.w((Object)zwv, (Object[])new zwv[] { zwv2 }));
        vg3$b.v = (uwv)((z4j)uwv$a).e();
        oh0$a.p(vg3$b);
        oh0$a.r(f2);
        oh0$a.O0 = this.j.g;
        final oh0 p2 = (oh0)((z4j)oh0$a).j();
        final u5t$a u5t$a = new u5t$a();
        u5t$a.p = p2;
        u5t$a.s = this.j.g;
        ((tvs.a)u5t$a).c = ((yvs)this).c;
        ((tvs.a)u5t$a).a = ((yvs)this).b;
        ((tvs.a)u5t$a).n = super.h;
        ((tvs.a)u5t$a).o = super.i;
        final u5t p3 = (u5t)((z4j)u5t$a).j();
        final g5t.a a3 = new g5t.a();
        a3.a = ((yvs)this).b;
        a3.c = ((yvs)this).c;
        a3.f = super.e;
        a3.n = super.h;
        final kws f3 = super.f;
        if (f3 != null) {
            a2 = lsm.a(f3);
        }
        a3.g = a2;
        a3.o = super.i;
        a3.p = p3;
        return a3;
    }
}
