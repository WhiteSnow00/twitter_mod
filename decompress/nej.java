import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nej
{
    public static final a Companion;
    public final gob a;
    public final kn b;
    public final UserIdentifier c;
    public final mbi<?> d;
    public final psc e;
    
    static {
        Companion = new a();
    }
    
    public nej(final gob a, final kn b, final UserIdentifier c, final mbi<?> d, final psc e) {
        zzd.f((Object)b, "activityFinisher");
        zzd.f((Object)c, "currentUser");
        zzd.f((Object)d, "navigator");
        zzd.f((Object)e, "httpRequestController");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final class a
    {
    }
}
