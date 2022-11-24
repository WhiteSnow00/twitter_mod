// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safetycenter.reportdetail;

import java.util.Objects;
import com.twitter.safetycenter.ReportDetailArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/safetycenter/reportdetail/ReportDetailViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lokm;", "", "Likm;", "Companion", "b", "feature.tfa.safety-center.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class ReportDetailViewModel extends MviViewModel<okm, Object, ikm>
{
    public static final ReportDetailViewModel.ReportDetailViewModel$b Companion;
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(ReportDetailViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new ReportDetailViewModel.ReportDetailViewModel$b();
    }
    
    public ReportDetailViewModel(final kcm kcm, final ReportDetailArgs reportDetailArgs, final lkm lkm) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)reportDetailArgs, "args");
        e0e.f((Object)lkm, "repository");
        final ReportDetailViewModel.ReportDetailViewModel$b companion = ReportDetailViewModel.Companion;
        final long reportId = reportDetailArgs.getReportId();
        Objects.requireNonNull(companion);
        olm olm;
        if (reportId == 1L) {
            olm = olm.F0;
        }
        else if (reportId == 2L) {
            olm = olm.G0;
        }
        else {
            olm = olm.F0;
        }
        super((iae)kcm, (ccx)new okm("This is placeholder content for the report detail", 0L, olm, new zmo("Hateful conduct rule", new bno(new String[] { "Hateful violent threats", "Hateful wishes of harm", "References to hateful violence", "Spreading fear about someone or encouraging others to harass someone", "Racist slurs or name-calling", "Denying violent events, such as the Holocaust or slavery", "Logos, symbols, or images intended to spread hate" }), "View entire rule ", "Content Hidden")));
        final String value = String.valueOf(reportDetailArgs.getReportId());
        e0e.f((Object)value, "id");
        MviViewModel.N((MviViewModel)this, (bbq)((tnm<String, Object, osc>)lkm.a).S(value), (String)null, (asx)null, (hub)new ReportDetailViewModel$a(this, (mp6)null), 3, (Object)null);
        this.Q0 = hfe.v((MviViewModel)this, (stb)ReportDetailViewModel$c.F0);
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.Q0.a((ape)ReportDetailViewModel.R0[0]);
    }
}
