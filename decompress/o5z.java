import java.util.HashMap;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o5z implements Callable
{
    public final g7z D0;
    public final String E0;
    
    public o5z(final g7z d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Object call() {
        final g7z d0 = this.D0;
        final String e0 = this.E0;
        final zdy f0 = ((xmz)d0).E0.F0;
        poz.I((zmz)f0);
        final zaz c = f0.C(e0);
        final HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", e0);
        ((pbz)d0).D0.J0.p();
        hashMap.put("gmp_version", 64000L);
        if (c != null) {
            final String p = c.P();
            if (p != null) {
                hashMap.put("app_version", p);
            }
            hashMap.put("app_version_int", c.B());
            hashMap.put("dynamite_version", c.E());
        }
        return hashMap;
    }
}
