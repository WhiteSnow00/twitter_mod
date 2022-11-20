// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.edit;

import com.twitter.ui.widget.EditTextViewModel;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/edit/EditFolderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvfb;", "Ltfb;", "Lufb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditFolderViewModel extends MviViewModel<vfb, tfb, ufb>
{
    public static final coe<Object>[] Q0;
    public final h52 O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)EditFolderViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditFolderViewModel(final h52 o0, final f52 f52, final r9x r9x, final xbm xbm) {
        czd.f((Object)o0, "bookmarkFolderRepo");
        czd.f((Object)f52, "navigationDelegate");
        czd.f((Object)r9x, "viewModelStore");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new vfb((String)null, (String)null, (String)null, false, 15, (rf8)null));
        this.O0 = o0;
        final tk8 h = as2.h(this.w(), (ftb)new ftb<cy6, go6<? super EditTextViewModel>, Object>(r9x, null) {
            public int D0;
            public final r9x E0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<cy6, go6<? super EditTextViewModel>, Object>(this.E0, go6) {
                    public int D0;
                    public final r9x E0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((EditFolderViewModel$d)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(Object a) {
                final dy6 d0 = dy6.D0;
                final int d2 = this.D0;
                if (d2 != 0) {
                    if (d2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b1n.u(a);
                }
                else {
                    b1n.u(a);
                    final r9x e0 = this.E0;
                    final v9x$a v9x$a = new v9x$a(new m9x((Class)EditTextViewModel.class, ""), 2131428878, (String)null);
                    this.D0 = 1;
                    if ((a = e0.a((v9x)v9x$a, (go6)this)) == d0) {
                        return d0;
                    }
                }
                lp.e0(a, (Class)EditTextViewModel.class);
                return a;
            }
        });
        final h5j ofType = ((h5j)f52.a).ofType((Class)f62$d$d.class);
        czd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (jrx)null, (ftb)new ftb<f62$d$d, go6<? super fzv>, Object>(this, h, null) {
            public Object D0;
            public final EditFolderViewModel E0;
            public final tk8<EditTextViewModel> F0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<f62$d$d, go6<? super fzv>, Object> ftb = (ftb<f62$d$d, go6<? super fzv>, Object>)new ftb<f62$d$d, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public Object D0;
                    public final EditFolderViewModel E0;
                    public final tk8<EditTextViewModel> F0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<f62$d$d, go6<? super fzv>, Object> ftb = (ftb<f62$d$d, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final f62$d$d f62$d$d = (f62$d$d)this.D0;
                final u42 e = this.E0.O0.e(f62$d$d.b);
                if (e != null) {
                    this.E0.Q((qsb)new EditFolderViewModel$a$a(f62$d$d, e));
                    MviViewModel.I((MviViewModel)this.E0, (tk8)this.F0, (String)null, (jrx)null, (ftb)new ftb<EditTextViewModel, go6<? super fzv>, Object>(e, null) {
                        public Object D0;
                        public final u42 E0;
                        
                        public final go6<fzv> create(final Object d0, final go6<?> go6) {
                            final ftb<EditTextViewModel, go6<? super fzv>, Object> ftb = (ftb<EditTextViewModel, go6<? super fzv>, Object>)new ftb<EditTextViewModel, go6<? super fzv>, Object>(this.E0, go6) {
                                public Object D0;
                                public final u42 E0;
                            };
                            ftb.D0 = d0;
                            return (go6<fzv>)ftb;
                        }
                        
                        public final Object invoke(final Object o, final Object o2) {
                            final ftb<EditTextViewModel, go6<? super fzv>, Object> ftb = (ftb<EditTextViewModel, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                            final fzv a = fzv.a;
                            ftb.invokeSuspend(a);
                            return a;
                        }
                        
                        public final Object invokeSuspend(final Object o) {
                            b1n.u(o);
                            ((EditTextViewModel)this.D0).X(this.E0.b);
                            return fzv.a;
                        }
                    }, 3, (Object)null);
                }
                else {
                    this.E0.Q((qsb)EditFolderViewModel$a$c.D0);
                }
                return fzv.a;
            }
        }, 3, (Object)null);
        as2.M(this.w(), (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this, h, null) {
            public EditFolderViewModel D0;
            public int E0;
            public final EditFolderViewModel F0;
            public final tk8<EditTextViewModel> G0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, go6) {
                    public EditFolderViewModel D0;
                    public int E0;
                    public final EditFolderViewModel F0;
                    public final tk8<EditTextViewModel> G0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((EditFolderViewModel$b)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final dy6 d0 = dy6.D0;
                final int e0 = this.E0;
                EditFolderViewModel d2;
                Object a0;
                if (e0 != 0) {
                    if (e0 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = this.D0;
                    b1n.u(o);
                    a0 = o;
                }
                else {
                    b1n.u(o);
                    final EditFolderViewModel f0 = this.F0;
                    final tk8<EditTextViewModel> g0 = this.G0;
                    this.D0 = f0;
                    this.E0 = 1;
                    a0 = g0.A0((go6)this);
                    if (a0 == d0) {
                        return d0;
                    }
                    d2 = f0;
                }
                MviViewModel.M((MviViewModel)d2, ((EditTextViewModel)a0).Y(), (String)null, (jrx)null, (ftb)new ftb<String, go6<? super fzv>, Object>(this.F0, null) {
                    public Object D0;
                    public final EditFolderViewModel E0;
                    
                    public final go6<fzv> create(final Object d0, final go6<?> go6) {
                        final ftb<String, go6<? super fzv>, Object> ftb = (ftb<String, go6<? super fzv>, Object>)new ftb<String, go6<? super fzv>, Object>(this.E0, go6) {
                            public Object D0;
                            public final EditFolderViewModel E0;
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
                        final EditFolderViewModel e0 = this.E0;
                        final EditFolderViewModel$b$a$a editFolderViewModel$b$a$a = new EditFolderViewModel$b$a$a(s);
                        final coe<Object>[] q0 = EditFolderViewModel.Q0;
                        e0.Q((qsb)editFolderViewModel$b$a$a);
                        return fzv.a;
                    }
                }, 3, (Object)null);
                return fzv.a;
            }
        }, 3);
        this.P0 = ewj.n(this, (qsb)new EditFolderViewModel$c(this));
    }
    
    public final jyh<tfb> v() {
        return (jyh<tfb>)this.P0.a((coe)EditFolderViewModel.Q0[0]);
    }
}
