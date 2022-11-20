import android.content.DialogInterface;
import android.app.Dialog;
import android.app.Activity;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import android.os.Bundle;
import com.twitter.onboarding.ocf.NavigationHandler;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vcj implements xv8, uv8
{
    public final lw8 D0;
    
    public vcj(final ssr ssr, final p p11, final NavigationHandler navigationHandler, final Bundle bundle, final eej eej, final OcfEventReporter ocfEventReporter, final g7k g7k, final bev bev, final r8x r8x, final xba<y6k> xba, final Activity activity) {
        Object d0;
        if (!(ssr instanceof sw) && !(ssr instanceof vw)) {
            if (ssr instanceof m4h) {
                d0 = new n4h((p4h)((ssr)ssr).b, navigationHandler);
            }
            else if (ssr instanceof f77) {
                d0 = new q80((g77)ssr.b, navigationHandler, eej);
            }
            else {
                if (!(ssr instanceof lxi)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Got unsupported subtask: ");
                    sb.append(ssr);
                    throw new IllegalArgumentException(sb.toString());
                }
                d0 = new kxi((mxi)ssr.b, navigationHandler, eej, g7k, bev, r8x, (xba)xba, activity);
            }
        }
        else {
            d0 = new tw((uw)ssr.b, navigationHandler, eej);
        }
        this.D0 = (lw8)d0;
        if (ssr instanceof lxi) {
            final mxi mxi = (mxi)ssr.b;
            final njl f0 = njl.F0;
            final njl o = mxi.o;
            if (f0 == o) {
                if (bundle == null) {
                    final wk1 w = ((xk1$a)((lw8)d0).f(7)).w();
                    w.U1 = (xv8)this;
                    final int a = c5j.a;
                    w.R1 = (uv8)this;
                    ((wk1)w).e2(p11, "OcfDialogFragmentActivityNotificationDialog");
                }
                else {
                    final uac uac = (uac)p11.H("OcfDialogFragmentActivityNotificationDialog");
                    if (uac != null) {
                        ((wk1)uac).U1 = (xv8)this;
                        final int a2 = c5j.a;
                        ((wk1)uac).R1 = (uv8)this;
                    }
                }
            }
            else if (njl.G0 == o) {
                if (bundle == null) {
                    final jjl jjl = (jjl)((xk1$a)((lw8)d0).e(7)).w();
                    ((wk1)jjl).U1 = (xv8)this;
                    final int a3 = c5j.a;
                    ((wk1)jjl).R1 = (uv8)this;
                    ((wk1)jjl).e2(p11, "OcfDialogFragmentActivityNotificationDialog");
                }
                else {
                    final jjl jjl2 = (jjl)p11.H("OcfDialogFragmentActivityNotificationDialog");
                    if (jjl2 != null) {
                        ((wk1)jjl2).U1 = (xv8)this;
                        final int a4 = c5j.a;
                        ((wk1)jjl2).R1 = (uv8)this;
                    }
                }
            }
        }
        else if (ssr instanceof f77) {
            if (bundle == null) {
                final wk1 w2 = ((xk1$a)((lw8)d0).f(4)).w();
                w2.U1 = (xv8)this;
                final int a5 = c5j.a;
                w2.R1 = (uv8)this;
                ((wk1)w2).e2(p11, "OcfDialogFragmentActivityHalfCoverDialog");
            }
            else {
                final uac uac2 = (uac)p11.H("OcfDialogFragmentActivityHalfCoverDialog");
                if (uac2 != null) {
                    ((wk1)uac2).U1 = (xv8)this;
                    final int a6 = c5j.a;
                    ((wk1)uac2).R1 = (uv8)this;
                }
            }
            ocfEventReporter.c();
        }
        else {
            if (bundle == null) {
                final jjl jjl3 = (jjl)((xk1$a)((lw8)d0).e(1)).w();
                ((wk1)jjl3).U1 = (xv8)this;
                final int a7 = c5j.a;
                ((wk1)jjl3).R1 = (uv8)this;
                ((wk1)jjl3).e2(p11, "OcfDialogFragmentActivityDialog");
            }
            else {
                final jjl jjl4 = (jjl)p11.H("OcfDialogFragmentActivityDialog");
                if (jjl4 != null) {
                    ((wk1)jjl4).U1 = (xv8)this;
                    final int a8 = c5j.a;
                    ((wk1)jjl4).R1 = (uv8)this;
                }
            }
            if (!(ssr instanceof vw)) {
                ocfEventReporter.c();
            }
        }
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        this.D0.c((DialogInterface)dialog, n2);
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        this.D0.b(dialogInterface);
    }
}
