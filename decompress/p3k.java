import java.util.Iterator;
import java.util.List;
import java.util.Map;
import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Response;
import okhttp3.Request$Builder;
import okhttp3.OkHttpClient;
import java.util.Set;
import android.os.Build$VERSION;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import androidx.work.c;
import com.twitter.ui.emoji.TwemojiFontDownloadWorker;
import java.io.FilenameFilter;
import java.io.File;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3k implements Callable
{
    public final int F0;
    public final Object G0;
    
    public p3k(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        final int f0 = this.F0;
        int i = 0;
        switch (f0) {
            default: {
                final oae oae = (oae)this.G0;
                e0e.f((Object)oae, "this$0");
                final clr c = oae.c;
                final File[] listFiles = ((File)c.F0).listFiles((FilenameFilter)new nkb(c));
                if (listFiles != null) {
                    while (i < listFiles.length) {
                        final File file = listFiles[i];
                        final j2e$a companion = j2e.Companion;
                        e0e.e((Object)file, "file");
                        companion.f(file);
                        ++i;
                    }
                }
                final lsx l = ((ssx)((n5j)cr0.a()).B((Class)ssx.class)).l();
                final uga f2 = uga.F0;
                final emj.a a = new emj.a((Class<? extends c>)TwemojiFontDownloadWorker.class);
                final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                final emj.a a2 = (emj.a)a.e(1, 10000L);
                final LinkedHashSet set = new LinkedHashSet();
                Object o;
                if (Build$VERSION.SDK_INT >= 24) {
                    o = rr4.n2((Iterable)set);
                }
                else {
                    o = r3a.F0;
                }
                a2.c.j = new wj6(3, false, false, false, false, -1L, -1L, (Set)o);
                l.f("TwemojiFontDownloadJob", f2, (emj)a2.b());
                return oae.b;
            }
            case 2: {
                String s = (String)this.G0;
                final tfx$a companion2 = tfx.Companion;
                e0e.f((Object)s, "$url");
                final String header$default = Response.header$default(new OkHttpClient().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request$Builder().url(s).build()).execute(), "Location", (String)null, 2, (Object)null);
                if (header$default != null) {
                    s = header$default;
                }
                return s;
            }
            case 1: {
                final s8s s8s = (s8s)this.G0;
                final Map d = s8s.a.d();
                List c2;
                final List list = c2 = s8s.a.c();
                if (true ^ d.isEmpty()) {
                    Objects.requireNonNull(s8s.b);
                    e0e.f((Object)list, "defaultValues");
                    c2 = new ArrayList<v8s>(nr4.d1((Iterable)list, 10));
                    for (final v8s v8s : list) {
                        final j8s a3 = v8s.a;
                        ((ArrayList<v8s>)c2).add(new v8s(j8s.a(a3), d.containsKey(a3.a), v8s.c));
                    }
                }
                return c2;
            }
            case 0: {
                final Context context = (Context)this.G0;
                e0e.f((Object)context, "$context");
                return context.getSystemService("captioning");
            }
        }
    }
}
