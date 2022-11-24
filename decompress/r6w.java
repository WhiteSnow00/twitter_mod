import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r6w
{
    public final Uri a;
    public final String b;
    public final Uri c;
    
    public r6w(final Uri a, final String b, final Uri c) {
        e0e.f((Object)a, "url");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r6w)) {
            return false;
        }
        final r6w r6w = (r6w)o;
        return e0e.a((Object)this.a, (Object)r6w.a) && e0e.a((Object)this.b, (Object)r6w.b) && e0e.a((Object)this.c, (Object)r6w.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Uri c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final Uri a = this.a;
        final String b = this.b;
        final Uri c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("UrlData(url=");
        sb.append(a);
        sb.append(", vanity=");
        sb.append(b);
        sb.append(", tcoUrl=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
