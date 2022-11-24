// 
// Decompiled by Procyon v0.6.0
// 

public final class h5z extends bmz implements npz
{
    private static final h5z zza;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    
    static {
        bmz.p((Class)h5z.class, (bmz)(zza = new h5z()));
    }
    
    public h5z() {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
    }
    
    public static h5z s() {
        return h5z.zza;
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)h5z.zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
        }
        if (n == 3) {
            return new h5z();
        }
        if (n == 4) {
            return new e5z();
        }
        if (n != 5) {
            return null;
        }
        return h5z.zza;
    }
}
