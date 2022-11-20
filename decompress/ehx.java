import java.util.Iterator;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehx extends ste implements qsb<Integer, fzv>
{
    public final ahx D0;
    public final chx E0;
    
    public ehx(final ahx d0, final chx e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final Integer n = (Integer)next;
        if (this.D0.k) {
            final Set c1 = this.E0.f.c1;
            final Object o = null;
            Iterable g;
            if (c1 == null) {
                g = null;
            }
            else {
                g = qdd.g(c1);
            }
            if (g != null) {
                final Iterator iterator = g.iterator();
                do {
                    next = o;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (((ydx)next).d != ((cxs)this.D0).a);
                if (next != null) {
                    next = new gfv$a();
                    final ahx d0 = this.D0;
                    ((gfv$a)next).a = d0.l;
                    ((gfv$a)next).d = d0.m;
                    final gfv gfv = (gfv)((n4j)next).e();
                    final boolean b = f8t.b(((cxs)this.D0).h());
                    String s = "home";
                    String s2;
                    if (b) {
                        s2 = "home";
                    }
                    else {
                        s2 = "";
                    }
                    final int h = ((cxs)this.D0).h();
                    if (h != 17) {
                        if (h != 34) {
                            s = "";
                        }
                        else {
                            s = "latest";
                        }
                    }
                    next = new af4(vba.Companion.e(s2, s, "", "", "minimum_spacing_ad_removal_in_viewport"));
                    ((u0p)next).s(1L);
                    ((u0p)next).i((j0p)gfv);
                    this.E0.i.b(UserIdentifier.Companion.c(), (elm)next);
                }
            }
        }
        this.E0.h.b();
        this.E0.i.b(UserIdentifier.Companion.c(), (elm)new af4(new String[] { "app:database:::remove_voided_timeline_item" }));
        return fzv.a;
    }
}
