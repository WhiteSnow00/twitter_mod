import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knw
{
    public static final long b;
    public static final Pattern c;
    public static knw d;
    public final ii8 a;
    
    static {
        b = TimeUnit.HOURS.toSeconds(1L);
        c = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    public knw(final ii8 a) {
        this.a = a;
    }
    
    public static knw c() {
        if (ii8.K0 == null) {
            ii8.K0 = new ii8();
        }
        final ii8 k0 = ii8.K0;
        if (knw.d == null) {
            knw.d = new knw(k0);
        }
        return knw.d;
    }
    
    public final long a() {
        Objects.requireNonNull(this.a);
        return System.currentTimeMillis();
    }
    
    public final long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }
    
    public final boolean d(final u7k u7k) {
        return TextUtils.isEmpty((CharSequence)u7k.a()) || u7k.b() + u7k.g() < this.b() + knw.b;
    }
}
