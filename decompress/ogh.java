import com.twitter.weaver.mvi.MviViewModel;
import java.util.concurrent.TimeUnit;
import android.util.Patterns;
import java.util.Objects;
import com.twitter.ui.widget.EditTextViewModel;
import com.twitter.business.moduleconfiguration.mobileappmodule.url.MobileAppUrlInputViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.url.MobileAppUrlInputViewModel$subscribeToEditTextChanges$1", f = "MobileAppUrlInputViewModel.kt", l = { 109 }, m = "invokeSuspend")
public final class ogh extends xzr implements gub<yy6, ap6<? super oyv>, Object>
{
    public MobileAppUrlInputViewModel C0;
    public int D0;
    public final /* synthetic */ MobileAppUrlInputViewModel E0;
    
    public ogh(final MobileAppUrlInputViewModel e0, final ap6<? super ogh> ap6) {
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new ogh(this.E0, (ap6<? super ogh>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ogh)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final zy6 c0 = zy6.C0;
        final int d0 = this.D0;
        MobileAppUrlInputViewModel c2;
        Object a;
        if (d0 != 0) {
            if (d0 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2 = this.C0;
            kq9.b1(o);
            a = o;
        }
        else {
            kq9.b1(o);
            final MobileAppUrlInputViewModel e0 = this.E0;
            final w8x o2 = e0.O0;
            final a9x$a a9x$a = new a9x$a(new r8x((Class)EditTextViewModel.class, ""), 2131430079, (String)null);
            this.C0 = e0;
            this.D0 = 1;
            a = o2.a((a9x)a9x$a, (ap6)this);
            if (a == c0) {
                return c0;
            }
            c2 = e0;
        }
        zi8.P(a, EditTextViewModel.class);
        final b5j distinctUntilChanged = ((EditTextViewModel)a).Y().switchMap((qtb)new kla((rtb)new rtb<String, naj<? extends Integer>>() {
            public final /* synthetic */ MobileAppUrlInputViewModel C0 = ogh.this.E0;
            
            public final Object invoke(final Object o) {
                final String s = (String)o;
                zzd.f((Object)s, "input");
                final sfh p = this.C0.P0;
                Objects.requireNonNull(p);
                b5j b5j;
                if (s.length() == 0) {
                    b5j = b5j.just((Object)0);
                    zzd.e((Object)b5j, "just(ValidationState.UNVALIDATED)");
                }
                else if (ckr.h1((CharSequence)s)) {
                    b5j = b5j.just((Object)3);
                    zzd.e((Object)b5j, "just(ValidationState.INVALID)");
                }
                else if (s.length() > p.a.getInputCharacterMaxCount() && p.a.getInputCharacterMaxCount() > 0) {
                    b5j = b5j.just((Object)3);
                    zzd.e((Object)b5j, "just(ValidationState.INVALID)");
                }
                else {
                    b5j = b5j.just((Object)Patterns.WEB_URL.matcher(s).matches()).map((qtb)new uj4((rtb)tfh.C0, 20)).delay(250L, TimeUnit.MILLISECONDS).startWith((Object)1);
                    zzd.e((Object)b5j, "just(Patterns.WEB_URL.ma\u2026lidationState.VALIDATING)");
                }
                return b5j;
            }
        }, 19)).distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "private fun subscribeToE\u2026        }\n        }\n    }");
        MviViewModel.M((MviViewModel)c2, distinctUntilChanged, (String)null, (qqx)qqx$b.b, (gub)new gub<Integer, ap6<? super oyv>, Object>() {
            public /* synthetic */ Object C0;
            public final /* synthetic */ MobileAppUrlInputViewModel D0;
            
            public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
                final gub<Integer, ap6<? super oyv>, Object> gub = (gub<Integer, ap6<? super oyv>, Object>)new gub<Integer, ap6<? super oyv>, Object>() {
                    public /* synthetic */ Object C0;
                    public final /* synthetic */ MobileAppUrlInputViewModel D0 = this.D0;
                };
                gub.C0 = c0;
                return (ap6<oyv>)gub;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final gub<Integer, ap6<? super oyv>, Object> gub = (gub<Integer, ap6<? super oyv>, Object>)this.create(o, (ap6<?>)o2);
                final oyv a = oyv.a;
                gub.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                kq9.b1(o);
                final Integer n = (Integer)this.C0;
                final MobileAppUrlInputViewModel d0 = this.D0;
                final rtb<qgh, qgh> rtb = (rtb<qgh, qgh>)new rtb<qgh, qgh>() {
                    public final Object invoke(final Object o) {
                        final qgh qgh = (qgh)o;
                        zzd.f((Object)qgh, "$this$setState");
                        final Integer c0 = n;
                        zzd.e((Object)c0, "validationState");
                        final int intValue = c0.intValue();
                        final Integer c2 = n;
                        zzd.e((Object)c2, "validationState");
                        final int intValue2 = c2.intValue();
                        return qgh.l(qgh, (String)null, (String)null, (String)null, (String)null, intValue, intValue2 == 2 || intValue2 == 0, 0, 831);
                    }
                };
                final soe[] r0 = MobileAppUrlInputViewModel.R0;
                ((MviViewModel)d0).Q((rtb)rtb);
                return oyv.a;
            }
        }, 1, (Object)null);
        return oyv.a;
    }
}
