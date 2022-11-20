import java.io.IOException;
import java.util.Objects;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnp<T> implements tqd
{
    public final Set<T> b;
    
    public hnp(final Set<T> set) {
        this.b = qdd.g((Set)set);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hnp && c5j.a((Object)this.b, (Object)((hnp)o).b));
    }
    
    @Override
    public final int hashCode() {
        return c5j.e((Iterable)this.b);
    }
    
    public static final class a<T> extends y4j<hnp<T>>
    {
        public final Object d(final vlp vlp, int a) throws IOException, ClassNotFoundException {
            final yp4 yp4 = new yp4((rlp)lw6.j);
            Objects.requireNonNull(vlp);
            final Object a2 = ((y4j)yp4).a(vlp);
            a = c5j.a;
            return new hnp((Set<Object>)a2);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final Set<T> b = ((hnp)o).b;
            final yp4 yp4 = new yp4((rlp)lw6.j);
            Objects.requireNonNull(wlp);
            ((y4j)yp4).c(wlp, (Object)b);
            final int a = c5j.a;
        }
    }
}
