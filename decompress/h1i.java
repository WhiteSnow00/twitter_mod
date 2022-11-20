import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment$InstantiationException;
import com.twitter.nft.subsystem.api.args.NFTDetailContentViewArgs;
import com.twitter.nft.subsystem.api.args.NFTPickerAvatarContentViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.nft.subsystem.api.args.NFTCollectionActivityContentViewArgs;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.GridLayoutManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1i implements ilx<l1i, g1i, f1i>
{
    public static final h1i.h1i$a Companion;
    public final q3e<s0i> D0;
    public final obi<?> E0;
    public final nnl<g1i> F0;
    public final nnl<v3i> G0;
    public final p H0;
    public final RecyclerView I0;
    public final rhh<l1i> J0;
    
    static {
        Companion = new h1i.h1i$a();
    }
    
    public h1i(final View view, final h3e<s0i> adapter, final q3e<s0i> d0, final obi<?> e0, final nnl<g1i> f0, final nnl<v3i> g0, final p h0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)adapter, "adapter");
        czd.f((Object)d0, "provider");
        czd.f((Object)e0, "navigator");
        czd.f((Object)f0, "onSeeCollectionClicked");
        czd.f((Object)g0, "onNFTItemClicked");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final View viewById = view.findViewById(2131430257);
        czd.e((Object)viewById, "rootView.findViewById(R.id.nft_collections)");
        final RecyclerView i0 = (RecyclerView)viewById;
        (this.I0 = i0).setLayoutManager((RecyclerView$m)new GridLayoutManager(view.getContext(), 1));
        i0.setAdapter((RecyclerView$e)adapter);
        this.J0 = (rhh<l1i>)q3j.g0((qsb)new h1i$e(this));
    }
    
    public final void T(final jbx jbx) {
        final l1i l1i = (l1i)jbx;
        czd.f((Object)l1i, "state");
        this.J0.b((Object)l1i);
    }
    
    public final void q(final Object o) {
        final f1i f1i = (f1i)o;
        czd.f((Object)f1i, "effect");
        if (f1i instanceof f1i$a) {
            final obi<?> e0 = this.E0;
            final f1i$a f1i$a = (f1i$a)f1i;
            e0.b((ContentViewArgs)new NFTCollectionActivityContentViewArgs(f1i$a.a, f1i$a.c, f1i$a.b, f1i$a.d));
        }
        else if (f1i instanceof f1i$d) {
            final obi<?> e2 = this.E0;
            final v3i a = ((f1i$d)f1i).a;
            e2.b((ContentViewArgs)new NFTPickerAvatarContentViewArgs(a.c, a.d, a.e));
        }
        else if (f1i instanceof f1i$b) {
            this.E0.b((ContentViewArgs)new NFTDetailContentViewArgs(null, null, 2, null));
        }
        else if (f1i instanceof f1i$c) {
            final Bundle a2 = nh.A("twitter:id", 12355531);
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final a5i a5i = new a5i();
            ((Fragment)a5i).N1(a2);
            final int a3 = c5j.a;
            ((wk1)a5i).l2(this.H0);
        }
    }
    
    public final h5j<g1i> w() {
        final nnl<g1i> f0 = this.F0;
        final h5j map = ((h5j)this.G0).map((psb)new mg5((qsb)h1i$c.D0, 27));
        final RecyclerView i0 = this.I0;
        czd.f((Object)i0, "<this>");
        final h5j distinctUntilChanged = h5j.create((h9j)new lo((Object)i0, 0)).distinctUntilChanged();
        czd.e((Object)distinctUntilChanged, "create<Int> { emitter ->\u2026 }.distinctUntilChanged()");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)f0, (taj)map, (taj)distinctUntilChanged.map((psb)new fgr((qsb)h1i$d.D0, 22)) });
        czd.e((Object)mergeArray, "mergeArray(\n        onSe\u2026ntIntent.NextPage }\n    )");
        return (h5j<g1i>)mergeArray;
    }
}
