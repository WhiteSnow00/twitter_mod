import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v1c
{
    public static final nmp<v1c> d;
    public final efv a;
    public final jw6 b;
    public final String c;
    
    static {
        v1c.d = new v1c.v1c$a();
    }
    
    public v1c(final efv a, final jw6 b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && v1c.class == o.getClass()) {
            final v1c v1c = (v1c)o;
            if (this.a.equals((Object)v1c.a)) {
                final String c = this.c;
                final String c2 = v1c.c;
                final Pattern a = flr.a;
                if (e0e.a((Object)c, (Object)c2)) {
                    final jw6 b2 = this.b;
                    if (b2 == null) {
                        final boolean b3 = b;
                        if (v1c.b == null) {
                            return b3;
                        }
                    }
                    if (o5j.a((Object)b2, (Object)v1c.b)) {
                        return b;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String c = this.c;
        int hashCode2 = 0;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final jw6 b = this.b;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("GeoTag{place=");
        f.append(this.a);
        f.append(", coordinate=");
        f.append(this.b);
        f.append(", searchId='");
        f.append(this.c);
        f.append('\'');
        f.append('}');
        return f.toString();
    }
}
