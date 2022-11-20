import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.ImageView;
import com.twitter.media.ui.image.AnimatedGifView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g2i implements ilx<n2i, f2i, o1i>
{
    public static final a Companion;
    public final aob D0;
    public final ul1 E0;
    public final obi<?> F0;
    public final c4i G0;
    public final View H0;
    public final AnimatedGifView I0;
    public final ImageView J0;
    public final FrescoMediaImageView K0;
    public final TypefacesTextView L0;
    public final TypefacesTextView M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final rhh<n2i> P0;
    
    static {
        Companion = new a();
    }
    
    public g2i(final View view, final aob d0, final p p7, final UserIdentifier userIdentifier, final ul1 e0, final obi<?> f0, final c4i g0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)d0, "fragmentProvider");
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)f0, "navigator");
        czd.f((Object)g0, "nftMetadataDispatcher");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        final View viewById = view.findViewById(2131430250);
        czd.e((Object)viewById, "rootView.findViewById(R.\u2026ctivity_detail_container)");
        this.H0 = viewById;
        final View viewById2 = view.findViewById(2131432495);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.user_nft)");
        this.I0 = (AnimatedGifView)viewById2;
        final View viewById3 = view.findViewById(2131427753);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.back_button)");
        this.J0 = (ImageView)viewById3;
        final View viewById4 = view.findViewById(2131432496);
        czd.e((Object)viewById4, "rootView.findViewById(R.\u2026ser_nft_collection_image)");
        this.K0 = (FrescoMediaImageView)viewById4;
        final View viewById5 = view.findViewById(2131432498);
        czd.e((Object)viewById5, "rootView.findViewById(R.id.user_nft_detail_button)");
        this.L0 = (TypefacesTextView)viewById5;
        final View viewById6 = view.findViewById(2131432499);
        czd.e((Object)viewById6, "rootView.findViewById(R.id.user_nft_subtitle)");
        this.M0 = (TypefacesTextView)viewById6;
        final View viewById7 = view.findViewById(2131432501);
        czd.e((Object)viewById7, "rootView.findViewById(R.id.user_nft_verified)");
        this.N0 = (TypefacesTextView)viewById7;
        final View viewById8 = view.findViewById(2131432500);
        czd.e((Object)viewById8, "rootView.findViewById(R.id.user_nft_title)");
        this.O0 = (TypefacesTextView)viewById8;
        this.P0 = (rhh<n2i>)q3j.g0((qsb)new qsb<rhh$a<n2i>, fzv>(this, view) {
            public final g2i D0;
            public final View E0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)h2i.D0 }, (qsb)new i2i(this.D0));
                rhh$a.c(new foe[] { (foe)j2i.D0 }, (qsb)new l2i(this.D0, this.E0));
                return fzv.a;
            }
        });
    }
    
    public final void T(final jbx jbx) {
        final n2i n2i = (n2i)jbx;
        czd.f((Object)n2i, "state");
        this.P0.b((Object)n2i);
    }
    
    public final void q(final Object o) {
        final o1i o1i = (o1i)o;
        czd.f((Object)o1i, "effect");
        if (o1i instanceof o1i$b) {
            final p1i p1i = (p1i)new q1i.a(this.D0).w();
            final o1i$b o1i$b = (o1i$b)o1i;
            final c0i a = o1i$b.a;
            if (a != null) {
                final c4i g0 = this.G0;
                final vji vji = new vji(a, o1i$b.b);
                Objects.requireNonNull(g0);
                g0.a.onNext((Object)vji);
            }
            ((wk1)p1i).e2(((cnb)this.E0).P(), null);
        }
        else if (o1i instanceof o1i$a) {
            this.E0.onBackPressed();
        }
    }
    
    public final h5j<f2i> w() {
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h((View)this.L0).map((psb)new x55((qsb)g2i$c.D0, 28)), (taj)max.h((View)this.J0).map((psb)new cu4((qsb)g2i$d.D0, 28)) });
        czd.e((Object)mergeArray, "mergeArray(\n        deta\u2026BackButtonClicked }\n    )");
        return (h5j<f2i>)mergeArray;
    }
    
    public static final class a
    {
    }
}
