import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aac extends msc
{
    public final bac a;
    public final eac b;
    
    public aac(final bac a) {
        this.b = new eac();
        this.a = a;
    }
    
    public final void a(final asc asc, final long n, final UserIdentifier userIdentifier) {
        final eac b = this.b;
        final bac a = this.a;
        Objects.requireNonNull(b);
        String b2 = null;
        r3j a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = null;
        }
        if (a != null) {
            b2 = a.b;
        }
        if (a2 != null && flr.g((CharSequence)b2)) {
            final String a3 = a2.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Bearer ");
            sb.append(a3);
            asc.E("Authorization", sb.toString());
            asc.E("X-Guest-Token", b2);
        }
    }
    
    public final boolean b(final UserIdentifier userIdentifier) {
        return false;
    }
}
