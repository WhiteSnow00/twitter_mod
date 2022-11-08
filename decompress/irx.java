import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.Iterator;
import java.util.UUID;
import java.util.Collection;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.concurrent.Executor;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.util.Objects;
import android.content.BroadcastReceiver$PendingResult;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irx extends brx
{
    public static irx k;
    public static irx l;
    public static final Object m;
    public Context a;
    public a b;
    public WorkDatabase c;
    public lbs d;
    public List<rvo> e;
    public l0l f;
    public kvk g;
    public boolean h;
    public BroadcastReceiver$PendingResult i;
    public final bwt j;
    
    static {
        y9g.g("WorkManagerImpl");
        irx.k = null;
        irx.l = null;
        m = new Object();
    }
    
    public irx(Context applicationContext, final a b, final lbs d) {
        final boolean boolean1 = applicationContext.getResources().getBoolean(2131034122);
        final Context applicationContext2 = applicationContext.getApplicationContext();
        final jkp a = ((krx)d).a;
        Objects.requireNonNull(WorkDatabase.Companion);
        zzd.f((Object)applicationContext2, "context");
        zzd.f((Object)a, "queryExecutor");
        final l0l l0l = null;
        gcn$a a2;
        if (boolean1) {
            a2 = new gcn$a(applicationContext2, (Class)WorkDatabase.class, (String)null);
            a2.h = true;
        }
        else {
            a2 = pzm.a(applicationContext2, (Class)WorkDatabase.class, "androidx.work.workdb");
            a2.g = (uyr.c)new lqx(applicationContext2);
        }
        a2.e = a;
        final nc4 a3 = nc4.a;
        if (a2.d == null) {
            a2.d = new ArrayList();
        }
        a2.d.add(a3);
        a2.a(new gah[] { (gah)kah.c });
        a2.a(new gah[] { new lpm(applicationContext2, 2, 3) });
        a2.a(new gah[] { lah.c });
        a2.a(new gah[] { mah.c });
        a2.a(new gah[] { new lpm(applicationContext2, 5, 6) });
        a2.a(new gah[] { (gah)nah.c });
        a2.a(new gah[] { (gah)oah.c });
        a2.a(new gah[] { pah.c });
        a2.a(new gah[] { new lrx(applicationContext2) });
        a2.a(new gah[] { new lpm(applicationContext2, 10, 11) });
        a2.a(new gah[] { (gah)hah.c });
        a2.a(new gah[] { (gah)iah.c });
        a2.a(new gah[] { jah.c });
        a2.c();
        final WorkDatabase c = (WorkDatabase)a2.b();
        final Context applicationContext3 = applicationContext.getApplicationContext();
        final y9g$a b2 = new y9g$a(b.f);
        Object f = y9g.a;
        synchronized (f) {
            y9g.b = (y9g)b2;
            monitorexit(f);
            final bwt j = new bwt(applicationContext3, d);
            this.j = j;
            f = zvo.a;
            if (Build$VERSION.SDK_INT >= 23) {
                f = new f5s(applicationContext3, this);
                hrj.a(applicationContext3, SystemJobService.class, true);
                y9g.e().a(zvo.a, "Created SystemJobScheduler and enabled SystemJobService");
            }
            else {
                try {
                    final rvo rvo = (rvo)Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext3);
                    y9g.e().a(zvo.a, "Created androidx.work.impl.background.gcm.GcmScheduler");
                }
                finally {
                    y9g.e().b(zvo.a, "Unable to create GCM Scheduler", (Throwable)f);
                    f = l0l;
                }
                if (f == null) {
                    f = new p4s(applicationContext3);
                    hrj.a(applicationContext3, SystemAlarmService.class, true);
                    y9g.e().a(zvo.a, "Created SystemAlarmScheduler");
                }
            }
            final List<rvo> list = Arrays.asList((rvo)f, (rvo)new r8c(applicationContext3, b, j, this));
            f = new l0l(applicationContext, b, d, c, (List)list);
            applicationContext = applicationContext.getApplicationContext();
            this.a = applicationContext;
            this.b = b;
            this.d = d;
            this.c = c;
            this.e = list;
            this.f = (l0l)f;
            this.g = new kvk(c);
            this.h = false;
            if (Build$VERSION.SDK_INT >= 24 && irx.irx$a.a(applicationContext)) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((krx)this.d).a((Runnable)new ForceStopRunnable(applicationContext, this));
        }
    }
    
    public static irx i(Context applicationContext) {
        synchronized (irx.m) {
            synchronized (irx.m) {
                irx irx = irx.k;
                if (irx != null) {
                    monitorexit(irx.m);
                }
                else {
                    irx = irx.l;
                    monitorexit(irx.m);
                }
                irx i = irx;
                if (irx == null) {
                    applicationContext = applicationContext.getApplicationContext();
                    if (!(applicationContext instanceof a.b)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    j(applicationContext, ((a.b)applicationContext).a());
                    i = i(applicationContext);
                }
                return i;
            }
        }
    }
    
    public static void j(final Context context, final a a) {
        synchronized (irx.m) {
            final irx k = irx.k;
            if (k != null && irx.l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (k == null) {
                final Context applicationContext = context.getApplicationContext();
                if (irx.l == null) {
                    irx.l = new irx(applicationContext, a, (lbs)new krx((Executor)a.b));
                }
                irx.k = irx.l;
            }
        }
    }
    
    public final uau a(final String s, final hga hga, final List<jlj> list) {
        final hga d0 = hga.D0;
        if (!((List)hga).isEmpty()) {
            return new kqx(this, s, d0, (List<? extends xrx>)hga);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }
    
    public final gnj b(final String s) {
        final ag3 ag3 = new ag3(this, s);
        ((krx)this.d).a((Runnable)ag3);
        return (gnj)((cg3)ag3).C0;
    }
    
    public final gnj c(final String s) {
        final bg3 bg3 = new bg3(this, s, true);
        ((krx)this.d).a((Runnable)bg3);
        return (gnj)((cg3)bg3).C0;
    }
    
    public final gnj d(final List<? extends xrx> list) {
        if (!list.isEmpty()) {
            return new kqx(this, null, hga.D0, list, null).c();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    
    public final gnj e(final String s, final gga gga, final l3k l3k) {
        if (gga == gga.E0) {
            zzd.f((Object)l3k, "workRequest");
            final inj inj = new inj();
            ((krx)this.d).a.execute((Runnable)new lsx(this, s, inj, (otb)new nsx((xrx)l3k, this, s, inj), (xrx)l3k));
            return (gnj)inj;
        }
        hga hga;
        if (gga == gga.D0) {
            hga = hga.D0;
        }
        else {
            hga = hga.C0;
        }
        return new kqx(this, s, hga, Collections.singletonList(l3k)).c();
    }
    
    public final gnj g(final String s, final hga hga, final List<jlj> list) {
        return new kqx(this, s, hga, list).c();
    }
    
    public final LiveData<List<xqx>> h(final vrx vrx) {
        final cxl u = this.c.u();
        final ArrayList list = new ArrayList();
        final StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        final ArrayList d = vrx.d;
        zzd.e((Object)d, "states");
        final boolean empty = d.isEmpty();
        final String s = " AND";
        String s2;
        if (empty ^ true) {
            final ArrayList d2 = vrx.d;
            zzd.e((Object)d2, "states");
            final ArrayList list2 = new ArrayList<Integer>(kr4.h1((Iterable)d2, 10));
            for (final xqx.a a : d2) {
                zzd.c((Object)a);
                list2.add(dml.u0(a));
            }
            sb.append(" WHERE state IN (");
            bp7.g(sb, list2.size());
            sb.append(")");
            list.addAll(list2);
            s2 = " AND";
        }
        else {
            s2 = " WHERE";
        }
        final ArrayList a2 = vrx.a;
        zzd.e((Object)a2, "ids");
        String s3 = s2;
        if (a2.isEmpty() ^ true) {
            final ArrayList a3 = vrx.a;
            zzd.e((Object)a3, "ids");
            final ArrayList list3 = new ArrayList<String>(kr4.h1((Iterable)a3, 10));
            final Iterator iterator2 = a3.iterator();
            while (iterator2.hasNext()) {
                list3.add(((UUID)iterator2.next()).toString());
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append(" id IN (");
            sb.append(sb2.toString());
            bp7.g(sb, vrx.a.size());
            sb.append(")");
            list.addAll(list3);
            s3 = " AND";
        }
        final ArrayList c = vrx.c;
        zzd.e((Object)c, "tags");
        String s4;
        if (c.isEmpty() ^ true) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s3);
            sb3.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            sb.append(sb3.toString());
            bp7.g(sb, vrx.c.size());
            sb.append("))");
            final ArrayList c2 = vrx.c;
            zzd.e((Object)c2, "tags");
            list.addAll(c2);
            s4 = s;
        }
        else {
            s4 = s3;
        }
        final ArrayList b = vrx.b;
        zzd.e((Object)b, "uniqueWorkNames");
        if (b.isEmpty() ^ true) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s4);
            sb4.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            sb.append(sb4.toString());
            bp7.g(sb, vrx.b.size());
            sb.append("))");
            final ArrayList b2 = vrx.b;
            zzd.e((Object)b2, "uniqueWorkNames");
            list.addAll(b2);
        }
        sb.append(";");
        final String string = sb.toString();
        zzd.e((Object)string, "builder.toString()");
        final Object[] array = list.toArray(new Object[0]);
        zzd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final LiveData a4 = u.a((wyr)new t8q(string, array));
        final asx v = bsx.v;
        final lbs d3 = this.d;
        final Object o = new Object();
        final q2h q2h = new q2h();
        final pof pof = new pof(d3, o, (xub)v, q2h);
        final q2h$a q2h$a = new q2h$a(a4, (xbj)pof);
        final q2h$a q2h$a2 = (q2h$a)q2h.l.j((Object)a4, (Object)q2h$a);
        if (q2h$a2 != null && q2h$a2.D0 != pof) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (q2h$a2 == null) {
            if (((LiveData)q2h).d()) {
                a4.f((xbj)q2h$a);
            }
        }
        return (LiveData<List<xqx>>)q2h;
    }
    
    public final void k() {
        synchronized (irx.m) {
            this.h = true;
            final BroadcastReceiver$PendingResult i = this.i;
            if (i != null) {
                i.finish();
                this.i = null;
            }
        }
    }
    
    public final void l() {
        if (Build$VERSION.SDK_INT >= 23) {
            final Context a = this.a;
            final String g0 = f5s.G0;
            final JobScheduler jobScheduler = (JobScheduler)a.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                final List f = f5s.f(a, jobScheduler);
                if (f != null) {
                    final ArrayList list = (ArrayList)f;
                    if (!list.isEmpty()) {
                        final Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            f5s.a(jobScheduler, ((JobInfo)iterator.next()).getId());
                        }
                    }
                }
            }
        }
        this.c.y().m();
        zvo.a(this.b, this.c, (List)this.e);
    }
    
    public final void m(final e7r e7r) {
        ((krx)this.d).a((Runnable)new vhr(this, e7r, false));
    }
}
