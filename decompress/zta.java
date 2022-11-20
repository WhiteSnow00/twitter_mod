import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zta
{
    public static final b Companion;
    public static final rlp<zta> f;
    public final long a;
    public final Map<String, yta> b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        Companion = new b();
        zta.f = new zta.zta$c();
    }
    
    public zta(final long a, final Map b, final String c, final String d, final String e, final rf8 rf8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final yta a(final String s) {
        czd.f((Object)s, "key");
        return this.b.get(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof zta) {
                final Map<String, yta> b = this.b;
                final zta zta = (zta)o;
                if (czd.a((Object)b, (Object)zta.b) && czd.a((Object)this.c, (Object)zta.c) && czd.a((Object)this.d, (Object)zta.d) && czd.a((Object)this.e, (Object)zta.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.d, hmg.f(this.c, this.b.hashCode() * 31, 31), 31);
        final String e = this.e;
        int hashCode;
        if (e != null) {
            hashCode = e.hashCode();
        }
        else {
            hashCode = 0;
        }
        return f + hashCode;
    }
    
    public static final class b
    {
    }
}
