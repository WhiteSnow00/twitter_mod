import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kde extends gfe implements Iterable<gfe>
{
    public final List<gfe> F0;
    
    public kde() {
        this.F0 = new ArrayList();
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof kde && ((kde)o).F0.equals(this.F0));
    }
    
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    public final Iterator<gfe> iterator() {
        return this.F0.iterator();
    }
}
