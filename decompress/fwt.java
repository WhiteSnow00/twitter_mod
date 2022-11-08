// 
// Decompiled by Procyon v0.6.0
// 

public final class fwt
{
    public static final a Companion;
    public static final nca a;
    public static final nca b;
    public static final nca c;
    
    static {
        Companion = new a();
        final nca$a companion = nca.Companion;
        a = companion.e("traffic", "mapping", "dynamic_host", "", "purge");
        b = companion.e("traffic", "mapping", "dynamic_host", "", "use_fallback");
        c = companion.e("traffic", "mapping", "dynamic_host", "", "fallback_validation");
    }
    
    public final void a(final zf4 zf4, final cro cro) {
        final String t = zf4.T;
        final StringBuilder sb = new StringBuilder();
        sb.append("Scribing Traffic Client: ");
        sb.append(t);
        zzd.f((Object)sb.toString(), "data");
        if (cro.b()) {
            saw.b((okm)zf4);
        }
    }
    
    public static final class a
    {
    }
}
