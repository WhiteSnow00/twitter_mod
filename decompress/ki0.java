import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ki0 implements rg0
{
    public final qe0 a;
    public final int b;
    public final sf0 c;
    public final List<i2h> d;
    public final String e;
    
    public ki0(final qe0 a, final int b, final sf0 c, final List<? extends i2h> d, final String e) {
        zzd.f((Object)a, "aspectRatio");
        zzd.f((Object)d, "variants");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<i2h>)d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ki0)) {
            return false;
        }
        final ki0 ki0 = (ki0)o;
        return zzd.a((Object)this.a, (Object)ki0.a) && this.b == ki0.b && zzd.a((Object)this.c, (Object)ki0.c) && zzd.a((Object)this.d, (Object)ki0.d) && zzd.a((Object)this.e, (Object)ki0.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final sf0 c = this.c;
        final int n = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final int m = hy8.m((List)this.d, ((hashCode * 31 + b) * 31 + hashCode2) * 31, 31);
        final String e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = e.hashCode();
        }
        return m + hashCode3;
    }
    
    @Override
    public final String toString() {
        final qe0 a = this.a;
        final int b = this.b;
        final sf0 c = this.c;
        final List<i2h> d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiVideo(aspectRatio=");
        sb.append(a);
        sb.append(", durationMillis=");
        sb.append(b);
        sb.append(", previewImage=");
        sb.append(c);
        sb.append(", variants=");
        sb.append(d);
        sb.append(", viewCount=");
        return hi.I(sb, e, ")");
    }
}
