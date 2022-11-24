import android.content.Context;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import java.util.List;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.ui.components.button.legacy.TwitterButton;
import androidx.cardview.widget.CardView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class suq implements xlx<ivq, quq, puq>
{
    public final View F0;
    public final zl1 G0;
    public final rko H0;
    public final ysq I0;
    public final CardView J0;
    public final TwitterButton K0;
    public final TypefacesTextView L0;
    public final TypefacesTextView M0;
    public final RecyclerView N0;
    public final TypefacesTextView O0;
    public final ImageView P0;
    public final List<FrescoMediaImageView> Q0;
    public final znl<quq> R0;
    public final znl<vzv> S0;
    public final fih<ivq> T0;
    
    public suq(final View f0, final zl1 g0, final j4e<sko> adapter, final rko h0, final ysq i0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)adapter, "adapter");
        e0e.f((Object)h0, "facepileItemProvider");
        e0e.f((Object)i0, "spacesLauncher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (CardView)f0.findViewById(2131431585);
        final TwitterButton k0 = (TwitterButton)f0.findViewById(2131431586);
        this.K0 = k0;
        this.L0 = (TypefacesTextView)f0.findViewById(2131431593);
        this.M0 = (TypefacesTextView)f0.findViewById(2131431587);
        final View viewById = f0.findViewById(2131431732);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026tions_facepile_container)");
        final RecyclerView n0 = (RecyclerView)viewById;
        this.N0 = n0;
        this.O0 = (TypefacesTextView)f0.findViewById(2131431739);
        this.P0 = (ImageView)f0.findViewById(2131431738);
        this.Q0 = shw.y0((Object[])new FrescoMediaImageView[] { (FrescoMediaImageView)f0.findViewById(2131431589), (FrescoMediaImageView)f0.findViewById(2131431591), (FrescoMediaImageView)f0.findViewById(2131431592), (FrescoMediaImageView)f0.findViewById(2131431590), (FrescoMediaImageView)f0.findViewById(2131431588) });
        this.R0 = (znl<quq>)new znl();
        this.S0 = (znl<vzv>)new znl();
        n0.setAdapter((RecyclerView$e)adapter);
        n0.h((RecyclerView$l)new nuq());
        k0.setIcon(2131232353);
        ((View)k0).setOnClickListener((View$OnClickListener)new ruq(this, false));
        this.T0 = (fih<ivq>)ma7.S((stb)new suq$c(this));
    }
    
    public final void T(final ccx ccx) {
        final ivq ivq = (ivq)ccx;
        e0e.f((Object)ivq, "state");
        this.T0.b((Object)ivq);
    }
    
    public final void r(final Object o) {
        final puq puq = (puq)o;
        e0e.f((Object)puq, "effect");
        if (puq instanceof puq.a) {
            qjy.D((Context)this.G0, this.S0, ((puq.a)puq).a);
        }
        else if (puq instanceof puq.b) {
            this.I0.i();
        }
    }
    
    public final t5j<quq> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)((t5j)this.S0).map((rtb)new uyn((stb)suq$b.F0, 9)), (fbj)this.R0 });
        e0e.e((Object)mergeArray, "mergeArray(\n        endS\u2026      intentSubject\n    )");
        return (t5j<quq>)mergeArray;
    }
}
