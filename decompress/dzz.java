import java.util.List;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzz extends lcy
{
    public final Callable F0;
    
    public dzz(final Callable f0) {
        super("internal.appMetadata");
        this.F0 = f0;
    }
    
    public final pey a(final z6z z6z, final List list) {
        try {
            return kez.b(this.F0.call());
        }
        catch (final Exception ex) {
            return (pey)pey.v0;
        }
    }
}
