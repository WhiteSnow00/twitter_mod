import com.twitter.rooms.docker.reaction.RoomDockerReactionViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aen extends gue implements rtb<cen, oyv>
{
    public final /* synthetic */ RoomDockerReactionViewModel C0;
    public final /* synthetic */ ypp.j D0;
    
    public aen(final RoomDockerReactionViewModel c0, final ypp.j d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cen cen = (cen)o;
        zzd.f((Object)cen, "it");
        final RoomDockerReactionViewModel c0 = this.C0;
        final w1a b = this.D0.b;
        a1a c2;
        if ((c2 = cen.a.get(b)) == null) {
            c2 = a1a.C0;
        }
        final soe[] s0 = RoomDockerReactionViewModel.S0;
        c0.W(b, c2);
        return oyv.a;
    }
}
