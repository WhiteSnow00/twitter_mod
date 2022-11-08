import java.util.Locale;
import java.util.List;
import java.util.Objects;
import android.os.Handler;
import android.os.Looper;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2u implements mtr<String, ocv>
{
    public final a2u a;
    
    public e2u(final Context context) {
        this.a = new a2u(context, UserIdentifier.getCurrent(), hhv.b(), new Handler(Looper.getMainLooper()));
    }
    
    public final void b(final String s, final a<String, ocv> a) {
        final a2u a2 = this.a;
        final UserIdentifier c = a2.c;
        final Locale locale = a2.b.getResources().getConfiguration().locale;
        boolean b = false;
        Label_0113: {
            if (locale != null) {
                final xau e = wau.e(c, "trend_loc_prefs");
                final String j = e.j("lang", "");
                final String i = e.j("country", "");
                if (!pjr.e((CharSequence)j) && j.equals(locale.getLanguage()) && !pjr.e((CharSequence)i) && i.equals(locale.getCountry())) {
                    b = false;
                    break Label_0113;
                }
            }
            b = true;
        }
        if (b) {
            this.c(s, a);
        }
        else {
            final b2u d = this.a.d;
            Objects.requireNonNull(d);
            zzd.f((Object)s, "query");
            final List list = (List)d.a.S((Object)s).e();
            if (list.isEmpty() && pjr.e((CharSequence)s)) {
                this.c(s, a);
            }
            else {
                final ijf h = ijf.H();
                h.q((Iterable)list);
                a.a(s, (i4e<? extends ocv>)new skf((Iterable)((h4j)h).e()));
            }
        }
    }
    
    public final void c(final String s, final a<String, ocv> a) {
        final a2u a2 = this.a;
        final rno rno = new rno((Object)this, (Object)s, (Object)a);
        synchronized (a2) {
            monitorenter(a2);
            Label_0084: {
                try {
                    final yqm e = a2.e;
                    if (e != null) {
                        a2.a.removeCallbacks((Runnable)e);
                        a2.e = null;
                    }
                }
                finally {
                    break Label_0084;
                }
                monitorexit(a2);
                final Throwable t;
                final yqm e2 = new yqm((Object)a2, (Object)t, 8);
                a2.e = e2;
                a2.a.postDelayed((Runnable)e2, a2.f);
                return;
            }
        }
    }
    
    @Override
    public final void cancel() {
        final a2u a = this.a;
        synchronized (a) {
            final yqm e = a.e;
            if (e != null) {
                a.a.removeCallbacks((Runnable)e);
                a.e = null;
            }
        }
    }
}
