// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import com.twitter.media.ui.image.AspectRatioFrameLayout;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.content.Context;
import com.twitter.media.ui.image.MediaImageView;
import com.twitter.media.ui.image.b$b;

public final class d
{
    public static void a(final rfr sticker, final d.d$b d$b) {
        if (sticker == null) {
            return;
        }
        final MediaImageView w0 = d$b.W0;
        if (w0 instanceof sfr) {
            ((sfr)w0).setSticker(sticker);
        }
        final MediaImageView w2 = d$b.W0;
        final t8d$a g = t8d.g(sticker.K0.b.b);
        g.u = "stickers";
        g.k = (z5w)new kgr(sticker.K0);
        ((com.twitter.media.ui.image.d)w2).q(g, false);
        ((com.twitter.media.ui.image.d)d$b.W0).setOnImageLoadedListener((b$b)new k71((Object)d$b, (Object)sticker));
    }
    
    public static d.d$b b(final Context context, final tqm tqm) {
        final sfr sfr = new sfr(context);
        ((AspectRatioFrameLayout)sfr).setAspectRatio(1.0f);
        ((com.twitter.media.ui.image.d)sfr).setDefaultDrawable(tqm.j(2131233244));
        return new d.d$b((MediaImageView)sfr);
    }
    
    public abstract static class a extends RecyclerView$c0
    {
        public a(final View view) {
            super(view);
        }
    }
}
