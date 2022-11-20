// 
// Decompiled by Procyon v0.6.0
// 

public final class j4z extends clz implements ooz
{
    private static final j4z zza;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    
    static {
        clz.p(j4z.class, zza = new j4z());
    }
    
    public j4z() {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
    }
    
    public static j4z s() {
        return j4z.zza;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)j4z.zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
        }
        if (n == 3) {
            return new j4z();
        }
        if (n == 4) {
            return new g4z();
        }
        if (n != 5) {
            return null;
        }
        return j4z.zza;
    }
}
