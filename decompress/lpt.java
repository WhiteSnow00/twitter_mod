import java.util.Arrays;
import android.util.Log;
import com.google.firebase.messaging.TopicOperation$TopicOperations;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpt
{
    public static final Pattern d;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }
    
    public lpt(@TopicOperation$TopicOperations final String b, final String s) {
        String substring;
        if (s != null && s.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", b));
            substring = s.substring(8);
        }
        else {
            substring = s;
        }
        if (substring != null && lpt.d.matcher(substring).matches()) {
            this.a = substring;
            this.b = b;
            this.c = c0e.h(b, "!", s);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", substring, "[a-zA-Z0-9-_.~%]{1,900}"));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof lpt;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final lpt lpt = (lpt)o;
        boolean b3 = b2;
        if (this.a.equals(lpt.a)) {
            b3 = b2;
            if (this.b.equals(lpt.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.a });
    }
}
