import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkt
{
    public final UserIdentifier a;
    public final saw b;
    public final jev c;
    
    public fkt(final UserIdentifier a, final saw b, final jev c) {
        zzd.f((Object)a, "currentUser");
        zzd.f((Object)b, "eventReporter");
        zzd.f((Object)c, "scribeAssociation");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
