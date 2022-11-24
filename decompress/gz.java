import android.os.BaseBundle;
import android.view.View;
import android.util.Log;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import android.content.Intent;
import java.util.Arrays;
import java.util.Objects;
import android.os.Bundle;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import com.google.android.material.button.MaterialButton;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.Reference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gz implements kdm, quy, dsy
{
    public final int F0;
    public Object G0;
    public Object H0;
    
    public gz(final int f0) {
        this.F0 = f0;
        if (f0 == 2) {
            this.G0 = new ivh((Object[])new Reference[16]);
            this.H0 = new ReferenceQueue();
            return;
        }
        if (f0 == 10) {
            this.G0 = new ArrayList();
            return;
        }
        if (f0 != 11) {
            this.G0 = new AtomicReference(tns.a);
            this.H0 = new Object();
            return;
        }
        this.G0 = new LinkedHashMap();
    }
    
    public gz(final AppMeasurementDynamiteService h0, final oqy g0) {
        this.F0 = 7;
        this.H0 = h0;
        this.G0 = g0;
    }
    
    public gz(final MaterialButton g0) {
        this.F0 = 12;
        this.G0 = g0;
        this.H0 = ((View)g0).getContext();
    }
    
    public gz(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public gz(final String s) {
        this.F0 = 4;
        this(s, null);
    }
    
    public gz(final String g0, final String h0) {
        this.F0 = 4;
        iuk.r(g0.length() <= 23, "tag \"%s\" is longer than the %d character maximum", new Object[] { g0, 23 });
        this.G0 = g0;
        if (h0 != null && h0.length() > 0) {
            this.H0 = h0;
        }
        else {
            this.H0 = null;
        }
    }
    
    public gz(final ldn h0) {
        this.F0 = 3;
        this.G0 = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
        this.H0 = h0;
    }
    
    public gz(final mnz h0) {
        this.F0 = 6;
        this.H0 = h0;
    }
    
    public static String g(final gtl gtl) {
        gtl.getName();
        return "handler_state_ads_account_permissions";
    }
    
    public final Object a() {
        switch (this.F0) {
            default: {
                final goz goz = (goz)((dsy)this.H0).a();
                vq9.u((Object)goz);
                return goz;
            }
            case 8: {
                final tuy tuy = (tuy)this.G0;
                final Bundle bundle = (Bundle)this.H0;
                Objects.requireNonNull(tuy);
                final int int1 = ((BaseBundle)bundle).getInt("session_id");
                Boolean b;
                if (int1 == 0) {
                    b = Boolean.FALSE;
                }
                else {
                    final HashMap e = tuy.e;
                    final Integer value = int1;
                    if (e.containsKey(value)) {
                        final guy b2 = tuy.b(int1);
                        final int int2 = ((BaseBundle)bundle).getInt(lp7.K0("status", b2.c.a));
                        if (vq9.w(b2.c.d, int2)) {
                            tuy.g.i("Found stale update for session %s with status %d.", value, b2.c.d);
                            final cuy c = b2.c;
                            final String a = c.a;
                            final int d = c.d;
                            if (d == 4) {
                                ((w100)tuy.b.a()).a(int1, a);
                            }
                            else if (d == 5) {
                                ((w100)tuy.b.a()).c(int1);
                            }
                            else if (d == 6) {
                                ((w100)tuy.b.a()).d(Arrays.asList(a));
                            }
                        }
                        else {
                            b2.c.d = int2;
                            if (vq9.x(int2)) {
                                tuy.c((quy)new uzz(tuy, int1));
                                tuy.c.a(b2.c.a);
                            }
                            else {
                                for (final luy luy : b2.c.f) {
                                    final ArrayList parcelableArrayList = bundle.getParcelableArrayList(lp7.O0("chunk_intents", b2.c.a, luy.a));
                                    if (parcelableArrayList != null) {
                                        for (int i = 0; i < parcelableArrayList.size(); ++i) {
                                            if (parcelableArrayList.get(i) != null && ((Intent)parcelableArrayList.get(i)).getData() != null) {
                                                luy.d.get(i).a = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        final String d2 = tuy.d(bundle);
                        final long long1 = ((BaseBundle)bundle).getLong(lp7.K0("pack_version", d2));
                        final String string = ((BaseBundle)bundle).getString(lp7.K0("pack_version_tag", d2), "");
                        final int int3 = ((BaseBundle)bundle).getInt(lp7.K0("status", d2));
                        final long long2 = ((BaseBundle)bundle).getLong(lp7.K0("total_bytes_to_download", d2));
                        final ArrayList stringArrayList = bundle.getStringArrayList(lp7.K0("slice_ids", d2));
                        final ArrayList list = new ArrayList();
                        List<String> emptyList;
                        if ((emptyList = stringArrayList) == null) {
                            emptyList = Collections.emptyList();
                        }
                        for (final String s : emptyList) {
                            final ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(lp7.O0("chunk_intents", d2, s));
                            final ArrayList<aty> list2 = new ArrayList<aty>();
                            List<Object> emptyList2;
                            if ((emptyList2 = parcelableArrayList2) == null) {
                                emptyList2 = Collections.emptyList();
                            }
                            final Iterator<Object> iterator3 = emptyList2.iterator();
                            while (true) {
                                boolean b3 = false;
                                if (!iterator3.hasNext()) {
                                    break;
                                }
                                if (iterator3.next() != null) {
                                    b3 = true;
                                }
                                list2.add(new aty(b3));
                            }
                            final String string2 = ((BaseBundle)bundle).getString(lp7.O0("uncompressed_hash_sha256", d2, s));
                            final long long3 = ((BaseBundle)bundle).getLong(lp7.O0("uncompressed_size", d2, s));
                            final int int4 = ((BaseBundle)bundle).getInt(lp7.O0("patch_format", d2, s), 0);
                            luy luy2;
                            if (int4 != 0) {
                                luy2 = new luy(s, string2, long3, list2, 0, int4);
                            }
                            else {
                                luy2 = new luy(s, string2, long3, list2, ((BaseBundle)bundle).getInt(lp7.O0("compression_format", d2, s), 0), 0);
                            }
                            list.add(luy2);
                        }
                        tuy.e.put(int1, new guy(int1, ((BaseBundle)bundle).getInt("app_version_code"), new cuy(d2, long1, int3, long2, (List)list, string)));
                    }
                    b = Boolean.TRUE;
                }
                return b;
            }
        }
    }
    
    public final void accept(final Object o, final Object o2) {
        final dto dto = (dto)this.H0;
        final d9y d9y = (d9y)o;
        final v6y v6y = new v6y((rcs)o2);
        final g9y g9y = (g9y)d9y.D();
        Objects.requireNonNull(dto, "null reference");
        final Parcel s = g9y.s();
        n7y.c(s, (IInterface)v6y);
        n7y.b(s, (Parcelable)dto);
        g9y.x(2, s);
    }
    
    public final boolean b(final int n) {
        return Log.isLoggable((String)this.G0, n);
    }
    
    public final void c() {
        Reference poll;
        do {
            poll = ((ReferenceQueue)this.H0).poll();
            if (poll != null) {
                ((ivh)this.G0).n((Object)poll);
            }
        } while (poll != null);
    }
    
    public final void d(final String s, final String s2, final Throwable t) {
        if (this.b(6)) {
            Log.e(s, this.i(s2), t);
        }
    }
    
    public final void e() {
        final Iterator iterator = ((Map)this.G0).values().iterator();
        while (iterator.hasNext()) {
            ((gtl)iterator.next()).execute();
        }
    }
    
    public final Object f() {
        final sns sns = ((AtomicReference)this.G0).get();
        final int a = sns.a(Thread.currentThread().getId());
        Object o;
        if (a >= 0) {
            o = sns.c[a];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final void h(final Object o) {
        final long id = Thread.currentThread().getId();
        synchronized (this.H0) {
            final sns sns = ((AtomicReference)this.G0).get();
            final int a = sns.a(id);
            boolean b;
            if (a < 0) {
                b = false;
            }
            else {
                sns.c[a] = o;
                b = true;
            }
            if (b) {
                return;
            }
            ((AtomicReference)this.G0).set(sns.b(id, o));
        }
    }
    
    public final String i(final String s) {
        final String s2 = (String)this.H0;
        if (s2 == null) {
            return s;
        }
        return s2.concat(s);
    }
}
