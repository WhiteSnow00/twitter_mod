// 
// Decompiled by Procyon v0.6.0
// 

public final class ss4 implements rs4
{
    public static final ss4 a;
    
    static {
        a = new ss4();
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
    
    public final jkh b(final jkh jkh, final dx$b dx$b) {
        zzd.f((Object)jkh, "<this>");
        final ssd$a a = ssd.a;
        final ssd$a a2 = ssd.a;
        return jkh.E((jkh)new iqc(dx$b));
    }
}
