import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vdy implements Iterator
{
    public final Iterator F0;
    
    public vdy(final Iterator f0) {
        this.F0 = f0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.F0.hasNext();
    }
    
    @Override
    public final /* bridge */ Object next() {
        return new wgy(this.F0.next());
    }
}
