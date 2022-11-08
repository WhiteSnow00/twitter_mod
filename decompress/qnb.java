import java.io.IOException;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qnb
{
    public static final alp<qnb> i;
    public final tnb a;
    public final String b;
    public final String c;
    public final snb d;
    public final String e;
    public final SparseArray<pnb> f;
    public final pnb g;
    public final String h;
    
    static {
        qnb.i = new qnb.qnb$a();
    }
    
    public qnb(final elp elp, final int n) throws IOException, ClassNotFoundException {
        final tnb a = (tnb)((s4j)tnb.F0).a(elp);
        pf8.r(a);
        this.a = a;
        this.b = elp.C();
        this.c = elp.C();
        final snb d = (snb)((s4j)snb.E0).a(elp);
        pf8.r(d);
        this.d = d;
        this.e = elp.C();
        final pnb$b g0 = pnb.G0;
        final SparseArray a2 = l60.a(elp, (alp)g0);
        pf8.r(a2);
        this.f = (SparseArray<pnb>)a2;
        final pnb g2 = (pnb)((s4j)g0).a(elp);
        pf8.r(g2);
        this.g = g2;
        String c;
        if (n >= 1) {
            c = elp.C();
        }
        else {
            c = "";
        }
        this.h = c;
    }
    
    public qnb(final tnb a, final String b, final String c, final snb d, final String e, final SparseArray<pnb> f, final pnb g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
}
