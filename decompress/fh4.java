import android.view.View;
import com.google.android.gms.common.api.a;
import java.util.Map;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.accounts.Account;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fh4
{
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<com.google.android.gms.common.api.a<?>, g1y> d;
    public final View e;
    public final String f;
    public final String g;
    public final t5q h;
    public Integer i;
    
    public fh4(final Account p0, final Set<Scope> p1, final Map<com.google.android.gms.common.api.a<?>, g1y> p2, final int p3, final View p4, final String p5, final String p6, final t5q p7, final boolean p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        fh4.a:Landroid/accounts/Account;
        //     9: aload_2        
        //    10: ifnonnull       20
        //    13: invokestatic    java/util/Collections.emptySet:()Ljava/util/Set;
        //    16: astore_2       
        //    17: goto            25
        //    20: aload_2        
        //    21: invokestatic    java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
        //    24: astore_2       
        //    25: aload_0        
        //    26: aload_2        
        //    27: putfield        fh4.b:Ljava/util/Set;
        //    30: aload_3        
        //    31: astore_1       
        //    32: aload_3        
        //    33: ifnonnull       40
        //    36: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //    39: astore_1       
        //    40: aload_0        
        //    41: aload_1        
        //    42: putfield        fh4.d:Ljava/util/Map;
        //    45: aload_0        
        //    46: aconst_null    
        //    47: putfield        fh4.e:Landroid/view/View;
        //    50: aload_0        
        //    51: aload           4
        //    53: putfield        fh4.f:Ljava/lang/String;
        //    56: aload_0        
        //    57: aload           5
        //    59: putfield        fh4.g:Ljava/lang/String;
        //    62: aload           6
        //    64: astore_3       
        //    65: aload           6
        //    67: ifnonnull       74
        //    70: getstatic       t5q.C0:Lt5q;
        //    73: astore_3       
        //    74: aload_0        
        //    75: aload_3        
        //    76: putfield        fh4.h:Lt5q;
        //    79: new             Ljava/util/HashSet;
        //    82: dup            
        //    83: aload_2        
        //    84: invokespecial   java/util/HashSet.<init>:(Ljava/util/Collection;)V
        //    87: astore_2       
        //    88: aload_1        
        //    89: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    94: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    99: astore_1       
        //   100: aload_1        
        //   101: invokeinterface java/util/Iterator.hasNext:()Z
        //   106: ifeq            133
        //   109: aload_1        
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: checkcast       Lg1y;
        //   118: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: aload_2        
        //   123: aconst_null    
        //   124: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //   129: pop            
        //   130: goto            100
        //   133: aload_0        
        //   134: aload_2        
        //   135: invokestatic    java/util/Collections.unmodifiableSet:(Ljava/util/Set;)Ljava/util/Set;
        //   138: putfield        fh4.c:Ljava/util/Set;
        //   141: return         
        //    Signature:
        //  (Landroid/accounts/Account;Ljava/util/Set<Lcom/google/android/gms/common/api/Scope;>;Ljava/util/Map<Lcom/google/android/gms/common/api/a<*>;Lg1y;>;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lt5q;Z)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 7
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public static final class a
    {
        public Account a;
        public ft0<Scope> b;
        public String c;
        public String d;
        
        public final fh4 a() {
            return new fh4(this.a, (Set)this.b, (Map)null, this.c, this.d, t5q.C0);
        }
    }
}
