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

public final class f8z extends ynz implements mcy
{
    public final ws0 I0;
    public final ws0 J0;
    public final ws0 K0;
    public final ws0 L0;
    public final ws0 M0;
    public final ws0 N0;
    public final a7z O0;
    public final v4c P0;
    public final ws0 Q0;
    public final ws0 R0;
    public final ws0 S0;
    
    public f8z(final opz opz) {
        super(opz);
        this.I0 = new ws0();
        this.J0 = new ws0();
        this.K0 = new ws0();
        this.L0 = new ws0();
        this.M0 = new ws0();
        this.Q0 = new ws0();
        this.R0 = new ws0();
        this.S0 = new ws0();
        this.N0 = new ws0();
        this.O0 = new a7z(this);
        this.P0 = new v4c((Object)this);
    }
    
    public static final Map o(final e4z e4z) {
        final ws0 ws0 = new ws0();
        for (final u4z u4z : e4z.E()) {
            ws0.put((Object)u4z.t(), (Object)u4z.u());
        }
        return ws0;
    }
    
    public final void A(final String s, byte[] i, final String s2, final String s3) {
        this.h();
        ((ocz)this).g();
        iuk.z(s);
        a4z a4z = (a4z)this.k(s, i).k();
        this.l(s, a4z);
        this.n(s, (e4z)((zkz)a4z).j());
        this.M0.put((Object)s, (Object)((zkz)a4z).j());
        this.Q0.put((Object)s, (Object)((e4z)((zkz)a4z).G0).A());
        this.R0.put((Object)s, (Object)s2);
        this.S0.put((Object)s, (Object)s3);
        this.I0.put((Object)s, (Object)o((e4z)((zkz)a4z).j()));
        final tey h0 = ((wnz)this).G0.H0;
        opz.I((ynz)h0);
        final ArrayList list = new ArrayList(Collections.unmodifiableList((List<?>)((e4z)((zkz)a4z).G0).B()));
        String s4 = "app_id=? and audience_id=?";
        String s5 = "event_filters";
        String s7;
        a4z a4z2;
        String s8;
        String s9;
        String s10;
        for (int j = 0; j < list.size(); ++j, s9 = s8, s10 = s7, a4z = a4z2, s4 = s9, s5 = s10) {
            final rzy rzy = (rzy)((bmz)list.get(j)).k();
            Object o;
            if (((uzy)((zkz)rzy).G0).t() != 0) {
                o = rzy;
                Object o2;
                for (int k = 0; k < ((uzy)((zkz)o).G0).t(); ++k, o = o2) {
                    final zzy zzy = (zzy)((uzy)((zkz)o).G0).w(k).k();
                    final zzy zzy2 = (zzy)((zkz)zzy).g();
                    final String n0 = lp7.N0(((d0z)((zkz)zzy).G0).y());
                    boolean b;
                    if (n0 != null) {
                        if (((zkz)zzy2).H0) {
                            ((zkz)zzy2).l();
                            ((zkz)zzy2).H0 = false;
                        }
                        d0z.A((d0z)((zkz)zzy2).G0, n0);
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    for (int l = 0; l < ((d0z)((zkz)zzy).G0).s(); ++l) {
                        final k0z w = ((d0z)((zkz)zzy).G0).w(l);
                        final String x0 = iuk.X0(w.w(), jty.J0, jty.K0);
                        if (x0 != null) {
                            final h0z h0z = (h0z)((bmz)w).k();
                            if (h0z.H0) {
                                h0z.l();
                                h0z.H0 = false;
                            }
                            k0z.x((k0z)h0z.G0, x0);
                            final k0z k0z = (k0z)h0z.j();
                            if (((zkz)zzy2).H0) {
                                ((zkz)zzy2).l();
                                ((zkz)zzy2).H0 = false;
                            }
                            d0z.B((d0z)((zkz)zzy2).G0, l, k0z);
                            b = true;
                        }
                    }
                    o2 = o;
                    if (b) {
                        if (((zkz)o).H0) {
                            ((zkz)o).l();
                            ((zkz)o).H0 = false;
                        }
                        uzy.B((uzy)((zkz)o).G0, k, (d0z)((zkz)zzy2).j());
                        list.set(j, (Object)((zkz)rzy).j());
                        o2 = rzy;
                    }
                }
                final String s6 = s4;
                s7 = s5;
                a4z2 = a4z;
                s8 = s6;
            }
            else {
                final a4z a4z3 = a4z;
                s8 = s4;
                s7 = s5;
                final rzy rzy2 = rzy;
                a4z2 = a4z3;
                o = rzy2;
            }
            if (((uzy)((zkz)o).G0).u() != 0) {
                zkz zkz;
                for (int n2 = 0; n2 < ((uzy)((zkz)o).G0).u(); ++n2, o = zkz) {
                    final r1z x2 = ((uzy)((zkz)o).G0).x(n2);
                    final String x3 = iuk.X0(x2.w(), ix.P0, ix.Q0);
                    zkz = (zkz)o;
                    if (x3 != null) {
                        final n1z n1z = (n1z)((bmz)x2).k();
                        if (((zkz)n1z).H0) {
                            ((zkz)n1z).l();
                            ((zkz)n1z).H0 = false;
                        }
                        r1z.x((r1z)((zkz)n1z).G0, x3);
                        if (((zkz)o).H0) {
                            ((zkz)o).l();
                            ((zkz)o).H0 = false;
                        }
                        uzy.A((uzy)((zkz)o).G0, n2, (r1z)((zkz)n1z).j());
                        list.set(j, (Object)((zkz)rzy).j());
                        zkz = (zkz)rzy;
                    }
                }
            }
        }
        ((ynz)h0).h();
        ((ocz)h0).g();
        iuk.z(s);
        final SQLiteDatabase a = h0.A();
        a.beginTransaction();
        try {
            ((ynz)h0).h();
            ((ocz)h0).g();
            iuk.z(s);
            final SQLiteDatabase a2 = h0.A();
            a2.delete("property_filters", "app_id=?", new String[] { s });
            a2.delete(s5, "app_id=?", new String[] { s });
            final Iterator iterator = list.iterator();
            final String s11 = s4;
            final Iterator iterator2 = iterator;
        Label_0924:
            while (iterator2.hasNext()) {
                final uzy uzy = (uzy)iterator2.next();
                ((ynz)h0).h();
                ((ocz)h0).g();
                iuk.z(s);
                iuk.C((Object)uzy);
                if (!uzy.C()) {
                    ((ocz)h0).F0.b().N0.b("Audience with no ID. appId", o3z.s(s));
                }
                else {
                    final int s12 = uzy.s();
                    final Iterator iterator3 = uzy.y().iterator();
                    while (iterator3.hasNext()) {
                        if (!((d0z)iterator3.next()).G()) {
                            ((ocz)h0).F0.b().N0.c("Event filter with no ID. Audience definition ignored. appId, audienceId", o3z.s(s), (Object)s12);
                            continue Label_0924;
                        }
                    }
                    final Iterator iterator4 = uzy.z().iterator();
                    while (iterator4.hasNext()) {
                        if (!((r1z)iterator4.next()).B()) {
                            ((ocz)h0).F0.b().N0.c("Property filter with no ID. Audience definition ignored. appId, audienceId", o3z.s(s), (Object)s12);
                            continue Label_0924;
                        }
                    }
                    final Iterator iterator5 = uzy.y().iterator();
                    Label_1827: {
                        String s13 = null;
                        Label_1484: {
                            d0z d0z;
                            while (true) {
                                final boolean hasNext = iterator5.hasNext();
                                s13 = "audience_id";
                                if (!hasNext) {
                                    break Label_1484;
                                }
                                d0z = (d0z)iterator5.next();
                                ((ynz)h0).h();
                                ((ocz)h0).g();
                                iuk.z(s);
                                iuk.C((Object)d0z);
                                if (d0z.y().isEmpty()) {
                                    break;
                                }
                                final byte[] m = ((sgz)d0z).i();
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", s);
                                contentValues.put("audience_id", Integer.valueOf(s12));
                                Integer value;
                                if (d0z.G()) {
                                    value = d0z.t();
                                }
                                else {
                                    value = null;
                                }
                                contentValues.put("filter_id", value);
                                contentValues.put("event_name", d0z.y());
                                Boolean value2;
                                if (d0z.H()) {
                                    value2 = d0z.E();
                                }
                                else {
                                    value2 = null;
                                }
                                contentValues.put("session_scoped", value2);
                                contentValues.put("data", m);
                                try {
                                    if (h0.A().insertWithOnConflict(s5, (String)null, contentValues, 5) != -1L) {
                                        continue;
                                    }
                                    ((ocz)h0).F0.b().K0.b("Failed to insert event filter (got -1). appId", o3z.s(s));
                                    continue;
                                }
                                catch (final SQLiteException ex) {
                                    ((ocz)h0).F0.b().K0.c("Error storing event filter. appId", o3z.s(s), (Object)ex);
                                    break Label_1827;
                                }
                                break Label_1484;
                            }
                            final l2z n3 = ((ocz)h0).F0.b().N0;
                            final Object s14 = o3z.s(s);
                            Integer value3;
                            if (d0z.G()) {
                                value3 = d0z.t();
                            }
                            else {
                                value3 = null;
                            }
                            n3.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", s14, (Object)s12, (Object)String.valueOf(value3));
                            break Label_1827;
                        }
                        final Iterator iterator6 = uzy.z().iterator();
                        final String s15 = s13;
                        final Iterator iterator7 = iterator6;
                        while (iterator7.hasNext()) {
                            final r1z r1z = (r1z)iterator7.next();
                            ((ynz)h0).h();
                            ((ocz)h0).g();
                            iuk.z(s);
                            iuk.C((Object)r1z);
                            if (r1z.w().isEmpty()) {
                                final l2z n4 = ((ocz)h0).F0.b().N0;
                                final Object s16 = o3z.s(s);
                                Integer value4;
                                if (r1z.B()) {
                                    value4 = r1z.s();
                                }
                                else {
                                    value4 = null;
                                }
                                n4.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", s16, (Object)s12, (Object)String.valueOf(value4));
                                break Label_1827;
                            }
                            final byte[] i2 = ((sgz)r1z).i();
                            final ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", s);
                            contentValues2.put(s15, Integer.valueOf(s12));
                            Integer value5;
                            if (r1z.B()) {
                                value5 = r1z.s();
                            }
                            else {
                                value5 = null;
                            }
                            contentValues2.put("filter_id", value5);
                            contentValues2.put("property_name", r1z.w());
                            Boolean value6;
                            if (r1z.C()) {
                                value6 = r1z.A();
                            }
                            else {
                                value6 = null;
                            }
                            contentValues2.put("session_scoped", value6);
                            contentValues2.put("data", i2);
                            try {
                                if (h0.A().insertWithOnConflict("property_filters", (String)null, contentValues2, 5) != -1L) {
                                    continue;
                                }
                                ((ocz)h0).F0.b().K0.b("Failed to insert property filter (got -1). appId", o3z.s(s));
                            }
                            catch (final SQLiteException ex2) {
                                ((ocz)h0).F0.b().K0.c("Error storing property filter. appId", o3z.s(s), (Object)ex2);
                            }
                            break Label_1827;
                        }
                        continue;
                    }
                    ((ynz)h0).h();
                    ((ocz)h0).g();
                    iuk.z(s);
                    final SQLiteDatabase a3 = h0.A();
                    a3.delete("property_filters", s11, new String[] { s, String.valueOf(s12) });
                    a3.delete(s5, s11, new String[] { s, String.valueOf(s12) });
                }
            }
            final ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (final uzy uzy2 : list) {
                Integer value7;
                if (uzy2.C()) {
                    value7 = uzy2.s();
                }
                else {
                    value7 = null;
                }
                list2.add(value7);
            }
            iuk.z(s);
            ((ynz)h0).h();
            ((ocz)h0).g();
            final SQLiteDatabase a4 = h0.A();
            Label_2268: {
                try {
                    final long u = h0.u("select count(1) from audience_filter_values where app_id=?", new String[] { s });
                    final int max = Math.max(0, Math.min(2000, ((ocz)h0).F0.L0.n(s, s0z.G)));
                    if (u > max) {
                        final ArrayList<String> list3 = new ArrayList<String>();
                        for (int n5 = 0; n5 < list2.size(); ++n5) {
                            final Integer n6 = list2.get(n5);
                            if (n6 == null) {
                                break Label_2268;
                            }
                            list3.add(Integer.toString(n6));
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
                    ((ocz)h0).F0.b().K0.c("Database error querying filters. appId", o3z.s(s), (Object)ex3);
                }
            }
            a.setTransactionSuccessful();
            a.endTransaction();
            try {
                if (((zkz)a4z).H0) {
                    ((zkz)a4z).l();
                    ((zkz)a4z).H0 = false;
                }
                e4z.G((e4z)((zkz)a4z).G0);
                i = ((sgz)((zkz)a4z).j()).i();
            }
            catch (final RuntimeException ex4) {
                ((ocz)this).F0.b().N0.c("Unable to serialize reduced-size config. Storing full config instead. appId", o3z.s(s), (Object)ex4);
            }
            final tey h2 = ((wnz)this).G0.H0;
            opz.I((ynz)h2);
            iuk.z(s);
            ((ocz)h2).g();
            ((ynz)h2).h();
            final ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", i);
            contentValues3.put("config_last_modified_time", s2);
            if (((ocz)h2).F0.L0.t((String)null, s0z.I0)) {
                contentValues3.put("e_tag", s3);
            }
            try {
                if (h2.A().update("apps", contentValues3, "app_id = ?", new String[] { s }) == 0L) {
                    ((ocz)h2).F0.b().K0.b("Failed to update remote config (got 0). appId", o3z.s(s));
                }
            }
            catch (final SQLiteException ex5) {
                ((ocz)h2).F0.b().K0.c("Error storing remote config. appId", o3z.s(s), (Object)ex5);
            }
            this.M0.put((Object)s, (Object)((zkz)a4z).j());
        }
        finally {
            a.endTransaction();
        }
    }
    
    public final boolean B(final String s) {
        ((ocz)this).g();
        this.m(s);
        return this.J0.getOrDefault((Object)s, (Object)null) != null && ((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("app_instance_id");
    }
    
    public final boolean C(final String s) {
        ((ocz)this).g();
        this.m(s);
        final Object orDefault = this.J0.getOrDefault((Object)s, (Object)null);
        boolean b = true;
        if (orDefault != null) {
            if (((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("device_model")) {
                return b;
            }
            if (((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("device_info")) {
                return true;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean D(final String s) {
        ((ocz)this).g();
        this.m(s);
        return this.J0.getOrDefault((Object)s, (Object)null) != null && ((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("enhanced_user_id");
    }
    
    public final boolean E(final String s) {
        ((ocz)this).g();
        this.m(s);
        return this.J0.getOrDefault((Object)s, (Object)null) != null && ((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("google_signals");
    }
    
    public final boolean F(final String s) {
        ((ocz)this).g();
        this.m(s);
        final Object orDefault = this.J0.getOrDefault((Object)s, (Object)null);
        boolean b = true;
        if (orDefault != null) {
            if (((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("os_version")) {
                return b;
            }
            if (((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("device_info")) {
                return true;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean G(final String s) {
        ((ocz)this).g();
        this.m(s);
        return this.J0.getOrDefault((Object)s, (Object)null) != null && ((Set)this.J0.getOrDefault((Object)s, (Object)null)).contains("user_id");
    }
    
    public final void j() {
    }
    
    public final e4z k(final String s, final byte[] array) {
        if (array == null) {
            return e4z.y();
        }
        try {
            final e4z e4z = (e4z)((zkz)upz.B((ipz)e4z.w(), array)).j();
            final l2z s2 = ((ocz)this).F0.b().S0;
            final boolean j = e4z.J();
            Object z = null;
            Long value;
            if (j) {
                value = e4z.u();
            }
            else {
                value = null;
            }
            if (e4z.I()) {
                z = e4z.z();
            }
            s2.c("Parsed config. version, gmp_app_id", (Object)value, z);
            return e4z;
        }
        catch (final RuntimeException ex) {
            ((ocz)this).F0.b().N0.c("Unable to merge remote config. appId", o3z.s(s), (Object)ex);
            return e4z.y();
        }
        catch (final zzkm zzkm) {
            ((ocz)this).F0.b().N0.c("Unable to merge remote config. appId", o3z.s(s), (Object)zzkm);
            return e4z.y();
        }
    }
    
    public final void l(final String s, final a4z a4z) {
        final HashSet set = new HashSet();
        final ws0 ws0 = new ws0();
        final ws0 ws2 = new ws0();
        final ws0 ws3 = new ws0();
        pwz.c();
        if (((ocz)this).F0.L0.t((String)null, s0z.x0)) {
            final Iterator<p3z> iterator = Collections.unmodifiableList((List<? extends p3z>)((e4z)((zkz)a4z).G0).C()).iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().t());
            }
        }
        for (int i = 0; i < ((e4z)((zkz)a4z).G0).t(); ++i) {
            final t3z t3z = (t3z)((bmz)((e4z)((zkz)a4z).G0).v(i)).k();
            if (t3z.n().isEmpty()) {
                ((ocz)this).F0.b().N0.a("EventConfig contained null event name");
            }
            else {
                final String n = t3z.n();
                final String n2 = lp7.N0(t3z.n());
                if (!TextUtils.isEmpty((CharSequence)n2)) {
                    if (((zkz)t3z).H0) {
                        ((zkz)t3z).l();
                        ((zkz)t3z).H0 = false;
                    }
                    x3z.v((x3z)((zkz)t3z).G0, n2);
                    if (((zkz)a4z).H0) {
                        ((zkz)a4z).l();
                        ((zkz)a4z).H0 = false;
                    }
                    e4z.F((e4z)((zkz)a4z).G0, i, (x3z)((zkz)t3z).j());
                }
                if (((x3z)((zkz)t3z).G0).y() && ((x3z)((zkz)t3z).G0).w()) {
                    ws0.put((Object)n, (Object)Boolean.TRUE);
                }
                if (((x3z)((zkz)t3z).G0).z() && ((x3z)((zkz)t3z).G0).x()) {
                    ws2.put((Object)t3z.n(), (Object)Boolean.TRUE);
                }
                if (((x3z)((zkz)t3z).G0).A()) {
                    if (t3z.m() >= 2 && t3z.m() <= 65535) {
                        ws3.put((Object)t3z.n(), (Object)t3z.m());
                    }
                    else {
                        ((ocz)this).F0.b().N0.c("Invalid sampling rate. Event name, sample rate", (Object)t3z.n(), (Object)t3z.m());
                    }
                }
            }
        }
        this.J0.put((Object)s, (Object)set);
        this.K0.put((Object)s, (Object)ws0);
        this.L0.put((Object)s, (Object)ws2);
        this.N0.put((Object)s, (Object)ws3);
    }
    
    public final void m(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   ynz.h:()V
        //     4: aload_0        
        //     5: invokevirtual   ocz.g:()V
        //     8: aload_1        
        //     9: invokestatic    iuk.z:(Ljava/lang/String;)Ljava/lang/String;
        //    12: pop            
        //    13: aload_0        
        //    14: getfield        f8z.M0:Lws0;
        //    17: astore_2       
        //    18: aconst_null    
        //    19: astore_3       
        //    20: aload_2        
        //    21: aload_1        
        //    22: aconst_null    
        //    23: invokevirtual   z8q.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    26: ifnonnull       524
        //    29: aload_0        
        //    30: getfield        wnz.G0:Lopz;
        //    33: getfield        opz.H0:Ltey;
        //    36: astore          5
        //    38: aload           5
        //    40: invokestatic    opz.I:(Lynz;)Lynz;
        //    43: pop            
        //    44: aload_1        
        //    45: invokestatic    iuk.z:(Ljava/lang/String;)Ljava/lang/String;
        //    48: pop            
        //    49: aload           5
        //    51: invokevirtual   ocz.g:()V
        //    54: aload           5
        //    56: invokevirtual   ynz.h:()V
        //    59: aload           5
        //    61: invokevirtual   tey.A:()Landroid/database/sqlite/SQLiteDatabase;
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
        //   118: goto            293
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
        //   147: getfield        ocz.F0:Lm9z;
        //   150: getfield        m9z.L0:Ltcy;
        //   153: aconst_null    
        //   154: getstatic       s0z.I0:Ln0z;
        //   157: invokevirtual   tcy.t:(Ljava/lang/String;Ln0z;)Z
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
        //   195: getfield        ocz.F0:Lm9z;
        //   198: invokevirtual   m9z.b:()Lo3z;
        //   201: getfield        o3z.K0:Ll2z;
        //   204: ldc_w           "Got multiple records for app config, expected one. appId"
        //   207: aload_1        
        //   208: invokestatic    o3z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   211: invokevirtual   l2z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   214: aload           6
        //   216: ifnonnull       222
        //   219: goto            293
        //   222: aload_2        
        //   223: astore_3       
        //   224: new             Lrdy;
        //   227: dup            
        //   228: aload           6
        //   230: aload           7
        //   232: aload           4
        //   234: invokespecial   rdy.<init>:([BLjava/lang/String;Ljava/lang/String;)V
        //   237: astore          4
        //   239: aload_2        
        //   240: invokeinterface android/database/Cursor.close:()V
        //   245: aload           4
        //   247: astore_2       
        //   248: goto            301
        //   251: astore          4
        //   253: goto            264
        //   256: astore_1       
        //   257: goto            512
        //   260: astore          4
        //   262: aconst_null    
        //   263: astore_2       
        //   264: aload_2        
        //   265: astore_3       
        //   266: aload           5
        //   268: getfield        ocz.F0:Lm9z;
        //   271: invokevirtual   m9z.b:()Lo3z;
        //   274: getfield        o3z.K0:Ll2z;
        //   277: ldc_w           "Error querying remote config. appId"
        //   280: aload_1        
        //   281: invokestatic    o3z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //   284: aload           4
        //   286: invokevirtual   l2z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   289: aload_2        
        //   290: ifnull          299
        //   293: aload_2        
        //   294: invokeinterface android/database/Cursor.close:()V
        //   299: aconst_null    
        //   300: astore_2       
        //   301: aload_2        
        //   302: ifnonnull       396
        //   305: aload_0        
        //   306: getfield        f8z.I0:Lws0;
        //   309: aload_1        
        //   310: aconst_null    
        //   311: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   314: pop            
        //   315: aload_0        
        //   316: getfield        f8z.K0:Lws0;
        //   319: aload_1        
        //   320: aconst_null    
        //   321: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   324: pop            
        //   325: aload_0        
        //   326: getfield        f8z.J0:Lws0;
        //   329: aload_1        
        //   330: aconst_null    
        //   331: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   334: pop            
        //   335: aload_0        
        //   336: getfield        f8z.L0:Lws0;
        //   339: aload_1        
        //   340: aconst_null    
        //   341: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   344: pop            
        //   345: aload_0        
        //   346: getfield        f8z.M0:Lws0;
        //   349: aload_1        
        //   350: aconst_null    
        //   351: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   354: pop            
        //   355: aload_0        
        //   356: getfield        f8z.Q0:Lws0;
        //   359: aload_1        
        //   360: aconst_null    
        //   361: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   364: pop            
        //   365: aload_0        
        //   366: getfield        f8z.R0:Lws0;
        //   369: aload_1        
        //   370: aconst_null    
        //   371: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   374: pop            
        //   375: aload_0        
        //   376: getfield        f8z.S0:Lws0;
        //   379: aload_1        
        //   380: aconst_null    
        //   381: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   384: pop            
        //   385: aload_0        
        //   386: getfield        f8z.N0:Lws0;
        //   389: aload_1        
        //   390: aconst_null    
        //   391: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   394: pop            
        //   395: return         
        //   396: aload_0        
        //   397: aload_1        
        //   398: aload_2        
        //   399: getfield        rdy.a:[B
        //   402: invokevirtual   f8z.k:(Ljava/lang/String;[B)Le4z;
        //   405: invokevirtual   bmz.k:()Lzkz;
        //   408: checkcast       La4z;
        //   411: astore_3       
        //   412: aload_0        
        //   413: aload_1        
        //   414: aload_3        
        //   415: invokevirtual   f8z.l:(Ljava/lang/String;La4z;)V
        //   418: aload_0        
        //   419: getfield        f8z.I0:Lws0;
        //   422: aload_1        
        //   423: aload_3        
        //   424: invokevirtual   zkz.j:()Lbmz;
        //   427: checkcast       Le4z;
        //   430: invokestatic    f8z.o:(Le4z;)Ljava/util/Map;
        //   433: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   436: pop            
        //   437: aload_0        
        //   438: getfield        f8z.M0:Lws0;
        //   441: aload_1        
        //   442: aload_3        
        //   443: invokevirtual   zkz.j:()Lbmz;
        //   446: checkcast       Le4z;
        //   449: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   452: pop            
        //   453: aload_0        
        //   454: aload_1        
        //   455: aload_3        
        //   456: invokevirtual   zkz.j:()Lbmz;
        //   459: checkcast       Le4z;
        //   462: invokevirtual   f8z.n:(Ljava/lang/String;Le4z;)V
        //   465: aload_0        
        //   466: getfield        f8z.Q0:Lws0;
        //   469: aload_1        
        //   470: aload_3        
        //   471: getfield        zkz.G0:Lbmz;
        //   474: checkcast       Le4z;
        //   477: invokevirtual   e4z.A:()Ljava/lang/String;
        //   480: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   483: pop            
        //   484: aload_0        
        //   485: getfield        f8z.R0:Lws0;
        //   488: aload_1        
        //   489: aload_2        
        //   490: getfield        rdy.b:Ljava/lang/String;
        //   493: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   496: pop            
        //   497: aload_0        
        //   498: getfield        f8z.S0:Lws0;
        //   501: aload_1        
        //   502: aload_2        
        //   503: getfield        rdy.c:Ljava/lang/String;
        //   506: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   509: pop            
        //   510: return         
        //   511: astore_1       
        //   512: aload_3        
        //   513: ifnull          522
        //   516: aload_3        
        //   517: invokeinterface android/database/Cursor.close:()V
        //   522: aload_1        
        //   523: athrow         
        //   524: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  59     107    260    264    Landroid/database/sqlite/SQLiteException;
        //  59     107    256    260    Any
        //  109    118    251    256    Landroid/database/sqlite/SQLiteException;
        //  109    118    511    512    Any
        //  123    132    251    256    Landroid/database/sqlite/SQLiteException;
        //  123    132    511    512    Any
        //  134    143    251    256    Landroid/database/sqlite/SQLiteException;
        //  134    143    511    512    Any
        //  145    163    251    256    Landroid/database/sqlite/SQLiteException;
        //  145    163    511    512    Any
        //  165    174    251    256    Landroid/database/sqlite/SQLiteException;
        //  165    174    511    512    Any
        //  182    191    251    256    Landroid/database/sqlite/SQLiteException;
        //  182    191    511    512    Any
        //  193    214    251    256    Landroid/database/sqlite/SQLiteException;
        //  193    214    511    512    Any
        //  224    239    251    256    Landroid/database/sqlite/SQLiteException;
        //  224    239    511    512    Any
        //  266    289    511    512    Any
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
    
    public final void n(final String s, final e4z e4z) {
        if (e4z.s() != 0) {
            ((ocz)this).F0.b().S0.b("EES programs found", (Object)e4z.s());
            final paz paz = e4z.D().get(0);
            try {
                final doy doy = new doy();
                doy.b("internal.remoteConfig", (Callable)new q6z(this, s));
                doy.b("internal.appMetadata", (Callable)new u6z(this, s));
                doy.b("internal.logger", (Callable)new sjz(this, 2));
                doy.a(paz);
                ((cfg<String, doy>)this.O0).d(s, doy);
                ((ocz)this).F0.b().S0.c("EES program loaded for appId, activities", (Object)s, (Object)paz.s().s());
                final Iterator iterator = paz.s().v().iterator();
                while (iterator.hasNext()) {
                    ((ocz)this).F0.b().S0.b("EES program activity", (Object)((jaz)iterator.next()).t());
                }
                return;
            }
            catch (final zzd zzd) {
                ((ocz)this).F0.b().K0.b("Failed to load EES program. appId", (Object)s);
                return;
            }
        }
        ((cfg<String, Object>)this.O0).e(s);
    }
    
    public final int p(final String s, final String s2) {
        ((ocz)this).g();
        this.m(s);
        final Map map = (Map)this.N0.getOrDefault((Object)s, (Object)null);
        if (map == null) {
            return 1;
        }
        final Integer n = map.get(s2);
        if (n == null) {
            return 1;
        }
        return n;
    }
    
    public final e4z q(final String s) {
        this.h();
        ((ocz)this).g();
        iuk.z(s);
        this.m(s);
        return (e4z)this.M0.getOrDefault((Object)s, (Object)null);
    }
    
    public final String r(final String s) {
        ((ocz)this).g();
        this.m(s);
        return (String)this.Q0.getOrDefault((Object)s, (Object)null);
    }
    
    public final Set s(final String s) {
        ((ocz)this).g();
        this.m(s);
        return (Set)this.J0.getOrDefault((Object)s, (Object)null);
    }
    
    public final boolean t(final String s) {
        ((ocz)this).g();
        final e4z q = this.q(s);
        return q != null && q.H();
    }
    
    public final boolean u(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final e4z e4z = (e4z)this.M0.getOrDefault((Object)s, (Object)null);
        return e4z != null && e4z.s() != 0;
    }
    
    public final boolean v(final String s) {
        return "1".equals(this.w(s, "measurement.upload.blacklist_internal"));
    }
    
    public final String w(final String s, final String s2) {
        ((ocz)this).g();
        this.m(s);
        final Map map = (Map)this.I0.getOrDefault((Object)s, (Object)null);
        if (map != null) {
            return (String)map.get(s2);
        }
        return null;
    }
    
    public final boolean x(final String s, final String s2) {
        ((ocz)this).g();
        this.m(s);
        if ("ecommerce_purchase".equals(s2)) {
            return true;
        }
        if ("purchase".equals(s2) || "refund".equals(s2)) {
            return true;
        }
        final Map map = (Map)this.L0.getOrDefault((Object)s, (Object)null);
        if (map != null) {
            final Boolean b = map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final boolean y(final String s, final String s2) {
        ((ocz)this).g();
        this.m(s);
        if (this.v(s) && kqz.V(s2)) {
            return true;
        }
        if (this.z(s) && kqz.W(s2)) {
            return true;
        }
        final Map map = (Map)this.K0.getOrDefault((Object)s, (Object)null);
        if (map != null) {
            final Boolean b = map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final boolean z(final String s) {
        return "1".equals(this.w(s, "measurement.upload.blacklist_public"));
    }
}
