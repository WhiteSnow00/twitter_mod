import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d0z extends bmz implements npz
{
    private static final d0z zza;
    private int zze;
    private int zzf;
    private String zzg;
    private qmz zzh;
    private boolean zzi;
    private i1z zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    
    static {
        bmz.p((Class)d0z.class, (bmz)(zza = new d0z()));
    }
    
    public d0z() {
        this.zzg = "";
        this.zzh = (qmz)iqz.I0;
    }
    
    public static void A(final d0z d0z, final String zzg) {
        d0z.zze |= 0x2;
        d0z.zzg = zzg;
    }
    
    public static void B(final d0z d0z, final int n, final k0z k0z) {
        final qmz zzh = d0z.zzh;
        if (!zzh.d()) {
            d0z.zzh = bmz.n(zzh);
        }
        ((List<k0z>)d0z.zzh).set(n, k0z);
    }
    
    public static zzy u() {
        return (zzy)d0z.zza.j();
    }
    
    public static d0z v() {
        return d0z.zza;
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
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)d0z.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", k0z.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
        }
        if (n == 3) {
            return new d0z();
        }
        if (n == 4) {
            return new zzy((pk7)null);
        }
        if (n != 5) {
            return null;
        }
        return d0z.zza;
    }
    
    public final int s() {
        return ((List)this.zzh).size();
    }
    
    public final int t() {
        return this.zzf;
    }
    
    public final k0z w(final int n) {
        return ((List<k0z>)this.zzh).get(n);
    }
    
    public final i1z x() {
        i1z i1z;
        if ((i1z = this.zzj) == null) {
            i1z = i1z.t();
        }
        return i1z;
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final List z() {
        return (List)this.zzh;
    }
}
