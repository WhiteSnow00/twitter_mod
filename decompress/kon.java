import com.twitter.weaver.mvi.MviViewModel;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import com.twitter.rooms.ui.core.hostreconnect.RoomHostReconnectViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.core.hostreconnect.RoomHostReconnectViewModel$fetchAudioSpace$1$1", f = "RoomHostReconnectViewModel.kt", l = {}, m = "invokeSuspend")
public final class kon extends p0s implements ftb<lvj<? extends r21, ? extends t21>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomHostReconnectViewModel E0;
    public final String F0;
    
    public kon(final RoomHostReconnectViewModel e0, final String f0, final go6<? super kon> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final kon kon = new kon(this.E0, this.F0, (go6<? super kon>)go6);
        kon.D0 = d0;
        return (go6<fzv>)kon;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final kon kon = (kon)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        kon.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        final RoomHostReconnectViewModel e0 = this.E0;
        final String f0 = this.F0;
        final r21 r21 = (r21)lvj.D0;
        final t21 t21 = (t21)lvj.E0;
        final coe[] v0 = RoomHostReconnectViewModel.V0;
        Objects.requireNonNull(e0);
        ((MviViewModel)e0).Q((qsb)new non(r21, t21, e0, f0));
        if (djo.P()) {
            final Long l = r21.L;
            if (l != null) {
                final long longValue = l.longValue();
                final h5j interval = h5j.interval(0L, 1000L, TimeUnit.MILLISECONDS);
                czd.e((Object)interval, "interval(0, TimeUtils.SE\u2026S, TimeUnit.MILLISECONDS)");
                MviViewModel.M((MviViewModel)e0, interval, (String)null, (jrx)null, (ftb)new oon(e0, longValue, (go6)null), 3, (Object)null);
            }
        }
        return fzv.a;
    }
}
