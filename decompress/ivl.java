import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.util.HashSet;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import java.util.Locale;
import com.twitter.tipjar.TipJarFields;
import android.content.Context;
import java.util.List;
import androidx.appcompat.app.a$a;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivl implements khk, pyy
{
    public static final ivl C0;
    
    public static final void d(final List list, final Context context, final TipJarFields tipJarFields, final String s, final int n) {
        if (s.length() > 0) {
            list.add(new rbt(tipJarFields, tipJarFields.getTitleResource(), n, tipJarFields.getUri(context, s)));
        }
    }
    
    public static CharSequence g(final tqm tqm, String s, String s2, final String s3, int length) {
        final HashSet a = f0u.a;
        if (!pjr.e((CharSequence)s) && !pjr.e((CharSequence)s2)) {
            final String[] split = s.split("-");
            Locale locale;
            if (split.length > 1) {
                locale = new Locale(split[0], split[1]);
            }
            else {
                locale = new Locale(s);
            }
            s = locale.getDisplayLanguage(new Locale(s2));
        }
        else {
            s = "";
        }
        final f91 d0 = f91.D0;
        if (s3.equals("Ms")) {
            s2 = "Microsoft";
        }
        else {
            s2 = "Google";
        }
        final Resources b = tqm.b;
        s = b.getString(length, new Object[] { s, s2 });
        final int index = s.indexOf(s2);
        length = s2.length();
        Drawable drawable;
        if (s3.equals("Ms")) {
            drawable = tqm.j(2131232249);
        }
        else {
            drawable = tqm.j(2131232123);
        }
        xd9.b(drawable, b.getDimensionPixelSize(2131167654), 0);
        final ImageSpan imageSpan = new ImageSpan(drawable, 0);
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        spannableString.setSpan((Object)imageSpan, index, length + index, 33);
        return (CharSequence)spannableString;
    }
    
    public static String h(final Resources resources, final String s) {
        return resources.getString(2131955987, new Object[] { s });
    }
    
    public static String i(final Resources resources) {
        return resources.getString(2131955996);
    }
    
    public static final UserIdentifier j(final y1t y1t) {
        zzd.f((Object)y1t, "<this>");
        return UserIdentifier.Companion.a(y1t.a.a.c);
    }
    
    public static final UserIdentifier k(final y1t y1t) {
        zzd.f((Object)y1t, "<this>");
        final UserIdentifier f = y1t.f;
        zzd.e((Object)f, "owner");
        return f;
    }
    
    public static final aav l(final y1t y1t) {
        zzd.f((Object)y1t, "<this>");
        final aav d2 = aav.d2(y1t.f);
        zzd.e((Object)d2, "get(owner)");
        return d2;
    }
    
    public static boolean m() {
        return dta.b().b("home_timeline_tweet_auto_inline_reply_enabled", false);
    }
    
    public static final void n(final List list, final ek2 ek2) {
        zzd.f((Object)list, "sessions");
        zzd.f((Object)ek2, "logger");
        if (list.isEmpty()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Current Sessions from Guest Service :");
        int n;
        if (list.isEmpty()) {
            n = 0;
        }
        else {
            final Iterator iterator = list.iterator();
            n = 0;
            while (iterator.hasNext()) {
                final Integer h = ((kac)iterator.next()).h();
                boolean b = false;
                Label_0108: {
                    if (h != null) {
                        if (h == 1) {
                            b = true;
                            break Label_0108;
                        }
                    }
                    b = false;
                }
                if (b) {
                    if (++n >= 0) {
                        continue;
                    }
                    tdy.U0();
                    throw null;
                }
            }
        }
        for (final kac kac : list) {
            final Integer h2 = kac.h();
            zzd.d((Object)h2, "null cannot be cast to non-null type kotlin.Int");
            final int intValue = h2;
            if (intValue != 1) {
                final String t = poa.T(poa.z(intValue));
                final StringBuilder y = mb0.y("\n - ", kac.g(), "(", kac.f(), ") : ");
                y.append(t);
                sb.append(y.toString());
            }
        }
        if (n > 0) {
            final int d = nb0.D(2);
            String s;
            if (d != 0) {
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d != 4) {
                                if (d != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s = "Removed";
                            }
                            else {
                                s = "Added";
                            }
                        }
                        else {
                            s = "Countdown";
                        }
                    }
                    else {
                        s = "Connecting";
                    }
                }
                else {
                    s = "Pending";
                }
            }
            else {
                s = "Unknown";
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("\n + ");
            sb2.append(n);
            sb2.append(" ");
            sb2.append(s);
            sb.append(sb2.toString());
        }
        ek2.i(sb.toString(), false);
    }
    
    public static boolean p(final vo6 vo6, final wou wou, final long n) {
        if (vo6.D0()) {
            if (kvu.g(vo6) && !vo6.k0()) {
                return false;
            }
            final oo4 t = rp2.T(vo6);
            if (t != null) {
                final ztm c1 = vo6.C0.C1;
                if (c1 != null && c1.b == t.b.C0) {
                    return false;
                }
            }
            if (n != vo6.J()) {
                return wou.a(13) ^ true;
            }
            if (vo6.C0.E0 && !kvu.g(vo6)) {
                return wou.a.contains(44) ^ true;
            }
        }
        return false;
    }
    
    public Object a() {
        final azy c = fzy.c;
        return fsz.D0.b().k();
    }
    
    public List b() {
        final Locale default1 = Locale.getDefault();
        zzd.e((Object)default1, "getDefault()");
        return tdy.u0((Object)new r40(default1));
    }
    
    public jhk c(final String s) {
        zzd.f((Object)s, "languageTag");
        final Locale forLanguageTag = Locale.forLanguageTag(s);
        zzd.e((Object)forLanguageTag, "forLanguageTag(languageTag)");
        return (jhk)new r40(forLanguageTag);
    }
    
    public boolean e(final wb8 wb8, final wb8 wb9, final boolean b, final boolean b2) {
        final boolean b3 = wb8 instanceof pb4;
        final boolean b4 = true;
        boolean b5;
        if (b3 && wb9 instanceof pb4) {
            b5 = zzd.a((Object)((hc4)wb8).j(), (Object)((hc4)wb9).j());
        }
        else if (wb8 instanceof ijv && wb9 instanceof ijv) {
            b5 = this.f((ijv)wb8, (ijv)wb9, b, (gub)zp8.C0);
        }
        else if (wb8 instanceof q93 && wb9 instanceof q93) {
            final q93 q93 = (q93)wb8;
            final q93 q94 = (q93)wb9;
            zzd.f((Object)q93, "a");
            zzd.f((Object)q94, "b");
            if (zzd.a((Object)q93, (Object)q94)) {
                b5 = b4;
            }
            else {
                Label_0344: {
                    if (zzd.a((Object)((wb8)q93).getName(), (Object)((wb8)q94).getName())) {
                        if (!b2 || !(q93 instanceof u2h) || !(q94 instanceof u2h) || ((u2h)q93).j0() == ((u2h)q94).j0()) {
                            if (zzd.a((Object)((yb8)q93).b(), (Object)((yb8)q94).b())) {
                                if (!b) {
                                    break Label_0344;
                                }
                                if (!zzd.a((Object)this.q(q93), (Object)this.q(q94))) {
                                    break Label_0344;
                                }
                            }
                            if (!pq8.r((wb8)q93)) {
                                if (!pq8.r((wb8)q94)) {
                                    if (this.o((wb8)q93, (wb8)q94, (gub)xp8.C0, b)) {
                                        final iqj iqj = new iqj((rse$a)new yp8(b, q93, q94));
                                        if (iqj.m(q93, q94, (pb4)null, true).c() == 1 && iqj.m(q94, q93, (pb4)null, true).c() == 1) {
                                            b5 = b4;
                                            return b5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b5 = false;
            }
        }
        else if (wb8 instanceof brj && wb9 instanceof brj) {
            b5 = zzd.a((Object)((brj)wb8).e(), (Object)((brj)wb9).e());
        }
        else {
            b5 = zzd.a((Object)wb8, (Object)wb9);
        }
        return b5;
    }
    
    public boolean f(final ijv ijv, final ijv ijv2, final boolean b, final gub gub) {
        zzd.f((Object)ijv, "a");
        zzd.f((Object)ijv2, "b");
        zzd.f((Object)gub, "equivalentCallables");
        final boolean a = zzd.a((Object)ijv, (Object)ijv2);
        final boolean b2 = true;
        return a || (!zzd.a((Object)((yb8)ijv).b(), (Object)((yb8)ijv2).b()) && this.o((wb8)ijv, (wb8)ijv2, gub, b) && ijv.getIndex() == ijv2.getIndex() && b2);
    }
    
    public boolean o(wb8 b, wb8 b2, final gub gub, final boolean b3) {
        b = b.b();
        b2 = b2.b();
        boolean b4;
        if (!(b instanceof s93) && !(b2 instanceof s93)) {
            b4 = this.e(b, b2, b3, true);
        }
        else {
            b4 = (boolean)gub.invoke((Object)b, (Object)b2);
        }
        return b4;
    }
    
    public blq q(q93 q93) {
        while (q93 instanceof s93) {
            final s93 s93 = (s93)q93;
            if (s93.i() != s93$a.D0) {
                break;
            }
            final Collection d = s93.d();
            zzd.e((Object)d, "overriddenDescriptors");
            q93 = (q93)or4.c2((Iterable)d);
            if (q93 != null) {
                continue;
            }
            return null;
        }
        return ((bc8)q93).m();
    }
}
