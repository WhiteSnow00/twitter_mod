import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import android.net.TrafficStats;
import java.util.Locale;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.preference.PreferenceManager;
import android.os.Process;
import java.util.Timer;
import android.content.Context;
import com.twitter.network.usage.DataUsageEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n98 implements tca<DataUsageEvent>
{
    public final znl<n98.n98$b> F0;
    public final icu G0;
    public final l98 H0;
    public final Context I0;
    public Timer J0;
    public final int K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public long O0;
    public long P0;
    public long Q0;
    public long R0;
    public boolean S0;
    public final e39 T0;
    
    public n98(final Context i0, final icu g0, final l98 h0) {
        this.T0 = new e39();
        this.I0 = i0;
        this.G0 = g0;
        this.H0 = h0;
        this.K0 = Process.myUid();
        this.F0 = (znl<n98.n98$b>)new znl();
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(i0);
        if (defaultSharedPreferences != null) {
            this.M0 = defaultSharedPreferences.getBoolean("data_usage_meter", false);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)new m98(this, i0));
        }
        if (this.c()) {
            this.f();
        }
    }
    
    public static n98 a() {
        return brg.b().P3();
    }
    
    public static String b(final long n) {
        if (n < 1024L) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(" B");
            return sb.toString();
        }
        final double n2 = (double)n;
        final int n3 = (int)(Math.log(n2) / Math.log(1024.0));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("KMGTPE".charAt(n3 - 1));
        sb2.append("i");
        return String.format(Locale.US, "%.1f %sB", n2 / Math.pow(1024.0, n3), sb2.toString());
    }
    
    public final boolean c() {
        synchronized (this) {
            po.b().t();
            return false;
        }
    }
    
    public final void d() {
        this.F0.onNext((Object)new n98.n98$b(this, this.P0, this.Q0, this.R0));
        this.S0 = false;
    }
    
    public final void e() {
        synchronized (this) {
            this.N0 = this.G0.b();
            this.O0 = TrafficStats.getUidRxBytes(this.K0) + TrafficStats.getUidTxBytes(this.K0);
            this.P0 = 0L;
            this.Q0 = 0L;
            this.R0 = 0L;
            this.d();
        }
    }
    
    public final void f() {
        synchronized (this) {
            if (!this.L0) {
                this.T0.c(rh.a().b().i().subscribe((rk6)new eym((Object)this, 4)));
                this.e();
                ((u5f)this.H0).b((tca)this);
                final Timer j0 = new Timer();
                this.J0 = j0;
                final n98$a n98$a = new n98$a(this);
                final TimeUnit seconds = TimeUnit.SECONDS;
                j0.scheduleAtFixedRate((TimerTask)n98$a, seconds.toMillis(1L), seconds.toMillis(1L));
                this.L0 = true;
                this.M0 = true;
            }
        }
    }
    
    public void onEvent(final DataUsageEvent dataUsageEvent) {
        synchronized (this) {
            this.S0 = true;
            final long q0 = this.Q0;
            final long f = dataUsageEvent.f;
            final long g = dataUsageEvent.g;
            this.Q0 = f + g + q0;
            if (dataUsageEvent.a == s98.I0) {
                this.R0 += f + g;
            }
        }
    }
    
    public /* bridge */ void onEvent(final Object o) {
        this.onEvent((DataUsageEvent)o);
    }
}
