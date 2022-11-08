import java.util.Iterator;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igx extends gue implements rtb<Integer, oyv>
{
    public final /* synthetic */ fgx C0;
    public final /* synthetic */ ggx D0;
    
    public igx(final fgx c0, final ggx d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object next) {
        final Integer n = (Integer)next;
        if (this.C0.k) {
            final Set b1 = this.D0.f.b1;
            final Object o = null;
            Iterable g;
            if (b1 == null) {
                g = null;
            }
            else {
                g = med.g(b1);
            }
            if (g != null) {
                final Iterator iterator = g.iterator();
                do {
                    next = o;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (((edx)next).d != this.C0.a);
                if (next != null) {
                    next = new lev$a();
                    final fgx c0 = this.C0;
                    ((lev$a)next).a = c0.l;
                    ((lev$a)next).d = c0.m;
                    final lev lev = (lev)((h4j)next).e();
                    final boolean b2 = n7t.b(this.C0.h());
                    String s = "home";
                    String s2;
                    if (b2) {
                        s2 = "home";
                    }
                    else {
                        s2 = "";
                    }
                    final int h = this.C0.h();
                    if (h != 17) {
                        if (h != 34) {
                            s = "";
                        }
                        else {
                            s = "latest";
                        }
                    }
                    next = new zf4(nca.Companion.e(s2, s, "", "", "minimum_spacing_ad_removal_in_viewport"));
                    ((d0p)next).s(1L);
                    ((d0p)next).i((szo)lev);
                    this.D0.i.b(UserIdentifier.Companion.c(), (okm)next);
                }
            }
        }
        this.D0.h.b();
        this.D0.i.b(UserIdentifier.Companion.c(), (okm)new zf4(new String[] { "app:database:::remove_voided_timeline_item" }));
        return oyv.a;
    }
}
