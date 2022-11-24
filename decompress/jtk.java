import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtk implements m1l<cj4<aj4>>
{
    public final m1l<cj4<aj4>> a;
    public final uhk b;
    public final Executor c;
    
    public jtk(final m1l<cj4<aj4>> a, final uhk b, final Executor c) {
        Objects.requireNonNull(a);
        this.a = a;
        this.b = b;
        Objects.requireNonNull(c);
        this.c = c;
    }
    
    @Override
    public final void a(final pk6<cj4<aj4>> pk6, final n1l n1l) {
        final r1l i = n1l.i();
        final itk o = n1l.l().o;
        final jtk.jtk$a jtk$a = new jtk.jtk$a(this, (pk6)pk6, i, o, n1l);
        Object o2;
        if (o instanceof wgm) {
            o2 = new jtk.jtk$b(this, jtk$a, (wgm)o, n1l);
        }
        else {
            o2 = new jtk.jtk$c(jtk$a);
        }
        this.a.a((pk6<cj4<aj4>>)o2, n1l);
    }
}
