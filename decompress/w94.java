import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.List;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w94 extends BaseAdapter
{
    public final List<t94> C0;
    public final ydj D0;
    public final LayoutInflater E0;
    public final int F0;
    
    public w94(final Context p0, final List<t94> p1, final int p2, final ydj p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   android/widget/BaseAdapter.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //     9: putfield        w94.E0:Landroid/view/LayoutInflater;
        //    12: aload_0        
        //    13: aload_2        
        //    14: putfield        w94.C0:Ljava/util/List;
        //    17: aload_0        
        //    18: aload_3        
        //    19: putfield        w94.D0:Lydj;
        //    22: aload_1        
        //    23: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    26: ldc             17367049
        //    28: invokevirtual   android/content/res/Resources.getLayout:(I)Landroid/content/res/XmlResourceParser;
        //    31: iconst_0       
        //    32: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    35: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    38: pop            
        //    39: aload_0        
        //    40: ldc             17367049
        //    42: putfield        w94.F0:I
        //    45: return         
        //    Signature:
        //  (Landroid/content/Context;Ljava/util/List<Lt94;>;ILydj;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
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
    
    public final t94 a(final int n) {
        if (n >= 0 && n < this.getCount()) {
            return this.C0.get(n);
        }
        return null;
    }
    
    public final int getCount() {
        final List<t94> c0 = this.C0;
        if (c0 != null) {
            return c0.size();
        }
        return -1;
    }
    
    public final long getItemId(final int n) {
        if (this.a(n) != null) {
            return n;
        }
        return -1L;
    }
    
    public final View getView(final int n, View inflate, final ViewGroup viewGroup) {
        final int f0 = this.F0;
        TextView textView;
        if (inflate != null) {
            final int a = w4j.a;
            textView = TextView.class.cast(inflate);
        }
        else {
            inflate = this.E0.inflate(f0, viewGroup, false);
            final int a2 = w4j.a;
            textView = TextView.class.cast(inflate);
        }
        this.D0.a(textView, (xwm)this.a(n).b);
        return (View)textView;
    }
}
