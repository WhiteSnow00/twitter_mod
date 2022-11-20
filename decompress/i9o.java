import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.manager.RoomStateManager$l0;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$createRoom$3", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class i9o extends p0s implements ftb<v47, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager$l0 E0;
    public final RoomStateManager F0;
    public final boolean G0;
    public final String H0;
    public final qsb<String, fzv> I0;
    
    public i9o(final RoomStateManager$l0 e0, final RoomStateManager f0, final boolean g0, final String h0, final qsb<? super String, fzv> i0, final go6<? super i9o> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (qsb<String, fzv>)i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final i9o i9o = new i9o(this.E0, this.F0, this.G0, this.H0, this.I0, (go6<? super i9o>)go6);
        i9o.D0 = d0;
        return (go6<fzv>)i9o;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i9o i9o = (i9o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i9o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final v47 v47 = (v47)this.D0;
        if (this.E0.a) {
            RoomStateManager.w0(this.F0, v47, (String)null, false, this.G0, this.H0 != null, 6);
        }
        else {
            final RoomStateManager f0 = this.F0;
            final t8o t1 = f0.t1;
            final String w = v47.b().w();
            czd.e((Object)w, "createdBroadcast.broadcast().id()");
            MviViewModel.F((MviViewModel)f0, t1.a(w), (String)null, (jrx)null, (qsb)new qsb<go6<? super fzv>, Object>(this.F0, v47, this.G0, this.H0, null) {
                public final RoomStateManager D0;
                public final v47 E0;
                public final boolean F0;
                public final String G0;
                
                public final go6<fzv> create(final go6<?> go6) {
                    return (go6<fzv>)new qsb<go6<? super fzv>, Object>(this.D0, this.E0, this.F0, this.G0, go6) {
                        public final RoomStateManager D0;
                        public final v47 E0;
                        public final boolean F0;
                        public final String G0;
                    };
                }
                
                public final Object invoke(final Object o) {
                    final qsb<go6<? super fzv>, Object> qsb = (qsb<go6<? super fzv>, Object>)this.create((go6<?>)o);
                    final fzv a = fzv.a;
                    qsb.invokeSuspend(a);
                    return a;
                }
                
                public final Object invokeSuspend(final Object o) {
                    b1n.u(o);
                    RoomStateManager.w0(this.D0, this.E0, (String)null, false, this.F0, this.G0 != null, 6);
                    return fzv.a;
                }
            }, 3, (Object)null);
        }
        final qsb<String, fzv> i0 = this.I0;
        final String w2 = v47.b().w();
        czd.e((Object)w2, "createdBroadcast.broadcast().id()");
        i0.invoke((Object)w2);
        return fzv.a;
    }
}
