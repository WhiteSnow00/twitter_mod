import tv.periscope.android.event.ApiEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7n
{
    public final /* synthetic */ String a;
    public final /* synthetic */ vbq b;
    public final /* synthetic */ Error c;
    public final /* synthetic */ maa d;
    
    public g7n(final String a, final vbq b, final Error c, final maa d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onEventMainThread(final ApiEvent apiEvent) {
        zzd.f((Object)apiEvent, "apiEvent");
        if (zzd.a((Object)apiEvent.b, (Object)this.a)) {
            final Object d = apiEvent.d;
            if (d instanceof iu3) {
                Object o = d;
                if (!(d instanceof iu3)) {
                    o = null;
                }
                final iu3 iu3 = (iu3)o;
                Object o2 = apiEvent.e;
                if (iu3 != null) {
                    this.b.b((Object)iu3);
                }
                else {
                    final vbq b = this.b;
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
