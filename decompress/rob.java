import android.transition.Transition;
import java.util.ArrayList;
import android.transition.Transition$TransitionListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rob implements Transition$TransitionListener
{
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final qob g;
    
    public rob(final qob g, final Object a, final ArrayList b, final Object e, final ArrayList f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = e;
        this.f = f;
    }
    
    public final void onTransitionCancel(final Transition transition) {
    }
    
    public final void onTransitionEnd(final Transition transition) {
        transition.removeListener((Transition$TransitionListener)this);
    }
    
    public final void onTransitionPause(final Transition transition) {
    }
    
    public final void onTransitionResume(final Transition transition) {
    }
    
    public final void onTransitionStart(final Transition transition) {
        final Object a = this.a;
        if (a != null) {
            this.g.t(a, this.b, (ArrayList)null);
        }
        final Object c = this.c;
        if (c != null) {
            this.g.t(c, this.d, (ArrayList)null);
        }
        final Object e = this.e;
        if (e != null) {
            this.g.t(e, this.f, (ArrayList)null);
        }
    }
}
