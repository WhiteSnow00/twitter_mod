import android.widget.Adapter;
import com.twitter.media.ui.image.AnimatedGifView;
import tv.periscope.model.chat.b;
import android.content.SharedPreferences;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.checkerframework.dataflow.qual.Pure;
import android.util.Log;
import com.twitter.ui.view.GroupedRowView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import com.facebook.imagepipeline.nativecode.NativeCodeInitializer;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import com.twitter.business.model.address.BusinessAddressInfoData;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.twitter.media.ui.image.AnimatedGifView$b;

// 
// Decompiled by Procyon v0.6.0
// 

public class tqb implements qur, a5j, sum, AnimatedGifView$b, pky, c0z, k26
{
    public static zfk F0;
    public static volatile boolean G0;
    public static final tqb H0;
    public static final vra I0;
    public static final int[] J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final int[] M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static final int[] Q0;
    public static final int[] R0;
    public static final int[] S0;
    public static final int[] T0;
    public static final tqb U0;
    public static final tqb V0;
    public static final tqb W0;
    
    static {
        H0 = new tqb();
        I0 = new vra(0.6f);
        J0 = new int[2];
        K0 = new int[] { 2130968694, 2130970131, 2130970132, 2130970133, 2130970162, 2130970483, 2130970516 };
        L0 = new int[] { 2130969145, 2130969487, 2130969491, 2130970274 };
        M0 = new int[] { 2130969173, 2130969174, 2130969439, 2130969817, 2130970517, 2130971068 };
        N0 = new int[] { 2130969495 };
        O0 = new int[] { 2130969811, 2130970045, 2130970511, 2130970514 };
        P0 = new int[] { 2130969477, 2130970045, 2130970514, 2130970651 };
        Q0 = new int[] { 2130968653, 2130968654, 2130968706, 2130968755, 2130968802, 2130969034, 2130969173, 2130969180, 2130969635, 2130969636, 2130969898, 2130970274, 2130970313, 2130970314, 2130970316, 2130970480, 2130970483, 2130970533, 2130970534, 2130970535, 2130970536, 2130970537, 2130970637, 2130970642, 2130970644, 2130970647, 2130970764, 2130970922, 2130971001, 2130971061, 2130971078, 2130971079 };
        R0 = new int[] { 2130969118, 2130969119, 2130969120, 2130969121, 2130969122, 2130969124, 2130969125, 2130969126, 2130969127, 2130970274 };
        S0 = new int[] { 16842755, 16842960, 16842961 };
        T0 = new int[] { 16842755, 16842961 };
        U0 = new tqb();
        V0 = new tqb();
        W0 = new tqb();
    }
    
    public static final Object A(final Activity activity, final Class clazz) {
        if (clazz.isInstance(activity)) {
            return activity;
        }
        final boolean b = activity instanceof oec;
        Object z = null;
        oec oec;
        if (b) {
            oec = (oec)activity;
        }
        else {
            oec = null;
        }
        if (oec != null) {
            z = z(oec, clazz);
        }
        return z;
    }
    
    public static final Object B(final Fragment fragment, final Class clazz) {
        if (clazz.isInstance(fragment)) {
            return fragment;
        }
        final boolean b = fragment instanceof oec;
        Object z = null;
        oec oec;
        if (b) {
            oec = (oec)fragment;
        }
        else {
            oec = null;
        }
        if (oec != null) {
            z = z(oec, clazz);
        }
        return z;
    }
    
    public static final Object C(final Class clazz, final Fragment fragment, final Activity activity) {
        Object o;
        if ((o = B(fragment, clazz)) == null) {
            o = A(activity, clazz);
        }
        return o;
    }
    
    public static final String D(final String s) {
        final int hashCode = s.hashCode();
        String s2;
        if (hashCode != 3365) {
            if (hashCode != 3374) {
                if (hashCode != 3856) {
                    s2 = s;
                }
                else if (!s.equals("yi")) {
                    s2 = s;
                }
                else {
                    s2 = "ji";
                }
            }
            else {
                s2 = s;
                if (s.equals("iw")) {
                    s2 = "he";
                }
            }
        }
        else if (!s.equals("in")) {
            s2 = s;
        }
        else {
            s2 = "id";
        }
        return s2;
    }
    
    public static final String E(final BusinessAddressInfoData businessAddressInfoData) {
        e0e.f((Object)businessAddressInfoData, "<this>");
        try {
            final nmb nmb = new nmb(new jmb.a(new jmb()));
            final List j = ks.j;
            final ks$a ks$a = new ks$a();
            final String isoString = businessAddressInfoData.getCountryIso().getIsoString();
            final ms g0 = ms.G0;
            final HashMap a = onw.a;
            Objects.requireNonNull(isoString, "This object should not be null.");
            ks$a.a(g0, isoString);
            ks$a.a(ms.K0, businessAddressInfoData.getAdminArea());
            ks$a.a(ms.N0, businessAddressInfoData.getZipCode());
            final String address = businessAddressInfoData.getAddress();
            ks$a.b.clear();
            ks$a.b.add(address);
            ks.b((List)ks$a.b);
            ks$a.a(ms.L0, businessAddressInfoData.getCity());
            final String join = TextUtils.join((CharSequence)" ", (Iterable)nmb.a(new ks(ks$a)));
            e0e.e((Object)join, "join(\n            \" \",\n \u2026)\n            )\n        )");
            return join;
        }
        catch (final Exception ex) {
            return m51.y(l58.k(businessAddressInfoData.getAddress(), ", ", businessAddressInfoData.getCity(), ", ", businessAddressInfoData.getAdminArea()), ", ", businessAddressInfoData.getZipCode());
        }
    }
    
    public static final t5j F(final t5j t5j, final fca fca) {
        e0e.f((Object)t5j, "<this>");
        e0e.f((Object)fca, "dispatcher");
        final e39 e39;
        e39.c(t5j.doOnComplete((sj)new ooo(e39 = new e39())).subscribe((rk6)new f$h3((stb)new gca(fca))));
        return t5j;
    }
    
    public static long G(final mm3 mm3) {
        final int j = mm3.j;
        long long1;
        final long n = long1 = 0L;
        if (j == 2) {
            final afq e = mm3.e;
            long1 = n;
            if (e != null) {
                if (flr.e((CharSequence)e.f)) {
                    long1 = n;
                }
                else {
                    final String f = mm3.e.f;
                    try {
                        long1 = Long.parseLong(f);
                    }
                    catch (final NumberFormatException ex) {
                        r9a.d((Throwable)ex);
                        long1 = n;
                    }
                }
            }
        }
        return long1;
    }
    
    public static String H(final fdi fdi) {
        final int a = nv8.m().a();
        final int f = ita.a(oos.a).f("data_sensitive_defaults_year_class_max", Integer.MAX_VALUE);
        final String s = "wifi_and_mobile";
        String s2 = "never";
        Label_0102: {
            if (a <= f) {
                final String d = ita.b().d("data_sensitive_defaults_android_6485");
                if ("never".equalsIgnoreCase(d)) {
                    break Label_0102;
                }
                if ("wifi_only".equalsIgnoreCase(d)) {
                    s2 = "wifi_only";
                    break Label_0102;
                }
                if ("always".equalsIgnoreCase(d)) {
                    s2 = "wifi_and_mobile";
                    break Label_0102;
                }
            }
            s2 = null;
        }
        String s3 = s2;
        if (s2 == null) {
            String s4 = s;
            if (fdi.i()) {
                s4 = "wifi_only";
            }
            s3 = s4;
        }
        return s3;
    }
    
    public static int I() {
        final cgv b = ggv.b;
        return b.b - b.f - 1;
    }
    
    public static final String J(int n) {
        mqb.n(n, "status");
        if (n == 0) {
            throw null;
        }
        if (--n == 0) {
            return "Unknown";
        }
        if (n == 1) {
            return "Pending";
        }
        if (n == 2) {
            return "Connecting";
        }
        if (n == 3) {
            return "Countdown";
        }
        if (n == 4) {
            return "Added";
        }
        if (n == 5) {
            return "Removed";
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public static String K(final Resources resources, final String s, final String s2) {
        String string;
        if (TextUtils.isEmpty((CharSequence)s)) {
            string = "";
        }
        else {
            final int i = I();
            string = s;
            if (ggv.a(s).a > i) {
                final String string2 = resources.getString(2131956329);
                final int a = ggv.a(string2).a;
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, i - a));
                sb.append(string2);
                string = sb.toString();
            }
        }
        return c0e.h(string, " ", s2);
    }
    
    public static View L(final sz5 sz5, final int n, View view, final ViewGroup viewGroup, final Context context) {
        View f = view;
        if (view == null) {
            f = sz5.f(context, ((Adapter)sz5).getItemViewType(n), viewGroup);
        }
        vmw.g((Object)f);
        view = f;
        sz5.c(f, context, ((Adapter)sz5).getItem(n), n);
        return f;
    }
    
    public static void M(Context applicationContext, final q8d q8d, final se9 se9) {
        rrb.b();
        if (tqb.G0) {
            fr0.k0((Class)tqb.class, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        }
        else {
            tqb.G0 = true;
        }
        shw.e1 = true;
        synchronized (lai.class) {
            final boolean b = lai.F0 != null;
            monitorexit(lai.class);
            Label_0187: {
                if (!b) {
                    rrb.b();
                    try {
                        try {
                            NativeCodeInitializer.class.getMethod("init", Context.class).invoke(null, applicationContext);
                        }
                        finally {}
                    }
                    catch (final NoSuchMethodException ex) {
                        lai.i((mai)new r1n());
                    }
                    catch (final InvocationTargetException ex2) {
                        lai.i((mai)new r1n());
                    }
                    catch (final IllegalAccessException ex3) {
                        lai.i((mai)new r1n());
                    }
                    catch (final ClassNotFoundException ex4) {
                        lai.i((mai)new r1n());
                    }
                    rrb.b();
                    break Label_0187;
                    rrb.b();
                }
            }
            applicationContext = applicationContext.getApplicationContext();
            Label_0249: {
                if (q8d == null) {
                    synchronized (t8d.class) {
                        rrb.b();
                        t8d.l((r8d)new q8d(new q8d$b(applicationContext)));
                        rrb.b();
                        break Label_0249;
                    }
                }
                t8d.l((r8d)q8d);
            }
            rrb.b();
            SimpleDraweeView.M0 = (zzr<? extends tb>)(tqb.F0 = new zfk(applicationContext, se9));
            rrb.b();
            rrb.b();
        }
    }
    
    public static boolean N() {
        return ita.b().b("android_network_forecast_improvement_enabled", false);
    }
    
    public static final xc0 P(final String s, final String s2) {
        e0e.f((Object)s2, "contentText");
        final int z1 = wlr.z1((CharSequence)s, s2, 0, false, 6);
        final xc0$a xc0$a = new xc0$a();
        xc0$a.d(s);
        Objects.requireNonNull(qlb.Companion);
        xc0$a.b(new f1r(0L, 0L, qlb.P0, (mlb)null, (nlb)null, (qkb)null, (String)null, 0L, (ur1)null, (wis)null, (s5g)null, 0L, (xfs)null, (vrp)null, 16379), z1, s2.length() + z1);
        return xc0$a.i();
    }
    
    public static wb4 Q(final tqb tqb, final vnb vnb, final mse mse) {
        Objects.requireNonNull(tqb);
        e0e.f((Object)mse, "builtIns");
        final bc4 g = n9e.a.g(vnb);
        wb4 j;
        if (g != null) {
            j = mse.j(g.b());
        }
        else {
            j = null;
        }
        return j;
    }
    
    public static final t5j R(final fda fda) {
        e0e.f((Object)fda, "<this>");
        final t5j ofType = ((t5j)((gda)fda).F0).ofType((Class)c4e$a.class);
        e0e.e((Object)ofType, "ofType(E::class.java)");
        return ofType;
    }
    
    public static void S(final boolean b, String l) {
        if (!b) {
            l = mqb.l("implicit_", l);
        }
        final fg4 fg4 = new fg4();
        ((o1p)fg4).q(new String[] { mqb.l("settings::video_autoplay::", l) });
        sbw.b((tlm)fg4);
    }
    
    public static final t5j T(final fda fda) {
        e0e.f((Object)fda, "<this>");
        final t5j ofType = ((t5j)((gda)fda).F0).ofType((Class)c4e$b.class);
        e0e.e((Object)ofType, "ofType(E::class.java)");
        return ofType;
    }
    
    public static final t5j W(final fda fda) {
        e0e.f((Object)fda, "<this>");
        final t5j ofType = ((t5j)((gda)fda).F0).ofType((Class)c4e$f.class);
        e0e.e((Object)ofType, "ofType(E::class.java)");
        return ofType;
    }
    
    public static void X(final hp6 hp6, final sfv sfv, final String s, final ufv ufv) {
        String d;
        if (sfv == null) {
            d = "unknown";
        }
        else {
            d = ((f0p)sfv).d;
        }
        final dda g = dda.g(d, "", hp6.X2(), "caret", s);
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = g.toString();
        final int a = o5j.a;
        ((o1p)fg4).i((d1p)ufv);
        sbw.b((tlm)fg4);
    }
    
    public static void Y(final GroupedRowView groupedRowView, final boolean b, final int n) {
        if (b) {
            groupedRowView.setStyle(1);
        }
        else {
            groupedRowView.setStyle(2);
        }
        if (n != 0) {
            if (n == 2) {
                groupedRowView.R0 = true;
            }
        }
        else {
            groupedRowView.Q0 = true;
        }
    }
    
    public static final boolean Z(final hp6 hp6) {
        e0e.f((Object)hp6, "<this>");
        final boolean g = flr.g((CharSequence)hp6.F0.i1);
        boolean b = false;
        if (g) {
            b = b;
            if (ita.b().b("super_follow_inline_badge_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean a0(final xzu xzu) {
        e0e.f((Object)xzu, "<this>");
        final boolean g = flr.g((CharSequence)xzu.a.F0.i1);
        boolean b = false;
        if (g) {
            b = b;
            if (!ita.b().b("super_follow_inline_badge_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    @Pure
    public static void b0(final String s, final String s2, final Throwable t) {
        Log.w(s, j(s2, t));
    }
    
    public static final SerialDescriptor i(final String s) {
        final tzk$i a = tzk$i.a;
        if (slr.k1((CharSequence)s) ^ true) {
            final Map a2 = wzk.a;
            final Iterator iterator = wzk.a.keySet().iterator();
            while (iterator.hasNext()) {
                final String o = ((KClass)iterator.next()).o();
                e0e.c((Object)o);
                final String a3 = wzk.a(o);
                final StringBuilder sb = new StringBuilder();
                sb.append("kotlin.");
                sb.append(a3);
                if (!slr.i1(s, sb.toString(), true) && !slr.i1(s, a3, true)) {
                    continue;
                }
                final StringBuilder b = po.B("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", s, " there already exist ");
                b.append(wzk.a(a3));
                b.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(olr.X0(b.toString()));
            }
            return (SerialDescriptor)new uzk(s, (tzk)a);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }
    
    @Pure
    public static String j(String value, final Throwable t) {
        String replace = null;
        Label_0065: {
            if (t != null) {
                Throwable cause = t;
                while (true) {
                    while (cause != null) {
                        if (cause instanceof UnknownHostException) {
                            final boolean b = true;
                            if (b) {
                                replace = "UnknownHostException (no network)";
                                break Label_0065;
                            }
                            replace = Log.getStackTraceString(t).trim().replace("\t", "    ");
                            break Label_0065;
                        }
                        else {
                            cause = cause.getCause();
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
            replace = null;
        }
        String string = value;
        if (!TextUtils.isEmpty((CharSequence)replace)) {
            value = String.valueOf(value);
            final String replace2 = replace.replace("\n", "\n  ");
            final StringBuilder sb = new StringBuilder(l58.g(replace2, value.length() + 4));
            sb.append(value);
            sb.append("\n  ");
            sb.append(replace2);
            sb.append('\n');
            string = sb.toString();
        }
        return string;
    }
    
    public static final SerialDescriptor k(final String s, final SerialDescriptor[] array, final stb stb) {
        if (slr.k1((CharSequence)s) ^ true) {
            final jc4 jc4 = new jc4(s);
            stb.invoke((Object)jc4);
            return (SerialDescriptor)new plp(s, (zlp)kmr$a.a, jc4.b.size(), ft0.p1((Object[])array), jc4);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }
    
    public static final SerialDescriptor n(final String s, final zlp zlp, final SerialDescriptor[] array, final stb stb) {
        e0e.f((Object)s, "serialName");
        e0e.f((Object)stb, "builder");
        if (!(slr.k1((CharSequence)s) ^ true)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (e0e.a((Object)zlp, (Object)kmr$a.a) ^ true) {
            final jc4 jc4 = new jc4(s);
            stb.invoke((Object)jc4);
            return (SerialDescriptor)new plp(s, zlp, jc4.b.size(), ft0.p1((Object[])array), jc4);
        }
        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
    }
    
    public static SerialDescriptor p(final String s, final zlp zlp, final SerialDescriptor[] array) {
        return n(s, zlp, array, (stb)slp.F0);
    }
    
    public static boolean q(final SharedPreferences sharedPreferences) {
        if (!tpz.N()) {
            return false;
        }
        final fdi d = fdi.d();
        String s;
        if ((s = sharedPreferences.getString("video_autoplay", (String)null)) == null) {
            s = H(d);
        }
        return s.equals("wifi_and_mobile") || (s.equals("wifi_only") && kes.a().k());
    }
    
    public static final int r(final Comparable comparable, final Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
    
    public static final int s(final Object o, final Object o2, final stb... array) {
        if (array.length > 0) {
            return t(o, o2, array);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final int t(final Object o, final Object o2, final stb[] array) {
        for (final stb stb : array) {
            final int r = r((Comparable)stb.invoke(o), (Comparable)stb.invoke(o2));
            if (r != 0) {
                return r;
            }
        }
        return 0;
    }
    
    public static final int u(final int n) {
        if (n != 0) {
            if (n == 1) {
                return 2;
            }
            if (n != 2) {
                if (n != 4 && n != 9) {
                    if (n != 10) {
                        switch (n) {
                            default: {
                                return 1;
                            }
                            case 15: {
                                return 4;
                            }
                            case 16:
                            case 17: {
                                break;
                            }
                        }
                    }
                    return 5;
                }
                return 3;
            }
        }
        return 1;
    }
    
    public static final byc$h v(final b b, final boolean b2) {
        final byc$h s0 = byc$h.S0;
        final byc$h f0 = byc$h.F0;
        e0e.f((Object)b, "status");
        switch (((Enum)b).ordinal()) {
            default: {
                return f0;
            }
            case 12: {
                byc$h byc$h;
                if (b2) {
                    byc$h = byc$h.L0;
                }
                else {
                    byc$h = byc$h.K0;
                }
                return byc$h;
            }
            case 9: {
                byc$h byc$h2;
                if (b2) {
                    byc$h2 = byc$h.R0;
                }
                else {
                    byc$h2 = byc$h.Q0;
                }
                return byc$h2;
            }
            case 7: {
                byc$h byc$h3;
                if (b2) {
                    byc$h3 = byc$h.N0;
                }
                else {
                    byc$h3 = byc$h.M0;
                }
                return byc$h3;
            }
            case 4:
            case 10: {
                return s0;
            }
            case 3:
            case 8: {
                return byc$h.O0;
            }
            case 2: {
                return byc$h.I0;
            }
            case 1: {
                byc$h byc$h4;
                if (b2) {
                    byc$h4 = byc$h.H0;
                }
                else {
                    byc$h4 = byc$h.G0;
                }
                return byc$h4;
            }
            case 0: {
                return f0;
            }
        }
    }
    
    public static final int x(final byc$h byc$h) {
        e0e.f((Object)byc$h, "status");
        switch (((Enum)byc$h).ordinal()) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 10:
            case 11:
            case 12: {
                return 5;
            }
            case 7:
            case 8: {
                return 4;
            }
            case 5:
            case 6: {
                return 3;
            }
            case 1:
            case 2: {
                return 2;
            }
            case 0:
            case 3:
            case 4:
            case 9:
            case 13: {
                return 1;
            }
        }
    }
    
    @Pure
    public static void y(final String s, final String s2, final Throwable t) {
        Log.e(s, j(s2, t));
    }
    
    public static final Object z(final oec oec, final Class clazz) {
        if (oec.m()) {
            final vn6 c = oec.n().c();
            if (c instanceof sml) {
                final sml sml = (sml)c;
                if (clazz.isInstance(sml.R())) {
                    return sml.R();
                }
            }
        }
        return null;
    }
    
    public boolean O(final wb4 wb4) {
        e0e.f((Object)wb4, "mutable");
        final n9e a = n9e.a;
        return n9e.k.containsKey(dr8.g((kc8)wb4));
    }
    
    public void U(final int n) {
        throw null;
    }
    
    public void V(final int n, final boolean b) {
        throw null;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return (int)stz.G0.b().h();
    }
    
    public void b(final AnimatedGifView animatedGifView) {
        e0e.f((Object)animatedGifView, "view");
    }
    
    public void c() {
    }
    
    public void d(final AnimatedGifView animatedGifView) {
        e0e.f((Object)animatedGifView, "view");
    }
    
    public mcs e(final Object o) throws Exception {
        final Void void1 = (Void)o;
        return mds.e((Object)Boolean.TRUE);
    }
    
    public tj f(final String s, final jj2 jj2) {
        return (tj)new num(s, jj2);
    }
    
    public void g(final AnimatedGifView animatedGifView) {
    }
    
    public void h(final AnimatedGifView animatedGifView) {
        e0e.f((Object)animatedGifView, "view");
        animatedGifView.l();
    }
    
    public Object l() {
        return new vif();
    }
    
    public Object m(final e26 e26) {
        return new hem$a(((xsm)e26).I((Class)q7z.class));
    }
    
    public int o(final int n) {
        return n;
    }
    
    public wb4 w(final wb4 wb4) {
        final wnb g = dr8.g((kc8)wb4);
        final n9e a = n9e.a;
        final vnb vnb = n9e.l.get(g);
        if (vnb != null) {
            return er8.e((kc8)wb4).j(vnb);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Given class ");
        sb.append(wb4);
        sb.append(" is not a ");
        sb.append("read-only");
        sb.append(" collection");
        throw new IllegalArgumentException(sb.toString());
    }
}
