import tv.periscope.android.api.UploadBroadcasterLogsResponse;
import tv.periscope.android.event.ApiEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omn
{
    public final String a;
    public final jdq b;
    public final Error c;
    public final aba d;
    
    public omn(final String a, final jdq b, final Error c, final aba d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onEventMainThread(final ApiEvent apiEvent) {
        e0e.f((Object)apiEvent, "apiEvent");
        if (e0e.a((Object)apiEvent.b, (Object)this.a)) {
            final Object d = apiEvent.d;
            if (d == null || d instanceof UploadBroadcasterLogsResponse) {
                Object o = d;
                if (!(d instanceof UploadBroadcasterLogsResponse)) {
                    o = null;
                }
                final UploadBroadcasterLogsResponse uploadBroadcasterLogsResponse = (UploadBroadcasterLogsResponse)o;
                Object o2 = apiEvent.e;
                if (uploadBroadcasterLogsResponse != null) {
                    this.b.b((Object)uploadBroadcasterLogsResponse);
                }
                else {
                    final jdq b = this.b;
                    if (o2 == null) {
                        o2 = this.c;
                    }
                    b.onError((Throwable)o2);
                }
            }
            this.d.k((Object)this);
        }
    }
}
