import android.widget.SeekBar;
import com.twitter.media.ui.image.MediaImageView;
import com.twitter.media.legacy.widget.FilterFilmstripView$f;
import android.view.View;
import com.twitter.media.legacy.widget.FilterFilmstripView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vza implements View$OnClickListener
{
    public final FilterFilmstripView F0;
    public final int G0;
    
    public vza(final FilterFilmstripView f0, final int g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        final FilterFilmstripView f0 = this.F0;
        final int g0 = this.G0;
        final SeekBar a = ((FilterFilmstripView$f)((View)f0.I0.get(f0.N0)).getTag()).a;
        if (f0.N0 == g0 && ((View)a).getVisibility() == 8 && g0 != 0) {
            f0.d((View)a, true);
        }
        else if (((View)a).getVisibility() == 0) {
            f0.d((View)a, false);
        }
        else if (f0.N0 != g0) {
            f0.setSelectedFilter(g0);
            f0.b(true);
        }
    }
}
