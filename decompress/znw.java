import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class znw
{
    public static final long b;
    public static final Pattern c;
    public static znw d;
    public final lai a;
    
    static {
        b = TimeUnit.HOURS.toSeconds(1L);
        c = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    public znw(final lai a) {
        this.a = a;
    }
    
    public static znw c() {
        if (lai.G0 == null) {
            lai.G0 = new lai();
        }
        final lai g0 = lai.G0;
        if (znw.d == null) {
            znw.d = new znw(g0);
        }
        return znw.d;
    }
    
    public final long a() {
        Objects.requireNonNull(this.a);
        return System.currentTimeMillis();
    }
    
    public final long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }
    
    public final boolean d(final i8k i8k) {
        return TextUtils.isEmpty((CharSequence)i8k.a()) || i8k.b() + i8k.g() < this.b() + znw.b;
    }
}
