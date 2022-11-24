// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewParent;
import android.view.View;
import java.util.Set;

public final class d extends pue implements hub<d86, Integer, vzv>
{
    public final WrappedComposition F0;
    public final hub<d86, Integer, vzv> G0;
    
    public d(final WrappedComposition f0, final hub<? super d86, ? super Integer, vzv> g0) {
        this.F0 = f0;
        this.G0 = (hub<d86, Integer, vzv>)g0;
        super(2);
    }
    
    public final Object invoke(Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            o = ((View)this.F0.F0).getTag(2131429621);
            Set set;
            if (o instanceof Set && (o instanceof koe || o instanceof uoe)) {
                set = (Set)o;
            }
            else {
                set = null;
            }
            Set set2 = set;
            if (set == null) {
                final ViewParent parent = ((View)this.F0.F0).getParent();
                View view;
                if (parent instanceof View) {
                    view = (View)parent;
                }
                else {
                    view = null;
                }
                if (view != null) {
                    o = view.getTag(2131429621);
                }
                else {
                    o = null;
                }
                if (o instanceof Set && (o instanceof koe || o instanceof uoe)) {
                    set2 = (Set)o;
                }
                else {
                    set2 = null;
                }
            }
            if (set2 != null) {
                set2.add(d86.z());
                d86.u();
            }
            final WrappedComposition f0 = this.F0;
            shw.h((Object)f0.F0, (hub)new a(f0, (mp6)null), d86);
            final WrappedComposition f2 = this.F0;
            shw.h((Object)f2.F0, (hub)new b(f2, (mp6)null), d86);
            ef6.a(new nml[] { atd.a.b(set2) }, (hub)w9y.i(d86, -1193460702, new c(this.F0, this.G0)), d86, 56);
        }
        return vzv.a;
    }
}
