import android.view.accessibility.AccessibilityRecord;
import android.graphics.Region;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import android.view.View$OnAttachStateChangeListener;
import java.util.LinkedHashMap;
import android.os.Looper;
import java.util.List;
import java.util.Map;
import android.os.Handler;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s20 extends vf
{
    public static final s20.s20$d Companion;
    public static final int[] z;
    public final AndroidComposeView d;
    public int e;
    public final AccessibilityManager f;
    public final Handler g;
    public og h;
    public int i;
    public u0r<u0r<CharSequence>> j;
    public u0r<Map<CharSequence, Integer>> k;
    public int l;
    public Integer m;
    public final ys0<vve> n;
    public final yo3<fzv> o;
    public boolean p;
    public s20.s20$f q;
    public Map<Integer, xgp> r;
    public ys0<Integer> s;
    public Map<Integer, s20.s20$g> t;
    public s20.s20$g u;
    public boolean v;
    public final r20 w;
    public final List<j3p> x;
    public final qsb<j3p, fzv> y;
    
    static {
        Companion = new s20.s20$d();
        z = new int[] { 2131427389, 2131427390, 2131427401, 2131427412, 2131427415, 2131427416, 2131427417, 2131427418, 2131427419, 2131427420, 2131427391, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427400, 2131427402, 2131427403, 2131427404, 2131427405, 2131427406, 2131427407, 2131427408, 2131427409, 2131427410, 2131427411, 2131427413, 2131427414 };
    }
    
    public s20(final AndroidComposeView d) {
        czd.f((Object)d, "view");
        this.d = d;
        this.e = Integer.MIN_VALUE;
        final Object systemService = ((View)d).getContext().getSystemService("accessibility");
        czd.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f = (AccessibilityManager)systemService;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new og(new s20.s20$e(this));
        this.i = Integer.MIN_VALUE;
        this.j = (u0r<u0r<CharSequence>>)new u0r();
        this.k = (u0r<Map<CharSequence, Integer>>)new u0r();
        this.l = -1;
        this.n = (ys0<vve>)new ys0(0);
        this.o = (xa)g97.e(-1, (vq2)null, 6);
        this.p = true;
        final k2a d2 = k2a.D0;
        this.r = (Map<Integer, xgp>)d2;
        this.s = (ys0<Integer>)new ys0(0);
        this.t = new LinkedHashMap();
        this.u = new s20.s20$g(d.getSemanticsOwner().a(), (Map)d2);
        ((View)d).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new s20$a(this));
        this.w = new r20((Object)this, 0);
        this.x = new ArrayList();
        this.y = new s20$j(this);
    }
    
    public static boolean B(final s20 s20, final int n, final int n2, Integer n3, final int n4) {
        if ((n4 & 0x4) != 0x0) {
            n3 = null;
        }
        return s20.A(n, n2, n3, null);
    }
    
    public static final boolean u(final r2p r2p, final float n) {
        return (n < 0.0f && ((Number)r2p.a.invoke()).floatValue() > 0.0f) || (n > 0.0f && ((Number)r2p.a.invoke()).floatValue() < ((Number)r2p.b.invoke()).floatValue());
    }
    
    public static final float v(float n, final float n2) {
        if (Math.signum(n) == Math.signum(n2)) {
            if (Math.abs(n) >= Math.abs(n2)) {
                n = n2;
            }
        }
        else {
            n = 0.0f;
        }
        return n;
    }
    
    public static final boolean w(final r2p r2p) {
        return (((Number)r2p.a.invoke()).floatValue() > 0.0f && !r2p.c) || (((Number)r2p.a.invoke()).floatValue() < ((Number)r2p.b.invoke()).floatValue() && r2p.c);
    }
    
    public static final boolean x(final r2p r2p) {
        return (((Number)r2p.a.invoke()).floatValue() < ((Number)r2p.b.invoke()).floatValue() && !r2p.c) || (((Number)r2p.a.invoke()).floatValue() > 0.0f && r2p.c);
    }
    
    public final boolean A(final int n, final int n2, final Integer n3, final List<String> list) {
        if (n != Integer.MIN_VALUE && this.s()) {
            final AccessibilityEvent l = this.l(n, n2);
            if (n3 != null) {
                l.setContentChangeTypes((int)n3);
            }
            if (list != null) {
                ((AccessibilityRecord)l).setContentDescription((CharSequence)uoz.z((List)list));
            }
            return this.z(l);
        }
        return false;
    }
    
    public final void C(final int n, final int contentChangeTypes, final String s) {
        final AccessibilityEvent l = this.l(this.y(n), 32);
        l.setContentChangeTypes(contentChangeTypes);
        if (s != null) {
            ((AccessibilityRecord)l).getText().add(s);
        }
        this.z(l);
    }
    
    public final void D(final int n) {
        final s20.s20$f q = this.q;
        if (q != null) {
            if (n != q.a.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - q.f <= 1000L) {
                final AccessibilityEvent l = this.l(this.y(q.a.g), 131072);
                ((AccessibilityRecord)l).setFromIndex(q.d);
                ((AccessibilityRecord)l).setToIndex(q.e);
                l.setAction(q.b);
                l.setMovementGranularity(q.c);
                ((AccessibilityRecord)l).getText().add(this.q(q.a));
                this.z(l);
            }
        }
        this.q = null;
    }
    
    public final void E(final j3p j3p) {
        if (!j3p.E0.contains(j3p)) {
            return;
        }
        this.d.getSnapshotObserver().d((arj)j3p, (qsb)this.y, (nsb)new s20$i(j3p, this));
    }
    
    public final void F(wgp wgp, final s20.s20$g s20$g) {
        final LinkedHashSet set = new LinkedHashSet();
        final int n = 0;
        final List e = wgp.e(false);
        for (int size = e.size(), i = 0; i < size; ++i) {
            final wgp wgp2 = e.get(i);
            if (this.p().containsKey(wgp2.g)) {
                if (!s20$g.b.contains(wgp2.g)) {
                    this.t(wgp.c);
                    return;
                }
                set.add(wgp2.g);
            }
        }
        final Iterator iterator = s20$g.b.iterator();
        while (iterator.hasNext()) {
            if (!set.contains(((Number)iterator.next()).intValue())) {
                this.t(wgp.c);
                return;
            }
        }
        final List e2 = wgp.e(false);
        for (int size2 = e2.size(), j = n; j < size2; ++j) {
            wgp = (wgp)e2.get(j);
            if (this.p().containsKey(wgp.g)) {
                final s20.s20$g value = this.t.get(wgp.g);
                czd.c((Object)value);
                this.F(wgp, value);
            }
        }
    }
    
    public final void G(vve m, final ys0<Integer> ys0) {
        if (!m.H()) {
            return;
        }
        if (this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(m)) {
            return;
        }
        tgp e0;
        if ((e0 = rp9.e0(m)) == null) {
            final vve i = w9i.m(m, (qsb)s20$l.D0);
            tgp e2;
            if (i != null) {
                e2 = rp9.e0(i);
            }
            else {
                e2 = null;
            }
            e0 = e2;
            if (e2 == null) {
                return;
            }
        }
        Object o = e0;
        if (!msy.f(e0).E0) {
            m = w9i.m(m, (qsb)s20$k.D0);
            o = e0;
            if (m != null) {
                final tgp e3 = rp9.e0(m);
                o = e0;
                if (e3 != null) {
                    o = e3;
                }
            }
        }
        final int e4 = wd.y((yl8)o).E0;
        if (!ys0.add((Object)e4)) {
            return;
        }
        B(this, this.y(e4), 2048, 1, 8);
    }
    
    public final boolean H(final wgp wgp, int l, int y, final boolean b) {
        final pgp f = wgp.f;
        final ogp a = ogp.a;
        final ehp h = ogp.h;
        final boolean g = f.g(h);
        final int n = 0;
        boolean booleanValue = false;
        if (g && w9i.c(wgp)) {
            final itb itb = (itb)((of)wgp.f.j(h)).b;
            if (itb != null) {
                booleanValue = (boolean)itb.h0((Object)l, (Object)y, (Object)b);
            }
            return booleanValue;
        }
        if (l == y && y == this.l) {
            return false;
        }
        final String q = this.q(wgp);
        if (q == null) {
            return false;
        }
        if (l < 0 || l != y || y > q.length()) {
            l = -1;
        }
        this.l = l;
        l = n;
        if (q.length() > 0) {
            l = 1;
        }
        y = this.y(wgp.g);
        Integer value = null;
        Integer value2;
        if (l != 0) {
            value2 = this.l;
        }
        else {
            value2 = null;
        }
        Integer value3;
        if (l != 0) {
            value3 = this.l;
        }
        else {
            value3 = null;
        }
        if (l != 0) {
            value = q.length();
        }
        this.z(this.m(y, value2, value3, value, q));
        this.D(wgp.g);
        return true;
    }
    
    public final <T extends CharSequence> T I(final T t, int length) {
        if (t != null && t.length() != 0) {
            length = 0;
        }
        else {
            length = 1;
        }
        CharSequence subSequence = t;
        if (length == 0) {
            length = t.length();
            final int n = 100000;
            if (length <= 100000) {
                subSequence = t;
            }
            else {
                length = n;
                if (Character.isHighSurrogate(t.charAt(99999))) {
                    length = n;
                    if (Character.isLowSurrogate(t.charAt(100000))) {
                        length = 99999;
                    }
                }
                subSequence = t.subSequence(0, length);
                czd.d((Object)subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            }
        }
        return (T)subSequence;
    }
    
    public final void J(final int e) {
        final int e2 = this.e;
        if (e2 == e) {
            return;
        }
        B(this, this.e = e, 128, null, 12);
        B(this, e2, 256, null, 12);
    }
    
    public final og b(final View view) {
        czd.f((Object)view, "host");
        return this.h;
    }
    
    public final Object j(final go6<? super fzv> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Ls20$h;
        //     4: ifeq            38
        //     7: aload_1        
        //     8: checkcast       Ls20$h;
        //    11: astore          4
        //    13: aload           4
        //    15: getfield        s20$h.I0:I
        //    18: istore_2       
        //    19: iload_2        
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            38
        //    26: aload           4
        //    28: iload_2        
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        s20$h.I0:I
        //    35: goto            49
        //    38: new             Ls20$h;
        //    41: dup            
        //    42: aload_0        
        //    43: aload_1        
        //    44: invokespecial   s20$h.<init>:(Ls20;Lgo6;)V
        //    47: astore          4
        //    49: aload           4
        //    51: getfield        s20$h.G0:Ljava/lang/Object;
        //    54: astore          9
        //    56: getstatic       dy6.D0:Ldy6;
        //    59: astore          10
        //    61: aload           4
        //    63: getfield        s20$h.I0:I
        //    66: istore_2       
        //    67: iload_2        
        //    68: ifeq            178
        //    71: iload_2        
        //    72: iconst_1       
        //    73: if_icmpeq       134
        //    76: iload_2        
        //    77: iconst_2       
        //    78: if_icmpne       123
        //    81: aload           4
        //    83: getfield        s20$h.F0:Lrp3;
        //    86: astore          7
        //    88: aload           4
        //    90: getfield        s20$h.E0:Lys0;
        //    93: astore          6
        //    95: aload           4
        //    97: getfield        s20$h.D0:Ls20;
        //   100: astore          5
        //   102: aload           5
        //   104: astore_1       
        //   105: aload           9
        //   107: invokestatic    b1n.u:(Ljava/lang/Object;)V
        //   110: aload           6
        //   112: astore_1       
        //   113: aload           4
        //   115: astore          6
        //   117: aload_1        
        //   118: astore          8
        //   120: goto            221
        //   123: new             Ljava/lang/IllegalStateException;
        //   126: dup            
        //   127: ldc_w           "call to 'resume' before 'invoke' with coroutine"
        //   130: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   133: athrow         
        //   134: aload           4
        //   136: getfield        s20$h.F0:Lrp3;
        //   139: astore          7
        //   141: aload           4
        //   143: getfield        s20$h.E0:Lys0;
        //   146: astore          5
        //   148: aload           4
        //   150: getfield        s20$h.D0:Ls20;
        //   153: astore          8
        //   155: aload           8
        //   157: astore_1       
        //   158: aload           9
        //   160: invokestatic    b1n.u:(Ljava/lang/Object;)V
        //   163: aload           4
        //   165: astore          6
        //   167: aload           8
        //   169: astore          4
        //   171: aload           9
        //   173: astore          8
        //   175: goto            298
        //   178: aload           9
        //   180: invokestatic    b1n.u:(Ljava/lang/Object;)V
        //   183: new             Lys0;
        //   186: astore          8
        //   188: aload           8
        //   190: iconst_0       
        //   191: invokespecial   ys0.<init>:(I)V
        //   194: aload_0        
        //   195: getfield        s20.o:Lxa;
        //   198: astore_1       
        //   199: aload_1        
        //   200: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   203: pop            
        //   204: new             Lxa$a;
        //   207: dup            
        //   208: aload_1        
        //   209: invokespecial   xa$a.<init>:(Lxa;)V
        //   212: astore          7
        //   214: aload_0        
        //   215: astore          5
        //   217: aload           4
        //   219: astore          6
        //   221: aload           5
        //   223: astore_1       
        //   224: aload           6
        //   226: aload           5
        //   228: putfield        s20$h.D0:Ls20;
        //   231: aload           5
        //   233: astore_1       
        //   234: aload           6
        //   236: aload           8
        //   238: putfield        s20$h.E0:Lys0;
        //   241: aload           5
        //   243: astore_1       
        //   244: aload           6
        //   246: aload           7
        //   248: putfield        s20$h.F0:Lrp3;
        //   251: aload           5
        //   253: astore_1       
        //   254: aload           6
        //   256: iconst_1       
        //   257: putfield        s20$h.I0:I
        //   260: aload           5
        //   262: astore_1       
        //   263: aload           7
        //   265: aload           6
        //   267: invokeinterface rp3.a:(Lgo6;)Ljava/lang/Object;
        //   272: astore          4
        //   274: aload           4
        //   276: aload           10
        //   278: if_acmpne       284
        //   281: aload           10
        //   283: areturn        
        //   284: aload           8
        //   286: astore_1       
        //   287: aload           4
        //   289: astore          8
        //   291: aload           5
        //   293: astore          4
        //   295: aload_1        
        //   296: astore          5
        //   298: aload           4
        //   300: astore_1       
        //   301: aload           8
        //   303: checkcast       Ljava/lang/Boolean;
        //   306: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   309: ifeq            527
        //   312: aload           4
        //   314: astore_1       
        //   315: aload           7
        //   317: invokeinterface rp3.next:()Ljava/lang/Object;
        //   322: pop            
        //   323: aload           4
        //   325: astore_1       
        //   326: aload           4
        //   328: invokevirtual   s20.s:()Z
        //   331: ifeq            442
        //   334: aload           4
        //   336: astore_1       
        //   337: aload           4
        //   339: getfield        s20.n:Lys0;
        //   342: getfield        ys0.F0:I
        //   345: istore_3       
        //   346: iconst_0       
        //   347: istore_2       
        //   348: iload_2        
        //   349: iload_3        
        //   350: if_icmpge       397
        //   353: aload           4
        //   355: astore_1       
        //   356: aload           4
        //   358: getfield        s20.n:Lys0;
        //   361: getfield        ys0.E0:[Ljava/lang/Object;
        //   364: iload_2        
        //   365: aaload         
        //   366: astore          8
        //   368: aload           4
        //   370: astore_1       
        //   371: aload           8
        //   373: invokestatic    czd.c:(Ljava/lang/Object;)V
        //   376: aload           4
        //   378: astore_1       
        //   379: aload           4
        //   381: aload           8
        //   383: checkcast       Lvve;
        //   386: aload           5
        //   388: invokevirtual   s20.G:(Lvve;Lys0;)V
        //   391: iinc            2, 1
        //   394: goto            348
        //   397: aload           4
        //   399: astore_1       
        //   400: aload           5
        //   402: invokevirtual   ys0.clear:()V
        //   405: aload           4
        //   407: astore_1       
        //   408: aload           4
        //   410: getfield        s20.v:Z
        //   413: ifne            442
        //   416: aload           4
        //   418: astore_1       
        //   419: aload           4
        //   421: iconst_1       
        //   422: putfield        s20.v:Z
        //   425: aload           4
        //   427: astore_1       
        //   428: aload           4
        //   430: getfield        s20.g:Landroid/os/Handler;
        //   433: aload           4
        //   435: getfield        s20.w:Lr20;
        //   438: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   441: pop            
        //   442: aload           4
        //   444: astore_1       
        //   445: aload           4
        //   447: getfield        s20.n:Lys0;
        //   450: invokevirtual   ys0.clear:()V
        //   453: aload           4
        //   455: astore_1       
        //   456: aload           6
        //   458: aload           4
        //   460: putfield        s20$h.D0:Ls20;
        //   463: aload           4
        //   465: astore_1       
        //   466: aload           6
        //   468: aload           5
        //   470: putfield        s20$h.E0:Lys0;
        //   473: aload           4
        //   475: astore_1       
        //   476: aload           6
        //   478: aload           7
        //   480: putfield        s20$h.F0:Lrp3;
        //   483: aload           4
        //   485: astore_1       
        //   486: aload           6
        //   488: iconst_2       
        //   489: putfield        s20$h.I0:I
        //   492: aload           4
        //   494: astore_1       
        //   495: ldc2_w          100
        //   498: aload           6
        //   500: invokestatic    g63.q:(JLgo6;)Ljava/lang/Object;
        //   503: astore          8
        //   505: aload           5
        //   507: astore_1       
        //   508: aload           4
        //   510: astore          5
        //   512: aload           8
        //   514: aload           10
        //   516: if_acmpne       117
        //   519: aload           10
        //   521: areturn        
        //   522: astore          4
        //   524: goto            543
        //   527: aload           4
        //   529: getfield        s20.n:Lys0;
        //   532: invokevirtual   ys0.clear:()V
        //   535: getstatic       fzv.a:Lfzv;
        //   538: areturn        
        //   539: astore          4
        //   541: aload_0        
        //   542: astore_1       
        //   543: aload_1        
        //   544: getfield        s20.n:Lys0;
        //   547: invokevirtual   ys0.clear:()V
        //   550: aload           4
        //   552: athrow         
        //    Signature:
        //  (Lgo6<-Lfzv;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  105    110    522    527    Any
        //  158    163    522    527    Any
        //  183    214    539    543    Any
        //  224    231    522    527    Any
        //  234    241    522    527    Any
        //  244    251    522    527    Any
        //  254    260    522    527    Any
        //  263    274    522    527    Any
        //  301    312    522    527    Any
        //  315    323    522    527    Any
        //  326    334    522    527    Any
        //  337    346    522    527    Any
        //  356    368    522    527    Any
        //  371    376    522    527    Any
        //  379    391    522    527    Any
        //  400    405    522    527    Any
        //  408    416    522    527    Any
        //  419    425    522    527    Any
        //  428    442    522    527    Any
        //  445    453    522    527    Any
        //  456    463    522    527    Any
        //  466    473    522    527    Any
        //  476    483    522    527    Any
        //  486    492    522    527    Any
        //  495    505    522    527    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0221:
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
    
    public final boolean k(final boolean b, final int n, final long n2) {
        final Collection<xgp> values = this.p().values();
        czd.f((Object)values, "currentSemanticsNodes");
        Objects.requireNonNull(wfj.Companion);
        final boolean b2 = wfj.b(n2, wfj.d);
        boolean b4;
        final boolean b3 = b4 = false;
        if (!b2) {
            if (Float.isNaN(wfj.d(n2)) || Float.isNaN(wfj.e(n2))) {
                throw new IllegalStateException("Offset argument contained a NaN value.".toString());
            }
            ehp ehp;
            if (b) {
                final zgp a = zgp.a;
                ehp = zgp.o;
            }
            else {
                if (b) {
                    throw new NoWhenBranchMatchedException();
                }
                final zgp a2 = zgp.a;
                ehp = zgp.n;
            }
            if (values.isEmpty()) {
                b4 = b3;
            }
            else {
                final Iterator<Object> iterator = values.iterator();
                boolean b5;
                do {
                    b4 = b3;
                    if (!iterator.hasNext()) {
                        return b4;
                    }
                    final xgp xgp = iterator.next();
                    if (rp9.R0(xgp.b).a(n2)) {
                        final r2p r2p = qgp.a(xgp.a.f(), (ehp<r2p>)ehp);
                        if (r2p != null) {
                            final boolean c = r2p.c;
                            int n3;
                            if (c) {
                                n3 = -n;
                            }
                            else {
                                n3 = n;
                            }
                            int n4 = n3;
                            if (n == 0) {
                                n4 = n3;
                                if (c) {
                                    n4 = -1;
                                }
                            }
                            if ((n4 >= 0) ? (((Number)r2p.a.invoke()).floatValue() < ((Number)r2p.b.invoke()).floatValue()) : (((Number)r2p.a.invoke()).floatValue() > 0.0f)) {
                                b5 = true;
                                continue;
                            }
                        }
                    }
                    b5 = false;
                } while (!b5);
                b4 = true;
            }
        }
        return b4;
    }
    
    public final AccessibilityEvent l(final int n, final int n2) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
        czd.e((Object)obtain, "obtain(eventType)");
        ((AccessibilityRecord)obtain).setEnabled(true);
        ((AccessibilityRecord)obtain).setClassName((CharSequence)"android.view.View");
        obtain.setPackageName((CharSequence)((View)this.d).getContext().getPackageName());
        ((AccessibilityRecord)obtain).setSource((View)this.d, n);
        final xgp xgp = this.p().get(n);
        if (xgp != null) {
            final pgp f = xgp.a.f();
            final zgp a = zgp.a;
            ((AccessibilityRecord)obtain).setPassword(f.g(zgp.z));
        }
        return obtain;
    }
    
    public final AccessibilityEvent m(final int n, final Integer n2, final Integer n3, final Integer n4, final String s) {
        final AccessibilityEvent l = this.l(n, 8192);
        if (n2 != null) {
            ((AccessibilityRecord)l).setFromIndex(n2.intValue());
        }
        if (n3 != null) {
            ((AccessibilityRecord)l).setToIndex(n3.intValue());
        }
        if (n4 != null) {
            ((AccessibilityRecord)l).setItemCount(n4.intValue());
        }
        if (s != null) {
            ((AccessibilityRecord)l).getText().add(s);
        }
        return l;
    }
    
    public final int n(final wgp wgp) {
        final pgp f = wgp.f;
        final zgp a = zgp.a;
        if (!f.g(zgp.b)) {
            final pgp f2 = wgp.f;
            final ehp v = zgp.v;
            if (f2.g(v)) {
                return hjs.d(((hjs)wgp.f.j(v)).a);
            }
        }
        return this.l;
    }
    
    public final int o(final wgp wgp) {
        final pgp f = wgp.f;
        final zgp a = zgp.a;
        if (!f.g(zgp.b)) {
            final pgp f2 = wgp.f;
            final ehp v = zgp.v;
            if (f2.g(v)) {
                return (int)(((hjs)wgp.f.j(v)).a >> 32);
            }
        }
        return this.l;
    }
    
    public final Map<Integer, xgp> p() {
        if (this.p) {
            final ygp semanticsOwner = this.d.getSemanticsOwner();
            czd.f((Object)semanticsOwner, "<this>");
            final wgp a = semanticsOwner.a();
            final LinkedHashMap r = new LinkedHashMap();
            final vve c = a.c;
            if (c.V0) {
                if (c.H()) {
                    final Region region = new Region();
                    region.set(rp9.Q0(a.d()));
                    w9i.n(region, a, r, a);
                }
            }
            this.r = r;
            this.p = false;
        }
        return this.r;
    }
    
    public final String q(final wgp wgp) {
        final String s = null;
        final String s2 = null;
        if (wgp == null) {
            return null;
        }
        final pgp f = wgp.f;
        final zgp a = zgp.a;
        final ehp b = zgp.b;
        if (f.g(b)) {
            return uoz.z((List)wgp.f.j(b));
        }
        if (w9i.g(wgp)) {
            final xc0 r = this.r(wgp.f);
            String d0 = s2;
            if (r != null) {
                d0 = r.D0;
            }
            return d0;
        }
        final List list = qgp.a(wgp.f, (ehp<List>)zgp.t);
        String d2 = s;
        if (list != null) {
            final xc0 xc0 = (xc0)mq4.i0((List)list);
            d2 = s;
            if (xc0 != null) {
                d2 = xc0.D0;
            }
        }
        return d2;
    }
    
    public final xc0 r(final pgp pgp) {
        final zgp a = zgp.a;
        return qgp.a(pgp, (ehp<xc0>)zgp.u);
    }
    
    public final boolean s() {
        return this.f.isEnabled() && this.f.isTouchExplorationEnabled();
    }
    
    public final void t(final vve vve) {
        if (this.n.add((Object)vve)) {
            ((td)this.o).n((Object)fzv.a);
        }
    }
    
    public final int y(final int n) {
        int n2 = n;
        if (n == this.d.getSemanticsOwner().a().g) {
            n2 = -1;
        }
        return n2;
    }
    
    public final boolean z(final AccessibilityEvent accessibilityEvent) {
        return this.s() && ((View)this.d).getParent().requestSendAccessibilityEvent((View)this.d, accessibilityEvent);
    }
}
