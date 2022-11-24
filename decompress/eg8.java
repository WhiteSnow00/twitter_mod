import android.util.Log;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import android.net.Uri;
import com.facebook.imagepipeline.request.a;
import java.io.IOException;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import android.graphics.Shader;
import android.content.res.Resources;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import okhttp3.OkHttpClient;
import java.util.logging.Level;
import java.util.logging.Logger;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.Region;
import com.twitter.weaver.mvi.MviViewModel;
import java.util.regex.Pattern;
import java.lang.annotation.Annotation;
import kotlin.NoWhenBranchMatchedException;
import java.util.Locale;
import java.util.Comparator;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.text.Spannable;
import android.text.Editable;
import java.util.Objects;
import android.view.View;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class eg8 implements d83, btl, gjc, mcy, c0z, f000, k26
{
    public static eg8 F0;
    public static final eg8 G0;
    public static final eg8 H0;
    public static final apx I0;
    public static final apx J0;
    public static final apx K0;
    public static final apx L0;
    public static final float[] M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static volatile pk7 Q0;
    public static final eg8 R0;
    public static final eg8 S0;
    public static final eg8 T0;
    public static final eg8 U0;
    
    static {
        G0 = new eg8();
        H0 = new eg8();
        I0 = new apx(0.31006f, 0.31616f);
        J0 = new apx(0.34567f, 0.3585f);
        K0 = new apx(0.32168f, 0.33767f);
        L0 = new apx(0.31271f, 0.32902f);
        M0 = new float[] { 0.964212f, 1.0f, 0.825188f };
        N0 = new int[] { 2131955636, 2131955637 };
        O0 = new int[] { 16842948 };
        P0 = new int[] { 2130968869 };
        eg8.Q0 = new pk7(null);
        R0 = new eg8();
        S0 = new eg8();
        T0 = new eg8();
        U0 = new eg8();
    }
    
    public eg8() {
    }
    
    public eg8(final w7w w7w, final kcm kcm, final fxs fxs) {
        e0e.f((Object)w7w, "pageTracker");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)fxs, "timelineIdentifier");
        String b;
        if ((b = fxs.a.b) == null) {
            b = "";
        }
        final HashMap b2 = w7w.b;
        Object o;
        if ((o = b2.get(b)) == null) {
            o = 0;
            b2.put(b, o);
        }
        b2.put(b, ((Number)o).intValue() + 1);
        kcm.i((sj)new uj4((Object)w7w, (Object)fxs, 11));
    }
    
    public static final boolean A(final apx apx, final apx apx2) {
        e0e.f((Object)apx, "a");
        e0e.f((Object)apx2, "b");
        boolean b = true;
        if (apx == apx2) {
            return true;
        }
        if (Math.abs(apx.a - apx2.a) >= 0.001f || Math.abs(apx.b - apx2.b) >= 0.001f) {
            b = false;
        }
        return b;
    }
    
    public static final jci A0(final d86 d86) {
        d86.x(1471602047);
        final sa6$b a = sa6.a;
        final View view = (View)d86.m((df6)z20.f);
        d86.x(1157296644);
        final boolean p = d86.P((Object)view);
        final Object y = d86.y();
        lci lci = null;
        Label_0087: {
            if (!p) {
                Objects.requireNonNull(d86.Companion);
                if ((lci = (lci)y) != d86$a.b) {
                    break Label_0087;
                }
            }
            lci = new lci(view);
            d86.p((Object)lci);
        }
        d86.O();
        final lci lci2 = lci;
        d86.O();
        return lci2;
    }
    
    public static final int B(final float n) {
        double n2;
        if (n >= 0.0f) {
            n2 = Math.ceil(n);
        }
        else {
            n2 = Math.floor(n);
        }
        return (int)(float)n2 * -1;
    }
    
    public static void B0(final Editable editable, final Object o) {
        final int spanStart = ((Spanned)editable).getSpanStart(o);
        final int spanEnd = ((Spanned)editable).getSpanEnd(o);
        if (spanStart >= 0) {
            if (spanEnd >= spanStart) {
                ((Spannable)editable).removeSpan(o);
                editable.replace(spanStart, spanEnd, (CharSequence)"");
            }
        }
    }
    
    public static oi6 C(final es4 es4, es4 d, final int n) {
        if ((n & 0x1) != 0x0) {
            final fs4 a = fs4.a;
            d = (es4)fs4.d;
        }
        if ((n & 0x2) != 0x0) {
            Objects.requireNonNull(ufm.Companion);
        }
        e0e.f((Object)es4, "$this$connect");
        e0e.f((Object)d, "destination");
        Object o;
        if (es4 == d) {
            Objects.requireNonNull(oi6.Companion);
            Objects.requireNonNull(ufm.Companion);
            o = new ni6(es4);
        }
        else {
            final long b = es4.b;
            Objects.requireNonNull(yr4.Companion);
            final yr4$a companion = yr4.Companion;
            final long a2 = yr4.a;
            if (yr4.a(b, a2) && yr4.a(d.b, a2)) {
                o = new oi6$b((rxm)es4, (rxm)d, 0);
            }
            else {
                o = new oi6(es4, d, 0);
            }
        }
        return (oi6)o;
    }
    
    public static final Object C0(final Object o, Class class1) {
        e0e.f((Object)class1, "clazz");
        if (o != null && !class1.isAssignableFrom(o.getClass())) {
            class1 = o.getClass();
            final StringBuilder sb = new StringBuilder();
            sb.append("ThisType method returned unexpected type ");
            sb.append(class1);
            throw new IllegalArgumentException(sb.toString());
        }
        return o;
    }
    
    public static Spannable D(final String s, final int n) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        spannableString.setSpan((Object)new ForegroundColorSpan(n), 0, s.length(), 33);
        return (Spannable)spannableString;
    }
    
    public static boolean D0(final qdw qdw, final qgv qgv, final uu uu) {
        boolean b2;
        final boolean b = b2 = false;
        if (qgv != null) {
            if (uu == null) {
                b2 = b;
            }
            else {
                b2 = b;
                if (t(qdw)) {
                    final long f0 = qgv.F0;
                    boolean b3 = false;
                    Label_0110: {
                        if (uu.a.containsKey(f0)) {
                            final Iterator iterator = uu.a.get(f0).iterator();
                            while (iterator.hasNext()) {
                                if (((tu)iterator.next()).e) {
                                    b3 = true;
                                    break Label_0110;
                                }
                            }
                        }
                        b3 = false;
                    }
                    b2 = b;
                    if (b3) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public static final String E(final akv akv) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("type: ");
        sb2.append(akv);
        F(sb2.toString(), sb);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("hashCode: ");
        sb3.append(akv.hashCode());
        F(sb3.toString(), sb);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("javaClass: ");
        sb4.append(akv.getClass().getCanonicalName());
        F(sb4.toString(), sb);
        for (Object o = akv.d(); o != null; o = ((kc8)o).b()) {
            final StringBuilder f = ehk.f("fqName: ");
            f.append(rq8.a.M((kc8)o));
            F(f.toString(), sb);
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("javaClass: ");
            sb5.append(((kc8)o).getClass().getCanonicalName());
            F(sb5.toString(), sb);
        }
        final String string = sb.toString();
        e0e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static boolean E0(final qdw qdw, final qgv qgv, final uu uu, final boolean b) {
        final boolean d0 = D0(qdw, qgv, uu);
        boolean b3;
        final boolean b2 = b3 = false;
        if (d0) {
            b3 = b2;
            if (ita.b().b("ads_companion_profile_button_enabled", false)) {
                b3 = b2;
                if (b) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public static final StringBuilder F(final String s, final StringBuilder sb) {
        e0e.f((Object)s, "<this>");
        sb.append(s);
        sb.append('\n');
        return sb;
    }
    
    public static final Set F0(final Collection collection, final Map map) {
        e0e.f((Object)map, "requestedUserIds");
        final ArrayList list = new ArrayList();
        final Iterator iterator = collection.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final boolean b = true;
            if (!hasNext) {
                break;
            }
            final Object next = iterator.next();
            final RoomUserItem roomUserItem = (RoomUserItem)next;
            int n = b ? 1 : 0;
            if (!map.containsKey(roomUserItem.getTwitterUserId())) {
                if (map.containsKey(roomUserItem.getPeriscopeUserId())) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            if (n == 0) {
                continue;
            }
            list.add(next);
        }
        final ArrayList list2 = new ArrayList<RoomUserItem>(nr4.d1((Iterable)list, 10));
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(RoomUserItem.copy$default((RoomUserItem)iterator2.next(), (String)null, (String)null, (String)null, false, (String)null, ojo.I0, false, false, false, (String)null, (String)null, (Boolean)null, (Boolean)null, false, (RaisedHand)null, false, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2097119, (Object)null));
        }
        final List b2 = rr4.b2((Iterable)list2, (Comparator)new mjo(map));
        final ArrayList<RoomUserItem> list3 = new ArrayList<RoomUserItem>();
        for (final Object next2 : collection) {
            final RoomUserItem roomUserItem2 = (RoomUserItem)next2;
            if (!map.containsKey(roomUserItem2.getTwitterUserId()) && !map.containsKey(roomUserItem2.getPeriscopeUserId())) {
                list3.add((RoomUserItem)next2);
            }
        }
        final ArrayList list4 = new ArrayList<RoomUserItem>(nr4.d1((Iterable)list3, 10));
        final Iterator<RoomUserItem> iterator4 = list3.iterator();
        while (iterator4.hasNext()) {
            list4.add(RoomUserItem.copy$default((RoomUserItem)iterator4.next(), (String)null, (String)null, (String)null, false, (String)null, ojo.J0, false, false, false, (String)null, (String)null, (Boolean)null, (Boolean)null, false, (RaisedHand)null, false, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2097119, (Object)null));
        }
        return rr4.n2((Iterable)rr4.T1((Collection)b2, (Iterable)list4));
    }
    
    public static void G(final caq caq, final ocj ocj, final b39 b39, final vtl vtl) {
        int f = 1;
        while (!v(vtl.J0, ((gaq)caq).isEmpty(), ocj, (gaq)caq, b39, vtl)) {
            while (true) {
                final boolean j0 = vtl.J0;
                final Object poll = caq.poll();
                final boolean b40 = poll == null;
                if (v(j0, b40, ocj, (gaq)caq, b39, vtl)) {
                    return;
                }
                if (b40) {
                    if ((f = vtl.f(-f)) == 0) {
                        return;
                    }
                    break;
                }
                else {
                    vtl.a(ocj, poll);
                }
            }
        }
    }
    
    public static n5r G0(float n, Object o, final int n2) {
        float n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 1500.0f;
        }
        if ((n2 & 0x4) != 0x0) {
            o = null;
        }
        return new n5r(n3, n, o);
    }
    
    public static int H(String upperCase) {
        if (upperCase == null) {
            return 2131231779;
        }
        upperCase = upperCase.toUpperCase(Locale.ENGLISH);
        switch (upperCase) {
            default: {
                return 2131231779;
            }
            case "SPEAKER": {
                return 2131232456;
            }
            case "MESSAGE": {
                return 2131231772;
            }
            case "FOLLOW": {
                return 2131231773;
            }
            case "REPLY": {
                return 2131231777;
            }
            case "RETWEET": {
                return 2131231778;
            }
            case "MENTION": {
                return 2131231776;
            }
            case "FAVORITE": {
                return 2131231775;
            }
        }
    }
    
    public static p9e H0(final int n, boolean b, boolean b2, rkv rkv, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            b = false;
        }
        if ((n2 & 0x2) != 0x0) {
            b2 = false;
        }
        if ((n2 & 0x4) != 0x0) {
            rkv = null;
        }
        mqb.n(n, "<this>");
        Set w;
        if (rkv != null) {
            w = fr0.W((Object)rkv);
        }
        else {
            w = null;
        }
        return new p9e(n, b2, b, w, 34);
    }
    
    public static final boolean I(final n72 n72, final stb stb) {
        e0e.f((Object)n72, "<this>");
        boolean booleanValue;
        if (e0e.a((Object)n72, (Object)n72.f.a)) {
            booleanValue = true;
        }
        else if (e0e.a((Object)n72, (Object)n72.c.a)) {
            booleanValue = false;
        }
        else {
            if (n72 instanceof n72.d) {
                final n72.d d = (n72.d)n72;
                I(null, stb);
                throw null;
            }
            if (n72 instanceof n72.e) {
                final n72.e e = (n72.e)n72;
                throw null;
            }
            if (n72 instanceof n72.a) {
                final n72.a a = (n72.a)n72;
                throw null;
            }
            if (!(n72 instanceof n72.b)) {
                throw new NoWhenBranchMatchedException();
            }
            booleanValue = (boolean)((o72)stb).invoke((Object)((n72.b)n72).a);
        }
        return booleanValue;
    }
    
    public static final RoomUserItem I0(final y21 y21, final ojo ojo, final Set set, final String s, final boolean b) {
        final ojo g0 = ojo.G0;
        e0e.f((Object)y21, "<this>");
        e0e.f((Object)set, "oldParticipants");
        e0e.f((Object)s, "roomId");
        final boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = false;
        Label_0268: {
            if (ojo == g0 || ojo == ojo.F0) {
                while (true) {
                    for (final Object next : set) {
                        if (k0(y21, (RoomUserItem)next)) {
                            final RoomUserItem roomUserItem = (RoomUserItem)next;
                            b3 = (roomUserItem != null && roomUserItem.isTalking());
                            boolean booleanValue = false;
                            Label_0183: {
                                if (roomUserItem != null) {
                                    final Boolean locallyMuted = roomUserItem.isLocallyMuted();
                                    if (locallyMuted != null) {
                                        booleanValue = locallyMuted;
                                        break Label_0183;
                                    }
                                }
                                booleanValue = (y21.b || y21.c);
                            }
                            b4 = (ojo == g0 && (roomUserItem != null && roomUserItem.isInvitedToCohost()));
                            if (ojo == g0 && (roomUserItem != null && roomUserItem.isPendingCohost())) {
                                b5 = b2;
                                b6 = booleanValue;
                                break Label_0268;
                            }
                            b5 = false;
                            b6 = booleanValue;
                            break Label_0268;
                        }
                    }
                    Object next = null;
                    continue;
                }
            }
            b5 = false;
            b3 = false;
            b6 = false;
            b4 = false;
        }
        boolean b7 = false;
        Label_0361: {
            if (ojo == ojo.J0) {
                while (true) {
                    for (final Object next2 : set) {
                        if (k0(y21, (RoomUserItem)next2)) {
                            final RoomUserItem roomUserItem2 = (RoomUserItem)next2;
                            b7 = (roomUserItem2 != null && roomUserItem2.isInvitedToCohost());
                            b5 = (roomUserItem2 != null && roomUserItem2.isPendingCohost());
                            break Label_0361;
                        }
                    }
                    Object next2 = null;
                    continue;
                }
            }
            b7 = b4;
        }
        final String d = y21.d();
        final String a = y21.a;
        final String c = y21.c();
        final String b8 = y21.b();
        final boolean g2 = y21.g;
        final String f = y21.f();
        final boolean h = y21.h();
        final boolean g3 = y21.g();
        final RaisedHand h2 = y21.h;
        final qgv e = y21.e();
        Boolean b9;
        if (e == null || (b9 = e.D1) == null) {
            b9 = Boolean.FALSE;
        }
        final qgv e2 = y21.e();
        Boolean value;
        if (e2 != null) {
            value = fbx.E(e2.K1);
        }
        else {
            value = null;
        }
        final qgv e3 = y21.e();
        final boolean b10 = e3 != null && fbx.S(e3.K1);
        final qgv e4 = y21.e();
        Integer value2;
        if (e4 != null) {
            value2 = e4.N1;
        }
        else {
            value2 = null;
        }
        return new RoomUserItem(d, a, c, b3, b8, ojo, g2, h, g3, f, s, value, Boolean.valueOf(b6), b, h2, b7, b5, (boolean)b9, b10, value2, y21.f);
    }
    
    public static final boolean J(final n72 n72, final Set set, final String s, final ar ar) {
        e0e.f((Object)set, "variables");
        e0e.f((Object)ar, "adapterContext");
        return I(n72, (stb)new o72(set, ar, (List)null, s));
    }
    
    public static RoomUserItem J0(final y21 y21, final ojo ojo, Set f0, final String s, boolean b, final int n) {
        if ((n & 0x2) != 0x0) {
            f0 = r3a.F0;
        }
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        return I0(y21, ojo, (Set)f0, s, b);
    }
    
    public static final w8m K(final Annotation[] array, final vnb vnb) {
        e0e.f((Object)array, "<this>");
        e0e.f((Object)vnb, "fqName");
        final int length = array.length;
        int n = 0;
        w8m w8m;
        Annotation annotation;
        while (true) {
            w8m = null;
            if (n >= length) {
                annotation = null;
                break;
            }
            final Annotation annotation2 = array[n];
            if (e0e.a((Object)v8m.a(jb2.Z(jb2.S(annotation2))).b(), (Object)vnb)) {
                annotation = annotation2;
                break;
            }
            ++n;
        }
        w8m w8m2 = w8m;
        if (annotation != null) {
            w8m2 = new w8m(annotation);
        }
        return w8m2;
    }
    
    public static final String K0(String lowerCase) {
        e0e.f((Object)lowerCase, "query");
        final int length = lowerCase.length();
        boolean matches;
        if (length > 1) {
            final Pattern a = s0k.a;
            final String substring = lowerCase.substring(length - 1);
            e0e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
            matches = a.matcher(substring).matches();
        }
        else {
            matches = false;
        }
        final Locale d = g6s.d();
        e0e.e((Object)d, "getLocale()");
        lowerCase = lowerCase.toLowerCase(d);
        e0e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int n = lowerCase.length() - 1;
        int i = 0;
        int n2 = 0;
        while (i <= n) {
            int n3;
            if (n2 == 0) {
                n3 = i;
            }
            else {
                n3 = n;
            }
            final boolean b = e0e.h((int)lowerCase.charAt(n3), 32) <= 0;
            if (n2 == 0) {
                if (!b) {
                    n2 = 1;
                }
                else {
                    ++i;
                }
            }
            else {
                if (!b) {
                    break;
                }
                --n;
            }
        }
        final String string = lowerCase.subSequence(i, n + 1).toString();
        if (matches) {
            lowerCase = " ";
        }
        else {
            lowerCase = "";
        }
        return mqb.l(string, lowerCase);
    }
    
    public static final e4p L(final List list, final int n) {
        e0e.f((Object)list, "<this>");
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (((e4p)list.get(i)).F0 == n) {
                return (e4p)list.get(i);
            }
        }
        return null;
    }
    
    public static final jcu L0(final int n, final int n2, final nq9 nq9) {
        e0e.f((Object)nq9, "easing");
        return new jcu(n, n2, nq9);
    }
    
    public static final swe M(swe swe, final stb stb) {
        for (swe = swe.x(); swe != null; swe = swe.x()) {
            if (stb.invoke((Object)swe)) {
                return swe;
            }
        }
        return null;
    }
    
    public static jcu M0(int n, int n2, nq9 a, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 300;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0;
        }
        if ((n3 & 0x4) != 0x0) {
            a = (nq9)pq9.a;
        }
        return L0(n, n2, a);
    }
    
    public static String N(final byte[] array) {
        final int length = array.length;
        final char[] array2 = new char[length];
        for (int i = 0; i != length; ++i) {
            array2[i] = (char)(array[i] & 0xFF);
        }
        return new String(array2);
    }
    
    public static final l9r N0(final MviViewModel mviViewModel, yy6 k0, final d86 d86, final int n) {
        e0e.f((Object)mviViewModel, "<this>");
        d86.x(640614124);
        if ((n & 0x1) != 0x0) {
            final nk8 a = j29.a;
            k0 = (yy6)aig.a.K0();
        }
        final sa6$b a2 = sa6.a;
        final l9r z = zzz.z(mviViewModel.J0.i, (Object)mviViewModel.S(), k0, d86, 0);
        d86.O();
        return z;
    }
    
    public static final gsx O(final ktx ktx) {
        e0e.f((Object)ktx, "<this>");
        return new gsx(ktx.a, ktx.t);
    }
    
    public static final l9r O0(final MviViewModel mviViewModel, final dpe dpe, final d86 d86, final int n) {
        e0e.f((Object)mviViewModel, "<this>");
        e0e.f((Object)dpe, "property");
        d86.x(212966729);
        final nk8 a = j29.a;
        final whg k0 = aig.a.K0();
        final sa6$b a2 = sa6.a;
        d86.x(8066681);
        final l9r n2 = N0(mviViewModel, (yy6)k0, d86, 0);
        d86.x(-492369756);
        final Object y = d86.y();
        Objects.requireNonNull(d86.Companion);
        Object c = y;
        if (y == d86$a.b) {
            c = zzz.C((ptb)new plx(n2, dpe));
            d86.p(c);
        }
        d86.O();
        final l9r l9r = (l9r)c;
        d86.O();
        d86.O();
        return l9r;
    }
    
    public static final void P(final Region region, final thp thp, final Map map, final thp thp2) {
        final swe c = thp2.c;
        final boolean x0 = c.X0;
        boolean b = true;
        final boolean b2 = !x0 || !c.H();
        if ((region.isEmpty() && thp2.g != thp.g) || (b2 && !thp2.d)) {
            return;
        }
        qhp qhp;
        if (thp2.f.G0) {
            if ((qhp = kqe.N(thp2.c)) == null) {
                qhp = thp2.a;
            }
        }
        else {
            qhp = thp2.a;
        }
        e0e.f((Object)qhp, "<this>");
        p6m p6m = null;
        Label_0435: {
            if (!((en8)qhp).l().L0) {
                Objects.requireNonNull(p6m.Companion);
                p6m = p6m.e;
            }
            else {
                final mhp z = qhp.z();
                final lhp a = lhp.a;
                if (nhp.a(z, lhp.c) == null) {
                    p6m = w9y.d((bwe)kqe.l0((en8)qhp, 8));
                }
                else {
                    qni qni = kqe.l0((en8)qhp, 8);
                    if (!qni.j()) {
                        Objects.requireNonNull(p6m.Companion);
                        p6m = p6m.e;
                    }
                    else {
                        final bwe m = w9y.m((bwe)qni);
                        avh y0;
                        if ((y0 = qni.Y0) == null) {
                            y0 = new avh();
                            qni.Y0 = y0;
                        }
                        final long w0 = qni.W0(qni.f1());
                        y0.a = -aeq.d(w0);
                        y0.b = -aeq.b(w0);
                        y0.c = aeq.d(w0) + ((khk)qni).F0();
                        y0.d = aeq.b(w0) + ((khk)qni).A0();
                        while (qni != m) {
                            qni.t1(y0, false, true);
                            if (y0.b()) {
                                Objects.requireNonNull(p6m.Companion);
                                p6m = p6m.e;
                                break Label_0435;
                            }
                            qni = qni.N0;
                            e0e.c((Object)qni);
                        }
                        p6m = new p6m(y0.a, y0.b, y0.c, y0.d);
                    }
                }
            }
        }
        final Rect i = ak1.M(p6m);
        final Region region2 = new Region();
        region2.set(i);
        int g;
        if ((g = thp2.g) == thp.g) {
            g = -1;
        }
        if (region2.op(region, region2, Region$Op.INTERSECT)) {
            final Rect bounds = region2.getBounds();
            e0e.e((Object)bounds, "region.bounds");
            map.put(g, new uhp(thp2, bounds));
            final List e = thp2.e(false);
            for (int n = e.size() - 1; -1 < n; --n) {
                P(region, thp, map, (thp)e.get(n));
            }
            region.op(i, region, Region$Op.REVERSE_DIFFERENCE);
        }
        else if (thp2.d) {
            final thp g2 = thp2.g();
            Label_0630: {
                if (g2 != null) {
                    final swe c2 = g2.c;
                    if (c2 != null && c2.X0) {
                        break Label_0630;
                    }
                }
                b = false;
            }
            p6m d;
            if (b) {
                d = g2.d();
            }
            else {
                d = new p6m(0.0f, 0.0f, 10.0f, 10.0f);
            }
            map.put(g, new uhp(thp2, ak1.M(d)));
        }
        else if (g == -1) {
            final Rect bounds2 = region2.getBounds();
            e0e.e((Object)bounds2, "region.bounds");
            map.put(g, new uhp(thp2, bounds2));
        }
    }
    
    public static String P0(final String s, final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    final String string = sb.toString();
                    final Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    final Level warning = Level.WARNING;
                    final String value = String.valueOf(string);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Exception during lenientFormat for ".concat(value);
                    }
                    else {
                        concat = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(warning, "com.google.common.base.Strings", "lenientToString", concat, ex);
                    final String name2 = ex.getClass().getName();
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
                    jba.s(sb2, "<", string, " threw ", name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(length * 16 + s.length());
        int n3 = 0;
        int n4 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n4 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb3.append(s, n3, index);
            sb3.append(array[n4]);
            n3 = index + 2;
            ++n4;
        }
        sb3.append(s, n3, s.length());
        if (n4 < length2) {
            sb3.append(" [");
            final int n5 = n4 + 1;
            sb3.append(array[n4]);
            for (int i = n5; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
    
    public static final List Q(final Annotation[] array) {
        e0e.f((Object)array, "<this>");
        final ArrayList list = new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(new w8m(array[i]));
        }
        return list;
    }
    
    public static void Q0(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
    
    public static final lr6 T(final iuu iuu) {
        e0e.f((Object)iuu, "timelineTweet");
        final boolean k = ((vxs)iuu).k();
        final boolean b = false;
        boolean b2 = false;
        final boolean b3 = false;
        boolean b4;
        if (k) {
            final wvs c = ((vxs)iuu).c();
            e0e.e((Object)c, "timelineTweet.entityInfo");
            if (h0((vxs)iuu)) {
                b2 = b3;
                if (c.k > (iuu.k.E0() ? 1 : 0)) {
                    b2 = true;
                }
                b4 = (c.l ^ true);
            }
            else {
                final boolean c2 = iuu.k.C0();
                boolean b5 = b;
                if (g0((vxs)iuu)) {
                    b5 = b;
                    if (z8t.a(c.g)) {
                        b5 = true;
                    }
                }
                b4 = b5;
                b2 = c2;
            }
        }
        else {
            b4 = false;
        }
        return new lr6(b2, b4);
    }
    
    public static xh1 U() {
        final int a = o2.a;
        Objects.requireNonNull(p2.Companion);
        return ((p2)((n5j)dr0.Companion.a()).B((Class)p2.class)).N0();
    }
    
    public static final ekx$c W() {
        return ekx.a.a().b();
    }
    
    public static eg8 X() {
        synchronized (eg8.class) {
            if (eg8.F0 == null) {
                eg8.F0 = new eg8();
            }
            return eg8.F0;
        }
    }
    
    public static OkHttpClient Y() {
        final int a = n5.a;
        Objects.requireNonNull(o5.Companion);
        return ((o5)((n5j)dr0.Companion.a()).B((Class)o5.class)).P7();
    }
    
    public static Spanned a0(final Object[] array, final String s, final String s2) {
        int n = s.indexOf(s2);
        if (n == -1) {
            return (Spanned)new SpannableString((CharSequence)s);
        }
        int index = s.indexOf(s2, n + 1);
        if (index == -1) {
            return (Spanned)new SpannableString((CharSequence)s);
        }
        final int length = array.length;
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int i;
        int n5;
        do {
            spannableStringBuilder.append((CharSequence)s.substring(n2, n));
            spannableStringBuilder.append((CharSequence)s.substring(s2.length() + n, index));
            spannableStringBuilder.setSpan(array[n3], n - n4, index - n4 - s2.length(), 33);
            ++n3;
            n5 = s2.length() + index;
            if (n3 >= length) {
                break;
            }
            n = s.indexOf(s2, n5);
            i = index;
            int n6 = n4;
            if (n != -1) {
                i = s.indexOf(s2, n + 1);
                n6 = s2.length() * 2 + n4;
            }
            if (n == -1) {
                break;
            }
            index = i;
            n2 = n5;
            n4 = n6;
        } while (i != -1);
        spannableStringBuilder.append((CharSequence)s.substring(n5));
        return (Spanned)spannableStringBuilder;
    }
    
    public static xp3 b(int b, mr2 mr2, int n) {
        final mr2 f0 = mr2.F0;
        final int n2 = 0;
        if ((n & 0x1) != 0x0) {
            b = 0;
        }
        if ((n & 0x2) != 0x0) {
            mr2 = f0;
        }
        n = 1;
        Object o;
        if (b != -2) {
            if (b != -1) {
                if (b != 0) {
                    if (b != Integer.MAX_VALUE) {
                        if (b == 1 && mr2 == mr2.G0) {
                            o = new dh6((stb)null);
                        }
                        else {
                            o = new ks0(b, mr2, (stb)null);
                        }
                    }
                    else {
                        o = new uif((stb)null);
                    }
                }
                else if (mr2 == f0) {
                    o = new pgm((stb)null);
                }
                else {
                    o = new ks0(1, mr2, (stb)null);
                }
            }
            else {
                b = n2;
                if (mr2 == f0) {
                    b = 1;
                }
                if (b == 0) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
                }
                o = new dh6((stb)null);
            }
        }
        else {
            b = n;
            if (mr2 == f0) {
                Objects.requireNonNull(xp3.t);
                b = xp3$a.b;
            }
            o = new ks0(b, mr2, (stb)null);
        }
        return (xp3)o;
    }
    
    public static final String b0(final int n, final d86 d86) {
        d86.x(-726638443);
        final sa6$b a = sa6.a;
        d86.m((df6)z20.a);
        final Resources resources = ((Context)d86.m((df6)z20.b)).getResources();
        Objects.requireNonNull(jlr.Companion);
        final int n2 = 0;
        String s;
        if (n == 0) {
            s = resources.getString(2131955314);
            e0e.e((Object)s, "resources.getString(R.string.navigation_menu)");
        }
        else if (n == 1) {
            s = resources.getString(2131952489);
            e0e.e((Object)s, "resources.getString(R.string.close_drawer)");
        }
        else if (n == 2) {
            s = resources.getString(2131952492);
            e0e.e((Object)s, "resources.getString(R.string.close_sheet)");
        }
        else if (n == 3) {
            s = resources.getString(2131953047);
            e0e.e((Object)s, "resources.getString(R.st\u2026ng.default_error_message)");
        }
        else if (n == 4) {
            s = resources.getString(2131953648);
            e0e.e((Object)s, "resources.getString(R.string.dropdown_menu)");
        }
        else if (n == 5) {
            s = resources.getString(2131956835);
            e0e.e((Object)s, "resources.getString(R.string.range_start)");
        }
        else {
            int n3 = n2;
            if (n == 6) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = resources.getString(2131956834);
                e0e.e((Object)s, "resources.getString(R.string.range_end)");
            }
            else {
                s = "";
            }
        }
        d86.O();
        return s;
    }
    
    public static final boolean c0(final i2d i2d, final wrt wrt) {
        e0e.f((Object)i2d, "<this>");
        e0e.f((Object)wrt, "topicSocialContextFeatures");
        final rmv b = ita.b();
        e0e.e((Object)b, "getCurrent()");
        boolean b3;
        final boolean b2 = b3 = false;
        if (b.b("topics_tweet_details_recommended_topic_context_enabled", false)) {
            b3 = b2;
            if (i2d.G0 != 1) {
                final boolean b4 = wrt.a() == oo6.H0;
                b3 = b2;
                if (b4) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public static final void d(nw8 k0, d86 h, final int n, final int n2) {
        h = h.h(1037356856);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x2);
        }
        else {
            n4 = n;
        }
        if (n3 == 1 && (n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
            }
            else if (n3 != 0) {
                k0 = shw.K0(h);
            }
            h.s();
            final sa6$b a = sa6.a;
            final g76 a2 = g76.a;
            de0.a((hub)g76.b, (hub)g76.c, (hub)w9y.i(h, 1922049180, new uvw(k0)), (dlh)null, 0L, (asp)null, (hub)null, (kub)g76.d, h, 12583350, 120);
        }
        final gyo i = h.k();
        if (i != null) {
            i.a((hub)new vvw(k0, n, n2));
        }
    }
    
    public static final vld d0(final rm9 rm9, final int n, final long n2) {
        mqb.n(n, "repeatMode");
        return new vld(rm9, n, n2, (wg8)null);
    }
    
    public static final boolean e(final thp thp) {
        final mhp f = thp.f();
        final whp a = whp.a;
        return nhp.a(f, (bip)whp.j) == null;
    }
    
    public static vld e0(final rm9 rm9, int n, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            n = 1;
        }
        long n3;
        if ((n2 & 0x4) != 0x0) {
            Objects.requireNonNull(v8r.Companion);
            n3 = 0;
        }
        else {
            n3 = 0L;
        }
        return d0(rm9, n, n3);
    }
    
    public static final boolean f(final thp thp) {
        final mhp f = thp.f;
        final lhp a = lhp.a;
        final boolean g = f.g(lhp.i);
        final boolean b = false;
        if (g) {
            final mhp f2 = thp.f;
            final whp a2 = whp.a;
            if (!e0e.a(nhp.a(f2, (bip)whp.l), (Object)Boolean.TRUE)) {
                return true;
            }
        }
        final swe m = M(thp.c, (stb)u20.F0);
        boolean b2 = b;
        if (m == null) {
            return b2;
        }
        final qhp o = kqe.O(m);
        boolean a4 = false;
        Label_0116: {
            if (o != null) {
                final mhp s = jty.s(o);
                if (s != null) {
                    final whp a3 = whp.a;
                    a4 = e0e.a(nhp.a(s, (bip)whp.l), (Object)Boolean.TRUE);
                    break Label_0116;
                }
            }
            a4 = false;
        }
        b2 = b;
        if (a4) {
            return b2;
        }
        b2 = true;
        return b2;
    }
    
    public static final float[] f0(float[] array) {
        e0e.f((Object)array, "m");
        final float n = array[0];
        final float n2 = array[3];
        final float n3 = array[6];
        final float n4 = array[1];
        final float n5 = array[4];
        final float n6 = array[7];
        final float n7 = array[2];
        final float n8 = array[5];
        final float n9 = array[8];
        final float n10 = n5 * n9 - n6 * n8;
        final float n11 = n6 * n7 - n4 * n9;
        final float n12 = n4 * n8 - n5 * n7;
        final float n13 = n3 * n12 + (n2 * n11 + n * n10);
        array = new float[array.length];
        array[0] = n10 / n13;
        array[1] = n11 / n13;
        array[2] = n12 / n13;
        array[3] = j98.h(n2, n9, n3 * n8, n13);
        array[4] = j98.h(n3, n7, n9 * n, n13);
        array[5] = j98.h(n8, n, n7 * n2, n13);
        array[6] = j98.h(n3, n5, n2 * n6, n13);
        array[7] = j98.h(n6, n, n3 * n4, n13);
        array[8] = j98.h(n2, n4, n * n5, n13);
        return array;
    }
    
    public static final boolean g0(final vxs vxs) {
        e0e.f((Object)vxs, "timelineItem");
        final int d = vxs.c().d;
        boolean b = true;
        if (d != 1 || lp7.R(vxs.c().h)) {
            b = false;
        }
        return b;
    }
    
    public static final int h(final long n) {
        int n2;
        final boolean b = (n2 = ((Math.abs(kgj.d(n)) >= 0.5f) ? 1 : 0)) != 0;
        if (Math.abs(kgj.e(n)) >= 0.5f) {
            n2 = ((b ? 1 : 0) | 0x2);
        }
        return n2;
    }
    
    public static final boolean h0(final vxs vxs) {
        e0e.f((Object)vxs, "timelineItem");
        final umh b = vxs.b;
        if (b != null) {
            String d;
            if (b != null) {
                d = b.d;
            }
            else {
                d = null;
            }
            if (e0e.a((Object)"VerticalConversation", (Object)d)) {
                return true;
            }
        }
        return false;
    }
    
    public static final Object i(final f8b f8b, final kub kub, final Throwable f0, mp6 f2) {
        Object o = null;
        Label_0053: {
            if (f2 instanceof w8b) {
                o = f2;
                final int h0 = ((w8b)o).H0;
                if ((h0 & Integer.MIN_VALUE) != 0x0) {
                    ((w8b)o).H0 = h0 + Integer.MIN_VALUE;
                    break Label_0053;
                }
            }
            o = new w8b(f2);
        }
        final Object g0 = ((w8b)o).G0;
        final jz6 f3 = jz6.F0;
        final int h2 = ((w8b)o).H0;
        Label_0108: {
            if (h2 == 0) {
                break Label_0108;
            }
            Label_0097: {
                if (h2 != 1) {
                    break Label_0097;
                }
                f2 = (mp6)((w8b)o).F0;
                try {
                    jb2.M0(g0);
                    Object a = null;
                    Label_0154: {
                        a = vzv.a;
                    }
                    return a;
                    a = f3;
                    return a;
                    jb2.M0(g0);
                    f2 = (mp6)f0;
                    ((w8b)o).F0 = f0;
                    f2 = (mp6)f0;
                    ((w8b)o).H0 = 1;
                    f2 = (mp6)f0;
                    iftrue(Label_0154:)(kub.h0((Object)f8b, (Object)f0, o) != f3);
                    return f3;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    final mp6 mp6;
                    if (f2 != null && f2 != mp6) {
                        ac8.g((Throwable)mp6, (Throwable)f2);
                    }
                }
            }
        }
    }
    
    public static final boolean j(final thp thp) {
        return thp.c.V0 == cwe.G0;
    }
    
    public static final boolean j0(final u01 u01) {
        e0e.f((Object)u01, "<this>");
        return e0e.a((Object)u01.l, (Object)"RUNNING") || u01.o == null;
    }
    
    public static final boolean k(final thp thp) {
        final mhp f = thp.f;
        final lhp a = lhp.a;
        return f.g(lhp.i);
    }
    
    public static final boolean k0(final y21 y21, final RoomUserItem roomUserItem) {
        return e0e.a((Object)y21.d(), (Object)roomUserItem.getTwitterUserId()) || e0e.a((Object)y21.a, (Object)roomUserItem.getPeriscopeUserId());
    }
    
    public static final boolean l(final oxq oxq, final v01 v01) {
        return oxq instanceof oxq$a && e0e.a((Object)((oxq$a)oxq).a.h, (Object)v01.c.h);
    }
    
    public static final dse l0(final stb stb) {
        e0e.f((Object)stb, "init");
        final dse$b dse$b = new dse$b();
        stb.invoke((Object)dse$b);
        return new dse((dse.dse$b<T>)dse$b);
    }
    
    public static void m0(final String s, final String s2, final Throwable t) {
        po.b().a();
        g7r.H(s, s2, t);
    }
    
    public static final long n(final int[] array, final long n) {
        float n3;
        if (kgj.d(n) >= 0.0f) {
            final float n2 = array[0] * -1.0f;
            final float d = kgj.d(n);
            n3 = n2;
            if (n2 > d) {
                n3 = d;
            }
        }
        else {
            final float n4 = array[0] * -1.0f;
            final float d2 = kgj.d(n);
            n3 = n4;
            if (n4 < d2) {
                n3 = d2;
            }
        }
        float n6;
        if (kgj.e(n) >= 0.0f) {
            final float n5 = array[1] * -1.0f;
            final float e = kgj.e(n);
            n6 = n5;
            if (n5 > e) {
                n6 = e;
            }
        }
        else {
            final float n7 = array[1] * -1.0f;
            final float e2 = kgj.e(n);
            n6 = n7;
            if (n7 < e2) {
                n6 = e2;
            }
        }
        return kqe.e(n3, n6);
    }
    
    public static final Object n0(final Object o, final Class clazz) {
        Object o2 = o;
        if (!clazz.isAssignableFrom(o.getClass())) {
            o2 = null;
        }
        return o2;
    }
    
    public static final gmt o(final i2d i2d, final Resources resources, final wrt wrt) {
        final boolean c0 = c0(i2d, wrt);
        final lxd f0 = i2d.F0;
        e0e.e((Object)f0, "interestTopic");
        final String c2 = f0.c;
        e0e.e((Object)c2, "topic.name");
        int n;
        if (f0.d) {
            n = 2131958126;
        }
        else {
            n = 2131958125;
        }
        final String string = resources.getString(n);
        e0e.e((Object)string, "resources.getString(\n   \u2026on_follow_topic\n        )");
        return new gmt(c0, c2, string, f0.d, f0.f);
    }
    
    public static final float[] o0(final float[] array, final float[] array2) {
        e0e.f((Object)array, "lhs");
        e0e.f((Object)array2, "rhs");
        return new float[] { array[6] * array2[2] + (array[3] * array2[1] + array[0] * array2[0]), array[7] * array2[2] + (array[4] * array2[1] + array[1] * array2[0]), array[8] * array2[2] + (array[5] * array2[1] + array[2] * array2[0]), array[6] * array2[5] + (array[3] * array2[4] + array[0] * array2[3]), array[7] * array2[5] + (array[4] * array2[4] + array[1] * array2[3]), array[8] * array2[5] + (array[5] * array2[4] + array[2] * array2[3]), array[6] * array2[8] + (array[3] * array2[7] + array[0] * array2[6]), array[7] * array2[8] + (array[4] * array2[7] + array[1] * array2[6]), array[8] * array2[8] + (array[5] * array2[7] + array[2] * array2[6]) };
    }
    
    public static final int p(int n) {
        Objects.requireNonNull(pci.Companion);
        if (n == 1) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n ^ 0x1;
    }
    
    public static final float[] p0(final float[] array, final float[] array2) {
        e0e.f((Object)array2, "rhs");
        return new float[] { array[0] * array2[0], array[1] * array2[1], array[2] * array2[2], array[0] * array2[3], array[1] * array2[4], array[2] * array2[5], array[0] * array2[6], array[1] * array2[7], array[2] * array2[8] };
    }
    
    public static final ccx q(final l9r l9r) {
        return (ccx)l9r.getValue();
    }
    
    public static final float[] q0(final float[] array, final float[] array2) {
        e0e.f((Object)array, "lhs");
        e0e.f((Object)array2, "rhs");
        final float n = array2[0];
        final float n2 = array2[1];
        final float n3 = array2[2];
        array2[0] = array[6] * n3 + (array[3] * n2 + array[0] * n);
        array2[1] = array[7] * n3 + (array[4] * n2 + array[1] * n);
        array2[2] = array[8] * n3 + (array[5] * n2 + array[2] * n);
        return array2;
    }
    
    public static es4 r(final es4 es4) {
        final apx j0 = eg8.J0;
        Objects.requireNonNull(xq.Companion);
        final xq$a b = xq.b;
        e0e.f((Object)es4, "<this>");
        final long b2 = es4.b;
        Objects.requireNonNull(yr4.Companion);
        final yr4$a companion = yr4.Companion;
        Object o = es4;
        if (yr4.a(b2, yr4.a)) {
            final rxm rxm = (rxm)es4;
            if (A(rxm.d, j0)) {
                o = es4;
            }
            else {
                o = new rxm(((es4)rxm).a, rxm.h, j0, o0(x(((xq)b).a, rxm.d.a(), j0.a()), rxm.i), rxm.k, rxm.m, rxm.e, rxm.f, rxm.g, -1);
            }
        }
        return (es4)o;
    }
    
    public static final HashMap r0(final int n) {
        return new HashMap(u(n));
    }
    
    public static final void s(final Collection collection, final Object o) {
        if (o != null) {
            collection.add(o);
        }
    }
    
    public static final wq2 s0(final q16 q16) {
        Object o;
        if (q16.e()) {
            final Shader a = q16.a;
            if (a != null) {
                o = new xq2(a);
            }
            else {
                o = new jmq(yru.d(q16.c));
            }
        }
        else {
            o = null;
        }
        return (wq2)o;
    }
    
    public static boolean t(final qdw qdw) {
        final qgv user = qdw.getUser();
        final boolean g = qdw.g();
        final boolean b = true;
        if ((!g || !yds.b()) && ita.a(user.f()).b("ads_companion_enabled", false)) {
            final xv l1 = user.l1;
            boolean b2 = b;
            if (l1 == xv.H0) {
                return b2;
            }
            if (l1 == xv.I0) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public static void t0(final ocj ocj, final AtomicInteger atomicInteger, final px0 px0) {
        if (atomicInteger.getAndIncrement() == 0) {
            final Throwable b = qfa.b((AtomicReference)px0);
            if (b != null) {
                ocj.onError(b);
            }
            else {
                ocj.onComplete();
            }
        }
    }
    
    public static final int u(int n) {
        final int n2 = 3;
        if (n < 3) {
            n = n2;
        }
        else {
            n = n / 3 + n + 1;
        }
        return n;
    }
    
    public static void u0(final ocj ocj, final Throwable t, final AtomicInteger atomicInteger, final px0 px0) {
        if (qfa.a((AtomicReference)px0, t)) {
            if (atomicInteger.getAndIncrement() == 0) {
                ocj.onError(qfa.b((AtomicReference)px0));
            }
        }
        else {
            yno.c(t);
        }
    }
    
    public static boolean v(final boolean b, final boolean b2, final ocj ocj, final gaq gaq, final b39 b3, final vtl vtl) {
        if (vtl.I0) {
            gaq.clear();
            b3.dispose();
            return true;
        }
        if (b) {
            final Throwable k0 = vtl.K0;
            if (k0 != null) {
                gaq.clear();
                if (b3 != null) {
                    b3.dispose();
                }
                ocj.onError(k0);
                return true;
            }
            if (b2) {
                if (b3 != null) {
                    b3.dispose();
                }
                ocj.onComplete();
                return true;
            }
        }
        return false;
    }
    
    public static void v0(final ocj ocj, final Object o, final AtomicInteger atomicInteger, final px0 px0) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ocj.onNext(o);
            if (atomicInteger.decrementAndGet() != 0) {
                final Throwable b = qfa.b((AtomicReference)px0);
                if (b != null) {
                    ocj.onError(b);
                }
                else {
                    ocj.onComplete();
                }
            }
        }
    }
    
    public static final n72 w0(final String... array) {
        return new n72.b(new if1(ft0.s1((Object[])array)));
    }
    
    public static final float[] x(final float[] array, final float[] array2, final float[] array3) {
        e0e.f((Object)array, "matrix");
        q0(array, array2);
        q0(array, array3);
        return o0(f0(array), p0(new float[] { array3[0] / array2[0], array3[1] / array2[1], array3[2] / array2[2] }, array));
    }
    
    public static void y(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static final RoomUserItem y0(final Set set) {
        e0e.f((Object)set, "<this>");
        for (final Object next : set) {
            if (((RoomUserItem)next).isPrimaryAdmin()) {
                return (RoomUserItem)next;
            }
        }
        Object next = null;
        return (RoomUserItem)next;
    }
    
    public static final List z(ArrayList o) {
        final int size = ((ArrayList)o).size();
        if (size != 0) {
            if (size != 1) {
                ((ArrayList)o).trimToSize();
            }
            else {
                o = shw.x0(rr4.C1((List)o));
            }
        }
        else {
            o = h3a.F0;
        }
        return (List)o;
    }
    
    public z73 R(final a a, final Object o) {
        return (z73)new u02(this.S(a.b).toString(), a.h, a.g, null, null, o);
    }
    
    public Uri S(final Uri uri) {
        return uri;
    }
    
    public z73 V(final a a) {
        return (z73)new e9q(this.S(a.b).toString());
    }
    
    public z73 Z(final a a, final Object o) {
        final itk o2 = a.o;
        z73 c;
        String name;
        if (o2 != null) {
            c = o2.c();
            name = o2.getClass().getName();
        }
        else {
            c = null;
            name = null;
        }
        return (z73)new u02(this.S(a.b).toString(), a.h, a.g, c, name, o);
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().b();
    }
    
    public Object c(final Object o) {
        String a;
        if ((a = ((cfs.c)o).a) == null) {
            a = "";
        }
        return a;
    }
    
    public zsl$a g(final Object o) {
        final Set set = (Set)o;
        e0e.f((Object)set, "args");
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).s(ttl.g("user_id", (Iterable)set));
        return zsl$a;
    }
    
    public boolean i0(final int n) {
        return 5 <= n;
    }
    
    public Object m(final e26 e26) {
        return new qyp((Context)((xsm)e26).f((Class)Context.class));
    }
    
    public String w(final String s, final String s2) {
        return null;
    }
    
    public String x0(final String s) {
        return c0e.h("unknown", ":", s);
    }
    
    public void z0(final int n, String string, final String s, final Throwable t) {
        final String x0 = this.x0(string);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('\n');
        if (t == null) {
            string = "";
        }
        else {
            final StringWriter stringWriter = new StringWriter();
            t.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        sb.append(string);
        Log.println(n, x0, sb.toString());
    }
}
