import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class um8
{
    public static final a Companion;
    public final erl a;
    public final chm b;
    
    static {
        Companion = new a();
    }
    
    public um8(final erl a, final chm b) {
        e0e.f((Object)a, "notificationsRepository");
        e0e.f((Object)b, "replaceProcessor");
        this.a = a;
        this.b = b;
    }
    
    public static final void a(final um8 um8, final String s, final UserIdentifier userIdentifier, String string) {
        Objects.requireNonNull(um8);
        final StringBuilder sb = new StringBuilder();
        sb.append("delay_");
        sb.append(string);
        string = sb.toString();
        final nda a = nda.a();
        final dda.a companion = dda.Companion;
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        a.b(userIdentifier, (tlm)new fg4(companion.e("notification", "status_bar", "", s2, string)));
    }
    
    public static final class a
    {
    }
}
