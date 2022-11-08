import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Map;
import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xgy extends AbstractSet
{
    public final /* synthetic */ uiy C0;
    
    public xgy(final uiy c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void clear() {
        this.C0.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.C0.containsKey(o);
    }
    
    @Override
    public final Iterator iterator() {
        final uiy c0 = this.C0;
        final Map a = c0.a();
        Object iterator;
        if (a != null) {
            iterator = a.keySet().iterator();
        }
        else {
            iterator = new pfy(c0);
        }
        return (Iterator)iterator;
    }
    
    @Override
    public final boolean remove(@NullableDecl Object i) {
        final Map a = this.C0.a();
        boolean remove;
        if (a != null) {
            remove = a.keySet().remove(i);
        }
        else {
            i = this.C0.i(i);
            final Object l0 = uiy.L0;
            if (i != uiy.L0) {
                return true;
            }
            remove = false;
        }
        return remove;
    }
    
    @Override
    public final int size() {
        return this.C0.size();
    }
}
