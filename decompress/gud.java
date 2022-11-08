// 
// Decompiled by Procyon v0.6.0
// 

public final class gud
{
    public static final a Companion;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        Companion = new a();
    }
    
    public gud(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gud)) {
            return false;
        }
        final gud gud = (gud)o;
        return this.a == gud.a && this.b == gud.b && this.c == gud.c && this.d == gud.d;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("IntRect.fromLTRB(");
        g.append(this.a);
        g.append(", ");
        g.append(this.b);
        g.append(", ");
        g.append(this.c);
        g.append(", ");
        return y70.y(g, this.d, ')');
    }
    
    public static final class a
    {
    }
}
