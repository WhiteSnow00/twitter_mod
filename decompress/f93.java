import java.io.IOException;
import java.io.Closeable;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f93<A, T> implements rbq<A, T>
{
    public static final f93.f93$a Companion;
    public final rbq<A, T> F0;
    public final cfg<A, bbq<T>> G0;
    
    static {
        Companion = new f93.f93$a();
    }
    
    public f93(final rbq<A, T> rbq) {
        e0e.f((Object)rbq, "dataSource");
        this(rbq, 0, 2, null);
    }
    
    public f93(final rbq f0, final int n, final int n2, final wg8 wg8) {
        e0e.f((Object)f0, "dataSource");
        this.F0 = f0;
        this.G0 = new cfg<A, bbq<T>>(1);
    }
    
    @Override
    public final mpg F(final stb stb) {
        return qee.e((rbq)this, stb);
    }
    
    @Override
    public final bbq<T> S(final A a) {
        Object o;
        if ((o = this.G0.c(a)) == null) {
            final bbq<T> s = this.F0.S(a);
            Objects.requireNonNull(s);
            o = new ebq((idq)s);
            this.G0.d(a, (bbq<T>)o);
        }
        return (bbq<T>)o;
    }
    
    public final void close() throws IOException {
        this.G0.i(-1);
        j2e.Companion.b((Closeable)this.F0);
    }
    
    @Override
    public final mpg n1(final k9x k9x) {
        return qee.h((rbq)this, k9x);
    }
    
    @Override
    public final rbq o(final j5s j5s) {
        return qee.p((rbq)this, j5s);
    }
    
    @Override
    public final rbq p(final stb stb) {
        return qee.m((rbq)this, stb);
    }
    
    @Override
    public final x6j y0(final x6j x6j, final bx0 bx0) {
        return qee.n((rbq)this, x6j, bx0);
    }
}
