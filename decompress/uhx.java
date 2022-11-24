import java.util.Iterator;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uhx extends pue implements stb<Integer, vzv>
{
    public final qhx F0;
    public final shx G0;
    
    public uhx(final qhx f0, final shx g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final Integer n = (Integer)next;
        if (this.F0.k) {
            final Set e1 = this.G0.f.e1;
            final Object o = null;
            Iterable g;
            if (e1 == null) {
                g = null;
            }
            else {
                g = qed.g(e1);
            }
            if (g != null) {
                final Iterator iterator = g.iterator();
                do {
                    next = o;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (((qex)next).d != ((vxs)this.F0).a);
                if (next != null) {
                    final ufv$a ufv$a = new ufv$a();
                    final qhx f0 = this.F0;
                    ufv$a.a = f0.l;
                    ufv$a.d = f0.m;
                    final ufv ufv = (ufv)((z4j)ufv$a).e();
                    final boolean b = z8t.b(((vxs)this.F0).h());
                    String s = "home";
                    String s2;
                    if (b) {
                        s2 = "home";
                    }
                    else {
                        s2 = "";
                    }
                    final int h = ((vxs)this.F0).h();
                    if (h != 17) {
                        if (h != 34) {
                            s = "";
                        }
                        else {
                            s = "latest";
                        }
                    }
                    next = new fg4(dda.Companion.e(s2, s, "", "", "minimum_spacing_ad_removal_in_viewport"));
                    ((o1p)next).s(1L);
                    ((o1p)next).i((d1p)ufv);
                    this.G0.i.b(UserIdentifier.Companion.c(), (tlm)next);
                }
            }
        }
        this.G0.h.b();
        this.G0.i.b(UserIdentifier.Companion.c(), (tlm)new fg4(new String[] { "app:database:::remove_voided_timeline_item" }));
        return vzv.a;
    }
}
