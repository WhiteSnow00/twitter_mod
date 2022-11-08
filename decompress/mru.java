import android.widget.CompoundButton;
import java.util.Objects;
import android.view.KeyEvent;
import com.twitter.ui.widget.touchintercept.TouchInterceptingConstraintLayout;
import android.view.GestureDetector$OnGestureListener;
import com.twitter.tweetview.core.TweetView;
import android.widget.CheckBox;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mru implements okx<nru, Object, squ>, ay9<squ>
{
    public final View C0;
    public final /* synthetic */ tqu D0;
    public final CheckBox E0;
    public final TweetView F0;
    public final zml<Object> G0;
    
    public mru(final View c0, final tqu d0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)d0, "effectHandler");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = (CheckBox)c0.findViewById(2131429681);
        this.F0 = (TweetView)c0.findViewById(2131432249);
        this.G0 = (zml<Object>)new zml();
        final a2c a2c = new a2c(c0.getContext(), (GestureDetector$OnGestureListener)new mru$c(this));
        TouchInterceptingConstraintLayout touchInterceptingConstraintLayout;
        if (c0 instanceof TouchInterceptingConstraintLayout) {
            touchInterceptingConstraintLayout = (TouchInterceptingConstraintLayout)c0;
        }
        else {
            touchInterceptingConstraintLayout = null;
        }
        if (touchInterceptingConstraintLayout != null) {
            touchInterceptingConstraintLayout.z((qtt)new mru$a(a2c));
        }
    }
    
    public static final boolean a(final mru mru, final KeyEvent keyEvent) {
        Objects.requireNonNull(mru);
        return keyEvent.getKeyCode() == 62 && keyEvent.getAction() == 0;
    }
    
    public final void T(final oax oax) {
        final nru nru = (nru)oax;
        zzd.f((Object)nru, "state");
        this.C0.setEnabled(nru.b);
        ((View)this.E0).setEnabled(nru.b);
        ((CompoundButton)this.E0).setChecked(nru.a);
        ((View)this.F0).setAlpha(((Number)nru.g.getValue()).floatValue());
        final View c0 = this.C0;
        c0.setBackgroundColor(eo6.b(c0.getContext(), ((Number)nru.i.getValue()).intValue()));
    }
    
    public final void s(final Object o) {
        final squ squ = (squ)o;
        zzd.f((Object)squ, "effect");
        final tqu d0 = this.D0;
        Objects.requireNonNull(d0);
        if (squ instanceof squ$a) {
            d0.C0.a(((squ$a)squ).a);
        }
    }
    
    public final b5j<Object> x() {
        final zml<Object> g0 = this.G0;
        final View c0 = this.C0;
        final mru$d mru$d = new mru$d(this);
        zzd.g((Object)c0, "$this$keys");
        final b5j merge = b5j.merge((naj)g0, (naj)((b5j)new p7x(c0, (rtb)mru$d)).filter((ptk)new jn0((rtb)new mru$e(this), 15)).map((qtb)new jhb((rtb)mru$f.C0, 4)));
        zzd.e((Object)merge, "override fun userIntentO\u2026tionIntent.Select }\n    )");
        return (b5j<Object>)merge;
    }
}
