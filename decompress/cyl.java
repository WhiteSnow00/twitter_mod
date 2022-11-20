import java.util.Comparator;
import android.view.View;
import android.app.Dialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.inject.view.ViewObjectGraph;
import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.List;
import androidx.fragment.app.p;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.twitter.app.dm.conversation.ReactionDetailsViewObjectGraph;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Lcyl;", "Le92;", "Layl;", "<init>", "()V", "a", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class cyl extends e92 implements ayl
{
    public static final a Companion;
    public ot7 o2;
    public ReactionDetailsViewObjectGraph p2;
    public a.a q2;
    public final w19 r2;
    
    static {
        Companion = new a();
    }
    
    public cyl() {
        this.r2 = new w19();
    }
    
    public final void Q(final iyl iyl) {
        czd.f((Object)iyl, "reactionEntry");
        final ot7 o2 = this.o2;
        if (o2 != null) {
            o2.Z(iyl);
        }
        ((nv8)this).Z1(false, false);
    }
    
    public final xk1 h2() {
        return (xk1)new eyl(((Fragment)this).J0);
    }
    
    public final void j1(final Context context) {
        czd.f((Object)context, "context");
        super.j1(context);
        final p v0 = ((Fragment)this).V0;
        Label_0084: {
            if (v0 != null) {
                final List m = v0.M();
                if (m != null) {
                    while (true) {
                        for (final Object next : m) {
                            if (((Fragment)next) instanceof ot7) {
                                final Fragment fragment = (Fragment)next;
                                if (fragment != null) {
                                    this.o2 = (ot7)fragment;
                                }
                                break Label_0084;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
            }
        }
        this.q2 = new a.a(((wk1)this).g2.getId());
    }
    
    public final void m2() {
        final ViewObjectGraph n = ((smd)this).n();
        czd.e((Object)n, "getViewObjectGraph<React\u2026DetailsViewObjectGraph>()");
        final ReactionDetailsViewObjectGraph p2 = (ReactionDetailsViewObjectGraph)n;
        this.p2 = p2;
        final ssa s = p2.s();
        final ReactionDetailsViewObjectGraph p3 = this.p2;
        if (p3 == null) {
            czd.m("subgraph");
            throw null;
        }
        final ogw g5 = p3.g5();
        final List j = ((fk1)((tlp)new eyl(((Fragment)this).J0)).j()).j();
        final UserIdentifier g6 = ((wk1)this).g2;
        czd.e((Object)g6, "owner");
        final List a = jyl.a(j, g6);
        final ReactionDetailsViewObjectGraph p4 = this.p2;
        if (p4 != null) {
            final q3e q = p4.q();
            final w19 r2 = this.r2;
            final h5j a2 = s.a();
            final f2a d0 = f2a.D0;
            r2.c(eaq.Q((lcq)a2.first((Object)new bf6((List)d0, (List)d0)), (lcq)rw0.e((Callable)new bhx((Object)g5, (Object)a, 1)), (zv1)new ajd((Object)a, 5)).I(owo.c()).G((lj6)new ebk((qsb)new dyl((q3e<zxl>)q, this), 10), (lj6)jub.e));
            return;
        }
        czd.m("subgraph");
        throw null;
    }
    
    public final void o1() {
        super.o1();
        this.r2.a();
    }
    
    public final void r1() {
        super.r1();
        this.o2 = null;
    }
    
    public final void z1() {
        super.z1();
        final Dialog l1 = ((nv8)this).L1;
        if (l1 != null) {
            final View viewById = l1.findViewById(2131428647);
            if (viewById != null) {
                BottomSheetBehavior.y(viewById).H(3);
            }
        }
    }
    
    public static final class a
    {
        public static final class a implements Comparator<zxl>
        {
            public final long D0;
            
            public a(final long d0) {
                this.D0 = d0;
            }
            
            @Override
            public final int compare(final Object o, final Object o2) {
                final zxl zxl = (zxl)o;
                final zxl zxl2 = (zxl)o2;
                czd.f((Object)zxl, "first");
                czd.f((Object)zxl2, "second");
                final long d0 = this.D0;
                int n;
                if (d0 == zxl.a.D0) {
                    n = -1;
                }
                else if (d0 == zxl2.a.D0) {
                    n = 1;
                }
                else {
                    n = (int)(zxl2.b.e - zxl.b.e);
                }
                return n;
            }
        }
    }
}
