import android.app.Dialog;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import androidx.fragment.app.p;
import android.view.View;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9o extends pue implements stb<l7n, vzv>
{
    public final d9o F0;
    
    public j9o(final d9o f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final l7n l7n = (l7n)o;
        e0e.f((Object)l7n, "$this$distinct");
        final View f0 = this.F0.F0;
        int visibility;
        if (l7n.T) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f0.setVisibility(visibility);
        if (l7n.T) {
            oko.F(this.F0.H0, "share_sheet", "entity_reply", "impression", (ufv)null, (String)null, 24);
            final d9o f2 = this.F0;
            final wtn i0 = f2.I0;
            final wjt e1 = wjt.e1;
            final wtn$b wtn$b = new wtn$b("", 2131958158);
            final View f3 = f2.F0;
            final d9o.a companion = d9o.Companion;
            final p p = ((dob)f2.J0).P();
            e0e.e((Object)p, "activity.supportFragmentManager");
            Objects.requireNonNull(companion);
            final Iterator iterator = d9o.S0.iterator();
            while (true) {
                boolean showing;
                Object next;
                do {
                    final boolean hasNext = iterator.hasNext();
                    o = null;
                    final tw8 tw8 = null;
                    if (!hasNext) {
                        wtn.c(i0, e1, wtn$b, f3, (String)o, 0, 0, 0, 112);
                        return vzv.a;
                    }
                    next = iterator.next();
                    final Fragment h = p.H((String)next);
                    tw8 tw9 = tw8;
                    if (h instanceof tw8) {
                        tw9 = (tw8)h;
                    }
                    if (tw9 != null) {
                        final Dialog n1 = tw9.N1;
                        if (n1 != null) {
                            showing = n1.isShowing();
                            continue;
                        }
                    }
                    showing = false;
                } while (!showing);
                o = next;
                continue;
            }
        }
        return vzv.a;
    }
}
