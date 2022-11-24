import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c8z extends bmz implements npz
{
    private static final c8z zza;
    private qmz zze;
    
    static {
        bmz.p((Class)c8z.class, (bmz)(zza = new c8z()));
    }
    
    public c8z() {
        this.zze = (qmz)iqz.I0;
    }
    
    public static e7z s() {
        return (e7z)c8z.zza.j();
    }
    
    public static c8z t() {
        return c8z.zza;
    }
    
    public static void w(final c8z c8z, final k8z k8z) {
        final qmz zze = c8z.zze;
        if (!zze.d()) {
            c8z.zze = bmz.n(zze);
        }
        ((List<k8z>)c8z.zze).add(k8z);
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)c8z.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", k8z.class });
        }
        if (n == 3) {
            return new c8z();
        }
        if (n == 4) {
            return new e7z(null);
        }
        if (n != 5) {
            return null;
        }
        return c8z.zza;
    }
    
    public final k8z u() {
        return ((List<k8z>)this.zze).get(0);
    }
    
    public final List v() {
        return (List)this.zze;
    }
}
