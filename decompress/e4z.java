import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4z extends bmz implements npz
{
    private static final e4z zza;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private qmz zzi;
    private qmz zzj;
    private qmz zzk;
    private String zzl;
    private boolean zzm;
    private qmz zzn;
    private qmz zzo;
    private String zzp;
    
    static {
        bmz.p((Class)e4z.class, (bmz)(zza = new e4z()));
    }
    
    public e4z() {
        this.zzg = "";
        final iqz i0 = iqz.I0;
        this.zzi = (qmz)i0;
        this.zzj = (qmz)i0;
        this.zzk = (qmz)i0;
        this.zzl = "";
        this.zzn = (qmz)i0;
        this.zzo = (qmz)i0;
        this.zzp = "";
    }
    
    public static void F(final e4z e4z, final int n, final x3z x3z) {
        final qmz zzj = e4z.zzj;
        if (!zzj.d()) {
            e4z.zzj = bmz.n(zzj);
        }
        ((List<x3z>)e4z.zzj).set(n, x3z);
    }
    
    public static void G(final e4z e4z) {
        e4z.zzk = (qmz)iqz.I0;
    }
    
    public static a4z w() {
        return (a4z)e4z.zza.j();
    }
    
    public static e4z x() {
        return e4z.zza;
    }
    
    public static e4z y() {
        return e4z.zza;
    }
    
    public final String A() {
        return this.zzp;
    }
    
    public final List B() {
        return (List)this.zzk;
    }
    
    public final List C() {
        return (List)this.zzo;
    }
    
    public final List D() {
        return (List)this.zzn;
    }
    
    public final List E() {
        return (List)this.zzi;
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
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)e4z.zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", u4z.class, "zzj", x3z.class, "zzk", uzy.class, "zzl", "zzm", "zzn", paz.class, "zzo", p3z.class, "zzp" });
        }
        if (n == 3) {
            return new e4z();
        }
        if (n == 4) {
            return new a4z((ak1)null);
        }
        if (n != 5) {
            return null;
        }
        return e4z.zza;
    }
    
    public final int s() {
        return ((List)this.zzn).size();
    }
    
    public final int t() {
        return ((List)this.zzj).size();
    }
    
    public final long u() {
        return this.zzf;
    }
    
    public final x3z v(final int n) {
        return ((List<x3z>)this.zzj).get(n);
    }
    
    public final String z() {
        return this.zzg;
    }
}
