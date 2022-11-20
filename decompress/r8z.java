import android.os.BaseBundle;
import java.util.Iterator;
import java.util.Map;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzd;
import android.text.TextUtils;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r8z implements Runnable
{
    public final int D0;
    public final lbz E0;
    public final Object F0;
    public final Object G0;
    
    public r8z(final lbz e0, final Object f0, final Object g0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        final int d0 = this.D0;
        jny jny = null;
        switch (d0) {
            default: {
                final lbz e0 = this.E0;
                final wgy wgy = (wgy)this.F0;
                Objects.requireNonNull(e0);
                Object j0 = wgy;
                Label_0409: {
                    if ("_cmp".equals(wgy.D0)) {
                        final kgy e2 = wgy.E0;
                        j0 = wgy;
                        if (e2 != null) {
                            if (((BaseBundle)e2.D0).size() == 0) {
                                j0 = wgy;
                            }
                            else {
                                final String v = wgy.E0.v("_cis");
                                if (!"referrer broadcast".equals(v)) {
                                    j0 = wgy;
                                    if (!"referrer API".equals(v)) {
                                        break Label_0409;
                                    }
                                }
                                e0.a.b().O0.b("Event has been filtered ", (Object)wgy.toString());
                                j0 = new wgy("_cmpx", wgy.E0, wgy.F0, wgy.G0);
                            }
                        }
                    }
                }
                final lbz e3 = this.E0;
                final twz twz = (twz)this.G0;
                final g7z d2 = e3.a.D0;
                poz.I((zmz)d2);
                if (!d2.u(twz.D0)) {
                    e3.x((wgy)j0, twz);
                }
                else {
                    e3.a.b().Q0.b("EES config found for", (Object)twz.D0);
                    final g7z d3 = e3.a.D0;
                    poz.I((zmz)d3);
                    final String d4 = twz.D0;
                    if (!TextUtils.isEmpty((CharSequence)d4)) {
                        jny = (jny)((ieg<String, Object>)d3.M0).c(d4);
                    }
                    if (jny != null) {
                        try {
                            final voz j2 = e3.a.J0;
                            poz.I((zmz)j2);
                            final Map g = j2.G(((wgy)j0).E0.r(), true);
                            String s;
                            if ((s = xa8.v(((wgy)j0).D0)) == null) {
                                s = ((wgy)j0).D0;
                            }
                            if (jny.c(new x9y(s, ((wgy)j0).G0, g))) {
                                final gay c = jny.c;
                                if (c.b.equals((Object)c.a) ^ true) {
                                    e3.a.b().Q0.b("EES edited event", (Object)((wgy)j0).D0);
                                    j0 = e3.a.J0;
                                    poz.I((zmz)j0);
                                    e3.x(((voz)j0).z(jny.c.b), twz);
                                }
                                else {
                                    e3.x((wgy)j0, twz);
                                }
                                if (jny.c.c.isEmpty() ^ true) {
                                    final Iterator iterator = jny.c.c.iterator();
                                    while (iterator.hasNext()) {
                                        j0 = iterator.next();
                                        e3.a.b().Q0.b("EES logging created event", (Object)((x9y)j0).a);
                                        final voz j3 = e3.a.J0;
                                        poz.I((zmz)j3);
                                        e3.x(j3.z((x9y)j0), twz);
                                    }
                                }
                                return;
                            }
                        }
                        catch (final zzd zzd) {
                            e3.a.b().I0.c("EES error. appId, eventName", (Object)twz.E0, (Object)((wgy)j0).D0);
                        }
                        e3.a.b().Q0.b("EES was not applied to event", (Object)((wgy)j0).D0);
                        e3.x((wgy)j0, twz);
                    }
                    else {
                        e3.a.b().Q0.b("EES not loaded for", (Object)twz.D0);
                        e3.x((wgy)j0, twz);
                    }
                }
                return;
            }
            case 0: {
                final lbz e4 = this.E0;
                final String s2 = (String)this.F0;
                final Bundle bundle = (Bundle)this.G0;
                final zdy f0 = e4.a.F0;
                poz.I((zmz)f0);
                ((pbz)f0).g();
                ((zmz)f0).h();
                final nfy nfy = new nfy(((pbz)f0).D0, "", s2, "dep", 0L, bundle);
                final voz j4 = ((xmz)f0).E0.J0;
                poz.I((zmz)j4);
                final byte[] i = j4.A(nfy).i();
                ((pbz)f0).D0.b().Q0.c("Saving default event parameters, appId, data size", (Object)((pbz)f0).D0.P0.d(s2), (Object)i.length);
                final ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", s2);
                contentValues.put("parameters", i);
                try {
                    if (f0.A().insertWithOnConflict("default_event_params", (String)null, contentValues, 5) == -1L) {
                        ((pbz)f0).D0.b().I0.b("Failed to insert default event parameters (got -1). appId", q2z.s(s2));
                    }
                }
                catch (final SQLiteException ex) {
                    ((pbz)f0).D0.b().I0.c("Error storing default event parameters. appId", q2z.s(s2), (Object)ex);
                }
            }
        }
    }
}
