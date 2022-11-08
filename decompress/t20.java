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

public final class t20 extends wf
{
    public static final t20.t20$d Companion;
    public static final int[] z;
    public final AndroidComposeView d;
    public int e;
    public final AccessibilityManager f;
    public final Handler g;
    public pg h;
    public int i;
    public a0r<a0r<CharSequence>> j;
    public a0r<Map<CharSequence, Integer>> k;
    public int l;
    public Integer m;
    public final ft0<jwe> n;
    public final pp3<oyv> o;
    public boolean p;
    public t20.t20$f q;
    public Map<Integer, fgp> r;
    public ft0<Integer> s;
    public Map<Integer, t20.t20$g> t;
    public t20.t20$g u;
    public boolean v;
    public final s20 w;
    public final List<r2p> x;
    public final rtb<r2p, oyv> y;
    
    static {
        Companion = new t20.t20$d();
        z = new int[] { 2131427389, 2131427390, 2131427401, 2131427412, 2131427415, 2131427416, 2131427417, 2131427418, 2131427419, 2131427420, 2131427391, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427400, 2131427402, 2131427403, 2131427404, 2131427405, 2131427406, 2131427407, 2131427408, 2131427409, 2131427410, 2131427411, 2131427413, 2131427414 };
    }
    
    public t20(final AndroidComposeView d) {
        zzd.f((Object)d, "view");
        this.d = d;
        this.e = Integer.MIN_VALUE;
        final Object systemService = ((View)d).getContext().getSystemService("accessibility");
        zzd.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f = (AccessibilityManager)systemService;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new pg(new t20.t20$e(this));
        this.i = Integer.MIN_VALUE;
        this.j = (a0r<a0r<CharSequence>>)new a0r();
        this.k = (a0r<Map<CharSequence, Integer>>)new a0r();
        this.l = -1;
        this.n = (ft0<jwe>)new ft0(0);
        this.o = (za)asy.e(-1, (er2)null, 6);
        this.p = true;
        final a3a c0 = a3a.C0;
        this.r = (Map<Integer, fgp>)c0;
        this.s = (ft0<Integer>)new ft0(0);
        this.t = new LinkedHashMap();
        this.u = new t20.t20$g(d.getSemanticsOwner().a(), (Map)c0);
        ((View)d).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new t20$a(this));
        this.w = new s20((Object)this, 0);
        this.x = new ArrayList();
        this.y = new t20$j(this);
    }
    
    public static /* synthetic */ boolean B(final t20 t20, final int n, final int n2, Integer n3, final int n4) {
        if ((n4 & 0x4) != 0x0) {
            n3 = null;
        }
        return t20.A(n, n2, n3, null);
    }
    
    public static final boolean u(final a2p a2p, final float n) {
        return (n < 0.0f && ((Number)a2p.a.invoke()).floatValue() > 0.0f) || (n > 0.0f && ((Number)a2p.a.invoke()).floatValue() < ((Number)a2p.b.invoke()).floatValue());
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
    
    public static final boolean w(final a2p a2p) {
        return (((Number)a2p.a.invoke()).floatValue() > 0.0f && !a2p.c) || (((Number)a2p.a.invoke()).floatValue() < ((Number)a2p.b.invoke()).floatValue() && a2p.c);
    }
    
    public static final boolean x(final a2p a2p) {
        return (((Number)a2p.a.invoke()).floatValue() < ((Number)a2p.b.invoke()).floatValue() && !a2p.c) || (((Number)a2p.a.invoke()).floatValue() > 0.0f && a2p.c);
    }
    
    public final boolean A(final int n, final int n2, final Integer n3, final List<String> list) {
        if (n != Integer.MIN_VALUE && this.s()) {
            final AccessibilityEvent l = this.l(n, n2);
            if (n3 != null) {
                l.setContentChangeTypes((int)n3);
            }
            if (list != null) {
                ((AccessibilityRecord)l).setContentDescription((CharSequence)fk7.z(list));
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
        final t20.t20$f q = this.q;
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
    
    public final void E(final r2p r2p) {
        if (!r2p.D0.contains(r2p)) {
            return;
        }
        this.d.getSnapshotObserver().d(r2p, (rtb<? super r2p, oyv>)this.y, (otb<oyv>)new t20$i(r2p, this));
    }
    
    public final void F(final egp egp, final t20.t20$g t20$g) {
        final LinkedHashSet set = new LinkedHashSet();
        final int n = 0;
        final List e = egp.e(false);
        for (int size = e.size(), i = 0; i < size; ++i) {
            final egp egp2 = e.get(i);
            if (this.p().containsKey(egp2.g)) {
                if (!t20$g.b.contains(egp2.g)) {
                    this.t(egp.c);
                    return;
                }
                set.add(egp2.g);
            }
        }
        final Iterator iterator = t20$g.b.iterator();
        while (iterator.hasNext()) {
            if (!set.contains(((Number)iterator.next()).intValue())) {
                this.t(egp.c);
                return;
            }
        }
        final List e2 = egp.e(false);
        for (int size2 = e2.size(), j = n; j < size2; ++j) {
            final egp egp3 = e2.get(j);
            if (this.p().containsKey(egp3.g)) {
                final Object value = this.t.get(egp3.g);
                zzd.c(value);
                this.F(egp3, (t20.t20$g)value);
            }
        }
    }
    
    public final void G(jwe k, final ft0<Integer> ft0) {
        if (!k.H()) {
            return;
        }
        if (this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(k)) {
            return;
        }
        bgp q;
        if ((q = dml.Q(k)) == null) {
            final jwe i = k3j.k(k, (rtb)t20$l.C0);
            bgp q2;
            if (i != null) {
                q2 = dml.Q(i);
            }
            else {
                q2 = null;
            }
            q = q2;
            if (q2 == null) {
                return;
            }
        }
        Object o = q;
        if (!asy.r(q).D0) {
            k = k3j.k(k, (rtb)t20$k.C0);
            o = q;
            if (k != null) {
                final bgp q3 = dml.Q(k);
                o = q;
                if (q3 != null) {
                    o = q3;
                }
            }
        }
        final int d0 = ukg.U0((pm8)o).D0;
        if (!ft0.add((Object)d0)) {
            return;
        }
        B(this, this.y(d0), 2048, 1, 8);
    }
    
    public final boolean H(final egp egp, int l, int y, final boolean b) {
        final xfp f = egp.f;
        final wfp a = wfp.a;
        final mgp h = wfp.h;
        final boolean g = f.g(h);
        final int n = 0;
        boolean booleanValue = false;
        if (g && k3j.a(egp)) {
            final jub jub = (jub)((qf)egp.f.j(h)).b;
            if (jub != null) {
                booleanValue = (boolean)jub.h0((Object)l, (Object)y, (Object)b);
            }
            return booleanValue;
        }
        if (l == y && y == this.l) {
            return false;
        }
        final String q = this.q(egp);
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
        y = this.y(egp.g);
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
        this.D(egp.g);
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
                zzd.d((Object)subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
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
    
    public final pg b(final View view) {
        zzd.f((Object)view, "host");
        return this.h;
    }
    
    public final Object j(final ap6<? super oyv> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lt20$h;
        //     4: ifeq            35
        //     7: aload_1        
        //     8: checkcast       Lt20$h;
        //    11: astore_2       
        //    12: aload_2        
        //    13: getfield        t20$h.H0:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            35
        //    24: aload_2        
        //    25: iload_3        
        //    26: ldc             -2147483648
        //    28: iadd           
        //    29: putfield        t20$h.H0:I
        //    32: goto            45
        //    35: new             Lt20$h;
        //    38: dup            
        //    39: aload_0        
        //    40: aload_1        
        //    41: invokespecial   t20$h.<init>:(Lt20;Lap6;)V
        //    44: astore_2       
        //    45: aload_2        
        //    46: getfield        t20$h.F0:Ljava/lang/Object;
        //    49: astore          4
        //    51: getstatic       zy6.C0:Lzy6;
        //    54: astore          5
        //    56: aload_2        
        //    57: getfield        t20$h.H0:I
        //    60: istore_3       
        //    61: iload_3        
        //    62: ifeq            163
        //    65: iload_3        
        //    66: iconst_1       
        //    67: if_icmpeq       124
        //    70: iload_3        
        //    71: iconst_2       
        //    72: if_icmpne       113
        //    75: aload_2        
        //    76: getfield        t20$h.E0:Ljq3;
        //    79: astore          6
        //    81: aload_2        
        //    82: getfield        t20$h.D0:Lft0;
        //    85: astore          7
        //    87: aload_2        
        //    88: getfield        t20$h.C0:Lt20;
        //    91: astore          8
        //    93: aload           8
        //    95: astore_1       
        //    96: aload           4
        //    98: invokestatic    kq9.b1:(Ljava/lang/Object;)V
        //   101: aload           7
        //   103: astore_1       
        //   104: aload_2        
        //   105: astore          7
        //   107: aload_1        
        //   108: astore          9
        //   110: goto            205
        //   113: new             Ljava/lang/IllegalStateException;
        //   116: dup            
        //   117: ldc_w           "call to 'resume' before 'invoke' with coroutine"
        //   120: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   123: athrow         
        //   124: aload_2        
        //   125: getfield        t20$h.E0:Ljq3;
        //   128: astore          6
        //   130: aload_2        
        //   131: getfield        t20$h.D0:Lft0;
        //   134: astore          8
        //   136: aload_2        
        //   137: getfield        t20$h.C0:Lt20;
        //   140: astore          9
        //   142: aload           9
        //   144: astore_1       
        //   145: aload           4
        //   147: invokestatic    kq9.b1:(Ljava/lang/Object;)V
        //   150: aload_2        
        //   151: astore          7
        //   153: aload           9
        //   155: astore_2       
        //   156: aload           4
        //   158: astore          9
        //   160: goto            278
        //   163: aload           4
        //   165: invokestatic    kq9.b1:(Ljava/lang/Object;)V
        //   168: new             Lft0;
        //   171: astore          9
        //   173: aload           9
        //   175: iconst_0       
        //   176: invokespecial   ft0.<init>:(I)V
        //   179: aload_0        
        //   180: getfield        t20.o:Lza;
        //   183: astore_1       
        //   184: aload_1        
        //   185: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   188: pop            
        //   189: new             Lza$a;
        //   192: dup            
        //   193: aload_1        
        //   194: invokespecial   za$a.<init>:(Lza;)V
        //   197: astore          6
        //   199: aload_0        
        //   200: astore          8
        //   202: aload_2        
        //   203: astore          7
        //   205: aload           8
        //   207: astore_1       
        //   208: aload           7
        //   210: aload           8
        //   212: putfield        t20$h.C0:Lt20;
        //   215: aload           8
        //   217: astore_1       
        //   218: aload           7
        //   220: aload           9
        //   222: putfield        t20$h.D0:Lft0;
        //   225: aload           8
        //   227: astore_1       
        //   228: aload           7
        //   230: aload           6
        //   232: putfield        t20$h.E0:Ljq3;
        //   235: aload           8
        //   237: astore_1       
        //   238: aload           7
        //   240: iconst_1       
        //   241: putfield        t20$h.H0:I
        //   244: aload           8
        //   246: astore_1       
        //   247: aload           6
        //   249: aload           7
        //   251: invokeinterface jq3.a:(Lap6;)Ljava/lang/Object;
        //   256: astore_2       
        //   257: aload_2        
        //   258: aload           5
        //   260: if_acmpne       266
        //   263: aload           5
        //   265: areturn        
        //   266: aload           9
        //   268: astore_1       
        //   269: aload_2        
        //   270: astore          9
        //   272: aload           8
        //   274: astore_2       
        //   275: aload_1        
        //   276: astore          8
        //   278: aload_2        
        //   279: astore_1       
        //   280: aload           9
        //   282: checkcast       Ljava/lang/Boolean;
        //   285: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   288: ifeq            480
        //   291: aload_2        
        //   292: astore_1       
        //   293: aload           6
        //   295: invokeinterface jq3.next:()Ljava/lang/Object;
        //   300: pop            
        //   301: aload_2        
        //   302: astore_1       
        //   303: aload_2        
        //   304: invokevirtual   t20.s:()Z
        //   307: ifeq            405
        //   310: aload_2        
        //   311: astore_1       
        //   312: aload_2        
        //   313: getfield        t20.n:Lft0;
        //   316: getfield        ft0.E0:I
        //   319: istore          10
        //   321: iconst_0       
        //   322: istore_3       
        //   323: iload_3        
        //   324: iload           10
        //   326: if_icmpge       368
        //   329: aload_2        
        //   330: astore_1       
        //   331: aload_2        
        //   332: getfield        t20.n:Lft0;
        //   335: getfield        ft0.D0:[Ljava/lang/Object;
        //   338: iload_3        
        //   339: aaload         
        //   340: astore          9
        //   342: aload_2        
        //   343: astore_1       
        //   344: aload           9
        //   346: invokestatic    zzd.c:(Ljava/lang/Object;)V
        //   349: aload_2        
        //   350: astore_1       
        //   351: aload_2        
        //   352: aload           9
        //   354: checkcast       Ljwe;
        //   357: aload           8
        //   359: invokevirtual   t20.G:(Ljwe;Lft0;)V
        //   362: iinc            3, 1
        //   365: goto            323
        //   368: aload_2        
        //   369: astore_1       
        //   370: aload           8
        //   372: invokevirtual   ft0.clear:()V
        //   375: aload_2        
        //   376: astore_1       
        //   377: aload_2        
        //   378: getfield        t20.v:Z
        //   381: ifne            405
        //   384: aload_2        
        //   385: astore_1       
        //   386: aload_2        
        //   387: iconst_1       
        //   388: putfield        t20.v:Z
        //   391: aload_2        
        //   392: astore_1       
        //   393: aload_2        
        //   394: getfield        t20.g:Landroid/os/Handler;
        //   397: aload_2        
        //   398: getfield        t20.w:Ls20;
        //   401: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   404: pop            
        //   405: aload_2        
        //   406: astore_1       
        //   407: aload_2        
        //   408: getfield        t20.n:Lft0;
        //   411: invokevirtual   ft0.clear:()V
        //   414: aload_2        
        //   415: astore_1       
        //   416: aload           7
        //   418: aload_2        
        //   419: putfield        t20$h.C0:Lt20;
        //   422: aload_2        
        //   423: astore_1       
        //   424: aload           7
        //   426: aload           8
        //   428: putfield        t20$h.D0:Lft0;
        //   431: aload_2        
        //   432: astore_1       
        //   433: aload           7
        //   435: aload           6
        //   437: putfield        t20$h.E0:Ljq3;
        //   440: aload_2        
        //   441: astore_1       
        //   442: aload           7
        //   444: iconst_2       
        //   445: putfield        t20$h.H0:I
        //   448: aload_2        
        //   449: astore_1       
        //   450: ldc2_w          100
        //   453: aload           7
        //   455: invokestatic    ajy.q:(JLap6;)Ljava/lang/Object;
        //   458: astore          9
        //   460: aload           8
        //   462: astore_1       
        //   463: aload_2        
        //   464: astore          8
        //   466: aload           9
        //   468: aload           5
        //   470: if_acmpne       107
        //   473: aload           5
        //   475: areturn        
        //   476: astore_2       
        //   477: goto            494
        //   480: aload_2        
        //   481: getfield        t20.n:Lft0;
        //   484: invokevirtual   ft0.clear:()V
        //   487: getstatic       oyv.a:Loyv;
        //   490: areturn        
        //   491: astore_2       
        //   492: aload_0        
        //   493: astore_1       
        //   494: aload_1        
        //   495: getfield        t20.n:Lft0;
        //   498: invokevirtual   ft0.clear:()V
        //   501: aload_2        
        //   502: athrow         
        //    Signature:
        //  (Lap6<-Loyv;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  96     101    476    480    Any
        //  145    150    476    480    Any
        //  168    199    491    494    Any
        //  208    215    476    480    Any
        //  218    225    476    480    Any
        //  228    235    476    480    Any
        //  238    244    476    480    Any
        //  247    257    476    480    Any
        //  280    291    476    480    Any
        //  293    301    476    480    Any
        //  303    310    476    480    Any
        //  312    321    476    480    Any
        //  331    342    476    480    Any
        //  344    349    476    480    Any
        //  351    362    476    480    Any
        //  370    375    476    480    Any
        //  377    384    476    480    Any
        //  386    391    476    480    Any
        //  393    405    476    480    Any
        //  407    414    476    480    Any
        //  416    422    476    480    Any
        //  424    431    476    480    Any
        //  433    440    476    480    Any
        //  442    448    476    480    Any
        //  450    460    476    480    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0205:
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
        final Collection<fgp> values = this.p().values();
        zzd.f((Object)values, "currentSemanticsNodes");
        Objects.requireNonNull(qfj.Companion);
        final boolean b2 = qfj.b(n2, qfj.d);
        boolean b4;
        final boolean b3 = b4 = false;
        if (!b2) {
            if (Float.isNaN(qfj.d(n2)) || Float.isNaN(qfj.e(n2))) {
                throw new IllegalStateException("Offset argument contained a NaN value.".toString());
            }
            mgp mgp;
            if (b) {
                final hgp a = hgp.a;
                mgp = hgp.o;
            }
            else {
                if (b) {
                    throw new NoWhenBranchMatchedException();
                }
                final hgp a2 = hgp.a;
                mgp = hgp.n;
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
                    final fgp fgp = iterator.next();
                    if (dml.A0(fgp.b).a(n2)) {
                        final a2p a2p = (a2p)yfp.a(fgp.a.f(), mgp);
                        if (a2p != null) {
                            final boolean c = a2p.c;
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
                            if ((n4 >= 0) ? (((Number)a2p.a.invoke()).floatValue() < ((Number)a2p.b.invoke()).floatValue()) : (((Number)a2p.a.invoke()).floatValue() > 0.0f)) {
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
        zzd.e((Object)obtain, "obtain(eventType)");
        ((AccessibilityRecord)obtain).setEnabled(true);
        ((AccessibilityRecord)obtain).setClassName((CharSequence)"android.view.View");
        obtain.setPackageName((CharSequence)((View)this.d).getContext().getPackageName());
        ((AccessibilityRecord)obtain).setSource((View)this.d, n);
        final fgp fgp = this.p().get(n);
        if (fgp != null) {
            final xfp f = fgp.a.f();
            final hgp a = hgp.a;
            ((AccessibilityRecord)obtain).setPassword(f.g(hgp.z));
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
    
    public final int n(final egp egp) {
        final xfp f = egp.f;
        final hgp a = hgp.a;
        if (!f.g(hgp.b)) {
            final xfp f2 = egp.f;
            final mgp v = hgp.v;
            if (f2.g(v)) {
                return mis.d(((mis)egp.f.j(v)).a);
            }
        }
        return this.l;
    }
    
    public final int o(final egp egp) {
        final xfp f = egp.f;
        final hgp a = hgp.a;
        if (!f.g(hgp.b)) {
            final xfp f2 = egp.f;
            final mgp v = hgp.v;
            if (f2.g(v)) {
                return (int)(((mis)egp.f.j(v)).a >> 32);
            }
        }
        return this.l;
    }
    
    public final Map<Integer, fgp> p() {
        if (this.p) {
            final ggp semanticsOwner = this.d.getSemanticsOwner();
            zzd.f((Object)semanticsOwner, "<this>");
            final egp a = semanticsOwner.a();
            final LinkedHashMap r = new LinkedHashMap();
            final jwe c = a.c;
            if (c.U0) {
                if (c.H()) {
                    final Region region = new Region();
                    region.set(dml.v0(a.d()));
                    k3j.m(region, a, (Map)r, a);
                }
            }
            this.r = r;
            this.p = false;
        }
        return this.r;
    }
    
    public final String q(final egp egp) {
        final String s = null;
        final String s2 = null;
        if (egp == null) {
            return null;
        }
        final xfp f = egp.f;
        final hgp a = hgp.a;
        final mgp b = hgp.b;
        if (f.g(b)) {
            return fk7.z((List)egp.f.j(b));
        }
        if (k3j.f(egp)) {
            final bd0 r = this.r(egp.f);
            String c0 = s2;
            if (r != null) {
                c0 = r.C0;
            }
            return c0;
        }
        final List list = (List)yfp.a(egp.f, hgp.t);
        String c2 = s;
        if (list != null) {
            final bd0 bd0 = (bd0)or4.I1(list);
            c2 = s;
            if (bd0 != null) {
                c2 = bd0.C0;
            }
        }
        return c2;
    }
    
    public final bd0 r(final xfp xfp) {
        final hgp a = hgp.a;
        return (bd0)yfp.a(xfp, hgp.u);
    }
    
    public final boolean s() {
        return this.f.isEnabled() && this.f.isTouchExplorationEnabled();
    }
    
    public final void t(final jwe jwe) {
        if (this.n.add((Object)jwe)) {
            ((ud)this.o).n((Object)oyv.a);
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
