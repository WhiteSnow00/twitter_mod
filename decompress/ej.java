import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.content.Context;
import java.util.Objects;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ej implements View$OnClickListener
{
    public final hj D0;
    public final cnb E0;
    public final boolean F0;
    
    public ej(final hj d0, final cnb e0, final boolean f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final hj d0 = this.D0;
        final cnb e0 = this.E0;
        final boolean f0 = this.F0;
        final int o2 = hj.o2;
        Objects.requireNonNull(d0);
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "account_switcher", "sso", null, "sign_up", "click" });
        cbw.b((elm)af4);
        if (e0 != null) {
            final cnb l0 = ((Fragment)d0).L0();
            if (l0 != null) {
                if (f0) {
                    final af4 af5 = new af4();
                    ((u0p)af5).q(new String[] { "onboarding", "sso", "signup", "request", "start" });
                    cbw.b((elm)af5);
                    final qdj.a a = new qdj.a((Context)l0);
                    final ncs$a m = zh8.m("signup");
                    m.d = "single_sign_on";
                    a.d = (ncs)((n4j)m).e();
                    ((Fragment)d0).W1(((qdj)a.e()).a(), 4, null);
                }
                else {
                    final qdj.a a2 = new qdj.a((Context)l0);
                    final ncs$a i = zh8.m("signup");
                    i.d = "account_switcher";
                    a2.d = (ncs)((n4j)i).e();
                    ((Activity)l0).startActivity(((qdj)a2.e()).a());
                    ((Activity)l0).finish();
                }
            }
        }
    }
}
