import android.graphics.PointF;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Objects;
import tv.periscope.android.api.service.payman.PaymanService;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqe implements u80, kdm, dsy, g100, g3d
{
    public final int F0;
    public Object G0;
    
    public bqe(final int n) {
        this.F0 = 11;
        this.G0 = new ArrayList(n);
    }
    
    public bqe(final int f0, final j98 j98) {
        this.F0 = f0;
        if (f0 != 12) {
            this.G0 = new HashMap();
            return;
        }
        this.G0 = new ConcurrentHashMap();
    }
    
    public bqe(final igt g0) {
        this.F0 = 9;
        e0e.f((Object)g0, "toaster");
        this.G0 = g0;
    }
    
    public bqe(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public bqe(final n2s g0) {
        this.F0 = 7;
        e0e.f((Object)g0, "swipeToLatestRepo");
        this.G0 = g0;
    }
    
    public bqe(final PaymanService g0) {
        this.F0 = 13;
        e0e.f((Object)g0, "paymanService");
        this.G0 = g0;
    }
    
    public final /* bridge */ Object a() {
        return new bjy(((zhz)this.G0).b());
    }
    
    public final void a() {
        final x100 x100 = (x100)this.G0;
        Objects.requireNonNull(x100);
        x100.a("split-install-errors", (g100)new v4c((Object)x100));
    }
    
    public final void accept(Object obtain, final Object o) {
        switch (this.F0) {
            case 3: {
                final wty wty = (wty)obtain;
                final rcs rcs = (rcs)o;
                final u7z u7z = (u7z)((gm1)wty).D();
                final r9y r9y = new r9y(null, null);
                final kuz kuz = new kuz(rcs);
                obtain = Parcel.obtain();
                ((Parcel)obtain).writeInterfaceToken(u7z.b);
                final int a = xoy.a;
                ((Parcel)obtain).writeInt(1);
                r9y.writeToParcel((Parcel)obtain, 0);
                ((Parcel)obtain).writeStrongBinder((IBinder)kuz);
                final Parcel obtain2 = Parcel.obtain();
                try {
                    u7z.a.transact(1, (Parcel)obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                }
                finally {
                    ((Parcel)obtain).recycle();
                    obtain2.recycle();
                }
                break;
            }
        }
        final a7y a7y = (a7y)this.G0;
        final b7y b7y = (b7y)obtain;
        final rcs rcs2 = (rcs)o;
        Objects.requireNonNull(a7y);
        final z6y z6y = new z6y(rcs2);
        final t6y t6y = (t6y)((gm1)b7y).D();
        final String k = a7y.k;
        final Parcel s = t6y.s();
        n7y.c(s, (IInterface)z6y);
        s.writeString(k);
        t6y.x(2, s);
    }
    
    public final void b(final Object o) {
        ((ArrayList)this.G0).add(o);
    }
    
    public final void c(Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Object[]) {
            final Object[] array = (Object[])o;
            if (array.length > 0) {
                o = this.G0;
                ((ArrayList)o).ensureCapacity(((ArrayList)o).size() + array.length);
                Collections.addAll((Collection<? super Object>)this.G0, array);
            }
        }
        else if (o instanceof Collection) {
            ((ArrayList)this.G0).addAll((Collection)o);
        }
        else if (o instanceof Iterable) {
            final Iterator iterator = ((Iterable)o).iterator();
            while (iterator.hasNext()) {
                o = iterator.next();
                ((ArrayList)this.G0).add(o);
            }
        }
        else {
            if (!(o instanceof Iterator)) {
                final StringBuilder f = ehk.f("Don't know how to spread ");
                f.append(o.getClass());
                throw new UnsupportedOperationException(f.toString());
            }
            final Iterator iterator2 = (Iterator)o;
            while (iterator2.hasNext()) {
                ((ArrayList)this.G0).add(iterator2.next());
            }
        }
    }
    
    public final float d(final Object o, final String s) {
        if (!((HashMap)this.G0).containsKey(o)) {
            return Float.NaN;
        }
        final HashMap hashMap = ((HashMap)this.G0).get(o);
        if (hashMap != null) {
            if (hashMap.containsKey(s)) {
                final float[] array = (float[])hashMap.get(s);
                if (array == null) {
                    return Float.NaN;
                }
                if (array.length > 0) {
                    return array[0];
                }
            }
        }
        return Float.NaN;
    }
    
    public final pag e(final String s) {
        otr otr;
        if ((otr = (otr)((ConcurrentMap)this.G0).get(s)) == null) {
            otr = new otr(s);
            final otr otr2 = ((ConcurrentMap)this.G0).putIfAbsent(s, otr);
            if (otr2 != null) {
                otr = otr2;
            }
        }
        return (pag)otr;
    }
    
    public final boolean f() {
        final int size = ((List)this.G0).size();
        boolean b = false;
        if (size == 1) {
            b = b;
            if (((List)this.G0).get(0).c()) {
                b = true;
            }
        }
        return b;
    }
    
    public final wm1 g() {
        if (((List)this.G0).get(0).c()) {
            return (wm1)new kpk((List<zre<PointF>>)this.G0);
        }
        return (wm1)new j0k((List)this.G0);
    }
    
    public final List h() {
        return (List)this.G0;
    }
    
    public final int i() {
        return ((ArrayList)this.G0).size();
    }
    
    public final Object[] j(final Object[] array) {
        return ((ArrayList)this.G0).toArray(array);
    }
}
