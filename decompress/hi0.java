import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hi0 implements og0
{
    public final ne0 a;
    public final int b;
    public final pf0 c;
    public final List<a3h> d;
    public final String e;
    
    public hi0(final ne0 a, final int b, final pf0 c, final List<? extends a3h> d, final String e) {
        e0e.f((Object)a, "aspectRatio");
        e0e.f((Object)d, "variants");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<a3h>)d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hi0)) {
            return false;
        }
        final hi0 hi0 = (hi0)o;
        return e0e.a((Object)this.a, (Object)hi0.a) && this.b == hi0.b && e0e.a((Object)this.c, (Object)hi0.c) && e0e.a((Object)this.d, (Object)hi0.d) && e0e.a((Object)this.e, (Object)hi0.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final pf0 c = this.c;
        final int n = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final int o = go9.o((List)this.d, ((hashCode * 31 + b) * 31 + hashCode2) * 31, 31);
        final String e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = e.hashCode();
        }
        return o + hashCode3;
    }
    
    @Override
    public final String toString() {
        final ne0 a = this.a;
        final int b = this.b;
        final pf0 c = this.c;
        final List<a3h> d = this.d;
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
        return m51.y(sb, e, ")");
    }
}
