import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l1z extends clz implements ooz
{
    private static final l1z zza;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private rlz zzi;
    
    static {
        clz.p(l1z.class, zza = new l1z());
    }
    
    public l1z() {
        this.zzg = "";
        this.zzi = (rlz)jpz.G0;
    }
    
    public static l1z t() {
        return l1z.zza;
    }
    
    public static l1z u() {
        return l1z.zza;
    }
    
    public final boolean A() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int B() {
        int v;
        if ((v = omy.v(this.zzf)) == 0) {
            v = 1;
        }
        return v;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)l1z.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] { "zze", "zzf", e1z.a, "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new l1z();
        }
        if (n == 4) {
            return new y0z();
        }
        if (n != 5) {
            return null;
        }
        return l1z.zza;
    }
    
    public final int s() {
        return this.zzi.size();
    }
    
    public final String v() {
        return this.zzg;
    }
    
    public final List w() {
        return this.zzi;
    }
    
    public final boolean x() {
        return this.zzh;
    }
    
    public final boolean y() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x2) != 0x0;
    }
}
