import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qbn extends ste implements qsb<zwc$i, fzv>
{
    public final ran D0;
    
    public qbn(final ran d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zwc$i zwc$i = (zwc$i)o;
        if (zwc$i instanceof zwc$f) {
            this.D0.l.k().a(zwc$i.a, ((zwc$f)zwc$i).d);
        }
        final zwc$h b = zwc$i.b;
        if (b != zwc$h.F0 && b != zwc$h.E0) {
            if (b == zwc$h.G0) {
                final RoomStateManager u = this.D0.u;
                final String a = zwc$i.a;
                Objects.requireNonNull(u);
                czd.f((Object)a, "periscopeUserId");
                ((MviViewModel)u).T((qsb)new ebo(a, u));
            }
            else if (b == zwc$h.H0) {
                final RoomStateManager u2 = this.D0.u;
                final String a2 = zwc$i.a;
                Objects.requireNonNull(u2);
                czd.f((Object)a2, "periscopeUserId");
                ((MviViewModel)u2).T((qsb)new ebo(a2, u2));
            }
        }
        else {
            final RoomStateManager u3 = this.D0.u;
            final String a3 = zwc$i.a;
            Objects.requireNonNull(u3);
            czd.f((Object)a3, "periscopeUserId");
            ((MviViewModel)u3).T((qsb)new abo(a3, wa2.n(), u3));
        }
        return fzv.a;
    }
}
