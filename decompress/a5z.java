// 
// Decompiled by Procyon v0.6.0
// 

public final class a5z extends okz implements aoz
{
    private static final a5z zza;
    private int zze;
    private String zzf;
    private long zzg;
    
    static {
        okz.p(a5z.class, zza = new a5z());
    }
    
    public a5z() {
        this.zzf = "";
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new yoz((xnz)a5z.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new a5z();
        }
        if (n == 4) {
            return new w4z((dml)null);
        }
        if (n != 5) {
            return null;
        }
        return a5z.zza;
    }
}
