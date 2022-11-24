import java.util.Iterator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import tv.periscope.android.api.AuthedApiService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n1n implements m1n
{
    public static final n1n.n1n$a Companion;
    public final Context a;
    public final AuthedApiService b;
    public final unp c;
    public final mun d;
    
    static {
        Companion = new n1n.n1n$a();
    }
    
    public n1n(final Context a, final AuthedApiService b, final unp c, final mun d) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "authedApiService");
        e0e.f((Object)c, "sessionCache");
        e0e.f((Object)d, "roomPeriscopeAuthenticator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final List d(final n1n n1n, final Context context) {
        Objects.requireNonNull(n1n);
        final ArrayList list = new ArrayList();
        for (final String s : wue.a(context)) {
            e0e.e((Object)s, "currDeviceLanguage");
            list.add(wlr.N1((CharSequence)s, new String[] { "-" }).get(0));
        }
        return list;
    }
    
    public final bbq<v01> a(final String s) {
        return (bbq<v01>)((bbq)new hcq((idq)this.d.b(), (rtb)new yql((stb)new n1n$c(s, this), 23))).f(this.d.c());
    }
    
    public final bbq<vcr> b() {
        return (bbq<vcr>)this.d.b().p((rtb)new x2i((stb)new n1n$d(this), 24)).f(this.d.c());
    }
    
    public final bbq<p11> c(final String s) {
        return (bbq<p11>)this.d.b().p((rtb)new l5i((stb)new n1n$b(this, s), 24)).f(this.d.c());
    }
}
