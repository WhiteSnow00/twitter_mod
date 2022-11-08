// 
// Decompiled by Procyon v0.6.0
// 

public final class vrf
{
    public final int a(final xqf xqf) {
        final int y = xqf.y;
        if (dta.b().b("live_event_card_vod_enabled", false) && y != 1 && y != -1) {
            return y;
        }
        if (xqf.f() && !dta.b().b("live_event_thumbnail_only_card_enabled", false)) {
            return 1;
        }
        return 0;
    }
}
