import android.content.Intent;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p8s implements pgg
{
    public final jpb a;
    public final ohg b;
    
    public p8s(final jpb a, final ohg b) {
        this.a = a;
        this.b = b;
    }
    
    public final esj a(final tqm tqm, final ggg ggg) {
        final Context a = tqm.a;
        final int a2 = w4j.a;
        final Activity activity = Activity.class.cast(a);
        final fnc$a fnc$a = new fnc$a();
        fnc$a.x(17);
        final Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra("ref_event")) {
            ((zl1$a)fnc$a).t("ref_event", intent.getStringExtra("ref_event"));
        }
        final vfg a3 = this.b.a((Activity)tqm.a);
        if (a3 != null) {
            final w2a c = a3.c();
            if (c != null) {
                fnc$a.w(c);
            }
        }
        final int a4 = xd9.a((Context)activity, 2130969778, 2131232161);
        final esj$a esj$a = new esj$a(vfg.a, this.a.c((Class)fnc.class));
        esj$a.c = (zl1)((h4j)fnc$a).e();
        esj$a.e = h5t$a.a(17).E0;
        esj$a.f = "home";
        esj$a.l = ((Context)activity).getString(2131954315);
        esj$a.h = a4;
        esj$a.i = xd9.a((Context)activity, 2130969779, a4);
        esj$a.j = false;
        esj$a.k = 2131428175;
        return (esj)((h4j)esj$a).e();
    }
}
