import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wmb implements x7d
{
    public final List<x7d> a;
    
    public wmb(final x7d... array) {
        Collections.addAll(this.a = new ArrayList(array.length), array);
    }
    
    public final void a(final String s, final int n, final boolean b, final String s2) {
        synchronized (this) {
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                final x7d x7d = this.a.get(i);
                if (x7d != null) {
                    try {
                        x7d.a(s, n, b, s2);
                    }
                    catch (final Exception ex) {
                        dli.q("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable)ex);
                    }
                }
            }
        }
    }
}
