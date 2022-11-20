import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oay implements Iterator
{
    public final Iterator D0;
    public final Iterator E0;
    
    public oay(final Iterator d0, final Iterator e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.D0.hasNext() || this.E0.hasNext();
    }
    
    @Override
    public final /* bridge */ Object next() {
        bgy bgy;
        if (this.D0.hasNext()) {
            bgy = new bgy(this.D0.next().toString());
        }
        else {
            if (!this.E0.hasNext()) {
                throw new NoSuchElementException();
            }
            bgy = new bgy(this.E0.next());
        }
        return bgy;
    }
}
