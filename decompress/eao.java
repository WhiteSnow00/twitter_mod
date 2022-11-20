import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager$k0;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$joinReplay$1$2$1$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class eao extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    
    public eao(final RoomStateManager e0, final go6<? super eao> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final eao eao = new eao(this.E0, (go6<? super eao>)go6);
        eao.D0 = d0;
        return (go6<fzv>)eao;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final eao eao = (eao)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        eao.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        final RoomStateManager e0 = this.E0;
        final eao$a d0 = eao$a.D0;
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        ((MviViewModel)e0).Q((qsb)d0);
        final RoomStateManager e2 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("joinReplay::join replay failed ");
        sb.append(t);
        RoomStateManager.Z(e2, sb.toString());
        return fzv.a;
    }
}
