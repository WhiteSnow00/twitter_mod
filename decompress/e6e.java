import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e6e extends ozv<Object>
{
    public boolean C0;
    public final /* synthetic */ Object D0;
    
    public e6e(final Object d0) {
        this.D0 = d0;
    }
    
    public final boolean hasNext() {
        return this.C0 ^ true;
    }
    
    public final Object next() {
        if (!this.C0) {
            this.C0 = true;
            return this.D0;
        }
        throw new NoSuchElementException();
    }
}
