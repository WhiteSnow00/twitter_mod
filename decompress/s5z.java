import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull$List;
import android.content.SharedPreferences$Editor;
import java.util.Objects;
import android.content.SharedPreferences;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5z extends rcz
{
    public static final Pair b1;
    public SharedPreferences H0;
    public k5z I0;
    public final d5z J0;
    public final o5z K0;
    public String L0;
    public boolean M0;
    public long N0;
    public final d5z O0;
    public final x4z P0;
    public final o5z Q0;
    public final x4z R0;
    public final d5z S0;
    public boolean T0;
    public final x4z U0;
    public final x4z V0;
    public final d5z W0;
    public final o5z X0;
    public final o5z Y0;
    public final d5z Z0;
    public final z4z a1;
    
    static {
        b1 = new Pair((Object)"", (Object)0L);
    }
    
    public s5z(final m9z m9z) {
        super(m9z);
        this.O0 = new d5z(this, "session_timeout", 1800000L);
        this.P0 = new x4z(this, "start_new_session", true);
        this.S0 = new d5z(this, "last_pause_time", 0L);
        this.Q0 = new o5z(this, "non_personalized_ads");
        this.R0 = new x4z(this, "allow_remote_dynamite", false);
        this.J0 = new d5z(this, "first_open_time", 0L);
        iuk.z("app_install_time");
        this.K0 = new o5z(this, "app_instance_id");
        this.U0 = new x4z(this, "app_backgrounded", false);
        this.V0 = new x4z(this, "deep_link_retrieval_complete", false);
        this.W0 = new d5z(this, "deep_link_retrieval_attempts", 0L);
        this.X0 = new o5z(this, "firebase_feature_rollouts");
        this.Y0 = new o5z(this, "deferred_attribution_cache");
        this.Z0 = new d5z(this, "deferred_attribution_cache_timestamp", 0L);
        this.a1 = new z4z(this);
    }
    
    @EnsuresNonNull$List({ @EnsuresNonNull({ "this.preferences" }), @EnsuresNonNull({ "this.monitoringSample" }) })
    @Override
    public final void h() {
        final SharedPreferences sharedPreferences = super.F0.F0.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.H0 = sharedPreferences;
        if (!(this.T0 = sharedPreferences.getBoolean("has_been_opened", false))) {
            final SharedPreferences$Editor edit = this.H0.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        Objects.requireNonNull(super.F0);
        this.I0 = new k5z(this, Math.max(0L, (long)s0z.d.a(null)));
    }
    
    @Override
    public final boolean i() {
        return true;
    }
    
    public final SharedPreferences n() {
        this.g();
        this.j();
        iuk.C((Object)this.H0);
        return this.H0;
    }
    
    public final jdy o() {
        this.g();
        return jdy.b(this.n().getString("consent_settings", "G1"));
    }
    
    public final Boolean p() {
        this.g();
        if (this.n().contains("measurement_enabled")) {
            return this.n().getBoolean("measurement_enabled", true);
        }
        return null;
    }
    
    public final void q(final Boolean b) {
        this.g();
        final SharedPreferences$Editor edit = this.n().edit();
        if (b != null) {
            edit.putBoolean("measurement_enabled", (boolean)b);
        }
        else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }
    
    public final void r(final boolean b) {
        this.g();
        super.F0.b().S0.b("App measurement setting deferred collection", (Object)b);
        final SharedPreferences$Editor edit = this.n().edit();
        edit.putBoolean("deferred_analytics_collection", b);
        edit.apply();
    }
    
    public final boolean s(final long n) {
        return n - this.O0.a() > this.S0.a();
    }
    
    public final boolean t(final int n) {
        final int int1 = this.n().getInt("consent_source", 100);
        final jdy b = jdy.b;
        return n <= int1;
    }
}
