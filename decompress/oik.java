import android.content.Context;
import android.view.ViewParent;
import java.util.Objects;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oik extends e0n
{
    public oik(final boolean b, final float n, final l9r l9r, final wg8 wg8) {
        super(b, n, l9r, null);
    }
    
    @Override
    public final n0n b(final hvd hvd, final boolean b, final float n, final l9r<sr4> l9r, final l9r<f0n> l9r2, final d86 d86, int n2) {
        e0e.f((Object)hvd, "interactionSource");
        d86.x(331259447);
        d86.x(-1737891121);
        Object m;
        ViewParent parent;
        for (m = d86.m((df6)z20.f); !(m instanceof ViewGroup); m = parent) {
            parent = ((View)m).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(ffe.n("Couldn't find a valid parent for ", m, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            e0e.e((Object)parent, "parent");
        }
        final ViewGroup viewGroup = (ViewGroup)m;
        d86.O();
        d86.x(1643267286);
        if (((View)viewGroup).isInEditMode()) {
            d86.x(-3686552);
            final boolean p7 = d86.P((Object)hvd);
            final boolean p8 = d86.P((Object)this);
            final Object y = d86.y();
            dy4 dy4 = null;
            Label_0214: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(d86.Companion);
                    if ((dy4 = (dy4)y) != d86$a.b) {
                        break Label_0214;
                    }
                }
                dy4 = new dy4(b, n, (l9r)l9r, (l9r)l9r2, (wg8)null);
                d86.p((Object)dy4);
            }
            d86.O();
            final dy4 dy5 = dy4;
            d86.O();
            d86.O();
            return (n0n)dy5;
        }
        d86.O();
        final k0n k0n = null;
        n2 = 0;
        final int childCount = viewGroup.getChildCount();
        View child;
        while (true) {
            child = (View)k0n;
            if (n2 >= childCount) {
                break;
            }
            child = viewGroup.getChildAt(n2);
            if (child instanceof k0n) {
                break;
            }
            ++n2;
        }
        Object o;
        if ((o = child) == null) {
            final Context context = ((View)viewGroup).getContext();
            e0e.e((Object)context, "view.context");
            o = new k0n(context);
            viewGroup.addView((View)o);
        }
        d86.x(-3686095);
        final boolean p9 = d86.P((Object)hvd);
        final boolean p10 = d86.P((Object)this);
        final boolean p11 = d86.P(o);
        final Object y2 = d86.y();
        d60 d87 = null;
        Label_0446: {
            if (!(p9 | p10 | p11)) {
                Objects.requireNonNull(d86.Companion);
                if ((d87 = (d60)y2) != d86$a.b) {
                    break Label_0446;
                }
            }
            d87 = new d60(b, n, (l9r)l9r, (l9r)l9r2, (k0n)o, (wg8)null);
            d86.p((Object)d87);
        }
        d86.O();
        final d60 d88 = d87;
        d86.O();
        return (n0n)d88;
    }
}
