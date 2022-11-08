import java.util.Map;
import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class piy extends AbstractCollection
{
    public final /* synthetic */ uiy C0;
    
    public piy(final uiy c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void clear() {
        this.C0.clear();
    }
    
    @Override
    public final Iterator iterator() {
        final uiy c0 = this.C0;
        final Map a = c0.a();
        Object iterator;
        if (a != null) {
            iterator = a.values().iterator();
        }
        else {
            iterator = new zfy(c0);
        }
        return (Iterator)iterator;
    }
    
    @Override
    public final int size() {
        return this.C0.size();
    }
}
