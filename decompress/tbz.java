import android.os.BaseBundle;
import android.content.Context;
import java.util.Locale;
import java.util.List;
import android.util.Log;
import java.util.UUID;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tbz implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public tbz(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public tbz(final Object h0, final Object g0, final int f0, final j98 j98) {
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        Label_0897: {
            switch (this.F0) {
                default: {
                    break Label_0897;
                }
                case 4: {
                    try {
                        ((c100)this.G0).x(((Callable)this.H0).call());
                    }
                    catch (final Exception ex) {
                        ((c100)this.G0).w(ex);
                    }
                    finally {
                        final Throwable t;
                        ((c100)this.G0).w(new RuntimeException(t));
                    }
                    return;
                }
                case 3: {
                    ((AppMeasurementDynamiteService)this.H0).a.B().C((aqy)this.G0, ((AppMeasurementDynamiteService)this.H0).a.g());
                    return;
                }
                case 2: {
                    final AtomicReference atomicReference = (AtomicReference)this.G0;
                    monitorenter(atomicReference);
                    try {
                        final AtomicReference atomicReference2 = (AtomicReference)this.G0;
                        final Object h0 = this.H0;
                        atomicReference2.set(((ocz)h0).F0.L0.j(((ocz)h0).F0.r().l(), s0z.P));
                        return;
                    }
                    finally {
                        this.G0.notify();
                    }
                    try {}
                    finally {
                        monitorexit(atomicReference);
                    }
                }
                case 1: {
                    final ahz ahz = (ahz)this.H0;
                    final Bundle bundle = (Bundle)this.G0;
                    ((wxy)ahz).g();
                    ((v2z)ahz).h();
                    iuk.C((Object)bundle);
                    final String string = ((BaseBundle)bundle).getString("name");
                    final String string2 = ((BaseBundle)bundle).getString("origin");
                    iuk.z(string);
                    iuk.z(string2);
                    iuk.C(((BaseBundle)bundle).get("value"));
                    if (!((ocz)ahz).F0.h()) {
                        ((ocz)ahz).F0.b().S0.a("Conditional property not set since app measurement is disabled");
                        return;
                    }
                }
                case 0: {
                    Label_0562: {
                        break Label_0562;
                        final Bundle bundle;
                        final String string;
                        final String string2;
                        final xpz xpz = new xpz(string, ((BaseBundle)bundle).getLong("triggered_timestamp"), ((BaseBundle)bundle).get("value"), string2);
                        try {
                            final ahz ahz;
                            ((ocz)ahz).F0.z().l(new kby(((BaseBundle)bundle).getString("app_id"), string2, xpz, ((BaseBundle)bundle).getLong("creation_timestamp"), false, ((BaseBundle)bundle).getString("trigger_event_name"), ((ocz)ahz).F0.B().s0(((BaseBundle)bundle).getString("app_id"), ((BaseBundle)bundle).getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true), ((BaseBundle)bundle).getLong("trigger_timeout"), ((ocz)ahz).F0.B().s0(((BaseBundle)bundle).getString("app_id"), ((BaseBundle)bundle).getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true), ((BaseBundle)bundle).getLong("time_to_live"), ((ocz)ahz).F0.B().s0(((BaseBundle)bundle).getString("app_id"), ((BaseBundle)bundle).getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                            return;
                            while (true) {
                                long a = 0L;
                                Bundle bundle2;
                                ArrayList a2;
                                List<String> g;
                                f100 b;
                                moz moz;
                                rcs rcs;
                                String s;
                                Context a3;
                                String value;
                                String concat;
                                Context a4;
                                String value2;
                                String concat2;
                                m3r m3r;
                                Block_15:Block_18_Outer:
                                while (true) {
                                    iftrue(Label_0620:)(System.currentTimeMillis() <= a);
                                    break Block_15;
                                Block_19_Outer:
                                    while (true) {
                                        bundle2.putStringArrayList("module_names", new ArrayList(a2));
                                    Label_1024:
                                        while (true) {
                                            Label_0996: {
                                                break Label_0996;
                                                bundle2.putStringArrayList("languages", new ArrayList((Collection<? extends E>)g));
                                                break Label_1024;
                                            }
                                            iftrue(Label_1024:)(((ArrayList)g).isEmpty());
                                            continue;
                                        }
                                        ((BaseBundle)bundle2).putLong("total_bytes_to_download", 0L);
                                        ((BaseBundle)bundle2).putLong("bytes_downloaded", 0L);
                                        b.e(n3r.m(bundle2));
                                        return;
                                        Label_0870: {
                                            try {
                                                Label_0620: {
                                                    moz.c(moz.a);
                                                }
                                                break Label_0870;
                                            }
                                            catch (final olz olz) {
                                                rcs.a(olz);
                                                return;
                                            }
                                            s = UUID.randomUUID().toString();
                                            try {
                                                a3 = moz.a;
                                                if (!moz.b(a3).edit().putString("app_set_id", s).commit()) {
                                                    value = String.valueOf(a3.getPackageName());
                                                    if (value.length() != 0) {
                                                        concat = "Failed to store app set ID generated for App ".concat(value);
                                                    }
                                                    else {
                                                        concat = new String("Failed to store app set ID generated for App ");
                                                    }
                                                    Log.e("AppSet", concat);
                                                    throw new olz("Failed to store the app set ID.");
                                                }
                                                moz.c(a3);
                                                a4 = moz.a;
                                                if (!moz.b(a4).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                                    value2 = String.valueOf(a4.getPackageName());
                                                    if (value2.length() != 0) {
                                                        concat2 = "Failed to store app set ID creation time for App ".concat(value2);
                                                    }
                                                    else {
                                                        concat2 = new String("Failed to store app set ID creation time for App ");
                                                    }
                                                    Log.e("AppSet", concat2);
                                                    throw new olz("Failed to store the app set ID creation time.");
                                                }
                                                rcs.b(new co0(s));
                                            }
                                            catch (final olz olz2) {
                                                rcs.a(olz2);
                                            }
                                        }
                                        return;
                                        b = ((way)this.H0).b;
                                        m3r = (m3r)this.G0;
                                        a2 = m3r.a;
                                        g = way.g(m3r.b);
                                        bundle2 = new Bundle();
                                        ((BaseBundle)bundle2).putInt("session_id", 0);
                                        ((BaseBundle)bundle2).putInt("status", 5);
                                        ((BaseBundle)bundle2).putInt("error_code", 0);
                                        iftrue(Label_0996:)(a2.isEmpty());
                                        continue Block_19_Outer;
                                    }
                                    moz = (moz)this.G0;
                                    rcs = (rcs)this.H0;
                                    s = moz.b(moz.a).getString("app_set_id", (String)null);
                                    a = moz.a();
                                    iftrue(Label_0643:)(s == null);
                                    continue Block_18_Outer;
                                }
                                continue;
                            }
                        }
                        catch (final IllegalArgumentException ex2) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
}
