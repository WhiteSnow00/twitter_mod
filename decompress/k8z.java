import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k8z extends clz implements ooz
{
    private static final k8z zza;
    private int zze;
    private int zzf;
    private plz zzg;
    
    static {
        clz.p(k8z.class, zza = new k8z());
    }
    
    public k8z() {
        this.zzg = (plz)ymz.G0;
    }
    
    public static h8z v() {
        return (h8z)k8z.zza.j();
    }
    
    public static k8z w() {
        return k8z.zza;
    }
    
    public static void y(final k8z k8z, final int zzf) {
        k8z.zze |= 0x1;
        k8z.zzf = zzf;
    }
    
    public static void z(final k8z k8z, final Iterable iterable) {
        final plz zzg = k8z.zzg;
        if (!((ufz)zzg).D0) {
            k8z.zzg = clz.m(zzg);
        }
        tfz.g(iterable, (List)k8z.zzg);
    }
    
    public final boolean A() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)k8z.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new k8z();
        }
        if (n == 4) {
            return new h8z(null);
        }
        if (n != 5) {
            return null;
        }
        return k8z.zza;
    }
    
    public final int s() {
        return ((ymz)this.zzg).F0;
    }
    
    public final int t() {
        return this.zzf;
    }
    
    public final long u(final int n) {
        return ((ymz)this.zzg).g(n);
    }
    
    public final List x() {
        return (List)this.zzg;
    }
}
