import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p20 extends wf
{
    public final /* synthetic */ jwe d;
    public final /* synthetic */ AndroidComposeView e;
    public final /* synthetic */ AndroidComposeView f;
    
    public p20(final jwe d, final AndroidComposeView e, final AndroidComposeView f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void d(final View view, final ng ng) {
        zzd.f((Object)view, "host");
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        final bgp q = dml.Q(this.d);
        zzd.c((Object)q);
        final jwe u0 = ukg.U0((pm8)q);
        zzd.f((Object)u0, "layoutNode");
        asy.r(q);
        final jwe g = dml.g(u0, (rtb)egp$c.C0);
        final egp egp = null;
        bgp q2;
        if (g != null) {
            q2 = dml.Q(g);
        }
        else {
            q2 = null;
        }
        egp egp2;
        if (q2 == null) {
            egp2 = egp;
        }
        else {
            egp2 = new egp(q2, false, ukg.U0((pm8)q2));
        }
        zzd.c((Object)egp2);
        int g2;
        if ((g2 = egp2.g) == this.e.getSemanticsOwner().a().g) {
            g2 = -1;
        }
        ng.U((View)this.f, g2);
    }
}
