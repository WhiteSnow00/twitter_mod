// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.InputEvent;
import java.lang.ref.Reference;
import android.view.autofill.AutofillId;
import java.util.Iterator;
import java.util.Map;
import android.view.ViewStructure;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.lifecycle.d;
import android.view.ViewTreeObserver$OnTouchModeChangeListener;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.Rect;
import android.view.KeyEvent;
import java.util.Collection;
import android.graphics.Canvas;
import android.view.autofill.AutofillValue;
import android.util.SparseArray;
import android.view.MotionEvent$PointerCoords;
import android.view.MotionEvent$PointerProperties;
import java.util.ListIterator;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.os.Trace;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import android.view.View;
import java.util.ArrayList;
import java.util.Objects;
import android.content.Context;
import android.content.res.Configuration;
import java.util.List;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import android.view.ViewGroup;

@Metadata(bv = {}, d1 = { "\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 ¬\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u00ad\u0001®\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR(\u0010\u0018\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010!\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR/\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u00100\u001a\u00020*2\u0006\u0010\"\u001a\u00020*8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00107\u001a\u0002012\u0006\u0010\"\u001a\u0002018V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00109\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010A\u001a\u00020@2\u0006\u0010\"\u001a\u00020@8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001a\u0010N\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R.\u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010k\u001a\u0004\u0018\u00010h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001a\u0010m\u001a\u00020l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020{8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u001dR \u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0013R'\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008d\u0001\u0010\u0017\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u0012\u0005\b\u0093\u0001\u0010\u0017\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0099\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R \u0010£\u0001\u001a\u00030¢\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R \u0010¨\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006¯\u0001" }, d2 = { "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lzqj;", "Ldbx;", "Lyrk;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "Lfzv;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "", "c1", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "", "n1", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "<set-?>", "viewTreeOwners$delegate", "Lpuh;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "Lpjb$b;", "fontFamilyResolver$delegate", "getFontFamilyResolver", "()Lpjb$b;", "setFontFamilyResolver", "(Lpjb$b;)V", "fontFamilyResolver", "Lfve;", "layoutDirection$delegate", "getLayoutDirection", "()Lfve;", "setLayoutDirection", "(Lfve;)V", "layoutDirection", "Lxve;", "sharedDrawScope", "Lxve;", "getSharedDrawScope", "()Lxve;", "getView", "()Landroid/view/View;", "view", "Llo8;", "density", "Llo8;", "getDensity", "()Llo8;", "Laeb;", "getFocusManager", "()Laeb;", "focusManager", "Lkpx;", "getWindowInfo", "()Lkpx;", "windowInfo", "Lvve;", "root", "Lvve;", "getRoot", "()Lvve;", "Lgko;", "rootForTest", "Lgko;", "getRootForTest", "()Lgko;", "Lygp;", "semanticsOwner", "Lygp;", "getSemanticsOwner", "()Lygp;", "Lxc1;", "autofillTree", "Lxc1;", "getAutofillTree", "()Lxc1;", "Landroid/content/res/Configuration;", "configurationChangeObserver", "Lqsb;", "getConfigurationChangeObserver", "()Lqsb;", "setConfigurationChangeObserver", "(Lqsb;)V", "Lrc1;", "getAutofill", "()Lrc1;", "autofill", "Li20;", "clipboardManager", "Li20;", "getClipboardManager", "()Li20;", "Ll10;", "accessibilityManager", "Ll10;", "getAccessibilityManager", "()Ll10;", "Lcrj;", "snapshotObserver", "Lcrj;", "getSnapshotObserver", "()Lcrj;", "Lw70;", "getAndroidViewsHandler$ui_release", "()Lw70;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "Lt6x;", "viewConfiguration", "Lt6x;", "getViewConfiguration", "()Lt6x;", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Liis;", "textInputService", "Liis;", "getTextInputService", "()Liis;", "getTextInputService$annotations", "Lijb$b;", "fontLoader", "Lijb$b;", "getFontLoader", "()Lijb$b;", "getFontLoader$annotations", "Lsbc;", "hapticFeedBack", "Lsbc;", "getHapticFeedBack", "()Lsbc;", "Ldrd;", "getInputModeManager", "()Ldrd;", "inputModeManager", "Lrkh;", "modifierLocalManager", "Lrkh;", "getModifierLocalManager", "()Lrkh;", "Lvjs;", "textToolbar", "Lvjs;", "getTextToolbar", "()Lvjs;", "Lfpk;", "pointerIconService", "Lfpk;", "getPointerIconService", "()Lfpk;", "Companion", "a", "b", "ui_release" }, k = 1, mv = { 1, 7, 1 })
@SuppressLint({ "ViewConstructor", "VisibleForTests" })
public final class AndroidComposeView extends ViewGroup implements zqj, dbx, yrk, wrb
{
    public static final a Companion;
    public static Class<?> S1;
    public static Method T1;
    public int A1;
    public final hwj B1;
    public final mhk C1;
    public long D0;
    public final erd D1;
    public boolean E0;
    public final rkh E1;
    public final xve F0;
    public final b70 F1;
    public mo8 G0;
    public MotionEvent G1;
    public final beb H0;
    public long H1;
    public final lpx I0;
    public final i99 I1;
    public final qpe J0;
    public final suh<nsb<fzv>> J1;
    public final okh K0;
    public final AndroidComposeView$h K1;
    public final dg3 L0;
    public final n20 L1;
    public final vve M0;
    public boolean M1;
    public final AndroidComposeView N0;
    public final nsb<fzv> N1;
    public final ygp O0;
    public final q83 O1;
    public final s20 P0;
    public boolean P1;
    public final xc1 Q0;
    public dpk Q1;
    public final List<xqj> R0;
    public final AndroidComposeView$f R1;
    public List<xqj> S0;
    public boolean T0;
    public final arh U0;
    public final lpk V0;
    public qsb<? super Configuration, fzv> W0;
    public final b20 X0;
    public boolean Y0;
    public final i20 Z0;
    public final l10 a1;
    public final crj b1;
    public boolean c1;
    public w70 d1;
    public kc9 e1;
    public pi6 f1;
    public boolean g1;
    public final dqg h1;
    public final q70 i1;
    public long j1;
    public final int[] k1;
    public final float[] l1;
    public final float[] m1;
    public long n1;
    public boolean o1;
    public long p1;
    public boolean q1;
    public final hwj r1;
    public qsb<? super b, fzv> s1;
    public final k20 t1;
    public final l20 u1;
    public final m20 v1;
    public final jis w1;
    public final iis x1;
    public final lli y1;
    public final hwj z1;
    
    static {
        Companion = new a();
    }
    
    public AndroidComposeView(final Context context) {
        super(context);
        Objects.requireNonNull(wfj.Companion);
        this.D0 = wfj.d;
        this.E0 = true;
        this.F0 = new xve();
        this.G0 = (mo8)af8.b(context);
        final AndroidComposeView$j d0 = AndroidComposeView$j.D0;
        final wrd$a a = wrd.a;
        final sgp sgp = new sgp(false, false, (qsb)d0, (qsb)wrd.a);
        final beb h0 = new beb();
        this.H0 = h0;
        this.I0 = new lpx();
        final qpe j0 = new qpe((qsb)new AndroidComposeView$e(this), (qsb)null);
        this.J0 = j0;
        final okh$a companion = okh.Companion;
        final AndroidComposeView$i d2 = AndroidComposeView$i.D0;
        final aml a2 = nko.a;
        czd.f((Object)companion, "<this>");
        czd.f((Object)d2, "onRotaryScrollEvent");
        final okh a3 = wrd.a((okh)companion, (okh)new ndb((qsb)new oko((qsb<? super pko, Boolean>)d2), nko.a));
        this.K0 = a3;
        this.L0 = new dg3(0);
        final vve m0 = new vve(false, 0, 3, null);
        m0.d((fqg)hko.b);
        m0.a(this.getDensity());
        m0.f(k6e.a((okh)sgp, a3).E(h0.b).E((okh)j0));
        this.M0 = m0;
        this.N0 = this;
        this.O0 = new ygp(this.getRoot());
        final s20 p = new s20(this);
        this.P0 = p;
        this.Q0 = new xc1();
        this.R0 = new ArrayList();
        this.U0 = new arh();
        this.V0 = new lpk(this.getRoot());
        this.W0 = (qsb<? super Configuration, fzv>)AndroidComposeView$d.D0;
        b20 x0;
        if (this.z()) {
            x0 = new b20((View)this, this.getAutofillTree());
        }
        else {
            x0 = null;
        }
        this.X0 = x0;
        this.Z0 = new i20(context);
        this.a1 = new l10(context);
        this.b1 = new crj((qsb)new AndroidComposeView$k(this));
        this.h1 = new dqg(this.getRoot());
        final ViewConfiguration value = ViewConfiguration.get(context);
        czd.e((Object)value, "get(context)");
        this.i1 = new q70(value);
        this.j1 = wd.j(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.k1 = new int[] { 0, 0 };
        this.l1 = xng.a();
        this.m1 = xng.a();
        this.n1 = -1L;
        this.p1 = wfj.c;
        this.q1 = true;
        this.r1 = (hwj)blz.Q(null);
        this.t1 = new k20(this);
        this.u1 = new l20(this);
        this.v1 = new m20(this);
        final jis w1 = new jis((View)this);
        this.w1 = w1;
        final y20$a a4 = y20.a;
        this.x1 = (iis)y20.a.invoke((Object)w1);
        this.y1 = new lli(context);
        this.z1 = (hwj)blz.P(fli.B(context), (hiq)e8m.a);
        final Configuration configuration = context.getResources().getConfiguration();
        czd.e((Object)configuration, "context.resources.configuration");
        this.A1 = this.D(configuration);
        final Configuration configuration2 = context.getResources().getConfiguration();
        czd.e((Object)configuration2, "context.resources.configuration");
        final int layoutDirection = configuration2.getLayoutDirection();
        fve fve = fve.D0;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                fve = fve;
            }
            else {
                fve = fve.E0;
            }
        }
        this.B1 = (hwj)blz.Q(fve);
        this.C1 = new mhk((View)this);
        int n;
        if (((View)this).isInTouchMode()) {
            Objects.requireNonNull(crd.Companion);
            n = 1;
        }
        else {
            Objects.requireNonNull(crd.Companion);
            n = 2;
        }
        this.D1 = new erd(n, (qsb)new AndroidComposeView$c(this), null);
        this.E1 = new rkh((zqj)this);
        this.F1 = new b70((View)this);
        this.I1 = new i99(2);
        this.J1 = (suh<nsb<fzv>>)new suh((Object[])new nsb[16]);
        this.K1 = new Runnable(this) {
            public final AndroidComposeView D0;
            
            @Override
            public final void run() {
                ((View)this.D0).removeCallbacks((Runnable)this);
                final MotionEvent g1 = this.D0.G1;
                if (g1 != null) {
                    final boolean b = false;
                    final boolean b2 = g1.getToolType(0) == 3;
                    final int actionMasked = g1.getActionMasked();
                    int n = 0;
                    Label_0079: {
                        if (b2) {
                            n = (b ? 1 : 0);
                            if (actionMasked == 10) {
                                break Label_0079;
                            }
                            n = (b ? 1 : 0);
                            if (actionMasked == 1) {
                                break Label_0079;
                            }
                        }
                        else {
                            n = (b ? 1 : 0);
                            if (actionMasked == 1) {
                                break Label_0079;
                            }
                        }
                        n = 1;
                    }
                    if (n != 0) {
                        int n2;
                        if (actionMasked != 7 && actionMasked != 9) {
                            n2 = 2;
                        }
                        else {
                            n2 = 7;
                        }
                        final AndroidComposeView d0 = this.D0;
                        d0.R(g1, n2, d0.H1, false);
                    }
                }
            }
        };
        this.L1 = new n20((Object)this, 0);
        this.N1 = new AndroidComposeView$g(this);
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o1;
        if (sdk_INT >= 29) {
            o1 = new s83();
        }
        else {
            o1 = new r83();
        }
        this.O1 = (q83)o1;
        ((View)this).setWillNotDraw(false);
        ((View)this).setFocusable(true);
        if (sdk_INT >= 26) {
            x20.a.a((View)this, 1, false);
        }
        ((View)this).setFocusableInTouchMode(true);
        this.setClipChildren(false);
        this.setTransitionGroup(true);
        j6x.z((View)this, (vf)p);
        Objects.requireNonNull(dbx.Companion);
        this.getRoot().i((zqj)this);
        if (sdk_INT >= 29) {
            v20.a.a((View)this);
        }
        this.R1 = new AndroidComposeView$f(this);
    }
    
    public static void getFontLoader$annotations() {
    }
    
    public static void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }
    
    public static void getShowLayoutBounds$annotations() {
    }
    
    public static void getTextInputService$annotations() {
    }
    
    private void setFontFamilyResolver(final pjb$b value) {
        this.z1.setValue((Object)value);
    }
    
    private void setLayoutDirection(final fve value) {
        this.B1.setValue((Object)value);
    }
    
    private final void setViewTreeOwners(final b value) {
        this.r1.setValue((Object)value);
    }
    
    public final void A(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof AndroidComposeView) {
                ((AndroidComposeView)child).w();
            }
            else if (child instanceof ViewGroup) {
                this.A((ViewGroup)child);
            }
        }
    }
    
    public final lvj<Integer, Integer> B(int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        lvj lvj;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                lvj = new lvj((Object)size, (Object)size);
            }
            else {
                lvj = new lvj((Object)0, (Object)Integer.MAX_VALUE);
            }
        }
        else {
            lvj = new lvj((Object)0, (Object)size);
        }
        return (lvj<Integer, Integer>)lvj;
    }
    
    public final View C(final int n, final View view) {
        if (Build$VERSION.SDK_INT < 29) {
            int i = 0;
            final Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", (Class<?>[])new Class[0]);
            declaredMethod.setAccessible(true);
            if (czd.a(declaredMethod.invoke(view, new Object[0]), (Object)n)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                    final View child = viewGroup.getChildAt(i);
                    czd.e((Object)child, "currentView.getChildAt(i)");
                    final View c = this.C(n, child);
                    if (c != null) {
                        return c;
                    }
                }
            }
        }
        return null;
    }
    
    public final int D(final Configuration configuration) {
        int fontWeightAdjustment;
        if (Build$VERSION.SDK_INT >= 31) {
            fontWeightAdjustment = configuration.fontWeightAdjustment;
        }
        else {
            fontWeightAdjustment = 0;
        }
        return fontWeightAdjustment;
    }
    
    public final int E(final MotionEvent motionEvent) {
        ((View)this).removeCallbacks((Runnable)this.K1);
        try {
            this.N(motionEvent);
            final int n = 1;
            this.o1 = true;
            this.c(false);
            this.Q1 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            Label_0286: {
                int actionMasked;
                MotionEvent g1;
                boolean b;
                try {
                    actionMasked = motionEvent.getActionMasked();
                    g1 = this.G1;
                    b = (g1 != null && g1.getToolType(0) == 3);
                    if (g1 != null && this.F(motionEvent, g1)) {
                        boolean b2 = false;
                        Label_0126: {
                            if (g1.getButtonState() == 0) {
                                final int actionMasked2 = g1.getActionMasked();
                                if (actionMasked2 != 0 && actionMasked2 != 2 && actionMasked2 != 6) {
                                    b2 = false;
                                    break Label_0126;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            this.V0.b();
                        }
                        else if (g1.getActionMasked() != 10 && b) {
                            this.R(g1, 10, g1.getEventTime(), true);
                        }
                    }
                }
                finally {
                    break Label_0286;
                }
                final MotionEvent motionEvent2;
                int n2;
                if (motionEvent2.getToolType(0) == 3) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (!b && n2 != 0 && actionMasked != 3 && actionMasked != 9 && this.J(motionEvent2)) {
                    this.R(motionEvent2, 9, motionEvent2.getEventTime(), true);
                }
                if (g1 != null) {
                    g1.recycle();
                }
                this.G1 = MotionEvent.obtainNoHistory(motionEvent2);
                final int q = this.Q(motionEvent2);
                Trace.endSection();
                if (Build$VERSION.SDK_INT >= 24) {
                    w20.a.a((View)this, this.Q1);
                }
                return q;
            }
            Trace.endSection();
        }
        finally {
            this.o1 = false;
        }
    }
    
    public final boolean F(final MotionEvent motionEvent, final MotionEvent motionEvent2) {
        final int source = motionEvent2.getSource();
        final int source2 = motionEvent.getSource();
        boolean b = false;
        if (source != source2 || motionEvent2.getToolType(0) != motionEvent.getToolType(0)) {
            b = true;
        }
        return b;
    }
    
    public final void G(final vve vve) {
        vve.E();
        final suh<vve> z = vve.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            int n = 0;
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                this.G((vve)d0[n]);
            } while (++n < f0);
        }
    }
    
    public final void H(final vve vve) {
        final dqg h1 = this.h1;
        int n = 0;
        h1.q(vve, false);
        final suh<vve> z = vve.z();
        final int f0 = z.F0;
        if (f0 > 0) {
            final Object[] d0 = z.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                this.H((vve)d0[n]);
            } while (++n < f0);
        }
    }
    
    public final boolean I(final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final boolean infinite = Float.isInfinite(x);
        final boolean b = true;
        final boolean b2 = !infinite && !Float.isNaN(x);
        boolean b3 = b;
        if (b2) {
            final float y = motionEvent.getY();
            final boolean b4 = !Float.isInfinite(y) && !Float.isNaN(y);
            b3 = b;
            if (b4) {
                final float rawX = motionEvent.getRawX();
                final boolean b5 = !Float.isInfinite(rawX) && !Float.isNaN(rawX);
                b3 = b;
                if (b5) {
                    final float rawY = motionEvent.getRawY();
                    b3 = ((Float.isInfinite(rawY) || Float.isNaN(rawY)) && b);
                }
            }
        }
        return b3;
    }
    
    public final boolean J(final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        boolean b = true;
        if (0.0f > x || x > ((View)this).getWidth() || (0.0f > y || y > ((View)this).getHeight())) {
            b = false;
        }
        return b;
    }
    
    public final boolean K(final MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        final boolean b = true;
        if (pointerCount != 1) {
            return true;
        }
        final MotionEvent g1 = this.G1;
        boolean b2 = b;
        if (g1 != null) {
            final boolean b3 = motionEvent.getRawX() == g1.getRawX();
            b2 = b;
            if (b3) {
                b2 = (motionEvent.getRawY() != g1.getRawY() && b);
            }
        }
        return b2;
    }
    
    public final void L(final xqj xqj, final boolean b) {
        czd.f((Object)xqj, "layer");
        if (!b) {
            if (!this.T0) {
                if (!this.R0.remove(xqj)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        else if (!this.T0) {
            this.R0.add(xqj);
        }
        else {
            ArrayList s0;
            if ((s0 = this.S0) == null) {
                s0 = new ArrayList();
                this.S0 = s0;
            }
            s0.add(xqj);
        }
    }
    
    public final void M() {
        if (!this.o1) {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.n1) {
                this.n1 = currentAnimationTimeMillis;
                this.O1.a((View)this, this.l1);
                q3j.I(this.l1, this.m1);
                ViewParent viewParent;
                Object o;
                for (viewParent = ((View)this).getParent(), o = this; viewParent instanceof ViewGroup; viewParent = ((View)o).getParent()) {
                    o = viewParent;
                }
                ((View)o).getLocationOnScreen(this.k1);
                final int[] k1 = this.k1;
                final float n = (float)k1[0];
                final float n2 = (float)k1[1];
                ((View)o).getLocationInWindow(k1);
                final int[] k2 = this.k1;
                this.p1 = wj1.a(n - k2[0], n2 - k2[1]);
            }
        }
    }
    
    public final void N(final MotionEvent motionEvent) {
        this.n1 = AnimationUtils.currentAnimationTimeMillis();
        this.O1.a((View)this, this.l1);
        q3j.I(this.l1, this.m1);
        final long b = xng.b(this.l1, wj1.a(motionEvent.getX(), motionEvent.getY()));
        this.p1 = wj1.a(motionEvent.getRawX() - wfj.d(b), motionEvent.getRawY() - wfj.e(b));
    }
    
    public final boolean O(final xqj xqj) {
        czd.f((Object)xqj, "layer");
        boolean b = false;
        Label_0069: {
            if (this.e1 != null) {
                Objects.requireNonNull(k8x.Companion);
                if (!k8x.U0 && Build$VERSION.SDK_INT < 23) {
                    final i99 i1 = this.I1;
                    i1.c();
                    if (((suh)i1.E0).F0 >= 10) {
                        b = false;
                        break Label_0069;
                    }
                }
            }
            b = true;
        }
        if (b) {
            final i99 i2 = this.I1;
            i2.c();
            ((suh)i2.E0).b((Object)new WeakReference(xqj, (ReferenceQueue<? super Object>)i2.F0));
        }
        return b;
    }
    
    public final void P(vve x) {
        if (!((View)this).isLayoutRequested() && ((View)this).isAttachedToWindow()) {
            if (this.g1 && x != null) {
                while (x != null && x.Z0 == 1) {
                    x = x.x();
                }
                if (x == this.getRoot()) {
                    ((View)this).requestLayout();
                    return;
                }
            }
            if (((View)this).getWidth() != 0 && ((View)this).getHeight() != 0) {
                ((View)this).invalidate();
            }
            else {
                ((View)this).requestLayout();
            }
        }
    }
    
    public final int Q(final MotionEvent motionEvent) {
        if (this.P1) {
            this.P1 = false;
            final lpx i0 = this.I0;
            final int metaState = motionEvent.getMetaState();
            Objects.requireNonNull(i0);
            lpx.b.setValue((Object)new spk(metaState));
        }
        final jpk a = this.U0.a(motionEvent, (yrk)this);
        if (a != null) {
            final List<kpk> a2 = a.a;
            final ListIterator<kpk> listIterator = a2.listIterator(a2.size());
            while (true) {
                while (listIterator.hasPrevious()) {
                    final kpk previous = listIterator.previous();
                    if (previous.e) {
                        final kpk kpk = previous;
                        if (kpk != null) {
                            this.D0 = kpk.d;
                        }
                        final int a3 = this.V0.a(a, (yrk)this, this.J(motionEvent));
                        final int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            final int u0 = a3;
                            if (actionMasked != 5) {
                                return u0;
                            }
                        }
                        int u0 = a3;
                        if (!uoz.B(a3)) {
                            final arh u2 = this.U0;
                            final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                            u2.c.delete(pointerId);
                            u2.b.delete(pointerId);
                            u0 = a3;
                            return u0;
                        }
                        return u0;
                    }
                }
                final kpk previous = null;
                continue;
            }
        }
        this.V0.b();
        return nza.u0(false, false);
    }
    
    public final void R(MotionEvent obtain, final int n, final long n2, final boolean b) {
        final int actionMasked = obtain.getActionMasked();
        final int n3 = -1;
        int actionIndex;
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex = n3;
            }
            else {
                actionIndex = obtain.getActionIndex();
            }
        }
        else {
            actionIndex = n3;
            if (n != 9) {
                actionIndex = n3;
                if (n != 10) {
                    actionIndex = 0;
                }
            }
        }
        final int pointerCount = obtain.getPointerCount();
        int n4;
        if (actionIndex >= 0) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        final int n5 = pointerCount - n4;
        if (n5 == 0) {
            return;
        }
        final MotionEvent$PointerProperties[] array = new MotionEvent$PointerProperties[n5];
        for (int i = 0; i < n5; ++i) {
            array[i] = new MotionEvent$PointerProperties();
        }
        final MotionEvent$PointerCoords[] array2 = new MotionEvent$PointerCoords[n5];
        for (int j = 0; j < n5; ++j) {
            array2[j] = new MotionEvent$PointerCoords();
        }
        for (int k = 0; k < n5; ++k) {
            int n6;
            if (actionIndex >= 0 && k >= actionIndex) {
                n6 = 1;
            }
            else {
                n6 = 0;
            }
            final int n7 = n6 + k;
            obtain.getPointerProperties(n7, array[k]);
            final MotionEvent$PointerCoords motionEvent$PointerCoords = array2[k];
            obtain.getPointerCoords(n7, motionEvent$PointerCoords);
            final long v = this.v(wj1.a(motionEvent$PointerCoords.x, motionEvent$PointerCoords.y));
            motionEvent$PointerCoords.x = wfj.d(v);
            motionEvent$PointerCoords.y = wfj.e(v);
        }
        int buttonState;
        if (b) {
            buttonState = 0;
        }
        else {
            buttonState = obtain.getButtonState();
        }
        long downTime;
        if (obtain.getDownTime() == obtain.getEventTime()) {
            downTime = n2;
        }
        else {
            downTime = obtain.getDownTime();
        }
        obtain = MotionEvent.obtain(downTime, n2, n, n5, array, array2, obtain.getMetaState(), buttonState, obtain.getXPrecision(), obtain.getYPrecision(), obtain.getDeviceId(), obtain.getEdgeFlags(), obtain.getSource(), obtain.getFlags());
        final arh u0 = this.U0;
        czd.e((Object)obtain, "event");
        final jpk a = u0.a(obtain, (yrk)this);
        czd.c((Object)a);
        this.V0.a(a, (yrk)this, true);
        obtain.recycle();
    }
    
    public final void S() {
        ((View)this).getLocationOnScreen(this.k1);
        final long j1 = this.j1;
        final ftd$a companion = ftd.Companion;
        final int n = (int)(j1 >> 32);
        final int c = ftd.c(j1);
        final int[] k1 = this.k1;
        final boolean b = false;
        boolean b2 = false;
        Label_0110: {
            if (n == k1[0]) {
                b2 = b;
                if (c == k1[1]) {
                    break Label_0110;
                }
            }
            this.j1 = wd.j(k1[0], k1[1]);
            b2 = b;
            if (n != Integer.MAX_VALUE) {
                b2 = b;
                if (c != Integer.MAX_VALUE) {
                    this.getRoot().f1.k.L0();
                    b2 = true;
                }
            }
        }
        this.h1.b(b2);
    }
    
    public final void a() {
    }
    
    public final void autofill(final SparseArray<AutofillValue> sparseArray) {
        czd.f((Object)sparseArray, "values");
        if (this.z()) {
            final b20 x0 = this.X0;
            if (x0 != null) {
                for (int size = sparseArray.size(), i = 0; i < size; ++i) {
                    final int key = sparseArray.keyAt(i);
                    final AutofillValue autofillValue = (AutofillValue)sparseArray.get(key);
                    final tc1 a = tc1.a;
                    czd.e((Object)autofillValue, "value");
                    if (a.d(autofillValue)) {
                        final xc1 b = x0.b;
                        final String string = a.i(autofillValue).toString();
                        Objects.requireNonNull(b);
                        czd.f((Object)string, "value");
                        final wc1 wc1 = b.a.get(key);
                    }
                    else {
                        if (a.b(autofillValue)) {
                            throw new voi("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (a.c(autofillValue)) {
                            throw new voi("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (a.e(autofillValue)) {
                            throw new voi("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }
    
    public final void b() {
    }
    
    public final void c(final boolean b) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        final nsb<fzv> nsb;
        Label_0024: {
            Label_0022: {
                if (b) {
                    Label_0051: {
                        try {
                            final AndroidComposeView$g n1 = this.N1;
                            break Label_0024;
                        }
                        finally {
                            break Label_0051;
                        }
                        break Label_0022;
                    }
                    Trace.endSection();
                }
            }
            nsb = null;
        }
        if (this.h1.h(nsb)) {
            ((View)this).requestLayout();
        }
        this.h1.b(false);
        Trace.endSection();
    }
    
    public final boolean canScrollHorizontally(final int n) {
        return this.P0.k(false, n, this.D0);
    }
    
    public final boolean canScrollVertically(final int n) {
        return this.P0.k(true, n, this.D0);
    }
    
    public final long d(final long n) {
        this.M();
        return xng.b(this.l1, n);
    }
    
    public final void dispatchDraw(final Canvas a) {
        czd.f((Object)a, "canvas");
        if (!((View)this).isAttachedToWindow()) {
            this.G(this.getRoot());
        }
        final int a2 = yqj.a;
        this.c(true);
        this.T0 = true;
        final dg3 l0 = this.L0;
        final e20 e20 = (e20)l0.D0;
        final Canvas a3 = e20.a;
        Objects.requireNonNull(e20);
        e20.a = a;
        final e20 e21 = (e20)l0.D0;
        final vve root = this.getRoot();
        Objects.requireNonNull(root);
        czd.f((Object)e21, "canvas");
        root.e1.c.Z0((ag3)e21);
        ((e20)l0.D0).v(a3);
        if (this.R0.isEmpty() ^ true) {
            for (int size = this.R0.size(), i = 0; i < size; ++i) {
                ((xqj)this.R0.get(i)).i();
            }
        }
        Objects.requireNonNull(k8x.Companion);
        if (k8x.U0) {
            final int save = a.save();
            a.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(a);
            a.restoreToCount(save);
        }
        this.R0.clear();
        this.T0 = false;
        final ArrayList s0 = this.S0;
        if (s0 != null) {
            this.R0.addAll(s0);
            s0.clear();
        }
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "event");
        boolean b2;
        if (motionEvent.getActionMasked() == 8) {
            if (((InputEvent)motionEvent).isFromSource(4194304)) {
                final ViewConfiguration value = ViewConfiguration.get(((View)this).getContext());
                final float n = -motionEvent.getAxisValue(26);
                final Context context = ((View)this).getContext();
                final Method a = u6x.a;
                final int sdk_INT = Build$VERSION.SDK_INT;
                float n2;
                if (sdk_INT >= 26) {
                    n2 = u6x.a.b(value);
                }
                else {
                    n2 = u6x.a(value, context);
                }
                final Context context2 = ((View)this).getContext();
                float n3;
                if (sdk_INT >= 26) {
                    n3 = u6x.a.a(value);
                }
                else {
                    n3 = u6x.a(value, context2);
                }
                final pko pko = new pko(n2 * n, n * n3, motionEvent.getEventTime());
                final ceb p = ffz.P(this.H0.a);
                final boolean b = b2 = false;
                if (p != null) {
                    final ndb j0 = p.J0;
                    b2 = b;
                    if (j0 != null) {
                        if (!j0.b((qdb)pko)) {
                            b2 = b;
                            if (!j0.a((qdb)pko)) {
                                return b2;
                            }
                        }
                        b2 = true;
                    }
                }
            }
            else if (!this.I(motionEvent) && ((View)this).isAttachedToWindow()) {
                b2 = uoz.B(this.E(motionEvent));
            }
            else {
                b2 = super.dispatchGenericMotionEvent(motionEvent);
            }
        }
        else {
            b2 = super.dispatchGenericMotionEvent(motionEvent);
        }
        return b2;
    }
    
    public final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "event");
        if (this.M1) {
            ((View)this).removeCallbacks((Runnable)this.L1);
            this.L1.run();
        }
        final boolean i = this.I(motionEvent);
        boolean b = false;
        if (i || !((View)this).isAttachedToWindow()) {
            return false;
        }
        if (((InputEvent)motionEvent).isFromSource(4098) && motionEvent.getToolType(0) == 1) {
            final s20 p = this.P0;
            Objects.requireNonNull(p);
            if (p.s()) {
                final int action = motionEvent.getAction();
                Label_0461: {
                    if (action != 7 && action != 9) {
                        if (action == 10) {
                            if (p.e != Integer.MIN_VALUE) {
                                p.J(Integer.MIN_VALUE);
                                break Label_0461;
                            }
                            b = ((View)p.d.getAndroidViewsHandler$ui_release()).dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                    else {
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        final AndroidComposeView d = p.d;
                        final tgp tgp = null;
                        final int a = yqj.a;
                        d.c(true);
                        final pkc pkc = new pkc();
                        final vve root = p.d.getRoot();
                        final long a2 = wj1.a(x, y);
                        final vve.vve$d companion = vve.Companion;
                        root.B(a2, pkc, true);
                        final tgp tgp2 = (tgp)mq4.p0((List)pkc);
                        tgp e0 = tgp;
                        if (tgp2 != null) {
                            final vve y2 = wd.y((yl8)tgp2);
                            e0 = tgp;
                            if (y2 != null) {
                                e0 = rp9.e0(y2);
                            }
                        }
                        int y5 = 0;
                        Label_0429: {
                            if (e0 != null) {
                                final vve y3 = wd.y((yl8)e0);
                                czd.f((Object)y3, "layoutNode");
                                final pgp f = msy.f(e0);
                                zmi zmi;
                                if (f.E0) {
                                    Object d2;
                                    if ((d2 = rp9.d0(y3)) == null) {
                                        d2 = e0;
                                    }
                                    zmi = wd.x((yl8)d2, 8);
                                }
                                else {
                                    zmi = wd.x((yl8)e0, 8);
                                }
                                final zgp a3 = zgp.a;
                                if (!f.g(zgp.m) && !zmi.n1()) {
                                    final vve y4 = wd.y((yl8)e0);
                                    if (p.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(y4) == null) {
                                        y5 = p.y(y4.E0);
                                        break Label_0429;
                                    }
                                }
                            }
                            y5 = Integer.MIN_VALUE;
                        }
                        b = ((View)p.d.getAndroidViewsHandler$ui_release()).dispatchGenericMotionEvent(motionEvent);
                        p.J(y5);
                        if (y5 != Integer.MIN_VALUE) {
                            break Label_0461;
                        }
                    }
                    return b;
                }
                b = true;
            }
            return b;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                if (this.J(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3) {
                        final MotionEvent g1 = this.G1;
                        if (g1 != null) {
                            g1.recycle();
                        }
                        this.G1 = MotionEvent.obtainNoHistory(motionEvent);
                        this.M1 = true;
                        ((View)this).post((Runnable)this.L1);
                        return false;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        return false;
                    }
                }
            }
        }
        else if (!this.K(motionEvent)) {
            return false;
        }
        return uoz.B(this.E(motionEvent));
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        czd.f((Object)keyEvent, "event");
        if (((View)this).isFocused()) {
            final lpx i0 = this.I0;
            final int metaState = keyEvent.getMetaState();
            Objects.requireNonNull(i0);
            lpx.b.setValue((Object)new spk(metaState));
            final qpe j0 = this.J0;
            Objects.requireNonNull(j0);
            final ceb f0 = j0.F0;
            if (f0 != null) {
                final ceb q = jee.q(f0);
                if (q != null) {
                    final zmi p = q.P0;
                    final qpe qpe = null;
                    final qpe qpe2 = null;
                    final qpe qpe3 = null;
                    qpe r0 = qpe2;
                    if (p != null) {
                        final vve j2 = p.J0;
                        if (j2 == null) {
                            r0 = qpe2;
                        }
                        else {
                            final suh s0 = q.S0;
                            final int f2 = s0.F0;
                            r0 = qpe;
                            if (f2 > 0) {
                                int n = 0;
                                final Object[] d0 = s0.D0;
                                czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                                qpe qpe4 = qpe3;
                                int n2;
                                qpe qpe6;
                                do {
                                    final qpe qpe5 = (qpe)d0[n];
                                    qpe6 = qpe4;
                                    Label_0261: {
                                        if (czd.a((Object)qpe5.H0, (Object)j2)) {
                                            if (qpe4 != null) {
                                                final vve h0 = qpe5.H0;
                                                qpe qpe7 = qpe4;
                                                qpe g0;
                                                do {
                                                    qpe6 = qpe4;
                                                    if (czd.a((Object)qpe7, (Object)qpe5)) {
                                                        break Label_0261;
                                                    }
                                                    g0 = qpe7.G0;
                                                    if (g0 == null) {
                                                        break;
                                                    }
                                                    qpe7 = g0;
                                                } while (czd.a((Object)g0.H0, (Object)h0));
                                            }
                                            qpe6 = qpe5;
                                        }
                                    }
                                    n2 = n + 1;
                                    qpe4 = qpe6;
                                } while ((n = n2) < f2);
                                r0 = qpe6;
                            }
                            if (r0 == null) {
                                r0 = q.R0;
                            }
                        }
                    }
                    if (r0 != null) {
                        return r0.b(keyEvent) || r0.a(keyEvent);
                    }
                }
            }
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "motionEvent");
        final boolean m1 = this.M1;
        boolean b = false;
        if (m1) {
            ((View)this).removeCallbacks((Runnable)this.L1);
            final MotionEvent g1 = this.G1;
            czd.c((Object)g1);
            if (motionEvent.getActionMasked() == 0 && !this.F(motionEvent, g1)) {
                this.M1 = false;
            }
            else {
                this.L1.run();
            }
        }
        if (this.I(motionEvent) || !((View)this).isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !this.K(motionEvent)) {
            return false;
        }
        final int e = this.E(motionEvent);
        if ((e & 0x2) != 0x0) {
            b = true;
        }
        if (b) {
            ((View)this).getParent().requestDisallowInterceptTouchEvent(true);
        }
        return uoz.B(e);
    }
    
    public final void e() {
    }
    
    public final View findViewByAccessibilityIdTraversal(final int n) {
        final View view = null;
        try {
            View c;
            if (Build$VERSION.SDK_INT >= 29) {
                final Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                final Object invoke = declaredMethod.invoke(this, n);
                c = view;
                if (invoke instanceof View) {
                    c = (View)invoke;
                }
            }
            else {
                c = this.C(n, (View)this);
            }
            return c;
        }
        catch (final NoSuchMethodException ex) {
            return view;
        }
    }
    
    public final void g(final vve vve) {
        czd.f((Object)vve, "node");
    }
    
    public /* bridge */ ig getAccessibilityManager() {
        return (ig)this.getAccessibilityManager();
    }
    
    public l10 getAccessibilityManager() {
        return this.a1;
    }
    
    public final w70 getAndroidViewsHandler$ui_release() {
        if (this.d1 == null) {
            final Context context = ((View)this).getContext();
            czd.e((Object)context, "context");
            this.addView((View)(this.d1 = new w70(context)));
        }
        final w70 d1 = this.d1;
        czd.c((Object)d1);
        return d1;
    }
    
    public rc1 getAutofill() {
        return this.X0;
    }
    
    public xc1 getAutofillTree() {
        return this.Q0;
    }
    
    public i20 getClipboardManager() {
        return this.Z0;
    }
    
    public /* bridge */ jh4 getClipboardManager() {
        return (jh4)this.getClipboardManager();
    }
    
    public final qsb<Configuration, fzv> getConfigurationChangeObserver() {
        return (qsb<Configuration, fzv>)this.W0;
    }
    
    public lo8 getDensity() {
        return (lo8)this.G0;
    }
    
    public aeb getFocusManager() {
        return (aeb)this.H0;
    }
    
    public final void getFocusedRect(final Rect rect) {
        czd.f((Object)rect, "rect");
        final ceb p = ffz.P(this.H0.a);
        fzv a;
        if (p != null) {
            final c6m t = jee.t(p);
            rect.left = zyz.n(t.a);
            rect.top = zyz.n(t.b);
            rect.right = zyz.n(t.c);
            rect.bottom = zyz.n(t.d);
            a = fzv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            super.getFocusedRect(rect);
        }
    }
    
    public pjb$b getFontFamilyResolver() {
        return (pjb$b)this.z1.getValue();
    }
    
    public ijb.b getFontLoader() {
        return (ijb.b)this.y1;
    }
    
    public sbc getHapticFeedBack() {
        return (sbc)this.C1;
    }
    
    public boolean getHasPendingMeasureOrLayout() {
        return this.h1.b.b() ^ true;
    }
    
    public drd getInputModeManager() {
        return this.D1;
    }
    
    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.n1;
    }
    
    public fve getLayoutDirection() {
        return (fve)this.B1.getValue();
    }
    
    public long getMeasureIteration() {
        final dqg h1 = this.h1;
        if (h1.c) {
            return h1.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }
    
    public rkh getModifierLocalManager() {
        return this.E1;
    }
    
    public fpk getPointerIconService() {
        return (fpk)this.R1;
    }
    
    public vve getRoot() {
        return this.M0;
    }
    
    public gko getRootForTest() {
        return (gko)this.N0;
    }
    
    public ygp getSemanticsOwner() {
        return this.O0;
    }
    
    public xve getSharedDrawScope() {
        return this.F0;
    }
    
    public boolean getShowLayoutBounds() {
        return this.c1;
    }
    
    public crj getSnapshotObserver() {
        return this.b1;
    }
    
    public iis getTextInputService() {
        return this.x1;
    }
    
    public vjs getTextToolbar() {
        return (vjs)this.F1;
    }
    
    public View getView() {
        return (View)this;
    }
    
    public t6x getViewConfiguration() {
        return (t6x)this.i1;
    }
    
    public final b getViewTreeOwners() {
        return (b)this.r1.getValue();
    }
    
    public kpx getWindowInfo() {
        return (kpx)this.I0;
    }
    
    public final void h(final zqj$b zqj$b) {
        final dqg h1 = this.h1;
        Objects.requireNonNull(h1);
        h1.e.b((Object)zqj$b);
        this.P(null);
    }
    
    public final void i(final vve vve) {
        final dqg h1 = this.h1;
        Objects.requireNonNull(h1);
        h1.d.b(vve);
        this.P(null);
    }
    
    public final void j() {
    }
    
    public final long k(final long n) {
        this.M();
        return xng.b(this.m1, wj1.a(wfj.d(n) - wfj.d(this.p1), wfj.e(n) - wfj.e(this.p1)));
    }
    
    public final void l(final vve vve) {
        czd.f((Object)vve, "layoutNode");
        final s20 p = this.P0;
        Objects.requireNonNull(p);
        p.p = true;
        if (p.s()) {
            p.t(vve);
        }
    }
    
    public final void m(final xaf xaf) {
        this.setShowLayoutBounds(a.a(AndroidComposeView.Companion));
    }
    
    public final void n(final vve vve) {
        czd.f((Object)vve, "node");
        final dqg h1 = this.h1;
        Objects.requireNonNull(h1);
        h1.b.c(vve);
        this.Y0 = true;
    }
    
    public final void o(final vve vve, final boolean b, final boolean b2) {
        czd.f((Object)vve, "layoutNode");
        if (b) {
            if (this.h1.n(vve, b2)) {
                this.P(null);
            }
        }
        else if (this.h1.p(vve, b2)) {
            this.P(null);
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H(this.getRoot());
        this.G(this.getRoot());
        final riq a = this.getSnapshotObserver().a;
        a.e = (thq$a$a)thq.Companion.d((ftb)a.b);
        if (this.z()) {
            final b20 x0 = this.X0;
            if (x0 != null) {
                uc1.a.a(x0);
            }
        }
        final xaf h = lp.H((View)this);
        final pto a2 = fcx.a((View)this);
        final b viewTreeOwners = this.getViewTreeOwners();
        boolean b = false;
        Label_0126: {
            Label_0124: {
                if (viewTreeOwners != null) {
                    if (h != null && a2 != null) {
                        final xaf a3 = viewTreeOwners.a;
                        if (h != a3) {
                            break Label_0124;
                        }
                        if (a2 != a3) {
                            break Label_0124;
                        }
                    }
                    b = false;
                    break Label_0126;
                }
            }
            b = true;
        }
        if (b) {
            if (h == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null) {
                final xaf a4 = viewTreeOwners.a;
                if (a4 != null) {
                    final d b2 = a4.b();
                    if (b2 != null) {
                        b2.c((waf)this);
                    }
                }
            }
            h.b().a((waf)this);
            final b viewTreeOwners2 = new b(h, a2);
            this.setViewTreeOwners(viewTreeOwners2);
            final qsb<? super b, fzv> s1 = this.s1;
            if (s1 != null) {
                s1.invoke((Object)viewTreeOwners2);
            }
            this.s1 = null;
        }
        final b viewTreeOwners3 = this.getViewTreeOwners();
        czd.c((Object)viewTreeOwners3);
        viewTreeOwners3.a.b().a((waf)this);
        ((View)this).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.t1);
        ((View)this).getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this.u1);
        ((View)this).getViewTreeObserver().addOnTouchModeChangeListener((ViewTreeObserver$OnTouchModeChangeListener)this.v1);
    }
    
    public final boolean onCheckIsTextEditor() {
        return this.w1.c;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        czd.f((Object)configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        final Context context = ((View)this).getContext();
        czd.e((Object)context, "context");
        this.G0 = (mo8)af8.b(context);
        if (this.D(configuration) != this.A1) {
            this.A1 = this.D(configuration);
            final Context context2 = ((View)this).getContext();
            czd.e((Object)context2, "context");
            this.setFontFamilyResolver(fli.B(context2));
        }
        this.W0.invoke((Object)configuration);
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        czd.f((Object)editorInfo, "outAttrs");
        final jis w1 = this.w1;
        Objects.requireNonNull(w1);
        Object o;
        if (!w1.c) {
            o = null;
        }
        else {
            final z8d g = w1.g;
            final ais f = w1.f;
            czd.f((Object)g, "imeOptions");
            czd.f((Object)f, "textFieldValue");
            final int e = g.e;
            Objects.requireNonNull(y8d.Companion);
            final int n = 0;
            int imeOptions = 0;
            Label_0265: {
                if (e == 1) {
                    if (!g.a) {
                        imeOptions = 0;
                        break Label_0265;
                    }
                }
                else {
                    if (e == 0) {
                        imeOptions = 1;
                        break Label_0265;
                    }
                    if (e == 2) {
                        imeOptions = 2;
                        break Label_0265;
                    }
                    if (e == 6) {
                        imeOptions = 5;
                        break Label_0265;
                    }
                    if (e == 5) {
                        imeOptions = 7;
                        break Label_0265;
                    }
                    if (e == 3) {
                        imeOptions = 3;
                        break Label_0265;
                    }
                    if (e == 4) {
                        imeOptions = 4;
                        break Label_0265;
                    }
                    if (e != 7) {
                        throw new IllegalStateException("invalid ImeAction".toString());
                    }
                }
                imeOptions = 6;
            }
            editorInfo.imeOptions = imeOptions;
            final int d = g.d;
            Objects.requireNonNull(yqe.Companion);
            if (d == 1) {
                editorInfo.inputType = 1;
            }
            else if (d == 2) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            else if (d == 3) {
                editorInfo.inputType = 2;
            }
            else if (d == 4) {
                editorInfo.inputType = 3;
            }
            else if (d == 5) {
                editorInfo.inputType = 17;
            }
            else if (d == 6) {
                editorInfo.inputType = 33;
            }
            else if (d == 7) {
                editorInfo.inputType = 129;
            }
            else if (d == 8) {
                editorInfo.inputType = 18;
            }
            else {
                if (d != 9) {
                    throw new IllegalStateException("Invalid Keyboard Type".toString());
                }
                editorInfo.inputType = 8194;
            }
            if (!g.a) {
                final int inputType = editorInfo.inputType;
                if ((inputType & 0x1) == 0x1) {
                    editorInfo.inputType = (inputType | 0x20000);
                    if (g.e == 1) {
                        editorInfo.imeOptions |= 0x40000000;
                    }
                }
            }
            if ((editorInfo.inputType & 0x1) == 0x1) {
                final int b = g.b;
                Objects.requireNonNull(sqe.Companion);
                if (b == 1) {
                    editorInfo.inputType |= 0x1000;
                }
                else if (b == 2) {
                    editorInfo.inputType |= 0x2000;
                }
                else {
                    int n2 = n;
                    if (b == 3) {
                        n2 = 1;
                    }
                    if (n2 != 0) {
                        editorInfo.inputType |= 0x4000;
                    }
                }
                if (g.c) {
                    editorInfo.inputType |= 0x8000;
                }
            }
            final long b2 = f.b;
            final hjs$a companion = hjs.Companion;
            editorInfo.initialSelStart = (int)(b2 >> 32);
            editorInfo.initialSelEnd = hjs.d(b2);
            vw9.d(editorInfo, (CharSequence)f.a.D0);
            editorInfo.imeOptions |= 0x2000000;
            o = new w5m(w1.f, (uqd)new lis(w1), w1.g.c);
            w1.h.add(new WeakReference(o));
        }
        return (InputConnection)o;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final crj snapshotObserver = this.getSnapshotObserver();
        final thq$a$a e = snapshotObserver.a.e;
        if (e != null) {
            e.dispose();
        }
        snapshotObserver.a.a();
        final b viewTreeOwners = this.getViewTreeOwners();
        if (viewTreeOwners != null) {
            final xaf a = viewTreeOwners.a;
            if (a != null) {
                final d b = a.b();
                if (b != null) {
                    b.c((waf)this);
                }
            }
        }
        if (this.z()) {
            final b20 x0 = this.X0;
            if (x0 != null) {
                uc1.a.b(x0);
            }
        }
        ((View)this).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.t1);
        ((View)this).getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this.u1);
        ((View)this).getViewTreeObserver().removeOnTouchModeChangeListener((ViewTreeObserver$OnTouchModeChangeListener)this.v1);
    }
    
    public final void onDraw(final Canvas canvas) {
        czd.f((Object)canvas, "canvas");
    }
    
    public final void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        final StringBuilder sb = new StringBuilder();
        sb.append("Owner FocusChanged(");
        sb.append(b);
        sb.append(')');
        Log.d("Compose Focus", sb.toString());
        final beb h0 = this.H0;
        if (b) {
            final ceb a = h0.a;
            if (a.G0 == ueb.I0) {
                a.b(ueb.D0);
            }
        }
        else {
            web.c(h0.a, true);
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.h1.h((nsb<fzv>)this.N1);
        this.f1 = null;
        this.S();
        if (this.d1 != null) {
            ((View)this.getAndroidViewsHandler$ui_release()).layout(0, 0, n3 - n, n4 - n2);
        }
    }
    
    public final void onMeasure(int intValue, final int n) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!((View)this).isAttachedToWindow()) {
                this.H(this.getRoot());
            }
            final lvj<Integer, Integer> b = this.B(intValue);
            final int intValue2 = ((Number)b.D0).intValue();
            intValue = ((Number)b.E0).intValue();
            final lvj<Integer, Integer> b2 = this.B(n);
            final long b3 = uoz.b(intValue2, intValue, ((Number)b2.D0).intValue(), ((Number)b2.E0).intValue());
            final pi6 f1 = this.f1;
            boolean b4 = false;
            if (f1 == null) {
                this.f1 = new pi6(b3);
                this.g1 = false;
            }
            else {
                if (f1 != null) {
                    b4 = pi6.b(f1.a, b3);
                }
                if (!b4) {
                    this.g1 = true;
                }
            }
            this.h1.r(b3);
            this.h1.j();
            ((View)this).setMeasuredDimension(((wgk)this.getRoot().f1.k).D0, ((wgk)this.getRoot().f1.k).E0);
            if (this.d1 != null) {
                ((View)this.getAndroidViewsHandler$ui_release()).measure(View$MeasureSpec.makeMeasureSpec(((wgk)this.getRoot().f1.k).D0, 1073741824), View$MeasureSpec.makeMeasureSpec(((wgk)this.getRoot().f1.k).E0, 1073741824));
            }
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void onProvideAutofillVirtualStructure(final ViewStructure viewStructure, int a) {
        if (this.z() && viewStructure != null) {
            final b20 x0 = this.X0;
            if (x0 != null) {
                a = sc1.a.a(viewStructure, x0.b.a.size());
                for (Map.Entry<Number, V> entry : x0.b.a.entrySet()) {
                    final int intValue = entry.getKey().intValue();
                    final wc1 wc1 = (wc1)entry.getValue();
                    final sc1 a2 = sc1.a;
                    final ViewStructure b = a2.b(viewStructure, a);
                    if (b != null) {
                        final tc1 a3 = tc1.a;
                        final AutofillId a4 = a3.a(viewStructure);
                        czd.c((Object)a4);
                        a3.g(b, a4, intValue);
                        a2.d(b, intValue, x0.a.getContext().getPackageName(), (String)null, (String)null);
                        a3.h(b, 1);
                        Objects.requireNonNull(wc1);
                        new(java.util.ArrayList.class)();
                        throw null;
                    }
                    ++a;
                }
            }
        }
    }
    
    public final void onRtlPropertiesChanged(final int n) {
        if (this.E0) {
            final y20$a a = y20.a;
            fve fve2;
            final fve fve = fve2 = fve.D0;
            if (n != 0) {
                if (n != 1) {
                    fve2 = fve;
                }
                else {
                    fve2 = fve.E0;
                }
            }
            this.setLayoutDirection(fve2);
            final beb h0 = this.H0;
            Objects.requireNonNull(h0);
            h0.c = fve2;
        }
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.I0.a.setValue((Object)b);
        this.P1 = true;
        super.onWindowFocusChanged(b);
        if (b) {
            final boolean a = AndroidComposeView.a.a(AndroidComposeView.Companion);
            if (this.getShowLayoutBounds() != a) {
                this.setShowLayoutBounds(a);
                this.G(this.getRoot());
            }
        }
    }
    
    public final void p(final vve vve) {
        czd.f((Object)vve, "layoutNode");
        this.h1.e(vve);
    }
    
    public final void q(final vve vve, final long n) {
        czd.f((Object)vve, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.h1.i(vve, n);
            this.h1.b(false);
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final long r(final long n) {
        this.M();
        return xng.b(this.m1, n);
    }
    
    public final xqj s(final qsb<? super ag3, fzv> qsb, final nsb<fzv> nsb) {
        czd.f((Object)qsb, "drawBlock");
        czd.f((Object)nsb, "invalidateParentLayer");
        final i99 i1 = this.I1;
        i1.c();
        while (true) {
            while (((suh)i1.E0).m()) {
                final suh suh = (suh)i1.E0;
                final Object value = ((Reference)suh.p(suh.F0 - 1)).get();
                if (value != null) {
                    final xqj xqj = (xqj)value;
                    if (xqj != null) {
                        xqj.e((qsb)qsb, (nsb)nsb);
                        return xqj;
                    }
                    if (((View)this).isHardwareAccelerated() && Build$VERSION.SDK_INT >= 23 && this.q1) {
                        try {
                            return (xqj)new kfm(this, (qsb)qsb, (nsb)nsb);
                        }
                        finally {
                            this.q1 = false;
                        }
                    }
                    if (this.e1 == null) {
                        final k8x$c companion = k8x.Companion;
                        Objects.requireNonNull(companion);
                        if (!k8x.T0) {
                            companion.a(new View(((View)this).getContext()));
                        }
                        Objects.requireNonNull(companion);
                        Object e1;
                        if (k8x.U0) {
                            final Context context = ((View)this).getContext();
                            czd.e((Object)context, "context");
                            e1 = new kc9(context);
                        }
                        else {
                            final Context context2 = ((View)this).getContext();
                            czd.e((Object)context2, "context");
                            e1 = new l8x(context2);
                        }
                        this.addView((View)(this.e1 = (kc9)e1));
                    }
                    final kc9 e2 = this.e1;
                    czd.c((Object)e2);
                    return (xqj)new k8x(this, e2, (qsb)qsb, (nsb)nsb);
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public final void setConfigurationChangeObserver(final qsb<? super Configuration, fzv> w0) {
        czd.f((Object)w0, "<set-?>");
        this.W0 = w0;
    }
    
    public final void setLastMatrixRecalculationAnimationTime$ui_release(final long n1) {
        this.n1 = n1;
    }
    
    public final void setOnViewTreeOwnersAvailable(final qsb<? super b, fzv> s1) {
        czd.f((Object)s1, "callback");
        final b viewTreeOwners = this.getViewTreeOwners();
        if (viewTreeOwners != null) {
            s1.invoke((Object)viewTreeOwners);
        }
        if (!((View)this).isAttachedToWindow()) {
            this.s1 = s1;
        }
    }
    
    public void setShowLayoutBounds(final boolean c1) {
        this.c1 = c1;
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public final void t(final nsb<fzv> nsb) {
        if (!this.J1.i((Object)nsb)) {
            this.J1.b((Object)nsb);
        }
    }
    
    public final void u(final vve vve, final boolean b, final boolean b2) {
        czd.f((Object)vve, "layoutNode");
        if (b) {
            if (this.h1.o(vve, b2)) {
                this.P(vve);
            }
        }
        else if (this.h1.q(vve, b2)) {
            this.P(vve);
        }
    }
    
    public final long v(long b) {
        this.M();
        b = xng.b(this.l1, b);
        return wj1.a(wfj.d(this.p1) + wfj.d(b), wfj.e(this.p1) + wfj.e(b));
    }
    
    public final void w() {
        if (this.Y0) {
            final riq a = this.getSnapshotObserver().a;
            final brj d0 = brj.D0;
            Objects.requireNonNull(a);
            czd.f((Object)d0, "predicate");
            synchronized (a.d) {
                final suh<riq.a> d2 = a.d;
                final int f0 = d2.F0;
                if (f0 > 0) {
                    final Object[] d3 = d2.D0;
                    czd.d((Object)d3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int n = 0;
                    do {
                        ((riq.a)d3[n]).e((qsb<Object, Boolean>)d0);
                    } while (++n < f0);
                }
                monitorexit(a.d);
                this.Y0 = false;
            }
        }
        final w70 d4 = this.d1;
        if (d4 != null) {
            this.A((ViewGroup)d4);
        }
        while (this.J1.m()) {
            final int f2 = this.J1.F0;
            for (int i = 0; i < f2; ++i) {
                final suh<nsb<fzv>> j1 = this.J1;
                final nsb nsb = (nsb)j1.D0[i];
                j1.r(i, (Object)null);
                if (nsb != null) {
                    nsb.invoke();
                }
            }
            this.J1.q(0, f2);
        }
    }
    
    public final void x() {
        final s20 p0 = this.P0;
        p0.p = true;
        if (p0.s() && !p0.v) {
            p0.v = true;
            p0.g.post((Runnable)p0.w);
        }
    }
    
    public final void y(final xaf xaf) {
    }
    
    public final boolean z() {
        return Build$VERSION.SDK_INT >= 26;
    }
    
    public static final class a
    {
        public static final boolean a(final a a) {
            Objects.requireNonNull(a);
            final boolean b = false;
            try {
                if (AndroidComposeView.S1 == null) {
                    AndroidComposeView.T1 = (AndroidComposeView.S1 = Class.forName("android.os.SystemProperties")).getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                final Method t1 = AndroidComposeView.T1;
                Boolean b2 = null;
                Object invoke;
                if (t1 != null) {
                    invoke = t1.invoke(null, "debug.layout", Boolean.FALSE);
                }
                else {
                    invoke = null;
                }
                if (invoke instanceof Boolean) {
                    b2 = (Boolean)invoke;
                }
                boolean booleanValue = b;
                if (b2 != null) {
                    booleanValue = b2;
                }
                return booleanValue;
            }
            catch (final Exception ex) {
                return b;
            }
        }
    }
    
    public static final class b
    {
        public final xaf a;
        public final pto b;
        
        public b(final xaf a, final pto b) {
            this.a = a;
            this.b = b;
        }
    }
}
