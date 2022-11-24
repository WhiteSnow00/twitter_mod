import java.util.Objects;
import com.twitter.android.liveevent.landing.refresh.a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxf implements SwipeRefreshLayout$h
{
    public final a F0;
    
    public gxf(final a f0) {
        this.F0 = f0;
    }
    
    public final void a() {
        final a f0 = this.F0;
        f0.a.a();
        f0.c.a.l0();
        final com.twitter.android.liveevent.landing.scribe.a b = f0.b;
        final String f2 = f0.f;
        Objects.requireNonNull(b);
        b.o(dda.g("live_event_timeline", "", "", "", "pull_to_refresh"), (d1p)b.m(f2));
    }
}
