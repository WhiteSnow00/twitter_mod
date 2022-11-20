import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwi implements dml<s9>
{
    public static final pwi.pwi$a Companion;
    public final UserIdentifier D0;
    public final ef4 E0;
    
    static {
        Companion = new pwi.pwi$a();
    }
    
    public pwi(final UserIdentifier d0, final ef4 e0) {
        czd.f((Object)d0, "owner");
        czd.f((Object)e0, "clientIdentity");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final s9 a() {
        final String stringId = this.D0.getStringId();
        final String b = this.E0.b();
        czd.e((Object)b, "clientIdentity.clientUuid");
        final String j = ikr.j((CharSequence)",", (Object[])new String[] { stringId, b });
        final bn9.a a = new bn9.a();
        a.a = da8.j("/1.1/strato/column/None/", j, "/notifications-client/notification-tabs/notificationTabs");
        return (s9)a.e();
    }
    
    public final /* bridge */ Object get() {
        return this.a();
    }
}
