import java.util.List;
import com.twitter.rooms.ui.utils.endscreen.RoomEndScreenViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class shn extends ste implements qsb<pyh<whn, t21>, fzv>
{
    public final RoomEndScreenViewModel D0;
    public final List<w0r> E0;
    public final tg5 F0;
    public final t21 G0;
    
    public shn(final RoomEndScreenViewModel d0, final List<? extends w0r> e0, final tg5 f0, final t21 g0) {
        this.D0 = d0;
        this.E0 = (List<w0r>)e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new qhn(this.D0, (List)this.E0, this.F0, (go6)null));
        pyh.c((ftb)new rhn(this.D0, (List)this.E0, this.G0, this.F0, (go6)null));
        return fzv.a;
    }
}
