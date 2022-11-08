import java.util.Collections;
import java.util.Set;
import android.content.IntentSender$SendIntentException;
import android.content.Intent;
import android.app.Activity;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m9y implements t1r
{
    public final wiy a;
    public final uzz b;
    public final mxz c;
    public final hjy d;
    public final Handler e;
    
    public m9y(final wiy a, final uzz b, final mxz c, final hjy d) {
        this.e = new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static List<String> g(final List<Locale> list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((Locale)iterator.next()).toLanguageTag());
        }
        return list2;
    }
    
    public final boolean a(final v1r v1r, final Activity activity) throws IntentSender$SendIntentException {
        boolean b;
        if (v1r.h() == 8 && v1r.f() != null) {
            activity.startIntentSenderForResult(v1r.f().getIntentSender(), 1, (Intent)null, 0, 0, 0);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final void b(final w1r w1r) {
        synchronized (this) {
            final uzz b = this.b;
            synchronized (b) {
                ((bny)b).a.n("unregisterListener", new Object[0]);
                ((bny)b).d.remove(w1r);
                ((bny)b).b();
            }
        }
    }
    
    public final void c(final w1r w1r) {
        synchronized (this) {
            final uzz b = this.b;
            synchronized (b) {
                ((bny)b).a.n("registerListener", new Object[0]);
                ((bny)b).d.add(w1r);
                ((bny)b).b();
            }
        }
    }
    
    public final Set<String> d() {
        return this.c.c();
    }
    
    public final ppz e(final u1r p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        u1r.b:Ljava/util/ArrayList;
        //     4: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     7: pop            
        //     8: aload_1        
        //     9: getfield        u1r.b:Ljava/util/ArrayList;
        //    12: astore_2       
        //    13: aload_0        
        //    14: getfield        m9y.c:Lmxz;
        //    17: invokevirtual   mxz.d:()Ljava/util/Set;
        //    20: astore_3       
        //    21: aload_3        
        //    22: ifnonnull       28
        //    25: goto            83
        //    28: new             Ljava/util/HashSet;
        //    31: dup            
        //    32: invokespecial   java/util/HashSet.<init>:()V
        //    35: astore          4
        //    37: aload_2        
        //    38: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    41: astore_2       
        //    42: aload_2        
        //    43: invokeinterface java/util/Iterator.hasNext:()Z
        //    48: ifeq            72
        //    51: aload           4
        //    53: aload_2        
        //    54: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    59: checkcast       Ljava/util/Locale;
        //    62: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //    65: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    68: pop            
        //    69: goto            42
        //    72: aload_3        
        //    73: aload           4
        //    75: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //    80: ifeq            151
        //    83: aload_1        
        //    84: getfield        u1r.a:Ljava/util/ArrayList;
        //    87: astore_3       
        //    88: aload_0        
        //    89: getfield        m9y.c:Lmxz;
        //    92: invokevirtual   mxz.c:()Ljava/util/Set;
        //    95: aload_3        
        //    96: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   101: ifeq            151
        //   104: aload_1        
        //   105: getfield        u1r.a:Ljava/util/ArrayList;
        //   108: aload_0        
        //   109: getfield        m9y.d:Lhjy;
        //   112: invokevirtual   hjy.a:()Ljava/util/Set;
        //   115: invokestatic    java/util/Collections.disjoint:(Ljava/util/Collection;Ljava/util/Collection;)Z
        //   118: ifne            124
        //   121: goto            151
        //   124: aload_0        
        //   125: getfield        m9y.e:Landroid/os/Handler;
        //   128: new             Lfaz;
        //   131: dup            
        //   132: aload_0        
        //   133: aload_1        
        //   134: iconst_5       
        //   135: aconst_null    
        //   136: invokespecial   faz.<init>:(Ljava/lang/Object;Ljava/lang/Object;ILw48;)V
        //   139: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   142: pop            
        //   143: iconst_0       
        //   144: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   147: invokestatic    m0n.V0:(Ljava/lang/Object;)Lppz;
        //   150: areturn        
        //   151: aload_0        
        //   152: getfield        m9y.d:Lhjy;
        //   155: astore_2       
        //   156: aload_1        
        //   157: getfield        u1r.a:Ljava/util/ArrayList;
        //   160: astore_3       
        //   161: aload_2        
        //   162: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   165: pop            
        //   166: ldc             Lhjy;.class
        //   168: monitorenter   
        //   169: aload_2        
        //   170: invokevirtual   hjy.a:()Ljava/util/Set;
        //   173: astore          5
        //   175: new             Ljava/util/HashSet;
        //   178: astore          4
        //   180: aload           4
        //   182: invokespecial   java/util/HashSet.<init>:()V
        //   185: aload           5
        //   187: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   192: astore          6
        //   194: iconst_0       
        //   195: istore          7
        //   197: aload           6
        //   199: invokeinterface java/util/Iterator.hasNext:()Z
        //   204: ifeq            245
        //   207: aload           6
        //   209: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   214: checkcast       Ljava/lang/String;
        //   217: astore          5
        //   219: aload_3        
        //   220: aload           5
        //   222: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   225: ifeq            234
        //   228: iconst_1       
        //   229: istore          7
        //   231: goto            197
        //   234: aload           4
        //   236: aload           5
        //   238: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   241: pop            
        //   242: goto            197
        //   245: iload           7
        //   247: ifeq            273
        //   250: aload_2        
        //   251: invokevirtual   hjy.b:()Landroid/content/SharedPreferences;
        //   254: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   259: ldc             "modules_to_uninstall_if_emulated"
        //   261: aload           4
        //   263: invokeinterface android/content/SharedPreferences$Editor.putStringSet:(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
        //   268: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   273: ldc             Lhjy;.class
        //   275: monitorexit    
        //   276: aload_0        
        //   277: getfield        m9y.a:Lwiy;
        //   280: astore_3       
        //   281: aload_1        
        //   282: getfield        u1r.a:Ljava/util/ArrayList;
        //   285: astore          4
        //   287: aload_1        
        //   288: getfield        u1r.b:Ljava/util/ArrayList;
        //   291: invokestatic    m9y.g:(Ljava/util/List;)Ljava/util/List;
        //   294: astore_1       
        //   295: aload_3        
        //   296: getfield        wiy.b:Ljfy;
        //   299: ifnonnull       339
        //   302: getstatic       wiy.c:Lv3a;
        //   305: ldc             "onError(%d)"
        //   307: iconst_1       
        //   308: anewarray       Ljava/lang/Object;
        //   311: dup            
        //   312: iconst_0       
        //   313: bipush          -14
        //   315: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   318: aastore        
        //   319: invokevirtual   v3a.k:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   322: pop            
        //   323: new             Lcom/google/android/play/core/splitinstall/SplitInstallException;
        //   326: dup            
        //   327: bipush          -14
        //   329: invokespecial   com/google/android/play/core/splitinstall/SplitInstallException.<init>:(I)V
        //   332: invokestatic    m0n.T0:(Ljava/lang/Exception;)Lppz;
        //   335: astore_1       
        //   336: goto            395
        //   339: getstatic       wiy.c:Lv3a;
        //   342: ldc             "startInstall(%s,%s)"
        //   344: iconst_2       
        //   345: anewarray       Ljava/lang/Object;
        //   348: dup            
        //   349: iconst_0       
        //   350: aload           4
        //   352: aastore        
        //   353: dup            
        //   354: iconst_1       
        //   355: aload_1        
        //   356: aastore        
        //   357: invokevirtual   v3a.n:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   360: pop            
        //   361: new             Lsdz;
        //   364: dup            
        //   365: invokespecial   sdz.<init>:()V
        //   368: astore_2       
        //   369: aload_3        
        //   370: getfield        wiy.b:Ljfy;
        //   373: new             Ltcy;
        //   376: dup            
        //   377: aload_3        
        //   378: aload_2        
        //   379: aload           4
        //   381: aload_1        
        //   382: aload_2        
        //   383: invokespecial   tcy.<init>:(Lwiy;Lsdz;Ljava/util/Collection;Ljava/util/Collection;Lsdz;)V
        //   386: aload_2        
        //   387: invokevirtual   jfy.b:(Lsby;Lsdz;)V
        //   390: aload_2        
        //   391: getfield        sdz.a:Lppz;
        //   394: astore_1       
        //   395: aload_1        
        //   396: areturn        
        //   397: astore_1       
        //   398: ldc             Lhjy;.class
        //   400: monitorexit    
        //   401: aload_1        
        //   402: athrow         
        //   403: astore_3       
        //   404: goto            273
        //    Signature:
        //  (Lu1r;)Lppz;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  169    194    397    403    Any
        //  197    228    397    403    Any
        //  234    242    397    403    Any
        //  250    273    403    407    Ljava/lang/Exception;
        //  250    273    397    403    Any
        //  273    276    397    403    Any
        //  398    401    397    403    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0273:
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
    
    public final Set<String> f() {
        Set<Object> set;
        if ((set = this.c.d()) == null) {
            set = Collections.emptySet();
        }
        return (Set<String>)set;
    }
}
