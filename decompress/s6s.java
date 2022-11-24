import android.os.BaseBundle;
import androidx.work.a;
import java.util.Objects;
import android.os.Build$VERSION;
import android.os.PersistableBundle;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import android.app.job.JobInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import android.app.job.JobScheduler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s6s implements cxo
{
    public static final String J0;
    public final Context F0;
    public final JobScheduler G0;
    public final rsx H0;
    public final r6s I0;
    
    static {
        J0 = jag.g("SystemJobScheduler");
    }
    
    public s6s(final Context f0, final rsx h0) {
        final JobScheduler g0 = (JobScheduler)f0.getSystemService("jobscheduler");
        final r6s i0 = new r6s(f0);
        this.F0 = f0;
        this.H0 = h0;
        this.G0 = g0;
        this.I0 = i0;
    }
    
    public static void a(final JobScheduler jobScheduler, final int n) {
        try {
            jobScheduler.cancel(n);
        }
        finally {
            final Throwable t;
            jag.e().d(s6s.J0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n), t);
        }
    }
    
    public static List<Integer> b(final Context context, final JobScheduler jobScheduler, final String s) {
        final List<JobInfo> f = f(context, jobScheduler);
        if (f == null) {
            return null;
        }
        final ArrayList list = new ArrayList(2);
        for (final JobInfo jobInfo : (ArrayList)f) {
            final gsx g = g(jobInfo);
            if (g != null && s.equals(g.a)) {
                list.add(jobInfo.getId());
            }
        }
        return list;
    }
    
    public static List<JobInfo> f(final Context context, final JobScheduler jobScheduler) {
        List list = null;
        try {
            jobScheduler.getAllPendingJobs();
        }
        finally {
            final Throwable t;
            jag.e().d(s6s.J0, "getAllPendingJobs() is not reliable on this device.", t);
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList<JobInfo>(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add(jobInfo);
            }
        }
        return (List<JobInfo>)list2;
    }
    
    public static gsx g(final JobInfo jobInfo) {
        final PersistableBundle extras = jobInfo.getExtras();
        Label_0043: {
            if (extras == null) {
                break Label_0043;
            }
            try {
                if (((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new gsx(((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID"), ((BaseBundle)extras).getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            }
            catch (final NullPointerException ex) {
                return null;
            }
        }
    }
    
    public final void c(final String s) {
        final List<Integer> b = b(this.F0, this.G0, s);
        if (b != null) {
            final ArrayList list = (ArrayList)b;
            if (!list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    a(this.G0, (int)iterator.next());
                }
                this.H0.c.v().e(s);
            }
        }
    }
    
    public final void d(final ktx... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        s6s.H0:Lrsx;
        //     4: getfield        rsx.c:Landroidx/work/impl/WorkDatabase;
        //     7: astore          5
        //     9: new             Ldh3;
        //    12: dup            
        //    13: aload           5
        //    15: invokespecial   dh3.<init>:(Landroidx/work/impl/WorkDatabase;)V
        //    18: astore          7
        //    20: aload_1        
        //    21: arraylength    
        //    22: istore          4
        //    24: iconst_0       
        //    25: istore_2       
        //    26: iload_2        
        //    27: iload           4
        //    29: if_icmpge       463
        //    32: aload_1        
        //    33: iload_2        
        //    34: aaload         
        //    35: astore          6
        //    37: aload           5
        //    39: invokevirtual   ldn.c:()V
        //    42: aload           5
        //    44: invokevirtual   androidx/work/impl/WorkDatabase.y:()Lltx;
        //    47: aload           6
        //    49: getfield        ktx.a:Ljava/lang/String;
        //    52: invokeinterface ltx.h:(Ljava/lang/String;)Lktx;
        //    57: astore          8
        //    59: aload           8
        //    61: ifnonnull       131
        //    64: invokestatic    jag.e:()Ljag;
        //    67: astore          9
        //    69: getstatic       s6s.J0:Ljava/lang/String;
        //    72: astore          10
        //    74: new             Ljava/lang/StringBuilder;
        //    77: astore          8
        //    79: aload           8
        //    81: invokespecial   java/lang/StringBuilder.<init>:()V
        //    84: aload           8
        //    86: ldc             "Skipping scheduling "
        //    88: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    91: pop            
        //    92: aload           8
        //    94: aload           6
        //    96: getfield        ktx.a:Ljava/lang/String;
        //    99: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   102: pop            
        //   103: aload           8
        //   105: ldc             " because it's no longer in the DB"
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload           9
        //   113: aload           10
        //   115: aload           8
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: invokevirtual   jag.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   123: aload           5
        //   125: invokevirtual   ldn.q:()V
        //   128: goto            444
        //   131: aload           8
        //   133: getfield        ktx.b:Lhsx$a;
        //   136: getstatic       hsx$a.F0:Lhsx$a;
        //   139: if_acmpeq       210
        //   142: invokestatic    jag.e:()Ljag;
        //   145: astore          9
        //   147: getstatic       s6s.J0:Ljava/lang/String;
        //   150: astore          8
        //   152: new             Ljava/lang/StringBuilder;
        //   155: astore          10
        //   157: aload           10
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: aload           10
        //   164: ldc             "Skipping scheduling "
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: pop            
        //   170: aload           10
        //   172: aload           6
        //   174: getfield        ktx.a:Ljava/lang/String;
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: pop            
        //   181: aload           10
        //   183: ldc_w           " because it is no longer enqueued"
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: pop            
        //   190: aload           9
        //   192: aload           8
        //   194: aload           10
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokevirtual   jag.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   202: aload           5
        //   204: invokevirtual   ldn.q:()V
        //   207: goto            444
        //   210: aload           6
        //   212: invokestatic    eg8.O:(Lktx;)Lgsx;
        //   215: astore          8
        //   217: aload           5
        //   219: invokevirtual   androidx/work/impl/WorkDatabase.v:()Lo6s;
        //   222: aload           8
        //   224: invokeinterface o6s.c:(Lgsx;)Ln6s;
        //   229: astore          9
        //   231: aload           9
        //   233: ifnull          245
        //   236: aload           9
        //   238: getfield        n6s.c:I
        //   241: istore_3       
        //   242: goto            272
        //   245: aload_0        
        //   246: getfield        s6s.H0:Lrsx;
        //   249: getfield        rsx.b:Landroidx/work/a;
        //   252: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   255: pop            
        //   256: aload           7
        //   258: aload_0        
        //   259: getfield        s6s.H0:Lrsx;
        //   262: getfield        rsx.b:Landroidx/work/a;
        //   265: getfield        androidx/work/a.g:I
        //   268: invokevirtual   dh3.i:(I)I
        //   271: istore_3       
        //   272: aload           9
        //   274: ifnonnull       315
        //   277: new             Ln6s;
        //   280: astore          9
        //   282: aload           9
        //   284: aload           8
        //   286: getfield        gsx.a:Ljava/lang/String;
        //   289: aload           8
        //   291: getfield        gsx.b:I
        //   294: iload_3        
        //   295: invokespecial   n6s.<init>:(Ljava/lang/String;II)V
        //   298: aload_0        
        //   299: getfield        s6s.H0:Lrsx;
        //   302: getfield        rsx.c:Landroidx/work/impl/WorkDatabase;
        //   305: invokevirtual   androidx/work/impl/WorkDatabase.v:()Lo6s;
        //   308: aload           9
        //   310: invokeinterface o6s.d:(Ln6s;)V
        //   315: aload_0        
        //   316: aload           6
        //   318: iload_3        
        //   319: invokevirtual   s6s.h:(Lktx;I)V
        //   322: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   325: bipush          23
        //   327: if_icmpne       439
        //   330: aload_0        
        //   331: getfield        s6s.F0:Landroid/content/Context;
        //   334: aload_0        
        //   335: getfield        s6s.G0:Landroid/app/job/JobScheduler;
        //   338: aload           6
        //   340: getfield        ktx.a:Ljava/lang/String;
        //   343: invokestatic    s6s.b:(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;
        //   346: astore          8
        //   348: aload           8
        //   350: ifnull          439
        //   353: aload           8
        //   355: checkcast       Ljava/util/ArrayList;
        //   358: astore          8
        //   360: aload           8
        //   362: iload_3        
        //   363: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   366: invokevirtual   java/util/ArrayList.indexOf:(Ljava/lang/Object;)I
        //   369: istore_3       
        //   370: iload_3        
        //   371: iflt            381
        //   374: aload           8
        //   376: iload_3        
        //   377: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   380: pop            
        //   381: aload           8
        //   383: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   386: ifne            405
        //   389: aload           8
        //   391: iconst_0       
        //   392: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   395: checkcast       Ljava/lang/Integer;
        //   398: invokevirtual   java/lang/Integer.intValue:()I
        //   401: istore_3       
        //   402: goto            432
        //   405: aload_0        
        //   406: getfield        s6s.H0:Lrsx;
        //   409: getfield        rsx.b:Landroidx/work/a;
        //   412: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   415: pop            
        //   416: aload           7
        //   418: aload_0        
        //   419: getfield        s6s.H0:Lrsx;
        //   422: getfield        rsx.b:Landroidx/work/a;
        //   425: getfield        androidx/work/a.g:I
        //   428: invokevirtual   dh3.i:(I)I
        //   431: istore_3       
        //   432: aload_0        
        //   433: aload           6
        //   435: iload_3        
        //   436: invokevirtual   s6s.h:(Lktx;I)V
        //   439: aload           5
        //   441: invokevirtual   ldn.q:()V
        //   444: aload           5
        //   446: invokevirtual   ldn.l:()V
        //   449: iinc            2, 1
        //   452: goto            26
        //   455: astore_1       
        //   456: aload           5
        //   458: invokevirtual   ldn.l:()V
        //   461: aload_1        
        //   462: athrow         
        //   463: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  42     59     455    463    Any
        //  64     128    455    463    Any
        //  131    207    455    463    Any
        //  210    231    455    463    Any
        //  236    242    455    463    Any
        //  245    272    455    463    Any
        //  277    315    455    463    Any
        //  315    348    455    463    Any
        //  353    370    455    463    Any
        //  374    381    455    463    Any
        //  381    402    455    463    Any
        //  405    432    455    463    Any
        //  432    439    455    463    Any
        //  439    444    455    463    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public final boolean e() {
        return true;
    }
    
    public final void h(ktx ex, int size) {
        final JobInfo a = this.I0.a((ktx)ex, size);
        final jag e = jag.e();
        final String j0 = s6s.J0;
        final StringBuilder f = ehk.f("Scheduling work ID ");
        f.append(((ktx)ex).a);
        f.append("Job ID ");
        f.append(size);
        e.a(j0, f.toString());
        try {
            if (this.G0.schedule(a) != 0) {
                goto Label_0234;
            }
            final jag e2 = jag.e();
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to schedule work ID ");
            sb.append(((ktx)ex).a);
            e2.h(j0, sb.toString());
            if (((ktx)ex).q && ((ktx)ex).r == 1) {
                ((ktx)ex).q = false;
                jag.e().a(j0, String.format("Scheduling a non-expedited job (work ID %s)", ((ktx)ex).a));
                this.h((ktx)ex, size);
                goto Label_0234;
            }
            goto Label_0234;
        }
        catch (IllegalStateException ex) {
            final List<JobInfo> f2 = f(this.F0, this.G0);
            if (f2 != null) {
                size = ((ArrayList)f2).size();
            }
            else {
                size = 0;
            }
            final Locale default1 = Locale.getDefault();
            final int size2 = this.H0.c.y().e().size();
            final a b = this.H0.b;
            int h;
            if (Build$VERSION.SDK_INT == 23) {
                h = b.h / 2;
            }
            else {
                h = b.h;
            }
            final String format = String.format(default1, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", size, size2, h);
            jag.e().c(s6s.J0, format);
            ex = new IllegalStateException(format, ex);
            Objects.requireNonNull(this.H0.b);
            throw ex;
        }
        finally {
            final jag e3 = jag.e();
            final String j2 = s6s.J0;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to schedule ");
            sb2.append(ex);
            final Throwable t;
            e3.d(j2, sb2.toString(), t);
        }
    }
}
