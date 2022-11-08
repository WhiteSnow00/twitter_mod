import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzo
{
    public static final alp<mzo> d;
    public int a;
    public int b;
    public List<nzo> c;
    
    static {
        mzo.d = new mzo.mzo$b();
    }
    
    public mzo() {
        this.a = -1;
        this.b = -1;
        this.c = new ArrayList<nzo>();
    }
    
    public mzo(final mzo.mzo$a mzo$a) {
        this.a = -1;
        this.b = -1;
        this.c = new ArrayList<nzo>();
        this.a = mzo$a.a;
        this.b = mzo$a.b;
        this.c = mzo$a.c;
    }
    
    public final nzo a(final String a, final vdv$b vdv$b, final String e, final int f, final int g, final int h, final String i, final String j, final long k) {
        final nzo nzo = new nzo();
        nzo.a = a;
        nzo.b = vdv$b.C0;
        nzo.c = Double.NaN;
        nzo.d = Double.NaN;
        nzo.e = e;
        nzo.f = f;
        nzo.g = g;
        nzo.h = h;
        nzo.i = i;
        nzo.j = j;
        nzo.k = k;
        this.c.add(nzo);
        return nzo;
    }
}
