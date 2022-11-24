import com.twitter.business.moduledisplay.mobileappmodule.MobileAppModuleViewModel;
import com.twitter.card.di.BaseCardObjectGraph$a;
import java.util.Map;
import java.util.Objects;
import tv.periscope.android.ui.broadcast.view.MenuViewPager;
import com.twitter.card.unified.di.card.UnifiedCardObjectGraph$a;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.business.moduledisplay.linkmodule.LinkModuleViewModel;
import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhh implements bra
{
    public static yf2 a(final Activity activity, final r29 r29, final lk3 lk3, final ri3 ri3, final vi3 vi3, final vk3 vk3, final uk3 uk3, final View view, final dn2 dn2, final ik3 ik3, final eg2 eg2, final og2 og2, final lg2 lg2, final sfv sfv, final zv1 zv1) {
        return new yf2(activity, r29, lk3, ri3, vi3, vk3, uk3, view, dn2, ik3, eg2, og2, sfv, zv1);
    }
    
    public static o6x b(final LinkModuleViewModel linkModuleViewModel) {
        final eif eif = (eif)lp7.m0((Class)eif.class);
        e0e.f((Object)linkModuleViewModel, "viewModel");
        return (o6x)ac8.l((Class)LinkModuleViewModel.class, (stb)dif.F0);
    }
    
    public static viw c(final Context context, final UserIdentifier userIdentifier) {
        return viw.a(context, userIdentifier);
    }
    
    public static ny1 d(final z3s z3s) {
        final UnifiedCardObjectGraph$a unifiedCardObjectGraph$a = (UnifiedCardObjectGraph$a)lp7.m0((Class)UnifiedCardObjectGraph$a.class);
        e0e.f((Object)z3s, "swipeableViewHost");
        return (ny1)z3s;
    }
    
    public static MenuViewPager e(final View view) {
        final MenuViewPager menuViewPager = (MenuViewPager)view.findViewById(2131430046);
        Objects.requireNonNull(menuViewPager, "Cannot return null from a non-@Nullable @Provides method");
        return menuViewPager;
    }
    
    public static t6x f(final Map map) {
        final BaseCardObjectGraph$a baseCardObjectGraph$a = (BaseCardObjectGraph$a)lp7.m0((Class)BaseCardObjectGraph$a.class);
        return dw8.a(map);
    }
    
    public static ikx g() {
        final bgh bgh = (bgh)lp7.m0((Class)bgh.class);
        return new ikx(new fax((Class)MobileAppModuleViewModel.class, ""), (s6x)new s6x$d("MobileAppModuleStub"), (qax)qax$c.a);
    }
    
    public static View h(View viewById) {
        viewById = viewById.findViewById(2131429839);
        Objects.requireNonNull(viewById, "Cannot return null from a non-@Nullable @Provides method");
        return viewById;
    }
    
    public static j4e i(final bmv bmv, final imv imv, final amv amv, final kcm kcm) {
        final ej8$a ej8$a = new ej8$a();
        ej8$a.p((b4e)imv);
        ej8$a.p((b4e)amv);
        return new j4e((f5e)bmv, (d4e)((z4j)ej8$a).e(), kcm);
    }
}
