// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

import com.twitter.ui.widget.EditTextViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/EditPronounsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lbt9;", "", "Lrs9;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditPronounsViewModel extends MviViewModel<bt9, Object, rs9>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)EditPronounsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditPronounsViewModel(final jto jto, final xbm xbm, final qs9 qs9, final r9x r9x) {
        czd.f((Object)jto, "savedStateHandler");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)qs9, "editPronounsDataSource");
        czd.f((Object)r9x, "viewModelStore");
        super((k9e)xbm, (jbx)new bt9(null, false, 3, null));
        final mra e = mra.e("pronouns_speed_bump_bottom_sheet_fatigue");
        if (e.c()) {
            e.b();
            final h5j take = h5j.interval(2L, TimeUnit.SECONDS).take(1L);
            czd.e((Object)take, "interval(2, TimeUnit.SECONDS).take(1)");
            MviViewModel.M((MviViewModel)this, take, (String)null, (jrx)null, (ftb)new ftb<Long, go6<? super fzv>, Object>(this, null) {
                public final EditPronounsViewModel D0;
                
                public final go6<fzv> create(final Object o, final go6<?> go6) {
                    return (go6<fzv>)new ftb<Long, go6<? super fzv>, Object>(this.D0, go6) {
                        public final EditPronounsViewModel D0;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    final ftb<Long, go6<? super fzv>, Object> ftb = (ftb<Long, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                    final fzv a = fzv.a;
                    ftb.invokeSuspend(a);
                    return a;
                }
                
                public final Object invokeSuspend(final Object o) {
                    b1n.u(o);
                    final EditPronounsViewModel d0 = this.D0;
                    final EditPronounsViewModel$a$a d2 = EditPronounsViewModel$a$a.D0;
                    final coe<Object>[] p = EditPronounsViewModel.P0;
                    d0.Q((qsb)d2);
                    return fzv.a;
                }
            }, 3, (Object)null);
        }
        as2.M(this.w(), (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this, r9x, null) {
            public EditPronounsViewModel D0;
            public int E0;
            public final EditPronounsViewModel F0;
            public final r9x G0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, go6) {
                    public EditPronounsViewModel D0;
                    public int E0;
                    public final EditPronounsViewModel F0;
                    public final r9x G0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((EditPronounsViewModel$b)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final dy6 d0 = dy6.D0;
                final int e0 = this.E0;
                EditPronounsViewModel d2;
                Object a;
                if (e0 != 0) {
                    if (e0 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = this.D0;
                    b1n.u(o);
                    a = o;
                }
                else {
                    b1n.u(o);
                    final EditPronounsViewModel f0 = this.F0;
                    final r9x g0 = this.G0;
                    final v9x$a v9x$a = new v9x$a(new m9x((Class)EditTextViewModel.class, ""), 2131428887, (String)null);
                    this.D0 = f0;
                    this.E0 = 1;
                    a = g0.a((v9x)v9x$a, (go6)this);
                    if (a == d0) {
                        return d0;
                    }
                    d2 = f0;
                }
                lp.e0(a, (Class)EditTextViewModel.class);
                MviViewModel.M((MviViewModel)d2, ((EditTextViewModel)a).Y(), (String)null, (jrx)null, (ftb)new ftb<String, go6<? super fzv>, Object>(this.F0, null) {
                    public Object D0;
                    public final EditPronounsViewModel E0;
                    
                    public final go6<fzv> create(final Object d0, final go6<?> go6) {
                        final ftb<String, go6<? super fzv>, Object> ftb = (ftb<String, go6<? super fzv>, Object>)new ftb<String, go6<? super fzv>, Object>(this.E0, go6) {
                            public Object D0;
                            public final EditPronounsViewModel E0;
                        };
                        ftb.D0 = d0;
                        return (go6<fzv>)ftb;
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final ftb<String, go6<? super fzv>, Object> ftb = (ftb<String, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                        final fzv a = fzv.a;
                        ftb.invokeSuspend(a);
                        return a;
                    }
                    
                    public final Object invokeSuspend(final Object o) {
                        b1n.u(o);
                        final String s = (String)this.D0;
                        final EditPronounsViewModel e0 = this.E0;
                        final EditPronounsViewModel$b$a$a editPronounsViewModel$b$a$a = new EditPronounsViewModel$b$a$a(s);
                        final coe<Object>[] p = EditPronounsViewModel.P0;
                        e0.Q((qsb)editPronounsViewModel$b$a$a);
                        return fzv.a;
                    }
                }, 3, (Object)null);
                return fzv.a;
            }
        }, 3);
        ((qsb)new yng((qsb)new EditPronounsViewModel$e((MviViewModel)this, jto)).D0).invoke((Object)new EditPronounsViewModel$c(this));
        this.O0 = ewj.n(this, (qsb)new EditPronounsViewModel$d(this, qs9));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.O0.a((coe)EditPronounsViewModel.P0[0]);
    }
}
