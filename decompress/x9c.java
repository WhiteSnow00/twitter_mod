import android.os.BaseBundle;
import java.io.Serializable;
import android.net.Uri;
import android.content.res.Resources;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x9c implements fgg
{
    public final jsj a(final krm krm, final xfg xfg) {
        final Resources b = krm.b;
        final Uri a = xfg.a;
        vl1 b2;
        if (asa.c().b("explore_dynamic_chrome_enabled", false)) {
            final p4t$a p4t$a = new p4t$a();
            p4t$a.a = "guide";
            p4t$a.b = "main";
            final p4t p4t = (p4t)((n4j)p4t$a).e();
            final vha$a vha$a = new vha$a();
            if (a != null) {
                ((BaseBundle)((vl1$a)vha$a).a).putString("arg_initial_tab_uri", a.toString());
            }
            ((vl1$a)vha$a).a.putByteArray("arg_fallback_scribe_config", klp.e((Object)p4t, (rlp)p4t.c));
            final int a2 = c5j.a;
            b2 = (vl1)((n4j)vha$a).e();
        }
        else if (s9c.c()) {
            b2 = vl1.b;
        }
        else {
            b2 = (vl1)((n4j)new ipv.a(null)).e();
        }
        final Uri e = mfg.e;
        Serializable c;
        if (asa.c().b("explore_dynamic_chrome_enabled", false)) {
            c = fob.a().c((Class)vha.class);
            final int a3 = c5j.a;
        }
        else if (s9c.c()) {
            c = s9s.class;
        }
        else {
            c = kpv.class;
        }
        final jsj$a jsj$a = new jsj$a(e, (Class)c);
        jsj$a.c = b2;
        jsj$a.e = "moments";
        jsj$a.f = "guide";
        jsj$a.d = b.getString(2131954259);
        jsj$a.l = b.getString(2131954256);
        jsj$a.h = fd9.a(krm.a, 2130969762, 2131232416);
        jsj$a.i = fd9.a(krm.a, 2130969763, 2131232410);
        jsj$a.j = false;
        jsj$a.k = e.hashCode();
        return (jsj)((n4j)jsj$a).e();
    }
}
