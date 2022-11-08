import java.util.AbstractSet;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xmp
{
    public static boolean a(final Set<?> set, final Object o) {
        boolean b = true;
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                b = false;
            }
            return b;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public static <E> Set<E> b(final Set<E> set, final ntk<? super E> ntk) {
        if (set instanceof SortedSet) {
            final SortedSet set2 = (SortedSet)set;
            xmp.xmp$c xmp$c;
            if (set2 instanceof xmp.xmp$b) {
                final xmp.xmp$b xmp$b = (xmp.xmp$b)set2;
                xmp$c = new xmp.xmp$c((SortedSet)((jr4)xmp$b).C0, rtk.a((ntk)((jr4)xmp$b).D0, (ntk)ntk));
            }
            else {
                Objects.requireNonNull(set2);
                xmp$c = new xmp.xmp$c(set2, (ntk)ntk);
            }
            return (Set<E>)xmp$c;
        }
        if (set instanceof xmp.xmp$b) {
            final xmp.xmp$b xmp$b2 = (xmp.xmp$b)set;
            return (Set<E>)new xmp.xmp$b((Set)((jr4)xmp$b2).C0, rtk.a((ntk)((jr4)xmp$b2).D0, (ntk)ntk));
        }
        Objects.requireNonNull((Object)set);
        return (Set<E>)new xmp.xmp$b((Set)set, (ntk)ntk);
    }
    
    public static int c(final Set<?> set) {
        final Iterator<?> iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
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
    
    public static <E> e<E> d(final Set<E> set, final Set<?> set2) {
        j78.f(set, "set1");
        j78.f(set2, "set2");
        return (e<E>)new xmp$a((Set)set, (Set)set2);
    }
    
    public static <E> Set<E> e() {
        return Collections.newSetFromMap(new IdentityHashMap<E, Boolean>());
    }
    
    public abstract static class d<E> extends AbstractSet<E>
    {
        @Override
        public boolean removeAll(final Collection<?> collection) {
            Objects.requireNonNull(collection);
            Collection<?> a2 = collection;
            if (collection instanceof ith) {
                a2 = ((ith)collection).a2();
            }
            final boolean b = a2 instanceof Set;
            final int n = 0;
            boolean b2 = false;
            int n2;
            if (b && a2.size() > this.size()) {
                final Iterator<E> iterator = this.iterator();
                while (true) {
                    n2 = (b2 ? 1 : 0);
                    if (!iterator.hasNext()) {
                        break;
                    }
                    if (!a2.contains(iterator.next())) {
                        continue;
                    }
                    iterator.remove();
                    b2 = true;
                }
            }
            else {
                final Iterator iterator2 = a2.iterator();
                boolean b3 = n != 0;
                while (true) {
                    n2 = (b3 ? 1 : 0);
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    b3 |= this.remove(iterator2.next());
                }
            }
            return n2 != 0;
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        }
    }
    
    public abstract static class e<E> extends AbstractSet<E>
    {
        @Deprecated
        @Override
        public final boolean add(final E e) {
            throw new UnsupportedOperationException();
        }
        
        @Deprecated
        @Override
        public final boolean addAll(final Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Deprecated
        @Override
        public final void clear() {
            throw new UnsupportedOperationException();
        }
        
        @Deprecated
        @Override
        public final boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Deprecated
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Deprecated
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }
}
