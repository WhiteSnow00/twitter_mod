import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import com.twitter.business.features.linkmodule.model.CallToActionDisplay;
import java.util.Objects;
import com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iff extends ste implements qsb<LinkModuleConfigurationViewModel.b, fzv>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public iff(final LinkModuleConfigurationViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        czd.f((Object)o, "it");
        final LinkModuleConfigurationViewModel d0 = this.D0;
        final boolean hasData = d0.c1.hasData();
        final boolean b = false;
        final boolean b2 = hasData || d0.c1.hasModuleId();
        boolean b3 = b;
        if (d0.c1.hasMandatoryData()) {
            b3 = b;
            if (d0.W()) {
                b3 = true;
            }
        }
        ((MviViewModel)d0).Q((qsb)new qff(b3, b2));
        final LinkModuleConfigurationViewModel d2 = this.D0;
        Objects.requireNonNull(d2);
        ((MviViewModel)d2).Q((qsb)new rff(d2));
        final vbl z0 = d2.Z0;
        final hgf y0 = d2.Y0;
        final LinkModuleDomainConfig c1 = d2.c1;
        Objects.requireNonNull(y0);
        czd.f((Object)c1, "input");
        final String url = c1.getUrl();
        h6w h6w;
        if (url != null) {
            o = new h6w$c();
            ((h6w.a)o).d = url;
            final int a = c5j.a;
            final String o2 = a6w.o(String.valueOf(ar1.a(url)));
            czd.e((Object)o2, "getHostWithoutWwwPrefix(urlWithScheme)");
            ((h6w.a)o).f = o2;
            h6w = (h6w)((n4j)o).j();
        }
        else {
            h6w = null;
        }
        z0.a((gbl)new udf(new wff(h6w, new CallToActionDisplay(c1.getCta(), (String)null, 2, (rf8)null)), new xdf(c1.getCta(), c1.getUrl())));
        return fzv.a;
    }
}
