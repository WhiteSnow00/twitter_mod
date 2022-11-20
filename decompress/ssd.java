import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ssd
{
    public final Map<String, tsd> a;
    public final sql b;
    public final bev c;
    public final wc6 d;
    
    public ssd(final xbm xbm, final Map<String, ? extends tsd> a, final sql b, final bev c) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)b, "pushNotificationsRepository");
        czd.f((Object)c, "notificationManager");
        this.a = (Map<String, tsd>)a;
        this.b = b;
        this.c = c;
        this.d = new wc6();
        xbm.i((oj)new qt1((Object)this, 15));
    }
}
