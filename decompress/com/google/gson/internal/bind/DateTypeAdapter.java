// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Locale;
import java.util.ArrayList;
import com.google.gson.Gson;
import java.text.DateFormat;
import java.util.List;
import java.util.Date;
import com.google.gson.TypeAdapter;

public final class DateTypeAdapter extends TypeAdapter<Date>
{
    public static final div b;
    public final List<DateFormat> a;
    
    static {
        b = new div() {
            @Override
            public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
                Object o;
                if (blv.rawType == Date.class) {
                    o = new DateTypeAdapter();
                }
                else {
                    o = null;
                }
                return (TypeAdapter<T>)o;
            }
        };
    }
    
    public DateTypeAdapter() {
        final ArrayList a = new ArrayList();
        this.a = a;
        final Locale us = Locale.US;
        a.add(DateFormat.getDateTimeInstance(2, 2, us));
        if (!Locale.getDefault().equals(us)) {
            a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e9e.a >= 9) {
            a.add(jee.X(2, 2));
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
        //    15: goto            96
        //    18: aload_1        
        //    19: invokevirtual   phe.R1:()Ljava/lang/String;
        //    22: astore_3       
        //    23: aload_0        
        //    24: getfield        com/google/gson/internal/bind/DateTypeAdapter.a:Ljava/util/ArrayList;
        //    27: astore          4
        //    29: aload           4
        //    31: monitorenter   
        //    32: aload_0        
        //    33: getfield        com/google/gson/internal/bind/DateTypeAdapter.a:Ljava/util/ArrayList;
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
        //    96: aload_1        
        //    97: areturn        
        //    98: astore_2       
        //    99: ldc             "Failed parsing '"
        //   101: aload_3        
        //   102: ldc             "' as Date; at path "
        //   104: invokestatic    pd.y:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: astore_3       
        //   108: aload_3        
        //   109: aload_1        
        //   110: invokevirtual   phe.j:()Ljava/lang/String;
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: pop            
        //   117: new             Lcom/google/gson/JsonSyntaxException;
        //   120: dup            
        //   121: aload_3        
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: aload_2        
        //   126: invokespecial   com/google/gson/JsonSyntaxException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   129: athrow         
        //   130: astore_1       
        //   131: aload           4
        //   133: monitorexit    
        //   134: aload_1        
        //   135: athrow         
        //   136: astore_2       
        //   137: goto            41
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  32     41     130    136    Any
        //  41     62     130    136    Any
        //  62     68     136    140    Ljava/text/ParseException;
        //  62     68     130    136    Any
        //  68     71     130    136    Any
        //  76     79     130    136    Any
        //  79     94     98     130    Ljava/text/ParseException;
        //  131    134    130    136    Any
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
    
    public final void write(final zke zke, final Object o) throws IOException {
        final Date date = (Date)o;
        if (date == null) {
            zke.j();
            return;
        }
        final DateFormat dateFormat = this.a.get(0);
        synchronized (this.a) {
            final String format = dateFormat.format(date);
            monitorexit(this.a);
            zke.O(format);
        }
    }
}
