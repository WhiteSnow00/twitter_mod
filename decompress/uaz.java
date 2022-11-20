import android.os.BaseBundle;
import android.content.Context;
import android.util.Log;
import java.util.UUID;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uaz implements Runnable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public uaz(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public uaz(final Object f0, final Object e0, final int d0, final da8 da8) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        Label_0897: {
            switch (this.D0) {
                default: {
                    break Label_0897;
                }
                case 4: {
                    try {
                        ((c000)this.E0).x(((Callable)this.F0).call());
                    }
                    catch (final Exception ex) {
                        ((c000)this.E0).w(ex);
                    }
                    finally {
                        final Throwable t;
                        ((c000)this.E0).w(new RuntimeException(t));
                    }
                    return;
                }
                case 3: {
                    ((AppMeasurementDynamiteService)this.F0).a.B().C((epy)this.E0, ((AppMeasurementDynamiteService)this.F0).a.g());
                    return;
                }
                case 2: {
                    final AtomicReference atomicReference = (AtomicReference)this.E0;
                    monitorenter(atomicReference);
                    try {
                        final AtomicReference atomicReference2 = (AtomicReference)this.E0;
                        final Object f0 = this.F0;
                        atomicReference2.set(((pbz)f0).D0.J0.j(((pbz)f0).D0.r().l(), uzy.P));
                        return;
                    }
                    finally {
                        this.E0.notify();
                    }
                    try {}
                    finally {
                        monitorexit(atomicReference);
                    }
                }
                case 1: {
                    final bgz bgz = (bgz)this.F0;
                    final Bundle bundle = (Bundle)this.E0;
                    ((axy)bgz).g();
                    ((x1z)bgz).h();
                    eli.q(bundle);
                    final String string = ((BaseBundle)bundle).getString("name");
                    final String string2 = ((BaseBundle)bundle).getString("origin");
                    eli.n(string);
                    eli.n(string2);
                    eli.q(((BaseBundle)bundle).get("value"));
                    if (!((pbz)bgz).D0.h()) {
                        ((pbz)bgz).D0.b().Q0.a("Conditional property not set since app measurement is disabled");
                        return;
                    }
                }
                case 0: {
                    Label_0562: {
                        break Label_0562;
                        final Bundle bundle;
                        final String string;
                        final String string2;
                        final yoz yoz = new yoz(string, ((BaseBundle)bundle).getLong("triggered_timestamp"), ((BaseBundle)bundle).get("value"), string2);
                        try {
                            final bgz bgz;
                            ((pbz)bgz).D0.z().l(new qay(((BaseBundle)bundle).getString("app_id"), string2, yoz, ((BaseBundle)bundle).getLong("creation_timestamp"), false, ((BaseBundle)bundle).getString("trigger_event_name"), ((pbz)bgz).D0.B().s0(((BaseBundle)bundle).getString("app_id"), ((BaseBundle)bundle).getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true), ((BaseBundle)bundle).getLong("trigger_timeout"), ((pbz)bgz).D0.B().s0(((BaseBundle)bundle).getString("app_id"), ((BaseBundle)bundle).getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true), ((BaseBundle)bundle).getLong("time_to_live"), ((pbz)bgz).D0.B().s0(((BaseBundle)bundle).getString("app_id"), ((BaseBundle)bundle).getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                            return;
                            Label_0870: {
                                mnz mnz = null;
                                zbs zbs = null;
                            Label_0643:
                                while (true) {
                                    final Bundle bundle2;
                                    final ArrayList a2;
                                    Block_18: {
                                        Block_15: {
                                            final f000 b;
                                            Label_1024: {
                                                while (true) {
                                                    final List g;
                                                    bundle2.putStringArrayList("languages", new ArrayList(g));
                                                    break Label_1024;
                                                    iftrue(Label_1024:)(((ArrayList)g).isEmpty());
                                                    continue;
                                                }
                                                try {
                                                    Label_0620: {
                                                        mnz.c(mnz.a);
                                                    }
                                                    break Label_0870;
                                                }
                                                catch (final pkz pkz) {
                                                    zbs.a((Exception)pkz);
                                                    return;
                                                }
                                                break Label_0643;
                                                mnz = (mnz)this.E0;
                                                zbs = (zbs)this.F0;
                                                final String s = mnz.b(mnz.a).getString("app_set_id", (String)null);
                                                final long a = mnz.a();
                                                iftrue(Label_0643:)(s == null);
                                                Block_14: {
                                                    break Block_14;
                                                    b = ((cay)this.F0).b;
                                                    final n2r n2r = (n2r)this.E0;
                                                    a2 = n2r.a;
                                                    final List g = cay.g((List)n2r.b);
                                                    bundle2 = new Bundle();
                                                    ((BaseBundle)bundle2).putInt("session_id", 0);
                                                    ((BaseBundle)bundle2).putInt("status", 5);
                                                    ((BaseBundle)bundle2).putInt("error_code", 0);
                                                    iftrue(Label_0996:)(a2.isEmpty());
                                                    break Block_18;
                                                }
                                                iftrue(Label_0620:)(System.currentTimeMillis() <= a);
                                                break Block_15;
                                            }
                                            ((BaseBundle)bundle2).putLong("total_bytes_to_download", 0L);
                                            ((BaseBundle)bundle2).putLong("bytes_downloaded", 0L);
                                            b.e(o2r.m(bundle2));
                                            return;
                                        }
                                        break Label_0643;
                                    }
                                    bundle2.putStringArrayList("module_names", new ArrayList(a2));
                                    continue;
                                }
                                final String s = UUID.randomUUID().toString();
                                try {
                                    final Context a3 = mnz.a;
                                    if (!mnz.b(a3).edit().putString("app_set_id", s).commit()) {
                                        final String value = String.valueOf(a3.getPackageName());
                                        String concat;
                                        if (value.length() != 0) {
                                            concat = "Failed to store app set ID generated for App ".concat(value);
                                        }
                                        else {
                                            concat = new String("Failed to store app set ID generated for App ");
                                        }
                                        Log.e("AppSet", concat);
                                        throw new pkz("Failed to store the app set ID.");
                                    }
                                    mnz.c(a3);
                                    final Context a4 = mnz.a;
                                    if (!mnz.b(a4).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                                        final String value2 = String.valueOf(a4.getPackageName());
                                        String concat2;
                                        if (value2.length() != 0) {
                                            concat2 = "Failed to store app set ID creation time for App ".concat(value2);
                                        }
                                        else {
                                            concat2 = new String("Failed to store app set ID creation time for App ");
                                        }
                                        Log.e("AppSet", concat2);
                                        throw new pkz("Failed to store the app set ID creation time.");
                                    }
                                    zbs.b((Object)new co0(s));
                                }
                                catch (final pkz pkz2) {
                                    zbs.a((Exception)pkz2);
                                }
                            }
                            return;
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
