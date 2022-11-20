// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safetycenter.reportdetail;

import java.util.Objects;
import com.twitter.safetycenter.ReportDetailArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/safetycenter/reportdetail/ReportDetailViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lzjm;", "", "Ltjm;", "Companion", "b", "feature.tfa.safety-center.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class ReportDetailViewModel extends MviViewModel<zjm, Object, tjm>
{
    public static final ReportDetailViewModel.ReportDetailViewModel$b Companion;
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)ReportDetailViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new ReportDetailViewModel.ReportDetailViewModel$b();
    }
    
    public ReportDetailViewModel(final xbm xbm, final ReportDetailArgs reportDetailArgs, final wjm wjm) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)reportDetailArgs, "args");
        czd.f((Object)wjm, "repository");
        final ReportDetailViewModel.ReportDetailViewModel$b companion = ReportDetailViewModel.Companion;
        final long reportId = reportDetailArgs.getReportId();
        Objects.requireNonNull(companion);
        zkm zkm;
        if (reportId == 1L) {
            zkm = zkm.D0;
        }
        else if (reportId == 2L) {
            zkm = zkm.E0;
        }
        else {
            zkm = zkm.D0;
        }
        super((k9e)xbm, (jbx)new zjm("This is placeholder content for the report detail", 0L, zkm, new fmo("Hateful conduct rule", new hmo(new String[] { "Hateful violent threats", "Hateful wishes of harm", "References to hateful violence", "Spreading fear about someone or encouraging others to harass someone", "Racist slurs or name-calling", "Denying violent events, such as the Holocaust or slavery", "Logos, symbols, or images intended to spread hate" }), "View entire rule ", "Content Hidden")));
        final String value = String.valueOf(reportDetailArgs.getReportId());
        czd.f((Object)value, "id");
        MviViewModel.N((MviViewModel)this, ((enm)wjm.a).R((Object)value), (String)null, (jrx)null, (ftb)new ftb<qjm, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final ReportDetailViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<qjm, go6<? super fzv>, Object> ftb = (ftb<qjm, go6<? super fzv>, Object>)new ftb<qjm, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final ReportDetailViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<qjm, go6<? super fzv>, Object> ftb = (ftb<qjm, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final qjm qjm = (qjm)this.D0;
                final ReportDetailViewModel e0 = this.E0;
                final ReportDetailViewModel$a$a reportDetailViewModel$a$a = new ReportDetailViewModel$a$a(qjm);
                final ReportDetailViewModel.ReportDetailViewModel$b companion = ReportDetailViewModel.Companion;
                e0.Q((qsb)reportDetailViewModel$a$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        this.O0 = ewj.n(this, (qsb)ReportDetailViewModel$c.D0);
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.O0.a((coe)ReportDetailViewModel.P0[0]);
    }
}
