import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import android.net.Uri;
import android.webkit.WebView;
import com.twitter.onboarding.ocf.WebModalSubtaskPresenter$c;
import java.util.Map;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmx extends WebViewClient
{
    public static final c Companion;
    public static final gxe<Map<String, WebModalSubtaskPresenter$c>> e;
    public static final gxe<Map<String, WebModalSubtaskPresenter$c>> f;
    public final xml<pmi> a;
    public final xml<String> b;
    public final b5j<pmi> c;
    public final b5j<String> d;
    
    static {
        Companion = new c();
        bmx.e = (u3s)rp2.z0((otb)bmx$a.C0);
        bmx.f = (u3s)rp2.z0((otb)bmx$b.C0);
    }
    
    public bmx() {
        final xml a = new xml();
        this.a = (xml<pmi>)a;
        final xml b = new xml();
        this.b = (xml<String>)b;
        this.c = new l7j((bnl)a);
        this.d = new l7j((bnl)b);
    }
    
    public final void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        this.a.onNext((Object)pmi.a);
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        boolean b = false;
        if (s == null) {
            return false;
        }
        final Uri parse = Uri.parse(s);
        WebModalSubtaskPresenter$c webModalSubtaskPresenter$c;
        if (p5w.x(parse)) {
            Objects.requireNonNull(bmx.Companion);
            webModalSubtaskPresenter$c = ((Map)bmx.f.getValue()).get(parse.getPath());
        }
        else {
            if (!p5w.q(parse)) {
                this.a.onNext((Object)pmi.a);
                return true;
            }
            Objects.requireNonNull(bmx.Companion);
            final Map map = (Map)bmx.e.getValue();
            final String host = parse.getHost();
            final String path = parse.getPath();
            final StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(host);
            sb.append(path);
            webModalSubtaskPresenter$c = (WebModalSubtaskPresenter$c)map.get(sb.toString());
        }
        int n;
        if (webModalSubtaskPresenter$c == null) {
            n = -1;
        }
        else {
            n = bmx.d.a[((Enum)webModalSubtaskPresenter$c).ordinal()];
        }
        if (n != -1) {
            if (n != 1) {
                if (n != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.a.onNext((Object)pmi.a);
            }
            else {
                this.b.onNext((Object)s);
            }
            b = true;
        }
        return b;
    }
    
    public static final class c
    {
        public static final Map a(final c c, final List list) {
            Objects.requireNonNull(c);
            final ArrayList list2 = new ArrayList();
            for (final String s : list) {
                final WebModalSubtaskPresenter$c[] values = WebModalSubtaskPresenter$c.values();
                final ArrayList list3 = new ArrayList<gvj>(values.length);
                for (int i = 0; i < values.length; ++i) {
                    final WebModalSubtaskPresenter$c webModalSubtaskPresenter$c = values[i];
                    list3.add(new gvj((Object)zi.y(s, "/", webModalSubtaskPresenter$c.C0), (Object)webModalSubtaskPresenter$c));
                }
                mr4.n1((Collection)list2, (Iterable)list3);
            }
            return vkg.r1((Iterable)list2);
        }
    }
}
