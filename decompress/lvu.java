import androidx.recyclerview.widget.RecyclerView$c0;
import j$.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvu extends c4e<atu>
{
    public final vl3 K0;
    
    public lvu(final vl3 k0, final y4e<atu> y4e, final cbq<atu> cbq, final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        super((y4e)y4e, (x3e)cbq, ibm);
        this.K0 = k0;
    }
    
    public final void E(final c4e$b c4e$b) {
        super.E(c4e$b);
        final c7x w0 = c4e$b.W0;
        final int a = w4j.a;
        zzd.e((Object)w0, "cast(holder.mViewHolder)");
        final VideoContainerHost l0 = ((wvu)w0).l0();
        if (l0 != null) {
            final vl3 k0 = this.K0;
            Objects.requireNonNull(k0);
            final k81 autoPlayableItem = l0.getAutoPlayableItem();
            zzd.e((Object)autoPlayableItem, "containerHost.autoPlayableItem");
            final vl3.a a2 = new vl3.a(autoPlayableItem);
            a2.D0.a(l0.getSubscriptionToAttachment().subscribe((fk6)new ug((rtb)new wl3(k0), 10)));
            k0.a.add(a2);
        }
    }
    
    public final void F(final c4e$b c4e$b) {
        super.F(c4e$b);
        final c7x w0 = c4e$b.W0;
        final int a = w4j.a;
        zzd.e((Object)w0, "cast(holder.mViewHolder)");
        final VideoContainerHost l0 = ((wvu)w0).l0();
        if (l0 != null) {
            final vl3 k0 = this.K0;
            Objects.requireNonNull(k0);
            Collection$_EL.removeIf((Collection)k0.a, (Predicate)new ul3((Object)new xl3(l0), 0));
            final vl3.a a2 = k0.a();
            if (a2 != null) {
                a2.j1();
            }
        }
    }
}
