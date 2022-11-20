// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.create;

import com.twitter.ui.widget.EditTextViewModel;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/create/CreateFolderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lo37;", "Lk37;", "Li37;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class CreateFolderViewModel extends MviViewModel<o37, k37, i37>
{
    public static final coe<Object>[] Q0;
    public final h52 O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)CreateFolderViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public CreateFolderViewModel(final h52 o0, final f52 f52, final r9x r9x, final xbm xbm) {
        czd.f((Object)o0, "bookmarkFolderRepo");
        czd.f((Object)f52, "navigationDelegate");
        czd.f((Object)r9x, "viewModelStore");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new o37(false, (String)null, false, 7, (rf8)null));
        this.O0 = o0;
        final h5j ofType = ((h5j)f52.a).ofType((Class)f62$d$b.class);
        czd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (jrx)null, (ftb)new ftb<f62$d$b, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final CreateFolderViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<f62$d$b, go6<? super fzv>, Object> ftb = (ftb<f62$d$b, go6<? super fzv>, Object>)new ftb<f62$d$b, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final CreateFolderViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<f62$d$b, go6<? super fzv>, Object> ftb = (ftb<f62$d$b, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final boolean b = ((f62$d)this.D0).a instanceof f62$a$c;
                final CreateFolderViewModel e0 = this.E0;
                final CreateFolderViewModel$a$a createFolderViewModel$a$a = new CreateFolderViewModel$a$a(b, e0);
                final coe<Object>[] q0 = CreateFolderViewModel.Q0;
                e0.T((qsb)createFolderViewModel$a$a);
                this.E0.Q((qsb)new CreateFolderViewModel$a$b(b));
                return fzv.a;
            }
        }, 3, (Object)null);
        as2.M(this.w(), (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this, r9x, null) {
            public CreateFolderViewModel D0;
            public int E0;
            public final CreateFolderViewModel F0;
            public final r9x G0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.G0, go6) {
                    public CreateFolderViewModel D0;
                    public int E0;
                    public final CreateFolderViewModel F0;
                    public final r9x G0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((CreateFolderViewModel$b)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final dy6 d0 = dy6.D0;
                final int e0 = this.E0;
                CreateFolderViewModel d2;
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
                    final CreateFolderViewModel f0 = this.F0;
                    final r9x g0 = this.G0;
                    final v9x$a v9x$a = new v9x$a(new m9x((Class)EditTextViewModel.class, ""), 2131428521, (String)null);
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
                    public final CreateFolderViewModel E0;
                    
                    public final go6<fzv> create(final Object d0, final go6<?> go6) {
                        final ftb<String, go6<? super fzv>, Object> ftb = (ftb<String, go6<? super fzv>, Object>)new ftb<String, go6<? super fzv>, Object>(this.E0, go6) {
                            public Object D0;
                            public final CreateFolderViewModel E0;
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
                        final CreateFolderViewModel e0 = this.E0;
                        final CreateFolderViewModel$b$a$a createFolderViewModel$b$a$a = new CreateFolderViewModel$b$a$a(s);
                        final coe<Object>[] q0 = CreateFolderViewModel.Q0;
                        e0.Q((qsb)createFolderViewModel$b$a$a);
                        return fzv.a;
                    }
                }, 3, (Object)null);
                return fzv.a;
            }
        }, 3);
        this.P0 = ewj.n(this, (qsb)new CreateFolderViewModel$c(this));
    }
    
    public final jyh<k37> v() {
        return (jyh<k37>)this.P0.a((coe)CreateFolderViewModel.Q0[0]);
    }
}
