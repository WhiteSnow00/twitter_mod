import com.twitter.report.subsystem.ReportFlowWebViewResultForAction;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v8l implements n93
{
    public final int a;
    public final d9l b;
    
    public v8l(final d9l b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final d9l b = this.b;
                final hs8 hs8 = (hs8)o;
                Objects.requireNonNull(b);
                if (!((orc)hs8).T().b) {
                    b.a2 = chw.F0(b.a2, 1);
                    if (!((wv0)hs8).N()) {
                        b.M3.c(2131959474, 1);
                    }
                }
                else {
                    b.A3.c();
                }
                return;
            }
            case 0: {
                final d9l b2 = this.b;
                final ReportFlowWebViewResultForAction reportFlowWebViewResultForAction = (ReportFlowWebViewResultForAction)o;
                Objects.requireNonNull(b2);
                final int result = reportFlowWebViewResultForAction.getResult();
                if (result != 1) {
                    if (result != 2) {
                        if (result == 3) {
                            b2.q5();
                        }
                    }
                    else {
                        b2.E2.a();
                    }
                }
                else {
                    final cgv o2 = b2.O1;
                    if (o2 != null) {
                        b2.s5(o2);
                    }
                }
            }
        }
    }
}
