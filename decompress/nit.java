import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nit
{
    public final UserIdentifier a;
    public final oit b;
    public boolean c;
    public final psa d;
    
    public nit(final UserIdentifier a, final oit b) {
        zzd.f((Object)a, "userIdentifier");
        this.a = a;
        this.b = b;
        this.d = psa.d(((Enum)b).name(), a);
    }
    
    public final boolean a() {
        final UserIdentifier a = this.a;
        final oio a2 = oio.a;
        if (!yk.B(a, "userIdentifier", a, "android_audio_room_nux_tooltips", false)) {
            return true;
        }
        final UserIdentifier a3 = this.a;
        if (yk.B(a3, "userIdentifier", a3, "android_audio_room_nux_tooltips_ignore_fatigue", false)) {
            return this.c;
        }
        return this.d.c() ^ true;
    }
}
