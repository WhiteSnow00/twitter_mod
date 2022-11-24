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

public final class way implements l3r
{
    public final hky a;
    public final f100 b;
    public final xyz c;
    public final rky d;
    public final Handler e;
    
    public way(final hky a, final f100 b, final xyz c, final rky d) {
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
    
    public final boolean a(final n3r n3r, final Activity activity) throws IntentSender$SendIntentException {
        boolean b;
        if (n3r.h() == 8 && n3r.f() != null) {
            activity.startIntentSenderForResult(n3r.f().getIntentSender(), 1, (Intent)null, 0, 0, 0);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final void b(final o3r o3r) {
        synchronized (this) {
            final f100 b = this.b;
            synchronized (b) {
                ((loy)b).a.l("unregisterListener", new Object[0]);
                ((loy)b).d.remove(o3r);
                ((loy)b).b();
            }
        }
    }
    
    public final void c(final o3r o3r) {
        synchronized (this) {
            final f100 b = this.b;
            synchronized (b) {
                ((loy)b).a.l("registerListener", new Object[0]);
                ((loy)b).d.add(o3r);
                ((loy)b).b();
            }
        }
    }
    
    public final Set<String> d() {
        return this.c.c();
    }
    
    public final crz e(final m3r p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        m3r.b:Ljava/util/ArrayList;
        //     4: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     7: pop            
        //     8: aload_1        
        //     9: getfield        m3r.b:Ljava/util/ArrayList;
        //    12: astore          5
        //    14: aload_0        
        //    15: getfield        way.c:Lxyz;
        //    18: invokevirtual   xyz.d:()Ljava/util/Set;
        //    21: astore_3       
        //    22: aload_3        
        //    23: ifnonnull       29
        //    26: goto            88
        //    29: new             Ljava/util/HashSet;
        //    32: dup            
        //    33: invokespecial   java/util/HashSet.<init>:()V
        //    36: astore          4
        //    38: aload           5
        //    40: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    43: astore          5
        //    45: aload           5
        //    47: invokeinterface java/util/Iterator.hasNext:()Z
        //    52: ifeq            77
        //    55: aload           4
        //    57: aload           5
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: checkcast       Ljava/util/Locale;
        //    67: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //    70: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: goto            45
        //    77: aload_3        
        //    78: aload           4
        //    80: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //    85: ifeq            156
        //    88: aload_1        
        //    89: getfield        m3r.a:Ljava/util/ArrayList;
        //    92: astore_3       
        //    93: aload_0        
        //    94: getfield        way.c:Lxyz;
        //    97: invokevirtual   xyz.c:()Ljava/util/Set;
        //   100: aload_3        
        //   101: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   106: ifeq            156
        //   109: aload_1        
        //   110: getfield        m3r.a:Ljava/util/ArrayList;
        //   113: aload_0        
        //   114: getfield        way.d:Lrky;
        //   117: invokevirtual   rky.a:()Ljava/util/Set;
        //   120: invokestatic    java/util/Collections.disjoint:(Ljava/util/Collection;Ljava/util/Collection;)Z
        //   123: ifne            129
        //   126: goto            156
        //   129: aload_0        
        //   130: getfield        way.e:Landroid/os/Handler;
        //   133: new             Ltbz;
        //   136: dup            
        //   137: aload_0        
        //   138: aload_1        
        //   139: iconst_5       
        //   140: aconst_null    
        //   141: invokespecial   tbz.<init>:(Ljava/lang/Object;Ljava/lang/Object;ILj98;)V
        //   144: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   147: pop            
        //   148: iconst_0       
        //   149: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   152: invokestatic    llg.i:(Ljava/lang/Object;)Lcrz;
        //   155: areturn        
        //   156: aload_0        
        //   157: getfield        way.d:Lrky;
        //   160: astore          4
        //   162: aload_1        
        //   163: getfield        m3r.a:Ljava/util/ArrayList;
        //   166: astore_3       
        //   167: aload           4
        //   169: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   172: pop            
        //   173: ldc             Lrky;.class
        //   175: monitorenter   
        //   176: aload           4
        //   178: invokevirtual   rky.a:()Ljava/util/Set;
        //   181: astore          6
        //   183: new             Ljava/util/HashSet;
        //   186: astore          5
        //   188: aload           5
        //   190: invokespecial   java/util/HashSet.<init>:()V
        //   193: aload           6
        //   195: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   200: astore          7
        //   202: iconst_0       
        //   203: istore_2       
        //   204: aload           7
        //   206: invokeinterface java/util/Iterator.hasNext:()Z
        //   211: ifeq            251
        //   214: aload           7
        //   216: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   221: checkcast       Ljava/lang/String;
        //   224: astore          6
        //   226: aload_3        
        //   227: aload           6
        //   229: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   232: ifeq            240
        //   235: iconst_1       
        //   236: istore_2       
        //   237: goto            204
        //   240: aload           5
        //   242: aload           6
        //   244: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   247: pop            
        //   248: goto            204
        //   251: iload_2        
        //   252: ifeq            279
        //   255: aload           4
        //   257: invokevirtual   rky.b:()Landroid/content/SharedPreferences;
        //   260: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   265: ldc             "modules_to_uninstall_if_emulated"
        //   267: aload           5
        //   269: invokeinterface android/content/SharedPreferences$Editor.putStringSet:(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
        //   274: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   279: ldc             Lrky;.class
        //   281: monitorexit    
        //   282: aload_0        
        //   283: getfield        way.a:Lhky;
        //   286: astore_3       
        //   287: aload_1        
        //   288: getfield        m3r.a:Ljava/util/ArrayList;
        //   291: astore          4
        //   293: aload_1        
        //   294: getfield        m3r.b:Ljava/util/ArrayList;
        //   297: invokestatic    way.g:(Ljava/util/List;)Ljava/util/List;
        //   300: astore_1       
        //   301: aload_3        
        //   302: getfield        hky.b:Ltgy;
        //   305: ifnonnull       345
        //   308: getstatic       hky.c:Lh4a;
        //   311: ldc             "onError(%d)"
        //   313: iconst_1       
        //   314: anewarray       Ljava/lang/Object;
        //   317: dup            
        //   318: iconst_0       
        //   319: bipush          -14
        //   321: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   324: aastore        
        //   325: invokevirtual   h4a.j:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   328: pop            
        //   329: new             Lcom/google/android/play/core/splitinstall/SplitInstallException;
        //   332: dup            
        //   333: bipush          -14
        //   335: invokespecial   com/google/android/play/core/splitinstall/SplitInstallException.<init>:(I)V
        //   338: invokestatic    llg.h:(Ljava/lang/Exception;)Lcrz;
        //   341: astore_1       
        //   342: goto            406
        //   345: getstatic       hky.c:Lh4a;
        //   348: ldc             "startInstall(%s,%s)"
        //   350: iconst_2       
        //   351: anewarray       Ljava/lang/Object;
        //   354: dup            
        //   355: iconst_0       
        //   356: aload           4
        //   358: aastore        
        //   359: dup            
        //   360: iconst_1       
        //   361: aload_1        
        //   362: aastore        
        //   363: invokevirtual   h4a.l:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   366: pop            
        //   367: new             Lffz;
        //   370: dup            
        //   371: invokespecial   ffz.<init>:()V
        //   374: astore          5
        //   376: aload_3        
        //   377: getfield        hky.b:Ltgy;
        //   380: new             Ldey;
        //   383: dup            
        //   384: aload_3        
        //   385: aload           5
        //   387: aload           4
        //   389: aload_1        
        //   390: aload           5
        //   392: invokespecial   dey.<init>:(Lhky;Lffz;Ljava/util/Collection;Ljava/util/Collection;Lffz;)V
        //   395: aload           5
        //   397: invokevirtual   tgy.b:(Lcdy;Lffz;)V
        //   400: aload           5
        //   402: getfield        ffz.a:Lcrz;
        //   405: astore_1       
        //   406: aload_1        
        //   407: areturn        
        //   408: astore_1       
        //   409: ldc             Lrky;.class
        //   411: monitorexit    
        //   412: aload_1        
        //   413: athrow         
        //   414: astore_3       
        //   415: goto            279
        //    Signature:
        //  (Lm3r;)Lcrz;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  176    202    408    414    Any
        //  204    235    408    414    Any
        //  240    248    408    414    Any
        //  255    279    414    418    Ljava/lang/Exception;
        //  255    279    408    414    Any
        //  279    282    408    414    Any
        //  409    412    408    414    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0279:
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
