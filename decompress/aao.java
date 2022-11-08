import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aao extends gue implements rtb<gqn, oyv>
{
    public final /* synthetic */ otb<oyv> C0;
    public final /* synthetic */ gqn D0;
    public final /* synthetic */ RoomStateManager E0;
    
    public aao(final otb<oyv> c0, final gqn d0, final RoomStateManager e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "it");
        this.C0.invoke();
        if (this.D0.u == hqn.C0) {
            this.E0.y1.onNext((Object)Boolean.TRUE);
        }
        return oyv.a;
    }
}
