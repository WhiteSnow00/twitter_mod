import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j7o extends ste implements qsb<Throwable, fzv>
{
    public static final j7o D0;
    
    static {
        D0 = new j7o();
    }
    
    public j7o() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "it");
        final Throwable t2 = new Throwable("RoomSharedContentManager: sendTweetToAudioSpace", t);
        if (t instanceof IOException) {
            m8a.h(t2);
        }
        else {
            m8a.d(t2);
        }
        return fzv.a;
    }
}
