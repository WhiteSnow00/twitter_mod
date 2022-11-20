import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdz implements Callable
{
    public final String D0;
    
    public qdz(final String d0) {
        this.D0 = d0;
    }
    
    @Override
    public final Object call() {
        return u9f.c.a(this.D0);
    }
}
