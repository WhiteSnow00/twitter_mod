import androidx.recyclerview.widget.RecyclerView$c0;
import j$.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rwu extends j4e<iuu>
{
    public final em3 N0;
    
    public rwu(final em3 n0, final f5e<iuu> f5e, final qcq<iuu> qcq, final kcm kcm) {
        e0e.f((Object)kcm, "releaseCompletable");
        super((f5e)f5e, (d4e)qcq, kcm);
        this.N0 = n0;
    }
    
    public final void E(final j4e$b j4e$b) {
        super.E(j4e$b);
        final n8x z0 = j4e$b.Z0;
        final int a = o5j.a;
        e0e.e((Object)z0, "cast(holder.mViewHolder)");
        final VideoContainerHost l0 = ((bxu)z0).l0();
        if (l0 != null) {
            final em3 n0 = this.N0;
            Objects.requireNonNull(n0);
            final k81 autoPlayableItem = l0.getAutoPlayableItem();
            e0e.e((Object)autoPlayableItem, "containerHost.autoPlayableItem");
            final em3$a em3$a = new em3$a(n0, autoPlayableItem);
            em3$a.G0.a(l0.getSubscriptionToAttachment().subscribe((rk6)new au1((stb)new fm3(n0), 3)));
            n0.a.add(em3$a);
        }
    }
    
    public final void F(final j4e$b j4e$b) {
        super.F(j4e$b);
        final n8x z0 = j4e$b.Z0;
        final int a = o5j.a;
        e0e.e((Object)z0, "cast(holder.mViewHolder)");
        final VideoContainerHost l0 = ((bxu)z0).l0();
        if (l0 != null) {
            final em3 n0 = this.N0;
            Objects.requireNonNull(n0);
            Collection$_EL.removeIf((Collection)n0.a, (Predicate)new dm3((Object)new gm3(l0), 0));
            final em3$a a2 = n0.a();
            if (a2 != null) {
                a2.j1();
            }
        }
    }
    
    public final /* bridge */ void u(final RecyclerView$c0 recyclerView$c0) {
        this.E((j4e$b)recyclerView$c0);
    }
    
    public final /* bridge */ void w(final RecyclerView$c0 recyclerView$c0) {
        this.F((j4e$b)recyclerView$c0);
    }
}
