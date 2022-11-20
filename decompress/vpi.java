import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vpi
{
    public static final a Companion;
    public final ypi a;
    
    static {
        Companion = new a();
    }
    
    public vpi(final ypi a) {
        czd.f((Object)a, "repository");
        this.a = a;
    }
    
    public static final vpi a() {
        Objects.requireNonNull(vpi.Companion);
        Objects.requireNonNull(qyi.Companion);
        return ((qyi)((b5j)cr0.Companion.a()).B((Class)qyi.class)).B8();
    }
    
    public final boolean b(final UserIdentifier userIdentifier) {
        return bo1.B(userIdentifier, "userIdentifier", userIdentifier, "android_default_priority_magic_rec_channel", false);
    }
    
    public final boolean c(final UserIdentifier userIdentifier) {
        return bo1.B(userIdentifier, "userIdentifier", userIdentifier, "android_high_priority_magic_rec_channel", false);
    }
    
    public final boolean d(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        final m4s a = hq1.a;
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - this.a.a(userIdentifier)) < asa.e(userIdentifier).h("withhold_priority_mr_channels_new_user_days", 0L);
    }
    
    public static final class a
    {
    }
}
