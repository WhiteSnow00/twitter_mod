import com.twitter.model.liveevent.LiveEventConfiguration;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrf extends fk3
{
    public final axf k;
    public final String l;
    
    public lrf(final Context context, final LiveEventConfiguration liveEventConfiguration, final jev jev, final axf k) {
        zzd.f((Object)context, "appContext");
        zzd.f((Object)liveEventConfiguration, "liveEventConfiguration");
        zzd.f((Object)k, "liveEventReminderCache");
        super(context, jev);
        this.k = k;
        this.l = liveEventConfiguration.eventId;
    }
    
    public final void x(final zf4 zf4) {
        final lev lev = (lev)zf4.p();
        if (lev != null) {
            if (lev.h0 == null) {
                final sxf$a sxf$a = new sxf$a();
                final String l = this.l;
                sxf$a.c = l;
                final jxf d = this.k.d(l);
                if (d != null) {
                    sxf$a.f = d.c;
                    sxf$a.e = d.b;
                    sxf$a.d = d.a;
                }
                lev.h0 = (sxf)((h4j)sxf$a).e();
            }
        }
        this.y((okm)zf4);
    }
}
