import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cc1 extends q9r$a
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final tt8 f;
    
    public cc1(final String a, final String b, final String c, final String d, final int e, final tt8 f) {
        Objects.requireNonNull(a, "Null appIdentifier");
        this.a = a;
        Objects.requireNonNull(b, "Null versionCode");
        this.b = b;
        Objects.requireNonNull(c, "Null versionName");
        this.c = c;
        Objects.requireNonNull(d, "Null installUuid");
        this.d = d;
        this.e = e;
        Objects.requireNonNull(f, "Null developmentPlatformProvider");
        this.f = f;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final int b() {
        return this.e;
    }
    
    public final tt8 c() {
        return this.f;
    }
    
    public final String d() {
        return this.d;
    }
    
    public final String e() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof q9r$a) {
            final q9r$a q9r$a = (q9r$a)o;
            if (!this.a.equals(q9r$a.a()) || !this.b.equals(q9r$a.e()) || !this.c.equals(q9r$a.f()) || !this.d.equals(q9r$a.d()) || this.e != q9r$a.b() || !this.f.equals(q9r$a.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final String f() {
        return this.c;
    }
    
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("AppData{appIdentifier=");
        g.append(this.a);
        g.append(", versionCode=");
        g.append(this.b);
        g.append(", versionName=");
        g.append(this.c);
        g.append(", installUuid=");
        g.append(this.d);
        g.append(", deliveryMechanism=");
        g.append(this.e);
        g.append(", developmentPlatformProvider=");
        g.append(this.f);
        g.append("}");
        return g.toString();
    }
}
