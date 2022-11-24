import android.os.IInterface;
import java.lang.reflect.Field;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p5j<T> extends a
{
    public final T a;
    
    public p5j(final T a) {
        this.a = a;
    }
    
    public static <T> l3d D1(final T p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aconst_null    
        //     5: invokespecial   p5j.<init>:(Ljava/lang/Object;)V
        //     8: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(TT;)Ll3d;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 0
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    public static <T> T U0(final l3d l3d) {
        if (l3d instanceof p5j) {
            return (T)((p5j)l3d).a;
        }
        final IBinder binder = ((IInterface)l3d).asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        Field field = null;
        int i = 0;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n == 1) {
            iuk.C((Object)field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T)field.get(binder);
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex);
                }
                catch (final NullPointerException ex2) {
                    throw new IllegalArgumentException("Binder object is null.", ex2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(go9.p(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
