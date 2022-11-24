// 
// Decompiled by Procyon v0.6.0
// 

public final class i1z extends bmz implements npz
{
    private static final i1z zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    
    static {
        bmz.p((Class)i1z.class, (bmz)(zza = new i1z()));
    }
    
    public i1z() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }
    
    public static i1z s() {
        return i1z.zza;
    }
    
    public static i1z t() {
        return i1z.zza;
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
        int p;
        if ((p = y78.p(this.zzf)) == 0) {
            p = 1;
        }
        return p;
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)i1z.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "zze", "zzf", z0z.a, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new i1z();
        }
        if (n == 4) {
            return new p0z();
        }
        if (n != 5) {
            return null;
        }
        return i1z.zza;
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
