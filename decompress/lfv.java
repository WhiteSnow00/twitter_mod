import java.io.IOException;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfv implements daq<Long, mfv>
{
    public final UserIdentifier C0;
    public final psc D0;
    
    public lfv(final UserIdentifier c0) {
        this.C0 = c0;
        this.D0 = psc.c();
    }
    
    public final n9q S(final Object o) {
        final Long n = (Long)o;
        final psc d0 = this.D0;
        final UserIdentifier c0 = this.C0;
        final sjg$a sjg$a = new sjg$a(2);
        ((sjg)sjg$a).w((Object)"skip_status", (Object)"true");
        ((sjg)sjg$a).w((Object)"user_id", (Object)Long.toString(n));
        ((sjg)sjg$a).w((Object)"with_total_count", (Object)"true");
        return (n9q)new obq((ubq)d0.b((ksc)new zdw(c0, (Map)((h4j)sjg$a).e())).w((qtb)sut.S0), (qtb)ckc.N0, (Object)null);
    }
    
    public final void close() throws IOException {
    }
}
