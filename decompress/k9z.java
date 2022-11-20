import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k9z extends clz implements ooz
{
    private static final k9z zza;
    private int zze;
    private String zzf;
    private rlz zzg;
    
    static {
        clz.p(k9z.class, zza = new k9z());
    }
    
    public k9z() {
        this.zzf = "";
        this.zzg = (rlz)jpz.G0;
    }
    
    public static k9z s() {
        return k9z.zza;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)k9z.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "zze", "zzf", "zzg", eaz.class });
        }
        if (n == 3) {
            return new k9z();
        }
        if (n == 4) {
            return new g9z();
        }
        if (n != 5) {
            return null;
        }
        return k9z.zza;
    }
    
    public final String t() {
        return this.zzf;
    }
    
    public final List u() {
        return this.zzg;
    }
}
