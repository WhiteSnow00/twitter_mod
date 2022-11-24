import com.twitter.model.stratostore.MediaColorData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pf0 implements og0
{
    public final String a;
    public final MediaColorData b;
    public final String c;
    public final int d;
    public final int e;
    public final w6d f;
    
    public pf0(final String a, final MediaColorData b, final String c, final int d, final int e, final w6d f) {
        e0e.f((Object)c, "originalImageUrl");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pf0)) {
            return false;
        }
        final pf0 pf0 = (pf0)o;
        return e0e.a((Object)this.a, (Object)pf0.a) && e0e.a((Object)this.b, (Object)pf0.b) && e0e.a((Object)this.c, (Object)pf0.c) && this.d == pf0.d && this.e == pf0.e && e0e.a((Object)this.f, (Object)pf0.f);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final MediaColorData b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int d = brg.d(this.c, (hashCode * 31 + hashCode2) * 31, 31);
        final int d2 = this.d;
        final int e = this.e;
        final w6d f = this.f;
        int hashCode3;
        if (f == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = f.hashCode();
        }
        return ((d + d2) * 31 + e) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final MediaColorData b = this.b;
        final String c = this.c;
        final int d = this.d;
        final int e = this.e;
        final w6d f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiImage(altText=");
        sb.append(a);
        sb.append(", colorInfo=");
        sb.append(b);
        sb.append(", originalImageUrl=");
        m51.z(sb, c, ", originalImageWidth=", d, ", originalImageHeight=");
        sb.append(e);
        sb.append(", saliencyRect=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
