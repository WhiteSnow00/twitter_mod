import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ify implements Iterator
{
    public int D0;
    public final bgy E0;
    
    public ify(final bgy e0) {
        this.E0 = e0;
        this.D0 = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.D0 < this.E0.D0.length();
    }
    
    @Override
    public final /* bridge */ Object next() {
        final int d0 = this.D0;
        if (d0 < this.E0.D0.length()) {
            this.D0 = d0 + 1;
            return new bgy(String.valueOf(d0));
        }
        throw new NoSuchElementException();
    }
}
