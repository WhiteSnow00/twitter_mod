import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6z extends bmz implements npz
{
    private static final f6z zza;
    private int zze;
    private qmz zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        bmz.p((Class)f6z.class, (bmz)(zza = new f6z()));
    }
    
    public f6z() {
        this.zzf = (qmz)iqz.I0;
        this.zzg = "";
    }
    
    public static void B(final f6z f6z, final int n, final v6z v6z) {
        f6z.M();
        ((List<v6z>)f6z.zzf).set(n, v6z);
    }
    
    public static void C(final f6z f6z, final v6z v6z) {
        f6z.M();
        ((List<v6z>)f6z.zzf).add(v6z);
    }
    
    public static void D(final f6z f6z, final Iterable iterable) {
        f6z.M();
        sgz.g(iterable, (List)f6z.zzf);
    }
    
    public static void E(final f6z f6z) {
        f6z.zzf = (qmz)iqz.I0;
    }
    
    public static void F(final f6z f6z, final int n) {
        f6z.M();
        ((List<Object>)f6z.zzf).remove(n);
    }
    
    public static void G(final f6z f6z, final String zzg) {
        Objects.requireNonNull(zzg);
        f6z.zze |= 0x1;
        f6z.zzg = zzg;
    }
    
    public static void H(final f6z f6z, final long zzh) {
        f6z.zze |= 0x2;
        f6z.zzh = zzh;
    }
    
    public static void I(final f6z f6z, final long zzi) {
        f6z.zze |= 0x4;
        f6z.zzi = zzi;
    }
    
    public static b6z w() {
        return (b6z)f6z.zza.j();
    }
    
    public static f6z x() {
        return f6z.zza;
    }
    
    public final List A() {
        return (List)this.zzf;
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
        final qmz zzf = this.zzf;
        if (!zzf.d()) {
            this.zzf = bmz.n(zzf);
        }
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)f6z.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", v6z.class, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new f6z();
        }
        if (n == 4) {
            return new b6z((yru)null);
        }
        if (n != 5) {
            return null;
        }
        return f6z.zza;
    }
    
    public final int s() {
        return this.zzj;
    }
    
    public final int t() {
        return ((List)this.zzf).size();
    }
    
    public final long u() {
        return this.zzi;
    }
    
    public final long v() {
        return this.zzh;
    }
    
    public final v6z y(final int n) {
        return ((List<v6z>)this.zzf).get(n);
    }
    
    public final String z() {
        return this.zzg;
    }
}
