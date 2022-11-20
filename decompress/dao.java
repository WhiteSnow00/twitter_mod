import com.twitter.rooms.manager.RoomStateManager$l0;
import java.util.Map;
import tv.periscope.model.b;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$joinReplay$1$2$1$1", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class dao extends p0s implements ftb<GuestServiceJoinResponse, go6<? super fzv>, Object>
{
    public final RoomStateManager D0;
    public final Set<s21> E0;
    public final String F0;
    public final RoomObjectGraph G0;
    public final RoomObjectGraph H0;
    public final boolean I0;
    public final boolean J0;
    
    public dao(final RoomStateManager d0, final Set<s21> e0, final String f0, final RoomObjectGraph g0, final RoomObjectGraph h0, final boolean i0, final boolean j0, final go6<? super dao> go6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new dao(this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, (go6<? super dao>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final dao dao = (dao)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        dao.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        RoomStateManager.W(this.D0);
        final s21 s21 = (s21)mq4.f0((Iterable)this.E0);
        RoomStateManager.A0(this.D0, this.F0, s21.d(), s21.a);
        this.D0.C0(this.F0);
        this.D0.v0(this.G0);
        MviViewModel.M((MviViewModel)this.D0, (h5j)this.H0.w4().H0.O0, (String)null, (jrx)null, (ftb)new ftb<z7n.a, go6<? super fzv>, Object>(this.D0, null) {
            public Object D0;
            public final RoomStateManager E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<z7n.a, go6<? super fzv>, Object> ftb = (ftb<z7n.a, go6<? super fzv>, Object>)new ftb<z7n.a, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final RoomStateManager E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<z7n.a, go6<? super fzv>, Object> ftb = (ftb<z7n.a, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                RoomStateManager.Y(this.E0, (z7n.a)this.D0);
                return fzv.a;
            }
        }, 3, (Object)null);
        final RoomStateManager d0 = this.D0;
        ((MviViewModel)d0).T((qsb)new qsb<vqn, fzv>(d0, this.F0, this.J0) {
            public final RoomStateManager D0;
            public final String E0;
            public final boolean F0;
            
            public final Object invoke(final Object o) {
                final vqn vqn = (vqn)o;
                czd.f((Object)vqn, "state");
                this.D0.R0.a(vqn, this.E0, this.F0);
                return fzv.a;
            }
        });
        String s22;
        if (this.I0) {
            s22 = (String)((wgm)this.D0.u1).b();
        }
        else {
            s22 = null;
        }
        this.D0.b1.J(true, s22, null);
        if (this.J0) {
            this.D0.x1.a.onNext((Object)zbr$a$b.a);
        }
        ((MviViewModel)this.D0).Q((qsb)new qsb<vqn, vqn>(this.F0) {
            public final String D0;
            
            public final Object invoke(final Object o) {
                final vqn vqn = (vqn)o;
                czd.f((Object)vqn, "$this$setState");
                return vqn.l(vqn, null, this.D0, false, wg6.D0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, vqn.y, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -16777227, 2047);
            }
        });
        return fzv.a;
    }
}
