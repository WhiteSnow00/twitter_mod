import java.io.Closeable;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlw implements uaq<tmi, List<String>>
{
    public final adw D0;
    public final uaq<ilw$b, msm<jlw, kbv>> E0;
    
    public hlw(final adw d0, final uaq<ilw$b, msm<jlw, kbv>> e0, final xbm xbm) {
        this.D0 = d0;
        this.E0 = e0;
        xbm.i((oj)new qt1((Object)this, 22));
    }
    
    public final sog E(final qsb qsb) {
        return gw8.c((uaq)this, qsb);
    }
    
    public final /* bridge */ eaq R(final Object o) {
        return this.a((tmi)o);
    }
    
    public final eaq<List<String>> a(final tmi tmi) {
        return (eaq<List<String>>)this.E0.R((Object)new ilw$b(this.D0.getUser().c())).w((psb)bm3.Y0);
    }
    
    public final void close() {
        h1e.a((Closeable)this.E0);
    }
    
    public final sog m1(final r8x r8x) {
        return gw8.d((uaq)this, r8x);
    }
    
    public final uaq n(final p4s p4s) {
        return gw8.l((uaq)this, p4s);
    }
    
    public final uaq o(final qsb qsb) {
        return gw8.h((uaq)this, qsb);
    }
    
    public final l6j x0(final l6j l6j, final vw0 vw0) {
        return gw8.i((uaq)this, l6j, vw0);
    }
}
