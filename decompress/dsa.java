import android.content.Intent;
import java.util.Iterator;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import android.util.Log;
import java.io.FileFilter;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collection;
import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.Collections;
import java.util.HashSet;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsa implements t1r
{
    public static final long o;
    public final Handler a;
    public final Context b;
    public final mxz c;
    public final dqy<byz> d;
    public final qoy e;
    public final ug3 f;
    public final ug3 g;
    public final ThreadPoolExecutor h;
    public final rsz i;
    public final File j;
    public final AtomicReference<v1r> k;
    public final Set<String> l;
    public final Set<String> m;
    public final AtomicBoolean n;
    
    static {
        o = TimeUnit.SECONDS.toMillis(1L);
    }
    
    public dsa(final Context b, final File j, final mxz c, final dqy<byz> d) {
        final Executor o = wvz.o();
        final qoy e = new qoy(b);
        this.a = new Handler(Looper.getMainLooper());
        this.k = new AtomicReference<v1r>();
        this.l = Collections.synchronizedSet(new HashSet<String>());
        this.m = Collections.synchronizedSet(new HashSet<String>());
        this.n = new AtomicBoolean(false);
        this.b = b;
        this.j = j;
        this.c = c;
        this.d = d;
        this.h = (ThreadPoolExecutor)o;
        this.e = e;
        this.g = new ug3(4);
        this.f = new ug3(4);
        this.i = rsz.C0;
    }
    
    public static String j(final String s) {
        return s.split("\\.config\\.", 2)[0];
    }
    
    public final boolean a(final v1r v1r, final Activity activity) throws IntentSender$SendIntentException {
        return false;
    }
    
    public final void b(final w1r w1r) {
        final ug3 g = this.g;
        synchronized (g) {
            ((Set)g.C0).remove(w1r);
        }
    }
    
    public final void c(final w1r w1r) {
        final ug3 g = this.g;
        synchronized (g) {
            ((Set)g.C0).add(w1r);
        }
    }
    
    public final Set<String> d() {
        final HashSet set = new HashSet();
        set.addAll(this.c.c());
        set.addAll(this.l);
        return set;
    }
    
    public final ppz e(final u1r u1r) {
        try {
            final v1r h = this.h((juz)new rdf((Object)u1r));
            if (h == null) {
                return this.i(-100);
            }
            final int g = h.g();
            final ArrayList list = new ArrayList();
            final Iterator iterator = u1r.b.iterator();
            while (iterator.hasNext()) {
                list.add(((Locale)iterator.next()).getLanguage());
            }
            HashSet set = new HashSet();
            final ArrayList list2 = new ArrayList();
            final File[] listFiles = this.j.listFiles((FileFilter)vjz.a);
            String s = "FakeSplitInstallManager";
            if (listFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return this.i(-5);
            }
            final int length = listFiles.length;
            int i = 0;
            long n = 0L;
            while (i < length) {
                final File file = listFiles[i];
                final String q = x3j.Q(file);
                final String j = j(q);
                set.add(q);
                long n2 = 0L;
                String s5 = null;
                HashSet set9 = null;
                Label_0726: {
                    String s4 = null;
                    HashSet set7 = null;
                    Label_0697: {
                        if (u1r.a.contains(j)) {
                            final String k = j(q);
                            final HashSet set2 = new HashSet(this.e.a());
                            final ujz a = this.c.a();
                            if (a == null) {
                                throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
                            }
                            final Map a2 = a.a((Collection)Arrays.asList(k));
                            final HashSet set3 = new HashSet();
                            final HashMap hashMap = (HashMap)a2;
                            final Iterator iterator2 = hashMap.values().iterator();
                            while (iterator2.hasNext()) {
                                set3.addAll((Collection)iterator2.next());
                            }
                            final HashSet<Object> set4 = new HashSet<Object>();
                            for (String s2 : set2) {
                                if (s2.contains("_")) {
                                    s2 = s2.split("_", -1)[0];
                                }
                                set4.add(s2);
                            }
                            final HashSet set5 = set;
                            final String s3 = s;
                            set4.addAll(this.m);
                            set4.addAll(list);
                            final HashSet set6 = new HashSet();
                            for (final Map.Entry<Object, V> entry : hashMap.entrySet()) {
                                if (set4.contains(entry.getKey())) {
                                    set6.addAll((Collection)entry.getValue());
                                }
                            }
                            s4 = s3;
                            set7 = set5;
                            if (!set3.contains(q)) {
                                break Label_0697;
                            }
                            s4 = s3;
                            set7 = set5;
                            if (set6.contains(q)) {
                                s4 = s3;
                                set7 = set5;
                                break Label_0697;
                            }
                        }
                        else {
                            final HashSet set8 = set;
                            s4 = s;
                            set7 = set8;
                        }
                        final ArrayList b = u1r.b;
                        final ArrayList list3 = new ArrayList(this.l);
                        list3.addAll(Arrays.asList("", "base"));
                        final ujz a3 = this.c.a();
                        if (a3 == null) {
                            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
                        }
                        final Map a4 = a3.a((Collection)list3);
                        final Iterator iterator5 = b.iterator();
                        HashMap hashMap2;
                        String language;
                        Locale locale;
                        do {
                            n2 = n;
                            s5 = s4;
                            set9 = set7;
                            if (!iterator5.hasNext()) {
                                break Label_0726;
                            }
                            locale = (Locale)iterator5.next();
                            language = locale.getLanguage();
                            hashMap2 = (HashMap)a4;
                        } while (!hashMap2.containsKey(language) || !((Set)hashMap2.get(locale.getLanguage())).contains(q));
                    }
                    final long length2 = file.length();
                    list2.add(file);
                    n2 = length2 + n;
                    set9 = set7;
                    s5 = s4;
                }
                ++i;
                s = s5;
                set = set9;
                n = n2;
            }
            final String value = String.valueOf(set);
            final String value2 = String.valueOf(u1r.a);
            Log.i(s, hi.J(new StringBuilder(value.length() + 22 + value2.length()), "availableSplits ", value, " want ", value2));
            Integer a5;
            if (u1r.a.size() != 1 || (a5 = ((byz)this.d.a()).b().get(u1r.a.get(0))) == null) {
                a5 = ((byz)this.d.a()).a();
            }
            if (a5 != null) {
                return this.i(a5);
            }
            if (!set.containsAll(new HashSet(u1r.a))) {
                return this.i(-2);
            }
            final ArrayList a6 = u1r.a;
            final Integer value3 = g;
            this.m(1, 0, 0L, n, a6, value3, list);
            this.h.execute(new f8z(this, list2, list));
            return m0n.V0((Object)value3);
        }
        catch (final SplitInstallException ex) {
            return this.i(ex.C0);
        }
    }
    
    public final Set<String> f() {
        final HashSet set = new HashSet();
        if (this.c.d() != null) {
            set.addAll(this.c.d());
        }
        set.addAll(this.m);
        return set;
    }
    
    public final v1r g() {
        return this.k.get();
    }
    
    public final v1r h(final juz juz) {
        synchronized (this) {
            final v1r g = this.g();
            final v1r k = juz.k(g);
            if (this.k.compareAndSet(g, k)) {
                return k;
            }
            return null;
        }
    }
    
    public final ppz i(final int n) {
        synchronized (this) {
            final v1r g = this.g();
            v1r b;
            if (g == null) {
                b = null;
            }
            else {
                b = v1r.b(g.g(), 6, n, g.a(), g.i(), g.e(), g.d());
            }
            this.k.compareAndSet(g, b);
            monitorexit(this);
            return m0n.T0((Exception)new SplitInstallException(n));
        }
    }
    
    public final void k(final List<Intent> list, final List<String> list2, final List<String> list3, final long n, final boolean b) {
        this.i.b().a((List)list, (l1z)new ssz(this, list2, list3, n, b, list));
    }
    
    public final void l(final List<String> list, final List<String> list2, final long n) {
        this.l.addAll(list);
        this.m.addAll(list2);
        final Long value = n;
        this.m(5, 0, value, value, null, null, null);
    }
    
    public final boolean m(final int n, final int n2, final Long n3, final Long n4, final List<String> list, final Integer n5, final List<String> list2) {
        final v1r h = this.h((juz)new rdz(n5, n, n2, n3, n4, (List)list, (List)list2));
        if (h != null) {
            this.a.post((Runnable)new p2y((Object)this, (Object)h, 5));
            return true;
        }
        return false;
    }
}
