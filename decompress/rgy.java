import java.util.Iterator;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rgy<E> extends qfy<E> implements Set<E>
{
    public static final int F0 = 0;
    @NullableDecl
    public transient yey<E> E0;
    
    public static int m(int n) {
        final int max = Math.max(n, 2);
        n = 1;
        if (max < 751619276) {
            for (n = Integer.highestOneBit(max - 1) << 1; n * 0.7 < max; n <<= 1) {}
            return n;
        }
        if (max >= 1073741824) {
            n = 0;
        }
        if (n != 0) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof rgy && this.n() && ((rgy)o).n() && this.hashCode() != o.hashCode()) {
            return false;
        }
        if (this == o) {
            return b;
        }
        while (true) {
            if (!(o instanceof Set)) {
                break Label_0096;
            }
            final Set set = (Set)o;
            try {
                if (this.size() != set.size() || !this.containsAll(set)) {
                    b = false;
                }
                return b;
            }
            catch (final NullPointerException | ClassCastException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public int hashCode() {
        final Iterator<E> iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final E next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n = ~(~(n + hashCode));
        }
        return n;
    }
    
    @Override
    public Iterator iterator() {
        return this.g();
    }
    
    public boolean n() {
        return this instanceof phy;
    }
}
