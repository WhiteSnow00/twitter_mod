import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckedTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uj0 extends CheckedTextView implements hbt
{
    public final vj0 F0;
    public final sj0 G0;
    public final sk0 H0;
    public gk0 I0;
    
    public uj0(final Context p0, final AttributeSet p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    cbt.a:(Landroid/content/Context;)Landroid/content/Context;
        //     4: pop            
        //     5: aload_0        
        //     6: aload_1        
        //     7: aload_2        
        //     8: ldc             2130968882
        //    10: invokespecial   android/widget/CheckedTextView.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    13: aload_0        
        //    14: aload_0        
        //    15: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    18: invokestatic    ans.a:(Landroid/view/View;Landroid/content/Context;)V
        //    21: new             Lsk0;
        //    24: dup            
        //    25: aload_0        
        //    26: invokespecial   sk0.<init>:(Landroid/widget/TextView;)V
        //    29: astore_1       
        //    30: aload_0        
        //    31: aload_1        
        //    32: putfield        uj0.H0:Lsk0;
        //    35: aload_1        
        //    36: aload_2        
        //    37: ldc             2130968882
        //    39: invokevirtual   sk0.h:(Landroid/util/AttributeSet;I)V
        //    42: aload_1        
        //    43: invokevirtual   sk0.b:()V
        //    46: new             Lsj0;
        //    49: dup            
        //    50: aload_0        
        //    51: invokespecial   sj0.<init>:(Landroid/view/View;)V
        //    54: astore_1       
        //    55: aload_0        
        //    56: aload_1        
        //    57: putfield        uj0.G0:Lsj0;
        //    60: aload_1        
        //    61: aload_2        
        //    62: ldc             2130968882
        //    64: invokevirtual   sj0.d:(Landroid/util/AttributeSet;I)V
        //    67: new             Lvj0;
        //    70: dup            
        //    71: aload_0        
        //    72: invokespecial   vj0.<init>:(Landroid/widget/CheckedTextView;)V
        //    75: astore_1       
        //    76: aload_0        
        //    77: aload_1        
        //    78: putfield        uj0.F0:Lvj0;
        //    81: aload_0        
        //    82: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    85: astore          5
        //    87: getstatic       fr0.S0:[I
        //    90: astore          6
        //    92: aload           5
        //    94: aload_2        
        //    95: aload           6
        //    97: ldc             2130968882
        //    99: invokestatic    gbt.q:(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lgbt;
        //   102: astore          5
        //   104: aload_0        
        //   105: aload_0        
        //   106: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   109: aload           6
        //   111: aload_2        
        //   112: aload           5
        //   114: getfield        gbt.b:Landroid/content/res/TypedArray;
        //   117: ldc             2130968882
        //   119: invokestatic    b7x.y:(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
        //   122: iconst_1       
        //   123: istore_3       
        //   124: aload           5
        //   126: iconst_1       
        //   127: invokevirtual   gbt.o:(I)Z
        //   130: ifeq            163
        //   133: aload           5
        //   135: iconst_1       
        //   136: iconst_0       
        //   137: invokevirtual   gbt.l:(II)I
        //   140: istore          4
        //   142: iload           4
        //   144: ifeq            163
        //   147: aload_0        
        //   148: aload_0        
        //   149: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   152: iload           4
        //   154: invokestatic    d4j.F:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   157: invokevirtual   uj0.setCheckMarkDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   160: goto            165
        //   163: iconst_0       
        //   164: istore_3       
        //   165: iload_3        
        //   166: ifne            210
        //   169: aload           5
        //   171: iconst_0       
        //   172: invokevirtual   gbt.o:(I)Z
        //   175: ifeq            210
        //   178: aload           5
        //   180: iconst_0       
        //   181: iconst_0       
        //   182: invokevirtual   gbt.l:(II)I
        //   185: istore_3       
        //   186: iload_3        
        //   187: ifeq            210
        //   190: aload_1        
        //   191: getfield        vj0.a:Landroid/widget/CheckedTextView;
        //   194: astore          6
        //   196: aload           6
        //   198: aload           6
        //   200: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   203: iload_3        
        //   204: invokestatic    d4j.F:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   207: invokevirtual   android/widget/CheckedTextView.setCheckMarkDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   210: aload           5
        //   212: iconst_2       
        //   213: invokevirtual   gbt.o:(I)Z
        //   216: ifeq            232
        //   219: aload_1        
        //   220: getfield        vj0.a:Landroid/widget/CheckedTextView;
        //   223: aload           5
        //   225: iconst_2       
        //   226: invokevirtual   gbt.c:(I)Landroid/content/res/ColorStateList;
        //   229: invokevirtual   android/widget/CheckedTextView.setCheckMarkTintList:(Landroid/content/res/ColorStateList;)V
        //   232: aload           5
        //   234: iconst_3       
        //   235: invokevirtual   gbt.o:(I)Z
        //   238: ifeq            259
        //   241: aload_1        
        //   242: getfield        vj0.a:Landroid/widget/CheckedTextView;
        //   245: aload           5
        //   247: iconst_3       
        //   248: iconst_m1      
        //   249: invokevirtual   gbt.j:(II)I
        //   252: aconst_null    
        //   253: invokestatic    je9.d:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
        //   256: invokevirtual   android/widget/CheckedTextView.setCheckMarkTintMode:(Landroid/graphics/PorterDuff$Mode;)V
        //   259: aload           5
        //   261: invokevirtual   gbt.r:()V
        //   264: aload_0        
        //   265: invokespecial   uj0.getEmojiTextViewHelper:()Lgk0;
        //   268: aload_2        
        //   269: ldc             2130968882
        //   271: invokevirtual   gk0.b:(Landroid/util/AttributeSet;I)V
        //   274: return         
        //   275: astore_1       
        //   276: aload           5
        //   278: invokevirtual   gbt.r:()V
        //   281: aload_1        
        //   282: athrow         
        //   283: astore          6
        //   285: goto            163
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  124    142    275    283    Any
        //  147    160    283    288    Landroid/content/res/Resources$NotFoundException;
        //  147    160    275    283    Any
        //  169    186    275    283    Any
        //  190    210    275    283    Any
        //  210    232    275    283    Any
        //  232    259    275    283    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0163:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    private gk0 getEmojiTextViewHelper() {
        if (this.I0 == null) {
            this.I0 = new gk0((TextView)this);
        }
        return this.I0;
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final sk0 h0 = this.H0;
        if (h0 != null) {
            h0.b();
        }
        final sj0 g0 = this.G0;
        if (g0 != null) {
            g0.a();
        }
        final vj0 f0 = this.F0;
        if (f0 != null) {
            f0.a();
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return uks.g(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final sj0 g0 = this.G0;
        ColorStateList b;
        if (g0 != null) {
            b = g0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final sj0 g0 = this.G0;
        PorterDuff$Mode c;
        if (g0 != null) {
            c = g0.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCheckMarkTintList() {
        final vj0 f0 = this.F0;
        ColorStateList b;
        if (f0 != null) {
            b = f0.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportCheckMarkTintMode() {
        final vj0 f0 = this.F0;
        PorterDuff$Mode c;
        if (f0 != null) {
            c = f0.c;
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.H0.e();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.H0.f();
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        shw.B0(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().c(allCaps);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final sj0 g0 = this.G0;
        if (g0 != null) {
            g0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final sj0 g0 = this.G0;
        if (g0 != null) {
            g0.f(backgroundResource);
        }
    }
    
    public void setCheckMarkDrawable(final int n) {
        this.setCheckMarkDrawable(d4j.F(((View)this).getContext(), n));
    }
    
    public void setCheckMarkDrawable(final Drawable checkMarkDrawable) {
        super.setCheckMarkDrawable(checkMarkDrawable);
        final vj0 f0 = this.F0;
        if (f0 != null) {
            if (f0.f) {
                f0.f = false;
            }
            else {
                f0.f = true;
                f0.a();
            }
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final sk0 h0 = this.H0;
        if (h0 != null) {
            h0.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final sk0 h0 = this.H0;
        if (h0 != null) {
            h0.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(uks.h((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().d(b);
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final sj0 g0 = this.G0;
        if (g0 != null) {
            g0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final sj0 g0 = this.G0;
        if (g0 != null) {
            g0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCheckMarkTintList(final ColorStateList b) {
        final vj0 f0 = this.F0;
        if (f0 != null) {
            f0.b = b;
            f0.d = true;
            f0.a();
        }
    }
    
    public void setSupportCheckMarkTintMode(final PorterDuff$Mode c) {
        final vj0 f0 = this.F0;
        if (f0 != null) {
            f0.c = c;
            f0.e = true;
            f0.a();
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.H0.n(list);
        this.H0.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.H0.o(porterDuff$Mode);
        this.H0.b();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final sk0 h0 = this.H0;
        if (h0 != null) {
            h0.i(context, n);
        }
    }
}
