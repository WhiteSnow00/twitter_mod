import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class col
{
    public static final a Companion;
    public final PackageManager a;
    public final jve b;
    public final fh1 c;
    
    static {
        Companion = new a();
    }
    
    public col(final PackageManager a, final jve b, final fh1 c) {
        zzd.f((Object)a, "packageManager");
        zzd.f((Object)b, "launcherBadgerRegistry");
        zzd.f((Object)c, "badgeCountRepository");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final class a
    {
    }
}
