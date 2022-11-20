import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h5z extends clz implements ooz
{
    private static final h5z zza;
    private int zze;
    private rlz zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        clz.p(h5z.class, zza = new h5z());
    }
    
    public h5z() {
        this.zzf = (rlz)jpz.G0;
        this.zzg = "";
    }
    
    public static void B(final h5z h5z, final int n, final x5z x5z) {
        h5z.M();
        h5z.zzf.set(n, x5z);
    }
    
    public static void C(final h5z h5z, final x5z x5z) {
        h5z.M();
        h5z.zzf.add(x5z);
    }
    
    public static void D(final h5z h5z, final Iterable iterable) {
        h5z.M();
        tfz.g(iterable, (List)h5z.zzf);
    }
    
    public static void E(final h5z h5z) {
        h5z.zzf = (rlz)jpz.G0;
    }
    
    public static void F(final h5z h5z, final int n) {
        h5z.M();
        h5z.zzf.remove(n);
    }
    
    public static void G(final h5z h5z, final String zzg) {
        Objects.requireNonNull(zzg);
        h5z.zze |= 0x1;
        h5z.zzg = zzg;
    }
    
    public static void H(final h5z h5z, final long zzh) {
        h5z.zze |= 0x2;
        h5z.zzh = zzh;
    }
    
    public static void I(final h5z h5z, final long zzi) {
        h5z.zze |= 0x4;
        h5z.zzi = zzi;
    }
    
    public static d5z w() {
        return (d5z)h5z.zza.j();
    }
    
    public static h5z x() {
        return h5z.zza;
    }
    
    public final List A() {
        return this.zzf;
    }
    
    public final boolean J() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean K() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean L() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final void M() {
        final rlz zzf = this.zzf;
        if (!zzf.d()) {
            this.zzf = clz.n(zzf);
        }
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new mpz((loz)h5z.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", x5z.class, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new h5z();
        }
        if (n == 4) {
            return new d5z((b1n)null);
        }
        if (n != 5) {
            return null;
        }
        return h5z.zza;
    }
    
    public final int s() {
        return this.zzj;
    }
    
    public final int t() {
        return this.zzf.size();
    }
    
    public final long u() {
        return this.zzi;
    }
    
    public final long v() {
        return this.zzh;
    }
    
    public final x5z y(final int n) {
        return this.zzf.get(n);
    }
    
    public final String z() {
        return this.zzg;
    }
}
