// 
// Decompiled by Procyon v0.6.0
// 

public final class wmm
{
    public static final a Companion;
    public final String a;
    public final zau b;
    public final double c;
    public final long d;
    public final int e;
    public final gna f;
    public int g;
    public long h;
    
    static {
        Companion = new a();
    }
    
    public wmm(final String a, final zau b, final double c, final long d, final int e) {
        zzd.f((Object)b, "systemClock");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new gna(d);
        this.h = b.a();
    }
    
    public static final class a
    {
    }
}
