// 
// Decompiled by Procyon v0.6.0
// 

public final class pso implements ifj
{
    public static final pso.pso$a Companion;
    
    static {
        Companion = new pso.pso$a();
    }
    
    public final String a() {
        String a = ifj.Companion.a("ro.trackingId.com.twitter");
        if (flr.g((CharSequence)a)) {
            final fg4 fg4 = new fg4(new String[] { "external::oem:referrer:system_properties" });
            ((o1p)fg4).t = a;
            final int a2 = o5j.a;
            sbw.b((tlm)fg4);
        }
        else {
            a = null;
        }
        return a;
    }
}
