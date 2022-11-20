import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$observeTicketPurchase$1", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class lan extends p0s implements ftb<znl, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomConsumptionPreviewViewModel E0;
    
    public lan(final RoomConsumptionPreviewViewModel e0, final go6<? super lan> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final lan lan = new lan(this.E0, (go6<? super lan>)go6);
        lan.D0 = d0;
        return (go6<fzv>)lan;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final lan lan = (lan)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        lan.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final znl znl = (znl)this.D0;
        if (znl instanceof znl$d) {
            final RoomConsumptionPreviewViewModel e0 = this.E0;
            final lan$a lan$a = new lan$a(e0);
            final coe[] g1 = RoomConsumptionPreviewViewModel.g1;
            ((MviViewModel)e0).T((qsb)lan$a);
        }
        else if (czd.a((Object)znl, (Object)znl$b.a)) {
            final RoomConsumptionPreviewViewModel e2 = this.E0;
            final lan$b d0 = lan$b.D0;
            final coe[] g2 = RoomConsumptionPreviewViewModel.g1;
            ((MviViewModel)e2).Q((qsb)d0);
        }
        else if (czd.a((Object)znl, (Object)znl$a.a)) {
            final RoomConsumptionPreviewViewModel e3 = this.E0;
            final lan$c d2 = lan$c.D0;
            final coe[] g3 = RoomConsumptionPreviewViewModel.g1;
            ((MviViewModel)e3).Q((qsb)d2);
        }
        else if (czd.a((Object)znl, (Object)znl$c.a)) {
            final RoomConsumptionPreviewViewModel e4 = this.E0;
            final y8n$g a = y8n$g.a;
            final coe[] g4 = RoomConsumptionPreviewViewModel.g1;
            ((MviViewModel)e4).V((Object)a);
        }
        else if (znl instanceof znl$e) {
            final RoomConsumptionPreviewViewModel e5 = this.E0;
            final lan$d lan$d = new lan$d(znl);
            final coe[] g5 = RoomConsumptionPreviewViewModel.g1;
            ((MviViewModel)e5).Q((qsb)lan$d);
        }
        return fzv.a;
    }
}
