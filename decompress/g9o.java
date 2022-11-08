import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g9o extends gue implements rtb<f2g, ubq<? extends snj<iu3>>>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ RoomObjectGraph D0;
    public final /* synthetic */ String E0;
    
    public g9o(final RoomStateManager c0, final RoomObjectGraph d0, final String e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f2g f2g = (f2g)o;
        zzd.f((Object)f2g, "liveVideoStream");
        final RoomStateManager c0 = this.C0;
        final d9o d9o = new d9o(f2g);
        final RoomStateManager.k0 companion = RoomStateManager.Companion;
        ((MviViewModel)c0).Q((rtb)d9o);
        final String d = f2g.d;
        if (d != null) {
            final RoomStateManager c2 = this.C0;
            ((MviViewModel)c2).T((rtb)new e9o(this.D0, d, this.E0, c2));
            final j7n r3 = this.D0.r3();
            Objects.requireNonNull(r3);
            final n9q n9q;
            return n9q.l((fk6)new yhc((rtb)new i7n(f2g, r3, (vbq)(n9q = (n9q)new vbq())), 12)).w((qtb)new ozb((rtb)f9o.C0, 10));
        }
        throw new IllegalStateException("lifecycleToken can't be null".toString());
    }
}
