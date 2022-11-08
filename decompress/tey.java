import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tey implements Iterator
{
    public int C0;
    public final /* synthetic */ mfy D0;
    
    public tey(final mfy d0) {
        this.D0 = d0;
        this.C0 = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.C0 < this.D0.C0.length();
    }
}
