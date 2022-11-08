import java.util.Objects;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxh implements Closeable
{
    public final bxh C0;
    public final mz8 D0;
    public final flv<String, lz8> E0;
    public n9q<vrm<i4e<jwh>, twh>> F0;
    
    public mxh(final bxh c0, final mz8 d0, final flv<String, lz8> e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final n9q<vrm<i4e<jwh>, twh>> a(final String[] array) {
        return (n9q<vrm<i4e<jwh>, twh>>)(this.F0 = new q9q((ubq)((omm)this.C0).S((Object)new cxh(2, (jwh)null, (Long)null, array))));
    }
    
    @Override
    public final void close() {
        this.F0 = null;
        Objects.requireNonNull(this.C0);
    }
}
