import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c12 implements m1l<cj4<aj4>>
{
    public final m1l<cj4<aj4>> a;
    public final int b;
    public final int c;
    public final boolean d;
    
    public c12(final m1l<cj4<aj4>> a, final int b, final int c, final boolean d) {
        xd.D(b <= c);
        Objects.requireNonNull(a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final pk6<cj4<aj4>> pk6, final n1l n1l) {
        if (n1l.n() && !this.d) {
            this.a.a(pk6, n1l);
        }
        else {
            this.a.a((pk6<cj4<aj4>>)new c12.c12$a((pk6)pk6, this.b, this.c), n1l);
        }
    }
}
