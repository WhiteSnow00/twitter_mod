// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.gallery.chrome;

import android.view.View;
import java.util.List;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;

public class GalleryVideoChromeView extends ConstraintLayout
{
    public d94 V0;
    
    public GalleryVideoChromeView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        ((View)this).setWillNotDraw(false);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final rif h = rif.H();
        h.p((Object)new dy0((ViewGroup)this));
        h.p((Object)new e93((ViewGroup)this));
        h.p((Object)new txw((ViewGroup)this));
        this.V0 = new d94((List)((n4j)h).e());
    }
}
