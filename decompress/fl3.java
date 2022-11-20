import com.twitter.media.av.autoplay.ui.VideoContainerHost;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fl3 extends ste implements qsb<dl3$a, Boolean>
{
    public final VideoContainerHost D0;
    
    public fl3(final VideoContainerHost d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final dl3$a dl3$a = (dl3$a)o;
        boolean b;
        if (czd.a((Object)dl3$a.D0, (Object)this.D0.getAutoPlayableItem())) {
            dl3$a.E0.dispose();
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
