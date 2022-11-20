import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdo extends ste implements qsb<ynj<cgv>, fzv>
{
    public final mdo D0;
    public final String E0;
    
    public jdo(final mdo d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ynj ynj = (ynj)o;
        if (ynj.f()) {
            final RoomStateManager a = this.D0.a;
            final Object c = ynj.c();
            czd.e(c, "it.get()");
            final cgv cgv = (cgv)c;
            final String e0 = this.E0;
            Objects.requireNonNull(a);
            czd.f((Object)e0, "periscopeUserId");
            a.s0("Speaker added by external component");
            ((MviViewModel)a).T((qsb)new e9o(e0, cgv, a));
        }
        return fzv.a;
    }
}
