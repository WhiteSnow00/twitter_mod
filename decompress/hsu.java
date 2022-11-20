import android.widget.CompoundButton;
import java.util.Objects;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.twitter.ui.widget.touchintercept.TouchInterceptingConstraintLayout;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.twitter.tweetview.core.TweetView;
import android.widget.CheckBox;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsu implements ilx<isu, Object, nru>, mx9<nru>
{
    public final View D0;
    public final oru E0;
    public final CheckBox F0;
    public final TweetView G0;
    public final nnl<Object> H0;
    
    public hsu(final View d0, final oru e0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)e0, "effectHandler");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (CheckBox)d0.findViewById(2131429681);
        this.G0 = (TweetView)d0.findViewById(2131432252);
        this.H0 = (nnl<Object>)new nnl();
        final d1c d1c = new d1c(d0.getContext(), (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener(this) {
            public final hsu D0;
            
            public final boolean onSingleTapUp(final MotionEvent motionEvent) {
                czd.f((Object)motionEvent, "e");
                this.D0.H0.onNext((Object)rru.a);
                return true;
            }
        });
        TouchInterceptingConstraintLayout touchInterceptingConstraintLayout;
        if (d0 instanceof TouchInterceptingConstraintLayout) {
            touchInterceptingConstraintLayout = (TouchInterceptingConstraintLayout)d0;
        }
        else {
            touchInterceptingConstraintLayout = null;
        }
        if (touchInterceptingConstraintLayout != null) {
            touchInterceptingConstraintLayout.z((hut)new hut(d1c) {
                public final d1c D0;
                
                public final boolean v(final ViewGroup viewGroup, final MotionEvent motionEvent) {
                    czd.f((Object)viewGroup, "viewGroup");
                    czd.f((Object)motionEvent, "event");
                    this.D0.a(motionEvent);
                    return true;
                }
                
                public final boolean w(final ViewGroup viewGroup, final MotionEvent motionEvent) {
                    czd.f((Object)viewGroup, "viewGroup");
                    czd.f((Object)motionEvent, "event");
                    return true;
                }
            });
        }
    }
    
    public static final boolean a(final hsu hsu, final KeyEvent keyEvent) {
        Objects.requireNonNull(hsu);
        return keyEvent.getKeyCode() == 62 && keyEvent.getAction() == 0;
    }
    
    public final void T(final jbx jbx) {
        final isu isu = (isu)jbx;
        czd.f((Object)isu, "state");
        this.D0.setEnabled(isu.b);
        ((View)this.F0).setEnabled(isu.b);
        ((CompoundButton)this.F0).setChecked(isu.a);
        ((View)this.G0).setAlpha(((Number)isu.g.getValue()).floatValue());
        final View d0 = this.D0;
        d0.setBackgroundColor(kn6.b(d0.getContext(), ((Number)isu.i.getValue()).intValue()));
    }
    
    public final void q(final Object o) {
        final nru nru = (nru)o;
        czd.f((Object)nru, "effect");
        final oru e0 = this.E0;
        Objects.requireNonNull(e0);
        if (nru instanceof nru$a) {
            e0.D0.a(((nru$a)nru).a);
        }
    }
    
    public final h5j<Object> w() {
        final nnl<Object> h0 = this.H0;
        final View d0 = this.D0;
        final hsu$d hsu$d = new hsu$d(this);
        czd.g((Object)d0, "$this$keys");
        final h5j merge = h5j.merge((taj)h0, (taj)((h5j)new h8x(d0, (qsb)hsu$d)).filter((ytk)new ht1((qsb)new hsu$e(this), 16)).map((psb)new hvl((qsb)hsu$f.D0, 4)));
        czd.e((Object)merge, "override fun userIntentO\u2026tionIntent.Select }\n    )");
        return (h5j<Object>)merge;
    }
    
    public interface b
    {
        hsu a(final View p0);
    }
}
