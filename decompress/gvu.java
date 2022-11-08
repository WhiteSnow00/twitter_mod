import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvu
{
    public static final b Companion;
    public static final gxe<List<String>> d;
    public final String a;
    public final long b;
    public final String c;
    
    static {
        Companion = new b();
        gvu.d = (u3s)rp2.z0((otb)gvu$a.C0);
    }
    
    public gvu(final String a, final long b, final String c) {
        zzd.f((Object)c, "originalUrl");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gvu)) {
            return false;
        }
        final gvu gvu = (gvu)o;
        return zzd.a((Object)this.a, (Object)gvu.a) && this.b == gvu.b && zzd.a((Object)this.c, (Object)gvu.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return this.c.hashCode() + (hashCode * 31 + (int)(b ^ b >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        return xa0.B(hfe.i("TweetUrl(handle=", this.a, ", tweetID=", this.b), ", originalUrl=", this.c, ")");
    }
    
    public static final class b
    {
    }
}
