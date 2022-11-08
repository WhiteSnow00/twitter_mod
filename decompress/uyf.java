import tv.periscope.model.b;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uyf implements oqu
{
    public final sxf C0;
    public final mf2 D0;
    public qzf E0;
    
    public uyf(final String a, final String b, final String c, final String i, final String j, final ym ym, final ibm ibm) {
        final mf2 b2 = k83.a().B7();
        final sxf$a sxf$a = new sxf$a();
        sxf$a.a = a;
        sxf$a.b = b;
        sxf$a.i = i;
        sxf$a.j = j;
        sxf$a.c = c;
        this.C0 = (sxf)((h4j)sxf$a).e();
        this.D0 = b2;
        ibm.i((rj)new tyf(new m29(((b5j)ym.C0).subscribe((fk6)new pcs((Object)this, 9))), 0));
    }
    
    public final lev c(final Context context, final vo6 vo6, final String s) {
        final iof$a iof$a = new iof$a();
        final tj3 w0 = vo6.C0.W0;
        final sxf c0 = this.C0;
        final String c2 = nyf.c(w0);
        sxf h0 = c0;
        if (c2 != null) {
            final sxf$a sxf$a = new sxf$a();
            sxf$a.c = c2;
            sxf$a.a = c0.a;
            sxf$a.b = c0.b;
            sxf$a.i = c0.i;
            sxf$a.j = c0.j;
            h0 = (sxf)((h4j)sxf$a).e();
        }
        Label_0172: {
            if (w0 != null) {
                if (!w0.p() && !vo6.S()) {
                    final tj3 w2 = vo6.C0.W0;
                    if (w2 == null || !w2.m()) {
                        break Label_0172;
                    }
                }
                iof$a.b = nyf.b(w0);
            }
        }
        final qzf e0 = this.E0;
        if (e0 instanceof nqf) {
            final String id = e0.getId();
            iof$a.a = id;
            final b b = (b)((f4e)this.D0).j(id);
            if (b != null) {
                iof$a.p(true ^ b.F());
                iof$a.o(b.s());
            }
        }
        final iof i0 = (iof)((h4j)iof$a).e();
        final lev j = yf4.j(context, vo6, s);
        j.h0 = h0;
        j.i0 = i0;
        return j;
    }
}
