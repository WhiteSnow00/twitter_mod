import java.util.Iterator;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyf implements rj
{
    public final wts C0;
    public final syf D0;
    public final iyf E0;
    public final UserIdentifier F0;
    public qof G0;
    
    public dyf(final wts c0, final syf d0, final iyf e0, final UserIdentifier f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void run() {
        if (this.G0 != null) {
            Objects.requireNonNull(this.E0);
            if (dta.b().b("live_event_timeline_cache_eviction_enabled", true)) {
                final Iterator<kyf> iterator = this.G0.d.iterator();
                while (iterator.hasNext()) {
                    final String a = this.D0.a(iterator.next().a);
                    final aws$a aws$a = new aws$a();
                    aws$a.c = this.F0.getId();
                    aws$a.b = a;
                    aws$a.a = 11;
                    this.C0.d((aws)((h4j)aws$a).e(), (hn6)null);
                }
            }
        }
    }
}
