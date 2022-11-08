import java.io.IOException;
import java.io.Closeable;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u83<A, T> implements daq<A, T>
{
    public static final u83.u83$a Companion;
    public final daq<A, T> C0;
    public final seg<A, n9q<T>> D0;
    
    static {
        Companion = new u83.u83$a();
    }
    
    public u83(final daq<A, T> daq) {
        zzd.f((Object)daq, "dataSource");
        this(daq, 0, 2, null);
    }
    
    public u83(final daq c0, final int n, final int n2, final hg8 hg8) {
        zzd.f((Object)c0, "dataSource");
        this.C0 = (daq<A, T>)c0;
        this.D0 = (seg<A, n9q<T>>)new seg(1);
    }
    
    public final n9q<T> S(final A a) {
        Object o;
        if ((o = this.D0.c((Object)a)) == null) {
            final n9q s = this.C0.S((Object)a);
            Objects.requireNonNull(s);
            o = new q9q((ubq)s);
            this.D0.d((Object)a, o);
        }
        return (n9q<T>)o;
    }
    
    public final void close() throws IOException {
        this.D0.i(-1);
        e2e.Companion.b((Closeable)this.C0);
    }
}
