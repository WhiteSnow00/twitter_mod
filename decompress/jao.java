import java.util.Iterator;
import com.twitter.rooms.manager.RoomStateManager$k0;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$joinRoomFirstTime$1$2$2$1", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class jao extends p0s implements ftb<GuestServiceJoinResponse, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    public final boolean F0;
    public final Set<RoomUserItem> G0;
    public final String H0;
    public final boolean I0;
    public final RoomObjectGraph J0;
    public final boolean K0;
    
    public jao(final RoomStateManager e0, final boolean f0, final Set<RoomUserItem> g0, final String h0, final boolean i0, final RoomObjectGraph j0, final boolean k0, final go6<? super jao> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final jao jao = new jao(this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, (go6<? super jao>)go6);
        jao.D0 = d0;
        return (go6<fzv>)jao;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final jao jao = (jao)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        jao.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object next) {
        b1n.u(next);
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)this.D0;
        final RoomStateManager e0 = this.E0;
        final boolean f0 = this.F0;
        final StringBuilder sb = new StringBuilder();
        sb.append("joinRoomFirstTime::joinAudioSpace success isSpeaker:");
        sb.append(f0);
        sb.append(" ");
        sb.append(guestServiceJoinResponse);
        final String string = sb.toString();
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        e0.s0(string);
        final RoomStateManager e2 = this.E0;
        ((MviViewModel)e2).T((qsb)new qsb<vqn, fzv>(e2, this.H0, this.K0) {
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
        if (!this.F0) {
            RoomStateManager.W(this.E0);
        }
        final Iterator<Object> iterator = this.G0.iterator();
        while (true) {
            while (iterator.hasNext()) {
                next = iterator.next();
                if (((RoomUserItem)next).isPrimaryAdmin()) {
                    final RoomUserItem roomUserItem = (RoomUserItem)next;
                    final RoomStateManager e3 = this.E0;
                    final String h0 = this.H0;
                    String twitterUserId;
                    if (roomUserItem != null) {
                        twitterUserId = roomUserItem.getTwitterUserId();
                    }
                    else {
                        twitterUserId = null;
                    }
                    String periscopeUserId;
                    if (roomUserItem != null) {
                        periscopeUserId = roomUserItem.getPeriscopeUserId();
                    }
                    else {
                        periscopeUserId = null;
                    }
                    e3.z0(h0, twitterUserId, periscopeUserId, this.F0, this.I0);
                    this.E0.C0(this.H0);
                    this.E0.v0(this.J0);
                    RoomStateManager.a0(this.E0, this.H0, guestServiceJoinResponse.getCanJoinAsSpeaker(), this.F0, guestServiceJoinResponse.getSessionUuid());
                    MviViewModel.M((MviViewModel)this.E0, (h5j)this.J0.w4().H0.O0, (String)null, (jrx)null, (ftb)new ftb<z7n.a, go6<? super fzv>, Object>(this.E0, null) {
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
                    this.J0.s3().a("join.ogg", true);
                    if (this.K0) {
                        this.E0.x1.a.onNext((Object)zbr$a$b.a);
                    }
                    if (this.F0) {
                        if (guestServiceJoinResponse.getCanJoinAsSpeaker()) {
                            vjo.G(this.E0.b1, "periscope", "guest", "automatically_join", "success", null, 48);
                        }
                        else {
                            vjo.G(this.E0.b1, "periscope", "guest", "automatically_join", "fallback", null, 48);
                        }
                    }
                    return fzv.a;
                }
            }
            next = null;
            continue;
        }
    }
}
