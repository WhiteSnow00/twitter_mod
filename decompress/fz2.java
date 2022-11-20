import com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fz2 extends ste implements qsb<kz2, kz2>
{
    public final BusinessInfoViewModel D0;
    
    public fz2(final BusinessInfoViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final kz2 kz2 = (kz2)o;
        czd.f((Object)kz2, "$this$setState");
        return kz2.l(kz2, false, (String)null, (String)null, (String)null, (String)null, (String)null, false, false, this.D0.b1.hasAddressAndHoursData(), false, this.D0.b1.hasAddressAndHoursData() && n4l.Companion.e(), 2815);
    }
}
