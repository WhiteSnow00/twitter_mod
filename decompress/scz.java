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

public final class scz implements gdz
{
    public static final ws0 g;
    public static final String[] h;
    public final ContentResolver a;
    public final Uri b;
    public final pcz c;
    public final Object d;
    public volatile Map e;
    public final ArrayList f;
    
    static {
        g = new ws0();
        h = new String[] { "key", "value" };
    }
    
    public scz(final ContentResolver a, final Uri b) {
        final pcz c = new pcz(this);
        this.c = c;
        this.d = new Object();
        this.f = new ArrayList();
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        (this.a = a).registerContentObserver(this.b = b, false, (ContentObserver)c);
    }
    
    public static scz b(final ContentResolver p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       scz.g:Lws0;
        //     6: astore          4
        //     8: aload           4
        //    10: aload_1        
        //    11: aconst_null    
        //    12: invokevirtual   z8q.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       Lscz;
        //    18: astore_3       
        //    19: aload_3        
        //    20: astore_2       
        //    21: aload_3        
        //    22: ifnonnull       43
        //    25: new             Lscz;
        //    28: astore_2       
        //    29: aload_2        
        //    30: aload_0        
        //    31: aload_1        
        //    32: invokespecial   scz.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;)V
        //    35: aload           4
        //    37: aload_1        
        //    38: aload_2        
        //    39: invokevirtual   z8q.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    42: pop            
        //    43: ldc             Lscz;.class
        //    45: monitorexit    
        //    46: aload_2        
        //    47: areturn        
        //    48: astore_0       
        //    49: ldc             Lscz;.class
        //    51: monitorexit    
        //    52: aload_0        
        //    53: athrow         
        //    54: astore_0       
        //    55: aload_3        
        //    56: astore_2       
        //    57: goto            43
        //    60: astore_0       
        //    61: goto            43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      19     48     54     Any
        //  25     35     54     60     Ljava/lang/SecurityException;
        //  25     35     48     54     Any
        //  35     43     60     64     Ljava/lang/SecurityException;
        //  35     43     48     54     Any
        //  43     46     48     54     Any
        //  49     52     48     54     Any
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
        synchronized (scz.class) {
            for (final scz scz : (ws0$e)scz.g.values()) {
                scz.a.unregisterContentObserver((ContentObserver)scz.c);
            }
            scz.g.clear();
        }
    }
    
    public final /* bridge */ Object a(final String s) {
        return this.c().get(s);
    }
    
    public final Map c() {
        Map e;
        if ((e = this.e) == null) {
            synchronized (this.d) {
                Label_0090: {
                    if (this.e == null) {
                        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                final Map map = (Map)p4j.d0((edz)new lcz(this));
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
                        break Label_0090;
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
