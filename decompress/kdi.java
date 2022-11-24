import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdi implements tca
{
    public final mdi F0;
    
    public kdi(final mdi f0) {
        this.F0 = f0;
    }
    
    public final void onEvent(final Object o) {
        final mdi f0 = this.F0;
        final spx spx = (spx)o;
        Objects.requireNonNull(f0);
        final boolean a = spx.a;
        synchronized (f0) {
            f0.h = a;
            f0.h(f0.d());
        }
    }
}
