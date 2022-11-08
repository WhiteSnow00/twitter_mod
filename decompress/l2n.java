import java.util.List;
import java.util.Objects;
import java.util.Collection;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l2n extends gue implements rtb<f6n, oyv>
{
    public final /* synthetic */ x0n C0;
    
    public l2n(final x0n c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f6n f6n = (f6n)o;
        zzd.f((Object)f6n, "$this$distinct");
        final boolean empty = f6n.d0.isEmpty();
        final int n = 1;
        if (empty ^ true) {
            final x0n c0 = this.C0;
            final w6o c2 = f6n.c0;
            final q31 f = f6n.f;
            final List f2 = f.f;
            Object o2 = null;
            Label_0122: {
                if (f.e > 0) {
                    final String h = f6n.h;
                    if (h != null && h.length() != 0) {
                        o2 = tdy.u0((Object)new zsn(f6n.f.e, f6n.h));
                        break Label_0122;
                    }
                }
                o2 = v2a.C0;
            }
            if (!c0.a2.b && c2.b && ((View)c0.Z0).getScrollY() == 0) {
                c0.H0.i((rj)new c41(asy.T((View)c0.Z0).takeUntil((ptk)new dzf((rtb)new f1n(c0), 21)).subscribe(), 11));
            }
            final x0n$f z1 = c0.Z1;
            final List x1 = or4.X1((Collection)or4.X1((Collection)tdy.u0((Object)c2), (Iterable)f2), (Iterable)o2);
            Objects.requireNonNull(z1);
            int n2;
            if (z1.b == null) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            z1.b = new skf((Iterable)x1);
            if (n2 != 0) {
                z1.c.post((Runnable)new ght((Object)z1, 11));
            }
        }
        this.C0.a2 = f6n.c0;
        return oyv.a;
    }
}
