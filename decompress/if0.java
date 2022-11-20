import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class if0 implements ng0
{
    public final String a;
    public final me0 b;
    public final of0 c;
    public final List<j2h> d;
    
    public if0(final String a, final me0 b, final of0 c, final List<? extends j2h> d) {
        czd.f((Object)b, "aspectRatio");
        czd.f((Object)d, "variants");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<j2h>)d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof if0)) {
            return false;
        }
        final if0 if0 = (if0)o;
        return czd.a((Object)this.a, (Object)if0.a) && czd.a((Object)this.b, (Object)if0.b) && czd.a((Object)this.c, (Object)if0.c) && czd.a((Object)this.d, (Object)if0.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int hashCode3 = this.b.hashCode();
        final of0 c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return this.d.hashCode() + ((hashCode3 + hashCode2 * 31) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final me0 b = this.b;
        final of0 c = this.c;
        final List<j2h> d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiGif(altText=");
        sb.append(a);
        sb.append(", aspectRatio=");
        sb.append(b);
        sb.append(", previewImage=");
        sb.append(c);
        sb.append(", variants=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
