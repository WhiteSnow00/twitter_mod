import java.util.concurrent.Callable;
import java.util.List;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzz extends lcy
{
    public final ghz F0;
    public final HashMap G0;
    
    public yzz(final ghz f0) {
        super("require");
        this.G0 = new HashMap();
        this.F0 = f0;
    }
    
    public final pey a(final z6z z6z, List j) {
        waz.h("require", 1, (List)j);
        j = z6z.d((pey)((List)j).get(0)).j();
        if (this.G0.containsKey(j)) {
            return (pey)this.G0.get(j);
        }
        final ghz f0 = this.F0;
        Object v0 = null;
        Label_0113: {
            if (f0.a.containsKey(j)) {
                final Callable callable = f0.a.get(j);
                try {
                    v0 = callable.call();
                    break Label_0113;
                }
                catch (final Exception ex) {
                    throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(j)));
                }
            }
            v0 = pey.v0;
        }
        if (v0 instanceof lcy) {
            this.G0.put(j, v0);
        }
        return (pey)v0;
    }
}
