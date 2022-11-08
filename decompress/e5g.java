import java.io.IOException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e5g implements xou
{
    public final f6j<Long, snj<vo6>> C0;
    public final f6j<Iterable<Long>, Map<Long, vo6>> D0;
    
    public e5g(final f6j<Long, snj<vo6>> c0, final f6j<Iterable<Long>, Map<Long, vo6>> d0, final ibm ibm) {
        this.C0 = c0;
        this.D0 = d0;
        ibm.i((rj)new xak((Object)this, 23));
    }
    
    public final void close() throws IOException {
        this.C0.close();
        this.D0.close();
    }
    
    public final b5j<Map<Long, vo6>> o2(final Iterable<Long> iterable) {
        return this.D0.v(iterable);
    }
    
    public final b5j<snj<vo6>> y2(final long n) {
        return this.C0.v(n);
    }
}
