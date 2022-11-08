// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import androidx.work.a;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import android.util.Log;
import android.app.ApplicationExitInfo;
import android.app.ActivityManager;
import java.util.Objects;
import android.app.job.JobInfo;
import java.util.HashSet;
import java.util.ArrayList;
import android.app.job.JobScheduler;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Intent;
import android.app.PendingIntent;
import java.util.concurrent.TimeUnit;
import android.content.Context;

public final class ForceStopRunnable implements Runnable
{
    public static final String G0;
    public static final long H0;
    public final Context C0;
    public final irx D0;
    public final kvk E0;
    public int F0;
    
    static {
        G0 = y9g.g("ForceStopRunnable");
        H0 = TimeUnit.DAYS.toMillis(3650L);
    }
    
    public ForceStopRunnable(final Context context, final irx d0) {
        this.C0 = context.getApplicationContext();
        this.D0 = d0;
        this.E0 = d0.g;
        this.F0 = 0;
    }
    
    public static PendingIntent b(final Context context, final int n) {
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class)BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, n);
    }
    
    @SuppressLint({ "ClassVerificationFailure" })
    public static void d(final Context context) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n;
        if (Build$VERSION.SDK_INT >= 31) {
            n = 167772160;
        }
        else {
            n = 134217728;
        }
        final PendingIntent b = b(context, n);
        final long currentTimeMillis = System.currentTimeMillis();
        final long h0 = ForceStopRunnable.H0;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + h0, b);
        }
    }
    
    public final void a() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        int n2 = 0;
        Label_0324: {
            Label_0321: {
                if (sdk_INT >= 23) {
                    final Context c0 = this.C0;
                    final irx d0 = this.D0;
                    final String g0 = f5s.G0;
                    final JobScheduler jobScheduler = (JobScheduler)c0.getSystemService("jobscheduler");
                    final List f = f5s.f(c0, jobScheduler);
                    final List b2 = d0.c.v().b();
                    int size;
                    if (f != null) {
                        size = ((ArrayList)f).size();
                    }
                    else {
                        size = 0;
                    }
                    final HashSet set = new HashSet<String>(size);
                    if (f != null) {
                        final ArrayList list = (ArrayList)f;
                        if (!list.isEmpty()) {
                            for (final JobInfo jobInfo : list) {
                                final wqx g2 = f5s.g(jobInfo);
                                if (g2 != null) {
                                    set.add(g2.a);
                                }
                                else {
                                    f5s.a(jobScheduler, jobInfo.getId());
                                }
                            }
                        }
                    }
                    final Iterator iterator2 = b2.iterator();
                    while (true) {
                        while (iterator2.hasNext()) {
                            if (!set.contains(iterator2.next())) {
                                y9g.e().a(f5s.G0, "Reconciling jobs");
                                final int n = 1;
                                n2 = n;
                                if (n != 0) {
                                    final WorkDatabase c2 = d0.c;
                                    ((gcn)c2).c();
                                    try {
                                        final csx y = c2.y();
                                        final Iterator iterator3 = b2.iterator();
                                        while (iterator3.hasNext()) {
                                            y.o((String)iterator3.next(), -1L);
                                        }
                                        ((gcn)c2).q();
                                        ((gcn)c2).l();
                                        n2 = n;
                                        break Label_0324;
                                    }
                                    finally {
                                        ((gcn)c2).l();
                                    }
                                    break Label_0321;
                                }
                                break Label_0324;
                            }
                        }
                        final int n = false ? 1 : 0;
                        continue;
                    }
                }
            }
            n2 = 0;
        }
        Object o = this.D0.c;
        final csx y2 = ((WorkDatabase)o).y();
        final rrx x = ((WorkDatabase)o).x();
        ((gcn)o).c();
        try {
            final List t = y2.t();
            final boolean b3 = t != null && !t.isEmpty();
            if (b3) {
                for (final bsx bsx : t) {
                    y2.d(xqx.a.C0, bsx.a);
                    y2.o(bsx.a, -1L);
                }
            }
            x.c();
            ((gcn)o).q();
            ((gcn)o).l();
            final boolean b4 = b3 || n2;
            o = this.D0.g.a.t().a("reschedule_needed");
            final boolean b5 = o != null && (long)o == 1L;
            long longValue = 0L;
            if (b5) {
                y9g.e().a(ForceStopRunnable.G0, "Rescheduling Workers.");
                this.D0.l();
                o = this.D0.g;
                Objects.requireNonNull(o);
                ((kvk)o).a.t().b(new vuk("reschedule_needed", Long.valueOf(0L)));
            }
            else {
                int n3 = 536870912;
                int n4 = 0;
                Label_0850: {
                    try {
                        final int sdk_INT2 = Build$VERSION.SDK_INT;
                        if (sdk_INT2 >= 31) {
                            n3 = 570425344;
                        }
                        o = b(this.C0, n3);
                        if (sdk_INT2 >= 30) {
                            if (o != null) {
                                ((PendingIntent)o).cancel();
                            }
                            o = ((ActivityManager)this.C0.getSystemService("activity")).getHistoricalProcessExitReasons((String)null, 0, 0);
                            if (o != null && !((List)o).isEmpty()) {
                                final Long a = this.E0.a.t().a("last_force_stop_ms");
                                if (a != null) {
                                    longValue = a;
                                }
                                for (int i = 0; i < ((List)o).size(); ++i) {
                                    final ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo)((List)o).get(i);
                                    if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= longValue) {
                                        n4 = (b ? 1 : 0);
                                        break Label_0850;
                                    }
                                }
                            }
                        }
                        else if (o == null) {
                            d(this.C0);
                            n4 = (b ? 1 : 0);
                            break Label_0850;
                        }
                        n4 = 0;
                        break Label_0850;
                    }
                    catch (final IllegalArgumentException o) {}
                    catch (final SecurityException ex) {}
                    final y9g e = y9g.e();
                    final String g3 = ForceStopRunnable.G0;
                    n4 = (b ? 1 : 0);
                    if (((y9g$a)e).c <= 5) {
                        Log.w(g3, "Ignoring exception", (Throwable)o);
                        n4 = (b ? 1 : 0);
                    }
                }
                if (n4 != 0) {
                    y9g.e().a(ForceStopRunnable.G0, "Application was force-stopped, rescheduling.");
                    this.D0.l();
                    final kvk e2 = this.E0;
                    final long currentTimeMillis = System.currentTimeMillis();
                    Objects.requireNonNull(e2);
                    o = new vuk("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                    e2.a.t().b((vuk)o);
                }
                else if (b4) {
                    y9g.e().a(ForceStopRunnable.G0, "Found unfinished work, scheduling it.");
                    o = this.D0;
                    zvo.a(((irx)o).b, ((irx)o).c, (List)((irx)o).e);
                }
            }
        }
        finally {
            ((gcn)o).l();
        }
    }
    
    public final boolean c() {
        final a b = this.D0.b;
        Objects.requireNonNull(b);
        if (TextUtils.isEmpty((CharSequence)null)) {
            y9g.e().a(ForceStopRunnable.G0, "The default process name was not specified.");
            return true;
        }
        final boolean a = i0l.a(this.C0, b);
        final y9g e = y9g.e();
        final String g0 = ForceStopRunnable.G0;
        final StringBuilder sb = new StringBuilder();
        sb.append("Is default app process = ");
        sb.append(a);
        e.a(g0, sb.toString());
        return a;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   androidx/work/impl/utils/ForceStopRunnable.c:()Z
        //     4: istore_1       
        //     5: iload_1        
        //     6: ifne            17
        //     9: aload_0        
        //    10: getfield        androidx/work/impl/utils/ForceStopRunnable.D0:Lirx;
        //    13: invokevirtual   irx.k:()V
        //    16: return         
        //    17: aload_0        
        //    18: getfield        androidx/work/impl/utils/ForceStopRunnable.C0:Landroid/content/Context;
        //    21: invokestatic    dli.S:(Landroid/content/Context;)V
        //    24: invokestatic    y9g.e:()Ly9g;
        //    27: getstatic       androidx/work/impl/utils/ForceStopRunnable.G0:Ljava/lang/String;
        //    30: ldc_w           "Performing cleanup operations."
        //    33: invokevirtual   y9g.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    36: aload_0        
        //    37: invokevirtual   androidx/work/impl/utils/ForceStopRunnable.a:()V
        //    40: aload_0        
        //    41: getfield        androidx/work/impl/utils/ForceStopRunnable.D0:Lirx;
        //    44: invokevirtual   irx.k:()V
        //    47: return         
        //    48: astore_2       
        //    49: goto            73
        //    52: astore_2       
        //    53: goto            73
        //    56: astore_2       
        //    57: goto            73
        //    60: astore_2       
        //    61: goto            73
        //    64: astore_2       
        //    65: goto            73
        //    68: astore_2       
        //    69: goto            73
        //    72: astore_2       
        //    73: aload_0        
        //    74: getfield        androidx/work/impl/utils/ForceStopRunnable.F0:I
        //    77: iconst_1       
        //    78: iadd           
        //    79: istore_3       
        //    80: aload_0        
        //    81: iload_3        
        //    82: putfield        androidx/work/impl/utils/ForceStopRunnable.F0:I
        //    85: iload_3        
        //    86: iconst_3       
        //    87: if_icmpge       169
        //    90: iload_3        
        //    91: i2l            
        //    92: lstore          4
        //    94: invokestatic    y9g.e:()Ly9g;
        //    97: astore          6
        //    99: getstatic       androidx/work/impl/utils/ForceStopRunnable.G0:Ljava/lang/String;
        //   102: astore          7
        //   104: new             Ljava/lang/StringBuilder;
        //   107: astore          8
        //   109: aload           8
        //   111: invokespecial   java/lang/StringBuilder.<init>:()V
        //   114: aload           8
        //   116: ldc_w           "Retrying after "
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: pop            
        //   123: aload           8
        //   125: lload           4
        //   127: ldc2_w          300
        //   130: lmul           
        //   131: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   134: pop            
        //   135: aload           6
        //   137: aload           7
        //   139: aload           8
        //   141: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   144: aload_2        
        //   145: invokevirtual   y9g.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   148: aload_0        
        //   149: getfield        androidx/work/impl/utils/ForceStopRunnable.F0:I
        //   152: istore_3       
        //   153: iload_3        
        //   154: i2l            
        //   155: lstore          4
        //   157: lload           4
        //   159: ldc2_w          300
        //   162: lmul           
        //   163: invokestatic    java/lang/Thread.sleep:(J)V
        //   166: goto            17
        //   169: invokestatic    y9g.e:()Ly9g;
        //   172: getstatic       androidx/work/impl/utils/ForceStopRunnable.G0:Ljava/lang/String;
        //   175: ldc_w           "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
        //   178: aload_2        
        //   179: invokevirtual   y9g.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   182: new             Ljava/lang/IllegalStateException;
        //   185: astore          8
        //   187: aload           8
        //   189: ldc_w           "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
        //   192: aload_2        
        //   193: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   196: aload_0        
        //   197: getfield        androidx/work/impl/utils/ForceStopRunnable.D0:Lirx;
        //   200: getfield        irx.b:Landroidx/work/a;
        //   203: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   206: pop            
        //   207: aload           8
        //   209: athrow         
        //   210: astore          8
        //   212: invokestatic    y9g.e:()Ly9g;
        //   215: getstatic       androidx/work/impl/utils/ForceStopRunnable.G0:Ljava/lang/String;
        //   218: ldc_w           "Unexpected SQLite exception during migrations"
        //   221: invokevirtual   y9g.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   224: new             Ljava/lang/IllegalStateException;
        //   227: astore_2       
        //   228: aload_2        
        //   229: ldc_w           "Unexpected SQLite exception during migrations"
        //   232: aload           8
        //   234: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   237: aload_0        
        //   238: getfield        androidx/work/impl/utils/ForceStopRunnable.D0:Lirx;
        //   241: getfield        irx.b:Landroidx/work/a;
        //   244: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   247: pop            
        //   248: aload_2        
        //   249: athrow         
        //   250: astore_2       
        //   251: aload_0        
        //   252: getfield        androidx/work/impl/utils/ForceStopRunnable.D0:Lirx;
        //   255: invokevirtual   irx.k:()V
        //   258: aload_2        
        //   259: athrow         
        //   260: astore_2       
        //   261: goto            17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      5      250    260    Any
        //  17     24     210    250    Landroid/database/sqlite/SQLiteException;
        //  17     24     250    260    Any
        //  24     36     250    260    Any
        //  36     40     72     73     Landroid/database/sqlite/SQLiteCantOpenDatabaseException;
        //  36     40     68     72     Landroid/database/sqlite/SQLiteDiskIOException;
        //  36     40     64     68     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  36     40     60     64     Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  36     40     56     60     Landroid/database/sqlite/SQLiteTableLockedException;
        //  36     40     52     56     Landroid/database/sqlite/SQLiteConstraintException;
        //  36     40     48     52     Landroid/database/sqlite/SQLiteAccessPermException;
        //  36     40     250    260    Any
        //  73     85     250    260    Any
        //  94     153    250    260    Any
        //  157    166    260    264    Ljava/lang/InterruptedException;
        //  157    166    250    260    Any
        //  169    210    250    260    Any
        //  212    250    250    260    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0169:
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
    
    public static class BroadcastReceiver extends android.content.BroadcastReceiver
    {
        public static final String a;
        
        static {
            a = y9g.g("ForceStopRunnable$Rcvr");
        }
        
        public final void onReceive(final Context context, final Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                final y9g e = y9g.e();
                final String a = BroadcastReceiver.a;
                if (((y9g$a)e).c <= 2) {
                    Log.v(a, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.d(context);
            }
        }
    }
}
