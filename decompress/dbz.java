import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbz extends bmz implements npz
{
    private static final dbz zza;
    private int zze;
    private int zzf;
    private qmz zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    
    static {
        bmz.p((Class)dbz.class, (bmz)(zza = new dbz()));
    }
    
    public dbz() {
        this.zzg = (qmz)iqz.I0;
        this.zzh = "";
        this.zzi = "";
    }
    
    public static dbz t() {
        return dbz.zza;
    }
    
    public final boolean A() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final int B() {
        int m;
        if ((m = iqs.m(this.zzf)) == 0) {
            m = 1;
        }
        return m;
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)dbz.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", new Object[] { "zze", "zzf", xaz.a, "zzg", dbz.class, "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new dbz();
        }
        if (n == 4) {
            return new i4z(null);
        }
        if (n != 5) {
            return null;
        }
        return dbz.zza;
    }
    
    public final double s() {
        return this.zzk;
    }
    
    public final String u() {
        return this.zzh;
    }
    
    public final String v() {
        return this.zzi;
    }
    
    public final List w() {
        return (List)this.zzg;
    }
    
    public final boolean x() {
        return this.zzj;
    }
    
    public final boolean y() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x10) != 0x0;
    }
}
