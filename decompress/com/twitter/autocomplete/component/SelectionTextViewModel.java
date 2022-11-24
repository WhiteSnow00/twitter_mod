// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.autocomplete.component;

import android.text.Spannable;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\b" }, d2 = { "Lcom/twitter/autocomplete/component/SelectionTextViewModel;", "Token", "Lzep;", "Suggestion", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwgp;", "Lsgp;", "", "subsystem.tfa.autocomplete.component_release" }, k = 1, mv = { 1, 7, 1 })
public final class SelectionTextViewModel<Token, Suggestion extends zep> extends MviViewModel
{
    public static final ape<Object>[] V0;
    public final bfp<Token, Suggestion> Q0;
    public final p1r<Token> R0;
    public final evr<Token, Suggestion> S0;
    public final stb<Token, String> T0;
    public final yyh U0;
    
    static {
        V0 = new ape[] { (ape)lb0.h(SelectionTextViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SelectionTextViewModel(final kcm kcm, final bfp<Token, Suggestion> q0, final p1r<Token> r0, final evr<Token, Suggestion> s0, final stb<Token, String> t0) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)q0, "spanConverter");
        e0e.f((Object)r0, "tokenizer");
        e0e.f((Object)s0, "suggestionRepo");
        e0e.f((Object)t0, "tokenContextTextMapper");
        super((iae)kcm, (ccx)new wgp(null, 0, 3, null));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        final t5j distinctUntilChanged = s0.b().distinctUntilChanged();
        e0e.e((Object)distinctUntilChanged, "suggestionRepo.selections.distinctUntilChanged()");
        MviViewModel.M((MviViewModel)this, distinctUntilChanged, (String)null, (asx)null, (hub)new hub<Iterable<? extends Suggestion>, mp6<? super vzv>, Object>(this, null) {
            public Object F0;
            public final SelectionTextViewModel<Token, Suggestion> G0;
            
            public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
                final hub<Iterable<? extends Suggestion>, mp6<? super vzv>, Object> hub = (hub<Iterable<? extends Suggestion>, mp6<? super vzv>, Object>)new hub<Iterable<? extends Suggestion>, mp6<? super vzv>, Object>(this.G0, mp6) {
                    public Object F0;
                    public final SelectionTextViewModel<Token, Suggestion> G0;
                };
                hub.F0 = f0;
                return (mp6<vzv>)hub;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final hub<Iterable<? extends Suggestion>, mp6<? super vzv>, Object> hub = (hub<Iterable<? extends Suggestion>, mp6<? super vzv>, Object>)this.create(o, (mp6<?>)o2);
                final vzv a = vzv.a;
                hub.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                jb2.M0(o);
                final Iterable iterable = (Iterable)this.F0;
                final SelectionTextViewModel<Token, Suggestion> g0 = this.G0;
                final SelectionTextViewModel$a$a selectionTextViewModel$a$a = new SelectionTextViewModel$a$a((SelectionTextViewModel)g0, iterable);
                final ape<Object>[] v0 = SelectionTextViewModel.V0;
                g0.T((stb)selectionTextViewModel$a$a);
                return vzv.a;
            }
        }, 3, (Object)null);
        this.U0 = hfe.v((MviViewModel)this, (stb)new SelectionTextViewModel$b(this));
    }
    
    public final azh<sgp> v() {
        return (azh<sgp>)this.U0.a((ape)SelectionTextViewModel.V0[0]);
    }
}
