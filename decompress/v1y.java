import android.os.BaseBundle;
import java.util.Iterator;
import android.util.Pair;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v1y implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ Object D0;
    
    @Override
    public final void run() {
        switch (this.C0) {
            default: {
                synchronized (((laz)this.D0).D0) {
                    final tgj e0 = ((laz)this.D0).E0;
                    if (e0 != null) {
                        e0.a();
                    }
                    return;
                }
                break;
            }
            case 2: {
                final ihz ihz = (ihz)this.D0;
                ihz.G0 = ihz.L0;
                return;
            }
            case 1: {
                final vxz p0 = ((nfz)this.D0).P0;
                p0.a.a().g();
                if (p0.b()) {
                    if (p0.c()) {
                        p0.a.u().V0.b((String)null);
                        final Bundle bundle = new Bundle();
                        ((BaseBundle)bundle).putString("source", "(not set)");
                        ((BaseBundle)bundle).putString("medium", "(not set)");
                        ((BaseBundle)bundle).putString("_cis", "intent");
                        ((BaseBundle)bundle).putLong("_cc", 1L);
                        p0.a.w().o("auto", "_cmpx", bundle);
                    }
                    else {
                        final String a = p0.a.u().V0.a();
                        if (TextUtils.isEmpty((CharSequence)a)) {
                            p0.a.b().I0.a("Cache still valid but referrer not found");
                        }
                        else {
                            final long n = p0.a.u().W0.a() / 3600000L;
                            final Uri parse = Uri.parse(a);
                            final Bundle bundle2 = new Bundle();
                            final Pair pair = new Pair((Object)parse.getPath(), (Object)bundle2);
                            for (final String s : parse.getQueryParameterNames()) {
                                ((BaseBundle)bundle2).putString(s, parse.getQueryParameter(s));
                            }
                            ((BaseBundle)pair.second).putLong("_cc", (n - 1L) * 3600000L);
                            final Object first = pair.first;
                            String s2;
                            if (first == null) {
                                s2 = "app";
                            }
                            else {
                                s2 = (String)first;
                            }
                            p0.a.w().o(s2, "_cmp", (Bundle)pair.second);
                        }
                        p0.a.u().V0.b((String)null);
                    }
                    p0.a.u().W0.b(0L);
                }
                return;
            }
            case 0: {
                ((z1y)this.D0).f();
            }
        }
    }
}
