import com.twitter.weaver.mvi.MviViewModel;
import android.content.Context;
import java.util.List;
import java.util.Iterator;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel$g;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsq extends pue implements stb<tsq, vzv>
{
    public final SpacesClipCardViewModel F0;
    public final x21 G0;
    public final z21 H0;
    
    public dsq(final SpacesClipCardViewModel f0, final x21 g0, final z21 h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final tsq tsq = (tsq)o;
        e0e.f((Object)tsq, "state");
        final SpacesClipCardViewModel f0 = this.F0;
        final x21 g0 = this.G0;
        final z21 h0 = this.H0;
        final SpacesClipCardViewModel$g companion = SpacesClipCardViewModel.Companion;
        Objects.requireNonNull(f0);
        final boolean z = vjo.z();
        final boolean b = false;
        final Object o2 = null;
        boolean b2 = false;
        Label_0127: {
            Label_0125: {
                if (z) {
                    final Iterator iterator = h0.a.iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            o = iterator.next();
                            if (e0e.a((Object)((y21)o).a, (Object)g0.x)) {
                                if (o != null && g0.l != null) {
                                    b2 = true;
                                    break Label_0127;
                                }
                                break Label_0125;
                            }
                        }
                        o = null;
                        continue;
                    }
                }
            }
            b2 = false;
        }
        if (b2) {
            final List a = this.H0.a;
            final x21 g2 = this.G0;
            final Iterator iterator2 = a.iterator();
            do {
                o = o2;
                if (!iterator2.hasNext()) {
                    break;
                }
                o = iterator2.next();
            } while (!e0e.a((Object)((y21)o).a, (Object)g2.x));
            final y21 y21 = (y21)o;
            final em2 b3 = em2.b(this.G0.i);
            e0e.e((Object)b3, "safeValueOf(space.state)");
            int n;
            if (b3 == em2.H0) {
                n = 5;
            }
            else {
                final hpq s0 = this.F0.S0;
                final x21 g3 = this.G0;
                Objects.requireNonNull(s0);
                e0e.f((Object)g3, "space");
                final em2 b4 = em2.b(g3.i);
                e0e.e((Object)b4, "safeValueOf(space.state)");
                int n2 = b ? 1 : 0;
                Label_0304: {
                    if (g3.J) {
                        if (b4 != em2.J0) {
                            n2 = (b ? 1 : 0);
                            if (b4 != em2.I0) {
                                break Label_0304;
                            }
                        }
                        n2 = 1;
                    }
                }
                if (n2 != 0) {
                    n = 1;
                }
                else {
                    n = 4;
                }
            }
            final Context q0 = this.F0.Q0;
            final int g4 = lb0.G(n);
            int n3 = 0;
            Label_0413: {
                if (g4 != 0) {
                    if (g4 == 1) {
                        n3 = 2131958217;
                        break Label_0413;
                    }
                    if (g4 != 2) {
                        if (g4 == 3) {
                            n3 = 2131958238;
                            break Label_0413;
                        }
                        if (g4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (e0e.a((Object)this.F0.Z0.s(), (Object)this.F0.T0)) {
                            n3 = 2131958212;
                            break Label_0413;
                        }
                        n3 = 2131958210;
                        break Label_0413;
                    }
                }
                n3 = 2131958218;
            }
            final String string = q0.getString(n3);
            e0e.e((Object)string, "context.getString(\n     \u2026      }\n                )");
            ((MviViewModel)this.F0).Q((stb)new bsq(this.G0, y21, this.H0, n, string));
            if (tsq.t) {
                SpacesClipCardViewModel.W(this.F0);
            }
        }
        else {
            ((MviViewModel)this.F0).Q((stb)csq.F0);
        }
        return vzv.a;
    }
}
