import java.io.IOException;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggv implements uaq<Long, hgv>
{
    public final UserIdentifier D0;
    public final trc E0;
    
    public ggv(final UserIdentifier d0) {
        this.D0 = d0;
        this.E0 = trc.c();
    }
    
    public final sog E(final qsb qsb) {
        return gw8.c((uaq)this, qsb);
    }
    
    public final eaq R(final Object o) {
        final Long n = (Long)o;
        final trc e0 = this.E0;
        final UserIdentifier d0 = this.D0;
        final qjg$a qjg$a = new qjg$a(2);
        ((qjg)qjg$a).w((Object)"skip_status", (Object)"true");
        ((qjg)qjg$a).w((Object)"user_id", (Object)Long.toString(n));
        ((qjg)qjg$a).w((Object)"with_total_count", (Object)"true");
        return (eaq)new fcq((lcq)e0.b((orc)new mew(d0, (Map)((n4j)qjg$a).e())).w((psb)arf.M0), (psb)nt8.W0, (Object)null);
    }
    
    public final void close() throws IOException {
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
