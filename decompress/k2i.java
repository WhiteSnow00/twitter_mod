import java.util.concurrent.TimeUnit;
import android.net.Uri;
import com.twitter.nft.subsystem.model.NFTSmartContract;
import android.view.View$OnClickListener;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.GridLayoutManager;
import com.twitter.media.ui.image.UserImageView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import android.content.Context;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.widget.ImageView;
import com.twitter.ui.widget.FacepileView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.ui.user.UserView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k2i implements xlx<v2i, j2i, i2i>
{
    public static final a Companion;
    public final View F0;
    public final znl<j2i> G0;
    public final s4e<i4i> H0;
    public final s4e<aoj> I0;
    public final p J0;
    public final UserIdentifier K0;
    public final fci<?> L0;
    public final View M0;
    public final View N0;
    public final TypefacesTextView O0;
    public final View P0;
    public final TypefacesTextView Q0;
    public final View R0;
    public final UserView S0;
    public final View T0;
    public final TypefacesTextView U0;
    public final TypefacesTextView V0;
    public final TypefacesTextView W0;
    public final TypefacesTextView X0;
    public final TypefacesTextView Y0;
    public final TypefacesTextView Z0;
    public final TypefacesTextView a1;
    public final FrescoMediaImageView b1;
    public final FrescoMediaImageView c1;
    public final TypefacesTextView d1;
    public final TypefacesTextView e1;
    public final FacepileView f1;
    public final TypefacesTextView g1;
    public final TypefacesTextView h1;
    public final ImageView i1;
    public final TypefacesTextView j1;
    public final TwitterButton k1;
    public final ToggleTwitterButton l1;
    public final Context m1;
    public final Resources n1;
    public final znl<j2i> o1;
    public final fih<v2i> p1;
    
    static {
        Companion = new a();
    }
    
    public k2i(final View f0, final j4e<i4i> adapter, final j4e<aoj> adapter2, final znl<j2i> g0, final s4e<i4i> h0, final s4e<aoj> i0, final bpb bpb, final p j0, final UserIdentifier k0, final fci<?> l0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)adapter, "nftInfoAdapter");
        e0e.f((Object)adapter2, "traitsAdapter");
        e0e.f((Object)g0, "clickSubject");
        e0e.f((Object)h0, "nftInfoProvider");
        e0e.f((Object)i0, "traitsProvider");
        e0e.f((Object)bpb, "fragmentProvider");
        e0e.f((Object)k0, "userIdentifier");
        e0e.f((Object)l0, "navigator");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        final View viewById = f0.findViewById(2131430271);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026detail_properties_layout)");
        this.M0 = viewById;
        final View viewById2 = f0.findViewById(2131430263);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026etail_description_layout)");
        this.N0 = viewById2;
        final View viewById3 = f0.findViewById(2131430292);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026ft_detail_sheet_seeMore3)");
        this.O0 = (TypefacesTextView)viewById3;
        final View viewById4 = f0.findViewById(2131430257);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.nft_collection_layout)");
        this.P0 = viewById4;
        final View viewById5 = f0.findViewById(2131430278);
        e0e.e((Object)viewById5, "rootView.findViewById(R.\u2026heet_collection_subtitle)");
        this.Q0 = (TypefacesTextView)viewById5;
        final View viewById6 = f0.findViewById(2131430269);
        e0e.e((Object)viewById6, "rootView.findViewById(R.\u2026.nft_detail_owner_layout)");
        this.R0 = viewById6;
        final View viewById7 = f0.findViewById(2131432513);
        e0e.e((Object)viewById7, "rootView.findViewById(R.id.user_view)");
        this.S0 = (UserView)viewById7;
        final View viewById8 = f0.findViewById(2131430262);
        e0e.e((Object)viewById8, "rootView.findViewById(R.\u2026ft_detail_creator_layout)");
        this.T0 = viewById8;
        final View viewById9 = f0.findViewById(2131430289);
        e0e.e((Object)viewById9, "rootView.findViewById(R.id.nft_detail_sheet_link)");
        this.U0 = (TypefacesTextView)viewById9;
        final View viewById10 = f0.findViewById(2131430268);
        e0e.e((Object)viewById10, "rootView.findViewById(R.id.nft_detail_learn_more)");
        this.V0 = (TypefacesTextView)viewById10;
        final View viewById11 = f0.findViewById(2131430286);
        e0e.e((Object)viewById11, "rootView.findViewById(R.\u2026.nft_detail_sheet_header)");
        this.W0 = (TypefacesTextView)viewById11;
        final View viewById12 = f0.findViewById(2131430293);
        e0e.e((Object)viewById12, "rootView.findViewById(R.id.nft_detail_sheet_title)");
        this.X0 = (TypefacesTextView)viewById12;
        final View viewById13 = f0.findViewById(2131430295);
        e0e.e((Object)viewById13, "rootView.findViewById(R.\u2026.nft_detail_sheet_title3)");
        this.Y0 = (TypefacesTextView)viewById13;
        final View viewById14 = f0.findViewById(2131430259);
        e0e.e((Object)viewById14, "rootView.findViewById(R.id.nft_creator_address)");
        this.Z0 = (TypefacesTextView)viewById14;
        final View viewById15 = f0.findViewById(2131430261);
        e0e.e((Object)viewById15, "rootView.findViewById(R.\u2026creator_opensea_username)");
        this.a1 = (TypefacesTextView)viewById15;
        final View viewById16 = f0.findViewById(2131430260);
        e0e.e((Object)viewById16, "rootView.findViewById(R.id.nft_creator_image)");
        this.b1 = (FrescoMediaImageView)viewById16;
        final View viewById17 = f0.findViewById(2131430276);
        e0e.e((Object)viewById17, "rootView.findViewById(R.\u2026l_sheet_collection_image)");
        this.c1 = (FrescoMediaImageView)viewById17;
        final View viewById18 = f0.findViewById(2131430279);
        e0e.e((Object)viewById18, "rootView.findViewById(R.\u2026l_sheet_collection_title)");
        this.d1 = (TypefacesTextView)viewById18;
        final View viewById19 = f0.findViewById(2131430277);
        e0e.e((Object)viewById19, "rootView.findViewById(R.\u2026sheet_collection_seeMore)");
        this.e1 = (TypefacesTextView)viewById19;
        final View viewById20 = f0.findViewById(2131430275);
        e0e.e((Object)viewById20, "rootView.findViewById(R.\u2026heet_collection_facepile)");
        final FacepileView f2 = (FacepileView)viewById20;
        this.f1 = f2;
        final View viewById21 = f0.findViewById(2131430273);
        e0e.e((Object)viewById21, "rootView.findViewById(R.\u2026l_sheet_collection_count)");
        this.g1 = (TypefacesTextView)viewById21;
        final View viewById22 = f0.findViewById(2131430281);
        e0e.e((Object)viewById22, "rootView.findViewById(R.\u2026llection_verified_owners)");
        this.h1 = (TypefacesTextView)viewById22;
        final View viewById23 = f0.findViewById(2131430282);
        e0e.e((Object)viewById23, "rootView.findViewById(R.\u2026on_verified_owners_arrow)");
        this.i1 = (ImageView)viewById23;
        final View viewById24 = f0.findViewById(2131430274);
        e0e.e((Object)viewById24, "rootView.findViewById(R.\u2026t_collection_description)");
        this.j1 = (TypefacesTextView)viewById24;
        final View viewById25 = f0.findViewById(2131430285);
        e0e.e((Object)viewById25, "rootView.findViewById(R.\u2026eet_detail_recycler_view)");
        final RecyclerView recyclerView = (RecyclerView)viewById25;
        final View viewById26 = f0.findViewById(2131430290);
        e0e.e((Object)viewById26, "rootView.findViewById(R.\u2026properties_recycler_view)");
        final RecyclerView recyclerView2 = (RecyclerView)viewById26;
        final View viewById27 = f0.findViewById(2131430541);
        e0e.e((Object)viewById27, "rootView.findViewById(co\u2026r.ui.R.id.pending_button)");
        this.k1 = (TwitterButton)viewById27;
        final View viewById28 = f0.findViewById(2131429217);
        e0e.e((Object)viewById28, "rootView.findViewById(co\u2026er.ui.R.id.follow_button)");
        this.l1 = (ToggleTwitterButton)viewById28;
        final View viewById29 = f0.findViewById(2131432471);
        e0e.e((Object)viewById29, "rootView.findViewById(co\u2026itter.ui.R.id.user_image)");
        final UserImageView userImageView = (UserImageView)viewById29;
        final Context context = f0.getContext();
        this.m1 = context;
        final Resources resources = context.getResources();
        this.n1 = resources;
        this.o1 = (znl<j2i>)new znl();
        recyclerView.setLayoutManager((RecyclerView$m)new GridLayoutManager(context, 2));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        recyclerView2.setLayoutManager((RecyclerView$m)new GridLayoutManager(context, 2));
        recyclerView2.setAdapter((RecyclerView$e)adapter2);
        f2.d(resources.getDimensionPixelSize(2131166396), resources.getColor(2131100880), 2131165779);
        this.p1 = (fih<v2i>)ma7.S((stb)new k2i$i(this));
    }
    
    public static final void a(final k2i k2i, final TextView textView, final TextView textView2, final String text) {
        textView.setText((CharSequence)text);
        if (textView.getLineCount() > 4) {
            textView.setEllipsize(TextUtils$TruncateAt.END);
            textView.setMaxLines(4);
            ((View)textView2).setVisibility(0);
            ((View)textView2).setOnClickListener((View$OnClickListener)new mpa((Object)textView, (Object)textView2, 15));
        }
        else {
            ((View)textView2).setVisibility(8);
        }
    }
    
    public final void T(final ccx ccx) {
        final v2i v2i = (v2i)ccx;
        e0e.f((Object)v2i, "state");
        this.p1.b((Object)v2i);
    }
    
    public final void r(final Object o) {
        final i2i i2i = (i2i)o;
        e0e.f((Object)i2i, "effect");
        final boolean b = i2i instanceof i2i$e;
        final boolean b2 = true;
        String s = "";
        if (b) {
            final i2i$e i2i$e = (i2i$e)i2i;
            final u4i a = i2i$e.a;
            if (a != null) {
                final String a2 = a.a;
                final NFTSmartContract c = a.c;
                if (c instanceof NFTSmartContract.ERC721) {
                    e0e.d((Object)c, "null cannot be cast to non-null type com.twitter.nft.subsystem.model.NFTSmartContract.ERC721");
                    s = ((NFTSmartContract.ERC721)c).getAddress();
                }
                else if (c instanceof NFTSmartContract.ERC1155) {
                    e0e.d((Object)c, "null cannot be cast to non-null type com.twitter.nft.subsystem.model.NFTSmartContract.ERC1155");
                    s = ((NFTSmartContract.ERC1155)c).getAddress();
                }
                String s2;
                if (i2i$e.b == 1) {
                    s2 = bj.z("https://opensea.io/assets/", s, "/", a2);
                }
                else {
                    s2 = mqb.l("https://opensea.io/", a.b.e);
                }
                final Context context = this.F0.getContext();
                e0e.e((Object)context, "rootView.context");
                final Uri parse = Uri.parse(s2);
                e0e.e((Object)parse, "parse(url)");
                p70.p(context, parse);
            }
        }
        else if (i2i instanceof i2i$a) {
            final String a3 = ((i2i$a)i2i).a;
            final wjl$b wjl$b = new wjl$b(6);
            ((wjl$a)wjl$b).I(this.m1.getString(2131959476, new Object[] { a3 }));
            ((wjl$a)wjl$b).B((CharSequence)this.m1.getString(2131959475));
            ((wjl$a)wjl$b).F(2131959473);
            ((wjl$a)wjl$b).C(2131952374);
            final vjl vjl = (vjl)((cl1$a)wjl$b).w();
            ((bl1)vjl).W1 = (dx8)new zq9((Object)this, 1);
            final int a4 = o5j.a;
            ((bl1)vjl).l2(this.J0);
        }
        else if (i2i instanceof i2i$b) {
            final String a5 = ((i2i$b)i2i).a;
            final wjl$b wjl$b2 = new wjl$b(6);
            ((wjl$a)wjl$b2).H(2131959466);
            ((wjl$a)wjl$b2).B((CharSequence)this.m1.getString(2131959465, new Object[] { a5 }));
            ((wjl$a)wjl$b2).F(2131959464);
            ((wjl$a)wjl$b2).C(2131952374);
            final vjl vjl2 = (vjl)((cl1$a)wjl$b2).w();
            ((bl1)vjl2).W1 = (dx8)new yp7((Object)this, 4);
            final int a6 = o5j.a;
            ((bl1)vjl2).l2(this.J0);
        }
        else if (i2i instanceof i2i$d) {
            final String string = this.m1.getString(2131955393);
            e0e.e((Object)string, "context.getString(LEARN_MORE_URL)");
            final String z = fbx.z(string);
            final Context m1 = this.m1;
            e0e.e((Object)m1, "context");
            final Uri parse2 = Uri.parse(z);
            e0e.e((Object)parse2, "parse(url)");
            p70.p(m1, parse2);
        }
        else if (i2i instanceof i2i$c) {
            final i2i$c i2i$c = (i2i$c)i2i;
            final String b3 = i2i$c.b;
            int n = b2 ? 1 : 0;
            if (b3 != null) {
                if (b3.length() == 0) {
                    n = (b2 ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            if (n == 0) {
                s = mqb.l("?a=", i2i$c.b);
            }
            final String h = c0e.h("https://etherscan.io/token/", i2i$c.a, s);
            final Context context2 = this.F0.getContext();
            e0e.e((Object)context2, "rootView.context");
            final Uri parse3 = Uri.parse(h);
            e0e.e((Object)parse3, "parse(url)");
            p70.p(context2, parse3);
        }
        else if (i2i instanceof i2i$f) {
            final fci<?> l0 = this.L0;
            final Resources n2 = this.n1;
            e0e.e((Object)n2, "resources");
            final long a7 = ((i2i$f)i2i).a;
            final d7c$a d7c$a = new d7c$a();
            final i8c$a i8c$a = new i8c$a();
            i8c$a.a = "web3_get_nft_owners";
            i8c$a.b = new h8c(new String[] { "user_result", "result", "nft_avatar_collection", "nft_owners_timeline" });
            ((kkg)i8c$a.c).w((Object)"rest_id", (Object)a7);
            ((kkg)i8c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)bs4.n0());
            d7c$a.t((i8c)((z4j)i8c$a).e());
            d7c$a.x((CharSequence)n2.getString(2131955387));
            final StringBuilder sb = new StringBuilder();
            sb.append("NFTDetailOwnersTimeline-");
            sb.append(a7);
            d7c$a.q(sb.toString());
            d7c$a.u();
            d7c$a.r();
            l0.d((cn)((z4j)d7c$a).e());
        }
    }
    
    public final t5j<j2i> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a((View)this.U0).map((rtb)new hv4((stb)k2i$c.F0, 29)), (fbj)vq9.a(this.T0).map((rtb)new qe5((stb)k2i$d.F0, 23)), (fbj)vq9.a((View)this.V0).map((rtb)new mr0((stb)k2i$e.F0, 21)), (fbj)vq9.a((View)this.l1).map((rtb)new yw4((stb)k2i$f.F0, 29)), (fbj)vq9.a((View)this.k1).map((rtb)new m7k((stb)k2i$g.F0, 19)), (fbj)t5j.mergeArray(new fbj[] { (fbj)vq9.a((View)this.i1), (fbj)vq9.a((View)this.g1), (fbj)vq9.a((View)this.f1), (fbj)vq9.a((View)this.h1) }).throttleFirst(500L, TimeUnit.MILLISECONDS).map((rtb)new bhl((stb)k2i$h.F0, 25)), (fbj)this.G0, (fbj)this.o1 });
        e0e.e((Object)mergeArray, "mergeArray(\n        open\u2026      intentSubject\n    )");
        return (t5j<j2i>)mergeArray;
    }
    
    public static final class a
    {
    }
    
    public interface b
    {
        k2i a(final View p0);
    }
}
