// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import com.twitter.media.ui.image.AspectRatioFrameLayout;
import android.content.Context;
import com.twitter.media.ui.image.MediaImageView;
import com.twitter.media.ui.image.b$b;

public final class d
{
    public static void a(final mgr sticker, final d.d$b d$b) {
        if (sticker == null) {
            return;
        }
        final MediaImageView x0 = d$b.X0;
        if (x0 instanceof ngr) {
            ((ngr)x0).setSticker(sticker);
        }
        final MediaImageView x2 = d$b.X0;
        final x7d$a g = x7d.g(sticker.L0.b.b);
        g.u = "stickers";
        g.k = (k6w)new ehr(sticker.L0);
        ((com.twitter.media.ui.image.d)x2).q(g, false);
        ((com.twitter.media.ui.image.d)d$b.X0).setOnImageLoadedListener((b$b)new d71((Object)d$b, (Object)sticker, 4));
    }
    
    public static d.d$b b(final Context context, final krm krm) {
        final ngr ngr = new ngr(context);
        ((AspectRatioFrameLayout)ngr).setAspectRatio(1.0f);
        ((com.twitter.media.ui.image.d)ngr).setDefaultDrawable(krm.j(2131233246));
        return new d.d$b((MediaImageView)ngr);
    }
}
