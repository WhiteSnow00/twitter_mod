// 
// Decompiled by Procyon v0.6.0
// 

public final class uri
{
    public static final a Companion;
    public final hqi a;
    public final vvi b;
    public final gwo c;
    
    static {
        Companion = new a();
    }
    
    public uri(final hqi a, final vvi b, final gwo c) {
        czd.f((Object)a, "notificationChannelsProvider");
        czd.f((Object)b, "accountSettingsRepository");
        czd.f((Object)c, "mainScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final class a
    {
    }
}
