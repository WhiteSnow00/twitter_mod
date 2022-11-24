import java.util.List;
import android.view.View$OnClickListener;
import android.view.View;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import android.widget.TextView;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.topicselector.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnt implements u4e<rmt>
{
    public final mnt F0;
    public final b G0;
    public final fut H0;
    public final qej I0;
    public final OcfEventReporter J0;
    public final e39 K0;
    
    public lnt(final mnt f0, final b g0, final fut h0, final qej i0, final OcfEventReporter j0) {
        this.K0 = new e39();
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void a(String c, final String s) {
        final fg4 fg4 = new fg4(new String[] { "onboarding", "topics_selector", null, "topic", s });
        c = b.c(c, -1, "main");
        this.J0.b(fg4, c);
    }
    
    public final void b(final String s) {
        final mnt f0 = this.F0;
        final fut h0 = this.H0;
        final pej q = h0.q;
        final pej r = h0.r;
        final boolean contains = ((List)this.G0.b).contains(s);
        final qej i0 = this.I0;
        f0.J0.setToggledOn(contains);
        final ToggleTwitterButton j0 = f0.J0;
        pej pej = q;
        if (contains) {
            pej = r;
        }
        i0.a((TextView)j0, (fym)pej);
    }
    
    public final View getItemView() {
        return ((sl8)this.F0).F0;
    }
    
    public final void r(final Object o) {
        final ilt a = ((rmt)o).a;
        this.I0.a((TextView)this.F0.H0, (fym)a.b);
        final mnt f0 = this.F0;
        final pej c = a.c;
        final qej i0 = this.I0;
        if (c != null) {
            i0.a((TextView)f0.I0, (fym)c);
            ((View)f0.I0).setVisibility(0);
        }
        else {
            ((View)f0.I0).setVisibility(8);
        }
        this.b(a.a);
        ((View)this.F0.J0).setOnClickListener((View$OnClickListener)new a2p((Object)this, (Object)a, 17));
        this.F0.G0.setStyle(2);
        this.K0.c(((t5j)this.G0.g).subscribe((rk6)new t41((Object)this, (Object)a, 11)));
    }
    
    public final void unbind() {
        this.K0.a();
    }
}
