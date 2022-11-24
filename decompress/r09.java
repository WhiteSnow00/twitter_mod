import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r09 extends zo1
{
    public final AtomicBoolean a;
    
    public r09(final AtomicBoolean a) {
        this.a = a;
    }
    
    public final void b() {
        this.a.set(true);
    }
}
