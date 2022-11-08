// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero;

public final class d extends y7q<qtf>
{
    public a a;
    
    public final boolean a(final x59 x59) {
        zzd.f((Object)x59, "event");
        return x59 instanceof qtf;
    }
    
    public final void c(final x59 x59, final y49 y49) {
        final qtf qtf = (qtf)x59;
        zzd.f((Object)qtf, "event");
        zzd.f((Object)y49, "dock");
        final a a = this.a;
        if (a != null) {
            final String a2 = qtf.a.a;
            zzd.e((Object)a2, "event.carouselItem.id");
            ((com.twitter.android.liveevent.landing.hero.a)a).a(a2);
        }
    }
    
    public interface a
    {
    }
}
