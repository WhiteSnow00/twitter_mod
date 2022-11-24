import android.os.Parcel;
import android.os.Looper;
import android.os.Build$VERSION;
import java.util.LinkedHashSet;
import androidx.work.c;
import com.twitter.longform.adfreearticles.api.AdFreeDomainFetchWorker;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.Iterator;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duh implements dlv
{
    public duh() {
    }
    
    public duh(final Context context) {
    }
    
    public duh(final dq0 dq0, final Set set) {
        final int g = ((gcu)dq0.d.getValue()).g("app_v", -1);
        final int e = dq0.e;
        if (dq0.a()) {
            dq0.c = true;
            final gcu$c i = ((gcu)dq0.d.getValue()).i();
            ((gcu$d)i).g("app_v", dq0.e);
            i.e();
        }
        for (final iq0 iq0 : set) {
            if (iq0.w0(g, e)) {
                ((Runnable)iq0).run();
            }
        }
    }
    
    public duh(final vn6 vn6, final udv udv, final fea fea) {
        e0e.f((Object)udv, "twitterListViewHost");
        e0e.f((Object)fea, "eventSourceRegistrar");
        if (vn6 != null) {
            final View view = vn6.getView();
            if (view != null) {
                final RecyclerView b = udv.K0.b;
                e0e.e((Object)b, "twitterListViewHost.listWrapper.view");
                fea.d((View)b, view);
                fea.h((View)b, (zda)new vte("timeline", "timeline"));
            }
        }
    }
    
    public duh(final yp yp, final wp wp) {
        e0e.f((Object)yp, "adFreeArticlesDomainManager");
        e0e.f((Object)wp, "adFreeArticlesConfiguration");
        if (wp.c() == 0L || !nq1.e(wp.c())) {
            final lsx c = yp.c;
            final uga f0 = uga.F0;
            final emj.a a = new emj.a((Class<? extends c>)AdFreeDomainFetchWorker.class);
            final LinkedHashSet set = new LinkedHashSet();
            Object o;
            if (Build$VERSION.SDK_INT >= 24) {
                o = rr4.n2((Iterable)set);
            }
            else {
                o = r3a.F0;
            }
            a.c.j = new wj6(2, false, false, false, false, -1L, -1L, (Set)o);
            c.f("AdFreeArticlesDomainFetch", f0, (emj)a.b());
        }
    }
    
    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    public final Object f(final Parcel parcel) {
        final int int1 = parcel.readInt();
        Object o;
        if (int1 == -1) {
            o = null;
        }
        else {
            final boolean[] array = new boolean[int1];
            parcel.readBooleanArray(array);
            o = array;
        }
        return o;
    }
    
    public final void g(final Object o, final Parcel parcel) {
        final boolean[] array = (boolean[])o;
        if (array == null) {
            parcel.writeInt(-1);
        }
        else {
            parcel.writeInt(array.length);
            parcel.writeBooleanArray(array);
        }
    }
}
