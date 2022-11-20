import android.widget.SeekBar;
import com.twitter.media.ui.image.MediaImageView;
import com.twitter.media.legacy.widget.FilterFilmstripView$f;
import android.view.View;
import com.twitter.media.legacy.widget.FilterFilmstripView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sya implements View$OnClickListener
{
    public final FilterFilmstripView D0;
    public final int E0;
    
    public sya(final FilterFilmstripView d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        final FilterFilmstripView d0 = this.D0;
        final int e0 = this.E0;
        final SeekBar a = ((FilterFilmstripView$f)((View)d0.G0.get(d0.L0)).getTag()).a;
        if (d0.L0 == e0 && ((View)a).getVisibility() == 8 && e0 != 0) {
            d0.d((View)a, true);
        }
        else if (((View)a).getVisibility() == 0) {
            d0.d((View)a, false);
        }
        else if (d0.L0 != e0) {
            d0.setSelectedFilter(e0);
            d0.b(true);
        }
    }
}
