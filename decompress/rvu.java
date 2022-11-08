import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.util.List;
import com.twitter.android.videocarousel.carousel.CarouselRecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rvu extends el8
{
    public final l4e<atu> D0;
    public final vl3 E0;
    public final CarouselRecyclerView F0;
    public List<? extends atu> G0;
    public final qvu H0;
    
    public rvu(View viewById, final exs exs, final ibm ibm) {
        final s71 d0 = new s71();
        zzd.f((Object)exs, "timelineItemScribeReporter");
        zzd.f((Object)ibm, "releaseCompletable");
        super(viewById);
        this.D0 = (l4e<atu>)d0;
        final vl3 vl3 = new vl3();
        this.E0 = vl3;
        viewById = viewById.findViewById(2131430934);
        final CarouselRecyclerView carouselRecyclerView = (CarouselRecyclerView)viewById;
        ((View)carouselRecyclerView).getContext();
        ((RecyclerView)carouselRecyclerView).setLayoutManager((RecyclerView$m)new LinearLayoutManager(0));
        carouselRecyclerView.setAutoPlayManager(vl3);
        zzd.e((Object)viewById, "itemView.findViewById<Ca\u2026AutoPlayManager\n        }");
        final CarouselRecyclerView f0 = (CarouselRecyclerView)viewById;
        this.F0 = f0;
        this.H0 = new qvu(exs, ibm, new d6m((RecyclerView)f0, ibm));
    }
}
