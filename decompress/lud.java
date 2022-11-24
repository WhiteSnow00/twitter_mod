// 
// Decompiled by Procyon v0.6.0
// 

public final class lud
{
    public static final a Companion;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        Companion = new a();
    }
    
    public lud(final int a, final int b, final int c, final int d) {
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
        if (!(o instanceof lud)) {
            return false;
        }
        final lud lud = (lud)o;
        return this.a == lud.a && this.b == lud.b && this.c == lud.c && this.d == lud.d;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("IntRect.fromLTRB(");
        f.append(this.a);
        f.append(", ");
        f.append(this.b);
        f.append(", ");
        f.append(this.c);
        f.append(", ");
        return gwl.x(f, this.d, ')');
    }
    
    public static final class a
    {
    }
}
