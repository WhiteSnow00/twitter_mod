import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.rooms.manager.RoomStateManager;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$setInvitedSpeakers$3", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class hco extends p0s implements ftb<List<cgv>, go6<? super fzv>, Object>
{
    public Object D0;
    public final Set<uon> E0;
    public final RoomStateManager F0;
    
    public hco(final Set<uon> e0, final RoomStateManager f0, final go6<? super hco> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final hco hco = new hco(this.E0, this.F0, (go6<? super hco>)go6);
        hco.D0 = d0;
        return (go6<fzv>)hco;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final hco hco = (hco)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        hco.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final List list = (List)this.D0;
        final Set<uon> e0 = this.E0;
        czd.e((Object)list, "it");
        final ArrayList list2 = new ArrayList<uon>(iq4.H((Iterable)list, 10));
        for (final cgv cgv : list) {
            final String e2 = cgv.e();
            czd.e((Object)e2, "it.stringId");
            String c = cgv.c();
            if (c == null) {
                c = "";
            }
            String k0 = cgv.K0;
            if (k0 == null) {
                k0 = "";
            }
            String e3 = cgv.E0;
            if (e3 == null) {
                e3 = "";
            }
            Boolean b;
            if ((b = cgv.B1) == null) {
                b = Boolean.FALSE;
            }
            czd.e((Object)b, "it.hasNFTAvatar ?: false");
            list2.add(new uon(e2, c, k0, e3, b));
        }
        final Set a1 = onp.a1((Set)e0, (Iterable)mq4.R0((Iterable)list2));
        final RoomObjectGraph b2 = this.F0.P0.b();
        if (b2 != null) {
            final qan h0 = b2.h0();
            if (h0 != null) {
                h0.o(gmw.t(a1));
            }
        }
        ((MviViewModel)this.F0).Q((qsb)new hco$a(a1));
        return fzv.a;
    }
}
