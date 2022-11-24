// 
// Decompiled by Procyon v0.6.0
// 

public final class ws4 implements vs4
{
    public static final ws4 a;
    
    static {
        a = new ws4();
    }
    
    public final dlh a(final dlh dlh, final float n, final boolean b) {
        e0e.f((Object)dlh, "<this>");
        if (n > 0.0) {
            final ysd$a a = ysd.a;
            final ysd$a a2 = ysd.a;
            return dlh.E((dlh)new jxe(n, b));
        }
        throw new IllegalArgumentException(qd.B("invalid weight ", n, "; must be greater than zero").toString());
    }
    
    public final dlh b(final dlh dlh, final ex$b ex$b) {
        e0e.f((Object)dlh, "<this>");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new lqc(ex$b));
    }
}
