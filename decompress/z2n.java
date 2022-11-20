import java.util.List;
import java.util.Objects;
import java.util.Collection;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z2n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public z2n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        final boolean empty = t6n.d0.isEmpty();
        final int n = 1;
        if (empty ^ true) {
            final l1n d0 = this.D0;
            final l7o c0 = t6n.c0;
            final l31 f = t6n.f;
            final List f2 = f.f;
            Object o2 = null;
            Label_0128: {
                if (f.e > 0) {
                    final String h = t6n.h;
                    if (h != null && h.length() != 0) {
                        o2 = s9i.r(new ntn(t6n.f.e, t6n.h));
                        break Label_0128;
                    }
                }
                o2 = f2a.D0;
            }
            if (!d0.b2.b && c0.b && ((View)d0.a1).getScrollY() == 0) {
                d0.I0.i((oj)new sh(max.v((View)d0.a1).takeUntil((ytk)new bu4((qsb)new t1n(d0), 19)).subscribe(), 10));
            }
            final l1n$f a2 = d0.a2;
            final List x0 = mq4.x0((Collection)mq4.x0((Collection)s9i.r(c0), (Iterable)f2), (Iterable)o2);
            Objects.requireNonNull(a2);
            int n2;
            if (a2.b == null) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            a2.b = new ckf((Iterable)x0);
            if (n2 != 0) {
                a2.c.post((Runnable)new yit((Object)a2, 13));
            }
        }
        this.D0.b2 = t6n.c0;
        return fzv.a;
    }
}
