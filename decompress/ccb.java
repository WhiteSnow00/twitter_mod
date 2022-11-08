import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccb extends dcb<Object>
{
    public final /* synthetic */ Iterable[] C0;
    
    public ccb(final Iterable[] c0) {
        this.C0 = c0;
    }
    
    public final Iterator<Object> iterator() {
        return new f6e.b<Object>((Iterator<? extends Iterator<?>>)new ccb$a(this, this.C0.length));
    }
}
