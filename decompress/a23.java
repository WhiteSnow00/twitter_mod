import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.business.listselection.BusinessListSelectionViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.listselection.BusinessListSelectionViewModel$subscribeToListSelectionUpdates$1", f = "BusinessListSelectionViewModel.kt", l = {}, m = "invokeSuspend")
public final class a23 extends xzr implements gub<hmf, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessListSelectionViewModel D0;
    
    public a23(final BusinessListSelectionViewModel d0, final ap6<? super a23> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final a23 a23 = new a23(this.D0, (ap6<? super a23>)ap6);
        a23.C0 = c0;
        return (ap6<oyv>)a23;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a23 a23 = (a23)this.create(o, (ap6<?>)o2);
        final oyv a24 = oyv.a;
        a23.invokeSuspend(a24);
        return a24;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final hmf hmf = (hmf)this.C0;
        if (hmf instanceof hmf$a) {
            final BusinessListSelectionViewModel d0 = this.D0;
            final k13 o2 = d0.O0;
            final g13 dataType = d0.N0.getDataType();
            Objects.requireNonNull(o2);
            zzd.f((Object)dataType, "dataType");
            final int ordinal = ((Enum)dataType).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            o2.a(k13.i);
                        }
                    }
                    else {
                        o2.a(k13.h);
                    }
                }
                else {
                    o2.a(k13.g);
                }
            }
            else {
                o2.a(k13.f);
            }
            ((MviViewModel)this.D0).V((Object)new j13$a(((hmf$a)hmf).a));
        }
        return oyv.a;
    }
}
