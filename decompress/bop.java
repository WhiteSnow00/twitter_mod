import android.content.SharedPreferences$Editor;
import java.io.Writer;
import org.json.JSONObject;
import java.util.Map;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.File;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bop implements str<Void, Void>
{
    public final cop D0;
    
    public bop(final cop d0) {
        this.D0 = d0;
    }
    
    public final ubs d(Object f) throws Exception {
        final Void void1 = (Void)f;
        final cop d0 = this.D0;
        f = d0.f;
        final zop b = d0.b;
        Objects.requireNonNull(f);
        Object o = null;
        JSONObject e;
        try {
            final Map c = ((ydg)f).c(b);
            final xli xli = (xli)((ydg)f).b;
            final String s = (String)((ydg)f).a;
            Objects.requireNonNull(xli);
            final wqc wqc = new wqc(s, c);
            wqc.c("User-Agent", "Crashlytics Android SDK/18.2.11");
            wqc.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ((ydg)f).a(wqc, b);
            final af8 af8 = (af8)((ydg)f).c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Requesting settings from ");
            sb.append((String)((ydg)f).a);
            af8.l(sb.toString());
            final af8 af9 = (af8)((ydg)f).c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings query params were: ");
            sb2.append(c);
            af9.T(sb2.toString());
            e = ((ydg)f).e(wqc.b());
        }
        catch (final IOException ex) {
            ((af8)((ydg)f).c).n("Settings request failed.", (Throwable)ex);
            e = null;
        }
        if (e != null) {
            final wnp a = this.D0.c.a(e);
            final mcg e2 = this.D0.e;
            final long c2 = a.c;
            Objects.requireNonNull(e2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable)null);
            }
            Label_0466: {
                try {
                    e.put("expires_at", c2);
                    f = (o = new FileWriter((File)e2.D0));
                    try {
                        final Object o2 = f;
                        final JSONObject jsonObject = e;
                        final String s2 = jsonObject.toString();
                        ((Writer)o2).write(s2);
                        o = f;
                        final Object o3 = f;
                        ((Writer)o3).flush();
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex2) {
                    f = null;
                }
                finally {
                    break Label_0466;
                }
                try {
                    final Object o2 = f;
                    final JSONObject jsonObject = e;
                    final String s2 = jsonObject.toString();
                    ((Writer)o2).write(s2);
                    o = f;
                    final Object o3 = f;
                    ((Writer)o3).flush();
                    while (true) {
                        yw4.a((Closeable)f, "Failed to close settings writer.");
                        this.D0.c(e, "Loaded settings: ");
                        o = this.D0;
                        final String f2 = ((cop)o).b.f;
                        o = yw4.h(((cop)o).a).edit();
                        ((SharedPreferences$Editor)o).putString("existing_instance_identifier", f2);
                        ((SharedPreferences$Editor)o).apply();
                        this.D0.h.set(a);
                        this.D0.i.get().d((Object)a);
                        return ucs.e((Object)null);
                        o = f;
                        final Exception ex2;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", (Throwable)ex2);
                        continue;
                    }
                }
                finally {}
            }
            yw4.a((Closeable)o, "Failed to close settings writer.");
        }
        return ucs.e((Object)null);
    }
}
