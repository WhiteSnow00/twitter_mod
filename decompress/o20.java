import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o20 extends wf
{
    public final swe d;
    public final AndroidComposeView e;
    public final AndroidComposeView f;
    
    public o20(final swe d, final AndroidComposeView e, final AndroidComposeView f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void d(final View view, final ng ng) {
        e0e.f((Object)view, "host");
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        final qhp o = kqe.O(this.d);
        e0e.c((Object)o);
        final swe m0 = kqe.m0((en8)o);
        e0e.f((Object)m0, "layoutNode");
        jty.s(o);
        final swe l = kqe.l(m0, (stb)thp$c.F0);
        final thp thp = null;
        qhp o2;
        if (l != null) {
            o2 = kqe.O(l);
        }
        else {
            o2 = null;
        }
        thp thp2;
        if (o2 == null) {
            thp2 = thp;
        }
        else {
            thp2 = new thp(o2, false, kqe.m0((en8)o2));
        }
        e0e.c((Object)thp2);
        int g;
        if ((g = thp2.g) == this.e.getSemanticsOwner().a().g) {
            g = -1;
        }
        ng.U((View)this.f, g);
    }
}
