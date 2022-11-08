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

public final class lnp implements atr<Void, Void>
{
    public final /* synthetic */ mnp C0;
    
    public lnp(final mnp c0) {
        this.C0 = c0;
    }
    
    @Override
    public final zas b(Object f) throws Exception {
        final Void void1 = (Void)f;
        final mnp c0 = this.C0;
        f = c0.f;
        final hop b = c0.b;
        Objects.requireNonNull(f);
        Object o = null;
        JSONObject e;
        try {
            final Map c2 = ((ieg)f).c(b);
            final zvj zvj = (zvj)((ieg)f).b;
            final String s = (String)((ieg)f).a;
            Objects.requireNonNull(zvj);
            final trc trc = new trc(s, c2);
            trc.c("User-Agent", "Crashlytics Android SDK/18.2.11");
            trc.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ((ieg)f).a(trc, b);
            final ajy ajy = (ajy)((ieg)f).c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Requesting settings from ");
            sb.append((String)((ieg)f).a);
            ajy.p(sb.toString());
            final ajy ajy2 = (ajy)((ieg)f).c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings query params were: ");
            sb2.append(c2);
            ajy2.Y(sb2.toString());
            e = ((ieg)f).e(trc.b());
        }
        catch (final IOException ex) {
            ((ajy)((ieg)f).c).s("Settings request failed.", (Throwable)ex);
            e = null;
        }
        if (e != null) {
            final gnp a = this.C0.c.a(e);
            final wcg e2 = this.C0.e;
            final long c3 = a.c;
            Objects.requireNonNull(e2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable)null);
            }
            Label_0445: {
                try {
                    e.put("expires_at", c3);
                    f = (o = new FileWriter((File)e2.C0));
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
                    break Label_0445;
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
                        wx4.a((Closeable)f, "Failed to close settings writer.");
                        this.C0.c(e, "Loaded settings: ");
                        o = this.C0;
                        final String f2 = ((mnp)o).b.f;
                        o = wx4.h(((mnp)o).a).edit();
                        ((SharedPreferences$Editor)o).putString("existing_instance_identifier", f2);
                        ((SharedPreferences$Editor)o).apply();
                        this.C0.h.set(a);
                        this.C0.i.get().d((Object)a);
                        return zbs.e((Object)null);
                        o = f;
                        final Exception ex2;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", (Throwable)ex2);
                        continue;
                    }
                }
                finally {}
            }
            wx4.a((Closeable)o, "Failed to close settings writer.");
        }
        return zbs.e((Object)null);
    }
}
