import com.twitter.util.user.UserIdentifier;
import java.util.List;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ktv extends g0j
{
    public final View$OnClickListener h;
    public final eaq<Boolean> i;
    public final List<jw9<? extends jvg>> j;
    public final red$c k;
    
    public ktv(final UserIdentifier userIdentifier, final String s, final View$OnClickListener view$OnClickListener, final View$OnClickListener i, final eaq<Boolean> j, final List<? extends jw9<? extends jvg>> k, final red$c red$c) {
        final ai2 e0 = ai2.E0;
        Object o;
        if (s.length() == 0) {
            final nw6 a = tes.a;
            o = t2a.b;
        }
        else {
            o = tes.a(s);
        }
        final nw6 a2 = tes.a;
        super(userIdentifier, (tes)o, (tes)new dkr(2131959615), view$OnClickListener);
        this.h = (View$OnClickListener)e0;
        this.i = (eaq<Boolean>)i;
        this.j = (List<jw9<? extends jvg>>)j;
        this.k = (red$c)k;
    }
    
    public final red$c i() {
        return this.k;
    }
}
