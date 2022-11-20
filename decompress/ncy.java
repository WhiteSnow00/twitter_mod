import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncy extends pmy
{
    public final ley E0;
    
    public ncy(final ley e0, final Map map) {
        this.E0 = e0;
        super(map);
    }
    
    public final void clear() {
        final Iterator iterator = this.iterator();
        while (true) {
            final ecy ecy = (ecy)iterator;
            if (!ecy.hasNext()) {
                break;
            }
            ecy.next();
            ecy.remove();
        }
    }
    
    public final boolean containsAll(final Collection<?> collection) {
        return super.D0.keySet().containsAll(collection);
    }
    
    public final boolean equals(final Object o) {
        return this == o || super.D0.keySet().equals(o);
    }
    
    public final int hashCode() {
        return super.D0.keySet().hashCode();
    }
    
    public final Iterator iterator() {
        return (Iterator)new ecy(this, (Iterator)super.D0.entrySet().iterator());
    }
    
    public final boolean remove(final Object o) {
        final Collection collection = super.D0.remove(o);
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            final ley e0 = this.E0;
            e0.G0 -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }
}
