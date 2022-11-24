import androidx.fragment.app.s;
import android.os.BaseBundle;
import android.app.Activity;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.view.View;
import android.os.ResultReceiver;
import android.content.Context;
import java.util.Set;
import android.net.Uri;
import android.view.MenuItem;
import com.twitter.app.dm.conversation.di.view.DMConversationViewObjectGraph;
import java.util.Objects;
import com.twitter.app.dm.DMConversationContentViewProvider;
import android.view.Menu;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.view.View$OnClickListener;
import com.twitter.ui.view.DraggableDrawerLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aj7 extends kcv implements vo7
{
    public rk7 Z0;
    public hi7 a1;
    public DraggableDrawerLayout b1;
    public final zf7 c1;
    public boolean d1;
    public boolean e1;
    public View$OnClickListener f1;
    
    public aj7(final Intent p0, final k9x p1, final Resources p2, final cbs p3, final mxe<tai> p4, final nn p5, final dob p6, final cbf p7, final cbg p8, final LayoutInflater p9, final fda<h5h> p10, final UserIdentifier p11, final mcv p12, final mxe<ypa> p13, final a7g p14, final o9p p15, final ibm p16, final fci<?> p17, final c8p p18, final zf7 p19, final duo p20, final Bundle p21, final igt p22, final m9p p23, final nlq p24) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: aload           4
        //     6: aload           5
        //     8: aload           6
        //    10: aload           7
        //    12: aload           8
        //    14: aload           9
        //    16: aload           10
        //    18: aload           11
        //    20: aload           12
        //    22: aload           13
        //    24: aload           14
        //    26: aload           15
        //    28: aload           16
        //    30: aload           17
        //    32: aload           18
        //    34: aload           19
        //    36: aload           23
        //    38: invokespecial   kcv.<init>:(Landroid/content/Intent;Lk9x;Landroid/content/res/Resources;Lcbs;Lmxe;Lnn;Ldob;Lcbf;Lcbg;Landroid/view/LayoutInflater;Lfda;Lcom/twitter/util/user/UserIdentifier;Lmcv;Lmxe;La7g;Lo9p;Libm;Lfci;Lc8p;Lm9p;)V
        //    41: aload_0        
        //    42: aload           20
        //    44: putfield        aj7.c1:Lzf7;
        //    47: aload           24
        //    49: getstatic       slq.L0:Lslq;
        //    52: invokeinterface nlq.a:(Lslq;)Z
        //    57: ifeq            65
        //    60: aload_0        
        //    61: invokevirtual   u9.D4:()V
        //    64: return         
        //    65: aload_1        
        //    66: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //    69: astore_1       
        //    70: aload_1        
        //    71: ifnonnull       90
        //    74: aload           22
        //    76: ldc             2131953218
        //    78: iconst_0       
        //    79: invokeinterface igt.c:(II)Lng3;
        //    84: pop            
        //    85: aload_0        
        //    86: invokevirtual   u9.D4:()V
        //    89: return         
        //    90: aload           21
        //    92: new             Lzi7;
        //    95: dup            
        //    96: aload_0        
        //    97: aload_1        
        //    98: invokespecial   zi7.<init>:(Laj7;Landroid/os/Bundle;)V
        //   101: invokeinterface duo.a:(Lgto;)Lb39;
        //   106: pop            
        //   107: aload_0        
        //   108: ldc             2131428735
        //   110: invokevirtual   u9.C4:(I)Landroid/view/View;
        //   113: checkcast       Lcom/twitter/ui/view/DraggableDrawerLayout;
        //   116: astore_1       
        //   117: aload_0        
        //   118: aload_1        
        //   119: putfield        aj7.b1:Lcom/twitter/ui/view/DraggableDrawerLayout;
        //   122: aload_1        
        //   123: iconst_0       
        //   124: invokevirtual   com/twitter/ui/view/DraggableDrawerLayout.f:(Z)V
        //   127: aload           20
        //   129: invokevirtual   zf7.c:()Z
        //   132: ifeq            154
        //   135: aload_0        
        //   136: ldc             2131432127
        //   138: invokevirtual   u9.C4:(I)Landroid/view/View;
        //   141: checkcast       Landroid/widget/ViewSwitcher;
        //   144: astore_1       
        //   145: getstatic       b7x.a:Ljava/util/WeakHashMap;
        //   148: astore_2       
        //   149: aload_1        
        //   150: fconst_0       
        //   151: invokestatic    b7x$i.s:(Landroid/view/View;F)V
        //   154: return         
        //    Signature:
        //  (Landroid/content/Intent;Lk9x;Landroid/content/res/Resources;Lcbs;Lmxe<Ltai;>;Lnn;Ldob;Lcbf;Lcbg;Landroid/view/LayoutInflater;Lfda<Lh5h;>;Lcom/twitter/util/user/UserIdentifier;Lmcv;Lmxe<Lypa;>;La7g;Lo9p;Libm;Lfci<*>;Lc8p;Lzf7;Lduo;Landroid/os/Bundle;Ligt;Lm9p;Lnlq;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 25
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
    
    public final void E3(final boolean d1) {
        this.d1 = d1;
        this.F4().invalidate();
    }
    
    @Override
    public final boolean N2(final zai zai, final Menu menu) {
        if (this.c1.c()) {
            if (this.e1) {
                zai.z(2131689484, menu);
            }
            else {
                zai.z(2131689485, menu);
            }
        }
        super.N2(zai, menu);
        return true;
    }
    
    public final void N4() {
        final zf7 c1 = this.c1;
        final boolean changingConfigurations = ((Activity)super.G0).isChangingConfigurations();
        final boolean x4 = this.X4();
        c1.q.dispose();
        if (!changingConfigurations) {
            c1.a(x4);
        }
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        final zf7 c1 = this.c1;
        final String p = c1.p;
        if (p != null) {
            c1.c.a(c1.b, p);
        }
    }
    
    public final DMConversationContentViewProvider W4() {
        final rk7 z0 = this.Z0;
        DMConversationContentViewProvider i5;
        if (z0 != null) {
            Objects.requireNonNull(z0);
            i5 = ((DMConversationViewObjectGraph)k5b.f((y2e)z0)).i5();
        }
        else {
            i5 = null;
        }
        return i5;
    }
    
    public final boolean X4() {
        final DMConversationContentViewProvider w4 = this.W4();
        final boolean b = false;
        if (w4 == null) {
            return false;
        }
        boolean b2 = b;
        if (this.c1.d()) {
            final boolean b3 = (p0b.A(w4.g1) || !w4.l1) && ((idv)w4).F0() && ((f5e)((idv)w4).v0()).a() == 0;
            b2 = b;
            if (b3) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean b() {
        return !((Activity)super.G0).isDestroyed() && !((Activity)super.G0).isFinishing() && !((Activity)super.G0).isChangingConfigurations() && ((zl1)super.G0).m1;
    }
    
    public final void d1(final View$OnClickListener f1) {
        this.f1 = f1;
    }
    
    public final int d2(final zai zai) {
        final boolean d1 = this.d1;
        final MenuItem item = zai.findItem(2131428356);
        final MenuItem item2 = zai.findItem(2131428347);
        if (item != null) {
            item.setVisible(d1);
        }
        else if (item2 != null) {
            item2.setVisible(d1);
        }
        return 2;
    }
    
    public final void e2(final String s, final String s2, final Uri uri, final String s3, final boolean b) {
        this.c1.h(s, (Set)null, s2, uri, s3, b, false, this.a1.t2().m());
    }
    
    public final void g2(final boolean e1) {
        this.e1 = e1;
        if (e1) {
            this.F4().setTitle(2131953220);
            ((Activity)super.G0).invalidateOptionsMenu();
        }
    }
    
    @Override
    public final boolean k() {
        final zf7 c1 = this.c1;
        final View currentFocus = ((Activity)super.G0).getCurrentFocus();
        final DMConversationContentViewProvider w4 = this.W4();
        boolean b = true;
        boolean b2 = false;
        Label_0095: {
            if (w4 != null) {
                final DMConversationContentViewProvider w5 = this.W4();
                if (w5.r1 && (w5.e2 || w5.c2) && !w5.f2 && !p0b.A(w5.g1)) {
                    b2 = true;
                    break Label_0095;
                }
            }
            b2 = false;
        }
        final boolean x4 = this.X4();
        boolean b3 = false;
        Label_0175: {
            Label_0168: {
                if (!c1.c()) {
                    if (c1.d()) {
                        c1.a(x4);
                        if (!b2) {
                            break Label_0168;
                        }
                        if (currentFocus != null) {
                            hdx.w((Context)c1.a, currentFocus, false, (ResultReceiver)null);
                        }
                    }
                    b3 = true;
                    break Label_0175;
                }
                if (currentFocus != null) {
                    hdx.w((Context)c1.a, currentFocus, false, (ResultReceiver)null);
                }
            }
            b3 = false;
        }
        if ((!super.N0.hasExtra("notification_info") || !((aj1)new vf7(super.N0)).mIntent.getBooleanExtra("extra_up_as_back", false)) && b3) {
            super.T0.d((cn)fgg.a(pgg.P0));
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public final void m0() {
        super.T0.k();
    }
    
    @Override
    public final boolean n(final MenuItem menuItem) {
        if (menuItem.getItemId() != 2131428356) {
            if (menuItem.getItemId() == 2131428347) {
                final View$OnClickListener f1 = this.f1;
                if (f1 != null) {
                    f1.onClick(menuItem.getActionView());
                    return true;
                }
            }
            return super.n(menuItem);
        }
        final zf7 c1 = this.c1;
        final y76 g2 = this.a1.g2;
        if (g2 != null) {
            final Set g3 = ((n4m)g2).g();
            final hi7 a1 = this.a1;
            final String m2 = a1.m2;
            final Uri n2 = a1.n2;
            final String k = ((ik1)a1.t2()).k();
            final hi7 a2 = this.a1;
            c1.e(g3, m2, n2, k, a2.e2, a2.t2().m());
            return true;
        }
        e0e.m("viewModel");
        throw null;
    }
    
    public final DraggableDrawerLayout u() {
        final DraggableDrawerLayout b1 = this.b1;
        vmw.g((Object)b1);
        final DraggableDrawerLayout draggableDrawerLayout = b1;
        return b1;
    }
    
    public final void v3(final ki7 ki7) {
        if (ita.b().b("dm_compose_create_group_enabled", false)) {
            final mi7 mi7 = new mi7();
            ((Fragment)mi7).N1(((am1)ki7).a);
            final a a = new a(this.I4());
            a.e(2131429268, (Fragment)mi7, "dm_fragment_compose_v2", 1);
            a.c();
        }
        else {
            ((Fragment)(this.a1 = new hi7())).N1(((am1)ki7).a);
            final a a2 = new a(this.I4());
            a2.e(2131429268, (Fragment)this.a1, "dm_fragment_compose", 1);
            a2.c();
        }
    }
    
    public final void y1(String string, final long[] array) {
        final uk7 uk7 = new uk7(super.N0.getExtras());
        if (this.Z0 == null) {
            final String i = ((ik1)uk7).i();
            final rk7 z0 = new rk7();
            this.Z0 = z0;
            final uk7$b uk7$b = new uk7$b();
            ((am1.a)uk7$b).a.putParcelable("media_uri", (Parcelable)uk7.q());
            final int a = o5j.a;
            ((uk7$a)uk7$b).E(uk7.o());
            ((uk7$a)uk7$b).A(string);
            ((uk7$a)uk7$b).H(array);
            ((ik1$a)uk7$b).x(flr.g((CharSequence)i));
            ((ik1$a)uk7$b).w(i);
            ((ik1$a)uk7$b).y(((ik1)uk7).k());
            string = ((BaseBundle)((am1)uk7).a).getString("hint_text");
            ((BaseBundle)((am1.a)uk7$b).a).putString("hint_text", string);
            ((uk7$a)uk7$b).I(uk7.s());
            ((uk7$a)uk7$b).B(uk7.w());
            ((am1.a)uk7$b).a.putBoolean("is_from_compose_flow", uk7.v());
            ((uk7$a)uk7$b).D(uk7.z());
            ((uk7$a)uk7$b).C(uk7.y());
            ((uk7$a)uk7$b).J(uk7.u());
            ((uk7$a)uk7$b).z(uk7.B());
            ((am1.a)uk7$b).a.putBoolean("conversation_is_pinned", uk7.m());
            ((am1.a)uk7$b).a.putBoolean("is_from_external_share", uk7.x() || (uk7.w() && flr.g((CharSequence)i)));
            ((uk7$a)uk7$b).F(uk7.p());
            ((BaseBundle)((am1.a)uk7$b).a).putLong("snapshot_message_id", uk7.t());
            ((Fragment)z0).N1(((am1)((z4j)uk7$b).e()).a);
        }
        else {
            this.W4().L1(string);
        }
        final a a2 = new a(this.I4());
        if (this.c1.c()) {
            ((s)a2).g(2131429268, (Fragment)this.Z0, "dm_fragment_conversation");
        }
        else {
            a2.e(2131429268, (Fragment)this.Z0, "dm_fragment_conversation", 1);
        }
        a2.c();
    }
}
