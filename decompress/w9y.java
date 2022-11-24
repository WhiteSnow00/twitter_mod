import android.util.Log;
import java.io.File;
import java.util.Collection;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.util.List;
import android.animation.AnimatorSet;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.communities.subsystem.api.args.CommunityEditTextInputSettingsContentViewArgs$a;
import android.os.Looper;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9y implements lky, c0z
{
    public static b5z F0;
    public static final int[] G0;
    public static final int[] H0;
    public static final int[] I0;
    public static final w9y J0;
    
    static {
        G0 = new int[] { 2130968673, 2130968869, 2130968922, 2130970209 };
        H0 = new int[] { 2130968673, 2130968922 };
        I0 = new int[] { 2130968673, 2130968922, 2130968923 };
        J0 = new w9y();
    }
    
    public static final p6m b(final long n, final long n2) {
        return new p6m(kgj.d(n), kgj.e(n), aeq.d(n2) + kgj.d(n), aeq.b(n2) + kgj.e(n));
    }
    
    public static final p6m c(final bwe bwe) {
        e0e.f((Object)bwe, "<this>");
        final qni qni = (qni)bwe;
        final bwe x = qni.X();
        p6m w;
        if (x != null) {
            w = ((qni)x).w(bwe, true);
        }
        else {
            final long h0 = ((khk)qni).H0;
            w = new p6m(0.0f, 0.0f, (float)(int)(h0 >> 32), (float)nud.b(h0));
        }
        return w;
    }
    
    public static final p6m d(final bwe bwe) {
        e0e.f((Object)bwe, "<this>");
        return j98.g(m(bwe), bwe, false, 2, (Object)null);
    }
    
    public static final p6m f(final bwe bwe) {
        e0e.f((Object)bwe, "<this>");
        final bwe m = m(bwe);
        final p6m d = d(bwe);
        final float n = (float)(int)(m.a() >> 32);
        final float n2 = (float)nud.b(m.a());
        final float e = jb2.E(d.a, 0.0f, n);
        final float e2 = jb2.E(d.b, 0.0f, n2);
        final float e3 = jb2.E(d.c, 0.0f, n);
        final float e4 = jb2.E(d.d, 0.0f, n2);
        final int n3 = 0;
        if (e != e3 && e2 != e4) {
            final long a = m.A(kqe.e(e, e2));
            final long a2 = m.A(kqe.e(e3, e2));
            final long a3 = m.A(kqe.e(e3, e4));
            final long a4 = m.A(kqe.e(e, e4));
            float n4 = kgj.d(a);
            final float d2 = kgj.d(a2);
            final float d3 = kgj.d(a4);
            final float d4 = kgj.d(a3);
            for (int i = 0; i < 3; ++i) {
                n4 = Math.min(n4, (new float[] { d2, d3, d4 })[i]);
            }
            float n5 = kgj.e(a);
            final float e5 = kgj.e(a2);
            final float e6 = kgj.e(a4);
            final float e7 = kgj.e(a3);
            for (int j = 0; j < 3; ++j) {
                n5 = Math.min(n5, (new float[] { e5, e6, e7 })[j]);
            }
            float n6 = kgj.d(a);
            final float d5 = kgj.d(a2);
            final float d6 = kgj.d(a4);
            final float d7 = kgj.d(a3);
            for (int k = 0; k < 3; ++k) {
                n6 = Math.max(n6, (new float[] { d5, d6, d7 })[k]);
            }
            float n7 = kgj.e(a);
            final float e8 = kgj.e(a2);
            final float e9 = kgj.e(a4);
            final float e10 = kgj.e(a3);
            for (int l = n3; l < 3; ++l) {
                n7 = Math.max(n7, (new float[] { e8, e9, e10 })[l]);
            }
            return new p6m(n4, n5, n6, n7);
        }
        Objects.requireNonNull(p6m.Companion);
        return p6m.e;
    }
    
    public static final int g(final dlh.b b) {
        e0e.f((Object)b, "element");
        int n;
        if (b instanceof mwe) {
            n = 3;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (b instanceof eyd) {
            n2 = (n | 0x200);
        }
        int n3 = n2;
        if (b instanceof qd9) {
            n3 = (n2 | 0x4);
        }
        int n4 = n3;
        if (b instanceof ohp) {
            n4 = (n3 | 0x8);
        }
        int n5 = n4;
        if (b instanceof zpk) {
            n5 = (n4 | 0x10);
        }
        int n6 = 0;
        Label_0104: {
            if (!(b instanceof flh) && !(b instanceof ilh)) {
                n6 = n5;
                if (!(b instanceof hfb)) {
                    break Label_0104;
                }
            }
            n6 = (n5 | 0x20);
        }
        int n7 = n6;
        if (b instanceof ljj) {
            n7 = (n6 | 0x100);
        }
        int n8 = n7;
        if (b instanceof zwj) {
            n8 = (n7 | 0x40);
        }
        if (!(b instanceof wjj) && !(b instanceof ekj)) {
            final int n9 = n8;
            if (!(b instanceof fdg)) {
                return n9;
            }
        }
        return n8 | 0x80;
    }
    
    public static final boolean h(final ocj ocj) {
        e0e.g((Object)ocj, "observer");
        if (e0e.a((Object)Looper.myLooper(), (Object)Looper.getMainLooper()) ^ true) {
            ocj.onSubscribe(fr0.s());
            final StringBuilder f = ehk.f("Expected to be called on the main thread but was ");
            final Thread currentThread = Thread.currentThread();
            e0e.b((Object)currentThread, "Thread.currentThread()");
            f.append(currentThread.getName());
            ocj.onError((Throwable)new IllegalStateException(f.toString()));
            return false;
        }
        return true;
    }
    
    public static final y36 i(final d86 d86, final int n, final Object o) {
        e0e.f((Object)d86, "composer");
        d86.x(n);
        final Object y = d86.y();
        Objects.requireNonNull(d86.Companion);
        z36 z36;
        if (y == d86$a.b) {
            z36 = new z36(n, true);
            d86.p((Object)z36);
        }
        else {
            e0e.d(y, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            z36 = (z36)y;
        }
        z36.i(o);
        d86.O();
        return (y36)z36;
    }
    
    public static final y36 j(final int n, final boolean b, final Object o) {
        e0e.f(o, "block");
        final z36 z36 = new z36(n, b);
        z36.i(o);
        return (y36)z36;
    }
    
    public static final jn5$a k(final CommunityEditTextInputSettingsContentViewArgs$a communityEditTextInputSettingsContentViewArgs$a) {
        final int ordinal = ((Enum)communityEditTextInputSettingsContentViewArgs$a).ordinal();
        boolean b = true;
        int n;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            n = ita.b().f("c9s_max_community_description_length", 160);
        }
        else {
            n = ita.b().f("c9s_max_community_name_length", 30);
        }
        final CommunityEditTextInputSettingsContentViewArgs$a f0 = CommunityEditTextInputSettingsContentViewArgs$a.F0;
        final boolean b2 = communityEditTextInputSettingsContentViewArgs$a != f0;
        if (communityEditTextInputSettingsContentViewArgs$a == f0) {
            b = false;
        }
        return new jn5$a(n, b2, b);
    }
    
    public static final int l(final int n) {
        return 2 << n % 10 * 3 + 1;
    }
    
    public static final bwe m(bwe x) {
        e0e.f((Object)x, "<this>");
        final bwe x2 = x.X();
        bwe bwe = x;
        x = x2;
        qni qni;
        while (true) {
            qni = (qni)bwe;
            bwe = x;
            if (bwe == null) {
                break;
            }
            x = bwe.X();
        }
        qni qni2;
        if (qni instanceof qni) {
            qni2 = qni;
        }
        else {
            qni2 = null;
        }
        if (qni2 == null) {
            return (bwe)qni;
        }
        final qni n0 = qni2.N0;
        Object o = qni2;
        qni n2 = n0;
        Object o2;
        while (true) {
            o2 = o;
            o = n2;
            if (o == null) {
                break;
            }
            n2 = ((qni)o).N0;
        }
        return (bwe)o2;
    }
    
    public static final boolean n(final int n) {
        return (n & 0x80) != 0x0;
    }
    
    public static int o(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static final boolean p() {
        return e0e.a((Object)ita.b().k("tweet_detail_inline_reply_bar_full_composer_type"), (Object)"all_actions") || e0e.a((Object)ita.b().k("tweet_detail_inline_reply_bar_full_composer_type"), (Object)"multi_media");
    }
    
    public static String q(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s2.length() + s.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
    
    public static void r(final AnimatorSet set, final List list) {
        final int size = list.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            max = Math.max(max, animator.getDuration() + animator.getStartDelay());
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, 0 });
        ((Animator)ofInt).setDuration(max);
        list.add(0, ofInt);
        set.playTogether((Collection)list);
    }
    
    public static final long s(final bwe bwe) {
        e0e.f((Object)bwe, "<this>");
        Objects.requireNonNull(kgj.Companion);
        return bwe.l0(kgj.b);
    }
    
    public static final long t(final bwe bwe) {
        e0e.f((Object)bwe, "<this>");
        Objects.requireNonNull(kgj.Companion);
        return bwe.A(kgj.b);
    }
    
    public static final boolean u(final m5m m5m, final m5m m5m2) {
        boolean b2;
        final boolean b = b2 = true;
        if (m5m != null) {
            if (m5m instanceof o5m && m5m2 instanceof o5m) {
                final o5m o5m = (o5m)m5m;
                boolean b3 = false;
                Label_0072: {
                    if (o5m.b != null) {
                        final j10 c = o5m.c;
                        if (c != null && c.a()) {
                            b3 = true;
                            break Label_0072;
                        }
                    }
                    b3 = false;
                }
                b2 = b;
                if (!b3) {
                    return b2;
                }
                b2 = b;
                if (e0e.a((Object)m5m, (Object)m5m2)) {
                    return b2;
                }
                if (e0e.a((Object)o5m.c, (Object)((o5m)m5m2).c)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public static final int v(final int n) {
        return 1 << n % 10 * 3 + 1;
    }
    
    public static final dqx w(final dqx dqx, final dqx dqx2) {
        e0e.f((Object)dqx2, "insets");
        return (dqx)new szv(dqx, dqx2);
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return (int)stz.G0.b().r();
    }
    
    @Override
    public boolean e(final Object o, final File file, final File file2) {
        try {
            return (boolean)d4j.H0((Class)Class.forName("dalvik.system.DexFile"), (Object)file.getPath()) ^ true;
        }
        catch (final ClassNotFoundException ex) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
