import java.util.Set;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grq extends ste implements qsb<vrq, fzv>
{
    public final SpacesClipCardViewModel D0;
    public final vba E0;
    
    public grq(final SpacesClipCardViewModel d0, final vba e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vrq vrq = (vrq)o;
        czd.f((Object)vrq, "it");
        final int s = vrq.s;
        if (s != 0) {
            if (vrq.a == bk3.F0) {
                if (s != 4 && (s != 1 || !vrq.w)) {
                    if (s == 1) {
                        final SpacesClipCardViewModel d0 = this.D0;
                        final asq x0 = d0.X0;
                        final String r0 = d0.R0;
                        final t21 e = vrq.e;
                        czd.c((Object)e);
                        w1e.F(x0, r0, e, (bba)null, false, false, 28, (Object)null);
                        if (vrq.f) {
                            final String b = vrq.b;
                            if (b != null) {
                                this.D0.Y0.a.onNext((Object)new z6n$a$g(b));
                            }
                        }
                    }
                    else if (s != 2 && s != 3) {
                        if (s == 5) {
                            final SpacesClipCardViewModel d2 = this.D0;
                            final asq x2 = d2.X0;
                            final String r2 = d2.R0;
                            final bba.a companion = bba.Companion;
                            final vba e2 = this.E0;
                            x2.t(r2, true, companion.b(e2.a, e2.b, e2.c, e2.d));
                        }
                    }
                    else {
                        this.D0.b1.a.onNext((Object)o1o$a$j.a);
                    }
                }
                else {
                    final SpacesClipCardViewModel d3 = this.D0;
                    d3.X0.o(d3.R0, vrq.d, vrq.x, vrq.w, (Set)vrq.y, false, s == 1, true);
                }
            }
        }
        return fzv.a;
    }
}
