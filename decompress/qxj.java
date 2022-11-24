import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qxj extends zo1
{
    public final AtomicBoolean a;
    
    public qxj(final AtomicBoolean a) {
        this.a = a;
    }
    
    public final void b() {
        this.a.set(true);
    }
}
