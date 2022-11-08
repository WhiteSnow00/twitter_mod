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

public final class a98 implements dca<DataUsageEvent>
{
    public final zml<a98.a98$b> C0;
    public final zau D0;
    public final y88 E0;
    public final Context F0;
    public Timer G0;
    public final int H0;
    public boolean I0;
    public boolean J0;
    public long K0;
    public long L0;
    public long M0;
    public long N0;
    public long O0;
    public boolean P0;
    public final m29 Q0;
    
    public a98(final Context f0, final zau d0, final y88 e0) {
        this.Q0 = new m29();
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
        this.H0 = Process.myUid();
        this.C0 = (zml<a98.a98$b>)new zml();
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f0);
        if (defaultSharedPreferences != null) {
            this.J0 = defaultSharedPreferences.getBoolean("data_usage_meter", false);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)new z88(this, f0));
        }
        if (this.c()) {
            this.f();
        }
    }
    
    public static a98 a() {
        return hy8.g().P3();
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
            bl0.a().t();
            return false;
        }
    }
    
    public final void d() {
        this.C0.onNext((Object)new a98.a98$b(this, this.M0, this.N0, this.O0));
        this.P0 = false;
    }
    
    public final void e() {
        synchronized (this) {
            this.K0 = this.D0.b();
            this.L0 = TrafficStats.getUidRxBytes(this.H0) + TrafficStats.getUidTxBytes(this.H0);
            this.M0 = 0L;
            this.N0 = 0L;
            this.O0 = 0L;
            this.d();
        }
    }
    
    public final void f() {
        synchronized (this) {
            if (!this.I0) {
                this.Q0.c(gp.b().b().i().subscribe((fk6)new tua(this, 13)));
                this.e();
                ((n5f)this.E0).b((dca)this);
                final Timer g0 = new Timer();
                this.G0 = g0;
                final a98$a a98$a = new a98$a(this);
                final TimeUnit seconds = TimeUnit.SECONDS;
                g0.scheduleAtFixedRate((TimerTask)a98$a, seconds.toMillis(1L), seconds.toMillis(1L));
                this.I0 = true;
                this.J0 = true;
            }
        }
    }
    
    public void onEvent(final DataUsageEvent dataUsageEvent) {
        synchronized (this) {
            this.P0 = true;
            final long n0 = this.N0;
            final long f = dataUsageEvent.f;
            final long g = dataUsageEvent.g;
            this.N0 = f + g + n0;
            if (dataUsageEvent.a == f98.F0) {
                this.O0 += f + g;
            }
        }
    }
}
