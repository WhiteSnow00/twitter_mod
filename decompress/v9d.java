import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v9d
{
    public static final a Companion;
    public static final v9d f;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    
    static {
        Companion = new a();
        f = new v9d();
    }
    
    public v9d() {
        Objects.requireNonNull(gre.Companion);
        Objects.requireNonNull(mre.Companion);
        Objects.requireNonNull(u9d.Companion);
        this.a = false;
        this.b = 0;
        this.c = true;
        this.d = 1;
        this.e = 1;
    }
    
    public v9d(final boolean a, final int b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v9d)) {
            return false;
        }
        final boolean a = this.a;
        final v9d v9d = (v9d)o;
        return a == v9d.a && this.b == v9d.b && this.c == v9d.c && this.d == v9d.d && this.e == v9d.e;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1231;
        int n2;
        if (a) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int b = this.b;
        if (!this.c) {
            n = 1237;
        }
        return (((n2 * 31 + b) * 31 + n) * 31 + this.d) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ImeOptions(singleLine=");
        g.append(this.a);
        g.append(", capitalization=");
        g.append((Object)gre.a(this.b));
        g.append(", autoCorrect=");
        g.append(this.c);
        g.append(", keyboardType=");
        g.append((Object)mre.a(this.d));
        g.append(", imeAction=");
        g.append((Object)u9d.a(this.e));
        g.append(')');
        return g.toString();
    }
    
    public static final class a
    {
    }
}
