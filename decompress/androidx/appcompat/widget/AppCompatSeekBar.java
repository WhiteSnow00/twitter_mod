// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar
{
    public final ok0 D0;
    
    public AppCompatSeekBar(final Context context, final AttributeSet set) {
        super(context, set, 2130970554);
        hms.a((View)this, ((View)this).getContext());
        (this.D0 = new ok0((SeekBar)this)).a(set, 2130970554);
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final ok0 d0 = this.D0;
        final Drawable e = d0.e;
        if (e != null && e.isStateful() && e.setState(((View)d0.d).getDrawableState())) {
            ((View)d0.d).invalidateDrawable(e);
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable e = this.D0.e;
        if (e != null) {
            e.jumpToCurrentState();
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.D0.d(canvas);
        }
    }
}
