import org.json.JSONObject;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ydg
{
    public final Object a;
    public Object b;
    public Object c;
    
    public ydg(final Object c) {
        this.a = new kdg();
        this.c = c;
    }
    
    public ydg(final String a, final xli b) {
        final af8 f0 = af8.F0;
        if (a != null) {
            this.c = f0;
            this.b = b;
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
    
    public ydg(final uca a, final sca b, final sca c) {
        czd.f((Object)a, "processor");
        czd.f((Object)b, "parentRegistry");
        czd.f((Object)c, "metadataRegistry");
        this.a = a;
        this.b = b;
        this.c = c;
        final lri$d b2 = lri$d.b;
        this.f((lri)b2, "push_notification");
        final lri$a b3 = lri$a.b;
        this.f((lri)b3, "background");
        final lri$c b4 = lri$c.b;
        this.f((lri)b4, "dismiss");
        final lri$b b5 = lri$b.b;
        this.f((lri)b5, "dismiss");
        this.g((lri)b3, (lri)b2);
        this.g((lri)b4, (lri)b2);
        this.g((lri)b5, (lri)b3);
        a.a((lca)((lri)b2).a);
        a.a((lca)((lri)b3).a);
        a.a((lca)((lri)b5).a);
        a.a((lca)((lri)b4).a);
    }
    
    public final wqc a(final wqc wqc, final zop zop) {
        this.b(wqc, "X-CRASHLYTICS-GOOGLE-APP-ID", zop.a);
        this.b(wqc, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.b(wqc, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.11");
        this.b(wqc, "Accept", "application/json");
        this.b(wqc, "X-CRASHLYTICS-DEVICE-MODEL", zop.b);
        this.b(wqc, "X-CRASHLYTICS-OS-BUILD-VERSION", zop.c);
        this.b(wqc, "X-CRASHLYTICS-OS-DISPLAY-VERSION", zop.d);
        this.b(wqc, "X-CRASHLYTICS-INSTALLATION-ID", ((m4d)zop.e).c());
        return wqc;
    }
    
    public final void b(final wqc wqc, final String s, final String s2) {
        if (s2 != null) {
            wqc.c(s, s2);
        }
    }
    
    public final Map c(final zop zop) {
        final HashMap hashMap = new HashMap();
        hashMap.put("build_version", zop.h);
        hashMap.put("display_version", zop.g);
        hashMap.put("source", Integer.toString(zop.i));
        final String f = zop.f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            hashMap.put("instance", f);
        }
        return hashMap;
    }
    
    public final Object d(final Object a, final Object b) {
        final kdg kdg = (kdg)this.a;
        kdg.a = a;
        kdg.b = b;
        return this.c;
    }
    
    public final JSONObject e(final not not) {
        final int d0 = not.D0;
        final af8 af8 = (af8)this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Settings response code was: ");
        sb.append(d0);
        af8.T(sb.toString());
        final boolean b = d0 == 200 || d0 == 201 || d0 == 202 || d0 == 203;
        final JSONObject jsonObject = null;
        JSONObject jsonObject2;
        if (b) {
            final String s = (String)not.E0;
            try {
                jsonObject2 = new JSONObject(s);
            }
            catch (final Exception ex) {
                final af8 af9 = (af8)this.c;
                final StringBuilder j = fu8.j("Failed to parse settings JSON from ");
                j.append((String)this.a);
                af9.U(j.toString(), (Throwable)ex);
                final af8 af10 = (af8)this.c;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Settings response ");
                sb2.append(s);
                af10.U(sb2.toString(), (Throwable)null);
                jsonObject2 = jsonObject;
            }
        }
        else {
            final af8 af11 = (af8)this.c;
            final StringBuilder l = da8.l("Settings request failed; (status: ", d0, ") from ");
            l.append((String)this.a);
            af11.n(l.toString(), (Throwable)null);
            jsonObject2 = jsonObject;
        }
        return jsonObject2;
    }
    
    public final void f(final lri lri, final String s) {
        ((sca)this.c).b(lri.a.getId(), (qca)new yse(s, s));
    }
    
    public final void g(final lri lri, final lri lri2) {
        ((sca)this.b).b(lri.a.getId(), (qca)new mwj(lri2.a.getId()));
    }
}
