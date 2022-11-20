import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzy extends clz implements ooz
{
    private static final gzy zza;
    private int zze;
    private int zzf;
    private String zzg;
    private rlz zzh;
    private boolean zzi;
    private k0z zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    
    static {
        clz.p(gzy.class, zza = new gzy());
    }
    
    public gzy() {
        this.zzg = "";
        this.zzh = (rlz)jpz.G0;
    }
    
    public static void A(final gzy gzy, final String zzg) {
        gzy.zze |= 0x2;
        gzy.zzg = zzg;
    }
    
    public static void B(final gzy gzy, final int n, final nzy nzy) {
        final rlz zzh = gzy.zzh;
        if (!zzh.d()) {
            gzy.zzh = clz.n(zzh);
        }
        gzy.zzh.set(n, nzy);
    }
    
    public static czy u() {
        return (czy)gzy.zza.j();
    }
    
    public static gzy v() {
        return gzy.zza;
    }
    
    public final boolean C() {
        return this.zzk;
    }
    
    public final boolean D() {
        return this.zzl;
    }
    
    public final boolean E() {
        return this.zzm;
    }
    
    public final boolean F() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean G() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean H() {
        return (this.zze & 0x40) != 0x0;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)gzy.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", nzy.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
        }
        if (n == 3) {
            return new gzy();
        }
        if (n == 4) {
            return new czy((uoz)null);
        }
        if (n != 5) {
            return null;
        }
        return gzy.zza;
    }
    
    public final int s() {
        return this.zzh.size();
    }
    
    public final int t() {
        return this.zzf;
    }
    
    public final nzy w(final int n) {
        return this.zzh.get(n);
    }
    
    public final k0z x() {
        k0z k0z;
        if ((k0z = this.zzj) == null) {
            k0z = k0z.t();
        }
        return k0z;
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final List z() {
        return this.zzh;
    }
}
