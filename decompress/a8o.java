import android.app.Dialog;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import androidx.fragment.app.p;
import android.view.View;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8o extends gue implements rtb<f6n, oyv>
{
    public final /* synthetic */ u7o C0;
    
    public a8o(final u7o c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final f6n f6n = (f6n)o;
        zzd.f((Object)f6n, "$this$distinct");
        final View c0 = this.C0.C0;
        int visibility;
        if (f6n.T) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        c0.setVisibility(visibility);
        if (f6n.T) {
            gjo.F(this.C0.E0, "share_sheet", "entity_reply", "impression", null, null, 24);
            final u7o c2 = this.C0;
            final rsn f0 = c2.F0;
            final oit b1 = oit.b1;
            final rsn$b rsn$b = new rsn$b("", 2131958158);
            final View c3 = c2.C0;
            final u7o.u7o$a companion = u7o.Companion;
            final p q = ((gob)c2.G0).Q();
            zzd.e((Object)q, "activity.supportFragmentManager");
            Objects.requireNonNull(companion);
            final Iterator<Object> iterator = u7o.P0.iterator();
            while (true) {
                boolean showing;
                String next;
                do {
                    final boolean hasNext = iterator.hasNext();
                    o = null;
                    final cw8 cw8 = null;
                    if (!hasNext) {
                        rsn.c(f0, b1, rsn$b, c3, (String)o, 0, 0, 0, 112);
                        return oyv.a;
                    }
                    next = iterator.next();
                    final Fragment h = q.H(next);
                    cw8 cw9 = cw8;
                    if (h instanceof cw8) {
                        cw9 = (cw8)h;
                    }
                    if (cw9 != null) {
                        final Dialog k1 = cw9.K1;
                        if (k1 != null) {
                            showing = k1.isShowing();
                            continue;
                        }
                    }
                    showing = false;
                } while (!showing);
                o = next;
                continue;
            }
        }
        return oyv.a;
    }
}
