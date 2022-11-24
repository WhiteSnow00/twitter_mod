import android.widget.Space;
import com.twitter.media.ui.image.UserImageView;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oki implements xlx
{
    public final h5s F0;
    public final h5s G0;
    public final h5s H0;
    public final fih<ski> I0;
    
    public oki(final View view, final Activity activity) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)activity, "activity");
        this.F0 = (h5s)jty.N((ptb)new oki$b(view));
        this.G0 = (h5s)jty.N((ptb)new oki$c(view));
        this.H0 = (h5s)jty.N((ptb)new oki$d(view));
        this.I0 = (fih<ski>)ma7.S((stb)new oki$e(this, activity));
    }
    
    public final void T(final ccx ccx) {
        final ski ski = (ski)ccx;
        e0e.f((Object)ski, "state");
        this.I0.b((Object)ski);
    }
    
    public final UserImageView a() {
        final Object value = this.F0.getValue();
        e0e.e(value, "<get-creatorHostImage>(...)");
        return (UserImageView)value;
    }
    
    public final Space b() {
        final Object value = this.H0.getValue();
        e0e.e(value, "<get-overlapSpace>(...)");
        return (Space)value;
    }
    
    public final void r(final Object o) {
    }
    
    public final t5j w() {
        return ffe.b();
    }
}
