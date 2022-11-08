import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9z extends okz implements aoz
{
    private static final b9z zza;
    private int zze;
    private dlz zzf;
    private n8z zzg;
    
    static {
        okz.p(b9z.class, zza = new b9z());
    }
    
    public b9z() {
        this.zzf = (dlz)voz.F0;
    }
    
    @Override
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new yoz((xnz)b9z.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "zze", "zzf", p9z.class, "zzg" });
        }
        if (n == 3) {
            return new b9z();
        }
        if (n == 4) {
            return new c1z((rez)null);
        }
        if (n != 5) {
            return null;
        }
        return b9z.zza;
    }
    
    public final n8z s() {
        n8z n8z;
        if ((n8z = this.zzg) == null) {
            n8z = n8z.u();
        }
        return n8z;
    }
    
    public final List u() {
        return (List)this.zzf;
    }
}
