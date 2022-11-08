import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poz
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Object e;
    
    public poz(final String a, final String b, final String c, final long d, final Object e) {
        xd.q(a);
        xd.q(c);
        Objects.requireNonNull(e, "null reference");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
