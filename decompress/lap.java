import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.media.ui.image.c;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.res.Resources;
import com.twitter.media.ui.image.UserImageView;
import android.text.SpannableStringBuilder;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View$OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.twitter.ui.user.UserSocialView;
import androidx.recyclerview.widget.RecyclerView$e;
import com.twitter.ui.view.CustomScrollRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.twitter.ui.view.CustomScrollRecyclerView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.text.TextUtils$TruncateAt;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import com.twitter.media.ui.image.b$a;
import java.util.Objects;
import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lap extends z3e<x9p>
{
    public static final List<x9p$a> S0;
    public final View$OnClickListener I0;
    public final View$OnClickListener J0;
    public final mhj<View, ufv> K0;
    public final LayoutInflater L0;
    public final kt3 M0;
    public final cra<bn3, Integer, an3> N0;
    public final p6p O0;
    public lap.lap$b P0;
    public lap.lap$c Q0;
    public lap.lap$d R0;
    
    static {
        S0 = ojf.w((Object)x9p$a.M0, (Object[])new x9p$a[] { x9p$a.N0, x9p$a.H0, x9p$a.J0, x9p$a.K0, x9p$a.O0, x9p$a.G0 });
    }
    
    public lap(final Activity activity, final View$OnClickListener i0, final mhj<View, ufv> k0, final s9p$d s9p$d, final View$OnClickListener j0, final LayoutInflater l0, final sfv sfv, final kt3 m0, final p6p o0, final z9p z9p) {
        super((Context)activity);
        this.I0 = i0;
        this.K0 = k0;
        this.J0 = j0;
        this.L0 = l0;
        this.M0 = m0;
        this.O0 = o0;
        this.N0 = new iap(activity, l0, s9p$d, sfv, o0, z9p);
    }
    
    public final /* bridge */ void a(final View view, final Context context, final Object o) {
        final x9p x9p = (x9p)o;
    }
    
    public final void c(final View view, final Context context, final Object o, final int n) {
        final x9p x9p = (x9p)o;
        final int ordinal = ((Enum)x9p.a).ordinal();
        final z8d$a z8d$a = null;
        ufv ufv = null;
        while (true) {
            switch (ordinal) {
                default: {
                    final rk8 rk8 = (rk8)x9p;
                    final gap gap = (gap)view.getTag();
                    ((View)gap.c).setVisibility(8);
                    if (rk8.k != 1) {
                        gap.a.setText((CharSequence)xli.c(rk8.f, rk8.b));
                        this.i(gap.b, rk8.f);
                    }
                    else {
                        gap.a.setText((CharSequence)rk8.f);
                        gap.b.setVisibility(8);
                    }
                    ufv = eg4.n(rk8.f, 12, this.g(rk8));
                    break;
                }
                case 10: {
                    final yq3 yq3 = (yq3)x9p;
                    final lt3 lt3 = (lt3)view.getTag();
                    final String l = yq3.l;
                    vmw.f(l);
                    final kt3 m0 = this.M0;
                    final qgv i = yq3.m;
                    final vfv k = yq3.k;
                    final hpj q = k.q;
                    final String p4 = k.p;
                    Objects.requireNonNull(m0);
                    e0e.f((Object)lt3, "vh");
                    e0e.f((Object)i, "creator");
                    lt3.I0.setText((CharSequence)l);
                    lt3.N0.setText((CharSequence)flr.l(i.M0));
                    lt3.J0.I(i, true);
                    lt3.K0.setText((CharSequence)i.c());
                    Objects.requireNonNull(kt3.Companion);
                    Object croppingRectangleProvider = null;
                    Label_0266: {
                        if (q != null) {
                            final List c = q.c;
                            e0e.e((Object)c, "originalInfo.focusRects");
                            if (c.isEmpty() ^ true) {
                                croppingRectangleProvider = new jt3(q);
                                break Label_0266;
                            }
                        }
                        croppingRectangleProvider = null;
                    }
                    ((c)lt3.H0).setCroppingRectangleProvider((b$a)croppingRectangleProvider);
                    final FrescoMediaImageView h0 = lt3.H0;
                    z8d$a d;
                    if (q == null) {
                        d = z8d$a;
                    }
                    else {
                        d = a9d.d(q.a, q.b, (z6w)null);
                    }
                    ((c)h0).q(d, true);
                    if (i.O0) {
                        lt3.L0.setVisibility(0);
                    }
                    else {
                        lt3.L0.setVisibility(8);
                    }
                    if (i.P0) {
                        lt3.M0.setVisibility(0);
                    }
                    else {
                        lt3.M0.setVisibility(8);
                    }
                    Objects.requireNonNull(m0.a);
                    if (ita.b().b("search_channels_description_enabled", false)) {
                        o9a.E(lt3.O0, (CharSequence)p4);
                    }
                    ufv = eg4.m(yq3.k.g, l, 11, this.g((x9p)yq3), (String)null);
                    break;
                }
                case 9: {
                    final mda mda = (mda)x9p;
                    final fap fap = (fap)view.getTag();
                    final TextView a = fap.a;
                    final String a2 = mda.k.a;
                    final String lowerCase = ((x9p)mda).b.trim().toLowerCase(g6s.d());
                    final SpannableString text = new SpannableString((CharSequence)a2);
                    if (!lowerCase.isEmpty()) {
                        final String lowerCase2 = a2.toLowerCase(g6s.d());
                        int j = 0;
                        while (j < a2.length()) {
                            if (lowerCase2.substring(j).startsWith(lowerCase) && (j == 0 || a2.charAt(j - 1) == ' ')) {
                                text.setSpan((Object)new StyleSpan(1), j, lowerCase.length() + j, 18);
                                j += lowerCase.length();
                            }
                            else {
                                ++j;
                            }
                        }
                    }
                    a.setText((CharSequence)text);
                    final String a3 = mda.k.a;
                    final String b = ((x9p)mda).b;
                    boolean b2 = false;
                    Label_0671: {
                        if (!flr.e((CharSequence)b)) {
                            if (a3.toLowerCase(g6s.d()).indexOf(b.toLowerCase(g6s.d())) < a3.length() / 2) {
                                b2 = true;
                                break Label_0671;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        fap.a.setEllipsize(TextUtils$TruncateAt.END);
                    }
                    else {
                        fap.a.setEllipsize(TextUtils$TruncateAt.START);
                    }
                    if (!llr.a((CharSequence)mda.k.p)) {
                        fap.c.setText((CharSequence)mda.k.p);
                        ((View)fap.c).setVisibility(0);
                    }
                    else {
                        ((View)fap.c).setVisibility(8);
                    }
                    final hpj q2 = mda.k.q;
                    if (q2 != null) {
                        ((c)fap.b).p(new z8d$a(q2.a, (dwg)null));
                    }
                    else {
                        ((c)fap.b).p((z8d$a)null);
                    }
                    ufv = eg4.n(((x9p)mda).f, 16, this.g((x9p)mda));
                    break;
                }
                case 6: {
                    final a3m a3m = (a3m)x9p;
                    final gap gap2 = (gap)view.getTag();
                    final SpannableStringBuilder c2 = xli.c(((x9p)a3m).f, ((x9p)a3m).b);
                    final String x = jb2.X(c2.toString());
                    if (x != null && wfc.a().e(x)) {
                        fgc.c(view.getContext(), c2, new ctv(x, c2.length()), (View)gap2.a);
                    }
                    gap2.a.setText((CharSequence)c2);
                    final dmv k2 = a3m.k;
                    if (k2 != null) {
                        final int n2 = lap$a.b[k2.a().ordinal()];
                        gap2.d.setVisibility(8);
                        gap2.d.setImageDrawable((Drawable)null);
                        ((View)gap2.c).setVisibility(0);
                        gap2.c.setText((CharSequence)k2.a);
                    }
                    else {
                        gap2.d.setVisibility(8);
                        ((View)gap2.c).setVisibility(8);
                    }
                    this.i(gap2.b, ((x9p)a3m).f);
                    ufv = eg4.n(((x9p)a3m).f, 12, this.g((x9p)a3m));
                    break;
                }
                case 8: {
                    ufv = null;
                    break;
                }
                case 7: {
                    final xic xic = (xic)x9p;
                    final TextView textView = (TextView)view.findViewById(2131431809);
                    final View viewById = view.findViewById(2131428248);
                    textView.setText((CharSequence)xic.f);
                    if (xic.k == 1) {
                        viewById.setVisibility(0);
                        viewById.setOnClickListener(this.J0);
                        view.setContentDescription((CharSequence)xic.f);
                    }
                    else {
                        viewById.setVisibility(8);
                    }
                    textView.setAllCaps(false);
                    continue;
                }
                case 5: {
                    final int a4 = o5j.a;
                    final CustomScrollRecyclerView customScrollRecyclerView = (CustomScrollRecyclerView)view;
                    final bn3 bn3 = (bn3)x9p;
                    final Context f0 = super.F0;
                    final LinearLayoutManager layoutManager = new LinearLayoutManager(0);
                    final giq c3 = giq.c(f0);
                    final int dimensionPixelOffset = f0.getResources().getDimensionPixelOffset(2131167439);
                    ((View)customScrollRecyclerView).setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    ((RecyclerView)customScrollRecyclerView).setClipToPadding(false);
                    ((RecyclerView)customScrollRecyclerView).setLayoutManager((RecyclerView$m)layoutManager);
                    customScrollRecyclerView.setOnScrollTouchListener((CustomScrollRecyclerView$a)c3);
                    ((RecyclerView)customScrollRecyclerView).setAdapter((RecyclerView$e)this.N0.a((Object)bn3, (Object)this.h(n)));
                    continue;
                }
                case 4: {
                    final gap gap3 = (gap)view.getTag();
                    gap3.a.setText((CharSequence)xli.c(x9p.f, x9p.b));
                    ((View)gap3.a).setTag((Object)x9p.f);
                    ((View)gap3.c).setVisibility(8);
                    this.i(gap3.b, x9p.f);
                    ufv = eg4.n(x9p.f, 12, this.g(x9p));
                    break;
                }
                case 3: {
                    final gap gap4 = (gap)view.getTag();
                    gap4.a.setText((CharSequence)xli.c(x9p.f, x9p.b));
                    ((View)gap4.c).setVisibility(8);
                    this.i(gap4.b, x9p.f);
                    ufv = eg4.n(x9p.f, 13, this.g(x9p));
                    break;
                }
                case 2: {
                    final UserSocialView userSocialView = (UserSocialView)view;
                    final ljw ljw = (ljw)x9p;
                    final olw olw = (olw)((View)userSocialView).getTag();
                    final kjw g = ljw.g;
                    vmw.g((Object)g);
                    final ImageView imageView = (ImageView)((View)userSocialView).findViewById(2131427683);
                    final ImageView imageView2 = (ImageView)((View)userSocialView).findViewById(2131427685);
                    final FrameLayout frameLayout = (FrameLayout)((View)userSocialView).findViewById(2131427682);
                    ((BaseUserView)userSocialView).setUserId(g.a);
                    ((UserView)userSocialView).setIsFollower(fbx.I(g.g));
                    Objects.requireNonNull(olw);
                    ((BaseUserView)userSocialView).setUserAvatarShape(new j9w(g.h));
                    ((BaseUserView)userSocialView).setUserImageUrl(g.d);
                    ((BaseUserView)userSocialView).b(g.b, ljw.e);
                    ((BaseUserView)userSocialView).setVerified(g.e || g.i);
                    ((BaseUserView)userSocialView).setProtected(g.f);
                    olw.a = g.g;
                    final dmv k3 = ljw.k;
                    if (!xli.r() && k3 != null && k3.a() == ulv.K0) {
                        userSocialView.f();
                    }
                    else if (k3 != null) {
                        final String a5 = k3.a;
                        final String c4 = k3.c;
                        final int l2 = xli.l(k3.a());
                        int n3;
                        if (k3.a().ordinal() != 1) {
                            n3 = 0;
                        }
                        else {
                            n3 = 1;
                        }
                        userSocialView.h(a5, c4, l2, n3);
                    }
                    else {
                        final kjw g2 = ljw.g;
                        vmw.g((Object)g2);
                        final int g3 = g2.g;
                        ulv ulv;
                        if (fbx.I(g3) && fbx.J(g3)) {
                            ulv = ulv.N0;
                        }
                        else if (fbx.I(g3)) {
                            ulv = ulv.O0;
                        }
                        else if (fbx.J(g3)) {
                            ulv = ulv.P0;
                        }
                        else {
                            ulv = ulv.F0;
                        }
                        final Context f2 = super.F0;
                        String s = null;
                        switch (ulv.ordinal()) {
                            default: {
                                s = null;
                                break;
                            }
                            case 10: {
                                s = f2.getString(2131958138);
                                break;
                            }
                            case 9: {
                                s = f2.getString(2131958139);
                                break;
                            }
                            case 8: {
                                s = f2.getString(2131958133);
                                break;
                            }
                        }
                        final int l3 = xli.l(ulv);
                        int n4;
                        if (ulv.ordinal() != 1) {
                            n4 = 0;
                        }
                        else {
                            n4 = 1;
                        }
                        userSocialView.h(s, (String)null, l3, n4);
                    }
                    final p6p o2 = this.O0;
                    final long a6 = g.a;
                    Objects.requireNonNull(o2);
                    boolean b3 = false;
                    Label_1889: {
                        if (xli.u()) {
                            if (o2.a.r(a6) == be1.I0) {
                                b3 = true;
                                break Label_1889;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        final UserImageView imageView3 = ((BaseUserView)userSocialView).getImageView();
                        final long b4 = ljw.b();
                        final Resources resources = super.F0.getResources();
                        final int b5 = b1b.B(super.F0, 2130969036);
                        final float dimension = resources.getDimension(2131167467);
                        float n5;
                        if (xli.r()) {
                            n5 = resources.getDimension(2131167684);
                        }
                        else {
                            n5 = resources.getDimension(2131166396);
                        }
                        final int n6 = (int)(2.0f * dimension + n5);
                        imageView3.A(b5, dimension);
                        ((View)imageView2).getLayoutParams().height = n6;
                        ((View)imageView2).getLayoutParams().width = n6;
                        imageView.setVisibility(0);
                        imageView2.setVisibility(0);
                        final p6p o3 = this.O0;
                        Objects.requireNonNull(o3);
                        CharSequence l4;
                        if (!xli.u()) {
                            l4 = null;
                        }
                        else {
                            l4 = o3.a.l(b4);
                        }
                        if (!flr.e(l4)) {
                            ((View)frameLayout).setContentDescription((CharSequence)super.F0.getResources().getString(2131959299));
                            ((View)frameLayout).setOnClickListener((View$OnClickListener)new bb8((Object)this, (Object)l4, 17));
                        }
                    }
                    else {
                        final UserImageView imageView4 = ((BaseUserView)userSocialView).getImageView();
                        float n7;
                        if (xli.r()) {
                            n7 = super.F0.getResources().getDimension(2131167684);
                        }
                        else {
                            n7 = super.F0.getResources().getDimension(2131166396);
                        }
                        imageView4.setSize((int)n7);
                        imageView4.A(0, 0.0f);
                        imageView.setVisibility(8);
                        imageView2.setVisibility(8);
                    }
                    ufv = eg4.n(ljw.e, 3, this.g(ljw));
                    break;
                }
            }
            break;
        }
        final mhj<View, ufv> k4 = this.K0;
        if (k4 != null) {
            k4.g(view, (Object)ufv, n);
        }
        view.setOnClickListener((View$OnClickListener)new jap(this, n));
        if (lap.S0.contains(x9p.a)) {
            hdx.v(view, (View$OnLongClickListener)new kap(this, n));
        }
    }
    
    public final int d(final Object o) {
        int n = 0;
        switch (((Enum)((x9p)o).a).ordinal()) {
            default: {
                n = 4;
                break;
            }
            case 10: {
                n = 8;
                break;
            }
            case 9: {
                n = 7;
                break;
            }
            case 8: {
                n = 3;
                break;
            }
            case 7: {
                n = 2;
                break;
            }
            case 5: {
                n = 6;
                break;
            }
            case 4: {
                n = 1;
                break;
            }
            case 2: {
                n = 0;
                break;
            }
        }
        return n;
    }
    
    public final View f(final Context context, int n, final ViewGroup viewGroup) {
        if (n == 0) {
            if (xli.r()) {
                n = 2131625916;
            }
            else {
                n = 2131625917;
            }
            final UserSocialView userSocialView = (UserSocialView)this.L0.inflate(n, (ViewGroup)null);
            ((View)userSocialView).setTag((Object)new olw());
            return (View)userSocialView;
        }
        if (n == 2) {
            return this.L0.inflate(2131625630, viewGroup, false);
        }
        if (n == 3) {
            return this.L0.inflate(2131625955, viewGroup, false);
        }
        if (n == 6) {
            final CustomScrollRecyclerView customScrollRecyclerView = new CustomScrollRecyclerView(super.F0, (AttributeSet)null);
            ((View)customScrollRecyclerView).setImportantForAccessibility(2);
            return (View)customScrollRecyclerView;
        }
        if (n == 7) {
            final View inflate = this.L0.inflate(2131624418, viewGroup, false);
            inflate.setTag((Object)new fap(inflate));
            return inflate;
        }
        if (n != 8) {
            final View inflate2 = this.L0.inflate(2131625744, viewGroup, false);
            inflate2.setTag((Object)new gap(inflate2));
            return inflate2;
        }
        final View inflate3 = this.L0.inflate(2131624173, viewGroup, false);
        Objects.requireNonNull(lt3.Companion);
        e0e.f((Object)inflate3, "v");
        inflate3.setTag((Object)new lt3(inflate3));
        return inflate3;
    }
    
    public final int g(final x9p x9p) {
        final p4e e = this.e();
        if (e != null) {
            final q4e q4e = new q4e(e, e.getSize());
            int n = 0;
            while (q4e.hasNext()) {
                if (q4e.next().equals(x9p)) {
                    return n;
                }
                ++n;
            }
        }
        return 0;
    }
    
    public final int getViewTypeCount() {
        return 9;
    }
    
    public final int h(final int n) {
        final p4e e = this.e();
        vmw.g((Object)e);
        return new r5e(e, n).O1((nuk)z7g.g).getSize();
    }
    
    public final void i(final View view, final String tag) {
        view.setVisibility(0);
        view.setOnClickListener(this.I0);
        view.setTag((Object)tag);
    }
}
