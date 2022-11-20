import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.content.Context;
import java.util.Objects;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwu extends nk8 implements wrk
{
    public static final a Companion;
    public final View E0;
    public final l2h F0;
    public int G0;
    public final n4s H0;
    public final n4s I0;
    public final TypefacesTextView J0;
    public final ConstraintLayout K0;
    
    static {
        Companion = new a();
    }
    
    public pwu(final View e0) {
        super(e0);
        this.E0 = e0;
        this.F0 = new l2h();
        this.G0 = -1;
        this.H0 = (n4s)pps.n((nsb)new nsb<VideoContainerHost>(this) {
            public final pwu D0;
            
            public final Object invoke() {
                Object o = this.D0.E0.findViewById(2131430612);
                if (o != null) {
                    final pwu d0 = this.D0;
                    final l2h f0 = d0.F0;
                    final Context context = d0.E0.getContext();
                    czd.e((Object)context, "itemView.context");
                    final float n = context.getResources().getDisplayMetrics().density * 8.0f;
                    final plo a = ijg.a(n, n, n, n);
                    Objects.requireNonNull(f0);
                    new k2h(a).a((View)o);
                }
                else {
                    o = null;
                }
                return o;
            }
        });
        this.I0 = (n4s)pps.n((nsb)new nsb<FrescoMediaImageView>(this) {
            public final pwu D0;
            
            public final Object invoke() {
                FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)this.D0.E0.findViewById(2131432022);
                if (frescoMediaImageView != null) {
                    frescoMediaImageView.setOverlayDrawable(2131232774);
                }
                else {
                    frescoMediaImageView = null;
                }
                return frescoMediaImageView;
            }
        });
        this.J0 = (TypefacesTextView)e0.findViewById(2131432581);
        this.K0 = (ConstraintLayout)e0.findViewById(2131432582);
    }
    
    public final void l(final int g0) {
        this.G0 = g0;
    }
    
    public final VideoContainerHost l0() {
        return (VideoContainerHost)this.H0.getValue();
    }
    
    public static final class a
    {
    }
}
