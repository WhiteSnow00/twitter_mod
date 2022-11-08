import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frq implements erq
{
    public final boolean a;
    public final boolean b;
    
    public frq(final int n, final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        final oio a = oio.a;
        final hlv a2 = dta.a(userIdentifier);
        final boolean b = false;
        this.a = a2.b("android_audio_room_nux_tooltips", false);
        boolean b2 = b;
        if (n != 2) {
            b2 = b;
            if (oio.a()) {
                b2 = true;
            }
        }
        this.b = b2;
    }
    
    public final boolean a() {
        return this.b;
    }
    
    public final boolean b() {
        return this.a;
    }
}
