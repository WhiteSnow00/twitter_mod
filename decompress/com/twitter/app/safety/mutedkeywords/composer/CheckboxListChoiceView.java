// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safety.mutedkeywords.composer;

import android.widget.CompoundButton;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class CheckboxListChoiceView extends LinearLayout
{
    public final CheckBox C0;
    public final TextView D0;
    public final TextView E0;
    public a F0;
    public Object G0;
    
    public CheckboxListChoiceView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        LayoutInflater.from(context).inflate(2131624185, (ViewGroup)this, true);
        final View viewById = ((View)this).findViewById(2131428236);
        final int a = w4j.a;
        this.D0 = (TextView)viewById;
        this.E0 = (TextView)((View)this).findViewById(2131428233);
        this.C0 = (CheckBox)((View)this).findViewById(2131428232);
    }
    
    public Object getCurrentEntryValue() {
        return this.G0;
    }
    
    public void setCurrentEntryValue(Object g0) {
        this.G0 = g0;
        final a f0 = this.F0;
        if (f0 != null) {
            this.D0.setText((CharSequence)f0.D0);
            g0 = this.G0;
            final int n = 0;
            ((CompoundButton)this.C0).setChecked(g0 != null);
            int visibility;
            if (this.F0.H0) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)this.C0).setVisibility(visibility);
            final a f2 = this.F0;
            final Object g2 = this.G0;
            final TextView e0 = this.E0;
            String s = null;
            Label_0159: {
                if (f2.I0 != null) {
                    final int a = f2.a(g2);
                    if (a >= 0 && a < f2.I0.size()) {
                        s = f2.I0.get(a);
                        break Label_0159;
                    }
                }
                s = null;
            }
            String text = s;
            if (TextUtils.isEmpty((CharSequence)s)) {
                final int a2 = f2.a(g2);
                String s2;
                if (a2 >= 0 && a2 < f2.E0.size()) {
                    s2 = f2.E0.get(a2);
                }
                else {
                    s2 = "";
                }
                text = s2;
            }
            e0.setText((CharSequence)text);
            int visibility2 = n;
            if (TextUtils.isEmpty((CharSequence)text)) {
                visibility2 = 8;
            }
            ((View)e0).setVisibility(visibility2);
        }
    }
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator CREATOR;
        public final int C0;
        public final String D0;
        public final List<String> E0;
        public final List<Object> F0;
        public final Object G0;
        public final boolean H0;
        public final List<String> I0;
        public final ClassLoader J0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new a(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a(final Parcel parcel) {
            final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            this.J0 = systemClassLoader;
            this.C0 = parcel.readInt();
            this.D0 = parcel.readString();
            parcel.readStringList((List)(this.E0 = new ArrayList<String>()));
            final Object[] array = parcel.readArray(systemClassLoader);
            final ArrayList f0 = new ArrayList<Object>(array.length);
            boolean h0 = false;
            for (int i = 0; i < array.length; ++i) {
                f0.add(array[i]);
            }
            this.F0 = (List<Object>)f0;
            if (parcel.readInt() == 1) {
                this.G0 = parcel.readValue(this.J0);
            }
            else {
                this.G0 = null;
            }
            if (parcel.readInt() == 1) {
                h0 = true;
            }
            this.H0 = h0;
            parcel.readStringList((List)(this.I0 = new ArrayList<String>()));
        }
        
        public a(final int p0, final String p1, final List<String> p2, final List<Object> p3, final Object p4, final boolean p5, final List<String> p6, final ClassLoader p7) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_2        
            //     5: invokeinterface java/util/List.size:()I
            //    10: aload_3        
            //    11: invokeinterface java/util/List.size:()I
            //    16: if_icmpne       142
            //    19: aload           5
            //    21: ifnull          98
            //    24: aload_2        
            //    25: invokeinterface java/util/List.size:()I
            //    30: aload           5
            //    32: invokeinterface java/util/List.size:()I
            //    37: if_icmpne       43
            //    40: goto            98
            //    43: ldc             "Must have titles ["
            //    45: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //    48: astore_1       
            //    49: aload_1        
            //    50: aload_2        
            //    51: invokeinterface java/util/List.size:()I
            //    56: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //    59: pop            
            //    60: aload_1        
            //    61: ldc             "] and descriptions ["
            //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //    66: pop            
            //    67: aload_1        
            //    68: aload           5
            //    70: invokeinterface java/util/List.size:()I
            //    75: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //    78: pop            
            //    79: aload_1        
            //    80: ldc             "]"
            //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //    85: pop            
            //    86: new             Ljava/lang/IllegalArgumentException;
            //    89: dup            
            //    90: aload_1        
            //    91: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //    94: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
            //    97: athrow         
            //    98: aload_0        
            //    99: iconst_1       
            //   100: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.C0:I
            //   103: aload_0        
            //   104: aload_1        
            //   105: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.D0:Ljava/lang/String;
            //   108: aload_0        
            //   109: aload_2        
            //   110: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.E0:Ljava/util/List;
            //   113: aload_0        
            //   114: aload_3        
            //   115: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.F0:Ljava/util/List;
            //   118: aload_0        
            //   119: aload           4
            //   121: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.G0:Ljava/lang/Object;
            //   124: aload_0        
            //   125: iconst_0       
            //   126: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.H0:Z
            //   129: aload_0        
            //   130: aload           5
            //   132: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.I0:Ljava/util/List;
            //   135: aload_0        
            //   136: aload           6
            //   138: putfield        com/twitter/app/safety/mutedkeywords/composer/CheckboxListChoiceView$a.J0:Ljava/lang/ClassLoader;
            //   141: return         
            //   142: ldc             "Must have titles ["
            //   144: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   147: astore_1       
            //   148: aload_1        
            //   149: aload_2        
            //   150: invokeinterface java/util/List.size:()I
            //   155: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //   158: pop            
            //   159: aload_1        
            //   160: ldc             "] and values ["
            //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   165: pop            
            //   166: aload_1        
            //   167: aload_3        
            //   168: invokeinterface java/util/List.size:()I
            //   173: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
            //   176: pop            
            //   177: aload_1        
            //   178: ldc             "] equal."
            //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   183: pop            
            //   184: new             Ljava/lang/IllegalArgumentException;
            //   187: dup            
            //   188: aload_1        
            //   189: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   192: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
            //   195: athrow         
            //    Signature:
            //  (ILjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/Object;>;Ljava/lang/Object;ZLjava/util/List<Ljava/lang/String;>;Ljava/lang/ClassLoader;)V
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
        
        public final int a(final Object o) {
            if (o != null) {
                for (int i = 0; i < this.F0.size(); ++i) {
                    if (o.equals(this.F0.get(i))) {
                        return i;
                    }
                }
            }
            return -1;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, int i) {
            parcel.writeInt(this.C0);
            parcel.writeString(this.D0);
            parcel.writeStringList((List)this.E0);
            final List<Object> f0 = this.F0;
            final Object[] array = new Object[f0.size()];
            final int n = 0;
            for (i = 0; i < f0.size(); ++i) {
                array[i] = f0.get(i);
            }
            parcel.writeArray(array);
            i = n;
            if (this.G0 != null) {
                i = 1;
            }
            parcel.writeInt(i);
            final Object g0 = this.G0;
            if (g0 != null) {
                parcel.writeValue(g0);
            }
            parcel.writeInt((int)(this.H0 ? 1 : 0));
            parcel.writeStringList((List)this.I0);
        }
    }
}
