import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkk implements ls8
{
    public final ko0 b;
    public final Uri c;
    public final String d;
    public final Uri e;
    public final l43 f;
    public final nba g;
    
    public hkk(final ko0 b, final Uri c, final String d, final Uri e, final l43 f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = nba.L0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hkk)) {
            return false;
        }
        final hkk hkk = (hkk)o;
        return e0e.a((Object)this.b, (Object)hkk.b) && e0e.a((Object)this.c, (Object)hkk.c) && e0e.a((Object)this.d, (Object)hkk.d) && e0e.a((Object)this.e, (Object)hkk.e) && e0e.a((Object)this.f, (Object)hkk.f);
    }
    
    public final nba getName() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final ko0 b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int hashCode3 = this.c.hashCode();
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final Uri e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return this.f.hashCode() + (((hashCode3 + hashCode2 * 31) * 31 + hashCode4) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final ko0 b = this.b;
        final Uri c = this.c;
        final String d = this.d;
        final Uri e = this.e;
        final l43 f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("PlayableDestination(storeData=");
        sb.append(b);
        sb.append(", url=");
        sb.append(c);
        sb.append(", vanity=");
        sb.append(d);
        sb.append(", tcoUrl=");
        sb.append(e);
        sb.append(", destinationButton=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends z4j<hkk>
    {
        public ko0 a;
        public Uri b;
        public String c;
        public Uri d;
        public l43 e;
        
        public final Object i() {
            final ko0 a = this.a;
            final Uri b = this.b;
            e0e.c((Object)b);
            final String c = this.c;
            final Uri d = this.d;
            final l43 e = this.e;
            e0e.c((Object)e);
            return new hkk(a, b, c, d, e);
        }
        
        public final boolean k() {
            if (this.b != null) {
                final l43 e = this.e;
                if (e != null) {
                    ls8 a;
                    if (e != null) {
                        a = e.a();
                    }
                    else {
                        a = null;
                    }
                    if (a != null) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
