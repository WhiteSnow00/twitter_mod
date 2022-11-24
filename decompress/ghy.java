import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghy extends yjy
{
    public boolean F0;
    public final Object G0;
    
    public ghy(final Object g0) {
        this.G0 = g0;
    }
    
    public final boolean hasNext() {
        return !this.F0;
    }
    
    public final Object next() {
        if (!this.F0) {
            this.F0 = true;
            return this.G0;
        }
        throw new NoSuchElementException();
    }
}
