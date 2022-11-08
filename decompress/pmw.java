import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmw
{
    public static final long b;
    public static final Pattern c;
    public static pmw d;
    public final h6q a;
    
    static {
        b = TimeUnit.HOURS.toSeconds(1L);
        c = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    public pmw(final h6q a) {
        this.a = a;
    }
    
    public static pmw c() {
        if (h6q.H0 == null) {
            h6q.H0 = new h6q();
        }
        final h6q h0 = h6q.H0;
        if (pmw.d == null) {
            pmw.d = new pmw(h0);
        }
        return pmw.d;
    }
    
    public final long a() {
        Objects.requireNonNull(this.a);
        return System.currentTimeMillis();
    }
    
    public final long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }
    
    public final boolean d(final n7k n7k) {
        return TextUtils.isEmpty((CharSequence)n7k.a()) || n7k.b() + n7k.g() < this.b() + pmw.b;
    }
}
