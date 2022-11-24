import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class utd
{
    public final Map<String, vtd> a;
    public final erl b;
    public final pev c;
    public final de6 d;
    
    public utd(final kcm kcm, final Map<String, ? extends vtd> a, final erl b, final pev c) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)b, "pushNotificationsRepository");
        e0e.f((Object)c, "notificationManager");
        this.a = (Map<String, vtd>)a;
        this.b = b;
        this.c = c;
        this.d = new de6();
        kcm.i((sj)new gwt((Object)this, 13));
    }
}
