// 
// Decompiled by Procyon v0.6.0
// 

public final class jtd
{
    public static final a Companion;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        Companion = new a();
    }
    
    public jtd(final int a, final int b, final int c, final int d) {
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
        if (!(o instanceof jtd)) {
            return false;
        }
        final jtd jtd = (jtd)o;
        return this.a == jtd.a && this.b == jtd.b && this.c == jtd.c && this.d == jtd.d;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("IntRect.fromLTRB(");
        j.append(this.a);
        j.append(", ");
        j.append(this.b);
        j.append(", ");
        j.append(this.c);
        j.append(", ");
        return x70.C(j, this.d, ')');
    }
    
    public static final class a
    {
    }
}
