import java.util.Locale;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public class ocz implements Closeable
{
    public static final Map<String, ocz> K0;
    public final String D0;
    public int E0;
    public double F0;
    public long G0;
    public long H0;
    public long I0;
    public long J0;
    
    static {
        ocz.K0 = new HashMap();
    }
    
    public ocz() {
        this.I0 = 2147483647L;
        this.J0 = -2147483648L;
        this.D0 = "detectorTaskWithResource#run";
    }
    
    public ocz(final String s, final blz blz) {
        this.I0 = 2147483647L;
        this.J0 = -2147483648L;
        this.D0 = "unusedTag";
    }
    
    public static long e() {
        return SystemClock.elapsedRealtimeNanos() / 1000L;
    }
    
    public final void a() {
        this.E0 = 0;
        this.F0 = 0.0;
        this.G0 = 0L;
        this.I0 = 2147483647L;
        this.J0 = -2147483648L;
    }
    
    public ocz b() {
        this.G0 = e();
        return this;
    }
    
    public void c(final long n) {
        final long e = e();
        final long h0 = this.H0;
        if (h0 != 0L && e - h0 >= 1000000L) {
            this.a();
        }
        this.H0 = e;
        ++this.E0;
        this.F0 += n;
        this.I0 = Math.min(this.I0, n);
        this.J0 = Math.max(this.J0, n);
        if (this.E0 % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.D0, n, this.E0, this.I0, this.J0, (int)(this.F0 / this.E0));
            nfz.a();
        }
        if (this.E0 % 500 == 0) {
            this.a();
        }
    }
    
    @Override
    public void close() {
        final long g0 = this.G0;
        if (g0 != 0L) {
            this.d(g0);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
    
    public void d(final long n) {
        this.c(e() - n);
    }
}
