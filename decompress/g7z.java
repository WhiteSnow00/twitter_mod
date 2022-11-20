import com.google.android.gms.internal.measurement.zzd;
import java.util.concurrent.Callable;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.Set;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7z extends zmz implements sby
{
    public final ts0 G0;
    public final ts0 H0;
    public final ts0 I0;
    public final ts0 J0;
    public final ts0 K0;
    public final ts0 L0;
    public final c6z M0;
    public final t3c N0;
    public final ts0 O0;
    public final ts0 P0;
    public final ts0 Q0;
    
    public g7z(final poz poz) {
        super(poz);
        this.G0 = new ts0();
        this.H0 = new ts0();
        this.I0 = new ts0();
        this.J0 = new ts0();
        this.K0 = new ts0();
        this.O0 = new ts0();
        this.P0 = new ts0();
        this.Q0 = new ts0();
        this.L0 = new ts0();
        this.M0 = new c6z(this);
        this.N0 = new t3c((Object)this);
    }
    
    public static final Map o(final g3z g3z) {
        final ts0 ts0 = new ts0();
        for (final w3z w3z : g3z.E()) {
            ((d8q<String, String>)ts0).put(w3z.t(), w3z.u());
        }
        return (Map)ts0;
    }
    
    public final void A(final String s, byte[] i, final String s2, final String s3) {
        this.h();
        ((pbz)this).g();
        eli.n(s);
        Object o = this.k(s, i).k();
        this.l(s, (c3z)o);
        this.n(s, (g3z)((akz)o).j());
        ((d8q<String, g3z>)this.K0).put(s, (g3z)((akz)o).j());
        ((d8q<String, String>)this.O0).put(s, ((g3z)((akz)o).E0).A());
        ((d8q<String, String>)this.P0).put(s, s2);
        ((d8q<String, String>)this.Q0).put(s, s3);
        ((d8q<String, Map>)this.G0).put(s, o((g3z)((akz)o).j()));
        final zdy f0 = ((xmz)this).E0.F0;
        poz.I((zmz)f0);
        final ArrayList list = new ArrayList(Collections.unmodifiableList((List<?>)((g3z)((akz)o).E0).B()));
        String s4 = "app_id=? and audience_id=?";
        String s5 = "event_filters";
        String s6;
        String s7;
        akz akz2;
        String s8;
        String s9;
        for (int j = 0; j < list.size(); ++j, s8 = s6, s9 = s7, o = akz2, s4 = s8, s5 = s9) {
            final tyy tyy = (tyy)((clz)list.get(j)).k();
            Object o2;
            if (((xyy)((akz)tyy).E0).t() != 0) {
                o2 = tyy;
                Object o3;
                for (int k = 0; k < ((xyy)((akz)o2).E0).t(); ++k, o2 = o3) {
                    final czy czy = (czy)((xyy)((akz)o2).E0).w(k).k();
                    final czy czy2 = (czy)((akz)czy).g();
                    final String x = xa8.x(((gzy)((akz)czy).E0).y());
                    boolean b;
                    if (x != null) {
                        if (((akz)czy2).F0) {
                            ((akz)czy2).l();
                            ((akz)czy2).F0 = false;
                        }
                        gzy.A((gzy)((akz)czy2).E0, x);
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    for (int l = 0; l < ((gzy)((akz)czy).E0).s(); ++l) {
                        final nzy w = ((gzy)((akz)czy).E0).w(l);
                        final String e = wd.E(w.w(), ycs.K0, ycs.L0);
                        if (e != null) {
                            final kzy kzy = (kzy)((clz)w).k();
                            if (kzy.F0) {
                                kzy.l();
                                kzy.F0 = false;
                            }
                            nzy.x((nzy)kzy.E0, e);
                            final nzy nzy = (nzy)kzy.j();
                            if (((akz)czy2).F0) {
                                ((akz)czy2).l();
                                ((akz)czy2).F0 = false;
                            }
                            gzy.B((gzy)((akz)czy2).E0, l, nzy);
                            b = true;
                        }
                    }
                    o3 = o2;
                    if (b) {
                        if (((akz)o2).F0) {
                            ((akz)o2).l();
                            ((akz)o2).F0 = false;
                        }
                        xyy.B((xyy)((akz)o2).E0, k, (gzy)((akz)czy2).j());
                        list.set(j, (Object)((akz)tyy).j());
                        o3 = tyy;
                    }
                }
                final akz akz = (akz)o;
                s6 = s4;
                s7 = s5;
                akz2 = akz;
            }
            else {
                final akz akz3 = (akz)o;
                s6 = s4;
                s7 = s5;
                final tyy tyy2 = tyy;
                akz2 = akz3;
                o2 = tyy2;
            }
            if (((xyy)((akz)o2).E0).u() != 0) {
                akz akz4;
                for (int n = 0; n < ((xyy)((akz)o2).E0).u(); ++n, o2 = akz4) {
                    final t0z x2 = ((xyy)((akz)o2).E0).x(n);
                    final String e2 = wd.E(x2.w(), xli.T0, xli.U0);
                    akz4 = (akz)o2;
                    if (e2 != null) {
                        final p0z p0z = (p0z)((clz)x2).k();
                        if (((akz)p0z).F0) {
                            ((akz)p0z).l();
                            ((akz)p0z).F0 = false;
                        }
                        t0z.x((t0z)((akz)p0z).E0, e2);
                        if (((akz)o2).F0) {
                            ((akz)o2).l();
                            ((akz)o2).F0 = false;
                        }
                        xyy.A((xyy)((akz)o2).E0, n, (t0z)((akz)p0z).j());
                        list.set(j, (Object)((akz)tyy).j());
                        akz4 = (akz)tyy;
                    }
                }
            }
        }
        ((zmz)f0).h();
        ((pbz)f0).g();
        eli.n(s);
        final SQLiteDatabase a = f0.A();
        a.beginTransaction();
        try {
            ((zmz)f0).h();
            ((pbz)f0).g();
            eli.n(s);
            final SQLiteDatabase a2 = f0.A();
            a2.delete("property_filters", "app_id=?", new String[] { s });
            a2.delete(s5, "app_id=?", new String[] { s });
            final Iterator iterator = list.iterator();
            final String s10 = s4;
            final Iterator iterator2 = iterator;
        Label_0924:
            while (iterator2.hasNext()) {
                final xyy xyy = (xyy)iterator2.next();
                ((zmz)f0).h();
                ((pbz)f0).g();
                eli.n(s);
                eli.q(xyy);
                if (!xyy.C()) {
                    ((pbz)f0).D0.b().L0.b("Audience with no ID. appId", q2z.s(s));
                }
                else {
                    final int s11 = xyy.s();
                    final Iterator iterator3 = xyy.y().iterator();
                    while (iterator3.hasNext()) {
                        if (!((gzy)iterator3.next()).G()) {
                            ((pbz)f0).D0.b().L0.c("Event filter with no ID. Audience definition ignored. appId, audienceId", q2z.s(s), (Object)s11);
                            continue Label_0924;
                        }
                    }
                    final Iterator iterator4 = xyy.z().iterator();
                    while (iterator4.hasNext()) {
                        if (!((t0z)iterator4.next()).B()) {
                            ((pbz)f0).D0.b().L0.c("Property filter with no ID. Audience definition ignored. appId, audienceId", q2z.s(s), (Object)s11);
                            continue Label_0924;
                        }
                    }
                    final Iterator iterator5 = xyy.y().iterator();
                    Label_1827: {
                        String s12 = null;
                        Label_1484: {
                            gzy gzy;
                            while (true) {
                                final boolean hasNext = iterator5.hasNext();
                                s12 = "audience_id";
                                if (!hasNext) {
                                    break Label_1484;
                                }
                                gzy = (gzy)iterator5.next();
                                ((zmz)f0).h();
                                ((pbz)f0).g();
                                eli.n(s);
                                eli.q(gzy);
                                if (gzy.y().isEmpty()) {
                                    break;
                                }
                                final byte[] m = gzy.i();
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", s);
                                contentValues.put("audience_id", Integer.valueOf(s11));
                                Integer value;
                                if (gzy.G()) {
                                    value = gzy.t();
                                }
                                else {
                                    value = null;
                                }
                                contentValues.put("filter_id", value);
                                contentValues.put("event_name", gzy.y());
                                Boolean value2;
                                if (gzy.H()) {
                                    value2 = gzy.E();
                                }
                                else {
                                    value2 = null;
                                }
                                contentValues.put("session_scoped", value2);
                                contentValues.put("data", m);
                                try {
                                    if (f0.A().insertWithOnConflict(s5, (String)null, contentValues, 5) != -1L) {
                                        continue;
                                    }
                                    ((pbz)f0).D0.b().I0.b("Failed to insert event filter (got -1). appId", q2z.s(s));
                                    continue;
                                }
                                catch (final SQLiteException ex) {
                                    ((pbz)f0).D0.b().I0.c("Error storing event filter. appId", q2z.s(s), (Object)ex);
                                    break Label_1827;
                                }
                                break Label_1484;
                            }
                            final n1z l2 = ((pbz)f0).D0.b().L0;
                            final Object s13 = q2z.s(s);
                            Integer value3;
                            if (gzy.G()) {
                                value3 = gzy.t();
                            }
                            else {
                                value3 = null;
                            }
                            l2.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", s13, (Object)s11, (Object)String.valueOf(value3));
                            break Label_1827;
                        }
                        final Iterator iterator6 = xyy.z().iterator();
                        final String s14 = s12;
                        final Iterator iterator7 = iterator6;
                        while (iterator7.hasNext()) {
                            final t0z t0z = (t0z)iterator7.next();
                            ((zmz)f0).h();
                            ((pbz)f0).g();
                            eli.n(s);
                            eli.q(t0z);
                            if (t0z.w().isEmpty()) {
                                final n1z l3 = ((pbz)f0).D0.b().L0;
                                final Object s15 = q2z.s(s);
                                Integer value4;
                                if (t0z.B()) {
                                    value4 = t0z.s();
                                }
                                else {
                                    value4 = null;
                                }
                                l3.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", s15, (Object)s11, (Object)String.valueOf(value4));
                                break Label_1827;
                            }
                            final byte[] i2 = ((tfz)t0z).i();
                            final ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", s);
                            contentValues2.put(s14, Integer.valueOf(s11));
                            Integer value5;
                            if (t0z.B()) {
                                value5 = t0z.s();
                            }
                            else {
                                value5 = null;
                            }
                            contentValues2.put("filter_id", value5);
                            contentValues2.put("property_name", t0z.w());
                            Boolean value6;
                            if (t0z.C()) {
                                value6 = t0z.A();
                            }
                            else {
                                value6 = null;
                            }
                            contentValues2.put("session_scoped", value6);
                            contentValues2.put("data", i2);
                            try {
                                if (f0.A().insertWithOnConflict("property_filters", (String)null, contentValues2, 5) != -1L) {
                                    continue;
                                }
                                ((pbz)f0).D0.b().I0.b("Failed to insert property filter (got -1). appId", q2z.s(s));
                            }
                            catch (final SQLiteException ex2) {
                                ((pbz)f0).D0.b().I0.c("Error storing property filter. appId", q2z.s(s), (Object)ex2);
                            }
                            break Label_1827;
                        }
                        continue;
                    }
                    ((zmz)f0).h();
                    ((pbz)f0).g();
                    eli.n(s);
                    final SQLiteDatabase a3 = f0.A();
                    a3.delete("property_filters", s10, new String[] { s, String.valueOf(s11) });
                    a3.delete(s5, s10, new String[] { s, String.valueOf(s11) });
                }
            }
            final ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (final xyy xyy2 : list) {
                Integer value7;
                if (xyy2.C()) {
                    value7 = xyy2.s();
                }
                else {
                    value7 = null;
                }
                list2.add(value7);
            }
            eli.n(s);
            ((zmz)f0).h();
            ((pbz)f0).g();
            final SQLiteDatabase a4 = f0.A();
            Label_2268: {
                try {
                    final long u = f0.u("select count(1) from audience_filter_values where app_id=?", new String[] { s });
                    final int max = Math.max(0, Math.min(2000, ((pbz)f0).D0.J0.n(s, uzy.G)));
                    if (u > max) {
                        final ArrayList<String> list3 = new ArrayList<String>();
                        for (int n2 = 0; n2 < list2.size(); ++n2) {
                            final Integer n3 = list2.get(n2);
                            if (n3 == null) {
                                break Label_2268;
                            }
                            list3.add(Integer.toString(n3));
                        }
                        final String join = TextUtils.join((CharSequence)",", (Iterable)list3);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("(");
                        sb.append(join);
                        sb.append(")");
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                        sb2.append(sb.toString());
                        sb2.append(" order by rowid desc limit -1 offset ?)");
                        a4.delete("audience_filter_values", sb2.toString(), new String[] { s, Integer.toString(max) });
                    }
                }
                catch (final SQLiteException ex3) {
                    ((pbz)f0).D0.b().I0.c("Database error querying filters. appId", q2z.s(s), (Object)ex3);
                }
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            try {
                if (((akz)o).F0) {
                    ((akz)o).l();
                    ((akz)o).F0 = false;
                }
                g3z.G((g3z)((akz)o).E0);
                i = ((akz)o).j().i();
            }
            catch (final RuntimeException ex4) {
                ((pbz)this).D0.b().L0.c("Unable to serialize reduced-size config. Storing full config instead. appId", q2z.s(s), (Object)ex4);
            }
            final zdy f2 = ((xmz)this).E0.F0;
            poz.I((zmz)f2);
            eli.n(s);
            ((pbz)f2).g();
            ((zmz)f2).h();
            final ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", i);
            contentValues3.put("config_last_modified_time", s2);
            if (((pbz)f2).D0.J0.t(null, uzy.I0)) {
                contentValues3.put("e_tag", s3);
            }
            try {
                if (f2.A().update("apps", contentValues3, "app_id = ?", new String[] { s }) == 0L) {
                    ((pbz)f2).D0.b().I0.b("Failed to update remote config (got 0). appId", q2z.s(s));
                }
            }
            catch (final SQLiteException ex5) {
                ((pbz)f2).D0.b().I0.c("Error storing remote config. appId", q2z.s(s), (Object)ex5);
            }
            ((d8q<String, g3z>)this.K0).put(s, (g3z)((akz)o).j());
        }
        finally {
            a.endTransaction();
        }
    }
    
    public final boolean B(final String s) {
        ((pbz)this).g();
        this.m(s);
        return ((d8q<K, Object>)this.H0).getOrDefault(s, null) != null && ((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("app_instance_id");
    }
    
    public final boolean C(final String s) {
        ((pbz)this).g();
        this.m(s);
        final Object orDefault = ((d8q<K, Object>)this.H0).getOrDefault(s, null);
        boolean b = true;
        if (orDefault != null) {
            if (((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("device_model")) {
                return b;
            }
            if (((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("device_info")) {
                return true;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean D(final String s) {
        ((pbz)this).g();
        this.m(s);
        return ((d8q<K, Object>)this.H0).getOrDefault(s, null) != null && ((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("enhanced_user_id");
    }
    
    public final boolean E(final String s) {
        ((pbz)this).g();
        this.m(s);
        return ((d8q<K, Object>)this.H0).getOrDefault(s, null) != null && ((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("google_signals");
    }
    
    public final boolean F(final String s) {
        ((pbz)this).g();
        this.m(s);
        final Object orDefault = ((d8q<K, Object>)this.H0).getOrDefault(s, null);
        boolean b = true;
        if (orDefault != null) {
            if (((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("os_version")) {
                return b;
            }
            if (((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("device_info")) {
                return true;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean G(final String s) {
        ((pbz)this).g();
        this.m(s);
        return ((d8q<K, Object>)this.H0).getOrDefault(s, null) != null && ((d8q<K, Set>)this.H0).getOrDefault(s, null).contains("user_id");
    }
    
    public final void j() {
    }
    
    public final g3z k(final String s, final byte[] array) {
        if (array == null) {
            return g3z.y();
        }
        try {
            final g3z g3z = (g3z)((akz)voz.B((joz)g3z.w(), array)).j();
            final n1z q0 = ((pbz)this).D0.b().Q0;
            final boolean j = g3z.J();
            Object z = null;
            Long value;
            if (j) {
                value = g3z.u();
            }
            else {
                value = null;
            }
            if (g3z.I()) {
                z = g3z.z();
            }
            q0.c("Parsed config. version, gmp_app_id", (Object)value, z);
            return g3z;
        }
        catch (final RuntimeException ex) {
            ((pbz)this).D0.b().L0.c("Unable to merge remote config. appId", q2z.s(s), (Object)ex);
            return g3z.y();
        }
        catch (final zzkm zzkm) {
            ((pbz)this).D0.b().L0.c("Unable to merge remote config. appId", q2z.s(s), (Object)zzkm);
            return g3z.y();
        }
    }
    
    public final void l(final String s, final c3z c3z) {
        final HashSet set = new HashSet();
        final ts0 ts0 = new ts0();
        final ts0 ts2 = new ts0();
        final ts0 ts3 = new ts0();
        qvz.c();
        if (((pbz)this).D0.J0.t(null, uzy.x0)) {
            final Iterator<r2z> iterator = Collections.unmodifiableList((List<? extends r2z>)((g3z)((akz)c3z).E0).C()).iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().t());
            }
        }
        for (int i = 0; i < ((g3z)((akz)c3z).E0).t(); ++i) {
            final v2z v2z = (v2z)((clz)((g3z)((akz)c3z).E0).v(i)).k();
            if (v2z.n().isEmpty()) {
                ((pbz)this).D0.b().L0.a("EventConfig contained null event name");
            }
            else {
                final String n = v2z.n();
                final String x = xa8.x(v2z.n());
                if (!TextUtils.isEmpty((CharSequence)x)) {
                    if (((akz)v2z).F0) {
                        ((akz)v2z).l();
                        ((akz)v2z).F0 = false;
                    }
                    z2z.v((z2z)((akz)v2z).E0, x);
                    if (((akz)c3z).F0) {
                        ((akz)c3z).l();
                        ((akz)c3z).F0 = false;
                    }
                    g3z.F((g3z)((akz)c3z).E0, i, (z2z)((akz)v2z).j());
                }
                if (((z2z)((akz)v2z).E0).y() && ((z2z)((akz)v2z).E0).w()) {
                    ((d8q<String, Boolean>)ts0).put(n, Boolean.TRUE);
                }
                if (((z2z)((akz)v2z).E0).z() && ((z2z)((akz)v2z).E0).x()) {
                    ((d8q<String, Boolean>)ts2).put(v2z.n(), Boolean.TRUE);
                }
                if (((z2z)((akz)v2z).E0).A()) {
                    if (v2z.m() >= 2 && v2z.m() <= 65535) {
                        ((d8q<String, Integer>)ts3).put(v2z.n(), Integer.valueOf(v2z.m()));
                    }
                    else {
                        ((pbz)this).D0.b().L0.c("Invalid sampling rate. Event name, sample rate", (Object)v2z.n(), (Object)v2z.m());
                    }
                }
            }
        }
        ((d8q<String, HashSet>)this.H0).put(s, set);
        ((d8q<String, d8q<String, Boolean>>)this.I0).put(s, (d8q<String, Boolean>)ts0);
        ((d8q<String, d8q<String, Boolean>>)this.J0).put(s, (d8q<String, Boolean>)ts2);
        ((d8q<String, d8q<String, Integer>>)this.L0).put(s, (d8q<String, Integer>)ts3);
    }
    
    public final void m(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   zmz.h:()V
        //     4: aload_0        
        //     5: invokevirtual   pbz.g:()V
        //     8: aload_1        
        //     9: invokestatic    eli.n:(Ljava/lang/String;)Ljava/lang/String;
        //    12: pop            
        //    13: aload_0        
        //    14: getfield        g7z.K0:Lts0;
        //    17: astore_2       
        //    18: aconst_null    
        //    19: astore_3       
        //    20: aload_2        
        //    21: aload_1        
        //    22: aconst_null    
        //    23: invokevirtual   d8q.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    26: ifnonnull       528
        //    29: aload_0        
        //    30: getfield        xmz.E0:Lpoz;
        //    33: getfield        poz.F0:Lzdy;
        //    36: astore          5
        //    38: aload           5
        //    40: invokestatic    poz.I:(Lzmz;)Lzmz;
        //    43: pop            
        //    44: aload_1        
        //    45: invokestatic    eli.n:(Ljava/lang/String;)Ljava/lang/String;
        //    48: pop            
        //    49: aload           5
        //    51: invokevirtual   pbz.g:()V
        //    54: aload           5
        //    56: invokevirtual   zmz.h:()V
        //    59: aload           5
        //    61: invokevirtual   zdy.A:()Landroid/database/sqlite/SQLiteDatabase;
        //    64: ldc_w           "apps"
        //    67: iconst_3       
        //    68: anewarray       Ljava/lang/String;
        //    71: dup            
        //    72: iconst_0       
        //    73: ldc_w           "remote_config"
        //    76: aastore        
        //    77: dup            
        //    78: iconst_1       
        //    79: ldc_w           "config_last_modified_time"
        //    82: aastore        
        //    83: dup            
        //    84: iconst_2       
        //    85: ldc_w           "e_tag"
        //    88: aastore        
        //    89: ldc_w           "app_id=?"
        //    92: iconst_1       
        //    93: anewarray       Ljava/lang/String;
        //    96: dup            
        //    97: iconst_0       
        //    98: aload_1        
        //    99: aastore        
        //   100: aconst_null    
        //   101: aconst_null    
        //   102: aconst_null    
        //   103: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   106: astore_2       
        //   107: aload_2        
        //   108: astore_3       
        //   109: aload_2        
        //   110: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   115: ifne            121
        //   118: goto            295
        //   121: aload_2        
        //   122: astore_3       
        //   123: aload_2        
        //   124: iconst_0       
        //   125: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   130: astore          6
        //   132: aload_2        
        //   133: astore_3       
        //   134: aload_2        
        //   135: iconst_1       
        //   136: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   141: astore          7
        //   143: aload_2        
        //   144: astore_3       
        //   145: aload           5
        //   147: getfield        pbz.D0:Ln8z;
        //   150: getfield        n8z.J0:Lzby;
        //   153: aconst_null    
        //   154: getstatic       uzy.I0:Lqzy;
        //   157: invokevirtual   zby.t:(Ljava/lang/String;Lqzy;)Z
        //   160: ifeq            177
        //   163: aload_2        
        //   164: astore_3       
        //   165: aload_2        
        //   166: iconst_2       
        //   167: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   172: astore          4
        //   174: goto            180
        //   177: aconst_null    
        //   178: astore          4
        //   180: aload_2        
        //   181: astore_3       
        //   182: aload_2        
        //   183: invokeinterface android/database/Cursor.moveToNext:()Z
        //   188: ifeq            214
        //   191: aload_2        
        //   192: astore_3       
        //   193: aload           5
        //   195: getfield        pbz.D0:Ln8z;
        //   198: invokevirtual   n8z.b:()Lq2z;
        //   201: getfield        q2z.I0:Ln1z;
        //   204: ldc_w           "Got multiple records for app config, expected one. appId"
        //   207: aload_1        
        //   208: invokestatic    q2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   211: invokevirtual   n1z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   214: aload           6
        //   216: ifnonnull       222
        //   219: goto            295
        //   222: aload_2        
        //   223: astore_3       
        //   224: new             Lxcy;
        //   227: dup            
        //   228: aload           6
        //   230: aload           7
        //   232: aload           4
        //   234: invokespecial   xcy.<init>:([BLjava/lang/String;Ljava/lang/String;)V
        //   237: astore          4
        //   239: aload_2        
        //   240: invokeinterface android/database/Cursor.close:()V
        //   245: aload           4
        //   247: astore_2       
        //   248: goto            303
        //   251: astore          4
        //   253: goto            266
        //   256: astore_1       
        //   257: aload_3        
        //   258: astore_2       
        //   259: goto            516
        //   262: astore          4
        //   264: aconst_null    
        //   265: astore_2       
        //   266: aload_2        
        //   267: astore_3       
        //   268: aload           5
        //   270: getfield        pbz.D0:Ln8z;
        //   273: invokevirtual   n8z.b:()Lq2z;
        //   276: getfield        q2z.I0:Ln1z;
        //   279: ldc_w           "Error querying remote config. appId"
        //   282: aload_1        
        //   283: invokestatic    q2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   286: aload           4
        //   288: invokevirtual   n1z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   291: aload_2        
        //   292: ifnull          301
        //   295: aload_2        
        //   296: invokeinterface android/database/Cursor.close:()V
        //   301: aconst_null    
        //   302: astore_2       
        //   303: aload_2        
        //   304: ifnonnull       398
        //   307: aload_0        
        //   308: getfield        g7z.G0:Lts0;
        //   311: aload_1        
        //   312: aconst_null    
        //   313: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   316: pop            
        //   317: aload_0        
        //   318: getfield        g7z.I0:Lts0;
        //   321: aload_1        
        //   322: aconst_null    
        //   323: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   326: pop            
        //   327: aload_0        
        //   328: getfield        g7z.H0:Lts0;
        //   331: aload_1        
        //   332: aconst_null    
        //   333: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   336: pop            
        //   337: aload_0        
        //   338: getfield        g7z.J0:Lts0;
        //   341: aload_1        
        //   342: aconst_null    
        //   343: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   346: pop            
        //   347: aload_0        
        //   348: getfield        g7z.K0:Lts0;
        //   351: aload_1        
        //   352: aconst_null    
        //   353: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   356: pop            
        //   357: aload_0        
        //   358: getfield        g7z.O0:Lts0;
        //   361: aload_1        
        //   362: aconst_null    
        //   363: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   366: pop            
        //   367: aload_0        
        //   368: getfield        g7z.P0:Lts0;
        //   371: aload_1        
        //   372: aconst_null    
        //   373: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   376: pop            
        //   377: aload_0        
        //   378: getfield        g7z.Q0:Lts0;
        //   381: aload_1        
        //   382: aconst_null    
        //   383: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   386: pop            
        //   387: aload_0        
        //   388: getfield        g7z.L0:Lts0;
        //   391: aload_1        
        //   392: aconst_null    
        //   393: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   396: pop            
        //   397: return         
        //   398: aload_0        
        //   399: aload_1        
        //   400: aload_2        
        //   401: getfield        xcy.a:[B
        //   404: invokevirtual   g7z.k:(Ljava/lang/String;[B)Lg3z;
        //   407: invokevirtual   clz.k:()Lakz;
        //   410: checkcast       Lc3z;
        //   413: astore_3       
        //   414: aload_0        
        //   415: aload_1        
        //   416: aload_3        
        //   417: invokevirtual   g7z.l:(Ljava/lang/String;Lc3z;)V
        //   420: aload_0        
        //   421: getfield        g7z.G0:Lts0;
        //   424: aload_1        
        //   425: aload_3        
        //   426: invokevirtual   akz.j:()Lclz;
        //   429: checkcast       Lg3z;
        //   432: invokestatic    g7z.o:(Lg3z;)Ljava/util/Map;
        //   435: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   438: pop            
        //   439: aload_0        
        //   440: getfield        g7z.K0:Lts0;
        //   443: aload_1        
        //   444: aload_3        
        //   445: invokevirtual   akz.j:()Lclz;
        //   448: checkcast       Lg3z;
        //   451: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   454: pop            
        //   455: aload_0        
        //   456: aload_1        
        //   457: aload_3        
        //   458: invokevirtual   akz.j:()Lclz;
        //   461: checkcast       Lg3z;
        //   464: invokevirtual   g7z.n:(Ljava/lang/String;Lg3z;)V
        //   467: aload_0        
        //   468: getfield        g7z.O0:Lts0;
        //   471: aload_1        
        //   472: aload_3        
        //   473: getfield        akz.E0:Lclz;
        //   476: checkcast       Lg3z;
        //   479: invokevirtual   g3z.A:()Ljava/lang/String;
        //   482: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   485: pop            
        //   486: aload_0        
        //   487: getfield        g7z.P0:Lts0;
        //   490: aload_1        
        //   491: aload_2        
        //   492: getfield        xcy.b:Ljava/lang/String;
        //   495: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   498: pop            
        //   499: aload_0        
        //   500: getfield        g7z.Q0:Lts0;
        //   503: aload_1        
        //   504: aload_2        
        //   505: getfield        xcy.c:Ljava/lang/String;
        //   508: invokevirtual   d8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   511: pop            
        //   512: return         
        //   513: astore_1       
        //   514: aload_3        
        //   515: astore_2       
        //   516: aload_2        
        //   517: ifnull          526
        //   520: aload_2        
        //   521: invokeinterface android/database/Cursor.close:()V
        //   526: aload_1        
        //   527: athrow         
        //   528: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  59     107    262    266    Landroid/database/sqlite/SQLiteException;
        //  59     107    256    262    Any
        //  109    118    251    256    Landroid/database/sqlite/SQLiteException;
        //  109    118    513    516    Any
        //  123    132    251    256    Landroid/database/sqlite/SQLiteException;
        //  123    132    513    516    Any
        //  134    143    251    256    Landroid/database/sqlite/SQLiteException;
        //  134    143    513    516    Any
        //  145    163    251    256    Landroid/database/sqlite/SQLiteException;
        //  145    163    513    516    Any
        //  165    174    251    256    Landroid/database/sqlite/SQLiteException;
        //  165    174    513    516    Any
        //  182    191    251    256    Landroid/database/sqlite/SQLiteException;
        //  182    191    513    516    Any
        //  193    214    251    256    Landroid/database/sqlite/SQLiteException;
        //  193    214    513    516    Any
        //  224    239    251    256    Landroid/database/sqlite/SQLiteException;
        //  224    239    513    516    Any
        //  268    291    513    516    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void n(final String s, final g3z g3z) {
        if (g3z.s() != 0) {
            ((pbz)this).D0.b().Q0.b("EES programs found", (Object)g3z.s());
            final q9z q9z = g3z.D().get(0);
            try {
                final jny jny = new jny();
                jny.b("internal.remoteConfig", (Callable)new s5z(this, s));
                jny.b("internal.appMetadata", (Callable)new w5z(this, s));
                jny.b("internal.logger", (Callable)new tiz((Object)this, 2));
                jny.a(q9z);
                ((ieg<String, jny>)this.M0).d(s, jny);
                ((pbz)this).D0.b().Q0.c("EES program loaded for appId, activities", (Object)s, (Object)q9z.s().s());
                final Iterator iterator = q9z.s().v().iterator();
                while (iterator.hasNext()) {
                    ((pbz)this).D0.b().Q0.b("EES program activity", (Object)((k9z)iterator.next()).t());
                }
                return;
            }
            catch (final zzd zzd) {
                ((pbz)this).D0.b().I0.b("Failed to load EES program. appId", (Object)s);
                return;
            }
        }
        ((ieg<String, Object>)this.M0).e(s);
    }
    
    public final int p(final String s, final String s2) {
        ((pbz)this).g();
        this.m(s);
        final Map map = ((d8q<K, Map>)this.L0).getOrDefault(s, null);
        if (map == null) {
            return 1;
        }
        final Integer n = (Integer)map.get(s2);
        if (n == null) {
            return 1;
        }
        return n;
    }
    
    public final g3z q(final String s) {
        this.h();
        ((pbz)this).g();
        eli.n(s);
        this.m(s);
        return ((d8q<K, g3z>)this.K0).getOrDefault(s, null);
    }
    
    public final String r(final String s) {
        ((pbz)this).g();
        this.m(s);
        return ((d8q<K, String>)this.O0).getOrDefault(s, null);
    }
    
    public final Set s(final String s) {
        ((pbz)this).g();
        this.m(s);
        return ((d8q<K, Set>)this.H0).getOrDefault(s, null);
    }
    
    public final boolean t(final String s) {
        ((pbz)this).g();
        final g3z q = this.q(s);
        return q != null && q.H();
    }
    
    public final boolean u(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final g3z g3z = ((d8q<K, g3z>)this.K0).getOrDefault(s, null);
        return g3z != null && g3z.s() != 0;
    }
    
    public final boolean v(final String s) {
        return "1".equals(this.w(s, "measurement.upload.blacklist_internal"));
    }
    
    public final String w(final String s, final String s2) {
        ((pbz)this).g();
        this.m(s);
        final Map map = ((d8q<K, Map>)this.G0).getOrDefault(s, null);
        if (map != null) {
            return (String)map.get(s2);
        }
        return null;
    }
    
    public final boolean x(final String s, final String s2) {
        ((pbz)this).g();
        this.m(s);
        if ("ecommerce_purchase".equals(s2)) {
            return true;
        }
        if ("purchase".equals(s2) || "refund".equals(s2)) {
            return true;
        }
        final Map map = ((d8q<K, Map>)this.J0).getOrDefault(s, null);
        if (map != null) {
            final Boolean b = (Boolean)map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final boolean y(final String s, final String s2) {
        ((pbz)this).g();
        this.m(s);
        if (this.v(s) && lpz.V(s2)) {
            return true;
        }
        if (this.z(s) && lpz.W(s2)) {
            return true;
        }
        final Map map = ((d8q<K, Map>)this.I0).getOrDefault(s, null);
        if (map != null) {
            final Boolean b = (Boolean)map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final boolean z(final String s) {
        return "1".equals(this.w(s, "measurement.upload.blacklist_public"));
    }
}
