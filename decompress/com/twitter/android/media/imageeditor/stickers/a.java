// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.media.imageeditor.stickers;

import android.graphics.Point;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.GridLayoutManager;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView$e;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;

public final class a extends cuj
{
    public static final otk<hhr> L0;
    public static final otk<hhr> M0;
    public final Context E0;
    public final List<hhr> F0;
    public final b.c G0;
    public final String H0;
    public final boolean I0;
    public List<hhr> J0;
    public b.b K0;
    
    static {
        M0 = (a.L0 = kgc.e).a();
    }
    
    public a(final Context p0, final List<hhr> p1, final List<hhr> p2, final b.c p3, final String p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   cuj.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        com/twitter/android/media/imageeditor/stickers/a.E0:Landroid/content/Context;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        com/twitter/android/media/imageeditor/stickers/a.F0:Ljava/util/List;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        com/twitter/android/media/imageeditor/stickers/a.J0:Ljava/util/List;
        //    19: aload_0        
        //    20: aload           4
        //    22: putfield        com/twitter/android/media/imageeditor/stickers/a.G0:Lcom/twitter/android/media/imageeditor/stickers/b$c;
        //    25: aload_0        
        //    26: aload           5
        //    28: putfield        com/twitter/android/media/imageeditor/stickers/a.H0:Ljava/lang/String;
        //    31: aload_0        
        //    32: iconst_0       
        //    33: putfield        com/twitter/android/media/imageeditor/stickers/a.I0:Z
        //    36: return         
        //    Signature:
        //  (Landroid/content/Context;Ljava/util/List<Lhhr;>;Ljava/util/List<Lhhr;>;Lcom/twitter/android/media/imageeditor/stickers/b$c;Ljava/lang/String;Z)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 6
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    public final int B(Object tag) {
        tag = ((View)tag).getTag();
        pf8.r(tag);
        if (tag instanceof List) {
            return this.I0 ? 1 : 0;
        }
        final hhr hhr = (hhr)tag;
        if (this.I0 && "recently_used".equals(hhr.e)) {
            return 0;
        }
        int index = this.F0.indexOf(hhr);
        if (index != -1) {
            if (this.Q()) {
                ++index;
            }
        }
        else {
            index = -2;
        }
        return index;
    }
    
    public final Object F(final ViewGroup viewGroup, int dimensionPixelSize) {
        final FrameLayout frameLayout = new FrameLayout(this.E0);
        final RecyclerView recyclerView = new RecyclerView(this.E0, (AttributeSet)null);
        final boolean s = this.S(dimensionPixelSize);
        List<hhr> list;
        if (dimensionPixelSize == 0 && this.I0) {
            list = ijf.v((Object)hr4.q(hr4.e((Iterable)this.F0, (otk)a.L0)));
        }
        else if (s) {
            list = this.J0;
        }
        else {
            final boolean q = this.Q();
            final boolean i0 = this.I0;
            int j = 0;
            int n = 0;
            while (j < 2) {
                int n2 = n;
                if ((new boolean[] { q, i0 })[j]) {
                    n2 = n + 1;
                }
                ++j;
                n = n2;
            }
            dimensionPixelSize -= n;
            hhr hhr;
            if (this.I0) {
                hhr = hr4.e((Iterable)this.F0, (otk)a.M0).get(dimensionPixelSize);
            }
            else {
                hhr = this.F0.get(dimensionPixelSize);
            }
            list = ijf.v((Object)hhr);
        }
        Object q2;
        if (s) {
            q2 = list;
        }
        else {
            q2 = hr4.q((List)list);
        }
        ((View)frameLayout).setTag(q2);
        final b adapter = new b(this.E0, list, this.H0);
        adapter.L0 = this.G0;
        recyclerView.setAdapter((RecyclerView$e)adapter);
        final Resources resources = ((View)recyclerView).getResources();
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131167278);
        dimensionPixelSize = resources.getDimensionPixelSize(2131167277);
        final Point m = tbx.m((WindowManager)this.E0.getSystemService("window"));
        final int n3 = dimensionPixelSize * 2 + dimensionPixelSize2;
        final int max = Math.max(4, Math.round(m.x / (float)n3));
        final int o0 = (m.x - n3 * max) / 2;
        final GridLayoutManager layoutManager = new GridLayoutManager(this.E0, max, 1, false);
        layoutManager.p1 = new zfr(adapter, max);
        recyclerView.setLayoutManager((RecyclerView$m)layoutManager);
        if (o0 > 0) {
            ((View)recyclerView).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            recyclerView.setClipToPadding(false);
            adapter.O0 = o0;
        }
        recyclerView.h((RecyclerView$l)new dhr(dimensionPixelSize));
        ((ViewGroup)frameLayout).addView((View)recyclerView);
        adapter.K0 = this.K0;
        viewGroup.addView((View)frameLayout);
        return frameLayout;
    }
    
    public final boolean I(final View view, final Object o) {
        return view.equals(o);
    }
    
    public final boolean Q() {
        return this.J0.isEmpty() ^ true;
    }
    
    public final boolean R() {
        return hr4.q(hr4.e((Iterable)this.F0, (otk)a.L0)) != null;
    }
    
    public final boolean S(final int n) {
        final boolean q = this.Q();
        final boolean b = false;
        boolean b2 = false;
        if (!q) {
            return false;
        }
        if (this.I0 && this.R()) {
            if (n == 1) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (n == 0) {
            b3 = true;
        }
        return b3;
    }
    
    public final int getCount() {
        int size;
        if (!this.Q()) {
            size = this.F0.size();
        }
        else {
            size = this.F0.size() + 1;
        }
        return size;
    }
    
    public final void i(final ViewGroup viewGroup, final int n, final Object o) {
        viewGroup.removeView((View)o);
    }
}
