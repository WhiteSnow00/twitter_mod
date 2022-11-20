// 
// Decompiled by Procyon v0.6.0
// 

public final class k0z extends clz implements ooz
{
    private static final k0z zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    
    static {
        clz.p(k0z.class, zza = new k0z());
    }
    
    public k0z() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }
    
    public static k0z s() {
        return k0z.zza;
    }
    
    public static k0z t() {
        return k0z.zza;
    }
    
    public final boolean A() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean B() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean C() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final int D() {
        int o0;
        if ((o0 = lp.o0(this.zzf)) == 0) {
            o0 = 1;
        }
        return o0;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)k0z.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "zze", "zzf", b0z.a, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new k0z();
        }
        if (n == 4) {
            return new szy();
        }
        if (n != 5) {
            return null;
        }
        return k0z.zza;
    }
    
    public final String u() {
        return this.zzh;
    }
    
    public final String v() {
        return this.zzj;
    }
    
    public final String w() {
        return this.zzi;
    }
    
    public final boolean x() {
        return this.zzg;
    }
    
    public final boolean y() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x4) != 0x0;
    }
}
