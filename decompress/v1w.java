// 
// Decompiled by Procyon v0.6.0
// 

public final class v1w extends s4j<t1w>
{
    public static final v1w b;
    
    static {
        b = new v1w();
    }
    
    public v1w() {
        super(2);
    }
    
    public final Object d(final elp elp, final int n) {
        zzd.f((Object)elp, "input");
        final long a = elp.A();
        final String c = elp.C();
        zzd.e((Object)c, "input.readNotNullString()");
        final long a2 = elp.A();
        final long a3 = elp.A();
        if (n < 2) {
            elp.u();
        }
        final Object b = elp.B((alp)moj.d);
        zzd.e(b, "input.readNotNullObject(OriginalInfo.SERIALIZER)");
        final moj moj = (moj)b;
        if (n < 1) {
            elp.A();
        }
        return new t1w(a, c, a2, a3, moj);
    }
    
    public final void f(final flp flp, final Object o) {
        final t1w t1w = (t1w)o;
        zzd.f((Object)flp, "output");
        zzd.f((Object)t1w, "entry");
        flp.A(t1w.c).G(t1w.d).A(t1w.e).A(t1w.f).C((Object)t1w.g, (alp)moj.d);
    }
}
