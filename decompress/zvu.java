import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvu
{
    public static final b Companion;
    public static final qwe<List<String>> d;
    public final String a;
    public final long b;
    public final String c;
    
    static {
        Companion = new b();
        zvu.d = (n4s)pps.n((nsb)zvu$a.D0);
    }
    
    public zvu(final String a, final long b, final String c) {
        czd.f((Object)c, "originalUrl");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zvu)) {
            return false;
        }
        final zvu zvu = (zvu)o;
        return czd.a((Object)this.a, (Object)zvu.a) && this.b == zvu.b && czd.a((Object)this.c, (Object)zvu.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return this.c.hashCode() + (hashCode * 31 + (int)(b ^ b >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        return ta0.z(fu8.l("TweetUrl(handle=", this.a, ", tweetID=", this.b), ", originalUrl=", this.c, ")");
    }
    
    public static final class b
    {
    }
}
