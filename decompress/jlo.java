// 
// Decompiled by Procyon v0.6.0
// 

public final class jlo implements ilo
{
    public static final jlo a;
    
    static {
        a = new jlo();
    }
    
    public final jkh a(final jkh jkh, final float n, final boolean b) {
        zzd.f((Object)jkh, "<this>");
        if (n > 0.0) {
            final ssd$a a = ssd.a;
            final ssd$a a2 = ssd.a;
            return jkh.E((jkh)new cxe(n, b));
        }
        throw new IllegalArgumentException(xk0.A("invalid weight ", n, "; must be greater than zero").toString());
    }
    
    public final jkh b(final jkh jkh, final dx$c dx$c) {
        zzd.f((Object)jkh, "<this>");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new yrw(dx$c));
    }
    
    public final jkh c(final jkh jkh) {
        zzd.f((Object)jkh, "<this>");
        final jqc a = gx.a;
        zzd.f((Object)a, "alignmentLine");
        final ssd$a a2 = ssd.a;
        final ssd$a a3 = ssd.a;
        return (jkh)new l5q$a((ex)a);
    }
}
