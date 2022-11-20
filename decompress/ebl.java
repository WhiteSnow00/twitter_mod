import java.util.AbstractCollection;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLException;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import com.twitter.media.util.MediaException;
import java.io.IOException;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebl
{
    public final Context a;
    public final UserIdentifier b;
    public final String c;
    public final String d;
    public final lrc e;
    public final StringBuilder f;
    public final pyg g;
    public boolean h;
    public int i;
    public long j;
    public List<f7d> k;
    
    public ebl(final Context context, final UserIdentifier b, final String c, final String d, final lrc e) {
        final qyg g = new qyg();
        this.f = new StringBuilder();
        final gdd$b e2 = gdd.E0;
        final int a = c5j.a;
        this.k = (AbstractCollection)e2;
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = (pyg)g;
    }
    
    public final void a(final String s, final String s2, final Exception ex) {
        if (this.f.length() > 0) {
            this.f.append(',');
        }
        toe.j(this.f, s, '=', s2);
        if (ex != null) {
            final StringBuilder f = this.f;
            f.append(",Cause_ex=\"");
            f.append(ex);
            f.append('\"');
        }
    }
    
    public final xrc<tmi, tmi> b(final jvg jvg, c2h g0, final cw0 cw0, final Map<String, ?> map) {
        cw0.b("uploadDuration");
        final oyg c = ((qyg)this.g).c(this.a, jvg, g0, this.b);
        this.i = 0;
        this.k = new ArrayList();
        xrc xrc = null;
        xrc xrc2;
        while (true) {
            final StringBuilder f = this.f;
            f.delete(0, f.length());
            final jvg next = c.next();
            if (next != null) {
                g0 = (c2h)arc$b.G0;
                final tqc$a tqc$a = new tqc$a();
                final StringBuilder j = fu8.j("/1.1/account/");
                j.append(this.c);
                j.append(".json");
                tqc$a.m(j.toString());
                Object d0;
                if (map == null) {
                    d0 = k2a.D0;
                }
                else {
                    d0 = map;
                }
                tqc$a.i((Map)d0);
                y1h.a(tqc$a, next.e);
                final tqc k = tqc$a.k();
                final Context a = this.a;
                final UserIdentifier b = this.b;
                final String a2 = k.a(lcv.a());
                final lrc e = this.e;
                final String d2 = this.d;
                final Uri fromFile = Uri.fromFile(next.a);
                hth i = null;
                Label_0280: {
                    if (d2 != null && fromFile != null) {
                        try {
                            final uwm uwm = new uwm(a, fromFile);
                            i = new hth();
                            i.f(d2, ikr.p(8), (twm)uwm, uwm.b(), lm6.H0);
                            i.g();
                            break Label_0280;
                        }
                        catch (final IOException ex) {
                            m8a.d((Throwable)ex);
                        }
                    }
                    i = null;
                }
                if (i == null) {
                    final MediaException ex2 = new MediaException("Error creating entity from image");
                    this.a("Cause", "setEntity", (Exception)ex2);
                    xrc = xrc.b(1007, (Exception)ex2);
                }
                else {
                    final f7d f7d = new f7d();
                    final long n = i.H0;
                    final StringBuilder l = fu8.j("upload-");
                    l.append(this.i);
                    f7d.f = l.toString();
                    f7d.a = n;
                    final m4s a3 = hq1.a;
                    f7d.d = System.currentTimeMillis();
                    ++this.i;
                    if (a2 == null) {
                        throw new IllegalStateException();
                    }
                    final brc f2 = brc.f(b);
                    ((gm1)f2).d((CharSequence)a2);
                    ((gm1)f2).h = (arc$b)g0;
                    final int a4 = c5j.a;
                    f2.x = true;
                    ((gm1)f2).q = (mrc)gev.c();
                    ((gm1)f2).j = e;
                    ((gm1)f2).i = i;
                    final arc e2 = f2.e();
                    e2.t = 60000;
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final wsl wsl = new wsl((Object)e2, (Object)atomicBoolean, 3);
                    final Handler handler = new Handler(Looper.getMainLooper());
                    handler.postDelayed((Runnable)wsl, 120000L);
                    e2.d();
                    handler.removeCallbacks((Runnable)wsl);
                    final boolean value = atomicBoolean.get();
                    if (e2.z()) {
                        this.h = false;
                    }
                    else {
                        final Exception c2 = e2.n.c;
                        if (c2 != null) {
                            this.a("Cause", "NetworkError", c2);
                            this.h = (c2 instanceof SSLException || c2 instanceof SocketTimeoutException);
                        }
                        else {
                            if (value) {
                                this.a("Cause", "ForcedTimeout", null);
                            }
                            this.h = value;
                        }
                    }
                    xrc = xrc.a(e2, (asc)null);
                    f7d.c = e2.n.a;
                    if (f7d.d != 0L) {
                        final long e3 = System.currentTimeMillis() - f7d.d;
                        f7d.e = e3;
                        if (e3 != 0L) {
                            f7d.b = f7d.a / e3 * 1000L;
                        }
                    }
                    ((List)this.k).add(f7d);
                    if (e2.z()) {
                        this.j = n;
                    }
                }
                xrc2 = xrc;
                if (xrc.b) {
                    break;
                }
                if (xrc.c != 0) {
                    xrc2 = xrc;
                    break;
                }
            }
            if (this.h && !c.isDone()) {
                continue;
            }
            xrc2 = xrc;
            break;
        }
        c.close();
        this.a("FileSize", String.valueOf(this.j), null);
        if (xrc2 == null) {
            xrc2 = new xrc();
        }
        cw0.c("uploadDuration");
        return (xrc<tmi, tmi>)xrc2;
    }
}
