import org.json.JSONObject;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class seg implements v8x
{
    public final Object F0;
    public Object G0;
    public Object H0;
    
    public seg(final ViewGroup f0, final View h0) {
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = bbq.v((Object)h0);
    }
    
    public seg(final Object h0) {
        this.F0 = new eeg();
        this.H0 = h0;
    }
    
    public seg(final String f0, final twj g0) {
        final r1n k0 = r1n.K0;
        if (f0 != null) {
            this.H0 = k0;
            this.G0 = g0;
            this.F0 = f0;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
    
    public final wrc a(final wrc wrc, final upp upp) {
        this.b(wrc, "X-CRASHLYTICS-GOOGLE-APP-ID", upp.a);
        this.b(wrc, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.b(wrc, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.11");
        this.b(wrc, "Accept", "application/json");
        this.b(wrc, "X-CRASHLYTICS-DEVICE-MODEL", upp.b);
        this.b(wrc, "X-CRASHLYTICS-OS-BUILD-VERSION", upp.c);
        this.b(wrc, "X-CRASHLYTICS-OS-DISPLAY-VERSION", upp.d);
        this.b(wrc, "X-CRASHLYTICS-INSTALLATION-ID", ((m5d)upp.e).c());
        return wrc;
    }
    
    public final void b(final wrc wrc, final String s, final String s2) {
        if (s2 != null) {
            wrc.c(s, s2);
        }
    }
    
    public final Map c(final upp upp) {
        final HashMap hashMap = new HashMap();
        hashMap.put("build_version", upp.h);
        hashMap.put("display_version", upp.g);
        hashMap.put("source", Integer.toString(upp.i));
        final String f = upp.f;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            hashMap.put("instance", f);
        }
        return hashMap;
    }
    
    public final Object d(final Object a, final Object b) {
        final eeg eeg = (eeg)this.F0;
        eeg.a = a;
        eeg.b = b;
        return this.H0;
    }
    
    public final JSONObject e(final uzz uzz) {
        final int f0 = uzz.F0;
        final r1n r1n = (r1n)this.H0;
        final StringBuilder sb = new StringBuilder();
        sb.append("Settings response code was: ");
        sb.append(f0);
        r1n.l0(sb.toString());
        final boolean b = f0 == 200 || f0 == 201 || f0 == 202 || f0 == 203;
        final JSONObject jsonObject = null;
        JSONObject jsonObject2;
        if (b) {
            final String s = (String)uzz.G0;
            try {
                jsonObject2 = new JSONObject(s);
            }
            catch (final Exception ex) {
                final r1n r1n2 = (r1n)this.H0;
                final StringBuilder f2 = ehk.f("Failed to parse settings JSON from ");
                f2.append((String)this.F0);
                r1n2.n0(f2.toString(), (Throwable)ex);
                final r1n r1n3 = (r1n)this.H0;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Settings response ");
                sb2.append(s);
                r1n3.n0(sb2.toString(), (Throwable)null);
                jsonObject2 = jsonObject;
            }
        }
        else {
            final r1n r1n4 = (r1n)this.H0;
            final StringBuilder a = snp.a("Settings request failed; (status: ", f0, ") from ");
            a.append((String)this.F0);
            r1n4.z(a.toString(), (Throwable)null);
            jsonObject2 = jsonObject;
        }
        return jsonObject2;
    }
    
    public final bbq get() {
        return (bbq)this.G0;
    }
    
    public final View getViewIfInflated() {
        return (View)this.H0;
    }
}
