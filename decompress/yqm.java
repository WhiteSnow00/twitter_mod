import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqm implements m1l<l4a>
{
    public final Executor a;
    public final grk b;
    public final m1l<l4a> c;
    public final boolean d;
    public final l9d e;
    
    public yqm(final Executor a, final grk b, final m1l<l4a> c, final boolean d, final l9d e) {
        Objects.requireNonNull(a);
        this.a = a;
        Objects.requireNonNull(b);
        this.b = b;
        this.c = c;
        Objects.requireNonNull(e);
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        this.c.a((pk6<l4a>)new yqm.yqm$a(this, (pk6)pk6, n1l, this.d, this.e), n1l);
    }
}
