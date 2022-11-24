import java.util.ListIterator;
import java.util.Objects;
import java.util.List;
import java.io.Serializable;
import java.util.AbstractSequentialList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tmy<F, T> extends AbstractSequentialList<T> implements Serializable
{
    public final List<F> F0;
    public final f000<? super F, ? extends T> G0;
    
    public tmy(final List<F> f0, final f000<? super F, ? extends T> g0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void clear() {
        this.F0.clear();
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        return new pmy(this, this.F0.listIterator(n));
    }
    
    @Override
    public final int size() {
        return this.F0.size();
    }
}
