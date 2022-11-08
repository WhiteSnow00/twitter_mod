import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.settings.overview.ProfessionalSettingsViewModel$b;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.business.settings.overview.ProfessionalSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$subscribeToAccountSwitchActions$1", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class o6l extends xzr implements gub<o2s$a, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ProfessionalSettingsViewModel D0;
    
    public o6l(final ProfessionalSettingsViewModel d0, final ap6<? super o6l> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final o6l o6l = new o6l(this.D0, (ap6<? super o6l>)ap6);
        o6l.C0 = c0;
        return (ap6<oyv>)o6l;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final o6l o6l = (o6l)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        o6l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final o2s$a o2s$a = (o2s$a)this.C0;
        if (o2s$a instanceof o2s$a$a) {
            final w4l o2 = this.D0.O0;
            final o2s$a$a o2s$a$a = (o2s$a$a)o2s$a;
            final fj a = o2s$a$a.a;
            Objects.requireNonNull(o2);
            zzd.f((Object)a, "accountType");
            final int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o2.a(w4l.i);
                }
                else {
                    o2.a(w4l.k);
                }
            }
            else {
                o2.a(w4l.g);
            }
            ((MviViewModel)this.D0).V((Object)new v4l.e(o2s$a$a.a));
        }
        else if (o2s$a instanceof o2s$a$b) {
            final w4l o3 = this.D0.O0;
            final o2s$a$b o2s$a$b = (o2s$a$b)o2s$a;
            final fj a2 = o2s$a$b.a;
            Objects.requireNonNull(o3);
            zzd.f((Object)a2, "accountType");
            final int ordinal2 = a2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o3.a(w4l.j);
                }
                else {
                    o3.a(w4l.l);
                }
            }
            else {
                o3.a(w4l.h);
            }
            final ProfessionalSettingsViewModel d0 = this.D0;
            final fj a3 = o2s$a$b.a;
            Objects.requireNonNull(d0);
            ((MviViewModel)d0).Q((rtb)new n6l(true));
            if (ProfessionalSettingsViewModel$b.a[a3.ordinal()] == 1) {
                ((MviViewModel)d0).x(d0.N0.k(), (rtb)new j6l(d0));
            }
            else {
                final b5l n0 = d0.N0;
                final int ordinal3 = a3.ordinal();
                v6l v6l;
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        throw new IllegalArgumentException(l7k.c("no corresponding professional type for ", a3.name()));
                    }
                    v6l = v6l.D0;
                }
                else {
                    v6l = v6l.C0;
                }
                ((MviViewModel)d0).x(n0.l(v6l), (rtb)new m6l(d0));
            }
        }
        return oyv.a;
    }
}
