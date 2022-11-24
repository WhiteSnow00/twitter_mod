import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j2z extends bmz implements npz
{
    private static final j2z zza;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private qmz zzi;
    
    static {
        bmz.p((Class)j2z.class, (bmz)(zza = new j2z()));
    }
    
    public j2z() {
        this.zzg = "";
        this.zzi = (qmz)iqz.I0;
    }
    
    public static j2z t() {
        return j2z.zza;
    }
    
    public static j2z u() {
        return j2z.zza;
    }
    
    public final boolean A() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int B() {
        int p;
        if ((p = o9a.P(this.zzf)) == 0) {
            p = 1;
        }
        return p;
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)j2z.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] { "zze", "zzf", c2z.a, "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new j2z();
        }
        if (n == 4) {
            return new w1z();
        }
        if (n != 5) {
            return null;
        }
        return j2z.zza;
    }
    
    public final int s() {
        return ((List)this.zzi).size();
    }
    
    public final String v() {
        return this.zzg;
    }
    
    public final List w() {
        return (List)this.zzi;
    }
    
    public final boolean x() {
        return this.zzh;
    }
    
    public final boolean y() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x2) != 0x0;
    }
}
