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
import android.graphics.drawable.Drawable;
import android.widget.TextView;
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

public final class z8p extends t3e<l8p>
{
    public static final List<l8p$a> P0;
    public final View$OnClickListener F0;
    public final View$OnClickListener G0;
    public final sgj<View, lev> H0;
    public final LayoutInflater I0;
    public final ct3 J0;
    public final xqa<sm3, Integer, rm3> K0;
    public final c5p L0;
    public z8p.z8p$b M0;
    public z8p.z8p$c N0;
    public z8p.z8p$d O0;
    
    static {
        P0 = ijf.w((Object)l8p$a.J0, (Object[])new l8p$a[] { l8p$a.K0, l8p$a.E0, l8p$a.G0, l8p$a.H0, l8p$a.L0, l8p$a.D0 });
    }
    
    public z8p(final Activity activity, final View$OnClickListener f0, final sgj<View, lev> h0, final g8p.d d, final View$OnClickListener g0, final LayoutInflater i0, final jev jev, final ct3 j0, final c5p l0, final n8p n8p) {
        super((Context)activity);
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = g0;
        this.I0 = i0;
        this.J0 = j0;
        this.L0 = l0;
        this.K0 = new w8p(activity, i0, d, jev, l0, n8p);
    }
    
    public final void c(final View view, Context c0, final Object o, final int n) {
        final l8p l8p = (l8p)o;
        final int ordinal = ((Enum)l8p.a).ordinal();
        final t8d$a t8d$a = null;
        lev lev = null;
        Label_2233: {
            switch (ordinal) {
                default: {
                    final dk8 dk8 = (dk8)l8p;
                    final u8p u8p = (u8p)view.getTag();
                    ((View)u8p.c).setVisibility(8);
                    if (dk8.k != 1) {
                        u8p.a.setText((CharSequence)bfe.h(((l8p)dk8).f, ((l8p)dk8).b));
                        this.i(u8p.b, ((l8p)dk8).f);
                    }
                    else {
                        u8p.a.setText((CharSequence)((l8p)dk8).f);
                        u8p.b.setVisibility(8);
                    }
                    lev = yf4.n(((l8p)dk8).f, 12, this.g((l8p)dk8));
                    break Label_2233;
                }
                case 10: {
                    final sq3 sq3 = (sq3)l8p;
                    final dt3 dt3 = (dt3)view.getTag();
                    final String l = sq3.l;
                    pf8.q(l);
                    final ct3 j0 = this.J0;
                    final hfv m = sq3.m;
                    final mev k = sq3.k;
                    final moj q = k.q;
                    final String p4 = k.p;
                    Objects.requireNonNull(j0);
                    zzd.f((Object)dt3, "vh");
                    zzd.f((Object)m, "creator");
                    dt3.F0.setText((CharSequence)l);
                    dt3.K0.setText((CharSequence)pjr.l(m.J0));
                    dt3.G0.I(m, true);
                    dt3.H0.setText((CharSequence)m.c());
                    Objects.requireNonNull(ct3.Companion);
                    Object croppingRectangleProvider = null;
                    Label_0266: {
                        if (q != null) {
                            final List c2 = q.c;
                            zzd.e((Object)c2, "originalInfo.focusRects");
                            if (c2.isEmpty() ^ true) {
                                croppingRectangleProvider = new bt3(q);
                                break Label_0266;
                            }
                        }
                        croppingRectangleProvider = null;
                    }
                    ((c)dt3.E0).setCroppingRectangleProvider((b$a)croppingRectangleProvider);
                    final FrescoMediaImageView e0 = dt3.E0;
                    t8d$a d;
                    if (q == null) {
                        d = t8d$a;
                    }
                    else {
                        d = u8d.d(q.a, q.b, (z5w)null);
                    }
                    ((c)e0).q(d, true);
                    if (m.L0) {
                        dt3.I0.setVisibility(0);
                    }
                    else {
                        dt3.I0.setVisibility(8);
                    }
                    if (m.M0) {
                        dt3.J0.setVisibility(0);
                    }
                    else {
                        dt3.J0.setVisibility(8);
                    }
                    Objects.requireNonNull(j0.a);
                    if (dta.b().b("search_channels_description_enabled", false)) {
                        h6q.Y(dt3.L0, (CharSequence)p4);
                    }
                    lev = yf4.m(sq3.k.g, l, 11, this.g((l8p)sq3), (String)null);
                    break Label_2233;
                }
                case 9: {
                    final wca wca = (wca)l8p;
                    final t8p t8p = (t8p)view.getTag();
                    final TextView a = t8p.a;
                    final String a2 = wca.k.a;
                    final String lowerCase = ((l8p)wca).b.trim().toLowerCase(t4s.d());
                    final SpannableString text = new SpannableString((CharSequence)a2);
                    if (!lowerCase.isEmpty()) {
                        final String lowerCase2 = a2.toLowerCase(t4s.d());
                        int i = 0;
                        while (i < a2.length()) {
                            if (lowerCase2.substring(i).startsWith(lowerCase) && (i == 0 || a2.charAt(i - 1) == ' ')) {
                                text.setSpan((Object)new StyleSpan(1), i, lowerCase.length() + i, 18);
                                i += lowerCase.length();
                            }
                            else {
                                ++i;
                            }
                        }
                    }
                    a.setText((CharSequence)text);
                    final String a3 = wca.k.a;
                    final String b = ((l8p)wca).b;
                    boolean b2 = false;
                    Label_0671: {
                        if (!pjr.e((CharSequence)b)) {
                            if (a3.toLowerCase(t4s.d()).indexOf(b.toLowerCase(t4s.d())) < a3.length() / 2) {
                                b2 = true;
                                break Label_0671;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        t8p.a.setEllipsize(TextUtils$TruncateAt.END);
                    }
                    else {
                        t8p.a.setEllipsize(TextUtils$TruncateAt.START);
                    }
                    if (!vjr.a((CharSequence)wca.k.p)) {
                        t8p.c.setText((CharSequence)wca.k.p);
                        ((View)t8p.c).setVisibility(0);
                    }
                    else {
                        ((View)t8p.c).setVisibility(8);
                    }
                    final moj q2 = wca.k.q;
                    if (q2 != null) {
                        ((c)t8p.b).p(new t8d$a(q2.a, (kvg)null));
                    }
                    else {
                        ((c)t8p.b).p((t8d$a)null);
                    }
                    lev = yf4.n(((l8p)wca).f, 16, this.g((l8p)wca));
                    break Label_2233;
                }
                case 8: {
                    break;
                }
                case 7: {
                    final vic vic = (vic)l8p;
                    final TextView textView = (TextView)view.findViewById(2131431805);
                    final View viewById = view.findViewById(2131428248);
                    textView.setText((CharSequence)((l8p)vic).f);
                    if (vic.k == 1) {
                        viewById.setVisibility(0);
                        viewById.setOnClickListener(this.G0);
                        view.setContentDescription((CharSequence)((l8p)vic).f);
                    }
                    else {
                        viewById.setVisibility(8);
                    }
                    textView.setAllCaps(false);
                    break;
                }
                case 6: {
                    final a2m a2m = (a2m)l8p;
                    final u8p u8p2 = (u8p)view.getTag();
                    final SpannableStringBuilder h = bfe.h(a2m.f, a2m.b);
                    final String f = fk7.F(h.toString());
                    if (f != null && ufc.a().e(f)) {
                        dgc.c(view.getContext(), h, new wrv(f, h.length()), (View)u8p2.a);
                    }
                    u8p2.a.setText((CharSequence)h);
                    final ukv k2 = a2m.k;
                    if (k2 != null) {
                        final int n2 = z8p$a.b[k2.a().ordinal()];
                        u8p2.d.setVisibility(8);
                        u8p2.d.setImageDrawable((Drawable)null);
                        ((View)u8p2.c).setVisibility(0);
                        u8p2.c.setText((CharSequence)k2.a);
                    }
                    else {
                        u8p2.d.setVisibility(8);
                        ((View)u8p2.c).setVisibility(8);
                    }
                    this.i(u8p2.b, a2m.f);
                    lev = yf4.n(a2m.f, 12, this.g(a2m));
                    break Label_2233;
                }
                case 5: {
                    final int a4 = w4j.a;
                    final CustomScrollRecyclerView customScrollRecyclerView = (CustomScrollRecyclerView)view;
                    final sm3 sm3 = (sm3)l8p;
                    c0 = super.C0;
                    final LinearLayoutManager layoutManager = new LinearLayoutManager(0);
                    final rgq c3 = rgq.c(c0);
                    final int dimensionPixelOffset = c0.getResources().getDimensionPixelOffset(2131167439);
                    ((View)customScrollRecyclerView).setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    ((RecyclerView)customScrollRecyclerView).setClipToPadding(false);
                    ((RecyclerView)customScrollRecyclerView).setLayoutManager((RecyclerView$m)layoutManager);
                    customScrollRecyclerView.setOnScrollTouchListener((CustomScrollRecyclerView$a)c3);
                    ((RecyclerView)customScrollRecyclerView).setAdapter((RecyclerView$e)this.K0.a((Object)sm3, (Object)this.h(n)));
                    break;
                }
                case 4: {
                    final u8p u8p3 = (u8p)view.getTag();
                    u8p3.a.setText((CharSequence)bfe.h(l8p.f, l8p.b));
                    ((View)u8p3.a).setTag((Object)l8p.f);
                    ((View)u8p3.c).setVisibility(8);
                    this.i(u8p3.b, l8p.f);
                    lev = yf4.n(l8p.f, 12, this.g(l8p));
                    break Label_2233;
                }
                case 3: {
                    final u8p u8p4 = (u8p)view.getTag();
                    u8p4.a.setText((CharSequence)bfe.h(l8p.f, l8p.b));
                    ((View)u8p4.c).setVisibility(8);
                    this.i(u8p4.b, l8p.f);
                    lev = yf4.n(l8p.f, 13, this.g(l8p));
                    break Label_2233;
                }
                case 2: {
                    final UserSocialView userSocialView = (UserSocialView)view;
                    final diw diw = (diw)l8p;
                    final ckw ckw = (ckw)((View)userSocialView).getTag();
                    final ciw g = ((l8p)diw).g;
                    pf8.r(g);
                    final ImageView imageView = (ImageView)((View)userSocialView).findViewById(2131427683);
                    final ImageView imageView2 = (ImageView)((View)userSocialView).findViewById(2131427685);
                    final FrameLayout frameLayout = (FrameLayout)((View)userSocialView).findViewById(2131427682);
                    ((BaseUserView)userSocialView).setUserId(g.a);
                    ((UserView)userSocialView).setIsFollower(tdy.d0(g.g));
                    Objects.requireNonNull(ckw);
                    ((BaseUserView)userSocialView).setUserAvatarShape(new l8w(g.h));
                    ((BaseUserView)userSocialView).setUserImageUrl(g.d);
                    ((BaseUserView)userSocialView).b(g.b, ((l8p)diw).e);
                    ((BaseUserView)userSocialView).setVerified(g.e || g.i);
                    ((BaseUserView)userSocialView).setProtected(g.f);
                    ckw.a = g.g;
                    final ukv k3 = diw.k;
                    if (k3 != null && (bfe.u() || k3.a() != lkv.H0)) {
                        final String a5 = k3.a;
                        final int ordinal2 = k3.a().ordinal();
                        int n4;
                        final int n3 = n4 = 2131232318;
                        while (true) {
                            switch (ordinal2) {
                                default: {
                                    n4 = 0;
                                    break Label_1749;
                                }
                                case 10: {
                                    n4 = n3;
                                    if (ukg.n0()) {
                                        n4 = 2131232106;
                                    }
                                    break Label_1749;
                                }
                                case 8: {
                                    n4 = n3;
                                    if (ukg.n0()) {
                                        n4 = 2131232101;
                                    }
                                    break Label_1749;
                                }
                                case 3:
                                case 9: {
                                    n4 = n3;
                                    if (ukg.n0()) {
                                        n4 = 2131232099;
                                    }
                                    break Label_1749;
                                }
                                case 2:
                                case 4:
                                case 7: {
                                    int n5;
                                    if (k3.a().ordinal() != 1) {
                                        n5 = 0;
                                    }
                                    else {
                                        n5 = 1;
                                    }
                                    userSocialView.g(a5, n4, n5);
                                    break;
                                }
                                case 6: {
                                    n4 = 2131232206;
                                    continue;
                                }
                                case 1: {
                                    n4 = 2131232269;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    else {
                        userSocialView.f();
                    }
                    final c5p l2 = this.L0;
                    final long a6 = g.a;
                    Objects.requireNonNull(l2);
                    boolean b3 = false;
                    Label_1844: {
                        if (bfe.x()) {
                            if (l2.a.r(a6) == ce1.F0) {
                                b3 = true;
                                break Label_1844;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        final UserImageView imageView3 = ((BaseUserView)userSocialView).getImageView();
                        final long b4 = diw.b();
                        final Resources resources = super.C0.getResources();
                        final int j2 = goz.J(super.C0, 2130969036);
                        final float dimension = resources.getDimension(2131167467);
                        float n6;
                        if (bfe.u()) {
                            n6 = resources.getDimension(2131167684);
                        }
                        else {
                            n6 = resources.getDimension(2131166396);
                        }
                        final int n7 = (int)(2.0f * dimension + n6);
                        imageView3.A(j2, dimension);
                        ((View)imageView2).getLayoutParams().height = n7;
                        ((View)imageView2).getLayoutParams().width = n7;
                        imageView.setVisibility(0);
                        imageView2.setVisibility(0);
                        final c5p l3 = this.L0;
                        Objects.requireNonNull(l3);
                        CharSequence l4;
                        if (!bfe.x()) {
                            l4 = null;
                        }
                        else {
                            l4 = l3.a.l(b4);
                        }
                        if (!pjr.e(l4)) {
                            ((View)frameLayout).setContentDescription((CharSequence)super.C0.getResources().getString(2131959297));
                            ((View)frameLayout).setOnClickListener((View$OnClickListener)new gpa(this, l4, 17));
                        }
                    }
                    else {
                        final UserImageView imageView4 = ((BaseUserView)userSocialView).getImageView();
                        float n8;
                        if (bfe.u()) {
                            n8 = super.C0.getResources().getDimension(2131167684);
                        }
                        else {
                            n8 = super.C0.getResources().getDimension(2131166396);
                        }
                        imageView4.setSize((int)n8);
                        imageView4.A(0, 0.0f);
                        imageView.setVisibility(8);
                        imageView2.setVisibility(8);
                    }
                    lev = yf4.n(((l8p)diw).e, 3, this.g((l8p)diw));
                    break Label_2233;
                }
            }
            lev = null;
        }
        final sgj<View, lev> h2 = this.H0;
        if (h2 != null) {
            h2.g(view, (Object)lev, n);
        }
        view.setOnClickListener((View$OnClickListener)new x8p(this, n));
        if (z8p.P0.contains(l8p.a)) {
            tbx.v(view, (View$OnLongClickListener)new y8p(this, n));
        }
    }
    
    public final int d(final Object o) {
        int n = 0;
        switch (((Enum)((l8p)o).a).ordinal()) {
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
            if (bfe.u()) {
                n = 2131625914;
            }
            else {
                n = 2131625915;
            }
            final UserSocialView userSocialView = (UserSocialView)this.I0.inflate(n, (ViewGroup)null);
            ((View)userSocialView).setTag((Object)new ckw());
            return (View)userSocialView;
        }
        if (n == 2) {
            return this.I0.inflate(2131625628, viewGroup, false);
        }
        if (n == 3) {
            return this.I0.inflate(2131625953, viewGroup, false);
        }
        if (n == 6) {
            final CustomScrollRecyclerView customScrollRecyclerView = new CustomScrollRecyclerView(super.C0, (AttributeSet)null);
            ((View)customScrollRecyclerView).setImportantForAccessibility(2);
            return (View)customScrollRecyclerView;
        }
        if (n == 7) {
            final View inflate = this.I0.inflate(2131624418, viewGroup, false);
            inflate.setTag((Object)new t8p(inflate));
            return inflate;
        }
        if (n != 8) {
            final View inflate2 = this.I0.inflate(2131625742, viewGroup, false);
            inflate2.setTag((Object)new u8p(inflate2));
            return inflate2;
        }
        final View inflate3 = this.I0.inflate(2131624173, viewGroup, false);
        Objects.requireNonNull(dt3.Companion);
        zzd.f((Object)inflate3, "v");
        inflate3.setTag((Object)new dt3(inflate3));
        return inflate3;
    }
    
    public final int g(final l8p l8p) {
        final i4e e = this.e();
        if (e != null) {
            final j4e j4e = new j4e(e, e.getSize());
            int n = 0;
            while (((an1)j4e).hasNext()) {
                if (((an1)j4e).next().equals(l8p)) {
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
        final i4e e = this.e();
        pf8.r(e);
        return new j5e((Iterable)e, n).O1((otk)msf.i).getSize();
    }
    
    public final void i(final View view, final String tag) {
        view.setVisibility(0);
        view.setOnClickListener(this.F0);
        view.setTag((Object)tag);
    }
}
