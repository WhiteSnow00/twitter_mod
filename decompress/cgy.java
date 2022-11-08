import java.util.Iterator;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cgy<E> extends bfy<E> implements Set<E>
{
    @NullableDecl
    public transient jey<E> D0;
    
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
    
    public final boolean equals(@NullableDecl final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof cgy && this.n() && ((cgy)o).n() && this.hashCode() != o.hashCode()) {
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
    
    public boolean n() {
        return this instanceof zgy;
    }
}
