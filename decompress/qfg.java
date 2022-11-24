// 
// Decompiled by Procyon v0.6.0
// 

public final class qfg extends g5j$a
{
    public static g5j<qfg> d;
    public float b;
    public float c;
    
    static {
        (qfg.d = (g5j<qfg>)g5j.a(32, (g5j$a)new qfg(0.0f, 0.0f))).f = 0.5f;
    }
    
    public qfg() {
    }
    
    public qfg(final float b, final float c) {
        this.b = b;
        this.c = c;
    }
    
    public static qfg b(final float b, final float c) {
        final qfg qfg = (qfg)qfg.d.b();
        qfg.b = b;
        qfg.c = c;
        return qfg;
    }
    
    public static void c(final qfg qfg) {
        qfg.d.c((g5j$a)qfg);
    }
    
    public final g5j$a a() {
        return new qfg(0.0f, 0.0f);
    }
}
