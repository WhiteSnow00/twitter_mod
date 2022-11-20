import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.twitter.rooms.ui.spacebar.FleetlineViewBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d3b extends ste implements qsb<tmi, fzv>
{
    public final FleetlineViewBinder D0;
    
    public d3b(final FleetlineViewBinder d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tmi tmi = (tmi)o;
        final aoq b = this.D0.b;
        Objects.requireNonNull(b);
        final af4 af4 = new af4(new vba("home", "fleets", "fleet_line", "", "scroll"));
        ((u0p)af4).i((j0p)new n2b(String.valueOf(b.b.getSessionId()), UserIdentifier.Companion.c().getStringId(), (Integer)null, (Integer)null, (Long)null, -258));
        b.a.c((elm)af4);
        return fzv.a;
    }
}
