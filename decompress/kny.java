import android.os.BaseBundle;
import tv.periscope.android.ui.broadcast.replay.thumbnails.di.DaggerThumbnailsComponent;
import tv.periscope.android.ui.broadcast.replay.thumbnails.di.DaggerThumbnailsComponent$a;
import android.content.Context;
import java.util.List;
import java.io.IOException;
import com.google.android.play.core.internal.zzbt;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.lang.reflect.Field;
import com.google.android.play.core.internal.zzbx;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kny implements dsy, iiy, vsd$a
{
    public final int F0;
    
    public kny() {
        this.F0 = 0;
    }
    
    public kny(final int f0) {
        this.F0 = f0;
    }
    
    public kny(final fda fda, final pmc pmc) {
        this.F0 = 10;
        e0e.f((Object)fda, "listScrollObservable");
        e0e.f((Object)pmc, "homeScrollObservable");
        tqb.F(fda.v0(), (fca)pmc);
    }
    
    public kny(final ove ove, final v49 v49, final kcm kcm) {
        this.F0 = 9;
        e0e.f((Object)ove, "launchTracker");
        e0e.f((Object)v49, "dmTabBadgeDisplayTracker");
        e0e.f((Object)kcm, "releaseCompletable");
        final uv1<Void> g = ove.g;
        Objects.requireNonNull(g, "observable is null");
        final m06 m06 = new m06((fbj)g);
        final e39 e39 = new e39();
        kcm.d().q((sj)new x49(e39));
        e39.c(((yz5)m06).q((sj)new y49(v49)));
    }
    
    public kny(final pml pml, final f5j f5j) {
        this.F0 = 13;
        e0e.f((Object)pml, "frescoProvider");
        f5j.a(pml, true);
    }
    
    public kny(final t5j t5j, final g5e g5e, final imf imf) {
        this.F0 = 11;
        e0e.f((Object)t5j, "requestSignal");
        e0e.f((Object)g5e, "requestTransformer");
        e0e.f((Object)imf, "repository");
        final e39 e39;
        e39.c(t5j.doOnComplete((sj)new lkf(e39 = new e39())).subscribe((rk6)new f$u1((stb)new mkf(imf, g5e))));
    }
    
    public static Parcelable f(Bundle bundle, final String s) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(kny.class.getClassLoader());
        bundle = bundle.getBundle("map_state");
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(kny.class.getClassLoader());
        return bundle.getParcelable(s);
    }
    
    public static void g(final Bundle bundle, final Bundle bundle2) {
        if (bundle != null) {
            if (bundle2 != null) {
                final Parcelable f = f(bundle, "MapOptions");
                if (f != null) {
                    h(bundle2, "MapOptions", f);
                }
                final Parcelable f2 = f(bundle, "StreetViewPanoramaOptions");
                if (f2 != null) {
                    h(bundle2, "StreetViewPanoramaOptions", f2);
                }
                final Parcelable f3 = f(bundle, "camera");
                if (f3 != null) {
                    h(bundle2, "camera", f3);
                }
                if (((BaseBundle)bundle).containsKey("position")) {
                    ((BaseBundle)bundle2).putString("position", ((BaseBundle)bundle).getString("position"));
                }
                if (((BaseBundle)bundle).containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                    bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
                }
            }
        }
    }
    
    public static void h(final Bundle bundle, final String s, final Parcelable parcelable) {
        bundle.setClassLoader(kny.class.getClassLoader());
        Bundle bundle2;
        if ((bundle2 = bundle.getBundle("map_state")) == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(kny.class.getClassLoader());
        bundle2.putParcelable(s, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
    
    public static Object i(final ClassLoader classLoader) {
        final Field i0 = d4j.I0((Object)classLoader, "pathList");
        try {
            return Object.class.cast(i0.get(classLoader));
        }
        catch (final Exception ex) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", i0.getName(), classLoader.getClass().getName(), Object.class.getName()), (Throwable)ex);
        }
    }
    
    public static void j(final ClassLoader classLoader, final Set set) {
        if (set.isEmpty()) {
            return;
        }
        final HashSet set2 = new HashSet();
        for (final File file : set) {
            final String value = String.valueOf(file.getParentFile().getAbsolutePath());
            String concat;
            if (value.length() != 0) {
                concat = "Adding native library parent directory: ".concat(value);
            }
            else {
                concat = new String("Adding native library parent directory: ");
            }
            Log.d("Splitcompat", concat);
            set2.add(file.getParentFile());
        }
        final cny d0 = d4j.D0(i(classLoader), "nativeLibraryDirectories", (Class)File.class);
        set2.removeAll(Arrays.asList((File[])((esa)d0).c()));
        synchronized (qsz.class) {
            final int size = set2.size();
            final StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            Log.d("Splitcompat", sb.toString());
            d0.f((Collection)set2);
        }
    }
    
    public static boolean l(final ClassLoader classLoader, final File file, final File file2, final boolean b, final qky qky, final String s, final lky lky) {
        final ArrayList list = new ArrayList();
        final Object i = i(classLoader);
        final cny d0 = d4j.D0(i, "dexElements", (Class)Object.class);
        final List<Object> list2 = Arrays.asList((Object[])((esa)d0).c());
        final ArrayList list3 = new ArrayList();
        final Iterator<Object> iterator = list2.iterator();
        while (iterator.hasNext()) {
            list3.add(d4j.E0(iterator.next(), s, (Class)File.class).c());
        }
        if (list3.contains(file2)) {
            return true;
        }
        int j = 0;
        if (!b && !lky.e(i, file2, file)) {
            final String value = String.valueOf(file2.getPath());
            String concat;
            if (value.length() != 0) {
                concat = "Should be optimized ".concat(value);
            }
            else {
                concat = new String("Should be optimized ");
            }
            Log.w("SplitCompat", concat);
            return false;
        }
        d0.e((Collection)Arrays.asList(qky.d(i, new ArrayList((Collection<? extends E>)Collections.singleton(file2)), file, list)));
        if (!list.isEmpty()) {
            final zzbt zzbt = new zzbt("DexPathList.makeDexElement failed");
            while (j < list.size()) {
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", (Throwable)list.get(j));
                ++j;
            }
            new cny(i, d4j.I0(i, "dexElementsSuppressedExceptions"), (Class)IOException.class).e((Collection)list);
            throw zzbt;
        }
        return true;
    }
    
    public final /* bridge */ Object a() {
        return new y9y();
    }
    
    public final void b(final ag6 ag6, final xsc xsc) {
        e0e.f((Object)ag6, "request");
        final asc f = xsc.f;
        if (f != null) {
            final String j = f.j("att");
            if (j != null) {
                u51.c(j);
            }
        }
    }
    
    public final ops c(final n9d a, final Context b, final rps c) {
        e0e.f((Object)a, "imageUrlLoader");
        e0e.f((Object)b, "context");
        e0e.f((Object)c, "viewModule");
        final DaggerThumbnailsComponent$a daggerThumbnailsComponent$a = (DaggerThumbnailsComponent$a)DaggerThumbnailsComponent.builder();
        Objects.requireNonNull(daggerThumbnailsComponent$a);
        daggerThumbnailsComponent$a.a = a;
        daggerThumbnailsComponent$a.b = b;
        o9a.m((Object)(daggerThumbnailsComponent$a.c = c), (Class)rps.class);
        return (ops)new DaggerThumbnailsComponent(daggerThumbnailsComponent$a.a, daggerThumbnailsComponent$a.b, daggerThumbnailsComponent$a.c).h.get();
    }
    
    public final boolean d(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        switch (this.F0) {
            default: {
                return dnl.y(classLoader, file, file2, b);
            }
            case 5: {
                return l(classLoader, file, file2, b, (qky)new iwl(), "zip", (lky)new qsz());
            }
        }
    }
    
    public final void e(final long n) {
        final bpr$a companion = bpr.Companion;
        final aca a = aca.a;
        bpr$a.a(companion, aca.h, Long.valueOf(n), Integer.valueOf(rpr.Companion.a()), (String)null, (String)null, (String)null, (String)null, (Integer)null, (Boolean)null, (Boolean)null, (String)null, 1048568);
    }
    
    public final void k(final ClassLoader classLoader, final Set set) {
        switch (this.F0) {
            default: {
                tpz.a0(classLoader, set, (kly)new p4j());
                return;
            }
            case 5: {
                j(classLoader, set);
            }
        }
    }
}
