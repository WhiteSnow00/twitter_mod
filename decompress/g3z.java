import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g3z extends clz implements ooz
{
    private static final g3z zza;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private rlz zzi;
    private rlz zzj;
    private rlz zzk;
    private String zzl;
    private boolean zzm;
    private rlz zzn;
    private rlz zzo;
    private String zzp;
    
    static {
        clz.p(g3z.class, zza = new g3z());
    }
    
    public g3z() {
        this.zzg = "";
        final jpz g0 = jpz.G0;
        this.zzi = (rlz)g0;
        this.zzj = (rlz)g0;
        this.zzk = (rlz)g0;
        this.zzl = "";
        this.zzn = (rlz)g0;
        this.zzo = (rlz)g0;
        this.zzp = "";
    }
    
    public static void F(final g3z g3z, final int n, final z2z z2z) {
        final rlz zzj = g3z.zzj;
        if (!zzj.d()) {
            g3z.zzj = clz.n(zzj);
        }
        g3z.zzj.set(n, z2z);
    }
    
    public static void G(final g3z g3z) {
        g3z.zzk = (rlz)jpz.G0;
    }
    
    public static c3z w() {
        return (c3z)g3z.zza.j();
    }
    
    public static g3z x() {
        return g3z.zza;
    }
    
    public static g3z y() {
        return g3z.zza;
    }
    
    public final String A() {
        return this.zzp;
    }
    
    public final List B() {
        return this.zzk;
    }
    
    public final List C() {
        return this.zzo;
    }
    
    public final List D() {
        return this.zzn;
    }
    
    public final List E() {
        return this.zzi;
    }
    
    public final boolean H() {
        return this.zzm;
    }
    
    public final boolean I() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean J() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)g3z.zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", w3z.class, "zzj", z2z.class, "zzk", xyy.class, "zzl", "zzm", "zzn", q9z.class, "zzo", r2z.class, "zzp" });
        }
        if (n == 3) {
            return new g3z();
        }
        if (n == 4) {
            return new c3z((msy)null);
        }
        if (n != 5) {
            return null;
        }
        return g3z.zza;
    }
    
    public final int s() {
        return this.zzn.size();
    }
    
    public final int t() {
        return this.zzj.size();
    }
    
    public final long u() {
        return this.zzf;
    }
    
    public final z2z v(final int n) {
        return this.zzj.get(n);
    }
    
    public final String z() {
        return this.zzg;
    }
}
