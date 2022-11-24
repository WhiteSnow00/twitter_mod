import android.view.View;
import com.twitter.media.legacy.widget.FilterFilmstripView;
import com.twitter.media.ui.image.MediaImageView;
import java.util.Objects;
import com.twitter.media.ui.image.c;
import com.twitter.media.ui.image.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tza implements bsm$b
{
    public final int F0;
    public final b G0;
    
    public tza(final b g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void f(final csm csm) {
        switch (this.F0) {
            default: {
                final c c = (c)this.G0;
                final d9d d9d = (d9d)csm;
                final int f1 = com.twitter.media.ui.image.c.f1;
                Objects.requireNonNull(c);
                if (((csm)d9d).a()) {
                    c.m(d9d, false);
                }
                return;
            }
            case 0: {
                final MediaImageView mediaImageView = (MediaImageView)this.G0;
                final d9d d9d2 = (d9d)csm;
                final int q0 = FilterFilmstripView.Q0;
                ((View)mediaImageView).setAlpha(1.0f);
            }
        }
    }
}
