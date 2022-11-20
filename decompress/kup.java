import com.twitter.subsystems.nudges.standardized.di.StandardizedNudgeSheetRetainedObjectGraph;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import com.twitter.app.share.ui.ShareSheetViewDelegateBinder;
import com.twitter.app.share.di.view.ShareSheetViewObjectGraph;
import android.view.Window;
import android.content.Context;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.content.DialogInterface;
import com.twitter.subsystems.nudges.engagements.di.TweetEngagementActionSheetRetainedObjectGraph;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Map;
import com.twitter.subsystems.nudges.engagements.di.TweetEngagementActionSheetViewObjectGraph;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import com.twitter.app.share.di.retained.ShareSheetRetainedObjectGraph;
import kotlin.Metadata;
import android.content.DialogInterface$OnShowListener;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lkup;", "Lsmd;", "Landroid/content/DialogInterface$OnShowListener;", "Lrv8;", "Ljep;", "Lsv8;", "<init>", "()V", "feature.tfa.share.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class kup extends smd implements DialogInterface$OnShowListener, rv8<jep>, sv8<jep>
{
    public final w19 o2;
    public final qpg<jep> p2;
    
    public kup() {
        super((upa)f5x.d);
        this.o2 = new w19();
        this.p2 = (qpg<jep>)new qpg();
    }
    
    public final void E0() {
        final mup mup = new mup(((Fragment)this).J0);
        final ft0 o = mup.o();
        if (o != null) {
            ((eju)((ShareSheetRetainedObjectGraph)this.o()).f6()).e(o, mup.p());
        }
        this.p2.onComplete();
        super.E0();
    }
    
    public final kog<? extends jep> a0() {
        return (kog<? extends jep>)this.p2;
    }
    
    public final void f(final Object o) {
        final jep jep = (jep)o;
        final mup mup = new mup(((Fragment)this).J0);
        final ft0 o2 = mup.o();
        if (o2 != null) {
            final vup f6 = ((ShareSheetRetainedObjectGraph)this.o()).f6();
            final baa p = mup.p();
            Objects.requireNonNull(f6);
            final fju e0 = ((eju)f6).E0;
            if (e0 != null) {
                if (e0.D0) {
                    String s;
                    if (e0.E0) {
                        s = "share_tweet_after_read";
                    }
                    else {
                        s = "share_tweet";
                    }
                    final long a = ((eju)f6).D0.a();
                    final fju e2 = ((eju)f6).E0;
                    czd.c((Object)e2);
                    ((eju)f6).f(p, o2, s, "click", Long.valueOf(a - e2.F0));
                }
            }
        }
        this.p2.b((Object)jep);
    }
    
    public final void g1(final Bundle bundle) {
        super.g1(bundle);
        final Dialog l1 = ((nv8)this).L1;
        czd.d((Object)l1, "null cannot be cast to non-null type com.twitter.core.ui.components.dialog.bottomsheet.BottomSheetDialog");
        ((Dialog)l1).setOnShowListener((DialogInterface$OnShowListener)this);
    }
    
    public final xk1 h2() {
        return (xk1)new mup(((Fragment)this).J0);
    }
    
    public final void m2() {
        if (xa8.p()) {
            final cju a5 = ((TweetEngagementActionSheetViewObjectGraph)this.n()).A5();
            final String string = ((BaseBundle)((vl1)a5).a).getString("nudge_engagement_type");
            final b0j.c c = null;
            final i8t i8t = null;
            b0j b0j = null;
            Label_0275: {
                Label_0114: {
                    if (string == null) {
                        break Label_0114;
                    }
                    a0j a6;
                    if ((a6 = (a0j)dwj.f(((vl1)a5).a, "nudge_actions", (rlp)a0j.b)) == null) {
                        final bo6 s = a5.s();
                        if (s != null) {
                            a6 = s.a1;
                        }
                        else {
                            a6 = null;
                        }
                    }
                    b0j.c a7;
                    if (a6 != null) {
                        a7 = a6.a(string);
                    }
                    else {
                        a7 = null;
                    }
                    b0j = a7;
                    if (a7 == null) {
                        break Label_0114;
                    }
                    break Label_0275;
                }
                final String m = a5.m();
                b0j = c;
                if (m != null) {
                    final String q = a5.q();
                    final boolean b = q == null || vkr.V((CharSequence)q);
                    b0j = c;
                    if (b) {
                        final ft0 o = a5.o();
                        Object o2 = i8t;
                        if (o != null) {
                            final String b2 = o.b;
                            o2 = i8t;
                            if (b2 != null) {
                                final ldf$a ldf$a = new ldf$a();
                                ldf$a.a = b2;
                                o2 = ((n4j)ldf$a).j();
                            }
                        }
                        b0j = new b0j.c(m, (oxm<sfs>)new oxm(((Fragment)this).J1().getString(a5.n()), (Map)k2a.D0), b0j.Companion.a(a5.k()), null, ((Fragment)this).J1().getString(2131958146), (i8t)o2, a5.r());
                    }
                }
            }
            final n6r a8 = ((StandardizedNudgeSheetRetainedObjectGraph)this.o()).v().b((b0j.c)b0j).a();
            if (b0j == null) {
                a8.c();
            }
            else {
                a8.b();
            }
        }
    }
    
    public final void o1() {
        super.o1();
        this.o2.a();
    }
    
    public final void onShow(final DialogInterface dialogInterface) {
        czd.f((Object)dialogInterface, "dialogInterface");
        final c92 c92 = (c92)dialogInterface;
        final Context context = ((Dialog)c92).getContext();
        czd.e((Object)context, "dialog.context");
        if (o70.o(context)) {
            final Window window = ((Dialog)c92).getWindow();
            if (window != null) {
                final Window window2 = ((Dialog)c92).getWindow();
                czd.c((Object)window2);
                window.setLayout(window2.getDecorView().getHeight(), -1);
            }
        }
        final FrameLayout frameLayout = ((ck0)c92).findViewById(2131428647);
        if (frameLayout == null) {
            return;
        }
        BottomSheetBehavior.y((View)frameLayout).H(3);
    }
    
    public final void z1() {
        super.z1();
        final ShareSheetViewObjectGraph shareSheetViewObjectGraph = (ShareSheetViewObjectGraph)this.n();
        this.o2.c(ShareSheetViewDelegateBinder.a.b(shareSheetViewObjectGraph.J0(), shareSheetViewObjectGraph.e()));
    }
}
