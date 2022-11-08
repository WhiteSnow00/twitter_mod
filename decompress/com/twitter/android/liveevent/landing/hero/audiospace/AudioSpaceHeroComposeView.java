// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.audiospace;

import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/android/liveevent/landing/hero/audiospace/AudioSpaceHeroComposeView;", "Lp9v;", "feature.tfa.liveevent.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AudioSpaceHeroComposeView extends p9v
{
    public AudioSpaceHeroComposeView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final void j(final m76 m76, final int n) {
        final m76 h = m76.h(363112484);
        if ((n & 0x1) == 0x0 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            r11.i(null, null, null, null, h, 0, 15);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new AudioSpaceHeroComposeView$a(this, n));
        }
    }
}
