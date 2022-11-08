import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.ui.widget.EditTextViewModel;
import com.twitter.business.textinput.BusinessInputTextViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.textinput.BusinessInputTextViewModel$subscribeToEditTextChanges$1", f = "BusinessInputTextViewModel.kt", l = { 102 }, m = "invokeSuspend")
public final class d13 extends xzr implements gub<yy6, ap6<? super oyv>, Object>
{
    public BusinessInputTextViewModel C0;
    public int D0;
    public final /* synthetic */ BusinessInputTextViewModel E0;
    
    public d13(final BusinessInputTextViewModel e0, final ap6<? super d13> ap6) {
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new d13(this.E0, (ap6<? super d13>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((d13)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final zy6 c0 = zy6.C0;
        final int d0 = this.D0;
        BusinessInputTextViewModel c2;
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
            final BusinessInputTextViewModel e0 = this.E0;
            final w8x o2 = e0.O0;
            final a9x$a a9x$a = new a9x$a(new r8x((Class)EditTextViewModel.class, ""), 2131430716, (String)null);
            this.C0 = e0;
            this.D0 = 1;
            a = o2.a((a9x)a9x$a, (ap6)this);
            if (a == c0) {
                return c0;
            }
            c2 = e0;
        }
        zi8.P(a, EditTextViewModel.class);
        final b5j distinctUntilChanged = ((EditTextViewModel)a).Y().switchMap((qtb)new d9v((rtb)new d13$a(this.E0), 16)).distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "private fun subscribeToE\u2026        }\n        }\n    }");
        MviViewModel.M((MviViewModel)c2, distinctUntilChanged, (String)null, (qqx)qqx$b.b, (gub)new gub<Integer, ap6<? super oyv>, Object>() {
            public /* synthetic */ Object C0;
            public final /* synthetic */ BusinessInputTextViewModel D0;
            
            public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
                final gub<Integer, ap6<? super oyv>, Object> gub = (gub<Integer, ap6<? super oyv>, Object>)new gub<Integer, ap6<? super oyv>, Object>() {
                    public /* synthetic */ Object C0;
                    public final /* synthetic */ BusinessInputTextViewModel D0 = this.D0;
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
                final BusinessInputTextViewModel d0 = this.D0;
                final d13$b$a d13$b$a = new d13$b$a(n);
                final soe[] s0 = BusinessInputTextViewModel.S0;
                ((MviViewModel)d0).Q((rtb)d13$b$a);
                return oyv.a;
            }
        }, 1, (Object)null);
        return oyv.a;
    }
}
