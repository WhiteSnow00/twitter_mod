import java.util.regex.Matcher;
import java.util.Objects;
import android.text.TextUtils;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsc
{
    public static final Pattern a;
    public static final Pattern b;
    
    static {
        a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }
    
    public static String a(final long n, final long n2) {
        if (n == 0L && n2 == -1L) {
            return null;
        }
        final StringBuilder x = pd.x("bytes=", n, "-");
        if (n2 != -1L) {
            x.append(n + n2 - 1L);
        }
        return x.toString();
    }
    
    public static long b(String group) {
        final boolean empty = TextUtils.isEmpty((CharSequence)group);
        long long1 = -1L;
        if (empty) {
            return -1L;
        }
        final Matcher matcher = gsc.b.matcher(group);
        if (matcher.matches()) {
            group = matcher.group(1);
            Objects.requireNonNull(group);
            long1 = Long.parseLong(group);
        }
        return long1;
    }
}
