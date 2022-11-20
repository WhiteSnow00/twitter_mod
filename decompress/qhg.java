import android.content.Intent;
import kotlin.NoWhenBranchMatchedException;
import android.content.Context;
import android.view.View;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qhg implements ilx<uhg, phg, nhg>
{
    public final Activity D0;
    public final HorizonComposeButton E0;
    public final HorizonComposeButton F0;
    
    public qhg(View viewById, final Activity d0) {
        czd.f((Object)viewById, "rootView");
        czd.f((Object)d0, "activity");
        this.D0 = d0;
        final View viewById2 = viewById.findViewById(2131431462);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.sign_up)");
        this.E0 = (HorizonComposeButton)viewById2;
        viewById = viewById.findViewById(2131429881);
        czd.e((Object)viewById, "rootView.findViewById(R.id.log_in)");
        this.F0 = (HorizonComposeButton)viewById;
    }
    
    public final void T(final jbx jbx) {
        czd.f((Object)jbx, "state");
    }
    
    public final void q(final Object o) {
        final nhg nhg = (nhg)o;
        czd.f((Object)nhg, "effect");
        Intent intent;
        if (nhg instanceof nhg.a) {
            final qdj.a a = new qdj.a((Context)this.D0);
            final ncs$a ncs$a = new ncs$a();
            ncs$a.p("login");
            a.d = (ncs)((n4j)ncs$a).e();
            intent = ((qdj)a.e()).a();
        }
        else {
            if (!(nhg instanceof nhg.b)) {
                throw new NoWhenBranchMatchedException();
            }
            final qdj.a a2 = new qdj.a((Context)this.D0);
            final ncs$a ncs$a2 = new ncs$a();
            ncs$a2.p("welcome");
            a2.d = (ncs)((n4j)ncs$a2).e();
            intent = ((qdj)a2.e()).a();
        }
        czd.e((Object)intent, "when (effect) {\n        \u2026        .intent\n        }");
        this.D0.startActivity(intent);
    }
    
    public final h5j<phg> w() {
        final h5j merge = h5j.merge((taj)max.h((View)this.E0).map((psb)new y9v((qsb)qhg$a.D0, 7)), (taj)max.h((View)this.F0).map((psb)new di((qsb)qhg$b.D0, 9)));
        czd.e((Object)merge, "merge(\n            signu\u2026nt.LoginClick }\n        )");
        return (h5j<phg>)merge;
    }
}
