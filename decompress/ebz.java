import android.os.StrictMode$ThreadPolicy;
import java.util.Collections;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.os.StrictMode;
import java.util.Iterator;
import android.database.ContentObserver;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebz implements sbz
{
    public static final at0 g;
    public static final String[] h;
    public final ContentResolver a;
    public final Uri b;
    public final bbz c;
    public final Object d;
    public volatile Map e;
    public final ArrayList f;
    
    static {
        g = new at0();
        h = new String[] { "key", "value" };
    }
    
    public ebz(final ContentResolver a, final Uri b) {
        final bbz c = new bbz(this);
        this.c = c;
        this.d = new Object();
        this.f = new ArrayList();
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        (this.a = a).registerContentObserver(this.b = b, false, (ContentObserver)c);
    }
    
    public static ebz b(final ContentResolver p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       ebz.g:Lat0;
        //     6: astore_2       
        //     7: aload_2        
        //     8: aload_1        
        //     9: aconst_null    
        //    10: invokevirtual   l7q.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    13: checkcast       Lebz;
        //    16: astore_3       
        //    17: aload_3        
        //    18: astore          4
        //    20: aload_3        
        //    21: ifnonnull       44
        //    24: new             Lebz;
        //    27: astore          4
        //    29: aload           4
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokespecial   ebz.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;)V
        //    36: aload_2        
        //    37: aload_1        
        //    38: aload           4
        //    40: invokevirtual   l7q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    43: pop            
        //    44: ldc             Lebz;.class
        //    46: monitorexit    
        //    47: aload           4
        //    49: areturn        
        //    50: astore_0       
        //    51: ldc             Lebz;.class
        //    53: monitorexit    
        //    54: aload_0        
        //    55: athrow         
        //    56: astore_0       
        //    57: aload_3        
        //    58: astore          4
        //    60: goto            44
        //    63: astore_0       
        //    64: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      17     50     56     Any
        //  24     36     56     63     Ljava/lang/SecurityException;
        //  24     36     50     56     Any
        //  36     44     63     67     Ljava/lang/SecurityException;
        //  36     44     50     56     Any
        //  44     47     50     56     Any
        //  51     54     50     56     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 40, Size: 40
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
    
    public static void d() {
        synchronized (ebz.class) {
            for (final ebz ebz : (at0.e)ebz.g.values()) {
                ebz.a.unregisterContentObserver((ContentObserver)ebz.c);
            }
            ((l7q)ebz.g).clear();
        }
    }
    
    public final Map c() {
        Map e;
        if ((e = this.e) == null) {
            synchronized (this.d) {
                Label_0091: {
                    if (this.e == null) {
                        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                final Map map = (Map)ck1.D((qbz)new xaz((Object)this, 0));
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                            finally {}
                        }
                        catch (final SecurityException | SQLiteException | IllegalStateException ex) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            e = null;
                        }
                        this.e = e;
                        break Label_0091;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
        }
        if (e != null) {
            return e;
        }
        return Collections.emptyMap();
    }
}
