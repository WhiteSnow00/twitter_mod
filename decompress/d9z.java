import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9z extends bmz implements npz
{
    private static final d9z zza;
    private omz zze;
    private omz zzf;
    private qmz zzg;
    private qmz zzh;
    
    static {
        bmz.p((Class)d9z.class, (bmz)(zza = new d9z()));
    }
    
    public d9z() {
        final xnz i0 = xnz.I0;
        this.zze = (omz)i0;
        this.zzf = (omz)i0;
        final iqz i2 = iqz.I0;
        this.zzg = (qmz)i2;
        this.zzh = (qmz)i2;
    }
    
    public static void F(final d9z d9z, final Iterable iterable) {
        final omz zze = d9z.zze;
        if (!((tgz)zze).F0) {
            d9z.zze = bmz.m(zze);
        }
        sgz.g(iterable, (List)d9z.zze);
    }
    
    public static void G(final d9z d9z) {
        d9z.zze = (omz)xnz.I0;
    }
    
    public static void H(final d9z d9z, final Iterable iterable) {
        final omz zzf = d9z.zzf;
        if (!((tgz)zzf).F0) {
            d9z.zzf = bmz.m(zzf);
        }
        sgz.g(iterable, (List)d9z.zzf);
    }
    
    public static void I(final d9z d9z) {
        d9z.zzf = (omz)xnz.I0;
    }
    
    public static void J(final d9z d9z, final Iterable iterable) {
        final qmz zzg = d9z.zzg;
        if (!zzg.d()) {
            d9z.zzg = bmz.n(zzg);
        }
        sgz.g(iterable, (List)d9z.zzg);
    }
    
    public static void K(final d9z d9z) {
        d9z.zzg = (qmz)iqz.I0;
    }
    
    public static void L(final d9z d9z, final int n) {
        final qmz zzg = d9z.zzg;
        if (!zzg.d()) {
            d9z.zzg = bmz.n(zzg);
        }
        ((List<Object>)d9z.zzg).remove(n);
    }
    
    public static void M(final d9z d9z, final Iterable iterable) {
        final qmz zzh = d9z.zzh;
        if (!zzh.d()) {
            d9z.zzh = bmz.n(zzh);
        }
        sgz.g(iterable, (List)d9z.zzh);
    }
    
    public static void N(final d9z d9z) {
        d9z.zzh = (qmz)iqz.I0;
    }
    
    public static void O(final d9z d9z, final int n) {
        final qmz zzh = d9z.zzh;
        if (!zzh.d()) {
            d9z.zzh = bmz.n(zzh);
        }
        ((List<Object>)d9z.zzh).remove(n);
    }
    
    public static z8z x() {
        return (z8z)d9z.zza.j();
    }
    
    public static d9z y() {
        return d9z.zza;
    }
    
    public static d9z z() {
        return d9z.zza;
    }
    
    public final j9z A(final int n) {
        return ((List<j9z>)this.zzh).get(n);
    }
    
    public final List B() {
        return (List)this.zzg;
    }
    
    public final List C() {
        return (List)this.zzf;
    }
    
    public final List D() {
        return (List)this.zzh;
    }
    
    public final List E() {
        return (List)this.zze;
    }
    
    public final Object r(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new lqz((kpz)d9z.zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[] { "zze", "zzf", "zzg", x5z.class, "zzh", j9z.class });
        }
        if (n == 3) {
            return new d9z();
        }
        if (n == 4) {
            return new z8z((yru)null);
        }
        if (n != 5) {
            return null;
        }
        return d9z.zza;
    }
    
    public final int s() {
        return ((List)this.zzg).size();
    }
    
    public final int t() {
        return ((xnz)this.zzf).H0;
    }
    
    public final int u() {
        return ((List)this.zzh).size();
    }
    
    public final int v() {
        return ((xnz)this.zze).H0;
    }
    
    public final x5z w(final int n) {
        return ((List<x5z>)this.zzg).get(n);
    }
}
