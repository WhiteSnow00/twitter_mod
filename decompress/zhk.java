import android.content.Context;
import android.view.ViewParent;
import java.util.Objects;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhk extends ozm
{
    public zhk(final boolean b, final float n, final m8r m8r, final rf8 rf8) {
        super(b, n, m8r, (rf8)null);
    }
    
    public final xzm b(final fud fud, final boolean b, final float n, final m8r<nq4> m8r, final m8r<pzm> m8r2, final x66 x66, int n2) {
        czd.f((Object)fud, "interactionSource");
        x66.x(331259447);
        x66.x(-1737891121);
        Object m;
        ViewParent parent;
        for (m = x66.m((wd6)z20.f); !(m instanceof ViewGroup); m = parent) {
            parent = ((View)m).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(hee.f("Couldn't find a valid parent for ", m, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            czd.e((Object)parent, "parent");
        }
        final ViewGroup viewGroup = (ViewGroup)m;
        x66.O();
        x66.x(1643267286);
        if (((View)viewGroup).isInEditMode()) {
            x66.x(-3686552);
            final boolean p7 = x66.P((Object)fud);
            final boolean p8 = x66.P((Object)this);
            final Object y = x66.y();
            ww4 ww4 = null;
            Label_0214: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((ww4 = (ww4)y) != x66$a.b) {
                        break Label_0214;
                    }
                }
                ww4 = new ww4(b, n, m8r, m8r2, null);
                x66.p((Object)ww4);
            }
            x66.O();
            final ww4 ww5 = ww4;
            x66.O();
            x66.O();
            return ww5;
        }
        x66.O();
        final uzm uzm = null;
        n2 = 0;
        final int childCount = viewGroup.getChildCount();
        View child;
        while (true) {
            child = (View)uzm;
            if (n2 >= childCount) {
                break;
            }
            child = viewGroup.getChildAt(n2);
            if (child instanceof uzm) {
                break;
            }
            ++n2;
        }
        Object o;
        if ((o = child) == null) {
            final Context context = ((View)viewGroup).getContext();
            czd.e((Object)context, "view.context");
            o = new uzm(context);
            viewGroup.addView((View)o);
        }
        x66.x(-3686095);
        final boolean p9 = x66.P((Object)fud);
        final boolean p10 = x66.P((Object)this);
        final boolean p11 = x66.P(o);
        final Object y2 = x66.y();
        e60 e60 = null;
        Label_0446: {
            if (!(p9 | p10 | p11)) {
                Objects.requireNonNull(x66.Companion);
                if ((e60 = (e60)y2) != x66$a.b) {
                    break Label_0446;
                }
            }
            e60 = new e60(b, n, m8r, m8r2, (uzm)o, null);
            x66.p((Object)e60);
        }
        x66.O();
        final e60 e61 = e60;
        x66.O();
        return e61;
    }
}
