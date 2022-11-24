import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpl
{
    public static final a Companion;
    public final PackageManager a;
    public final sve b;
    public final dh1 c;
    
    static {
        Companion = new a();
    }
    
    public dpl(final PackageManager a, final sve b, final dh1 c) {
        e0e.f((Object)a, "packageManager");
        e0e.f((Object)b, "launcherBadgerRegistry");
        e0e.f((Object)c, "badgeCountRepository");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final class a
    {
    }
}
