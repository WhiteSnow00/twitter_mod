import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c10
{
    public static final a Companion;
    public final u00 a;
    public final o00 b;
    
    static {
        Companion = new a();
    }
    
    public c10(final u00 a, final o00 b) {
        zzd.f((Object)a, "logRepositoryRegistry");
        zzd.f((Object)b, "logFlushScheduler");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final UserIdentifier userIdentifier, final Object o) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f(o, "log");
        final u00 a = this.a;
        Objects.requireNonNull(a);
        final Class<?> class1 = o.getClass();
        final Object value = a.a.get(class1);
        final int a2 = w4j.a;
        final t00 t00 = (t00)value;
        if (t00 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to find AnalyticsLogRepository for class ");
            sb.append(class1);
            e9a.d((Throwable)new IllegalStateException(sb.toString()));
        }
        if (t00 != null) {
            t00.e(userIdentifier, o);
            this.b.a();
        }
    }
    
    public final void b(final UserIdentifier userIdentifier, final Object o) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f(o, "log");
        xw0.c((rj)new b10((Object)this, (Object)userIdentifier, o, 0));
    }
    
    public static final class a
    {
    }
}
