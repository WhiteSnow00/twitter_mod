// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.ArrayList;
import java.text.DateFormat;
import java.util.List;
import com.google.gson.TypeAdapter;
import java.util.Date;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T>
{
    public final DefaultDateTypeAdapter.DefaultDateTypeAdapter$b<T> a;
    public final List<DateFormat> b;
    
    public DefaultDateTypeAdapter(final DefaultDateTypeAdapter.DefaultDateTypeAdapter$b a, final int n, final int n2, final DefaultDateTypeAdapter$a defaultDateTypeAdapter$a) {
        final ArrayList b = new ArrayList();
        this.b = b;
        Objects.requireNonNull(a);
        this.a = (DefaultDateTypeAdapter.DefaultDateTypeAdapter$b<T>)a;
        final Locale us = Locale.US;
        b.add(DateFormat.getDateTimeInstance(n, n2, us));
        if (!Locale.getDefault().equals(us)) {
            b.add(DateFormat.getDateTimeInstance(n, n2));
        }
        if (e9e.a >= 9) {
            b.add(jee.X(n, n2));
        }
    }
    
    public final Object read(final phe p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   phe.U2:()I
        //     4: bipush          9
        //     6: if_icmpne       18
        //     9: aload_1        
        //    10: invokevirtual   phe.J2:()V
        //    13: aconst_null    
        //    14: astore_1       
        //    15: goto            105
        //    18: aload_1        
        //    19: invokevirtual   phe.R1:()Ljava/lang/String;
        //    22: astore_3       
        //    23: aload_0        
        //    24: getfield        com/google/gson/internal/bind/DefaultDateTypeAdapter.b:Ljava/util/ArrayList;
        //    27: astore          4
        //    29: aload           4
        //    31: monitorenter   
        //    32: aload_0        
        //    33: getfield        com/google/gson/internal/bind/DefaultDateTypeAdapter.b:Ljava/util/ArrayList;
        //    36: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    39: astore          5
        //    41: aload           5
        //    43: invokeinterface java/util/Iterator.hasNext:()Z
        //    48: ifeq            76
        //    51: aload           5
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: checkcast       Ljava/text/DateFormat;
        //    61: astore_2       
        //    62: aload_2        
        //    63: aload_3        
        //    64: invokevirtual   java/text/DateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
        //    67: astore_2       
        //    68: aload           4
        //    70: monitorexit    
        //    71: aload_2        
        //    72: astore_1       
        //    73: goto            96
        //    76: aload           4
        //    78: monitorexit    
        //    79: new             Ljava/text/ParsePosition;
        //    82: astore_2       
        //    83: aload_2        
        //    84: iconst_0       
        //    85: invokespecial   java/text/ParsePosition.<init>:(I)V
        //    88: aload_3        
        //    89: aload_2        
        //    90: invokestatic    y2d.b:(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
        //    93: astore_2       
        //    94: aload_2        
        //    95: astore_1       
        //    96: aload_0        
        //    97: getfield        com/google/gson/internal/bind/DefaultDateTypeAdapter.a:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;
        //   100: aload_1        
        //   101: invokevirtual   com/google/gson/internal/bind/DefaultDateTypeAdapter$b.b:(Ljava/util/Date;)Ljava/util/Date;
        //   104: astore_1       
        //   105: aload_1        
        //   106: areturn        
        //   107: astore_2       
        //   108: ldc             "Failed parsing '"
        //   110: aload_3        
        //   111: ldc             "' as Date; at path "
        //   113: invokestatic    pd.y:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: astore_3       
        //   117: aload_3        
        //   118: aload_1        
        //   119: invokevirtual   phe.j:()Ljava/lang/String;
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: pop            
        //   126: new             Lcom/google/gson/JsonSyntaxException;
        //   129: dup            
        //   130: aload_3        
        //   131: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   134: aload_2        
        //   135: invokespecial   com/google/gson/JsonSyntaxException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   138: athrow         
        //   139: astore_1       
        //   140: aload           4
        //   142: monitorexit    
        //   143: aload_1        
        //   144: athrow         
        //   145: astore_2       
        //   146: goto            41
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  32     41     139    145    Any
        //  41     62     139    145    Any
        //  62     68     145    149    Ljava/text/ParseException;
        //  62     68     139    145    Any
        //  68     71     139    145    Any
        //  76     79     139    145    Any
        //  79     94     107    139    Ljava/text/ParseException;
        //  140    143    139    145    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    public final String toString() {
        final DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            final StringBuilder j = fu8.j("DefaultDateTypeAdapter(");
            j.append(((SimpleDateFormat)dateFormat).toPattern());
            j.append(')');
            return j.toString();
        }
        final StringBuilder i = fu8.j("DefaultDateTypeAdapter(");
        i.append(((SimpleDateFormat)dateFormat).getClass().getSimpleName());
        i.append(')');
        return i.toString();
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        final Date date = (Date)o;
        if (date == null) {
            zke.j();
            return;
        }
        final DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            final String format = dateFormat.format(date);
            monitorexit(this.b);
            zke.O(format);
        }
    }
}
