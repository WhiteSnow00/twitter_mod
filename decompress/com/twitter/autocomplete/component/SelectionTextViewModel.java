// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.autocomplete.component;

import android.text.Spannable;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\b" }, d2 = { "Lcom/twitter/autocomplete/component/SelectionTextViewModel;", "Token", "Lcep;", "Suggestion", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lzfp;", "Lvfp;", "", "subsystem.tfa.autocomplete.component_release" }, k = 1, mv = { 1, 7, 1 })
public final class SelectionTextViewModel<Token, Suggestion extends cep> extends MviViewModel
{
    public static final coe<Object>[] T0;
    public final eep<Token, Suggestion> O0;
    public final s0r<Token> P0;
    public final fur<Token, Suggestion> Q0;
    public final qsb<Token, String> R0;
    public final hyh S0;
    
    static {
        T0 = new coe[] { (coe)w9.f((Class)SelectionTextViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SelectionTextViewModel(final xbm xbm, final eep<Token, Suggestion> o0, final s0r<Token> p5, final fur<Token, Suggestion> q0, final qsb<Token, String> r0) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "spanConverter");
        czd.f((Object)p5, "tokenizer");
        czd.f((Object)q0, "suggestionRepo");
        czd.f((Object)r0, "tokenContextTextMapper");
        super((k9e)xbm, (jbx)new zfp((Spannable)null, 0, 3, (rf8)null));
        this.O0 = o0;
        this.P0 = p5;
        this.Q0 = q0;
        this.R0 = r0;
        final h5j distinctUntilChanged = q0.b().distinctUntilChanged();
        czd.e((Object)distinctUntilChanged, "suggestionRepo.selections.distinctUntilChanged()");
        MviViewModel.M((MviViewModel)this, distinctUntilChanged, (String)null, (jrx)null, (ftb)new ftb<Iterable<? extends Suggestion>, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final SelectionTextViewModel<Token, Suggestion> E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<Iterable<? extends Suggestion>, go6<? super fzv>, Object> ftb = (ftb<Iterable<? extends Suggestion>, go6<? super fzv>, Object>)new ftb<Iterable<? extends Suggestion>, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final SelectionTextViewModel<Token, Suggestion> E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<Iterable<? extends Suggestion>, go6<? super fzv>, Object> ftb = (ftb<Iterable<? extends Suggestion>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final Iterable iterable = (Iterable)this.D0;
                final SelectionTextViewModel<Token, Suggestion> e0 = this.E0;
                final SelectionTextViewModel$a$a selectionTextViewModel$a$a = new SelectionTextViewModel$a$a((SelectionTextViewModel)e0, iterable);
                final coe<Object>[] t0 = SelectionTextViewModel.T0;
                e0.T((qsb)selectionTextViewModel$a$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        this.S0 = ewj.n(this, (qsb)new SelectionTextViewModel$b(this));
    }
    
    public final jyh<vfp> v() {
        return (jyh<vfp>)this.S0.a((coe)SelectionTextViewModel.T0[0]);
    }
}
