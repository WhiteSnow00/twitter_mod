import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djt
{
    public final UserIdentifier a;
    public final ejt b;
    public boolean c;
    public final mra d;
    
    public djt(final UserIdentifier a, final ejt b) {
        czd.f((Object)a, "userIdentifier");
        this.a = a;
        this.b = b;
        this.d = mra.d(((Enum)b).name(), a);
    }
    
    public final boolean a() {
        final UserIdentifier a = this.a;
        final djo a2 = djo.a;
        if (!bo1.B(a, "userIdentifier", a, "android_audio_room_nux_tooltips", false)) {
            return true;
        }
        final UserIdentifier a3 = this.a;
        if (bo1.B(a3, "userIdentifier", a3, "android_audio_room_nux_tooltips_ignore_fatigue", false)) {
            return this.c;
        }
        return this.d.c() ^ true;
    }
}
