import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zv2
{
    public static final a Companion;
    public static final dda b;
    public static final dda c;
    public static final dda d;
    public static final dda e;
    public static final dda f;
    public static final dda g;
    public static final dda h;
    public static final dda i;
    public static final dda j;
    public static final dda k;
    public static final dda l;
    public static final dda m;
    public static final dda n;
    public final UserIdentifier a;
    
    static {
        final a a = Companion = new a();
        b = shw.L("about_module_hours_settings", (String)null, (String)null, 14);
        c = shw.L("about_module_hours_settings", "custom_hours", "time_picker", 8);
        d = zv2.a.a(a, null, null, "done", 3);
        e = zv2.a.a(a, null, "no_hours", null, 5);
        f = zv2.a.a(a, null, "always_open", null, 5);
        g = zv2.a.a(a, null, "custom_hours", null, 5);
        h = zv2.a.a(a, "custom_hours", "timezone", null, 4);
        i = zv2.a.a(a, "custom_hours", null, "add_more_hours", 2);
        j = zv2.a.a(a, "custom_hours", null, "hours_deleted", 2);
        k = zv2.a.a(a, "custom_hours", null, "from", 2);
        l = zv2.a.a(a, "custom_hours", null, "to", 2);
        m = shw.t("about_module_hours_settings", "custom_hours", "time_picker", "confirm");
        n = shw.t("about_module_hours_settings", "custom_hours", "time_picker", "cancel");
    }
    
    public zv2(final UserIdentifier a) {
        e0e.f((Object)a, "userIdentifier");
        this.a = a;
    }
    
    public final void a(final dda dda) {
        final fg4 fg4 = new fg4(dda);
        ((o1p)fg4).r = this.a;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public static final class a
    {
        public static dda a(final a a, String s, String s2, String s3, final int n) {
            if ((n & 0x1) != 0x0) {
                s = "";
            }
            if ((n & 0x2) != 0x0) {
                s2 = "";
            }
            if ((n & 0x4) != 0x0) {
                s3 = "";
            }
            Objects.requireNonNull(a);
            return shw.t("about_module_hours_settings", s, s2, s3);
        }
    }
    
    public final class b
    {
        public static final int[] a;
        
        static {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: arraylength    
            //     4: newarray        I
            //     6: astore_0       
            //     7: aload_0        
            //     8: iconst_0       
            //     9: iconst_1       
            //    10: iastore        
            //    11: aload_0        
            //    12: iconst_1       
            //    13: iconst_2       
            //    14: iastore        
            //    15: aload_0        
            //    16: iconst_2       
            //    17: iconst_3       
            //    18: iastore        
            //    19: invokestatic    com/twitter/business/model/hours/IntervalPosition.values:()[Lcom/twitter/business/model/hours/IntervalPosition;
            //    22: arraylength    
            //    23: newarray        I
            //    25: astore_0       
            //    26: aload_0        
            //    27: getstatic       com/twitter/business/model/hours/IntervalPosition.START:Lcom/twitter/business/model/hours/IntervalPosition;
            //    30: invokevirtual   java/lang/Enum.ordinal:()I
            //    33: iconst_1       
            //    34: iastore        
            //    35: aload_0        
            //    36: getstatic       com/twitter/business/model/hours/IntervalPosition.END:Lcom/twitter/business/model/hours/IntervalPosition;
            //    39: invokevirtual   java/lang/Enum.ordinal:()I
            //    42: iconst_2       
            //    43: iastore        
            //    44: aload_0        
            //    45: putstatic       zv2$b.a:[I
            //    48: return         
            //    49: astore_1       
            //    50: goto            35
            //    53: astore_1       
            //    54: goto            44
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  26     35     49     53     Ljava/lang/NoSuchFieldError;
            //  35     44     53     57     Ljava/lang/NoSuchFieldError;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
}
