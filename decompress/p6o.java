import android.view.View;
import android.widget.LinearLayout;
import com.twitter.rooms.utils.TwoLineSwitchView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6o implements ilx
{
    public final TwoLineSwitchView D0;
    public final TwoLineSwitchView E0;
    public final TwoLineSwitchView F0;
    public final LinearLayout G0;
    public final rhh<y6o> H0;
    
    public p6o(final View view) {
        czd.f((Object)view, "rootView");
        this.D0 = (TwoLineSwitchView)view.findViewById(2131430468);
        this.E0 = (TwoLineSwitchView)view.findViewById(2131430467);
        this.F0 = (TwoLineSwitchView)view.findViewById(2131430466);
        ((View)(this.G0 = (LinearLayout)view.findViewById(2131428259))).setVisibility(8);
        this.H0 = (rhh<y6o>)q3j.g0((qsb)new p6o$d(this));
    }
    
    public final void T(final jbx jbx) {
        final y6o y6o = (y6o)jbx;
        czd.f((Object)y6o, "state");
        this.H0.b((Object)y6o);
    }
    
    public final void q(final Object o) {
    }
    
    public final h5j<c6o> w() {
        final h5j merge = h5j.merge((taj)this.D0.A().map((psb)new ap((qsb)new p6o$a(this), 12)), (taj)this.E0.A().map((psb)new g0i((qsb)new p6o$b(this), 11)), (taj)this.F0.A().map((psb)new vt1((qsb)p6o$c.D0, 5)));
        czd.e((Object)merge, "override fun userIntentO\u2026edChanged\n        }\n    )");
        return (h5j<c6o>)merge;
    }
}
