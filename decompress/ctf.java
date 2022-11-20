import android.app.Activity;
import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import android.os.Handler;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ctf
{
    public final LiveEventConfiguration a;
    public final h59 b;
    public final f3c c;
    public final t10 d;
    public final Handler e;
    
    public ctf(final LiveEventConfiguration a, final h59 b, final f3c c, final t10 d, final Handler e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean a(final oyw oyw) {
        final Activity w = this.d.w();
        final boolean hasValidEvent = this.a.hasValidEvent();
        if (w instanceof hea && this.a.hasValidEvent()) {
            final h59 b = this.b;
            oyw.i();
            final String eventId = this.a.eventId;
            b.a((f59)new xyf());
            return true;
        }
        if (hasValidEvent) {
            final LiveEventConfiguration a = this.a;
            Objects.requireNonNull(LiveEventConfiguration$a.Companion);
            czd.f((Object)a, "configuration");
            final LiveEventConfiguration$a liveEventConfiguration$a = new LiveEventConfiguration$a(a.eventId);
            liveEventConfiguration$a.b = a.tweet;
            liveEventConfiguration$a.c = a.timelineSourceId;
            liveEventConfiguration$a.d = a.timelineSourceType;
            liveEventConfiguration$a.e = a.shouldStartUnmuted;
            liveEventConfiguration$a.f = a.initialTimelineId;
            liveEventConfiguration$a.g = a.source;
            liveEventConfiguration$a.i = a.parentTweetPromotedContent;
            liveEventConfiguration$a.h = true;
            final evf evf = new evf((LiveEventConfiguration)((n4j)liveEventConfiguration$a).e());
            if (((ar0)this.d).e()) {
                this.c.a((ym)evf);
            }
            else {
                this.e.post((Runnable)new fg8((Object)this, (Object)evf, 2));
            }
            return true;
        }
        return false;
    }
}
