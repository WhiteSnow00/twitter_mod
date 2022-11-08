// 
// Decompiled by Procyon v0.6.0
// 

public final class wuz implements vuz
{
    public static final tcz a;
    public static final wcz b;
    public static final qcz c;
    public static final qcz d;
    public static final adz e;
    
    static {
        final edz edz = new edz(icz.a(), false, true);
        a = (tcz)edz.c("measurement.test.boolean_flag", false);
        b = new wcz(edz, -3.0);
        c = (qcz)edz.a("measurement.test.int_flag", -2L);
        d = (qcz)edz.a("measurement.test.long_flag", -1L);
        e = new adz(edz, "measurement.test.string_flag", "---");
    }
    
    public final double a() {
        return (double)wuz.b.b();
    }
    
    public final long c() {
        return (long)((mdz)wuz.c).b();
    }
    
    public final long d() {
        return (long)((mdz)wuz.d).b();
    }
    
    public final String e() {
        return (String)((mdz)wuz.e).b();
    }
    
    public final boolean f() {
        return (boolean)((mdz)wuz.a).b();
    }
}
