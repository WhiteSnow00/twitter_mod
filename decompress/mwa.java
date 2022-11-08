import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwa extends i1v<eqi>
{
    public static final a Companion;
    public final dg4 i1;
    
    static {
        Companion = new a();
    }
    
    public mwa(final UserIdentifier userIdentifier, final dg4 i1) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)i1, "clientIdentity");
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final String stringId = super.P0.getStringId();
        final String b = this.i1.b();
        zzd.e((Object)b, "clientIdentity.clientUuid");
        final String j = pjr.j((CharSequence)",", (Object[])new String[] { stringId, b });
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.E0;
        final int a = w4j.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("/1.1/strato/column/None/");
        sb.append(j);
        sb.append("/notifications-client/notification-channels/notificationChannels");
        ((qrc.a)rbv).n(sb.toString(), ",/");
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<eqi, pav> g0() {
        return (wsc<eqi, pav>)f9g.c((Class)eqi.class);
    }
    
    public static final class a
    {
    }
}
